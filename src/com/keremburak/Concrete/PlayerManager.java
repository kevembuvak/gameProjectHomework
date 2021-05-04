package com.keremburak.Concrete;

import com.keremburak.Abstract.PlayerCheckService;
import com.keremburak.Abstract.PlayerService;
import com.keremburak.Entities.Player;

public class PlayerManager implements PlayerService {

    PlayerCheckService checkService;

    private PlayerManager(PlayerCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void signUp(Player player) {
        checkService.checkIfRealPerson(player);
    }

    @Override
    public void deleteAccount(Player player) {

    }

    @Override
    public void updateAccount(Player player) {
        checkService.checkIfRealPerson(player);
    }
}
