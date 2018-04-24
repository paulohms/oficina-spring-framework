package com.oficina.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oficina.spring.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long> {

}
