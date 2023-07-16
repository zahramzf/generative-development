/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Chef#getMeals <em>Meals</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getChef()
 * @model
 * @generated
 */
public interface Chef extends EObject {
	/**
	 * Returns the value of the '<em><b>Meals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meals</em>' containment reference.
	 * @see #setMeals(Meals)
	 * @see gendev.hw1.Hw1Package#getChef_Meals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Meals getMeals();

	/**
	 * Sets the value of the '{@link gendev.hw1.Chef#getMeals <em>Meals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meals</em>' containment reference.
	 * @see #getMeals()
	 * @generated
	 */
	void setMeals(Meals value);

} // Chef
