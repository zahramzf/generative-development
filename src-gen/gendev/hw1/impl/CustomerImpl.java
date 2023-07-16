/**
 */
package gendev.hw1.impl;

import gendev.hw1.Customer;
import gendev.hw1.Hw1Package;
import gendev.hw1.Meals;
import gendev.hw1.MusicBand;
import gendev.hw1.Payment;
import gendev.hw1.Photos;
import gendev.hw1.Refund;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getMeals <em>Meals</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getMusicband <em>Musicband</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getPhotos <em>Photos</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getRefund <em>Refund</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeals() <em>Meals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeals()
	 * @generated
	 * @ordered
	 */
	protected EList<Meals> meals;

	/**
	 * The cached value of the '{@link #getMusicband() <em>Musicband</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusicband()
	 * @generated
	 * @ordered
	 */
	protected MusicBand musicband;

	/**
	 * The cached value of the '{@link #getPhotos() <em>Photos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected EList<Photos> photos;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected Payment payment;

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
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(BigInteger newPhoneNumber) {
		BigInteger oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__PHONE_NUMBER, oldPhoneNumber,
					phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meals> getMeals() {
		if (meals == null) {
			meals = new EObjectResolvingEList<Meals>(Meals.class, this, Hw1Package.CUSTOMER__MEALS);
		}
		return meals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicBand getMusicband() {
		if (musicband != null && musicband.eIsProxy()) {
			InternalEObject oldMusicband = (InternalEObject) musicband;
			musicband = (MusicBand) eResolveProxy(oldMusicband);
			if (musicband != oldMusicband) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.CUSTOMER__MUSICBAND,
							oldMusicband, musicband));
			}
		}
		return musicband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicBand basicGetMusicband() {
		return musicband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMusicband(MusicBand newMusicband) {
		MusicBand oldMusicband = musicband;
		musicband = newMusicband;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__MUSICBAND, oldMusicband,
					musicband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Photos> getPhotos() {
		if (photos == null) {
			photos = new EObjectResolvingEList<Photos>(Photos.class, this, Hw1Package.CUSTOMER__PHOTOS);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(Payment newPayment, NotificationChain msgs) {
		Payment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__PAYMENT,
					oldPayment, newPayment);
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
	public void setPayment(Payment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject) payment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.CUSTOMER__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject) newPayment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.CUSTOMER__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__PAYMENT, newPayment,
					newPayment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__REFUND,
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
						EOPPOSITE_FEATURE_BASE - Hw1Package.CUSTOMER__REFUND, null, msgs);
			if (newRefund != null)
				msgs = ((InternalEObject) newRefund).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.CUSTOMER__REFUND, null, msgs);
			msgs = basicSetRefund(newRefund, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__REFUND, newRefund, newRefund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.CUSTOMER__PAYMENT:
			return basicSetPayment(null, msgs);
		case Hw1Package.CUSTOMER__REFUND:
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
		case Hw1Package.CUSTOMER__NAME:
			return getName();
		case Hw1Package.CUSTOMER__PHONE_NUMBER:
			return getPhoneNumber();
		case Hw1Package.CUSTOMER__MEALS:
			return getMeals();
		case Hw1Package.CUSTOMER__MUSICBAND:
			if (resolve)
				return getMusicband();
			return basicGetMusicband();
		case Hw1Package.CUSTOMER__PHOTOS:
			return getPhotos();
		case Hw1Package.CUSTOMER__PAYMENT:
			return getPayment();
		case Hw1Package.CUSTOMER__REFUND:
			return getRefund();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.CUSTOMER__NAME:
			setName((String) newValue);
			return;
		case Hw1Package.CUSTOMER__PHONE_NUMBER:
			setPhoneNumber((BigInteger) newValue);
			return;
		case Hw1Package.CUSTOMER__MEALS:
			getMeals().clear();
			getMeals().addAll((Collection<? extends Meals>) newValue);
			return;
		case Hw1Package.CUSTOMER__MUSICBAND:
			setMusicband((MusicBand) newValue);
			return;
		case Hw1Package.CUSTOMER__PHOTOS:
			getPhotos().clear();
			getPhotos().addAll((Collection<? extends Photos>) newValue);
			return;
		case Hw1Package.CUSTOMER__PAYMENT:
			setPayment((Payment) newValue);
			return;
		case Hw1Package.CUSTOMER__REFUND:
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
		case Hw1Package.CUSTOMER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Hw1Package.CUSTOMER__PHONE_NUMBER:
			setPhoneNumber(PHONE_NUMBER_EDEFAULT);
			return;
		case Hw1Package.CUSTOMER__MEALS:
			getMeals().clear();
			return;
		case Hw1Package.CUSTOMER__MUSICBAND:
			setMusicband((MusicBand) null);
			return;
		case Hw1Package.CUSTOMER__PHOTOS:
			getPhotos().clear();
			return;
		case Hw1Package.CUSTOMER__PAYMENT:
			setPayment((Payment) null);
			return;
		case Hw1Package.CUSTOMER__REFUND:
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
		case Hw1Package.CUSTOMER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Hw1Package.CUSTOMER__PHONE_NUMBER:
			return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
		case Hw1Package.CUSTOMER__MEALS:
			return meals != null && !meals.isEmpty();
		case Hw1Package.CUSTOMER__MUSICBAND:
			return musicband != null;
		case Hw1Package.CUSTOMER__PHOTOS:
			return photos != null && !photos.isEmpty();
		case Hw1Package.CUSTOMER__PAYMENT:
			return payment != null;
		case Hw1Package.CUSTOMER__REFUND:
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", PhoneNumber: ");
		result.append(phoneNumber);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setPhoneNumber(int i) {
		// TODO Auto-generated method stub
		
	}

} //CustomerImpl
