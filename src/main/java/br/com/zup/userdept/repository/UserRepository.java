package br.com.zup.userdept.repository;

import br.com.zup.userdept.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long > {
}
