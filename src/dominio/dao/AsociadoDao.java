package dominio.dao;

import dominio.Asociado;
import hibernateUtil.Conexion;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public interface AsociadoDao 
{
  java.util.List<Asociado> listarAsociados();
  public void addAsociado(Asociado a);
  public void deleteAsociado(Asociado a);
  public void upDateAsociado(Asociado a);
  public Asociado getAsociado(int idAsociado);
  
    
    
}
