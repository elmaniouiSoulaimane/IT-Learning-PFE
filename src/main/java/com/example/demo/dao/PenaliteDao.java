package com.example.demo.dao;

import com.example.demo.bean.Penalite;
import com.example.demo.bean.TaxeTNB;
import com.example.demo.bean.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.Year;
import java.util.Date;

@Repository
public interface PenaliteDao extends JpaRepository<Penalite, Long> {
    Penalite findByTaxeTNBAnnee(Long annee);
    Penalite findByTaxeTNBTerrainReference(String reference);
    Integer deleteByTaxeTNBAnnee(Year annee);
    Penalite findByTaxeTNBTerrainAndAndTaxeTNBAnnee(Terrain terrain, Long annee);
}
