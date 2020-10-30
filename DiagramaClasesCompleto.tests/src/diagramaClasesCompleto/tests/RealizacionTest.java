/**
 */
package diagramaClasesCompleto.tests;

import diagramaClasesCompleto.DiagramaClasesCompletoFactory;
import diagramaClasesCompleto.Realizacion;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Realizacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealizacionTest extends TestCase {

	/**
	 * The fixture for this Realizacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Realizacion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RealizacionTest.class);
	}

	/**
	 * Constructs a new Realizacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizacionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Realizacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Realizacion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Realizacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Realizacion getFixture() {
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
		setFixture(DiagramaClasesCompletoFactory.eINSTANCE.createRealizacion());
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

} //RealizacionTest
