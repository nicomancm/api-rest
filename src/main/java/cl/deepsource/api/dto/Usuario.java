package cl.deepsource.api.dto;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Usuario {
    private Integer id;
    private String nombre;
    private String cargo; 
}
