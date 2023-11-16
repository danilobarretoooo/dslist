package dev.danilobarreto.dslist.Services;

import dev.danilobarreto.dslist.Dto.GameMinDTO;
import dev.danilobarreto.dslist.Entities.Game;
import dev.danilobarreto.dslist.Repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
