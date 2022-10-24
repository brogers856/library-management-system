package com.library.lms.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.lms.lms.entity.Copy;

@Repository
public interface CopyRepository extends JpaRepository<Copy, Integer> {

}
