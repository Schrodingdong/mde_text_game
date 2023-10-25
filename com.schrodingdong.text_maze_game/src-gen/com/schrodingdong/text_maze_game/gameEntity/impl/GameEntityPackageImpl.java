/**
 */
package com.schrodingdong.text_maze_game.gameEntity.impl;

import com.schrodingdong.text_maze_game.gameEntity.Balcony;
import com.schrodingdong.text_maze_game.gameEntity.Bedroom;
import com.schrodingdong.text_maze_game.gameEntity.Corridor;
import com.schrodingdong.text_maze_game.gameEntity.GameEntityFactory;
import com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage;
import com.schrodingdong.text_maze_game.gameEntity.Hall;
import com.schrodingdong.text_maze_game.gameEntity.House;
import com.schrodingdong.text_maze_game.gameEntity.Item;
import com.schrodingdong.text_maze_game.gameEntity.Key;
import com.schrodingdong.text_maze_game.gameEntity.Kitchen;
import com.schrodingdong.text_maze_game.gameEntity.LivingRoom;
import com.schrodingdong.text_maze_game.gameEntity.Player;
import com.schrodingdong.text_maze_game.gameEntity.Room;

import com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage;

import com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class GameEntityPackageImpl extends EPackageImpl implements GameEntityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass balconyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corridorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kitchenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedroomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEClass = null;

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
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GameEntityPackageImpl() {
		super(eNS_URI, GameEntityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GameEntityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GameEntityPackage init() {
		if (isInited)
			return (GameEntityPackage) EPackage.Registry.INSTANCE.getEPackage(GameEntityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGameEntityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GameEntityPackageImpl theGameEntityPackage = registeredGameEntityPackage instanceof GameEntityPackageImpl
				? (GameEntityPackageImpl) registeredGameEntityPackage
				: new GameEntityPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GameLogicPackage.eNS_URI);
		GameLogicPackageImpl theGameLogicPackage = (GameLogicPackageImpl) (registeredPackage instanceof GameLogicPackageImpl
				? registeredPackage
				: GameLogicPackage.eINSTANCE);

		// Create package meta-data objects
		theGameEntityPackage.createPackageContents();
		theGameLogicPackage.createPackageContents();

		// Initialize created meta-data
		theGameEntityPackage.initializePackageContents();
		theGameLogicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGameEntityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GameEntityPackage.eNS_URI, theGameEntityPackage);
		return theGameEntityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBalcony() {
		return balconyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBalcony_Name() {
		return (EAttribute) balconyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorridor() {
		return corridorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorridor_Name() {
		return (EAttribute) corridorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLivingRoom() {
		return livingRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLivingRoom_Name() {
		return (EAttribute) livingRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_Items() {
		return (EReference) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_Start() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_Exit() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_NeighbooringRooms() {
		return (EReference) roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoom__GetName() {
		return roomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoom__RoomLocationInfo() {
		return roomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHall() {
		return hallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHall_Name() {
		return (EAttribute) hallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Name() {
		return (EAttribute) keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKitchen() {
		return kitchenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKitchen_Name() {
		return (EAttribute) kitchenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedroom() {
		return bedroomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedroom_Name() {
		return (EAttribute) bedroomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_CurrRoom() {
		return (EReference) playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_Key() {
		return (EReference) playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_Items() {
		return (EReference) playerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlayer__PickItems() {
		return playerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlayer__Move__Room() {
		return playerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlayer__UseKey() {
		return playerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlayer__GetNeighbooringRoomMap() {
		return playerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getItem__GetName() {
		return itemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHouse_Room() {
		return (EReference) houseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHouse_Player() {
		return (EReference) houseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameEntityFactory getGameEntityFactory() {
		return (GameEntityFactory) getEFactoryInstance();
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
		balconyEClass = createEClass(BALCONY);
		createEAttribute(balconyEClass, BALCONY__NAME);

		corridorEClass = createEClass(CORRIDOR);
		createEAttribute(corridorEClass, CORRIDOR__NAME);

		livingRoomEClass = createEClass(LIVING_ROOM);
		createEAttribute(livingRoomEClass, LIVING_ROOM__NAME);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__ITEMS);
		createEAttribute(roomEClass, ROOM__START);
		createEAttribute(roomEClass, ROOM__EXIT);
		createEReference(roomEClass, ROOM__NEIGHBOORING_ROOMS);
		createEOperation(roomEClass, ROOM___GET_NAME);
		createEOperation(roomEClass, ROOM___ROOM_LOCATION_INFO);

		hallEClass = createEClass(HALL);
		createEAttribute(hallEClass, HALL__NAME);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__NAME);

		kitchenEClass = createEClass(KITCHEN);
		createEAttribute(kitchenEClass, KITCHEN__NAME);

		bedroomEClass = createEClass(BEDROOM);
		createEAttribute(bedroomEClass, BEDROOM__NAME);

		playerEClass = createEClass(PLAYER);
		createEReference(playerEClass, PLAYER__CURR_ROOM);
		createEReference(playerEClass, PLAYER__KEY);
		createEReference(playerEClass, PLAYER__ITEMS);
		createEOperation(playerEClass, PLAYER___PICK_ITEMS);
		createEOperation(playerEClass, PLAYER___MOVE__ROOM);
		createEOperation(playerEClass, PLAYER___USE_KEY);
		createEOperation(playerEClass, PLAYER___GET_NEIGHBOORING_ROOM_MAP);

		itemEClass = createEClass(ITEM);
		createEOperation(itemEClass, ITEM___GET_NAME);

		houseEClass = createEClass(HOUSE);
		createEReference(houseEClass, HOUSE__ROOM);
		createEReference(houseEClass, HOUSE__PLAYER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		balconyEClass.getESuperTypes().add(this.getRoom());
		corridorEClass.getESuperTypes().add(this.getRoom());
		livingRoomEClass.getESuperTypes().add(this.getRoom());
		hallEClass.getESuperTypes().add(this.getRoom());
		keyEClass.getESuperTypes().add(this.getItem());
		kitchenEClass.getESuperTypes().add(this.getRoom());
		bedroomEClass.getESuperTypes().add(this.getRoom());

		// Initialize classes, features, and operations; add parameters
		initEClass(balconyEClass, Balcony.class, "Balcony", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBalcony_Name(), ecorePackage.getEString(), "name", "Balcony", 0, 1, Balcony.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(corridorEClass, Corridor.class, "Corridor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorridor_Name(), ecorePackage.getEString(), "name", "Corridor", 0, 1, Corridor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingRoomEClass, LivingRoom.class, "LivingRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingRoom_Name(), ecorePackage.getEString(), "name", "Living Room", 0, 1, LivingRoom.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_Items(), this.getItem(), null, "items", null, 0, -1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRoom_Start(), ecorePackage.getEBoolean(), "start", null, 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_Exit(), ecorePackage.getEBoolean(), "exit", null, 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_NeighbooringRooms(), this.getRoom(), null, "neighbooringRooms", null, 0, -1, Room.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRoom__GetName(), ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRoom__RoomLocationInfo(), ecorePackage.getEString(), "roomLocationInfo", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(hallEClass, Hall.class, "Hall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHall_Name(), ecorePackage.getEString(), "name", "Hall", 0, 1, Hall.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Name(), ecorePackage.getEString(), "name", "Key", 0, 1, Key.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kitchenEClass, Kitchen.class, "Kitchen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKitchen_Name(), ecorePackage.getEString(), "name", "Kitchen", 0, 1, Kitchen.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedroomEClass, Bedroom.class, "Bedroom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedroom_Name(), ecorePackage.getEString(), "name", "Bedroom", 0, 1, Bedroom.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayer_CurrRoom(), this.getRoom(), null, "currRoom", null, 1, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPlayer_Key(), this.getKey(), null, "key", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPlayer_Items(), this.getItem(), null, "items", null, 0, -1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getPlayer__PickItems(), null, "pickItems", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPlayer__Move__Room(), null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoom(), "nextRoom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlayer__UseKey(), ecorePackage.getEBoolean(), "useKey", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlayer__GetNeighbooringRoomMap(), ecorePackage.getEMap(), "getNeighbooringRoomMap", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getItem__GetName(), ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHouse_Room(), this.getRoom(), null, "room", null, 0, -1, House.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHouse_Player(), this.getPlayer(), null, "player", null, 0, 1, House.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GameEntityPackageImpl
