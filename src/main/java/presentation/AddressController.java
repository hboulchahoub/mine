package presentation;

import models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.AddressService;

@Controller
public class AddressController {
    @Autowired
    private AddressService service;
    public void save(Address address){
        service.save(address);
    }
}
