package com.example.demo.controller;
import com.example.demo.model.Order;
import com.example.demo.service.EnumOrder;
public class OrderMapper {
    public static OrderDTO convertToDTO(Order entity){
        OrderDTO dto = new OrderDTO();
            dto.setDesignation(entity.getDesignation());
            dto.setState(String.valueOf(EnumOrder.values()[entity.getState()]));
            dto.setNbDays(entity.getNb_days());
            dto.setUnitPrice(entity.getUnit_price());
            dto.setTypePresta(entity.getType_presta());
            dto.setTotalExcludeTaxe(entity.getTotal_exclude_taxe());
            dto.setTotalWithtaxe(entity.getTotal_with_taxe());
            dto.setClient(entity.getClient());
            return dto;
        }
    }

