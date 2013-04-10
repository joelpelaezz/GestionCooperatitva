/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao;

import dominio.OrdenDia;

/**
 *
 * @author Alumno
 */
public interface OrdenDiaDao {
  java.util.List<OrdenDia> listarOrdenDia();
  public void addOrdenDia(OrdenDia a);
  public void deleteOrdenDia(OrdenDia a);
  public void upDateOrdenDia(OrdenDia a);
  public OrdenDia getOrdenDia(int idOrdenDia); 
}
