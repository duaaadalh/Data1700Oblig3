package com.example.obli3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private BestillingRepository rep;

    @PostMapping("/lagre")
    public void kjopBillet(Bestilling billett){

        rep.kjopBillett(billett);

    }

    @GetMapping("/visKvittering")
    public List<Bestilling> visKvittering(){
        return rep.visKvittering();
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        rep.slettAlle();
    }

}
