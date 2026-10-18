package com.example.workshopmongo.resources;

import com.example.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria Brown", "maria@example.com");
        User alex = new User("2", "Alex Green", "alex@example.com");
        List<User> users = List.of(maria, alex);
        return ResponseEntity.ok().body(users);
    }
}
