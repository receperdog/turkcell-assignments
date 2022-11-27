package com.turkcell.assignment08.services;

import com.turkcell.assignment08.model.Ders;
import com.turkcell.assignment08.model.DersDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DersService
{
//    private DersRepository repo;

    public List<Ders> getAll()
    {
        return null;

//        return repo.getAll();
    }

    public List<DersDTO> getAllDTO()
    {
        return null;

//        return repo.getAllDTO();
    }

    public Ders getByID(long id)
    {
        return null;

//        return repo.getById(id);
    }

    public boolean save(Ders ders)
    {
        return true;
//        try
//        {
//            return repo.save(ders);
//        }
//        catch (Exception e)
//        {
//            return false;
//        }
    }
}
