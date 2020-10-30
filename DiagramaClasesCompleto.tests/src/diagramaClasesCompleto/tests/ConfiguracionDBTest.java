/**
 */
package diagramaClasesCompleto.tests;

import diagramaClasesCompleto.ConfiguracionDB;
import diagramaClasesCompleto.DiagramaClasesCompletoFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Configuracion DB</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfiguracionDBTest extends TestCase {

	/**
	 * The fixture for this Configuracion DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionDB fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfiguracionDBTest.class);
	}

	/**
	 * Constructs a new Configuracion DB test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguracionDBTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Configuracion DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConfiguracionDB fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Configuracion DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionDB getFixture() {
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
		setFixture(DiagramaClasesCompletoFactory.eINSTANCE.createConfiguracionDB());
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

} //ConfiguracionDBTest
