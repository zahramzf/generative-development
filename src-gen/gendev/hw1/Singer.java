/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Singer#getMusicband <em>Musicband</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getSinger()
 * @model
 * @generated
 */
public interface Singer extends EObject {
	/**
	 * Returns the value of the '<em><b>Musicband</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.MusicBand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musicband</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getSinger_Musicband()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<MusicBand> getMusicband();

	void setSingerList(String string);

	void setAge(int i);

	void setSalary(int i);

} // Singer
