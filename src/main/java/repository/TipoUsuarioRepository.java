
package repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import entity.TipoUsuario;

public interface TipoUsuarioRepository extends CrudRepository<TipoUsuario, Integer> {

    @Query("SELECT t FROM tipousuario t WHERE t.estado=true")
    List<TipoUsuario> finDallCustom();

    public TipoUsuario getById(Integer tipusuario);

 
    

}
