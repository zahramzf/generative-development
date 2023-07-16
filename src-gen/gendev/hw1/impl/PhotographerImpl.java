/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.Photographer;
import gendev.hw1.Photos;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photographer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.PhotographerImpl#getPhotographypart <em>Photographypart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhotographerImpl extends MinimalEObjectImpl.Container implements Photographer {
	/**
	 * The cached value of the '{@link #getPhotographypart() <em>Photographypart</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotographypart()
	 * @generated
	 * @ordered
	 */
	protected EList<Photos> photographypart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotographerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PHOTOGRAPHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Photos> getPhotographypart() {
		if (photographypart == null) {
			photographypart = new EObjectContainmentEList<Photos>(Photos.class, this,
					Hw1Package.PHOTOGRAPHER__PHOTOGRAPHYPART);
		}
		return photographypart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.PHOTOGRAPHER__PHOTOGRAPHYPART:
			return ((InternalEList<?>) getPhotographypart()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.PHOTOGRAPHER__PHOTOGRAPHYPART:
			return getPhotographypart();
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
		case Hw1Package.PHOTOGRAPHER__PHOTOGRAPHYPART:
			getPhotographypart().clear();
			getPhotographypart().addAll((Collection<? extends Photos>) newValue);
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
		case Hw1Package.PHOTOGRAPHER__PHOTOGRAPHYPART:
			getPhotographypart().clear();
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
		case Hw1Package.PHOTOGRAPHER__PHOTOGRAPHYPART:
			return photographypart != null && !photographypart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhotographerImpl
