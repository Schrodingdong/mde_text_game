/**
 */
package com.schrodingdong.text_maze_game.impl;

import com.schrodingdong.text_maze_game.Hall;
import com.schrodingdong.text_maze_game.Item;
import com.schrodingdong.text_maze_game.Room;
import com.schrodingdong.text_maze_game.Text_maze_gamePackage;
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
 * An implementation of the model object '<em><b>Hall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.impl.HallImpl#getItems <em>Items</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.impl.HallImpl#isStart <em>Start</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.impl.HallImpl#isExit <em>Exit</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.impl.HallImpl#getNeighbooringRooms <em>Neighbooring Rooms</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.impl.HallImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HallImpl extends MinimalEObjectImpl.Container implements Hall {
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
	protected static final String NAME_EDEFAULT = "Hall";
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
	protected HallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Text_maze_gamePackage.Literals.HALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, Text_maze_gamePackage.HALL__ITEMS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Text_maze_gamePackage.HALL__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Text_maze_gamePackage.HALL__EXIT, oldExit, exit));
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
					Text_maze_gamePackage.HALL__NEIGHBOORING_ROOMS);
		}
		return neighbooringRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getName_();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String roomLocationInfo() {
		String s = "You are currently in : " + this.getName_() + "\n";
		return s;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Text_maze_gamePackage.HALL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Text_maze_gamePackage.HALL__ITEMS:
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
		case Text_maze_gamePackage.HALL__ITEMS:
			return getItems();
		case Text_maze_gamePackage.HALL__START:
			return isStart();
		case Text_maze_gamePackage.HALL__EXIT:
			return isExit();
		case Text_maze_gamePackage.HALL__NEIGHBOORING_ROOMS:
			return getNeighbooringRooms();
		case Text_maze_gamePackage.HALL__NAME:
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
		case Text_maze_gamePackage.HALL__ITEMS:
			getItems().clear();
			getItems().addAll((Collection<? extends Item>) newValue);
			return;
		case Text_maze_gamePackage.HALL__START:
			setStart((Boolean) newValue);
			return;
		case Text_maze_gamePackage.HALL__EXIT:
			setExit((Boolean) newValue);
			return;
		case Text_maze_gamePackage.HALL__NEIGHBOORING_ROOMS:
			getNeighbooringRooms().clear();
			getNeighbooringRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case Text_maze_gamePackage.HALL__NAME:
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
		case Text_maze_gamePackage.HALL__ITEMS:
			getItems().clear();
			return;
		case Text_maze_gamePackage.HALL__START:
			setStart(START_EDEFAULT);
			return;
		case Text_maze_gamePackage.HALL__EXIT:
			setExit(EXIT_EDEFAULT);
			return;
		case Text_maze_gamePackage.HALL__NEIGHBOORING_ROOMS:
			getNeighbooringRooms().clear();
			return;
		case Text_maze_gamePackage.HALL__NAME:
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
		case Text_maze_gamePackage.HALL__ITEMS:
			return items != null && !items.isEmpty();
		case Text_maze_gamePackage.HALL__START:
			return start != START_EDEFAULT;
		case Text_maze_gamePackage.HALL__EXIT:
			return exit != EXIT_EDEFAULT;
		case Text_maze_gamePackage.HALL__NEIGHBOORING_ROOMS:
			return neighbooringRooms != null && !neighbooringRooms.isEmpty();
		case Text_maze_gamePackage.HALL__NAME:
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
		case Text_maze_gamePackage.HALL___GET_NAME:
			return getName();
		case Text_maze_gamePackage.HALL___ROOM_LOCATION_INFO:
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

} //HallImpl
