/**
 */
package gendev.hw1.impl;

import gendev.hw1.Chef;
import gendev.hw1.Hw1Package;
import gendev.hw1.Meals;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.ChefImpl#getMeals <em>Meals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChefImpl extends MinimalEObjectImpl.Container implements Chef {
	/**
	 * The cached value of the '{@link #getMeals() <em>Meals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeals()
	 * @generated
	 * @ordered
	 */
	protected Meals meals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.CHEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meals getMeals() {
		return meals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeals(Meals newMeals, NotificationChain msgs) {
		Meals oldMeals = meals;
		meals = newMeals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hw1Package.CHEF__MEALS,
					oldMeals, newMeals);
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
	public void setMeals(Meals newMeals) {
		if (newMeals != meals) {
			NotificationChain msgs = null;
			if (meals != null)
				msgs = ((InternalEObject) meals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hw1Package.CHEF__MEALS,
						null, msgs);
			if (newMeals != null)
				msgs = ((InternalEObject) newMeals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hw1Package.CHEF__MEALS,
						null, msgs);
			msgs = basicSetMeals(newMeals, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CHEF__MEALS, newMeals, newMeals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.CHEF__MEALS:
			return basicSetMeals(null, msgs);
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
		case Hw1Package.CHEF__MEALS:
			return getMeals();
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
		case Hw1Package.CHEF__MEALS:
			setMeals((Meals) newValue);
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
		case Hw1Package.CHEF__MEALS:
			setMeals((Meals) null);
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
		case Hw1Package.CHEF__MEALS:
			return meals != null;
		}
		return super.eIsSet(featureID);
	}

} //ChefImpl
