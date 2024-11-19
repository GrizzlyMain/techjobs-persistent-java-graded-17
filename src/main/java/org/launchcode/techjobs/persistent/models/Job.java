package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{


    @ManyToOne
    private Employer employer;

    @ManyToMany
    @Valid
    private  List<Skill> skills = new ArrayList<>();


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer newEmployer, List<Skill> newSkills) {
        super();
        this.employer = newEmployer;
        this.skills = newSkills;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
