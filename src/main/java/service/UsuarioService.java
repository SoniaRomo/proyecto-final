
package service;

import java.util.List;
import java.util.Optional;
import entity.Usuario;

public interface UsuarioService {

    public List<Usuario> findAll();

    public List<Usuario> findALLCustom();

    public Optional<Usuario> findById(long id);

    public  Usuario add(Usuario u);

    public  Usuario update( Usuario u);

    public  Usuario delete(Usuario u);
}


