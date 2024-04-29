package com.example.golf.repo;

import com.example.golf.dto.TeachDto;
import com.example.golf.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepo extends JpaRepository<Teacher,String> {
    @Query(value = "select t.class_name, t.price , t.teacher_code \n" +
            "from teacher t ",nativeQuery = true)
    List<Object[]> teachQuery();
}
