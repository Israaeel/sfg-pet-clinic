package springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.sfgpetclinic.services.OwnerService;


@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    // O Spring usará este construtor para injetar o OwnerService automaticamente
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {

        // Adiciona a lista de donos ao modelo para o Thymeleaf exibir no HTML
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}