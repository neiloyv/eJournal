package com.neiloyv.controller;

import com.neiloyv.model.Client;
import com.neiloyv.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientController {

    private ClientService clientService;

    @Autowired
    @Qualifier(value = "clientService")
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public String listClients(Model model){
        model.addAttribute("client", new Client());
        model.addAttribute("listClients", this.clientService.listClients());

        return "clients";
    }

    @RequestMapping(value = "/clients/add", method = RequestMethod.POST)
    public String addClient(@ModelAttribute("client") Client client) {
        if(client.getId() == 0){
            this.clientService.addClient(client);
        } else {
            this.clientService.updateClient(client);
        }

        return "redirect:/clients";
    }

    @RequestMapping("/remove/{id}")
    public String removeClient(@PathVariable("id") int id) {
        this.clientService.remoteClient(id);
        return "redirect:/clients";
    }

    @RequestMapping("/edit/{id}")
    public String editClient(@PathVariable("id") int id, Model model) {
        model.addAttribute("client", this.clientService.getClientId(id));
        model.addAttribute("listClients", this.clientService.listClients());
        return "clients";
    }

    @RequestMapping("/clientdata/{id}")
    public String clientData(@PathVariable("id") int id, Model model) {
        System.out.println("client data method: ");
        model.addAttribute("client", this.clientService.getClientId(id));
        return "clientdata";
    }


}
