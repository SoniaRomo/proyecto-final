
package service;

import java.util.List;
import java.util.Optional;
import entity.Producto;


public interface ProductoService {

    public List<Producto> findAll();

    public List<Producto> findALLCustom();

    public Optional<Producto> findById(Integer id);

    public Producto add(Producto p);

    public Producto update(Producto p);

    public Producto delete(Producto p);
}

