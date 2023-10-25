/**
 */
package com.schrodingdong.text_maze_game.gameLogic.impl;

import com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage;

import com.schrodingdong.text_maze_game.gameEntity.impl.GameEntityPackageImpl;

import com.schrodingdong.text_maze_game.gameLogic.Action;
import com.schrodingdong.text_maze_game.gameLogic.ExitCheck;
import com.schrodingdong.text_maze_game.gameLogic.Game;
import com.schrodingdong.text_maze_game.gameLogic.GameLogicFactory;
import com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage;
import com.schrodingdong.text_maze_game.gameLogic.ItemCheck;
import com.schrodingdong.text_maze_game.gameLogic.NavigationCheck;

import java.util.Collection;
import java.util.Scanner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameLogicPackageImpl extends EPackageImpl implements GameLogicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scannerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GameLogicPackageImpl() {
		super(eNS_URI, GameLogicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GameLogicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GameLogicPackage init() {
		if (isInited)
			return (GameLogicPackage) EPackage.Registry.INSTANCE.getEPackage(GameLogicPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGameLogicPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GameLogicPackageImpl theGameLogicPackage = registeredGameLogicPackage instanceof GameLogicPackageImpl
				? (GameLogicPackageImpl) registeredGameLogicPackage
				: new GameLogicPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GameEntityPackage.eNS_URI);
		GameEntityPackageImpl theGameEntityPackage = (GameEntityPackageImpl) (registeredPackage instanceof GameEntityPackageImpl
				? registeredPackage
				: GameEntityPackage.eINSTANCE);

		// Create package meta-data objects
		theGameLogicPackage.createPackageContents();
		theGameEntityPackage.createPackageContents();

		// Initialize created meta-data
		theGameLogicPackage.initializePackageContents();
		theGameEntityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGameLogicPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GameLogicPackage.eNS_URI, theGameLogicPackage);
		return theGameLogicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_Action() {
		return (EReference) gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_Player() {
		return (EReference) gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGame_HouseRooms() {
		return (EReference) gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_Scanner() {
		return (EAttribute) gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_GameFlag() {
		return (EAttribute) gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGame__StartGame() {
		return gameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGame__Init__Player_Room_Collection() {
		return gameEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemCheck() {
		return itemCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getItemCheck__DoAction__Scanner() {
		return itemCheckEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationCheck() {
		return navigationCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNavigationCheck__DoAction__Scanner() {
		return navigationCheckEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExitCheck() {
		return exitCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExitCheck__DoAction__Scanner() {
		return exitCheckEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_GameInstance() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__DoAction__Scanner() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScanner() {
		return scannerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getcollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameLogicFactory getGameLogicFactory() {
		return (GameLogicFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__ACTION);
		createEReference(gameEClass, GAME__PLAYER);
		createEReference(gameEClass, GAME__HOUSE_ROOMS);
		createEAttribute(gameEClass, GAME__SCANNER);
		createEAttribute(gameEClass, GAME__GAME_FLAG);
		createEOperation(gameEClass, GAME___START_GAME);
		createEOperation(gameEClass, GAME___INIT__PLAYER_ROOM_COLLECTION);

		itemCheckEClass = createEClass(ITEM_CHECK);
		createEOperation(itemCheckEClass, ITEM_CHECK___DO_ACTION__SCANNER);

		navigationCheckEClass = createEClass(NAVIGATION_CHECK);
		createEOperation(navigationCheckEClass, NAVIGATION_CHECK___DO_ACTION__SCANNER);

		exitCheckEClass = createEClass(EXIT_CHECK);
		createEOperation(exitCheckEClass, EXIT_CHECK___DO_ACTION__SCANNER);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__GAME_INSTANCE);
		createEOperation(actionEClass, ACTION___DO_ACTION__SCANNER);

		// Create data types
		scannerEDataType = createEDataType(SCANNER);
		collectionEDataType = createEDataType(COLLECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GameEntityPackage theGameEntityPackage = (GameEntityPackage) EPackage.Registry.INSTANCE
				.getEPackage(GameEntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		itemCheckEClass.getESuperTypes().add(this.getAction());
		navigationCheckEClass.getESuperTypes().add(this.getAction());
		exitCheckEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_Action(), this.getAction(), null, "action", null, 0, -1, Game.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGame_Player(), theGameEntityPackage.getPlayer(), null, "player", null, 0, 1, Game.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_HouseRooms(), theGameEntityPackage.getRoom(), null, "houseRooms", null, 0, -1,
				Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Scanner(), this.getScanner(), "scanner", "new Scanner(System.in)", 0, 1, Game.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_GameFlag(), ecorePackage.getEBoolean(), "gameFlag", "true", 0, 1, Game.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGame__StartGame(), null, "startGame", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getGame__Init__Player_Room_Collection(), null, "init", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theGameEntityPackage.getPlayer(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGameEntityPackage.getRoom(), "startRoom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getcollection(), "rooms", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(itemCheckEClass, ItemCheck.class, "ItemCheck", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getItemCheck__DoAction__Scanner(), null, "doAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScanner(), "scanner", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(navigationCheckEClass, NavigationCheck.class, "NavigationCheck", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNavigationCheck__DoAction__Scanner(), null, "doAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScanner(), "scanner", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exitCheckEClass, ExitCheck.class, "ExitCheck", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getExitCheck__DoAction__Scanner(), null, "doAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScanner(), "scanner", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_GameInstance(), this.getGame(), null, "gameInstance", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAction__DoAction__Scanner(), null, "doAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScanner(), "scanner", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(scannerEDataType, Scanner.class, "Scanner", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "collection", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GameLogicPackageImpl
