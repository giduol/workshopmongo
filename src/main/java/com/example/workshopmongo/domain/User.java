package com.example.workshopmongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String email;

}
