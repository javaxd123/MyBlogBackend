package com.awareness.ApiWithJWT.model.tutorial;


import com.awareness.ApiWithJWT.model.overalls.Post;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tutorials")
public class Tutorial extends Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "tutorial")
    private Set<TutorialComment> comments = new HashSet<>();

    @ManyToOne
    private TutorialCategory tutorialCategory;

    public Tutorial() {
    }

    public Tutorial(String title, String imageUrl, String content, TutorialCategory tutorialCategory) {
        super(title, imageUrl, content);
        this.tutorialCategory = tutorialCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<TutorialComment> getComments() {
        return comments;
    }

    public void setComments(Set<TutorialComment> comments) {
        this.comments = comments;
    }
}
