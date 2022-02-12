package presentation;

import models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.IClientService;

@Controller(value = "ctrl1")
public class ClientController {

    @Autowired
    private IClientService service;

    public void save(Client person) {
        service.save(person);
    }

}
