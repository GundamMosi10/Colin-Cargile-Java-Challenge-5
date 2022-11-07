package com.m5challenge.gamestoreinvoicing.util.feign;

import com.m5challenge.gamestoreinvoicing.model.Console;
import com.m5challenge.gamestoreinvoicing.model.Game;
import com.m5challenge.gamestoreinvoicing.model.TShirt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "gamestore-catalog")
public interface GameStoreClient {

    //Console
    @RequestMapping(value = "/console", method = RequestMethod.GET)
    public List<Console> getAllConsoles();

    @RequestMapping(value = "/console/{id}", method = RequestMethod.GET)
    public Console getConsole(@PathVariable long consoleId);

//    @RequestMapping(value = "/console/{id}", method = RequestMethod.GET)
//    public Console findConsoleById(@PathVariable long consoleId);
//
//    @RequestMapping(value = "/console", method = RequestMethod.POST)
//    public Console createConsole();
//
//    @RequestMapping(value = "/console/{id}", method = RequestMethod.PUT)
//    public Console updateConsole();
//
//    @RequestMapping(value = "/console/{id}", method = RequestMethod.DELETE)
//    public Console deleteConsole();

    //Game
//    @RequestMapping(value = "/game", method = RequestMethod.POST)
//    public Game createGame();
//
//    @RequestMapping(value = "/game", method = RequestMethod.GET)
//    public List<Game> getAllGames();

    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
    public Game getGameInfo(@PathVariable long gameId);

//    @RequestMapping(value = "/game/{id}", method = RequestMethod.PUT)
//    public Game updateGame();
//
//    @RequestMapping(value = "/game/{id}", method = RequestMethod.DELETE)
//    public Game deleteGame();
//
//    @RequestMapping(value = "/game/title/{title}", method = RequestMethod.GET)
//    public List<Game> getGamesByTitle(@PathVariable String title);
//
//    @RequestMapping(value = "/game/esrbrating/{esrb}", method = RequestMethod.GET)
//    public List<Game> getGamesByEsrbRating(@PathVariable String esrb);
//
//    @RequestMapping(value = "/game/studio/{studio}", method = RequestMethod.GET)
//    public List<Game> getGamesByStudio(@PathVariable String studio);
//
//    //TShirt
//    @RequestMapping(value = "/tshirt", method = RequestMethod.GET)
//    public List<TShirt> getAllTShirts();

    @RequestMapping(value = "/tshirt/{id}", method = RequestMethod.GET)
    public TShirt getTShirt(@PathVariable long tShirtId);

    @RequestMapping(value = "/tshirt", method = RequestMethod.POST)
    public TShirt createTShirt(TShirt tShirt);
//
//    @RequestMapping(value = "/tshirt/{id}", method = RequestMethod.PUT)
//    public TShirt updateTShirt();
//
//    @RequestMapping(value = "/tshirt/{id}", method = RequestMethod.DELETE)
//    public TShirt deleteTShirt();
//
//    @RequestMapping(value = "/tshirt/color/{color}", method = RequestMethod.GET)
//    public List<TShirt> getTShirtsByColor(@PathVariable String color);
//
//    @RequestMapping(value = "/tshirt/size/{size}", method = RequestMethod.GET)
//    public List<TShirt> getTShirtsBySize(@PathVariable String size);
}
