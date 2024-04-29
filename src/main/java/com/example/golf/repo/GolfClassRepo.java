package com.example.golf.repo;

import com.example.golf.entity.GolfClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GolfClassRepo extends JpaRepository<GolfClass,Long> {
    @Query(value = "select t.teacher_code, t.class_name , t.teacher_name , sum(g.tuition)\n" +
            "from teacher t \n" +
            "inner join golf_class g\n" +
            "on t.teacher_code = g.teacher_code\n" +
            "group by t.teacher_code\n" +
            "order by t.teacher_code asc",nativeQuery = true)
    List<Object[]> sales();
}
