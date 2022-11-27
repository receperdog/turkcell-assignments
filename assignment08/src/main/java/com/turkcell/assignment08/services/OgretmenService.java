package com.turkcell.assignment08.services;

import com.turkcell.assignment08.model.Ogretmen;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OgretmenService
{
//  private OgretmenRepository repo;


    public List<Ogretmen> getAll()
    {
        return null;
//
//        return repo.getAll();
    }

    public Ogretmen getByID(long id)
    {
        return null;
//
//        return repo.getById(id);
    }

    public boolean save(Ogretmen ogretmen)
    {
        return false;
//        try
//        {
//            return repo.save(ogretmen);
//        }
//        catch (Exception e)
//        {
//            System.err.println(e.getMessage());
//            return false;
//        }
    }
}
