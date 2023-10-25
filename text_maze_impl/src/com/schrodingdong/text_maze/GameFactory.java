package com.schrodingdong.text_maze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.schrodingdong.text_maze_game.gameEntity.Balcony;
import com.schrodingdong.text_maze_game.gameEntity.Bedroom;
import com.schrodingdong.text_maze_game.gameEntity.Corridor;
import com.schrodingdong.text_maze_game.gameEntity.Hall;
import com.schrodingdong.text_maze_game.gameEntity.Kitchen;
import com.schrodingdong.text_maze_game.gameEntity.LivingRoom;
import com.schrodingdong.text_maze_game.gameEntity.Player;
import com.schrodingdong.text_maze_game.gameEntity.Room;
import com.schrodingdong.text_maze_game.gameEntity.GameEntityFactory;
import com.schrodingdong.text_maze_game.gameEntity.impl.GameEntityFactoryImpl;

public class GameFactory {
	public static Game createGame() {
		GameEntityFactory factory = GameEntityFactoryImpl.eINSTANCE;
		List<Room> houseRooms = new ArrayList<Room>();
		Game game = new Game();
		
		// instantiate the rooms
		Hall hall = factory.createHall();
		hall.setExit(true);
		Bedroom bedroom = factory.createBedroom();
		Balcony balcony = factory.createBalcony();
		LivingRoom livingRoom = factory.createLivingRoom();
		Corridor corridor = factory.createCorridor();
		Kitchen kitchen = factory.createKitchen();
		
		// create links
		hall.getNeighbooringRooms().addAll(Arrays.asList(kitchen, livingRoom, corridor));
		livingRoom.getNeighbooringRooms().addAll(Arrays.asList(hall, corridor));
		corridor.getNeighbooringRooms().addAll(Arrays.asList(livingRoom, bedroom, hall));
		bedroom.getNeighbooringRooms().add(corridor);
		kitchen.getNeighbooringRooms().addAll(Arrays.asList(hall, balcony));
		balcony.getNeighbooringRooms().add(kitchen);
		
		// put objects
		balcony.getItems().add(factory.createKey());
		
		// create the house
		houseRooms.add(hall);
		houseRooms.add(bedroom);
		houseRooms.add(livingRoom);
		houseRooms.add(corridor);
		houseRooms.add(kitchen);
		game.createHouse(houseRooms);
		
		// instantiate player
		Player player = factory.createPlayer();
		game.initPlayer(player, bedroom);
		
		
		return game;
	}
}
