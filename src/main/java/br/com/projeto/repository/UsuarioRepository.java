package br.com.projeto.repository;

import br.com.projeto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
