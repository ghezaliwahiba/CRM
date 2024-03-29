package com.example.demo.service;
import com.example.demo.DAO.ClientRepository;
import com.example.demo.controller.CleintMapper;
import com.example.demo.controller.ClientDTO;
import com.example.demo.controller.OrderDTO;
import com.example.demo.controller.OrderMapper;
import com.example.demo.model.Client;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public void add(ClientDTO clientdto){
        Client client= CleintMapper.convertToClient(clientdto);
        clientRepository.save(client);
    }

    public List<Client> getAll(){
        return clientRepository.findAll();
    }
    public Optional<Client> findById(Integer id){
        return clientRepository.findById(id);
    }
    public void delete(Integer id){
        clientRepository.deleteById(id);
    }
    public void update(Integer id, Client client){
        clientRepository.save(client);
    }
}
