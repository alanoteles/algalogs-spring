package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Clients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
public class ClienteController {

  @PersistenceContext
  private EntityManager manager;

  @GetMapping("clients")
  public List<Clients> listar() {

      return manager.createQuery("from Clients", Clients.class).getResultList();
  }
}
