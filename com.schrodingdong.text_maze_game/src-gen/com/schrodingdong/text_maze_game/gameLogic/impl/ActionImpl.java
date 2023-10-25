/**
 */
package com.schrodingdong.text_maze_game.gameLogic.impl;

import com.schrodingdong.text_maze_game.gameLogic.Action;
import com.schrodingdong.text_maze_game.gameLogic.Game;
import com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Scanner;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameLogic.impl.ActionImpl#getGameInstance <em>Game Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getGameInstance() <em>Game Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameInstance()
	 * @generated
	 * @ordered
	 */
	protected Game gameInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameLogicPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game getGameInstance() {
		if (gameInstance != null && gameInstance.eIsProxy()) {
			InternalEObject oldGameInstance = (InternalEObject) gameInstance;
			gameInstance = (Game) eResolveProxy(oldGameInstance);
			if (gameInstance != oldGameInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameLogicPackage.ACTION__GAME_INSTANCE,
							oldGameInstance, gameInstance));
			}
		}
		return gameInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game basicGetGameInstance() {
		return gameInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameInstance(Game newGameInstance) {
		Game oldGameInstance = gameInstance;
		gameInstance = newGameInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GameLogicPackage.ACTION__GAME_INSTANCE,
					oldGameInstance, gameInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doAction(Scanner scanner) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GameLogicPackage.ACTION__GAME_INSTANCE:
			if (resolve)
				return getGameInstance();
			return basicGetGameInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GameLogicPackage.ACTION__GAME_INSTANCE:
			setGameInstance((Game) newValue);
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
		case GameLogicPackage.ACTION__GAME_INSTANCE:
			setGameInstance((Game) null);
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
		case GameLogicPackage.ACTION__GAME_INSTANCE:
			return gameInstance != null;
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
		case GameLogicPackage.ACTION___DO_ACTION__SCANNER:
			doAction((Scanner) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionImpl
