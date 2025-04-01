package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.domain.Producto; //control h para reemplazar partes de codigo clave
import java.util.List;

/**
 *
 * @author naoal
 */
public interface ProductoDao extends JpaRepository<Producto, Long> {

    List<Producto> findByExistencias(int existencias);

    List<Producto> findByExistenciasAndPrecio(int existencias, double precio);
    //Ejemplo de método utilizando Métodos de Query

    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
}
