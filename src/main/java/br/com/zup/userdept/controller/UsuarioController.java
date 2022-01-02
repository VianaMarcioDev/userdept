package br.com.zup.userdept.controller;

import br.com.zup.userdept.entities.Usuario;
import br.com.zup.userdept.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> findAll(){
        List<Usuario> resultado = usuarioRepository.findAll();
        return resultado;
    }
}
