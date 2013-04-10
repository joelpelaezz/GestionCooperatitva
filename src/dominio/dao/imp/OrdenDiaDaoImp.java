/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao.imp;

import dominio.OrdenDia;
import dominio.dao.OrdenDiaDao;
import hibernateUtil.Conexion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author Alumno
 */
public class OrdenDiaDaoImp extends Conexion implements OrdenDiaDao{

    @Override
    public List<OrdenDia> listarOrdenDia() {
        Criteria criteria = getSession().createCriteria(OrdenDia.class);
        return criteria.list();
    }

    @Override
    public void addOrdenDia(OrdenDia a) {
       Transaction t = getSession().beginTransaction();
          getSession().save(a);
       t.commit();
    }

    @Override
    public void deleteOrdenDia(OrdenDia a) {
        Transaction t = getSession().beginTransaction();
          getSession().delete(a);
       t.commit();
    }

    @Override
    public void upDateOrdenDia(OrdenDia a) {
         Transaction t = getSession().beginTransaction();
         getSession().update(a);
      t.commit();
    }

    @Override
    public OrdenDia getOrdenDia(int idOrdenDia) {
        Transaction t = getSession().beginTransaction();
           OrdenDia a = (OrdenDia) getSession().get(OrdenDia.class, idOrdenDia);
        t.commit();
       return a;
    }
    
}
