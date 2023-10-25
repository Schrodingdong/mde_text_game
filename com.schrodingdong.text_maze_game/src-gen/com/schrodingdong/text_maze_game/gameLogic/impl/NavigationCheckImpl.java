/**
 */
package com.schrodingdong.text_maze_game.gameLogic.impl;

import com.schrodingdong.text_maze_game.gameLogic.GameLogicPackage;
import com.schrodingdong.text_maze_game.gameLogic.NavigationCheck;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NavigationCheckImpl extends ActionImpl implements NavigationCheck {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GameLogicPackage.Literals.NAVIGATION_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doAction(final Scanner scanner) {
		Map<Integer, Room> roomMap = player.getNeighbooringRoomMap();
		System.out.println("Neighbooring rooms :");
		for (Entry<Integer, Room> e : roomMap.entrySet()) {
			System.out.println("\t" + e.getKey() + "- " + e.getValue().getName());
		}

		System.out.println("Which room (index) you want to go to ?");
		try {
			int roomIndex = scanner.nextInt();
			Room nextRoom = null;
			for (Entry<Integer, Room> e : roomMap.entrySet()) {
				if (e.getKey() == roomIndex) {
					nextRoom = e.getValue();
					break;
				}
			}
			if (nextRoom == null) {
				System.out.println("Can't Do this sowwy >.<");
			} else {
				player.move(nextRoom);
			}
		} catch (InputMismatchException e) {
			System.out.println("wrong input ...");
			scanner.nextLine();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GameLogicPackage.NAVIGATION_CHECK___DO_ACTION__SCANNER:
			doAction((Scanner) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //NavigationCheckImpl
