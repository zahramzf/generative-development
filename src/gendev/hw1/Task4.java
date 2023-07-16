package gendev.hw1;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;



public class Task4 {
	public static String instance = "task4_instance/instance.xmi";

	public static void main(String[] args) {
		System.out.println("Creating and saving instance to file " + instance);

		// TODO implement your code here
		Hw1Package.eINSTANCE.eClass();
		Hw1Factory factory =Hw1Factory.eINSTANCE;
		
		Customer customer1 = factory.createCustomer();
		Meals Meals1 = factory.createMeals();
		MainCourse Main = factory.createMainCourse();
		Dessert dessert1 = factory.createDessert();
		Dessert dessert2 = factory.createDessert();
		MusicBand Band = factory.createMusicBand();
		Photos photo = factory.createPhotos();
		Singer singer = factory.createSinger();
		Payment paymentmethod = factory.createPayment();
		
		customer1.setName("Zahra Mozaffarian");
		customer1.setPhoneNumber(989898);
		
		Main.setName("Pasta");
		Main.setCount(65);
		
		Meals1.setName("British");
		
		dessert1.setName("Cheesecake");
		dessert1.setCounter(55);
		
		dessert2.setName("ApplePie");
		dessert2.setCounter(45);
		
		Band.setSongs("taylor swift");
		
		photo.setLocation("London");
		
		singer.setSingerList("pop");
		singer.setAge(22);
		singer.setSalary(3000);
		
		paymentmethod.setPaymentId(3235);
		
		customer1.getPhotos().add(photo);
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(instance));
		resource.getContents().add(customer1);
		resource.getContents().add(singer);
		resource.getContents().add(photo);
		
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {// TODO Auto-generated catch block
				e.printStackTrace();
				}
		
	}
}
