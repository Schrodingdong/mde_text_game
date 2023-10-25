/**
 */
package com.schrodingdong.text_maze_game.gameLogic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage
 * @generated
 */
public interface GameLogicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GameLogicFactory eINSTANCE = com.schrodingdong.text_maze_game.gameLogic.impl.GameLogicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Item Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Check</em>'.
	 * @generated
	 */
	ItemCheck createItemCheck();

	/**
	 * Returns a new object of class '<em>Navigation Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Check</em>'.
	 * @generated
	 */
	NavigationCheck createNavigationCheck();

	/**
	 * Returns a new object of class '<em>Exit Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Check</em>'.
	 * @generated
	 */
	ExitCheck createExitCheck();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GameLogicPackage getGameLogicPackage();

} //GameLogicFactory
