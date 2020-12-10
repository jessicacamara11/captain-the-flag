package org.academiadecodigo.gnunas.captaindrink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class GameController {

    private Game game;

    @Autowired
    public GameController(Game game) {
        this.game = game;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public String getHomePage(Model model) {

        return "homePage";
    }

    @RequestMapping(method = RequestMethod.GET, path = "newPlayer")
    public String getPlayerForm(Model model) {

        Player player = new Player();
        model.addAttribute("player", player);

        return "playerForm";
    }

    @RequestMapping(method = RequestMethod.POST, path = "newPlayer")
    public String newPlayer(@ModelAttribute("player") Player player) {

        game.addPlayer(player);



    }

}
