package com.snnlab.springnativeexp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.snnlab.springnativeexp.repository")
public class MongoConfiguration { }
