
package com.tienda.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.domain.Producto; //control h para reemplazar partes de codigo clave
/**
 *
 * @author naoal
 */
public interface ProductoDao extends JpaRepository<Producto, Long>{

}
