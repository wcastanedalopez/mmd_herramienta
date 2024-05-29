/**
 */
package mconcreta.tests;

import junit.textui.TestRunner;

import mconcreta.MconcretaFactory;
import mconcreta.MethodWc;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Method Wc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodWcTest extends FeatureWcTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MethodWcTest.class);
	}

	/**
	 * Constructs a new Method Wc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodWcTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Method Wc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MethodWc getFixture() {
		return (MethodWc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MconcretaFactory.eINSTANCE.createMethodWc());
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

} //MethodWcTest
