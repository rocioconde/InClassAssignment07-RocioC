package com.example.android.inclassassignment07_rocioc;

/**
 * Created by ccteuser on 3/20/17.
 */

public class Movie {

    private String name;
    private int releaseDate;
    private boolean wonBestMovieOscar;

    public Movie() {
    }

    public Movie(String name, int releaseDate, boolean wonBestMovieOscar) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.wonBestMovieOscar = wonBestMovieOscar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isWonBestMovieOscar() {
        return wonBestMovieOscar;
    }

    public void setWonBestMovieOscar(boolean wonBestMovieOscar) {
        this.wonBestMovieOscar = wonBestMovieOscar;
    }
}
