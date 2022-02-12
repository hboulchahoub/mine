package service;

import models.Client;

import java.util.List;

public interface IClientService {
    Client save(Client p);
    Client modify(Client p);
    Client getOne(long id);
    List<Client> getAll();
}
