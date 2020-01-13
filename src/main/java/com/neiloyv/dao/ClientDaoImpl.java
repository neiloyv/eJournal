package com.neiloyv.dao;

import com.neiloyv.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {
    private static final Logger logger = LoggerFactory.getLogger(ClientDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addClient(Client client) {
        // Создаем сессию, которая просит нашу фабрику сесий дать нам текущую сессию
        Session session = sessionFactory.getCurrentSession();

        // Наша сессия сохраняет объект который мы ей передали
        session.persist(client);

        // Добавляем информацию для логгирования
        logger.info("Client successfully save in DB. Client detalis: " + client);
    }

    @Override
    public void updateClient(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.update(client);
        logger.info("Client successfully update in DB. Client detalis: " + client);

    }

    @Override
    public void remoteClient(int id) {
        Session session = sessionFactory.getCurrentSession();
        Client client = (Client) session.load(Client.class, new Integer(id));

        if(client != null) {
            session.delete(client);
        }
        logger.info("Client successfully delete from DB. Client detalis: " + client);

    }

    @Override
    public Client getClientId(int id) {
        Session session = sessionFactory.getCurrentSession();
        Client client = (Client) session.load(Client.class, new Integer(id));
        logger.info("Client successfully loaded from DB. Client detalis: " + client);
        return client;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Client> listClients() {
        Session session = sessionFactory.getCurrentSession();
        List<Client> listClients = session.createQuery("from Client").list();

        for (Client client : listClients) {
            logger.info("Client list: " + client);
        }
        return listClients;
    }
}
