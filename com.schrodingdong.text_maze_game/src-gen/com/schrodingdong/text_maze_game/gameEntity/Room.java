/**
 */
package com.schrodingdong.text_maze_game.gameEntity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.Room#getItems <em>Items</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.Room#isStart <em>Start</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.Room#isExit <em>Exit</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.Room#getNeighbooringRooms <em>Neighbooring Rooms</em>}</li>
 * </ul>
 *
 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getRoom()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link com.schrodingdong.text_maze_game.gameEntity.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getRoom_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(boolean)
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getRoom_Start()
	 * @model
	 * @generated
	 */
	boolean isStart();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameEntity.Room#isStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #isStart()
	 * @generated
	 */
	void setStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' attribute.
	 * @see #setExit(boolean)
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getRoom_Exit()
	 * @model
	 * @generated
	 */
	boolean isExit();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameEntity.Room#isExit <em>Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' attribute.
	 * @see #isExit()
	 * @generated
	 */
	void setExit(boolean value);

	/**
	 * Returns the value of the '<em><b>Neighbooring Rooms</b></em>' reference list.
	 * The list contents are of type {@link com.schrodingdong.text_maze_game.gameEntity.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbooring Rooms</em>' reference list.
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getRoom_NeighbooringRooms()
	 * @model
	 * @generated
	 */
	EList<Room> getNeighbooringRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String roomLocationInfo();

} // Room
