/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabianramirez.tienda;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fabia
 */

@Table(name="productos")
@Entity
public class Producto {
     
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;  
    private String nombre;
    private String descripcion;
    private BigDecimal precio; 
    
    public Long getId() {
        return id;
    }
      public void setId(Long id) {
        this.id = id;
    }
      public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }  
    
}
