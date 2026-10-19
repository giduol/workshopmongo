package com.example.workshopmongo.dto;

import com.example.workshopmongo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public AuthorDTO(User user) {
        id = user.getId();
        name = user.getName();
    }
}
