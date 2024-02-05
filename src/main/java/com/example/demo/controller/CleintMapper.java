package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.model.Order;
import com.example.demo.service.EnumClient;

public class CleintMapper {
    public static ClientDTO convertToDTO(Client entity) {
        ClientDTO dto = new ClientDTO();
        dto.setﬁrstName(entity.getﬁrst_name());
        dto.setLastName(entity.getLast_name());
        dto.setAddress(entity.getAddress());
        dto.setState(String.valueOf(EnumClient.values()[entity.getState()]));
        dto.setEmail(entity.getEmail());
        dto.setCompanyName(entity.getCompany_name());
        dto.setPhone(entity.getPhone());
        dto.setZipCode(entity.getZip_code());
        dto.setCountry(entity.getCountry());
        dto.setCity(entity.getCity());
        return dto;
    }
        public static Client convertToClient(ClientDTO dto){
            Client client = new Client(dto.getCompanyName(), dto.getﬁrstName(), dto.getLastName(), dto.getEmail(), dto.getPhone(), dto.getAddress(), dto.getZipCode(), dto.getCity(), dto.getCountry(), dto.getState());
            return client;

    }
}
