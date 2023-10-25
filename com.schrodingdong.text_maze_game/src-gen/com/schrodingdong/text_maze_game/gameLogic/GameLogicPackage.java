/**
 */
package com.schrodingdong.text_maze_game.gameLogic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicFactory
 * @model kind="package"
 * @generated
 */
public interface GameLogicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gameLogic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.schrodingdong.text_maze_game.gameLogic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gameLo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GameLogicPackage eINSTANCE = com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameImpl
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYER = 1;

	/**
	 * The feature id for the '<em><b>House Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__HOUSE_ROOMS = 2;

	/**
	 * The feature id for the '<em><b>Scanner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SCANNER = 3;

	/**
	 * The feature id for the '<em><b>Game Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_FLAG = 4;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Start Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___START_GAME = 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___INIT__PLAYER_ROOM_COLLECTION = 1;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.ActionImpl
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Game Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__GAME_INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___DO_ACTION__SCANNER = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.ItemCheckImpl <em>Item Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.ItemCheckImpl
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getItemCheck()
	 * @generated
	 */
	int ITEM_CHECK = 1;

	/**
	 * The feature id for the '<em><b>Game Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CHECK__GAME_INSTANCE = ACTION__GAME_INSTANCE;

	/**
	 * The number of structural features of the '<em>Item Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CHECK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CHECK___DO_ACTION__SCANNER = ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CHECK_OPERATION_COUNT = ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.NavigationCheckImpl <em>Navigation Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.NavigationCheckImpl
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getNavigationCheck()
	 * @generated
	 */
	int NAVIGATION_CHECK = 2;

	/**
	 * The feature id for the '<em><b>Game Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CHECK__GAME_INSTANCE = ACTION__GAME_INSTANCE;

	/**
	 * The number of structural features of the '<em>Navigation Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CHECK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CHECK___DO_ACTION__SCANNER = ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Navigation Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CHECK_OPERATION_COUNT = ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.ExitCheckImpl <em>Exit Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.ExitCheckImpl
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getExitCheck()
	 * @generated
	 */
	int EXIT_CHECK = 3;

	/**
	 * The feature id for the '<em><b>Game Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CHECK__GAME_INSTANCE = ACTION__GAME_INSTANCE;

	/**
	 * The number of structural features of the '<em>Exit Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CHECK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CHECK___DO_ACTION__SCANNER = ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CHECK_OPERATION_COUNT = ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>Scanner</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Scanner
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getScanner()
	 * @generated
	 */
	int SCANNER = 5;

	/**
	 * The meta object id for the '<em>collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getcollection()
	 * @generated
	 */
	int COLLECTION = 6;

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.gameLogic.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference list '{@link com.schrodingdong.text_maze_game.gameLogic.Game#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Game#getAction()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Action();

	/**
	 * Returns the meta object for the reference '{@link com.schrodingdong.text_maze_game.gameLogic.Game#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Game#getPlayer()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Player();

	/**
	 * Returns the meta object for the reference list '{@link com.schrodingdong.text_maze_game.gameLogic.Game#getHouseRooms <em>House Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>House Rooms</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Game#getHouseRooms()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_HouseRooms();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.gameLogic.Game#getScanner <em>Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scanner</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Game#getScanner()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Scanner();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.gameLogic.Game#isGameFlag <em>Game Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Flag</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Game#isGameFlag()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameFlag();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.gameLogic.Game#startGame() <em>Start Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Game</em>' operation.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Game#startGame()
	 * @generated
	 */
	EOperation getGame__StartGame();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.gameLogic.Game#init(com.schrodingdong.text_maze_game.gameEntity.Player, com.schrodingdong.text_maze_game.gameEntity.Room, java.util.Collection) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Game#init(com.schrodingdong.text_maze_game.gameEntity.Player, com.schrodingdong.text_maze_game.gameEntity.Room, java.util.Collection)
	 * @generated
	 */
	EOperation getGame__Init__Player_Room_Collection();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.gameLogic.ItemCheck <em>Item Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Check</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.ItemCheck
	 * @generated
	 */
	EClass getItemCheck();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.gameLogic.ItemCheck#doAction(java.util.Scanner) <em>Do Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Action</em>' operation.
	 * @see com.schrodingdong.text_maze_game.gameLogic.ItemCheck#doAction(java.util.Scanner)
	 * @generated
	 */
	EOperation getItemCheck__DoAction__Scanner();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.gameLogic.NavigationCheck <em>Navigation Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Check</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.NavigationCheck
	 * @generated
	 */
	EClass getNavigationCheck();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.gameLogic.NavigationCheck#doAction(java.util.Scanner) <em>Do Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Action</em>' operation.
	 * @see com.schrodingdong.text_maze_game.gameLogic.NavigationCheck#doAction(java.util.Scanner)
	 * @generated
	 */
	EOperation getNavigationCheck__DoAction__Scanner();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.gameLogic.ExitCheck <em>Exit Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Check</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.ExitCheck
	 * @generated
	 */
	EClass getExitCheck();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.gameLogic.ExitCheck#doAction(java.util.Scanner) <em>Do Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Action</em>' operation.
	 * @see com.schrodingdong.text_maze_game.gameLogic.ExitCheck#doAction(java.util.Scanner)
	 * @generated
	 */
	EOperation getExitCheck__DoAction__Scanner();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.gameLogic.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link com.schrodingdong.text_maze_game.gameLogic.Action#getGameInstance <em>Game Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Game Instance</em>'.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Action#getGameInstance()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_GameInstance();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.gameLogic.Action#doAction(java.util.Scanner) <em>Do Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Action</em>' operation.
	 * @see com.schrodingdong.text_maze_game.gameLogic.Action#doAction(java.util.Scanner)
	 * @generated
	 */
	EOperation getAction__DoAction__Scanner();

	/**
	 * Returns the meta object for data type '{@link java.util.Scanner <em>Scanner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scanner</em>'.
	 * @see java.util.Scanner
	 * @model instanceClass="java.util.Scanner"
	 * @generated
	 */
	EDataType getScanner();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection"
	 * @generated
	 */
	EDataType getcollection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GameLogicFactory getGameLogicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameImpl
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ACTION = eINSTANCE.getGame_Action();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYER = eINSTANCE.getGame_Player();

		/**
		 * The meta object literal for the '<em><b>House Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__HOUSE_ROOMS = eINSTANCE.getGame_HouseRooms();

		/**
		 * The meta object literal for the '<em><b>Scanner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__SCANNER = eINSTANCE.getGame_Scanner();

		/**
		 * The meta object literal for the '<em><b>Game Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_FLAG = eINSTANCE.getGame_GameFlag();

		/**
		 * The meta object literal for the '<em><b>Start Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___START_GAME = eINSTANCE.getGame__StartGame();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___INIT__PLAYER_ROOM_COLLECTION = eINSTANCE.getGame__Init__Player_Room_Collection();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.ItemCheckImpl <em>Item Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.ItemCheckImpl
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getItemCheck()
		 * @generated
		 */
		EClass ITEM_CHECK = eINSTANCE.getItemCheck();

		/**
		 * The meta object literal for the '<em><b>Do Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM_CHECK___DO_ACTION__SCANNER = eINSTANCE.getItemCheck__DoAction__Scanner();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.NavigationCheckImpl <em>Navigation Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.NavigationCheckImpl
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getNavigationCheck()
		 * @generated
		 */
		EClass NAVIGATION_CHECK = eINSTANCE.getNavigationCheck();

		/**
		 * The meta object literal for the '<em><b>Do Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATION_CHECK___DO_ACTION__SCANNER = eINSTANCE.getNavigationCheck__DoAction__Scanner();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.ExitCheckImpl <em>Exit Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.ExitCheckImpl
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getExitCheck()
		 * @generated
		 */
		EClass EXIT_CHECK = eINSTANCE.getExitCheck();

		/**
		 * The meta object literal for the '<em><b>Do Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXIT_CHECK___DO_ACTION__SCANNER = eINSTANCE.getExitCheck__DoAction__Scanner();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.gameLogic.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.ActionImpl
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Game Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__GAME_INSTANCE = eINSTANCE.getAction_GameInstance();

		/**
		 * The meta object literal for the '<em><b>Do Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___DO_ACTION__SCANNER = eINSTANCE.getAction__DoAction__Scanner();

		/**
		 * The meta object literal for the '<em>Scanner</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Scanner
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getScanner()
		 * @generated
		 */
		EDataType SCANNER = eINSTANCE.getScanner();

		/**
		 * The meta object literal for the '<em>collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl#getcollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getcollection();

	}

} //GameLogicPackage
