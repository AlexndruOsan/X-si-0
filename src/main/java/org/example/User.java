package org.example;

import javax.persistence.*;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private long id;
    @Basic
    @Column(name = "Win")
    private long win;
    @Basic
    @Column(name = "Lose")
    private long lose;
    @Basic
    @Column(name = "Username")
    private String username;
    @Basic
    @Column(name = "Parola")
    private String parola;

    public User(){

    }

    public User(long id, long win, long lose, String username, String parola) {
        this.id = id;
        this.win = win;
        this.lose = lose;
        this.username = username;
        this.parola = parola;
    }

    public long getId() {
        return id;
    }

    public long getWin() {
        return win;
    }

    public long getLose() {
        return lose;
    }

    public String getUsername() {
        return username;
    }

    public String getParola() {
        return parola;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setWin(long win) {
        this.win = win;
    }

    public void setLose(long lose) {
        this.lose = lose;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}
