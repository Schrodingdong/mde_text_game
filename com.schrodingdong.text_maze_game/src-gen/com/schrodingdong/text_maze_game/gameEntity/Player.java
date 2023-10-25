/**
 */
package com.schrodingdong.text_maze_game.gameEntity;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.Player#getCurrRoom <em>Curr Room</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.Player#getKey <em>Key</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.Player#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Curr Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curr Room</em>' reference.
	 * @see #setCurrRoom(Room)
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getPlayer_CurrRoom()
	 * @model required="true"
	 * @generated
	 */
	Room getCurrRoom();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameEntity.Player#getCurrRoom <em>Curr Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curr Room</em>' reference.
	 * @see #getCurrRoom()
	 * @generated
	 */
	void setCurrRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Key)
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getPlayer_Key()
	 * @model
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameEntity.Player#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link com.schrodingdong.text_maze_game.gameEntity.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getPlayer_Items()
	 * @model
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pickItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void move(Room nextRoom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean useKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Map getNeighbooringRoomMap();

} // Player
