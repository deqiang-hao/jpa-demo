package me.deqiang.demo.jpa;

import me.deqiang.demo.jpa.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created with IntelliJ IDEA.
 * User: Howrd
 * Date: 13-11-15
 * Time: 下午6:33
 * To change this template use File | Settings | File Templates.
 */
public class DbTest {
    EntityManagerFactory emf = null;

    @Before
    public void before() {
        emf = Persistence.createEntityManagerFactory("myJPA");
    }

    @Test
    public void addUser() {
        User user = new User();

        user.setUsername("admin");
        user.setPassword("123");
        user.setEmail("hello@domain.com");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    @After
    public void after() {
        if(null != emf) {
            emf.close();
        }
    }
}
