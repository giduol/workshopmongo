package com.example.workshopmongo.services;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Post not found"));
    }

}
