package com.snnlab.springnativeexp.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "snnLabCollection")
public class SnnLabDocument implements Serializable {

    @Id
    private ObjectId id;
    private String name;
    private String surname;
}


