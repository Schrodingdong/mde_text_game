/**
 */
package com.schrodingdong.text_maze_game.gameEntity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.House#getRoom <em>Room</em>}</li>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.House#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getHouse()
 * @model
 * @generated
 */
public interface House extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link com.schrodingdong.text_maze_game.gameEntity.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getHouse_Room()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getHouse_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameEntity.House#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

} // House
