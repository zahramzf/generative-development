/**
 */
package gendev.hw1;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refund</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Refund#getRefundId <em>Refund Id</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getRefund()
 * @model
 * @generated
 */
public interface Refund extends EObject {
	/**
	 * Returns the value of the '<em><b>Refund Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refund Id</em>' attribute.
	 * @see #setRefundId(BigInteger)
	 * @see gendev.hw1.Hw1Package#getRefund_RefundId()
	 * @model
	 * @generated
	 */
	BigInteger getRefundId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Refund#getRefundId <em>Refund Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refund Id</em>' attribute.
	 * @see #getRefundId()
	 * @generated
	 */
	void setRefundId(BigInteger value);

} // Refund
