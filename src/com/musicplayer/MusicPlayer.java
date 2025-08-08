package com.musicplayer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MusicPlayer {
	List<SongClass>allSongs=new ArrayList<>();
	List<Playlist>playlists=new ArrayList<>();

    public void addSong(SongClass song) {
        allSongs.add(song);
    }

    public void updateSong(String title, SongClass updatedSong) {
        for (int i = 0; i < allSongs.size(); i++) {
            if (allSongs.get(i).getTitle().equalsIgnoreCase(title)) {
                allSongs.set(i, updatedSong);
                return;
            }
        }
    }

    public void deleteSong(String title) {
        allSongs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    public void displayAllSongs() {
        if (allSongs.isEmpty()) {
            System.out.println("No songs available.");
        } else {
            allSongs.forEach(System.out::println);
        }
    }

    public void createPlaylist(String name) {
        playlists.add(new Playlist(playlists.size() + 1, name));
    }

    public void addSongToPlaylist(String playlistName, SongClass song) {
        for (Playlist playlist : playlists) {
            if (playlist.getPlaylistName().equalsIgnoreCase(playlistName)) {
                playlist.addSong(song);
                break;
            }
        }
    }

    public void deletePlaylist(String playlistName) {
        playlists.removeIf(p -> p.getPlaylistName().equalsIgnoreCase(playlistName));
    }

    public void displayAllPlaylists() {
        playlists.forEach(p -> System.out.println(p.getPlaylistId() + ": " + p.getPlaylistName()));
    }

    public Playlist getPlaylist(String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getPlaylistName().equalsIgnoreCase(playlistName)) {
                return playlist;
            }
        }
        return null;
    }

    public void playPlaylist(String playlistName) {
        Playlist p = getPlaylist(playlistName);
        if (p != null) {
            p.displaySongs();
        } else {
            System.out.println("Playlist not found.");
        }
    }


	public List<SongClass> getAllSongs() {
		// TODO Auto-generated method stub
		return allSongs;
	}
    
}



