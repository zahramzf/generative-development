/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.Payment;
import gendev.hw1.Refund;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getRefund <em>Refund</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * The default value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PAYMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger paymentId = PAYMENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefund() <em>Refund</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefund()
	 * @generated
	 * @ordered
	 */
	protected Refund refund;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentId(BigInteger newPaymentId) {
		BigInteger oldPaymentId = paymentId;
		paymentId = newPaymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__PAYMENT_ID, oldPaymentId,
					paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refund getRefund() {
		return refund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefund(Refund newRefund, NotificationChain msgs) {
		Refund oldRefund = refund;
		refund = newRefund;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__REFUND,
					oldRefund, newRefund);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefund(Refund newRefund) {
		if (newRefund != refund) {
			NotificationChain msgs = null;
			if (refund != null)
				msgs = ((InternalEObject) refund).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.PAYMENT__REFUND, null, msgs);
			if (newRefund != null)
				msgs = ((InternalEObject) newRefund).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.PAYMENT__REFUND, null, msgs);
			msgs = basicSetRefund(newRefund, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__REFUND, newRefund, newRefund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.PAYMENT__REFUND:
			return basicSetRefund(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.PAYMENT__PAYMENT_ID:
			return getPaymentId();
		case Hw1Package.PAYMENT__REFUND:
			return getRefund();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.PAYMENT__PAYMENT_ID:
			setPaymentId((BigInteger) newValue);
			return;
		case Hw1Package.PAYMENT__REFUND:
			setRefund((Refund) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Hw1Package.PAYMENT__PAYMENT_ID:
			setPaymentId(PAYMENT_ID_EDEFAULT);
			return;
		case Hw1Package.PAYMENT__REFUND:
			setRefund((Refund) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Hw1Package.PAYMENT__PAYMENT_ID:
			return PAYMENT_ID_EDEFAULT == null ? paymentId != null : !PAYMENT_ID_EDEFAULT.equals(paymentId);
		case Hw1Package.PAYMENT__REFUND:
			return refund != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (PaymentId: ");
		result.append(paymentId);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setPaymentId(int i) {
		// TODO Auto-generated method stub
		
	}

} //PaymentImpl
