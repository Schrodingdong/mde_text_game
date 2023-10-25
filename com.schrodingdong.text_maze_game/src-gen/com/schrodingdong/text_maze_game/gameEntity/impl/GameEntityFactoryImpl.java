/**
 */
package com.schrodingdong.text_maze_game.gameEntity.impl;

import com.schrodingdong.text_maze_game.gameEntity.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameEntityFactoryImpl extends EFactoryImpl implements GameEntityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GameEntityFactory init() {
		try {
			GameEntityFactory theGameEntityFactory = (GameEntityFactory) EPackage.Registry.INSTANCE
					.getEFactory(GameEntityPackage.eNS_URI);
			if (theGameEntityFactory != null) {
				return theGameEntityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GameEntityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameEntityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GameEntityPackage.BALCONY:
			return createBalcony();
		case GameEntityPackage.CORRIDOR:
			return createCorridor();
		case GameEntityPackage.LIVING_ROOM:
			return createLivingRoom();
		case GameEntityPackage.HALL:
			return createHall();
		case GameEntityPackage.KEY:
			return createKey();
		case GameEntityPackage.KITCHEN:
			return createKitchen();
		case GameEntityPackage.BEDROOM:
			return createBedroom();
		case GameEntityPackage.PLAYER:
			return createPlayer();
		case GameEntityPackage.HOUSE:
			return createHouse();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balcony createBalcony() {
		BalconyImpl balcony = new BalconyImpl();
		return balcony;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Corridor createCorridor() {
		CorridorImpl corridor = new CorridorImpl();
		return corridor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LivingRoom createLivingRoom() {
		LivingRoomImpl livingRoom = new LivingRoomImpl();
		return livingRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hall createHall() {
		HallImpl hall = new HallImpl();
		return hall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kitchen createKitchen() {
		KitchenImpl kitchen = new KitchenImpl();
		return kitchen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedroom createBedroom() {
		BedroomImpl bedroom = new BedroomImpl();
		return bedroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameEntityPackage getGameEntityPackage() {
		return (GameEntityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GameEntityPackage getPackage() {
		return GameEntityPackage.eINSTANCE;
	}

} //GameEntityFactoryImpl
