package com.emerson.wokshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.emerson.wokshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}