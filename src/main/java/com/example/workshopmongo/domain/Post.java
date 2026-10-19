package com.example.workshopmongo.domain;

import com.example.workshopmongo.dto.AuthorDTO;
import com.example.workshopmongo.dto.CommentDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Document(collection = "post")
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO Author;

    private List<CommentDTO> comments = new ArrayList<>();

    public Post(Object id, Date parse, String partiuViajar, String body, AuthorDTO author) {
        this.id = (String) id;
        this.date = parse;
        this.title = partiuViajar;
        this.body = body;
        this.Author = author;
    }
}
