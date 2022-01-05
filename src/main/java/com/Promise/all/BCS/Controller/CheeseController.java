package com.Promise.all.BCS.Controller;

import com.Promise.all.BCS.Entity.Cheese;
import com.Promise.all.BCS.Exception.ResourceNotFoundException;
import com.Promise.all.BCS.Repository.CheeseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cheeses")
public class CheeseController {

    @Autowired
    private CheeseRepository cheeseRepository;

    @GetMapping("/cheeses")
    @CrossOrigin(origins = {"http://localhost:3000", " http://192.168.1.69:3000", "http://localhost:8080"})
    public List<Cheese> getCheeses(){
        return cheeseRepository.findAll();
    }

    @PostMapping("/cheeses/")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000", " http://192.168.1.69:3000"})
    public Cheese addCheese(@RequestBody Cheese newCheese){
        return cheeseRepository.save(newCheese);
    }

    @PutMapping("/cheeses/{id}")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000", " http://192.168.1.69:3000"})
    public ResponseEntity<Cheese> updateCheese(@PathVariable(value = "id")long id, @RequestBody Cheese cheese)
            throws ResourceNotFoundException {
        Cheese currentCheese = (Cheese) cheeseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + ": not found"));

        currentCheese.setCheese_name(cheese.getCheese_name());
        currentCheese.setBeverage1_name(cheese.getBeverage1_name());
        currentCheese.setBeverage2_name(cheese.getBeverage2_name());
        currentCheese.setBeverage3_name(cheese.getBeverage3_name());
        currentCheese.setBeverage4_name(cheese.getBeverage4_name());
        currentCheese.setBeverage5_name(cheese.getBeverage5_name());
        currentCheese.setBeverage6_name(cheese.getBeverage6_name());
        currentCheese.setBeverage7_name(cheese.getBeverage7_name());
        currentCheese.setAging_period(cheese.getAging_period());
        currentCheese.setBest_uses(cheese.getBest_uses());
        currentCheese.setTaste(currentCheese.getTaste());
        currentCheese.setType_of_milk(cheese.getType_of_milk());
        currentCheese.setCountry_of_origin(cheese.getCountry_of_origin());
        currentCheese.setNotes(cheese.getNotes());
        currentCheese = cheeseRepository.save(cheese);

        return ResponseEntity.ok(currentCheese);
    }

    @DeleteMapping("/cheeses/{id}")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000", " http://192.168.1.69:3000"})
    public Map<Long, String> removeCheese(@PathVariable long id)throws ResourceNotFoundException {

        Cheese cheese = (Cheese) cheeseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found"));
        cheeseRepository.delete(cheese);
        Map<Long, String> response = new HashMap<>();
        response.put(id, "Listing Deleted");
        return response;
    }

    @GetMapping("beverages/{id}")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000", " http://192.168.1.69:3000"})
    public Map<Long, Cheese> selectedBeverage(@PathVariable long id)throws ResourceNotFoundException{
        Cheese cheese = cheeseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found"));
        Map<Long, Cheese> response = new HashMap<>();
        response.put(id, cheese);
        return response;
    }
}