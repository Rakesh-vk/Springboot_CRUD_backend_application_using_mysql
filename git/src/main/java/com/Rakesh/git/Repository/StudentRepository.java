package com.Rakesh.git.Repository;

import com.Rakesh.git.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
