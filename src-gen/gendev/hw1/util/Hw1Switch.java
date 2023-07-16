/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hw1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Switch() {
		if (modelPackage == null) {
			modelPackage = Hw1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Hw1Package.CUSTOMER: {
			Customer customer = (Customer) theEObject;
			T result = caseCustomer(customer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.REFUND: {
			Refund refund = (Refund) theEObject;
			T result = caseRefund(refund);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.SINGER: {
			Singer singer = (Singer) theEObject;
			T result = caseSinger(singer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.PHOTOGRAPHER: {
			Photographer photographer = (Photographer) theEObject;
			T result = casePhotographer(photographer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.PAYMENT: {
			Payment payment = (Payment) theEObject;
			T result = casePayment(payment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.MUSIC_BAND: {
			MusicBand musicBand = (MusicBand) theEObject;
			T result = caseMusicBand(musicBand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.STAFF: {
			Staff staff = (Staff) theEObject;
			T result = caseStaff(staff);
			if (result == null)
				result = casePhotographer(staff);
			if (result == null)
				result = caseSinger(staff);
			if (result == null)
				result = caseChef(staff);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.CHEF: {
			Chef chef = (Chef) theEObject;
			T result = caseChef(chef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.MEALS: {
			Meals meals = (Meals) theEObject;
			T result = caseMeals(meals);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.MAIN_COURSE: {
			MainCourse mainCourse = (MainCourse) theEObject;
			T result = caseMainCourse(mainCourse);
			if (result == null)
				result = caseMeals(mainCourse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.DESSERT: {
			Dessert dessert = (Dessert) theEObject;
			T result = caseDessert(dessert);
			if (result == null)
				result = caseMeals(dessert);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.PHOTOS: {
			Photos photos = (Photos) theEObject;
			T result = casePhotos(photos);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refund</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refund</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefund(Refund object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinger(Singer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photographer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photographer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotographer(Photographer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayment(Payment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Music Band</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Music Band</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMusicBand(MusicBand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaff(Staff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChef(Chef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeals(Meals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainCourse(MainCourse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dessert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dessert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDessert(Dessert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotos(Photos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Hw1Switch
