package com.toysbubus.toysbubus_aplication.machines.infrastructure.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity // JPA: this is a table in the database
@Table(name = "machines") // JPA: this is the name of the table in the database
// The table name is pluralized to follow the convention of naming tables in the database
public class MachineEntity {

    @Id // JPA: this is the primary key of the table
    @GeneratedValue // JPA: this is the auto-generated value of the primary key
    private Long id; // JPA: this is the id of the machine
    private String name; // JPA: this is the name of the machine
    private String description; // JPA: this is the description of the machine
    private String imageUrl; // JPA: this is the image url of the machine
    private String location; // JPA: this is the location of the machine
    private Boolean status; // JPA: this is the status of the machine
    private String model; // JPA: this is the model of the machine
    private Double cost; // JPA: this is the cost of the machine
}
