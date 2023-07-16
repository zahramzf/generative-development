/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hw1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Hw1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hw1Switch<Adapter> modelSwitch = new Hw1Switch<Adapter>() {
		@Override
		public Adapter caseCustomer(Customer object) {
			return createCustomerAdapter();
		}

		@Override
		public Adapter caseRefund(Refund object) {
			return createRefundAdapter();
		}

		@Override
		public Adapter caseSinger(Singer object) {
			return createSingerAdapter();
		}

		@Override
		public Adapter casePhotographer(Photographer object) {
			return createPhotographerAdapter();
		}

		@Override
		public Adapter casePayment(Payment object) {
			return createPaymentAdapter();
		}

		@Override
		public Adapter caseMusicBand(MusicBand object) {
			return createMusicBandAdapter();
		}

		@Override
		public Adapter caseStaff(Staff object) {
			return createStaffAdapter();
		}

		@Override
		public Adapter caseChef(Chef object) {
			return createChefAdapter();
		}

		@Override
		public Adapter caseMeals(Meals object) {
			return createMealsAdapter();
		}

		@Override
		public Adapter caseMainCourse(MainCourse object) {
			return createMainCourseAdapter();
		}

		@Override
		public Adapter caseDessert(Dessert object) {
			return createDessertAdapter();
		}

		@Override
		public Adapter casePhotos(Photos object) {
			return createPhotosAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Refund <em>Refund</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Refund
	 * @generated
	 */
	public Adapter createRefundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Singer <em>Singer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Singer
	 * @generated
	 */
	public Adapter createSingerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Photographer <em>Photographer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Photographer
	 * @generated
	 */
	public Adapter createPhotographerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Payment
	 * @generated
	 */
	public Adapter createPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.MusicBand <em>Music Band</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.MusicBand
	 * @generated
	 */
	public Adapter createMusicBandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Staff
	 * @generated
	 */
	public Adapter createStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Chef <em>Chef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Chef
	 * @generated
	 */
	public Adapter createChefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Meals <em>Meals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Meals
	 * @generated
	 */
	public Adapter createMealsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.MainCourse <em>Main Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.MainCourse
	 * @generated
	 */
	public Adapter createMainCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Dessert <em>Dessert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Dessert
	 * @generated
	 */
	public Adapter createDessertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Photos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Photos
	 * @generated
	 */
	public Adapter createPhotosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Hw1AdapterFactory
