/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao.imp;

import dominio.Categoria;
import dominio.dao.CategoriaDao;
import hibernateUtil.Conexion;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class CategoriaDaoImp extends Conexion implements CategoriaDao{

    @Override
    public List<Categoria> listarCategoria() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addCategoria(Categoria a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteCategoria(Categoria a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void upDateCategoria(Categoria a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Categoria getCategoria(int idCategoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
