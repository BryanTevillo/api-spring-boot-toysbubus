package com.toysbubus.toysbubus_aplication.modules.stores.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    private Long id;
    private String name; // Name of the store
    private String location;

}
