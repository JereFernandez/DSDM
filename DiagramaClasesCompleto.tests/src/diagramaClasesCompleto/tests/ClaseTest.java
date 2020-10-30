/**
 */
package diagramaClasesCompleto.tests;

import diagramaClasesCompleto.Clase;
import diagramaClasesCompleto.DiagramaClasesCompletoFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaseTest extends ClasificadorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClaseTest.class);
	}

	/**
	 * Constructs a new Clase test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clase test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Clase getFixture() {
		return (Clase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiagramaClasesCompletoFactory.eINSTANCE.createClase());
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

} //ClaseTest
