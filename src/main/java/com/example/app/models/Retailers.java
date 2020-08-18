package com.example.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Objects;
@Entity
public class Retailers {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;
    protected String shName;
    protected String description;
    protected String ownerName;
    protected String email;
    protected String contact;

    public Retailers() {
    }

    public Retailers(int id, String shName, String description, String ownerName, String email, String contact) {
        this.id = id;
        this.shName = shName;
        this.description = description;
        this.ownerName = ownerName;
        this.email = email;
        this.contact = contact;
    }

    public int getShNo() {
        return id;
    }

    public void setShNo(int id) {
        this.id = id;
    }

    public String getShName() {
        return shName;
    }

    public void setShName(String shName) {
        this.shName = shName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Retailers)) return false;
        Retailers retailers = (Retailers) o;
        return getShNo() == retailers.getShNo() &&
                getShName().equals(retailers.getShName()) &&
                getDescription().equals(retailers.getDescription()) &&
                getOwnerName().equals(retailers.getOwnerName()) &&
                getEmail().equals(retailers.getEmail()) &&
                getContact().equals(retailers.getContact());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShNo(), getShName(), getDescription(), getOwnerName(), getEmail(), getContact());
    }

    @Override
    public String toString() {
        return "Retailers{" +
                "shNo=" + id +
                ", shName='" + shName + '\'' +
                ", description='" + description + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
