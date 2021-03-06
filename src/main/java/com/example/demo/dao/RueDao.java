package com.example.demo.dao;

import com.example.demo.bean.Rue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RueDao extends JpaRepository<Rue,Long> {
    Rue findByCode(String code);
    int deleteByCode(String code);
    List<Rue> findByVille_Code(String code);
}
