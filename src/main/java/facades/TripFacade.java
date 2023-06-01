package facades;

import dtos.RenameMeDTO;
import dtos.TripDTO;
import entities.RenameMe;
import entities.Trip;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class TripFacade {

    private static TripFacade instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private TripFacade() {

    }


    public static TripFacade getTripFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new TripFacade();
        }
        return instance;
    }


    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<TripDTO> getAllActiveTrips() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Trip> query = em.createQuery("SELECT t FROM Trip t WHERE t.activ = 1", Trip.class);
        List<Trip> trips = query.getResultList();
        List<TripDTO> tripsDTO = new ArrayList<TripDTO>();
        for (Trip trip : trips) {
            TripDTO tripDTO = new TripDTO();
            tripDTO.setId(trip.getId());
            tripDTO.setName(trip.getName());
            tripDTO.setDate(trip.getDate());
            tripDTO.setTime(trip.getTime());
            tripDTO.setLocation(trip.getLocation());
            tripDTO.setDuration(trip.getDuration());
            tripDTO.setPacking_list(trip.getPacking_list());
            tripDTO.setActiv(trip.getActiv());
        }
        return tripsDTO;
    }
}