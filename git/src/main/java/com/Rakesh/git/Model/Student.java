package com.Rakesh.git.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Student_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    @Column(name="ID")
    private int id;
    @Column(name="Name")
    private String name;
    @Column(name="Marks")
    private int marks;
}
