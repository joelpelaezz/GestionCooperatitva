/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao.imp;

import dominio.AsistenciaAsamblea;
import dominio.dao.AsistenciaAsambleaDao;
import hibernateUtil.Conexion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author Alumno
 */
public class AsistenciaAsambleaDaoImp extends Conexion implements AsistenciaAsambleaDao{

    @Override
    public List<AsistenciaAsamblea> listarAsistenciaAsamblea() {
        Criteria criteria = getSession().createCriteria(AsistenciaAsamblea.class);
        return criteria.list();
    }

    @Override
    public void addAsistenciaAsamblea(AsistenciaAsamblea a) {
         Transaction t = getSession().beginTransaction();
          getSession().save(a);
          t.commit();
    }

    @Override
    public void deleteAsistenciaAsamblea(AsistenciaAsamblea a) {
        Transaction t = getSession().beginTransaction();
          getSession().delete(a);
       t.commit();
    }

    @Override
    public void upDateAsistenciaAsamblea(AsistenciaAsamblea a) {
       Transaction t = getSession().beginTransaction();
         getSession().update(a);
       t.commit();
    }

    @Override
    public AsistenciaAsamblea getAsistenciaAsamblea(int idAsistenciaAsamblea) {
         Transaction t = getSession().beginTransaction();
           AsistenciaAsamblea a = (AsistenciaAsamblea) getSession().get(AsistenciaAsamblea.class, idAsistenciaAsamblea);
        t.commit();
        return a;
    }
    
}
