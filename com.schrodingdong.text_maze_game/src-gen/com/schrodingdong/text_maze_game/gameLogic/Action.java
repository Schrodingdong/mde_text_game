/**
 */
package com.schrodingdong.text_maze_game.gameLogic;

import java.util.Scanner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.Action#getGameInstance <em>Game Instance</em>}</li>
 * </ul>
 *
 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Game Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Instance</em>' reference.
	 * @see #setGameInstance(Game)
	 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage#getAction_GameInstance()
	 * @model
	 * @generated
	 */
	Game getGameInstance();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameLogic.Action#getGameInstance <em>Game Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Instance</em>' reference.
	 * @see #getGameInstance()
	 * @generated
	 */
	void setGameInstance(Game value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model scannerDataType="com.schrodingdong.text_maze_game.gameLogic.Scanner"
	 * @generated
	 */
	void doAction(Scanner scanner);

} // Action
