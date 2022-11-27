package com.turkcell.assignment08.controller;

import com.turkcell.assignment08.model.Ogretmen;
import com.turkcell.assignment08.services.OgretmenService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "ogretmen")
public class OgretmenController {
    private OgretmenService service;

    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ogretmen> getAll()
    {
        // localhost:8080/ogretmen/getAll
        return service.getAll();
    }

    @GetMapping(path = "getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ogretmen> getByIdEntity(@PathVariable Long id)
    {
        // localhost:8080/ogretmen/getById/1
        return ResponseEntity.status(HttpStatus.OK).body(service.getByID(id));
    }

    // @PutMapping, @PatchMapping update için kullanılabilir
    @PostMapping(path = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> save(@RequestBody Ogretmen ogretmen)
    {
        // localhost:8080/ogretmen/save
        boolean result = service.save(ogretmen);
        if (result)
        {
            return ResponseEntity.status(HttpStatus.CREATED).body(ogretmen.getName() + " isimli öğretmen başarıyla kaydedildi");
        }
        else
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ogretmen.getName() + " isimli öğretmen kaydedilemedi");
        }
    }
}
