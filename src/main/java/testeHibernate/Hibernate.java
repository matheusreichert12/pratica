package testeHibernate;

import config.HibernateUtil;

import model.Cep;
import org.hibernate.Session;

public class Hibernate {
    
    public static void main(String[] args) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        
        Cep c = new Cep();
        
        c.setCep("9891");
        
        s.getTransaction().begin();
        s.saveOrUpdate(c);
        s.getTransaction().commit();
        
        s.close();
    }
}
