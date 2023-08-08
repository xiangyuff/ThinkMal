package com.nk.thinkmal.sys.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
public class Searchani implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String episodes;

    private String status;

    private String theme;

    private String audiences;

    private String genres;

    private String type;

    private String favorites;

    private String popularity;

    private String anirank;

    private String score;

    private String members;

    private String aired;

    private String duration;

    private String premiered;

    private String studio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    public String getAudiences() {
        return audiences;
    }

    public void setAudiences(String audiences) {
        this.audiences = audiences;
    }
    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }
    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }
    public String getAnirank() {
        return anirank;
    }

    public void setAnirank(String anirank) {
        this.anirank = anirank;
    }
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }
    public String getAired() {
        return aired;
    }

    public void setAired(String aired) {
        this.aired = aired;
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }
    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Searchani{" +
            "id=" + id +
            ", title=" + title +
            ", episodes=" + episodes +
            ", status=" + status +
            ", theme=" + theme +
            ", audiences=" + audiences +
            ", genres=" + genres +
            ", type=" + type +
            ", favorites=" + favorites +
            ", popularity=" + popularity +
            ", anirank=" + anirank +
            ", score=" + score +
            ", members=" + members +
            ", aired=" + aired +
            ", duration=" + duration +
            ", premiered=" + premiered +
            ", studio=" + studio +
        "}";
    }
}
