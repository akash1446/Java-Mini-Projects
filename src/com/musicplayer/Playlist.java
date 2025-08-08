package com.musicplayer;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Playable {
    int playlistId;
    String playlistName;
    List<SongClass> songs;

    public Playlist(int playlistId, String playlistName) {
        this.playlistId = playlistId;
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }

    public void addSong(SongClass song) {
        songs.add(song);
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    public void removeSong(int songId) {
        songs.removeIf(song -> song.getSongId() == songId);
    }

    public void displaySongs() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            songs.forEach(System.out::println);
        }
    }

    @Override
    public void play(String title) {
        songs.stream()
            .filter(song -> song.getTitle().equalsIgnoreCase(title))
            .findFirst()
            .ifPresentOrElse(song -> System.out.println("Playing: " + song),
                             () -> System.out.println("Song not found."));
    }

    @Override
    public void play(int songId) {
        songs.stream()
            .filter(song -> song.getSongId() == songId)
            .findFirst()
            .ifPresentOrElse(song -> System.out.println("Playing: " + song),
                             () -> System.out.println("Song not found."));
    }

    @Override
    public void pause(String title) {
        System.out.println("Paused song: " + title);
    }

    @Override
    public void pause(int songId) {
        System.out.println("Paused song ID: " + songId);
    }

    @Override
    public void stop(String title) {
        System.out.println("Stopped song: " + title);
    }

    @Override
    public void stop(int songId) {
        System.out.println("Stopped song ID: " + songId);
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public int getPlaylistId() {
        return playlistId;
    }
}

