package ru.javastudy.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javastudy.entities.ContactEntity;
import ru.javastudy.intf.ContactService;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Service("jpaContactService")
@Transactional
public class ContactServiceImpl implements ContactService {

    @PersistenceContext
    private EntityManager em;

    public List<ContactEntity> findAll() {
        return em.createNamedQuery("ContactEntity.findAll", ContactEntity.class).getResultList();
    }

    public List<ContactEntity> findAllWithDetail() {
        return em.createNamedQuery("ContactEntity.findAllWithDetail", ContactEntity.class).getResultList();
    }

    public ContactEntity findById(Integer id) {
        try {
            TypedQuery<ContactEntity> query = em.createNamedQuery("ContactEntity.findById", ContactEntity.class);
            query.setParameter("id", id);
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    public ContactEntity save(ContactEntity contact) {
        if (contact.getId() == null) {
            em.persist(contact);
        } else {
            em.merge(contact);
        }
        System.out.println("Contact saved with id: " + contact.getId());
        return contact;
    }

    // TODO: why null
    public void delete(ContactEntity contact) {
        if (contact == null) {
            return;
        }
        ContactEntity mergedContact = em.merge(contact);
        em.remove(mergedContact);
        System.out.println("Contact with id: " + mergedContact.getId() + " deleted successfully");
    }
}
