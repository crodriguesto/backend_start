package com.capgemini.start.domain.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.start.domain.entity.Genero;

public class GeneroService extends AbstractService<Genero, Long> {

	@Override
	protected JpaRepository<Genero, Long> getRepository() {
		// TODO Auto-generated method stub
		return null;
	}

		
}