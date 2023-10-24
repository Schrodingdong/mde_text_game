/**
 */
package com.schrodingdong.text_maze_game.impl;

import com.schrodingdong.text_maze_game.*;

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
public class Text_maze_gameFactoryImpl extends EFactoryImpl implements Text_maze_gameFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Text_maze_gameFactory init() {
		try {
			Text_maze_gameFactory theText_maze_gameFactory = (Text_maze_gameFactory) EPackage.Registry.INSTANCE
					.getEFactory(Text_maze_gamePackage.eNS_URI);
			if (theText_maze_gameFactory != null) {
				return theText_maze_gameFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Text_maze_gameFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text_maze_gameFactoryImpl() {
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
		case Text_maze_gamePackage.PLAYER:
			return createPlayer();
		case Text_maze_gamePackage.KEY:
			return createKey();
		case Text_maze_gamePackage.BEDROOM:
			return createBedroom();
		case Text_maze_gamePackage.KITCHEN:
			return createKitchen();
		case Text_maze_gamePackage.LIVING_ROOM:
			return createLivingRoom();
		case Text_maze_gamePackage.CORRIDOR:
			return createCorridor();
		case Text_maze_gamePackage.HALL:
			return createHall();
		case Text_maze_gamePackage.BALCONY:
			return createBalcony();
		case Text_maze_gamePackage.HOUSE:
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
	public Text_maze_gamePackage getText_maze_gamePackage() {
		return (Text_maze_gamePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Text_maze_gamePackage getPackage() {
		return Text_maze_gamePackage.eINSTANCE;
	}

} //Text_maze_gameFactoryImpl
