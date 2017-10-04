package ru.javastudy.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javastudy.intf.ContactSummaryService;
import ru.javastudy.supportClasses.ContactSummary;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
/*
Запрос со специальным типов результата и конструирующим выражением
 */
@Service("contactSummaryService")
@Repository
@Transactional
public class ContactSummaryServiceImpl implements ContactSummaryService {

    @PersistenceContext
    private EntityManager em;

    public List<ContactSummary> findAllSummary() {
        List<ContactSummary> contactSummaryList = em.createQuery(
                "select new ru.javastudy.supportClasses.ContactSummary(c.firstName, c.lastName, t.telNumber)"
                +" from ContactEntity c left join c.contactTelDetails t where t.telType='Домашний'", ContactSummary.class).getResultList();
        return contactSummaryList;
    }
}
