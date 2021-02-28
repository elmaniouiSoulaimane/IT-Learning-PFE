package com.example.demo.ws;

import com.example.demo.bean.Taux;
import com.example.demo.service.TauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("boisson/taux")
public class TauxWs {
    @Autowired
    private TauxService tauxService;
    @GetMapping("/categorie/{id}")
    public Taux findByCategoryId(@PathVariable Long id) {
        return tauxService.findByCategoryId(id);
    }
    @GetMapping("/")
    public List<Taux> findAll() {
        return tauxService.findAll();
    }
    @PostMapping("/")
    public int save(Taux taux) {
        return tauxService.save(taux);
    }
}