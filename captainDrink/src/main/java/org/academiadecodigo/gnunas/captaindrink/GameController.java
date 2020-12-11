package org.academiadecodigo.gnunas.captaindrink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.ServletContextResource;

import javax.servlet.ServletContext;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class GameController {

    private Game game;
    private ServletContext servletContext;

    @Autowired
    public void setGame(Game game) {
        this.game = game;
    }

    @Autowired
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }


    @PostMapping("/new")
    public ResponseEntity<?> newPlayer(@RequestBody Player player) {
        System.out.println("Player:"+ player.getName());
        Player newPlayer = new Player();
        newPlayer.setName(player.getName());
        game.addPlayer(player);


        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Player>> listAllPlayers() {

        return new ResponseEntity<>(game.getAllPlayers(), HttpStatus.OK);
    }

    @GetMapping("/card")
    public ResponseEntity<Card> getCard() {


       return new ResponseEntity<>(game.getRandomCard(), HttpStatus.OK);
    }

    /*@GetMapping("/card")
    public Resource getCardImage() {

        String path = game.getRandomCard().getImgPath();
        return new ServletContextResource(servletContext, "/resources/image.png");
    }*/

    @GetMapping("/player")
    public ResponseEntity<Player> getRandomPlayer() {

        return new ResponseEntity<>(game.randomPlayer(), HttpStatus.OK);
    }



}
