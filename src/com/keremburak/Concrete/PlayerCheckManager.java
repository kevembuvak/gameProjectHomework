package com.keremburak.Concrete;

import com.keremburak.Abstract.PlayerCheckService;
import com.keremburak.Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        return true;
    }
}
