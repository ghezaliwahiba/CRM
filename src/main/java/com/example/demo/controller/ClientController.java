package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.model.Order;
import com.example.demo.service.ClientService;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("clients")
    public List<ClientDTO> findAll(){
        List<ClientDTO> dtos = new ArrayList<>();
        for(Client entity : clientService.getAll())
            dtos.add(CleintMapper.convertToDTO(entity));
        return dtos;
    }

    @PostMapping("clients")
    public void addClient(@RequestBody Client client) {
        clientService.add(client);
    }
    @DeleteMapping("clients/{id}")
    public void delete(@PathVariable("id") Integer id) {
        clientService.delete(id);
    }
    @PutMapping("clienst/{id}")
    public void update(@RequestBody Client client, @PathVariable("id") Integer id) {
        clientService.update(id, client);
    }
    @GetMapping("clients/{id}")
    public ResponseEntity<Client> findById(@PathVariable("id") Integer id){
        Optional<Client> opt = clientService.findById(id);
        if(opt.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(opt.get());
    }


}