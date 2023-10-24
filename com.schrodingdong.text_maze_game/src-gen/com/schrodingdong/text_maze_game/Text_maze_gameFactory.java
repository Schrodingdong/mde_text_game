/**
 */
package com.schrodingdong.text_maze_game;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.schrodingdong.text_maze_game.Text_maze_gamePackage
 * @generated
 */
public interface Text_maze_gameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Text_maze_gameFactory eINSTANCE = com.schrodingdong.text_maze_game.impl.Text_maze_gameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key</em>'.
	 * @generated
	 */
	Key createKey();

	/**
	 * Returns a new object of class '<em>Bedroom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bedroom</em>'.
	 * @generated
	 */
	Bedroom createBedroom();

	/**
	 * Returns a new object of class '<em>Kitchen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kitchen</em>'.
	 * @generated
	 */
	Kitchen createKitchen();

	/**
	 * Returns a new object of class '<em>Living Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Living Room</em>'.
	 * @generated
	 */
	LivingRoom createLivingRoom();

	/**
	 * Returns a new object of class '<em>Corridor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corridor</em>'.
	 * @generated
	 */
	Corridor createCorridor();

	/**
	 * Returns a new object of class '<em>Hall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hall</em>'.
	 * @generated
	 */
	Hall createHall();

	/**
	 * Returns a new object of class '<em>Balcony</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Balcony</em>'.
	 * @generated
	 */
	Balcony createBalcony();

	/**
	 * Returns a new object of class '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>House</em>'.
	 * @generated
	 */
	House createHouse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Text_maze_gamePackage getText_maze_gamePackage();

} //Text_maze_gameFactory
