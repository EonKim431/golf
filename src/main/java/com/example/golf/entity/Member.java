package com.example.golf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @Column(name = "member_id",length = 5,nullable = false)
    private String id;
    @Column(name = "member_name",length = 15)
    private String name;
    @Column(length = 15)
    private String phone;
    @Column(length = 50)
    private String address;
    @Column(length = 6)
    private String grade;

}
