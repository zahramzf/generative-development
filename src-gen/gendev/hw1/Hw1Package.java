/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Factory
 * @model kind="package"
 * @generated
 */
public interface Hw1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hw1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hw1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hw1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Package eINSTANCE = gendev.hw1.impl.Hw1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.CustomerImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Meals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MEALS = 2;

	/**
	 * The feature id for the '<em><b>Musicband</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MUSICBAND = 3;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHOTOS = 4;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PAYMENT = 5;

	/**
	 * The feature id for the '<em><b>Refund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__REFUND = 6;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.RefundImpl <em>Refund</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.RefundImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getRefund()
	 * @generated
	 */
	int REFUND = 1;

	/**
	 * The feature id for the '<em><b>Refund Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUND__REFUND_ID = 0;

	/**
	 * The number of structural features of the '<em>Refund</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Refund</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.SingerImpl <em>Singer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.SingerImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getSinger()
	 * @generated
	 */
	int SINGER = 2;

	/**
	 * The feature id for the '<em><b>Musicband</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGER__MUSICBAND = 0;

	/**
	 * The number of structural features of the '<em>Singer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Singer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PhotographerImpl <em>Photographer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PhotographerImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPhotographer()
	 * @generated
	 */
	int PHOTOGRAPHER = 3;

	/**
	 * The feature id for the '<em><b>Photographypart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOGRAPHER__PHOTOGRAPHYPART = 0;

	/**
	 * The number of structural features of the '<em>Photographer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOGRAPHER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Photographer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOGRAPHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PaymentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 4;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Refund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__REFUND = 1;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.MusicBandImpl <em>Music Band</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.MusicBandImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getMusicBand()
	 * @generated
	 */
	int MUSIC_BAND = 5;

	/**
	 * The feature id for the '<em><b>Songs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_BAND__SONGS = 0;

	/**
	 * The number of structural features of the '<em>Music Band</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_BAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Music Band</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_BAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.StaffImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 6;

	/**
	 * The feature id for the '<em><b>Photographypart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__PHOTOGRAPHYPART = PHOTOGRAPHER__PHOTOGRAPHYPART;

	/**
	 * The feature id for the '<em><b>Musicband</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__MUSICBAND = PHOTOGRAPHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__MEALS = PHOTOGRAPHER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__AGE = PHOTOGRAPHER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__SALARY = PHOTOGRAPHER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = PHOTOGRAPHER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = PHOTOGRAPHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.ChefImpl <em>Chef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.ChefImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getChef()
	 * @generated
	 */
	int CHEF = 7;

	/**
	 * The feature id for the '<em><b>Meals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEF__MEALS = 0;

	/**
	 * The number of structural features of the '<em>Chef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Chef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.MealsImpl <em>Meals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.MealsImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getMeals()
	 * @generated
	 */
	int MEALS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Meals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Meals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.MainCourseImpl <em>Main Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.MainCourseImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getMainCourse()
	 * @generated
	 */
	int MAIN_COURSE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_COURSE__NAME = MEALS__NAME;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_COURSE__COUNT = MEALS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_COURSE_FEATURE_COUNT = MEALS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Main Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_COURSE_OPERATION_COUNT = MEALS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.DessertImpl <em>Dessert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.DessertImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getDessert()
	 * @generated
	 */
	int DESSERT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESSERT__NAME = MEALS__NAME;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESSERT__COUNTER = MEALS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dessert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESSERT_FEATURE_COUNT = MEALS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dessert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESSERT_OPERATION_COUNT = MEALS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PhotosImpl <em>Photos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PhotosImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPhotos()
	 * @generated
	 */
	int PHOTOS = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOS__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Photos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Photos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see gendev.hw1.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Customer#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see gendev.hw1.Customer#getPhoneNumber()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PhoneNumber();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Customer#getMeals <em>Meals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meals</em>'.
	 * @see gendev.hw1.Customer#getMeals()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Meals();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Customer#getMusicband <em>Musicband</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Musicband</em>'.
	 * @see gendev.hw1.Customer#getMusicband()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Musicband();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Customer#getPhotos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Photos</em>'.
	 * @see gendev.hw1.Customer#getPhotos()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Photos();

	/**
	 * Returns the meta object for the containment reference '{@link gendev.hw1.Customer#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payment</em>'.
	 * @see gendev.hw1.Customer#getPayment()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Payment();

	/**
	 * Returns the meta object for the containment reference '{@link gendev.hw1.Customer#getRefund <em>Refund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refund</em>'.
	 * @see gendev.hw1.Customer#getRefund()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Refund();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Refund <em>Refund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refund</em>'.
	 * @see gendev.hw1.Refund
	 * @generated
	 */
	EClass getRefund();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Refund#getRefundId <em>Refund Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refund Id</em>'.
	 * @see gendev.hw1.Refund#getRefundId()
	 * @see #getRefund()
	 * @generated
	 */
	EAttribute getRefund_RefundId();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Singer <em>Singer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singer</em>'.
	 * @see gendev.hw1.Singer
	 * @generated
	 */
	EClass getSinger();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Singer#getMusicband <em>Musicband</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Musicband</em>'.
	 * @see gendev.hw1.Singer#getMusicband()
	 * @see #getSinger()
	 * @generated
	 */
	EReference getSinger_Musicband();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Photographer <em>Photographer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photographer</em>'.
	 * @see gendev.hw1.Photographer
	 * @generated
	 */
	EClass getPhotographer();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Photographer#getPhotographypart <em>Photographypart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Photographypart</em>'.
	 * @see gendev.hw1.Photographer#getPhotographypart()
	 * @see #getPhotographer()
	 * @generated
	 */
	EReference getPhotographer_Photographypart();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see gendev.hw1.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Id</em>'.
	 * @see gendev.hw1.Payment#getPaymentId()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentId();

	/**
	 * Returns the meta object for the containment reference '{@link gendev.hw1.Payment#getRefund <em>Refund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refund</em>'.
	 * @see gendev.hw1.Payment#getRefund()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_Refund();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.MusicBand <em>Music Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music Band</em>'.
	 * @see gendev.hw1.MusicBand
	 * @generated
	 */
	EClass getMusicBand();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.MusicBand#getSongs <em>Songs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Songs</em>'.
	 * @see gendev.hw1.MusicBand#getSongs()
	 * @see #getMusicBand()
	 * @generated
	 */
	EAttribute getMusicBand_Songs();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see gendev.hw1.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Staff#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see gendev.hw1.Staff#getAge()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Age();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Staff#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see gendev.hw1.Staff#getSalary()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Salary();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Chef <em>Chef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chef</em>'.
	 * @see gendev.hw1.Chef
	 * @generated
	 */
	EClass getChef();

	/**
	 * Returns the meta object for the containment reference '{@link gendev.hw1.Chef#getMeals <em>Meals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meals</em>'.
	 * @see gendev.hw1.Chef#getMeals()
	 * @see #getChef()
	 * @generated
	 */
	EReference getChef_Meals();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Meals <em>Meals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meals</em>'.
	 * @see gendev.hw1.Meals
	 * @generated
	 */
	EClass getMeals();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Meals#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Meals#getName()
	 * @see #getMeals()
	 * @generated
	 */
	EAttribute getMeals_Name();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.MainCourse <em>Main Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Course</em>'.
	 * @see gendev.hw1.MainCourse
	 * @generated
	 */
	EClass getMainCourse();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.MainCourse#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see gendev.hw1.MainCourse#getCount()
	 * @see #getMainCourse()
	 * @generated
	 */
	EAttribute getMainCourse_Count();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Dessert <em>Dessert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dessert</em>'.
	 * @see gendev.hw1.Dessert
	 * @generated
	 */
	EClass getDessert();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Dessert#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see gendev.hw1.Dessert#getCounter()
	 * @see #getDessert()
	 * @generated
	 */
	EAttribute getDessert_Counter();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Photos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photos</em>'.
	 * @see gendev.hw1.Photos
	 * @generated
	 */
	EClass getPhotos();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Photos#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see gendev.hw1.Photos#getLocation()
	 * @see #getPhotos()
	 * @generated
	 */
	EAttribute getPhotos_Location();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hw1Factory getHw1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.CustomerImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE_NUMBER = eINSTANCE.getCustomer_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Meals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__MEALS = eINSTANCE.getCustomer_Meals();

		/**
		 * The meta object literal for the '<em><b>Musicband</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__MUSICBAND = eINSTANCE.getCustomer_Musicband();

		/**
		 * The meta object literal for the '<em><b>Photos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PHOTOS = eINSTANCE.getCustomer_Photos();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PAYMENT = eINSTANCE.getCustomer_Payment();

		/**
		 * The meta object literal for the '<em><b>Refund</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__REFUND = eINSTANCE.getCustomer_Refund();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.RefundImpl <em>Refund</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.RefundImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getRefund()
		 * @generated
		 */
		EClass REFUND = eINSTANCE.getRefund();

		/**
		 * The meta object literal for the '<em><b>Refund Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFUND__REFUND_ID = eINSTANCE.getRefund_RefundId();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.SingerImpl <em>Singer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.SingerImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getSinger()
		 * @generated
		 */
		EClass SINGER = eINSTANCE.getSinger();

		/**
		 * The meta object literal for the '<em><b>Musicband</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGER__MUSICBAND = eINSTANCE.getSinger_Musicband();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PhotographerImpl <em>Photographer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PhotographerImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPhotographer()
		 * @generated
		 */
		EClass PHOTOGRAPHER = eINSTANCE.getPhotographer();

		/**
		 * The meta object literal for the '<em><b>Photographypart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTOGRAPHER__PHOTOGRAPHYPART = eINSTANCE.getPhotographer_Photographypart();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PaymentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_ID = eINSTANCE.getPayment_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Refund</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__REFUND = eINSTANCE.getPayment_Refund();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.MusicBandImpl <em>Music Band</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.MusicBandImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getMusicBand()
		 * @generated
		 */
		EClass MUSIC_BAND = eINSTANCE.getMusicBand();

		/**
		 * The meta object literal for the '<em><b>Songs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC_BAND__SONGS = eINSTANCE.getMusicBand_Songs();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.StaffImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__AGE = eINSTANCE.getStaff_Age();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__SALARY = eINSTANCE.getStaff_Salary();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.ChefImpl <em>Chef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.ChefImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getChef()
		 * @generated
		 */
		EClass CHEF = eINSTANCE.getChef();

		/**
		 * The meta object literal for the '<em><b>Meals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEF__MEALS = eINSTANCE.getChef_Meals();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.MealsImpl <em>Meals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.MealsImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getMeals()
		 * @generated
		 */
		EClass MEALS = eINSTANCE.getMeals();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEALS__NAME = eINSTANCE.getMeals_Name();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.MainCourseImpl <em>Main Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.MainCourseImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getMainCourse()
		 * @generated
		 */
		EClass MAIN_COURSE = eINSTANCE.getMainCourse();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_COURSE__COUNT = eINSTANCE.getMainCourse_Count();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.DessertImpl <em>Dessert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.DessertImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getDessert()
		 * @generated
		 */
		EClass DESSERT = eINSTANCE.getDessert();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESSERT__COUNTER = eINSTANCE.getDessert_Counter();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PhotosImpl <em>Photos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PhotosImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPhotos()
		 * @generated
		 */
		EClass PHOTOS = eINSTANCE.getPhotos();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTOS__LOCATION = eINSTANCE.getPhotos_Location();

	}

} //Hw1Package
