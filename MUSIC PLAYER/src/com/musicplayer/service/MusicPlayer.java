package com.musicplayer.service;

import java.util.ArrayList;
import java.util.List;

import com.musicplayer.model.Playlist;
import com.musicplayer.model.Songs;

public class MusicPlayer {
	
	private final  List<Songs> allsongs = new ArrayList<>();
	
	private final List<Playlist> playlists = new ArrayList<>();
	
	private int songIdCounter = 1;
	
	private int playlistCounter = 1;

    public Songs addSong(String title, String artist,double duration) {
        Songs song = new Songs(songIdCounter++, title, artist, duration);
        allsongs.add(song);
        System.out.println("added of the song:" +song);
        return song;
    }

    public void updateSong(Songs song, String existingTitle) {
    	Songs existed = null;
    	 for(Songs songs:allsongs) {
      		if(songs.getTitle()!=null && songs.getTitle().equalsIgnoreCase(existingTitle)) {
      			existed = songs;
      			break;
      		}
      	}
    	 if(existed == null) {
    		 System.out.println("Songs not found");
    	 }
    	 else {
    		  existed.setTitle(song.getTitle());
    		  existed.setArtist(song.getArtist());
    		  existed.setDuration(song.getDuration());
    		  System.out.println("song is updated !"+existed);
    	 }

    }

    public void deleteSong(String title) {
    	     int flag=0;
        	 for(Songs song:allsongs) {
         		if(song.getTitle()!=null && song.getTitle().equalsIgnoreCase(title)) {
         			allsongs.remove(song);
         			System.out.println("song is deleted");
         			flag=1;
         			break;
         		}
         	}
      	   if(flag==0) {
      		   System.out.println("song Not found");
      	   }
        }
       
   public void displayAllSongs() {
      for(Songs song:allsongs) {
    	  System.out.println(song);
      }
    }

    public void createPlaylist(String playlistName) {
    	boolean isExisted = false;
        if(playlistName!=null) {
        	for(Playlist play:playlists) {
        		if(play.getPlaylistName().equalsIgnoreCase(playlistName)) {
        			isExisted = true;
        		}
        	}
        	if(isExisted) {
        		System.out.println("Already existed!");
        	}
        	else {
        		Playlist p = new  Playlist(playlistCounter++,playlistName);
        		playlists.add(p);
        		System.out.println("Created of the playlist"+p);
        	}
        }
    }

    public void addSongToPlaylist(String playlistName, String title) {
    	Playlist p = null;
        for (Playlist play : playlists) {
            if (play.getPlaylistName().equalsIgnoreCase(playlistName)) {
                p = play; 
            	
            }
        }
        Songs  s = null;
        for(Songs songs:allsongs) {
      		if(songs.getTitle()!=null && songs.getTitle().equalsIgnoreCase(title)) {
      			s = songs;
      			break;
      		}
        }
        p.getSongs().add(s);
        System.out.println("Added to song in playlist");
    }

          
 

    public void displayAllPlaylists() {
       for(Playlist playlist: playlists) {
    	   System.out.println(playlist);
       }
    }

    public void displaySongsPlayList(String pName) {
    	Playlist playlist= null;
        for (Playlist play : playlists) {
            if (play.getPlaylistName().equalsIgnoreCase(pName)) {
             playlist = play;
             break;
            }
        }
        playlist.displaySongs();
      
    }

    public Playlist playInPlaylist(String playlistName,String title) {
        Playlist playlist = null;
        for(Playlist play:playlists) {
        	if (play.getPlaylistName().equalsIgnoreCase(playlistName)) {
                playlist = play;
                break;
        }
        }
        playlist.play(title);
		return playlist;
    }
    public Playlist pauseInPlaylist(String playlistName,String title) {
    	Playlist playlist = null;
        for(Playlist play:playlists) {
        	if (play.getPlaylistName().equalsIgnoreCase(playlistName)) {
                playlist = play;
                break;
        }
        }
        playlist.pause(title);
		return playlist;
    }
    public Playlist stopInPlaylist(String playlistName,String title) {
    	Playlist playlist = null;
        for(Playlist play:playlists) {
        	if (play.getPlaylistName().equalsIgnoreCase(playlistName)) {
                playlist = play;
                break;
        }
        }
        playlist.play(title);
		return playlist;
    }

	public List<Songs> getAllSongs() {
		return allsongs;
	}

	
    
}



