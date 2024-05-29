/**
 */
package mconcreta.tests;

import junit.textui.TestRunner;

import mconcreta.ClassWc;
import mconcreta.MconcretaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class Wc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassWcTest extends ClassifierWcTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassWcTest.class);
	}

	/**
	 * Constructs a new Class Wc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassWcTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Class Wc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClassWc getFixture() {
		return (ClassWc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MconcretaFactory.eINSTANCE.createClassWc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ClassWcTest
