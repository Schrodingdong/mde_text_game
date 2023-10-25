/**
 */
package com.schrodingdong.text_maze_game.gameLogic.impl;

import com.schrodingdong.text_maze_game.gameEntity.Item;
import com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage;
import com.schrodingdong.text_maze_game.gameLogic.ItemCheck;

import java.lang.reflect.InvocationTargetException;

import java.util.Scanner;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemCheckImpl extends ActionImpl implements ItemCheck {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameLogicPackage.Literals.ITEM_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doAction(final Scanner scanner) {
		if (gameInstance.getPlayer().getCurrRoom().getItems().isEmpty()) {
			System.out.println("Nothing here...");
			return;
		}

		// List them
		System.out.println("You picked the following items in this room : ");
		for (Item i : gameInstance.getPlayer().getCurrRoom().getItems()) {
			System.out.println("\t- " + i.getName() + "\n");
		}
		// pick them up
		gameInstance.getPlayer().pickItems();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GameLogicPackage.ITEM_CHECK___DO_ACTION__SCANNER:
			doAction((Scanner) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ItemCheckImpl
