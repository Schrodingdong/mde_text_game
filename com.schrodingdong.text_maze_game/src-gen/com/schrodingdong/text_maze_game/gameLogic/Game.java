/**
 */
package com.schrodingdong.text_maze_game.gameLogic;

import com.schrodingdong.text_maze_game.gameEntity.Player;
import com.schrodingdong.text_maze_game.gameEntity.Room;

import java.util.Collection;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.Game#getAction <em>Action</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.Game#getPlayer <em>Player</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.Game#getHouseRooms <em>House Rooms</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.Game#getScanner <em>Scanner</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.Game#isGameFlag <em>Game Flag</em>}</li>
 * </ul>
 *
 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link com.schrodingdong.text_maze_game.gameLogic.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage#getGame_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage#getGame_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameLogic.Game#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>House Rooms</b></em>' reference list.
	 * The list contents are of type {@link com.schrodingdong.text_maze_game.gameEntity.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Rooms</em>' reference list.
	 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage#getGame_HouseRooms()
	 * @model
	 * @generated
	 */
	EList<Room> getHouseRooms();

	/**
	 * Returns the value of the '<em><b>Scanner</b></em>' attribute.
	 * The default value is <code>"new Scanner(System.in)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scanner</em>' attribute.
	 * @see #setScanner(Scanner)
	 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage#getGame_Scanner()
	 * @model default="new Scanner(System.in)" dataType="com.schrodingdong.text_maze_game.gameLogic.Scanner"
	 * @generated
	 */
	Scanner getScanner();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameLogic.Game#getScanner <em>Scanner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scanner</em>' attribute.
	 * @see #getScanner()
	 * @generated
	 */
	void setScanner(Scanner value);

	/**
	 * Returns the value of the '<em><b>Game Flag</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Flag</em>' attribute.
	 * @see #setGameFlag(boolean)
	 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage#getGame_GameFlag()
	 * @model default="true"
	 * @generated
	 */
	boolean isGameFlag();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameLogic.Game#isGameFlag <em>Game Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Flag</em>' attribute.
	 * @see #isGameFlag()
	 * @generated
	 */
	void setGameFlag(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startGame();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomsDataType="com.schrodingdong.text_maze_game.gameLogic.collection"
	 * @generated
	 */
	void init(Player p, Room startRoom, Collection<Room> rooms);

} // Game
