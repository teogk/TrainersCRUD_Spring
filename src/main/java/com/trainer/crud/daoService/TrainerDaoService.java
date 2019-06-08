/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trainer.crud.daoService;

import com.trainer.crud.model.Trainer;
import com.trainer.crud.repository.TrainerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerDaoService {

    @Autowired
    TrainerRepo trainerRepo;

    public void insert(Trainer t) {
        trainerRepo.save(t);
    }

    public List<Trainer> getTrainers() {
        List<Trainer> trainers = trainerRepo.findAll();

        return trainers;
    }

    public void deleteTrainerById(int id) {
        trainerRepo.deleteById(id);
    }

}
