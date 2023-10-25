/**
 */
package com.schrodingdong.text_maze_game.gameLogic.impl;

import com.schrodingdong.text_maze_game.gameLogic.ExitCheck;
import com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExitCheckImpl extends ActionImpl implements ExitCheck {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameLogicPackage.Literals.EXIT_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doAction(final Scanner scanner) {
		if (player.getCurrRoom().isExit()) {
			if (player.getKey() != null) {
				System.out.println("Got out safely");
			} else {
				System.out.println("No key in possession...");
			}
		}
		gameInstance.setGameFlag(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GameLogicPackage.EXIT_CHECK___DO_ACTION__SCANNER:
			doAction((Scanner) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExitCheckImpl
