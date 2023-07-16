/**
 */
package gendev.hw1;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Payment#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link gendev.hw1.Payment#getRefund <em>Refund</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' attribute.
	 * @see #setPaymentId(BigInteger)
	 * @see gendev.hw1.Hw1Package#getPayment_PaymentId()
	 * @model
	 * @generated
	 */
	BigInteger getPaymentId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getPaymentId <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param i the new value of the '<em>Payment Id</em>' attribute.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(int i);

	/**
	 * Returns the value of the '<em><b>Refund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refund</em>' containment reference.
	 * @see #setRefund(Refund)
	 * @see gendev.hw1.Hw1Package#getPayment_Refund()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Refund getRefund();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getRefund <em>Refund</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refund</em>' containment reference.
	 * @see #getRefund()
	 * @generated
	 */
	void setRefund(Refund value);

} // Payment
