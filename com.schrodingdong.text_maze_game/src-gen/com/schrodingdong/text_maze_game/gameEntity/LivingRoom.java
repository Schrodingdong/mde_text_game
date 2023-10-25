/**
 */
package com.schrodingdong.text_maze_game.gameEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Living Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.LivingRoom#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getLivingRoom()
 * @model
 * @generated
 */
public interface LivingRoom extends Room {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Living Room"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getLivingRoom_Name()
	 * @model default="Living Room"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameEntity.LivingRoom#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LivingRoom
