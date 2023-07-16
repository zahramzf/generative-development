/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public interface Hw1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Factory eINSTANCE = gendev.hw1.impl.Hw1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Refund</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refund</em>'.
	 * @generated
	 */
	Refund createRefund();

	/**
	 * Returns a new object of class '<em>Singer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singer</em>'.
	 * @generated
	 */
	Singer createSinger();

	/**
	 * Returns a new object of class '<em>Photographer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photographer</em>'.
	 * @generated
	 */
	Photographer createPhotographer();

	/**
	 * Returns a new object of class '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment</em>'.
	 * @generated
	 */
	Payment createPayment();

	/**
	 * Returns a new object of class '<em>Music Band</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Music Band</em>'.
	 * @generated
	 */
	MusicBand createMusicBand();

	/**
	 * Returns a new object of class '<em>Chef</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chef</em>'.
	 * @generated
	 */
	Chef createChef();

	/**
	 * Returns a new object of class '<em>Meals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meals</em>'.
	 * @generated
	 */
	Meals createMeals();

	/**
	 * Returns a new object of class '<em>Main Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Course</em>'.
	 * @generated
	 */
	MainCourse createMainCourse();

	/**
	 * Returns a new object of class '<em>Dessert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dessert</em>'.
	 * @generated
	 */
	Dessert createDessert();

	/**
	 * Returns a new object of class '<em>Photos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photos</em>'.
	 * @generated
	 */
	Photos createPhotos();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Hw1Package getHw1Package();

} //Hw1Factory
