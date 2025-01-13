package com.api.model;
import lombok.Setter;
import lombok.Getter;

@Setter @Getter
public class CreateMessageModel {
    public int messageid;
    public String name;
    public String email;
    public String phone;
    public String subject;
    public String description;

    public void setMessageid(int messageid) {
        this.messageid = messageid;
    }
    public int getMessageid() {
        return messageid;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

}
