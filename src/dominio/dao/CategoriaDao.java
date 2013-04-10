/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao;

import dominio.Categoria;

/**
 *
 * @author Alumno
 */
public interface CategoriaDao {
  java.util.List<Categoria> listarCategoria();
  public void addCategoria(Categoria a);
  public void deleteCategoria(Categoria a);
  public void upDateCategoria(Categoria a);
  public Categoria getCategoria(int idCategoria); 
}
