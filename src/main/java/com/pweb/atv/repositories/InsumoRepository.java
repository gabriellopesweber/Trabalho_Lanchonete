package com.pweb.atv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pweb.atv.domain.Insumo;

@Repository
public interface InsumoRepository extends JpaRepository<Insumo, Integer>{
	
}
