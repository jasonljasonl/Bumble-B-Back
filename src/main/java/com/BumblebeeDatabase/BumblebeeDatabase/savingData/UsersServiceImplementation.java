package com.BumblebeeDatabase.BumblebeeDatabase.savingData;

import com.BumblebeeDatabase.BumblebeeDatabase.model.Users;
import com.BumblebeeDatabase.BumblebeeDatabase.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImplementation implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    // Sauvegarder des user dans la database
    public Users saveUsers(Users user) {
        return usersRepository.save(user);
    }

    @Override
    // Récupérer les Users de la database
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

}
