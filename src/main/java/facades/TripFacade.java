package facades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class TripFacade {

    private static TripFacade instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private TripFacade() {

    }


    public static TripFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new TripFacade();
        }
        return instance;
    }


    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }





}
