

package com.tienda.service;
import java.util.List;
import com.tienda.domain.Categoria;
/**
 *
 * @author naoal
 */
public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);
    
}
