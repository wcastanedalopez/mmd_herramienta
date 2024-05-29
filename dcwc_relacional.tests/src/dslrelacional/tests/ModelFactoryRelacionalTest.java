/**
 */
package dslrelacional.tests;

import dslrelacional.DslrelacionalFactory;
import dslrelacional.ModelFactoryRelacional;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Factory Relacional</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryRelacionalTest extends TestCase {

	/**
	 * The fixture for this Model Factory Relacional test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryRelacional fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelFactoryRelacionalTest.class);
	}

	/**
	 * Constructs a new Model Factory Relacional test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryRelacionalTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Factory Relacional test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelFactoryRelacional fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Factory Relacional test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryRelacional getFixture() {
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
		setFixture(DslrelacionalFactory.eINSTANCE.createModelFactoryRelacional());
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

} //ModelFactoryRelacionalTest
