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
@
public class GameController {

    private Game game;
    private ServletContext servletContext;

    @Autowired
    public GameController(Game game) {
        this.game = game;
    }

    @Autowired
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @RequestMapping(method = RequestMethod.POST, path = "")
    public ResponseEntity<?> newPlayer(@RequestBody Player player) {

        game.addPlayer(player);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Player>> listAllPlayers() {

        return new ResponseEntity<>(game.getAllPlayers(), HttpStatus.OK);
    }

    @GetMapping("/card")
    public Resource getCardImage() {

        String path = game.getRandomCard().getImgPath();
        return new ServletContextResource(servletContext, "/resources/" + path);
    }

    @GetMapping("/player")
    public ResponseEntity<Player> getRandomPlayer() {

        return new ResponseEntity<>(game.randomPlayer(), HttpStatus.OK);
    }



}
