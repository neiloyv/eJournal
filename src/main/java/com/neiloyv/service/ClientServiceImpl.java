package com.neiloyv.service;

import com.neiloyv.dao.ClientDao;
import com.neiloyv.model.Client;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientDao clientDao;

    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    @Transactional
    public void addClient(Client client) {
        this.clientDao.addClient(client);
    }

    @Override
    @Transactional
    public void updateClient(Client client) {
        this.clientDao.updateClient(client);
    }

    @Override
    @Transactional
    public void remoteClient(int id) {
        this.clientDao.remoteClient(id);
    }

    @Override
    @Transactional
    public Client getClientId(int id) {
        return this.clientDao.getClientId(id);
    }

    @Override
    @Transactional
    public List<Client> listClients() {
        return this.clientDao.listClients();
    }
}
