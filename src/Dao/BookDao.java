
package Dao;

import Domain.Book;
import org.hibernate.Query;
import org.hibernate.Session;

public class BookDao extends GenericDao<Book>{
    
    public Book findByTitle(String name){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("SELECT a FROM Book a WHERE a.title = :x");
        q.setParameter("x", name);
        Book list = (Book) q.uniqueResult();
        s.close();
        return list;
    }
}
