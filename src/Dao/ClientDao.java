
package Dao;

import Domain.Client;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClientDao extends GenericDao<Client>{
    
    public Client findByFirstName(String name){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("SELECT a FROM Client a WHERE a.firstName = :x");
        q.setParameter("x", name);
        Client list = (Client) q.uniqueResult();
        s.close();
        return list;
    }
}
