package com.example.upchiapas.dao;
import com.example.upchiapas.entity.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface IFrutaRepository extends JpaRepository<Fruta, Id> {

    List<Fruta> findAll();
}
