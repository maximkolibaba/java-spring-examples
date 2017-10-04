package ru.javastudy.intf;

import org.springframework.transaction.annotation.Transactional;
import ru.javastudy.entities.ContactEntity;

import java.util.List;

public interface ContactService {

    // Найти все контакты.
    public List<ContactEntity> findAll();
    // Найти все контакты с заданным телефоном и хобби.
    public List<ContactEntity> findAllWithDetail();
    // Найти контакт со всеми деталями по идентификатору.
    public ContactEntity findById(Integer id);
    // Вставить или обновить контакт.
    @Transactional
    public ContactEntity save(ContactEntity contact);
    // Удалить контакт.
    public void delete(ContactEntity contact);
}
