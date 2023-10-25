/**
 */
package com.schrodingdong.text_maze_game.gameLogic.impl;

import com.schrodingdong.text_maze_game.gameLogic.*;

import java.util.Collection;
import java.util.Scanner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameLogicFactoryImpl extends EFactoryImpl implements GameLogicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GameLogicFactory init() {
		try {
			GameLogicFactory theGameLogicFactory = (GameLogicFactory) EPackage.Registry.INSTANCE
					.getEFactory(GameLogicPackage.eNS_URI);
			if (theGameLogicFactory != null) {
				return theGameLogicFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GameLogicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameLogicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GameLogicPackage.GAME:
			return createGame();
		case GameLogicPackage.ITEM_CHECK:
			return createItemCheck();
		case GameLogicPackage.NAVIGATION_CHECK:
			return createNavigationCheck();
		case GameLogicPackage.EXIT_CHECK:
			return createExitCheck();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GameLogicPackage.SCANNER:
			return createScannerFromString(eDataType, initialValue);
		case GameLogicPackage.COLLECTION:
			return createcollectionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GameLogicPackage.SCANNER:
			return convertScannerToString(eDataType, instanceValue);
		case GameLogicPackage.COLLECTION:
			return convertcollectionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemCheck createItemCheck() {
		ItemCheckImpl itemCheck = new ItemCheckImpl();
		return itemCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationCheck createNavigationCheck() {
		NavigationCheckImpl navigationCheck = new NavigationCheckImpl();
		return navigationCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExitCheck createExitCheck() {
		ExitCheckImpl exitCheck = new ExitCheckImpl();
		return exitCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scanner createScannerFromString(EDataType eDataType, String initialValue) {
		return (Scanner) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScannerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createcollectionFromString(EDataType eDataType, String initialValue) {
		return (Collection) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcollectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameLogicPackage getGameLogicPackage() {
		return (GameLogicPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GameLogicPackage getPackage() {
		return GameLogicPackage.eINSTANCE;
	}

} //GameLogicFactoryImpl
