package com.keremburak.Abstract;

import com.keremburak.Entities.Campaign;
import com.keremburak.Entities.Game;
import com.keremburak.Entities.Player;

public interface StoreService {
    void buy(Player player, Game game);
    void buy(Player player, Game game, Campaign campaign);
}
