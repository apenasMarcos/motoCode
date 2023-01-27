package br.com.projeto.repository;

import br.com.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface iUsuario extends CrudRepository<Usuario, Integer> {

}
