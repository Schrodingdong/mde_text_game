/**
 */
package com.schrodingdong.text_maze_game.gameEntity.util;

import com.schrodingdong.text_maze_game.gameEntity.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage
 * @generated
 */
public class GameEntityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GameEntityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameEntityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GameEntityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameEntitySwitch<Adapter> modelSwitch = new GameEntitySwitch<Adapter>() {
		@Override
		public Adapter caseBalcony(Balcony object) {
			return createBalconyAdapter();
		}

		@Override
		public Adapter caseCorridor(Corridor object) {
			return createCorridorAdapter();
		}

		@Override
		public Adapter caseLivingRoom(LivingRoom object) {
			return createLivingRoomAdapter();
		}

		@Override
		public Adapter caseRoom(Room object) {
			return createRoomAdapter();
		}

		@Override
		public Adapter caseHall(Hall object) {
			return createHallAdapter();
		}

		@Override
		public Adapter caseKey(Key object) {
			return createKeyAdapter();
		}

		@Override
		public Adapter caseKitchen(Kitchen object) {
			return createKitchenAdapter();
		}

		@Override
		public Adapter caseBedroom(Bedroom object) {
			return createBedroomAdapter();
		}

		@Override
		public Adapter casePlayer(Player object) {
			return createPlayerAdapter();
		}

		@Override
		public Adapter caseItem(Item object) {
			return createItemAdapter();
		}

		@Override
		public Adapter caseHouse(House object) {
			return createHouseAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.Balcony <em>Balcony</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.Balcony
	 * @generated
	 */
	public Adapter createBalconyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.Corridor <em>Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.Corridor
	 * @generated
	 */
	public Adapter createCorridorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.LivingRoom <em>Living Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.LivingRoom
	 * @generated
	 */
	public Adapter createLivingRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.Hall <em>Hall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.Hall
	 * @generated
	 */
	public Adapter createHallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.Key
	 * @generated
	 */
	public Adapter createKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.Kitchen
	 * @generated
	 */
	public Adapter createKitchenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.Bedroom <em>Bedroom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.Bedroom
	 * @generated
	 */
	public Adapter createBedroomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.schrodingdong.text_maze_game.gameEntity.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.schrodingdong.text_maze_game.gameEntity.House
	 * @generated
	 */
	public Adapter createHouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GameEntityAdapterFactory
