package com.BumblebeeDatabase.BumblebeeDatabase.controller;


import com.BumblebeeDatabase.BumblebeeDatabase.model.Users;
import com.BumblebeeDatabase.BumblebeeDatabase.savingData.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/add")
    // Lien pour ajouter des users
    public String add(@RequestBody Users user) {
        usersService.saveUsers(user);
        return "Utilisateur ajouté";
    }

    @GetMapping("/getAll")
    // lien pour afficher les users
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

}
