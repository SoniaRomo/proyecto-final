
package service;

import java.util.List;
import java.util.Optional;
import entity.Cliente;


public interface ClienteService {

    public List<Cliente> findAll();

    public List<Cliente> findALLCustom();

    public Optional<Cliente> findById(Integer id);

    public Cliente add(Cliente c);

    public Cliente update(Cliente c);

    public Cliente delete(Cliente c);
}

