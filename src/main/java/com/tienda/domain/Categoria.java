

package com.tienda.domain;

/**
 *
 * @author naoal
 */
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;


@Data //para generar abajo set y get
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria; //id_categoria
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    public Categoria(){
        
    }
    public Categoria(String descripcion, String rutaImagen, boolean activo){
            this.descripcion = descripcion;
            this.rutaImagen = rutaImagen;
            this.activo = activo;   
            }


}