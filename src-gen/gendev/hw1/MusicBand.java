/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music Band</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.MusicBand#getSongs <em>Songs</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getMusicBand()
 * @model
 * @generated
 */
public interface MusicBand extends EObject {
	/**
	 * Returns the value of the '<em><b>Songs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Songs</em>' attribute.
	 * @see #setSongs(String)
	 * @see gendev.hw1.Hw1Package#getMusicBand_Songs()
	 * @model
	 * @generated
	 */
	String getSongs();

	/**
	 * Sets the value of the '{@link gendev.hw1.MusicBand#getSongs <em>Songs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Songs</em>' attribute.
	 * @see #getSongs()
	 * @generated
	 */
	void setSongs(String value);

} // MusicBand
