package br.com.projeto.service;

import br.com.projeto.model.Usuario;
import br.com.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public UsuarioService() {
    }

    public List<Usuario> listarUsuarios(){
        return repository.findAll();
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
          return  repository.save(usuario);
    }

    public Usuario editarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    public String excluirUsuario(Long id) {
        repository.deleteById(id);
        return "OK";
    }
}
