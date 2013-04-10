/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao;

import dominio.AsistenciaAsamblea;

/**
 *
 * @author Alumno
 */
public interface AsistenciaAsambleaDao {
  java.util.List<AsistenciaAsamblea> listarAsistenciaAsamblea();
  public void addAsistenciaAsamblea(AsistenciaAsamblea a);
  public void deleteAsistenciaAsamblea(AsistenciaAsamblea a);
  public void upDateAsistenciaAsamblea(AsistenciaAsamblea a);
  public AsistenciaAsamblea getAsistenciaAsamblea(int idAsistenciaAsamblea); 
}
