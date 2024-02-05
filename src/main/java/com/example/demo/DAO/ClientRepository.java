package com.example.demo.DAO;

import com.example.demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClientRepository extends JpaRepository<Client, Integer>{
}
