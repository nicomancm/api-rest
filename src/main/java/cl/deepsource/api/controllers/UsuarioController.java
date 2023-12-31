package cl.deepsource.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.deepsource.api.dto.Usuario;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UsuarioController {
    
    @GetMapping("/usuarios")
    List<Usuario> all() {
        List<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario.add(new Usuario(1, "nicolas", "dev"));
        listaUsuario.add(new Usuario(2, "daniel", "devop"));
        listaUsuario.add(new Usuario(3, "flamel", "sysadmin"));
        listaUsuario.add(new Usuario(4, "jose", "devops"));
        listaUsuario.add(new Usuario(5, "Francisco", "EL JEFE"));
        return listaUsuario;
    }
}
