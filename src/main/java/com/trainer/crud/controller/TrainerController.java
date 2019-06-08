package com.trainer.crud.controller;

import com.trainer.crud.daoService.TrainerDaoService;
import com.trainer.crud.model.Trainer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "trainer/view")
public class TrainerController {

    @Autowired
    TrainerDaoService trainerDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewTrainers(ModelMap mm) {
        List<Trainer> trainers = trainerDao.getTrainers();
        mm.addAttribute("trainers", trainers);
        return "viewTrainers";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertTrainer(ModelMap mm) {
        Trainer t = new Trainer();
        mm.addAttribute("trainer", t);
        return "insertTrainer";
    }

    @RequestMapping(value = "/doinsert", method = RequestMethod.POST)
    public String doinsertTrainer(ModelMap mm, @ModelAttribute Trainer t) {

        trainerDao.insert(t);
        return "redirect:/trainer/view";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteTrainer( @PathVariable Integer id) {
        trainerDao.deleteTrainerById(id);

        return "redirect:/trainer/view";
    }

}
