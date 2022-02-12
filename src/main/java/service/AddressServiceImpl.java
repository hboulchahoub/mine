package service;

import dao.AddressDao;
import models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressDao dao;

    @Override
    @Transactional
    public void save(Address address) {
        dao.save(address);
    }
}
