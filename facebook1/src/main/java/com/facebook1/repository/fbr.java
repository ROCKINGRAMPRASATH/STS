package com.facebook1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facebook1.model.fbm;

@Repository
public interface fbr extends JpaRepository<fbm,String>{

}
