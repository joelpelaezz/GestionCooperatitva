/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao;

import dominio.Asamblea;

/**
 *
 * @author Alumno
 */
public interface AsambleaDao {
   java.util.List<Asamblea> listarAsamblea();
  public void addAsamblea(Asamblea a);
  public void deleteAsamblea(Asamblea a);
  public void upDateAsamblea(Asamblea a);
  public Asamblea getAsamblea(int idAsamblea); 
}
