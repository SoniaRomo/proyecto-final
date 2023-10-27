
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Usuario")
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ididentificacio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long identificacion;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "telefono")
    private int telefono;
    @Column(name = "direccion")
    private String direcion;
     @Column(name = "correo")
    private String correo;
     @Column(name = "activo")
    private boolean activo;

    
    
}
