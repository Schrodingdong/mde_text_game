/**
 */
package com.schrodingdong.text_maze_game.impl;

import com.schrodingdong.text_maze_game.Item;
import com.schrodingdong.text_maze_game.Key;
import com.schrodingdong.text_maze_game.Player;
import com.schrodingdong.text_maze_game.Room;
import com.schrodingdong.text_maze_game.Text_maze_gamePackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.impl.PlayerImpl#getCurrRoom <em>Curr Room</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.impl.PlayerImpl#getKey <em>Key</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.impl.PlayerImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
	/**
	 * The cached value of the '{@link #getCurrRoom() <em>Curr Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrRoom()
	 * @generated
	 * @ordered
	 */
	protected Room currRoom;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Key key;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Text_maze_gamePackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getCurrRoom() {
		if (currRoom != null && currRoom.eIsProxy()) {
			InternalEObject oldCurrRoom = (InternalEObject) currRoom;
			currRoom = (Room) eResolveProxy(oldCurrRoom);
			if (currRoom != oldCurrRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Text_maze_gamePackage.PLAYER__CURR_ROOM,
							oldCurrRoom, currRoom));
			}
		}
		return currRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetCurrRoom() {
		return currRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrRoom(Room newCurrRoom) {
		Room oldCurrRoom = currRoom;
		currRoom = newCurrRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Text_maze_gamePackage.PLAYER__CURR_ROOM, oldCurrRoom,
					currRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Key getKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject) key;
			key = (Key) eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Text_maze_gamePackage.PLAYER__KEY, oldKey,
							key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key basicGetKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(Key newKey) {
		Key oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Text_maze_gamePackage.PLAYER__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectResolvingEList<Item>(Item.class, this, Text_maze_gamePackage.PLAYER__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void pickItems() {
		// you pick them
		for (Item item : currRoom.getItems()) {
			getItems().add(item);
			if (item instanceof Key)
				key = (Key) item;
		}
		// you delete them from the currRoom
		currRoom.getItems().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void move(final Room nextRoom) {
		currRoom = nextRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean useKey() {
		return key != null && currRoom.isExit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map getNeighbooringRoomMap() {
		Map<Integer, Room> m = new HashMap<>();
		int i = 1;
		for (Room r : currRoom.getNeighbooringRooms()) {
			m.put(i++, r);
		}
		return m;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Text_maze_gamePackage.PLAYER__CURR_ROOM:
			if (resolve)
				return getCurrRoom();
			return basicGetCurrRoom();
		case Text_maze_gamePackage.PLAYER__KEY:
			if (resolve)
				return getKey();
			return basicGetKey();
		case Text_maze_gamePackage.PLAYER__ITEMS:
			return getItems();
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
		case Text_maze_gamePackage.PLAYER__CURR_ROOM:
			setCurrRoom((Room) newValue);
			return;
		case Text_maze_gamePackage.PLAYER__KEY:
			setKey((Key) newValue);
			return;
		case Text_maze_gamePackage.PLAYER__ITEMS:
			getItems().clear();
			getItems().addAll((Collection<? extends Item>) newValue);
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
		case Text_maze_gamePackage.PLAYER__CURR_ROOM:
			setCurrRoom((Room) null);
			return;
		case Text_maze_gamePackage.PLAYER__KEY:
			setKey((Key) null);
			return;
		case Text_maze_gamePackage.PLAYER__ITEMS:
			getItems().clear();
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
		case Text_maze_gamePackage.PLAYER__CURR_ROOM:
			return currRoom != null;
		case Text_maze_gamePackage.PLAYER__KEY:
			return key != null;
		case Text_maze_gamePackage.PLAYER__ITEMS:
			return items != null && !items.isEmpty();
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
		case Text_maze_gamePackage.PLAYER___PICK_ITEMS:
			pickItems();
			return null;
		case Text_maze_gamePackage.PLAYER___MOVE__ROOM:
			move((Room) arguments.get(0));
			return null;
		case Text_maze_gamePackage.PLAYER___USE_KEY:
			return useKey();
		case Text_maze_gamePackage.PLAYER___GET_NEIGHBOORING_ROOM_MAP:
			return getNeighbooringRoomMap();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PlayerImpl
