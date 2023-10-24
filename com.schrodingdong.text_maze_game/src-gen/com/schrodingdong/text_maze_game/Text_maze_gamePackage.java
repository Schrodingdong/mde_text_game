/**
 */
package com.schrodingdong.text_maze_game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.schrodingdong.text_maze_game.Text_maze_gameFactory
 * @model kind="package"
 * @generated
 */
public interface Text_maze_gamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "text_maze_game";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/text_maze_game";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "text_maze_game";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Text_maze_gamePackage eINSTANCE = com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.Room <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.Room
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__START = 1;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__EXIT = 2;

	/**
	 * The feature id for the '<em><b>Neighbooring Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NEIGHBOORING_ROOMS = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___ROOM_LOCATION_INFO = 1;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.Item <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.Item
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_NAME = 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.impl.PlayerImpl
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Curr Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__CURR_ROOM = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__KEY = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ITEMS = 2;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Pick Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___PICK_ITEMS = 0;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___MOVE__ROOM = 1;

	/**
	 * The operation id for the '<em>Use Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___USE_KEY = 2;

	/**
	 * The operation id for the '<em>Get Neighbooring Room Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___GET_NEIGHBOORING_ROOM_MAP = 3;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.impl.KeyImpl
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getKey()
	 * @generated
	 */
	int KEY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__NAME = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___GET_NAME = ITEM___GET_NAME;

	/**
	 * The number of operations of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.impl.BedroomImpl <em>Bedroom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.impl.BedroomImpl
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getBedroom()
	 * @generated
	 */
	int BEDROOM = 4;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDROOM__ITEMS = ROOM__ITEMS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDROOM__START = ROOM__START;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDROOM__EXIT = ROOM__EXIT;

	/**
	 * The feature id for the '<em><b>Neighbooring Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDROOM__NEIGHBOORING_ROOMS = ROOM__NEIGHBOORING_ROOMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDROOM__NAME = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bedroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDROOM___GET_NAME = ROOM___GET_NAME;

	/**
	 * The operation id for the '<em>Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDROOM___ROOM_LOCATION_INFO = ROOM___ROOM_LOCATION_INFO;

	/**
	 * The number of operations of the '<em>Bedroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.impl.KitchenImpl <em>Kitchen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.impl.KitchenImpl
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getKitchen()
	 * @generated
	 */
	int KITCHEN = 5;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__ITEMS = ROOM__ITEMS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__START = ROOM__START;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__EXIT = ROOM__EXIT;

	/**
	 * The feature id for the '<em><b>Neighbooring Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__NEIGHBOORING_ROOMS = ROOM__NEIGHBOORING_ROOMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__NAME = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_FEATURE_COUNT = ROOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___GET_NAME = ROOM___GET_NAME;

	/**
	 * The operation id for the '<em>Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___ROOM_LOCATION_INFO = ROOM___ROOM_LOCATION_INFO;

	/**
	 * The number of operations of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.impl.LivingRoomImpl <em>Living Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.impl.LivingRoomImpl
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getLivingRoom()
	 * @generated
	 */
	int LIVING_ROOM = 6;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_ROOM__ITEMS = ROOM__ITEMS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_ROOM__START = ROOM__START;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_ROOM__EXIT = ROOM__EXIT;

	/**
	 * The feature id for the '<em><b>Neighbooring Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_ROOM__NEIGHBOORING_ROOMS = ROOM__NEIGHBOORING_ROOMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_ROOM__NAME = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Living Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_ROOM___GET_NAME = ROOM___GET_NAME;

	/**
	 * The operation id for the '<em>Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_ROOM___ROOM_LOCATION_INFO = ROOM___ROOM_LOCATION_INFO;

	/**
	 * The number of operations of the '<em>Living Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.impl.CorridorImpl <em>Corridor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.impl.CorridorImpl
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getCorridor()
	 * @generated
	 */
	int CORRIDOR = 7;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR__ITEMS = ROOM__ITEMS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR__START = ROOM__START;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR__EXIT = ROOM__EXIT;

	/**
	 * The feature id for the '<em><b>Neighbooring Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR__NEIGHBOORING_ROOMS = ROOM__NEIGHBOORING_ROOMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR__NAME = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Corridor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_FEATURE_COUNT = ROOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR___GET_NAME = ROOM___GET_NAME;

	/**
	 * The operation id for the '<em>Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR___ROOM_LOCATION_INFO = ROOM___ROOM_LOCATION_INFO;

	/**
	 * The number of operations of the '<em>Corridor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.impl.HallImpl <em>Hall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.impl.HallImpl
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getHall()
	 * @generated
	 */
	int HALL = 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL__ITEMS = ROOM__ITEMS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL__START = ROOM__START;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL__EXIT = ROOM__EXIT;

	/**
	 * The feature id for the '<em><b>Neighbooring Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL__NEIGHBOORING_ROOMS = ROOM__NEIGHBOORING_ROOMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL__NAME = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_FEATURE_COUNT = ROOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL___GET_NAME = ROOM___GET_NAME;

	/**
	 * The operation id for the '<em>Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL___ROOM_LOCATION_INFO = ROOM___ROOM_LOCATION_INFO;

	/**
	 * The number of operations of the '<em>Hall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.impl.BalconyImpl <em>Balcony</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.impl.BalconyImpl
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getBalcony()
	 * @generated
	 */
	int BALCONY = 9;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONY__ITEMS = ROOM__ITEMS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONY__START = ROOM__START;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONY__EXIT = ROOM__EXIT;

	/**
	 * The feature id for the '<em><b>Neighbooring Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONY__NEIGHBOORING_ROOMS = ROOM__NEIGHBOORING_ROOMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONY__NAME = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Balcony</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONY_FEATURE_COUNT = ROOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONY___GET_NAME = ROOM___GET_NAME;

	/**
	 * The operation id for the '<em>Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONY___ROOM_LOCATION_INFO = ROOM___ROOM_LOCATION_INFO;

	/**
	 * The number of operations of the '<em>Balcony</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONY_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.schrodingdong.text_maze_game.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.schrodingdong.text_maze_game.impl.HouseImpl
	 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 10;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ROOM = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__PLAYER = 1;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see com.schrodingdong.text_maze_game.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link com.schrodingdong.text_maze_game.Room#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.schrodingdong.text_maze_game.Room#getItems()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Items();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.Room#isStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.schrodingdong.text_maze_game.Room#isStart()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.Room#isExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit</em>'.
	 * @see com.schrodingdong.text_maze_game.Room#isExit()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Exit();

	/**
	 * Returns the meta object for the reference list '{@link com.schrodingdong.text_maze_game.Room#getNeighbooringRooms <em>Neighbooring Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbooring Rooms</em>'.
	 * @see com.schrodingdong.text_maze_game.Room#getNeighbooringRooms()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_NeighbooringRooms();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.Room#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see com.schrodingdong.text_maze_game.Room#getName()
	 * @generated
	 */
	EOperation getRoom__GetName();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.Room#roomLocationInfo() <em>Room Location Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Room Location Info</em>' operation.
	 * @see com.schrodingdong.text_maze_game.Room#roomLocationInfo()
	 * @generated
	 */
	EOperation getRoom__RoomLocationInfo();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see com.schrodingdong.text_maze_game.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.Item#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see com.schrodingdong.text_maze_game.Item#getName()
	 * @generated
	 */
	EOperation getItem__GetName();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see com.schrodingdong.text_maze_game.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the reference '{@link com.schrodingdong.text_maze_game.Player#getCurrRoom <em>Curr Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curr Room</em>'.
	 * @see com.schrodingdong.text_maze_game.Player#getCurrRoom()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_CurrRoom();

	/**
	 * Returns the meta object for the reference '{@link com.schrodingdong.text_maze_game.Player#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see com.schrodingdong.text_maze_game.Player#getKey()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Key();

	/**
	 * Returns the meta object for the reference list '{@link com.schrodingdong.text_maze_game.Player#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see com.schrodingdong.text_maze_game.Player#getItems()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Items();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.Player#pickItems() <em>Pick Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pick Items</em>' operation.
	 * @see com.schrodingdong.text_maze_game.Player#pickItems()
	 * @generated
	 */
	EOperation getPlayer__PickItems();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.Player#move(com.schrodingdong.text_maze_game.Room) <em>Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move</em>' operation.
	 * @see com.schrodingdong.text_maze_game.Player#move(com.schrodingdong.text_maze_game.Room)
	 * @generated
	 */
	EOperation getPlayer__Move__Room();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.Player#useKey() <em>Use Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Use Key</em>' operation.
	 * @see com.schrodingdong.text_maze_game.Player#useKey()
	 * @generated
	 */
	EOperation getPlayer__UseKey();

	/**
	 * Returns the meta object for the '{@link com.schrodingdong.text_maze_game.Player#getNeighbooringRoomMap() <em>Get Neighbooring Room Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Neighbooring Room Map</em>' operation.
	 * @see com.schrodingdong.text_maze_game.Player#getNeighbooringRoomMap()
	 * @generated
	 */
	EOperation getPlayer__GetNeighbooringRoomMap();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see com.schrodingdong.text_maze_game.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.Key#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.schrodingdong.text_maze_game.Key#getName()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Name();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.Bedroom <em>Bedroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bedroom</em>'.
	 * @see com.schrodingdong.text_maze_game.Bedroom
	 * @generated
	 */
	EClass getBedroom();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.Bedroom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.schrodingdong.text_maze_game.Bedroom#getName()
	 * @see #getBedroom()
	 * @generated
	 */
	EAttribute getBedroom_Name();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitchen</em>'.
	 * @see com.schrodingdong.text_maze_game.Kitchen
	 * @generated
	 */
	EClass getKitchen();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.Kitchen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.schrodingdong.text_maze_game.Kitchen#getName()
	 * @see #getKitchen()
	 * @generated
	 */
	EAttribute getKitchen_Name();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.LivingRoom <em>Living Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Room</em>'.
	 * @see com.schrodingdong.text_maze_game.LivingRoom
	 * @generated
	 */
	EClass getLivingRoom();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.LivingRoom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.schrodingdong.text_maze_game.LivingRoom#getName()
	 * @see #getLivingRoom()
	 * @generated
	 */
	EAttribute getLivingRoom_Name();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.Corridor <em>Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corridor</em>'.
	 * @see com.schrodingdong.text_maze_game.Corridor
	 * @generated
	 */
	EClass getCorridor();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.Corridor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.schrodingdong.text_maze_game.Corridor#getName()
	 * @see #getCorridor()
	 * @generated
	 */
	EAttribute getCorridor_Name();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.Hall <em>Hall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hall</em>'.
	 * @see com.schrodingdong.text_maze_game.Hall
	 * @generated
	 */
	EClass getHall();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.Hall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.schrodingdong.text_maze_game.Hall#getName()
	 * @see #getHall()
	 * @generated
	 */
	EAttribute getHall_Name();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.Balcony <em>Balcony</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balcony</em>'.
	 * @see com.schrodingdong.text_maze_game.Balcony
	 * @generated
	 */
	EClass getBalcony();

	/**
	 * Returns the meta object for the attribute '{@link com.schrodingdong.text_maze_game.Balcony#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.schrodingdong.text_maze_game.Balcony#getName()
	 * @see #getBalcony()
	 * @generated
	 */
	EAttribute getBalcony_Name();

	/**
	 * Returns the meta object for class '{@link com.schrodingdong.text_maze_game.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see com.schrodingdong.text_maze_game.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the containment reference list '{@link com.schrodingdong.text_maze_game.House#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see com.schrodingdong.text_maze_game.House#getRoom()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Room();

	/**
	 * Returns the meta object for the reference '{@link com.schrodingdong.text_maze_game.House#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see com.schrodingdong.text_maze_game.House#getPlayer()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Player();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Text_maze_gameFactory getText_maze_gameFactory();

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
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.Room <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.Room
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ITEMS = eINSTANCE.getRoom_Items();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__START = eINSTANCE.getRoom_Start();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__EXIT = eINSTANCE.getRoom_Exit();

		/**
		 * The meta object literal for the '<em><b>Neighbooring Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__NEIGHBOORING_ROOMS = eINSTANCE.getRoom_NeighbooringRooms();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___GET_NAME = eINSTANCE.getRoom__GetName();

		/**
		 * The meta object literal for the '<em><b>Room Location Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___ROOM_LOCATION_INFO = eINSTANCE.getRoom__RoomLocationInfo();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.Item <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.Item
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___GET_NAME = eINSTANCE.getItem__GetName();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.impl.PlayerImpl
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Curr Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__CURR_ROOM = eINSTANCE.getPlayer_CurrRoom();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__KEY = eINSTANCE.getPlayer_Key();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__ITEMS = eINSTANCE.getPlayer_Items();

		/**
		 * The meta object literal for the '<em><b>Pick Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___PICK_ITEMS = eINSTANCE.getPlayer__PickItems();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___MOVE__ROOM = eINSTANCE.getPlayer__Move__Room();

		/**
		 * The meta object literal for the '<em><b>Use Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___USE_KEY = eINSTANCE.getPlayer__UseKey();

		/**
		 * The meta object literal for the '<em><b>Get Neighbooring Room Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___GET_NEIGHBOORING_ROOM_MAP = eINSTANCE.getPlayer__GetNeighbooringRoomMap();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.impl.KeyImpl
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__NAME = eINSTANCE.getKey_Name();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.impl.BedroomImpl <em>Bedroom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.impl.BedroomImpl
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getBedroom()
		 * @generated
		 */
		EClass BEDROOM = eINSTANCE.getBedroom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEDROOM__NAME = eINSTANCE.getBedroom_Name();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.impl.KitchenImpl <em>Kitchen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.impl.KitchenImpl
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getKitchen()
		 * @generated
		 */
		EClass KITCHEN = eINSTANCE.getKitchen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KITCHEN__NAME = eINSTANCE.getKitchen_Name();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.impl.LivingRoomImpl <em>Living Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.impl.LivingRoomImpl
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getLivingRoom()
		 * @generated
		 */
		EClass LIVING_ROOM = eINSTANCE.getLivingRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_ROOM__NAME = eINSTANCE.getLivingRoom_Name();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.impl.CorridorImpl <em>Corridor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.impl.CorridorImpl
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getCorridor()
		 * @generated
		 */
		EClass CORRIDOR = eINSTANCE.getCorridor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRIDOR__NAME = eINSTANCE.getCorridor_Name();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.impl.HallImpl <em>Hall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.impl.HallImpl
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getHall()
		 * @generated
		 */
		EClass HALL = eINSTANCE.getHall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALL__NAME = eINSTANCE.getHall_Name();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.impl.BalconyImpl <em>Balcony</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.impl.BalconyImpl
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getBalcony()
		 * @generated
		 */
		EClass BALCONY = eINSTANCE.getBalcony();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALCONY__NAME = eINSTANCE.getBalcony_Name();

		/**
		 * The meta object literal for the '{@link com.schrodingdong.text_maze_game.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.schrodingdong.text_maze_game.impl.HouseImpl
		 * @see com.schrodingdong.text_maze_game.impl.Text_maze_gamePackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__ROOM = eINSTANCE.getHouse_Room();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__PLAYER = eINSTANCE.getHouse_Player();

	}

} //Text_maze_gamePackage
