package com.keremburak.Abstract;

import com.keremburak.Entities.Player;

public interface PlayerService {
    void signUp(Player player);
    void deleteAccount(Player player);
    void updateAccount(Player player);
}
