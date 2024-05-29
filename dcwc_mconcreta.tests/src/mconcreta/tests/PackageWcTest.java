/**
 */
package mconcreta.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mconcreta.MconcretaFactory;
import mconcreta.PackageWc;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package Wc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageWcTest extends TestCase {

	/**
	 * The fixture for this Package Wc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageWc fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PackageWcTest.class);
	}

	/**
	 * Constructs a new Package Wc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageWcTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Package Wc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PackageWc fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Package Wc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageWc getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MconcretaFactory.eINSTANCE.createPackageWc());
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

} //PackageWcTest
