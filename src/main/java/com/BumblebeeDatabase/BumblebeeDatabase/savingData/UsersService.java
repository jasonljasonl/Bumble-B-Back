package com.BumblebeeDatabase.BumblebeeDatabase.savingData;

import com.BumblebeeDatabase.BumblebeeDatabase.model.Users;

import java.util.List;

public interface UsersService {

    public Users saveUsers(Users users);
    public List<Users> getAllUsers();


}
