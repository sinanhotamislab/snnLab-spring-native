package com.snnlab.springnativeexp;

import com.snnlab.springnativeexp.document.SnnLabDocument;
import com.snnlab.springnativeexp.repository.SnnLabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
public class CommandLineRunnerProcess implements CommandLineRunner {

    private SnnLabRepository snnLabRepository;

    @Autowired
    public CommandLineRunnerProcess(SnnLabRepository snnLabRepository){
        this.snnLabRepository = snnLabRepository;
    }

    @Override
    @Cacheable (value = "snnLabDocuments")
    public void run(String... args) throws Exception {

        List<SnnLabDocument> snnLabDocuments = this.snnLabRepository.findAll();
        if(!CollectionUtils.isEmpty(snnLabDocuments)){
            System.out.println(snnLabDocuments.get(0).getId());
            System.out.println(snnLabDocuments.get(0).getName());
            System.out.println(snnLabDocuments.get(0).getSurname());
        }else {
            System.out.println("SnnLabDocument is empty...");
        }
    }
}
