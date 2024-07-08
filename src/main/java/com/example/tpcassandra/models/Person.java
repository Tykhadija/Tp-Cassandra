package com.example.tpcassandra.models;


import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Person {
    @PrimaryKey
    private String id;
    private String name;
    private int age;
}
