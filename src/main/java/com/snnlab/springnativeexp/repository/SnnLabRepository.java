package com.snnlab.springnativeexp.repository;

import com.snnlab.springnativeexp.document.SnnLabDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnnLabRepository extends MongoRepository<SnnLabDocument, ObjectId> { }
