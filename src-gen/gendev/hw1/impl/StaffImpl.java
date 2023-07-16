/**
 */
package gendev.hw1.impl;

import gendev.hw1.Chef;
import gendev.hw1.Hw1Package;
import gendev.hw1.Meals;
import gendev.hw1.MusicBand;
import gendev.hw1.Singer;
import gendev.hw1.Staff;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.StaffImpl#getMusicband <em>Musicband</em>}</li>
 *   <li>{@link gendev.hw1.impl.StaffImpl#getMeals <em>Meals</em>}</li>
 *   <li>{@link gendev.hw1.impl.StaffImpl#getAge <em>Age</em>}</li>
 *   <li>{@link gendev.hw1.impl.StaffImpl#getSalary <em>Salary</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StaffImpl extends PhotographerImpl implements Staff {
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
	 * The cached value of the '{@link #getMeals() <em>Meals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeals()
	 * @generated
	 * @ordered
	 */
	protected Meals meals;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected BigInteger age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SALARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected BigInteger salary = SALARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MusicBand> getMusicband() {
		if (musicband == null) {
			musicband = new EObjectContainmentEList<MusicBand>(MusicBand.class, this, Hw1Package.STAFF__MUSICBAND);
		}
		return musicband;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hw1Package.STAFF__MEALS,
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
				msgs = ((InternalEObject) meals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hw1Package.STAFF__MEALS,
						null, msgs);
			if (newMeals != null)
				msgs = ((InternalEObject) newMeals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hw1Package.STAFF__MEALS,
						null, msgs);
			msgs = basicSetMeals(newMeals, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.STAFF__MEALS, newMeals, newMeals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(BigInteger newAge) {
		BigInteger oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.STAFF__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(BigInteger newSalary) {
		BigInteger oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.STAFF__SALARY, oldSalary, salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.STAFF__MUSICBAND:
			return ((InternalEList<?>) getMusicband()).basicRemove(otherEnd, msgs);
		case Hw1Package.STAFF__MEALS:
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
		case Hw1Package.STAFF__MUSICBAND:
			return getMusicband();
		case Hw1Package.STAFF__MEALS:
			return getMeals();
		case Hw1Package.STAFF__AGE:
			return getAge();
		case Hw1Package.STAFF__SALARY:
			return getSalary();
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
		case Hw1Package.STAFF__MUSICBAND:
			getMusicband().clear();
			getMusicband().addAll((Collection<? extends MusicBand>) newValue);
			return;
		case Hw1Package.STAFF__MEALS:
			setMeals((Meals) newValue);
			return;
		case Hw1Package.STAFF__AGE:
			setAge((BigInteger) newValue);
			return;
		case Hw1Package.STAFF__SALARY:
			setSalary((BigInteger) newValue);
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
		case Hw1Package.STAFF__MUSICBAND:
			getMusicband().clear();
			return;
		case Hw1Package.STAFF__MEALS:
			setMeals((Meals) null);
			return;
		case Hw1Package.STAFF__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case Hw1Package.STAFF__SALARY:
			setSalary(SALARY_EDEFAULT);
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
		case Hw1Package.STAFF__MUSICBAND:
			return musicband != null && !musicband.isEmpty();
		case Hw1Package.STAFF__MEALS:
			return meals != null;
		case Hw1Package.STAFF__AGE:
			return AGE_EDEFAULT == null ? age != null : !AGE_EDEFAULT.equals(age);
		case Hw1Package.STAFF__SALARY:
			return SALARY_EDEFAULT == null ? salary != null : !SALARY_EDEFAULT.equals(salary);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Singer.class) {
			switch (derivedFeatureID) {
			case Hw1Package.STAFF__MUSICBAND:
				return Hw1Package.SINGER__MUSICBAND;
			default:
				return -1;
			}
		}
		if (baseClass == Chef.class) {
			switch (derivedFeatureID) {
			case Hw1Package.STAFF__MEALS:
				return Hw1Package.CHEF__MEALS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Singer.class) {
			switch (baseFeatureID) {
			case Hw1Package.SINGER__MUSICBAND:
				return Hw1Package.STAFF__MUSICBAND;
			default:
				return -1;
			}
		}
		if (baseClass == Chef.class) {
			switch (baseFeatureID) {
			case Hw1Package.CHEF__MEALS:
				return Hw1Package.STAFF__MEALS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (Age: ");
		result.append(age);
		result.append(", Salary: ");
		result.append(salary);
		result.append(')');
		return result.toString();
	}

} //StaffImpl
