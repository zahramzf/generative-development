/**
 */
package gendev.hw1;

import java.math.BigInteger;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.MainCourse#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getMainCourse()
 * @model
 * @generated
 */
public interface MainCourse extends Meals {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(BigInteger)
	 * @see gendev.hw1.Hw1Package#getMainCourse_Count()
	 * @model
	 * @generated
	 */
	BigInteger getCount();

	/**
	 * Sets the value of the '{@link gendev.hw1.MainCourse#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param i the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int i);

	List<Photos> getDessert();

} // MainCourse
