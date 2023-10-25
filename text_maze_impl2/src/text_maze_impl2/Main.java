package text_maze_impl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.schrodingdong.text_maze_game.gameEntity.Balcony;
import com.schrodingdong.text_maze_game.gameEntity.Bedroom;
import com.schrodingdong.text_maze_game.gameEntity.Corridor;
import com.schrodingdong.text_maze_game.gameEntity.GameEntityFactory;
import com.schrodingdong.text_maze_game.gameEntity.Hall;
import com.schrodingdong.text_maze_game.gameEntity.Kitchen;
import com.schrodingdong.text_maze_game.gameEntity.LivingRoom;
import com.schrodingdong.text_maze_game.gameEntity.Player;
import com.schrodingdong.text_maze_game.gameEntity.Room;
import com.schrodingdong.text_maze_game.gameEntity.impl.GameEntityFactoryImpl;
import com.schrodingdong.text_maze_game.gameLogic.Game;
import com.schrodingdong.text_maze_game.gameLogic.GameLogicFactory;
import com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicFactoryImpl;

public class Main {

	public static void main(String[] args) {
		// initialize the factories & variables
		GameEntityFactory gameEntityFactory = GameEntityFactoryImpl.eINSTANCE;
		GameLogicFactory gameLogicFactory = GameLogicFactoryImpl.eINSTANCE;
		List<Room> houseRooms = new ArrayList<Room>();
		
		// instantiate the rooms
		Hall hall = gameEntityFactory.createHall();
		hall.setExit(true);
		Bedroom bedroom = gameEntityFactory.createBedroom();
		Balcony balcony = gameEntityFactory.createBalcony();
		LivingRoom livingRoom = gameEntityFactory.createLivingRoom();
		Corridor corridor = gameEntityFactory.createCorridor();
		Kitchen kitchen = gameEntityFactory.createKitchen();
		// create links
		hall.getNeighbooringRooms().addAll(Arrays.asList(kitchen, livingRoom, corridor));
		livingRoom.getNeighbooringRooms().addAll(Arrays.asList(hall, corridor));
		corridor.getNeighbooringRooms().addAll(Arrays.asList(livingRoom, bedroom, hall));
		bedroom.getNeighbooringRooms().add(corridor);
		kitchen.getNeighbooringRooms().addAll(Arrays.asList(hall, balcony));
		balcony.getNeighbooringRooms().add(kitchen);
		// put objects
		balcony.getItems().add(gameEntityFactory.createKey());
		// create the house
		houseRooms.add(hall);
		houseRooms.add(bedroom);
		houseRooms.add(livingRoom);
		houseRooms.add(corridor);
		houseRooms.add(kitchen);
		
		// instantiate player
		Player player = gameEntityFactory.createPlayer();
		
		// Initialize Game
		Game game = gameLogicFactory.createGame();
		game.init(player, bedroom, houseRooms);
		game.startGame();
	}

}
