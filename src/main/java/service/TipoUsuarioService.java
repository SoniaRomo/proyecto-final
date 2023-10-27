
package service;

import java.util.List;
import java.util.Optional;
import entity.TipoUsuario;

public interface TipoUsuarioService {

    public List<TipoUsuario> findAll();

    public List<TipoUsuario> findALLCustom();

    public Optional<TipoUsuario> findById(int id);

    public  TipoUsuario add( TipoUsuario t);

    public TipoUsuario update(TipoUsuario t);

    public void delete(TipoUsuario t);
}

