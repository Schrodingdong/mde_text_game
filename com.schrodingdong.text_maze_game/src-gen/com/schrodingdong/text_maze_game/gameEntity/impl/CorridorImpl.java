/**
 */
package com.schrodingdong.text_maze_game.gameEntity.impl;

import com.schrodingdong.text_maze_game.gameEntity.Corridor;
import com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage;
import com.schrodingdong.text_maze_game.gameEntity.Item;
import com.schrodingdong.text_maze_game.gameEntity.Room;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 * An implementation of the model object '<em><b>Corridor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.impl.CorridorImpl#getItems <em>Items</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.impl.CorridorImpl#isStart <em>Start</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.impl.CorridorImpl#isExit <em>Exit</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.impl.CorridorImpl#getNeighbooringRooms <em>Neighbooring Rooms</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.impl.CorridorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorridorImpl extends MinimalEObjectImpl.Container implements Corridor {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The default value of the '{@link #isStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStart()
	 * @generated
	 * @ordered
	 */
	protected boolean start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #isExit() <em>Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExit() <em>Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExit()
	 * @generated
	 * @ordered
	 */
	protected boolean exit = EXIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNeighbooringRooms() <em>Neighbooring Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbooringRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> neighbooringRooms;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Corridor";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorridorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameEntityPackage.Literals.CORRIDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, GameEntityPackage.CORRIDOR__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(boolean newStart) {
		boolean oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameEntityPackage.CORRIDOR__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExit(boolean newExit) {
		boolean oldExit = exit;
		exit = newExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameEntityPackage.CORRIDOR__EXIT, oldExit, exit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Room> getNeighbooringRooms() {
		if (neighbooringRooms == null) {
			neighbooringRooms = new EObjectResolvingEList<Room>(Room.class, this,
					GameEntityPackage.CORRIDOR__NEIGHBOORING_ROOMS);
		}
		return neighbooringRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameEntityPackage.CORRIDOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String roomLocationInfo() {
		String s = "You are currently in : " + this.getName() + "\n";
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GameEntityPackage.CORRIDOR__ITEMS:
			return ((InternalEList<?>) getItems()).basicRemove(otherEnd, msgs);
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
		case GameEntityPackage.CORRIDOR__ITEMS:
			return getItems();
		case GameEntityPackage.CORRIDOR__START:
			return isStart();
		case GameEntityPackage.CORRIDOR__EXIT:
			return isExit();
		case GameEntityPackage.CORRIDOR__NEIGHBOORING_ROOMS:
			return getNeighbooringRooms();
		case GameEntityPackage.CORRIDOR__NAME:
			return getName();
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
		case GameEntityPackage.CORRIDOR__ITEMS:
			getItems().clear();
			getItems().addAll((Collection<? extends Item>) newValue);
			return;
		case GameEntityPackage.CORRIDOR__START:
			setStart((Boolean) newValue);
			return;
		case GameEntityPackage.CORRIDOR__EXIT:
			setExit((Boolean) newValue);
			return;
		case GameEntityPackage.CORRIDOR__NEIGHBOORING_ROOMS:
			getNeighbooringRooms().clear();
			getNeighbooringRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case GameEntityPackage.CORRIDOR__NAME:
			setName((String) newValue);
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
		case GameEntityPackage.CORRIDOR__ITEMS:
			getItems().clear();
			return;
		case GameEntityPackage.CORRIDOR__START:
			setStart(START_EDEFAULT);
			return;
		case GameEntityPackage.CORRIDOR__EXIT:
			setExit(EXIT_EDEFAULT);
			return;
		case GameEntityPackage.CORRIDOR__NEIGHBOORING_ROOMS:
			getNeighbooringRooms().clear();
			return;
		case GameEntityPackage.CORRIDOR__NAME:
			setName(NAME_EDEFAULT);
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
		case GameEntityPackage.CORRIDOR__ITEMS:
			return items != null && !items.isEmpty();
		case GameEntityPackage.CORRIDOR__START:
			return start != START_EDEFAULT;
		case GameEntityPackage.CORRIDOR__EXIT:
			return exit != EXIT_EDEFAULT;
		case GameEntityPackage.CORRIDOR__NEIGHBOORING_ROOMS:
			return neighbooringRooms != null && !neighbooringRooms.isEmpty();
		case GameEntityPackage.CORRIDOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		case GameEntityPackage.CORRIDOR___ROOM_LOCATION_INFO:
			return roomLocationInfo();
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
		result.append(" (start: ");
		result.append(start);
		result.append(", exit: ");
		result.append(exit);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CorridorImpl
