package com.musicplayer;

import java.util.Scanner;

public class MenuDrivenApplication {
  static public void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  MusicPlayer mp=new MusicPlayer();
	  while(true) {
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
	  
	  int choice =sc.nextInt();
	  switch(choice) {
	  case 1:
          System.out.print("Enter Song ID, Title, Artist, Duration: ");
          int songId = sc.nextInt();
          sc.nextLine();
          String title = sc.nextLine();
          String artist = sc.nextLine();
          double duration = sc.nextInt();
          mp.addSong(new SongClass(songId, title, artist, duration));
          break;

      case 2:
          System.out.print("Enter existing song title to update: ");
          String existingTitle = sc.nextLine();
          System.out.print("Enter new ID, Title, Artist, Duration: ");
          int nsongId = sc.nextInt();
          sc.nextLine();
          String ntitle = sc.nextLine();
          String nartist = sc.nextLine();
          double nduration = sc.nextDouble();
          mp.updateSong(existingTitle, new SongClass(nsongId, ntitle, nartist, nduration));
          break;

      case 3:
          System.out.print("Enter song title to delete: ");
          String deleteTitle = sc.nextLine();
          mp.deleteSong(deleteTitle);
          break;

      case 4:
          mp.displayAllSongs();
          break;

      case 5:
          System.out.print("Enter playlist name: ");
          String playlistName = sc.nextLine();
          mp.createPlaylist(playlistName);
          break;

      case 6:
          System.out.print("Enter playlist name: ");
          String plName = sc.nextLine();
          System.out.print("Enter song title to add: ");
          String sTitle = sc.nextLine();
          SongClass found =   mp.getAllSongs().stream()
        		  .filter(s -> s.getTitle().equalsIgnoreCase(sTitle)).findFirst().orElse(null);
          if (found != null)
            mp.addSongToPlaylist(plName, found);
          else
              System.out.println("Song not found.");
         break;

      case 7:
          mp.displayAllPlaylists();
          break;

      case 8:        System.out.print("Enter playlist name: ");
          String pname = sc.nextLine();
          Playlist pl = mp.getPlaylist(pname);
          if (pl != null) pl.displaySongs();
          else System.out.println("Playlist not found.");
          break;

      case 9:
          System.out.print("Enter playlist name: ");
          String pln = sc.nextLine();
          System.out.print("Enter song title to play: ");
          String playTitle = sc.nextLine();
          Playlist plplay = mp.getPlaylist(pln);
          if (plplay != null) plplay.play(playTitle);
          break;

      case 10:
          System.out.print("Enter playlist name: ");
          String plp = sc.nextLine();
          System.out.print("Enter song title to pause: ");
          String pauseTitle = sc.nextLine();
          Playlist plpause = mp.getPlaylist(plp);
          if (plpause != null) plpause.pause(pauseTitle);
          break;

      case 11:
          System.out.print("Enter playlist name: ");
          String pls = sc.nextLine();
          System.out.print("Enter song title to stop: ");
          String stopTitle = sc.nextLine();
          Playlist plstop = mp.getPlaylist(pls);
          if (plstop != null) plstop.stop(stopTitle);
          break;

      case 12:
          System.out.println("Exiting Music Player.");
          System.exit(0);
          break;

      default:
          System.out.println("Invalid choice.");
  }
}
}

	  
	  
	  
      



	  





	  
  }


