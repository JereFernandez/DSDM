/**
 */
package diagramaClasesCompleto.tests;

import diagramaClasesCompleto.DiagramaClasesCompletoFactory;
import diagramaClasesCompleto.Operacion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperacionTest extends RetornableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperacionTest.class);
	}

	/**
	 * Constructs a new Operacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Operacion getFixture() {
		return (Operacion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiagramaClasesCompletoFactory.eINSTANCE.createOperacion());
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

} //OperacionTest
