package br.com.projeto.service;

import br.com.projeto.model.Usuario;
import br.com.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return ResponseEntity.status(200).body(repository.findAll());
    }

    public ResponseEntity<Usuario> cadastrarUsuario(Usuario usuario) {
          return  ResponseEntity.status(201).body(repository.save(usuario));
    }

    public ResponseEntity<Usuario> editarUsuario(Usuario usuario) {
        return ResponseEntity.status(201).body(repository.save(usuario));
    }

    public ResponseEntity<?> excluirUsuario(Long id) {
        repository.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
