package com.joseronildo.workshopmongo.repository;

import com.joseronildo.workshopmongo.domain.Post;
import com.joseronildo.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
