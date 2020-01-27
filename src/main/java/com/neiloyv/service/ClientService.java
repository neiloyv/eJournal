package com.neiloyv.service;

import com.neiloyv.model.Client;

import java.util.List;

public interface ClientService {

    public void addClient(Client client);

    public void updateClient(Client client);

    public void remoteClient(int id);

    public Client getClientId(int id);

    public List<Client> listClients();
}
