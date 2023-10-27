/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {

    @Query("SELECT p FROM producto p WHERE p.activo=true")
    List<Producto> finDallCustom();

}


