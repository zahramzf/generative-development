/**
 */
package gendev.hw1;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Staff#getAge <em>Age</em>}</li>
 *   <li>{@link gendev.hw1.Staff#getSalary <em>Salary</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getStaff()
 * @model abstract="true"
 * @generated
 */
public interface Staff extends Photographer, Singer, Chef {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(BigInteger)
	 * @see gendev.hw1.Hw1Package#getStaff_Age()
	 * @model
	 * @generated
	 */
	BigInteger getAge();

	/**
	 * Sets the value of the '{@link gendev.hw1.Staff#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(BigInteger)
	 * @see gendev.hw1.Hw1Package#getStaff_Salary()
	 * @model
	 * @generated
	 */
	BigInteger getSalary();

	/**
	 * Sets the value of the '{@link gendev.hw1.Staff#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(BigInteger value);

} // Staff
