/**
 */
package diagramaClasesCompleto.tests;

import diagramaClasesCompleto.ConfiguracionDocker;
import diagramaClasesCompleto.DiagramaClasesCompletoFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Configuracion Docker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfiguracionDockerTest extends TestCase {

	/**
	 * The fixture for this Configuracion Docker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionDocker fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfiguracionDockerTest.class);
	}

	/**
	 * Constructs a new Configuracion Docker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguracionDockerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Configuracion Docker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConfiguracionDocker fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Configuracion Docker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionDocker getFixture() {
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
		setFixture(DiagramaClasesCompletoFactory.eINSTANCE.createConfiguracionDocker());
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

} //ConfiguracionDockerTest
