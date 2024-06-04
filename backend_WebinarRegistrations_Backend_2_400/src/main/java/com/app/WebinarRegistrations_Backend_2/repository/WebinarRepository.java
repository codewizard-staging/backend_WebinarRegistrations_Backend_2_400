package com.app.WebinarRegistrations_Backend_2.repository;

import com.app.WebinarRegistrations_Backend_2.model.Webinar;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class WebinarRepository extends SimpleJpaRepository<Webinar, String> {
    private final EntityManager em;
    public WebinarRepository(EntityManager em) {
        super(Webinar.class, em);
        this.em = em;
    }
    @Override
    public List<Webinar> findAll() {
        return em.createNativeQuery("Select * from \"webinarregistrations_backend_2\".\"Webinar\"", Webinar.class).getResultList();
    }
}