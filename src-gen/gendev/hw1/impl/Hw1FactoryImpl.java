/**
 */
package gendev.hw1.impl;

import gendev.hw1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1FactoryImpl extends EFactoryImpl implements Hw1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Hw1Factory init() {
		try {
			Hw1Factory theHw1Factory = (Hw1Factory) EPackage.Registry.INSTANCE.getEFactory(Hw1Package.eNS_URI);
			if (theHw1Factory != null) {
				return theHw1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Hw1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Hw1Package.CUSTOMER:
			return createCustomer();
		case Hw1Package.REFUND:
			return createRefund();
		case Hw1Package.SINGER:
			return createSinger();
		case Hw1Package.PHOTOGRAPHER:
			return createPhotographer();
		case Hw1Package.PAYMENT:
			return createPayment();
		case Hw1Package.MUSIC_BAND:
			return createMusicBand();
		case Hw1Package.CHEF:
			return createChef();
		case Hw1Package.MEALS:
			return createMeals();
		case Hw1Package.MAIN_COURSE:
			return createMainCourse();
		case Hw1Package.DESSERT:
			return createDessert();
		case Hw1Package.PHOTOS:
			return createPhotos();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refund createRefund() {
		RefundImpl refund = new RefundImpl();
		return refund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Singer createSinger() {
		SingerImpl singer = new SingerImpl();
		return singer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photographer createPhotographer() {
		PhotographerImpl photographer = new PhotographerImpl();
		return photographer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicBand createMusicBand() {
		MusicBandImpl musicBand = new MusicBandImpl();
		return musicBand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chef createChef() {
		ChefImpl chef = new ChefImpl();
		return chef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meals createMeals() {
		MealsImpl meals = new MealsImpl();
		return meals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainCourse createMainCourse() {
		MainCourseImpl mainCourse = new MainCourseImpl();
		return mainCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dessert createDessert() {
		DessertImpl dessert = new DessertImpl();
		return dessert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photos createPhotos() {
		PhotosImpl photos = new PhotosImpl();
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Package getHw1Package() {
		return (Hw1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Hw1Package getPackage() {
		return Hw1Package.eINSTANCE;
	}

} //Hw1FactoryImpl
