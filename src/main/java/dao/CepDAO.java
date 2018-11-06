package dao;

import config.HibernateUtil;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import model.Cep;
import org.hibernate.Session;
import testeHibernate.Hibernate;

public class CepDAO {

    private Session session;

    public CepDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Cep cep) {
        session.getTransaction().begin();
        session.save(cep);
        session.getTransaction().commit();
    }

    public void delete(Cep cep) {
        session.getTransaction().begin();
        session.remove(cep);
        session.getTransaction().commit();
    }
    
    public int count(Cep cep) {

        List<Cep> list = session.createQuery("from Cep where cep=?1")
                .setString(1, cep.getCep()).list();

        return list.size();
    }

    public List<Cep> findAll() {
        return session.createQuery("select c from Cep c").list();
    }
}
