/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.*;
import org.apache.logging.log4j.*;
import sga.domain.Persona;

/**
 *
 * @author IAFAS
 */
public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //ini transaccion
        tx.begin();
        //No se debe especificar el id de la base de datos.
        Persona persona1 = new Persona("Mario","Gutierrez","s@f.com.pe","994746565");
        log.debug("Objeto a persistir:" + persona1);
        //Persistimos el objeto:
        em.persist(persona1);
        //terminamos la trasancccion. hacemos commit
        tx.commit();
        log.debug("Objeto persistido:" + persona1);
        em.close();
    }
    
}
