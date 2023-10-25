/**
 */
package com.schrodingdong.text_maze_game.gameLogic.impl;

import com.schrodingdong.text_maze_game.gameEntity.Player;
import com.schrodingdong.text_maze_game.gameEntity.Room;

import com.schrodingdong.text_maze_game.gameLogic.Action;
import com.schrodingdong.text_maze_game.gameLogic.ExitCheck;
import com.schrodingdong.text_maze_game.gameLogic.Game;
import com.schrodingdong.text_maze_game.gameLogic.GameLogicFactory;
import com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage;
import com.schrodingdong.text_maze_game.gameLogic.ItemCheck;
import com.schrodingdong.text_maze_game.gameLogic.NavigationCheck;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.impl.GameImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.impl.GameImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.impl.GameImpl#getHouseRooms <em>House Rooms</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.impl.GameImpl#getScanner <em>Scanner</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.impl.GameImpl#isGameFlag <em>Game Flag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * The cached value of the '{@link #getHouseRooms() <em>House Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> houseRooms;

	/**
	 * The default value of the '{@link #getScanner() <em>Scanner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanner()
	 * @generated
	 * @ordered
	 */
	protected static final Scanner SCANNER_EDEFAULT = (Scanner) GameLogicFactory.eINSTANCE
			.createFromString(GameLogicPackage.eINSTANCE.getScanner(), "new Scanner(System.in)");

	/**
	 * The cached value of the '{@link #getScanner() <em>Scanner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanner()
	 * @generated
	 * @ordered
	 */
	protected Scanner scanner = SCANNER_EDEFAULT;

	/**
	 * The default value of the '{@link #isGameFlag() <em>Game Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGameFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GAME_FLAG_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGameFlag() <em>Game Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGameFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean gameFlag = GAME_FLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameLogicPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, GameLogicPackage.GAME__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject) player;
			player = (Player) eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameLogicPackage.GAME__PLAYER, oldPlayer,
							player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayer(Player newPlayer) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameLogicPackage.GAME__PLAYER, oldPlayer, player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Room> getHouseRooms() {
		if (houseRooms == null) {
			houseRooms = new EObjectResolvingEList<Room>(Room.class, this, GameLogicPackage.GAME__HOUSE_ROOMS);
		}
		return houseRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scanner getScanner() {
		return scanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanner(Scanner newScanner) {
		Scanner oldScanner = scanner;
		scanner = newScanner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameLogicPackage.GAME__SCANNER, oldScanner, scanner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGameFlag() {
		return gameFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameFlag(boolean newGameFlag) {
		boolean oldGameFlag = gameFlag;
		gameFlag = newGameFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameLogicPackage.GAME__GAME_FLAG, oldGameFlag,
					gameFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void startGame() {
		if (player == null || houseRooms.isEmpty())
			return;
		scanner = new Scanner(System.in);
		System.out.println("> Start the Game - press 0 to exit");
		System.out.println("=================================================");
		while (gameFlag) {
			System.out.println(player.getCurrRoom().roomLocationInfo());
			System.out.println("What do you want to do ?");
			int idx = 1;
			Map<Integer, Action> choiceMap = new HashMap<>();
			for (Action a : action) {
				if (a instanceof ItemCheck) {
					System.out.println("\t " + (idx++) + "- Check room for items");
				} else if (a instanceof NavigationCheck) {
					System.out.println("\t " + (idx++) + "- Navigate to the next rooms");
				} else if (a instanceof ExitCheck) {
					System.out.println("\t " + (idx++) + "- Exit");
				}
				choiceMap.put(idx, a);
			}
			try {
				int choice = scanner.nextInt();
				for (Entry<Integer, Action> e : choiceMap.entrySet()) {
					if (choice == e.getKey())
						e.getValue().doAction(scanner);
				}
			} catch (InputMismatchException e) {
				System.out.println("wrong input...");
				scanner.nextLine();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void init(final Player p, final Room startRoom, final Collection<Room> rooms) {
		// add rooms 
		if(houseRooms == null) houseRooms = new BasicEList<Room>();
		if(action == null) action = new BasicEList<Action>();
		for (Room r : rooms) {
			houseRooms.add(r);
		}
		
		// init player
		p.setCurrRoom(startRoom);
		player = p;
		
		// init states
		GameLogicFactory fact = GameLogicFactoryImpl.eINSTANCE;
		ItemCheck itemCheck = fact.createItemCheck();
		itemCheck.setGameInstance(this);
		NavigationCheck navigationCheck = fact.createNavigationCheck();
		navigationCheck.setGameInstance(this);
		if (player.getCurrRoom().isExit()) {
			ExitCheck exitCheck = fact.createExitCheck();
			exitCheck.setGameInstance(this);
			action.addAll(Arrays.asList(itemCheck, navigationCheck, exitCheck));
		} else {
			action.addAll(Arrays.asList(itemCheck, navigationCheck));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GameLogicPackage.GAME__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GameLogicPackage.GAME__ACTION:
			return getAction();
		case GameLogicPackage.GAME__PLAYER:
			if (resolve)
				return getPlayer();
			return basicGetPlayer();
		case GameLogicPackage.GAME__HOUSE_ROOMS:
			return getHouseRooms();
		case GameLogicPackage.GAME__SCANNER:
			return getScanner();
		case GameLogicPackage.GAME__GAME_FLAG:
			return isGameFlag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GameLogicPackage.GAME__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case GameLogicPackage.GAME__PLAYER:
			setPlayer((Player) newValue);
			return;
		case GameLogicPackage.GAME__HOUSE_ROOMS:
			getHouseRooms().clear();
			getHouseRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case GameLogicPackage.GAME__SCANNER:
			setScanner((Scanner) newValue);
			return;
		case GameLogicPackage.GAME__GAME_FLAG:
			setGameFlag((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GameLogicPackage.GAME__ACTION:
			getAction().clear();
			return;
		case GameLogicPackage.GAME__PLAYER:
			setPlayer((Player) null);
			return;
		case GameLogicPackage.GAME__HOUSE_ROOMS:
			getHouseRooms().clear();
			return;
		case GameLogicPackage.GAME__SCANNER:
			setScanner(SCANNER_EDEFAULT);
			return;
		case GameLogicPackage.GAME__GAME_FLAG:
			setGameFlag(GAME_FLAG_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GameLogicPackage.GAME__ACTION:
			return action != null && !action.isEmpty();
		case GameLogicPackage.GAME__PLAYER:
			return player != null;
		case GameLogicPackage.GAME__HOUSE_ROOMS:
			return houseRooms != null && !houseRooms.isEmpty();
		case GameLogicPackage.GAME__SCANNER:
			return SCANNER_EDEFAULT == null ? scanner != null : !SCANNER_EDEFAULT.equals(scanner);
		case GameLogicPackage.GAME__GAME_FLAG:
			return gameFlag != GAME_FLAG_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GameLogicPackage.GAME___START_GAME:
			startGame();
			return null;
		case GameLogicPackage.GAME___INIT__PLAYER_ROOM_COLLECTION:
			init((Player) arguments.get(0), (Room) arguments.get(1), (Collection) arguments.get(2));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (scanner: ");
		result.append(scanner);
		result.append(", gameFlag: ");
		result.append(gameFlag);
		result.append(')');
		return result.toString();
	}

} //GameImpl
