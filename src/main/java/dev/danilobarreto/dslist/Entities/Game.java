package dev.danilobarreto.dslist.Entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private int year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game(){

    }

    public Game(Long id, String title, int year, String genre, String platform, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatform() {
        return platform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return year == game.year && Objects.equals(id, game.id) && Objects.equals(title, game.title) && Objects.equals(genre, game.genre) && Objects.equals(platform, game.platform) && Objects.equals(imgUrl, game.imgUrl) && Objects.equals(shortDescription, game.shortDescription) && Objects.equals(longDescription, game.longDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year, genre, platform, imgUrl, shortDescription, longDescription);
    }
}
