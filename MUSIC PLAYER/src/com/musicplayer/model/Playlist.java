package com.musicplayer.model;
import java.util.ArrayList;
import java.util.List;

import com.musicplayer.contract.Playable;

public class Playlist implements Playable {
	
     private int playlistId;
     
     private String playlistName;
     
     List<Songs> songs = new ArrayList<>();
     
     private  Songs currentlyPlaying = null;
     
     private  boolean pause = false;
     
    public Playlist(int playlistId, String playlistName, List<Songs> songs) {
		super();
		this.playlistId = playlistId;
		this.playlistName = playlistName;
		this.songs = songs;
	}
    
	public Playlist(int playlistId, String playlistName) {
		super();
		this.playlistId = playlistId;
		this.playlistName = playlistName;
	}

	public int getPlaylistId() {
		return playlistId;
	}



	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}



	public String getPlaylistName() {
		return playlistName;
	}



	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}
	public  List<Songs> getSongs() {
		return songs;
	}
	public void setSongs(List<Songs> songs) {
		this.songs = songs;
	}
	

    @Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", playlistName=" + playlistName + ", songs=" + songs
				+ ", currentlyPlaying=" + currentlyPlaying + ", pause=" + pause + "]";
	}

	public void displaySongs() {
        System.out.println("Songs in playlist are: ");
        for(Songs  song : songs) {
        	System.out.println(song);
        }
    }
     

    @Override
    public void play(String title) {
    	 Songs songObj = null;
         for(Songs song:songs) {
      	   if(song.getTitle()!=null && song.getTitle().equalsIgnoreCase(title)) {
      		   songObj = song;
      		   break;
      	   }
             
       }
       if(songObj != null) {
    	   currentlyPlaying = songObj;
    	   System.out.println(songObj+"is playing");
    	 }
       else {
    	   System.out.println("Song not in My Playlist");
       }
    }

    @Override
    public void play(int songId) {
//    	 Songs songObj = null;
//         for(Songs song:songs) {
//      	   if(song.getSongId()!=null&&song.getSongId().equalsIgnoreCase(songId)) {
//      		   songObj = song;
//      		   break;
//      	   }
//      	 if(songObj != null) {
//      	   currentlyPlaying = songObj;
//      	   System.out.println(songObj+"is playing");
//      	 }
//         else {
//      	   System.out.println("Song not in My Playlist");
//         }
//      }  
    }

    @Override
    public void pause(String title) {
    	if(currentlyPlaying !=null && currentlyPlaying.getTitle().equals(title)) {
    		if(!pause) {
    			pause = true;
    	        System.out.println("Paused song: " + title);
    		}
    		else {
        		System.out.println("Already paused song");
        	}
    }
    	
    }
    @Override
    public void pause(int songId) {
        System.out.println("Paused song ID: " + songId);
    }

    @Override
    public void stop(String title) {
       if(currentlyPlaying != null && currentlyPlaying.getTitle().equalsIgnoreCase(title)) {
    	   System.out.println("Song is stopped!");
    	   currentlyPlaying = null;
    	   pause = false;
       }
    }

    @Override
    public void stop(int songId) {
        System.out.println("Stopped song ID: " + songId);
    }

    
}

