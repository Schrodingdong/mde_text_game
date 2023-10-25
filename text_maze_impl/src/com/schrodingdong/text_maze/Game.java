package com.schrodingdong.text_maze;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.schrodingdong.text_maze_game.gameEntity.Item;
import com.schrodingdong.text_maze_game.gameEntity.Player;
import com.schrodingdong.text_maze_game.gameEntity.Room;

public class Game {
	private final List<Room> houseRooms = new ArrayList<>();
	private Player player = null;
	private final Scanner scanner = new Scanner(System.in);
		

	public void createHouse(Collection<Room> rooms) {
		// add rooms 
		for(Room r : rooms) {
			houseRooms.add(r);
		}
	}
	public void initPlayer(Player p, Room starterRoom) {
		player = p;
		p.setCurrRoom(starterRoom);
	}
	public void init(Player p, Room starterRoom, Collection<Room> rooms) {
		createHouse(rooms);
		initPlayer(p, starterRoom);
	}
	
	public void start() {
		if(player == null || houseRooms.isEmpty()) return;
		boolean gameFlag = true;
		System.out.println("> Start the Game - press 0 to exit");
		System.out.println("=================================================");
		while(gameFlag) {
			System.out.println(player.getCurrRoom().roomLocationInfo());
			System.out.println("What do you want to do ?");
			System.out.println("\t 1- Check room for items");
			System.out.println("\t 2- Navigate to the next rooms");
			if(player.getCurrRoom().isExit())
				System.out.println("\t 3- Exit");
			try{
				int choice = scanner.nextInt();
				switch (choice) {
				case 1: {
					checkRoomForItems();
					break;
				}
				case 2: {
					navigateNextRoom();
					break;
				}
				case 3:{
					gameFlag = exit(gameFlag);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
			} catch(InputMismatchException e) {
				System.out.println("wrong input...");
				scanner.nextLine();
			}
		}
	}

	private boolean exit(boolean gameFlag) {
		if(player.getCurrRoom().isExit()) {
			if(player.getKey() != null) {
				System.out.println("Got out safely");
				gameFlag = false;
			} else {
				System.out.println("No key in possession...");
			}
		}
		return gameFlag;
	}
	
	public void checkRoomForItems() {
		if(player.getCurrRoom().getItems().isEmpty()) {
			System.out.println("Nothing here...");
			return;
		}
		
		// List them
		System.out.println("You picked the following items in this room : ");
		for(Item i : player.getCurrRoom().getItems()) {
			System.out.println("\t- " + i.getName()+"\n");
		}
		// pick them up
		player.pickItems();
	}
	
	public void navigateNextRoom() {
		Map<Integer, Room> roomMap = player.getNeighbooringRoomMap();
		System.out.println("Neighbooring rooms :");
		for(Entry<Integer, Room> e : roomMap.entrySet()) {
			System.out.println("\t" + e.getKey()+ "- "+e.getValue().getName());
		}
		
		System.out.println("Which room (index) you want to go to ?");
		try {
			int roomIndex = scanner.nextInt();
			Room nextRoom = null;
			for(Entry<Integer, Room> e : roomMap.entrySet()) {
				if(e.getKey() == roomIndex) {
					nextRoom = e.getValue();
					break;
				}
			}
			if(nextRoom == null) {
				System.out.println("Can't Do this sowwy >.<");
			} else {
				player.move(nextRoom);
			}
		} catch(InputMismatchException e) {
			System.out.println("wrong input ...");
			scanner.nextLine();
		}
	}
	

}
