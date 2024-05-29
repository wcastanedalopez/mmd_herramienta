/**
 */
package mconcreta.tests;

import junit.textui.TestRunner;

import mconcreta.AttributeWc;
import mconcreta.MconcretaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Wc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeWcTest extends FeatureWcTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeWcTest.class);
	}

	/**
	 * Constructs a new Attribute Wc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeWcTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Wc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeWc getFixture() {
		return (AttributeWc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MconcretaFactory.eINSTANCE.createAttributeWc());
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

} //AttributeWcTest
