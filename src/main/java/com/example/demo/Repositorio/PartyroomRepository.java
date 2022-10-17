package com.example.demo.Repositorio;

import com.example.demo.Interface.PartyroomInterface;
import com.example.demo.Modelo.Partyroom;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PartyroomRepository {

    @Autowired
    private PartyroomInterface extensionesCrud;

    public List<Partyroom> getAll() {
        return (List<Partyroom>) extensionesCrud.findAll();
    }

    public Optional<Partyroom> getPartyroom(int id) {
        return extensionesCrud.findById(id);
    }

    public Partyroom save(Partyroom partyroom) {
        return extensionesCrud.save(partyroom);
    }

    public void delete(Partyroom partyroom) {
        extensionesCrud.delete(partyroom);
    }
}
