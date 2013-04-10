/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao.imp;

import dominio.Asociado;
import dominio.dao.AsociadoDao;
import hibernateUtil.Conexion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author Alumno
 */
public class AsociadoDaoImp extends Conexion implements AsociadoDao{

  

    
    @Override
    public void addAsociado(Asociado a) {
       Transaction t = getSession().beginTransaction();
          getSession().save(a);
       t.commit();
    }

    @Override
    public void deleteAsociado(Asociado a) {
       Transaction t = getSession().beginTransaction();
          getSession().delete(a);
       t.commit();
    }

    @Override
    public void upDateAsociado(Asociado a) {
      Transaction t = getSession().beginTransaction();
         getSession().update(a);
      t.commit();
    }

    @Override
    public List<Asociado> listarAsociados() {
        Criteria criteria = getSession().createCriteria(Asociado.class);
        return criteria.list();
    }

    @Override
    public Asociado getAsociado(int idAsociado) {
        Transaction t = getSession().beginTransaction();
           Asociado a = (Asociado) getSession().get(Asociado.class, idAsociado);
        t.commit();
       return a;
    }
    
}
