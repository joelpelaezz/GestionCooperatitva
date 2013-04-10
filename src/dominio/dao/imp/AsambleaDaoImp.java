/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao.imp;

import dominio.Asamblea;

import dominio.dao.AsambleaDao;
import hibernateUtil.Conexion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author Alumno
 */
public class AsambleaDaoImp extends Conexion implements AsambleaDao{

    @Override
    public List<Asamblea> listarAsamblea() {
         Criteria criteria = getSession().createCriteria(Asamblea.class);
         return criteria.list();
    }

    @Override
    public void addAsamblea(Asamblea a) {
        Transaction t = getSession().beginTransaction();
          getSession().save(a);
       t.commit();
    }

    @Override
    public void deleteAsamblea(Asamblea a) {
        Transaction t = getSession().beginTransaction();
          getSession().delete(a);
       t.commit();
    }

    @Override
    public void upDateAsamblea(Asamblea a) {
         Transaction t = getSession().beginTransaction();
         getSession().update(a);
      t.commit();
    }

    @Override
    public Asamblea getAsamblea(int idAsamblea) {
         Transaction t = getSession().beginTransaction();
           Asamblea a = (Asamblea) getSession().get(Asamblea.class, idAsamblea);
        t.commit();
        return a;
    }
    
}
