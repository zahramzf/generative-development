/**
 */
package gendev.hw1;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dessert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Dessert#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getDessert()
 * @model
 * @generated
 */
public interface Dessert extends Meals {
	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(BigInteger)
	 * @see gendev.hw1.Hw1Package#getDessert_Counter()
	 * @model
	 * @generated
	 */
	BigInteger getCounter();

	/**
	 * Sets the value of the '{@link gendev.hw1.Dessert#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param i the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int i);

} // Dessert
