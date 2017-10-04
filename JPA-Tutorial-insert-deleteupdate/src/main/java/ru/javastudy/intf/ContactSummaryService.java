package ru.javastudy.intf;


import ru.javastudy.supportClasses.ContactSummary;

import java.util.List;

public interface ContactSummaryService {
    public List<ContactSummary> findAllSummary();
}
