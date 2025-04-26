package com.toysbubus.toysbubus_aplication.modules.stores.application.dto;

import jakarta.validation.constraints.NotBlank;

public record StoreRequest(@NotBlank(message = "name is mandatory") String name,
        @NotBlank(message = "location is mmandatory") String location

) {

}
