package com.pluralsight.javafundamentals.entity;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private com.pluralsight.javafundamentals.entity.Application application;

    @ManyToOne
    @JoinTable(name ="ticket_release", joinColumns = @JoinColumn(name = "ticket_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
    private com.pluralsight.javafundamentals.entity.Release release;

    private String status;

    public Ticket() {
    }

    public Ticket(String title, String description,
                  com.pluralsight.javafundamentals.entity.Application application, com.pluralsight.javafundamentals.entity.Release release, String status) {
        this.title = title;
        this.description = description;
        this.application = application;
        this.release = release;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public com.pluralsight.javafundamentals.entity.Application getApplication() {
        return application;
    }

    public void setApplication(com.pluralsight.javafundamentals.entity.Application application) {
        this.application = application;
    }

    public com.pluralsight.javafundamentals.entity.Release getRelease() {
        return release;
    }

    public void setRelease(com.pluralsight.javafundamentals.entity.Release release) {
        this.release = release;
    }
}
