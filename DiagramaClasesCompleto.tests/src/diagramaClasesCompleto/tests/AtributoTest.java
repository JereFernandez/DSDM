/**
 */
package diagramaClasesCompleto.tests;

import diagramaClasesCompleto.Atributo;
import diagramaClasesCompleto.DiagramaClasesCompletoFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtributoTest extends RetornableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtributoTest.class);
	}

	/**
	 * Constructs a new Atributo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atributo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Atributo getFixture() {
		return (Atributo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiagramaClasesCompletoFactory.eINSTANCE.createAtributo());
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

} //AtributoTest
