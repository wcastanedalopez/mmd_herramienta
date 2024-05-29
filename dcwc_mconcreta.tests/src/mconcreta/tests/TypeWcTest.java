/**
 */
package mconcreta.tests;

import junit.textui.TestRunner;

import mconcreta.MconcretaFactory;
import mconcreta.TypeWc;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Wc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeWcTest extends ClassifierWcTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeWcTest.class);
	}

	/**
	 * Constructs a new Type Wc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeWcTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Wc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeWc getFixture() {
		return (TypeWc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MconcretaFactory.eINSTANCE.createTypeWc());
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

} //TypeWcTest
