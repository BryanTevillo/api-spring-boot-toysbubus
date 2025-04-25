package com.toysbubus.toysbubus_aplication.machines.domain.model;

// * here all the imports are added
import lombok.Data;


/*
 * TODO The class is a model for a machine entity in the application. It contains fields that TODO
 * represent the properties of a machine, such as id, name, description, imageUrl, location, status,
 * TODO and model. The @Data annotation from Lombok is used to automatically generate getters and
 * setters TODO for these fields, as well as other utility methods like equals(), hashCode(), and
 * toString().
 */

@Data
public class Machine {
    private long id;
    private String name;
    private String description;
    private String imageUrl;
    private String location;
    private String status;
    private String model;
    private String cost;
}
