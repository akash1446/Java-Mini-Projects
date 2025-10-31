package com.musicplayer.main;

import java.util.Scanner;

import com.musicplayer.model.Songs;
import com.musicplayer.service.MusicPlayer;

public class MenuDrivenApplication {
	private static final Scanner sc = new Scanner(System.in);
	
	public static void Menu() {
		 System.out.println("===========MUSIC PLAYER MENU==============");
		  System.out.println("1.Add New Song");
		  System.out.println("2.Update Existing Song");
		  System.out.println("3.Delete Song");
		  System.out.println("4.Display All Songs");
	      System.out.println("5.Create New Playlist");
		  System.out.println("6.Add Song to Playlist");
		  System.out.println("7.Display All Playlist");
		  System.out.println("8.Display Songs in Playlist");
		  System.out.println("9.Play Song in Playlist ");
		  System.out.println("10.Pause Song in PlayList");
		  System.out.println("11.Stop Song in Playlist ");
		  System.out.println("12.Exit");
		  System.out.println("Enter your choice:");
	}
	
   public  static void main(String[] args) {
	   MusicPlayer mp = new MusicPlayer();
	  while(true) {
	   Menu();
	  int choice =sc.nextInt();
	  sc.nextLine();
	  switch(choice) {
	  case 1: //Add a song
          System.out.print("Enter Song title: ");
          String title = sc.nextLine();
          System.out.println();
          System.out.print("Enter Song artist: ");
          String artist = sc.nextLine();
          System.out.println();
          System.out.print("Enter Song duration: ");
          double duration = sc.nextDouble();
          System.out.println();
          mp.addSong(title, artist, duration);
          break;

      case 2: //update a song
          System.out.print("Enter existing song title to update: ");
          String existingTitle = sc.nextLine();
          System.out.print("Enter new title: ");
          String newTitle = sc.nextLine();
          System.out.println("Enter new artist: ");
          String newArtist = sc.nextLine();
          System.out.println("Enter new duration: ");
          double newDuration = sc.nextDouble();
          sc.nextLine();
          Songs song = new Songs(0, newTitle, newArtist, newDuration);
          mp.updateSong(song, existingTitle);
          break;

      case 3: // delete song
          System.out.print("Enter song title to delete: ");
          String title1 = sc.nextLine();
          mp.deleteSong(title1);
          break;

      case 4: // display songs
          mp.displayAllSongs();
          break;

      case 5: //create playlist
          System.out.print("Enter playlist name: ");
          String playlistName = sc.nextLine();
          mp.createPlaylist(playlistName);
          break;

      case 6: // Add song  a playlist
          System.out.print("Enter playlist name: ");
          String playlistNameToAdd = sc.nextLine();
          System.out.print("Enter song title: ");
          String stitle = sc.nextLine();
          mp.addSongToPlaylist(playlistNameToAdd, stitle);

      case 7: // display All playlist
          mp.displayAllPlaylists();
          break;

      case 8:  // display Songs in playlist 
    	  System.out.print("Enter playlist name: ");
          String pname = sc.nextLine();
          mp.displaySongsPlayList(pname);
          break;

      case 9://
          System.out.print("Enter playlist name: ");
          String playlist = sc.nextLine();
          System.out.println("Enter  the song:");
          String title2 = sc.nextLine();
          mp.playInPlaylist(playlist,title2);
          break;
     case 10://
    	 System.out.print("Enter playlist name: ");
         String playlists = sc.nextLine();
         System.out.println("Enter  the song");
         String title3 = sc.nextLine();
         mp.pauseInPlaylist(playlists,title3);
         break;

      case 11://
    	  System.out.print("Enter playlist name: ");
          String playlis = sc.nextLine();
          System.out.println("Enter  the song");
          String title5 = sc.nextLine();
          mp.stopInPlaylist(playlis,title5);
          break;

      case 12:// Exit
          System.out.println("Exiting Music Player.");
          System.exit(0);
          break;

      default:
          System.out.println("Invalid choice.");
  }
}
}

	  
	  
	  
      



	  





	  
  }


