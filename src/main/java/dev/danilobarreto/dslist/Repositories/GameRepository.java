package dev.danilobarreto.dslist.Repositories;

import dev.danilobarreto.dslist.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
