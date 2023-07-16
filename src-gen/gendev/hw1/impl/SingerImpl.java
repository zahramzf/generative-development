/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.MusicBand;
import gendev.hw1.Singer;

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
 * An implementation of the model object '<em><b>Singer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.SingerImpl#getMusicband <em>Musicband</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingerImpl extends MinimalEObjectImpl.Container implements Singer {
	/**
	 * The cached value of the '{@link #getMusicband() <em>Musicband</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusicband()
	 * @generated
	 * @ordered
	 */
	protected EList<MusicBand> musicband;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.SINGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MusicBand> getMusicband() {
		if (musicband == null) {
			musicband = new EObjectContainmentEList<MusicBand>(MusicBand.class, this, Hw1Package.SINGER__MUSICBAND);
		}
		return musicband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.SINGER__MUSICBAND:
			return ((InternalEList<?>) getMusicband()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.SINGER__MUSICBAND:
			return getMusicband();
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
		case Hw1Package.SINGER__MUSICBAND:
			getMusicband().clear();
			getMusicband().addAll((Collection<? extends MusicBand>) newValue);
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
		case Hw1Package.SINGER__MUSICBAND:
			getMusicband().clear();
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
		case Hw1Package.SINGER__MUSICBAND:
			return musicband != null && !musicband.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void setSingerList(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSalary(int i) {
		// TODO Auto-generated method stub
		
	}

} //SingerImpl
