/**
 */
package com.schrodingdong.text_maze_game.gameEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedroom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.schrodingdong.text_maze_game.gameEntity.Bedroom#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getBedroom()
 * @model
 * @generated
 */
public interface Bedroom extends Room {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Bedroom"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.schrodingdong.text_maze_game.gameEntity.GameEntityPackage#getBedroom_Name()
	 * @model default="Bedroom"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.schrodingdong.text_maze_game.gameEntity.Bedroom#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Bedroom
