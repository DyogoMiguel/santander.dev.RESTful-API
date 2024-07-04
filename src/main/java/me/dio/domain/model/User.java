package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.*;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Commission> comms;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public List<Post> getPosts() {
        return posts;
    }
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    public List<Commission> getComms() {
        return comms;
    }
    public void setComms(List<Commission> comms) {
        this.comms = comms;
    }

    
}
