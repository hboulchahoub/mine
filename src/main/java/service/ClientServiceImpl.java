package service;

import dao.IClientDao;
import models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {
    @Autowired
    private IClientDao dao;
    @Override
    @Transactional
    public Client save(Client c) {
        return dao.save(c);
    }

    @Override
    @Transactional
    public Client modify(Client p) {
        Client old= dao.findById(p.getId()).get();
        old.setName(p.getName());
        return dao.save(old);
    }

    @Override
    public Client getOne(long id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Client> getAll() {
        return (List<Client>) dao.findAll();
    }
}
