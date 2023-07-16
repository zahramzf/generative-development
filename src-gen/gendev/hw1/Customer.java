/**
 */
package gendev.hw1;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Customer#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getMeals <em>Meals</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getMusicband <em>Musicband</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getPhotos <em>Photos</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getPayment <em>Payment</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getRefund <em>Refund</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getCustomer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(BigInteger)
	 * @see gendev.hw1.Hw1Package#getCustomer_PhoneNumber()
	 * @model
	 * @generated
	 */
	BigInteger getPhoneNumber();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param i the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(int i);

	/**
	 * Returns the value of the '<em><b>Meals</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Meals}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meals</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getCustomer_Meals()
	 * @model lower="10" upper="65"
	 * @generated
	 */
	EList<Meals> getMeals();

	/**
	 * Returns the value of the '<em><b>Musicband</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musicband</em>' reference.
	 * @see #setMusicband(MusicBand)
	 * @see gendev.hw1.Hw1Package#getCustomer_Musicband()
	 * @model required="true"
	 * @generated
	 */
	MusicBand getMusicband();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getMusicband <em>Musicband</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Musicband</em>' reference.
	 * @see #getMusicband()
	 * @generated
	 */
	void setMusicband(MusicBand value);

	/**
	 * Returns the value of the '<em><b>Photos</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Photos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photos</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getCustomer_Photos()
	 * @model upper="50"
	 * @generated
	 */
	EList<Photos> getPhotos();

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(Payment)
	 * @see gendev.hw1.Hw1Package#getCustomer_Payment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);

	/**
	 * Returns the value of the '<em><b>Refund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refund</em>' containment reference.
	 * @see #setRefund(Refund)
	 * @see gendev.hw1.Hw1Package#getCustomer_Refund()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Refund getRefund();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getRefund <em>Refund</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refund</em>' containment reference.
	 * @see #getRefund()
	 * @generated
	 */
	void setRefund(Refund value);

} // Customer
