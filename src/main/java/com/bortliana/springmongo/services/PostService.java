package com.bortliana.springmongo.services;

import com.bortliana.springmongo.domain.Post;
import com.bortliana.springmongo.repository.PostRepository;
import com.bortliana.springmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public List<Post> findByTitle(String text){
        return repo.searchTitle(text);
    }
}
