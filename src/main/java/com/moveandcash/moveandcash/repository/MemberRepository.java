package com.moveandcash.moveandcash.repository;

import com.moveandcash.moveandcash.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);
}
