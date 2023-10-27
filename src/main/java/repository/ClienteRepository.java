
package repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

    @Query("SELECT c FROM cliente c WHERE c.activo=true")
    List<Cliente> finDallCustom();

    public Cliente getById(Integer persona);

}



