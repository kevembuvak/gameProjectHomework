package com.keremburak.Concrete;

import com.keremburak.Abstract.StoreService;
import com.keremburak.Entities.Campaign;
import com.keremburak.Entities.Game;
import com.keremburak.Entities.Player;

public class StoreManager implements StoreService {
    @Override
    public void buy(Player player, Game game) {
        System.out.println("Game called \" " + game.getName() + "\" is purchased by: " + player.getFirstName() + " " + player.getLastName() );
        player.setBalance(player.getBalance() - game.getPrice());
    }

    @Override
    public void buy(Player player, Game game, Campaign campaign) {
        System.out.println("Game called \" " + game.getName() + "\" is purchased by: " + player.getFirstName() + " " + player.getLastName() );
        player.setBalance(player.getBalance() - (game.getPrice()*(100 - campaign.getPercentOfDiscount()) / 100));
    }
}
