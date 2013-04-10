/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;


import dominio.Asamblea;
import dominio.Asociado;
import dominio.OrdenDia;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class TablaUtil {
    
    
    /**
     * Crea la estructura de la tabla Asamblea , indica que columnas contendra
     * @param modelo  modelo de la tabla asamblea 
     * @param tablaAsamblea  tabla donde contendra informacion de todas las asableas
     */
    public static void prepararTablaAsambleas(DefaultTableModel modelo, JTable tablaAsamblea){
        
        String[] titulos = {"Nro","Tipo","Fecha","Hora","Lugar"};
       modelo= new DefaultTableModel(null,titulos);
       tablaAsamblea.setModel(modelo);
    }
    
    /**
     * Carga todos registros en la tabla Asamblea 
     * @param modelo  modelos de la tabla asamblea
     * @param listaAsamblea  
     * @param tablaAsamblea tabla donde contiene toda la informacion de las asambleas
     */
    public static void cargarModeloAsambleas(DefaultTableModel modelo,List<Asamblea>listaAsamblea,JTable tablaAsamblea){
         modelo =(DefaultTableModel) tablaAsamblea.getModel();
        for ( Asamblea a : listaAsamblea) {
          
            // si el alumno no tiene materias inscripta
            String fecha= FechaUtil.getDateDDMMYYYY(a.getFecha());
           Object[] filaAsamblea = {a.getIdAsamblea(),a.getTipoAsamblea(),fecha,FechaUtil.getHora(a.getHoraInicio()),a.getLugar()}; 
           modelo.addRow(filaAsamblea);
       
           
                   
            
           }
    }
    
    
     public static void prepararTablaOrdendelDia(DefaultTableModel modelo, JTable tablaOrdenDelDia){
        
        String[] titulos = {"Nro","Tema","Solucion"};
       modelo= new DefaultTableModel(null,titulos);
       tablaOrdenDelDia.setModel(modelo);
    }
    public static void cargarModeloOrdenDelDia(DefaultTableModel modelo,Set<OrdenDia> listaOrdenDia,JTable tablaOrdendelDia){
         modelo =(DefaultTableModel) tablaOrdendelDia.getModel();
       for (Iterator it = listaOrdenDia.iterator(); it.hasNext();) {
        OrdenDia a = (OrdenDia) it.next();
         Object[] filaAsamblea = {a.getIdOd(),a.getTema(),a.getConclusionTema()}; 
           modelo.addRow(filaAsamblea);
    }
         
         
         
         }
    
    public static void prepararTablaAsambleaAsociado(DefaultTableModel modelo, JTable tablaAsociado){
        
        String[] titulos = {"Nro","Asociado","Hora Inicio","Hora Salida"};
       modelo= new DefaultTableModel(null,titulos);
       tablaAsociado.setModel(modelo);
    }
    
    public static void cargarModeloAsambleaAsociado(DefaultTableModel modelo,List<Asociado>listaAsociado,JTable tablaAsistencia){
         modelo =(DefaultTableModel) tablaAsistencia.getModel();
        for ( Asociado a : listaAsociado) {
          
            // si el alumno no tiene materias inscripta
           Object[] filaAsociado = {a.getIdAsociado(),a.getApellidoAsociado()+"  "+a.getNombreAsociado(),"","",""}; 
           modelo.addRow(filaAsociado);
       
           
                   
               }
           }
        
    
   
        
    
    
    
  
     
     public static void setHoraenTablaAsistencia(DefaultTableModel modelo, JTable tablaAsistencia,int col){
         int fila = tablaAsistencia.getSelectedRow();
        if (fila== -1) {
            // no se selecciono ninguna fila de la lista
            JOptionPane.showMessageDialog(null, "debes seleccionar un Asociado ", "Informacion",JOptionPane.INFORMATION_MESSAGE);
        } else {
             modelo = (DefaultTableModel)tablaAsistencia.getModel();
             Date fechaHoy = new Date();
             String horaSalida =FechaUtil.getHora(fechaHoy);
             modelo.setValueAt(horaSalida,fila,col); // hora de entrada col=3
        }   
     }
}

