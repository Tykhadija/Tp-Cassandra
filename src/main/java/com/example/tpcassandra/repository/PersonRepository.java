package com.example.tpcassandra.repository;

import com.example.tpcassandra.models.Person;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CassandraRepository<Person, String> {
}
