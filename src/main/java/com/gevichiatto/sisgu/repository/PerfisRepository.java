package com.gevichiatto.sisgu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gevichiatto.sisgu.entity.Perfis;

@RepositoryRestResource()
public interface PerfisRepository extends JpaRepository<Perfis, Integer>, JpaSpecificationExecutor<Perfis>, QuerydslPredicateExecutor<Perfis> {}
