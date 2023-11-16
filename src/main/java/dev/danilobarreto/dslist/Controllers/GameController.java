package dev.danilobarreto.dslist.Controllers;

import dev.danilobarreto.dslist.Dto.GameMinDTO;
import dev.danilobarreto.dslist.Entities.Game;
import dev.danilobarreto.dslist.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "games")
public class GameController {
    @Autowired
    public GameService gameService;

    @GetMapping()
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
