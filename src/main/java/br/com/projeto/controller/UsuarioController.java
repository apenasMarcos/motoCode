package br.com.projeto.controller;

import br.com.projeto.model.Usuario;
import br.com.projeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> usuario(){
     return usuarioService.listarUsuarios();
    }

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){
         return usuarioService.cadastrarUsuario(usuario);
    }

    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        return usuarioService.editarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public String excluirUsuario(@PathVariable Long id){
        return usuarioService.excluirUsuario(id);
    }
}
