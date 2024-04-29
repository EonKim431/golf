package com.example.golf.repo;

import com.example.golf.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepo extends JpaRepository<Member,String> {
    @Query(value = "select g.regist_month, m.member_id , m.member_name ,t.class_name ,g.class_area, g.tuition , m.grade \n" +
            "from \"member\" m \n" +
            "left join \"golf_class\" g\n" +
            "on m.member_id = g.class_no\n" +
            "inner join teacher t \n" +
            "on g.teacher_code = t.teacher_code ;",nativeQuery = true)
    List<Object[]> memberQuery();
    @Query(value = "select m.member_id ,m.member_name ,m.grade \n" +
            "from \"member\" m ",nativeQuery = true)
    List<Object[]> memberNameQuery();

}
