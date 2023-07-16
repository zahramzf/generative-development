/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photographer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Photographer#getPhotographypart <em>Photographypart</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getPhotographer()
 * @model
 * @generated
 */
public interface Photographer extends EObject {
	/**
	 * Returns the value of the '<em><b>Photographypart</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Photos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photographypart</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getPhotographer_Photographypart()
	 * @model containment="true" lower="2" upper="6"
	 * @generated
	 */
	EList<Photos> getPhotographypart();

} // Photographer
