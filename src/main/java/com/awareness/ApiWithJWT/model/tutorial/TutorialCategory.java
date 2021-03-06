package com.awareness.ApiWithJWT.model.tutorial;

import com.awareness.ApiWithJWT.model.overalls.Category;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tutorial_categories")
public class TutorialCategory extends Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private Set<Tutorial> tutorialSet = new HashSet<>();


    public TutorialCategory() {
    }

    public TutorialCategory(String name, String color) {
        super(name, color);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Tutorial> getTutorialSet() {
        return tutorialSet;
    }

    public void setTutorialSet(Set<Tutorial> tutorialSet) {
        this.tutorialSet = tutorialSet;
    }


}
