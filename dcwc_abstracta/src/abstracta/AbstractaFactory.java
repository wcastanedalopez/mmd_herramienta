/**
 */
package abstracta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public interface AbstractaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaFactory eINSTANCE = abstracta.impl.AbstractaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory Abstracta Wc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory Abstracta Wc</em>'.
	 * @generated
	 */
	ModelFactoryAbstractaWc createModelFactoryAbstractaWc();

	/**
	 * Returns a new object of class '<em>Project Wc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Wc</em>'.
	 * @generated
	 */
	ProjectWc createProjectWc();

	/**
	 * Returns a new object of class '<em>Package Wc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Wc</em>'.
	 * @generated
	 */
	PackageWc createPackageWc();

	/**
	 * Returns a new object of class '<em>Data Type Factory Wc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Factory Wc</em>'.
	 * @generated
	 */
	DataTypeFactoryWc createDataTypeFactoryWc();

	/**
	 * Returns a new object of class '<em>Type Wc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Wc</em>'.
	 * @generated
	 */
	TypeWc createTypeWc();

	/**
	 * Returns a new object of class '<em>Class Wc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Wc</em>'.
	 * @generated
	 */
	ClassWc createClassWc();

	/**
	 * Returns a new object of class '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition</em>'.
	 * @generated
	 */
	Composition createComposition();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Relation Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Binary</em>'.
	 * @generated
	 */
	RelationBinary createRelationBinary();

	/**
	 * Returns a new object of class '<em>Attribute Wc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Wc</em>'.
	 * @generated
	 */
	AttributeWc createAttributeWc();

	/**
	 * Returns a new object of class '<em>Method Wc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Wc</em>'.
	 * @generated
	 */
	MethodWc createMethodWc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractaPackage getAbstractaPackage();

} //AbstractaFactory
