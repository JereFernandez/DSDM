/**
 */
package diagramaClasesCompleto.provider;

import diagramaClasesCompleto.util.DiagramaClasesCompletoAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramaClasesCompletoItemProviderAdapterFactory extends DiagramaClasesCompletoAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramaClasesCompletoItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.DiagramaClases} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaClasesItemProvider diagramaClasesItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.DiagramaClases}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiagramaClasesAdapter() {
		if (diagramaClasesItemProvider == null) {
			diagramaClasesItemProvider = new DiagramaClasesItemProvider(this);
		}

		return diagramaClasesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.Clase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseItemProvider claseItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.Clase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClaseAdapter() {
		if (claseItemProvider == null) {
			claseItemProvider = new ClaseItemProvider(this);
		}

		return claseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.Interface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceItemProvider interfaceItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceItemProvider(this);
		}

		return interfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.Relacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionItemProvider relacionItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.Relacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelacionAdapter() {
		if (relacionItemProvider == null) {
			relacionItemProvider = new RelacionItemProvider(this);
		}

		return relacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.Operacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionItemProvider operacionItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.Operacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperacionAdapter() {
		if (operacionItemProvider == null) {
			operacionItemProvider = new OperacionItemProvider(this);
		}

		return operacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.Atributo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoItemProvider atributoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtributoAdapter() {
		if (atributoItemProvider == null) {
			atributoItemProvider = new AtributoItemProvider(this);
		}

		return atributoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.Herencia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerenciaItemProvider herenciaItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.Herencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHerenciaAdapter() {
		if (herenciaItemProvider == null) {
			herenciaItemProvider = new HerenciaItemProvider(this);
		}

		return herenciaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.Realizacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizacionItemProvider realizacionItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.Realizacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealizacionAdapter() {
		if (realizacionItemProvider == null) {
			realizacionItemProvider = new RealizacionItemProvider(this);
		}

		return realizacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.Artefacto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactoItemProvider artefactoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.Artefacto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtefactoAdapter() {
		if (artefactoItemProvider == null) {
			artefactoItemProvider = new ArtefactoItemProvider(this);
		}

		return artefactoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.EndPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointItemProvider endPointItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.EndPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndPointAdapter() {
		if (endPointItemProvider == null) {
			endPointItemProvider = new EndPointItemProvider(this);
		}

		return endPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.ConfiguracionDB} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionDBItemProvider configuracionDBItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.ConfiguracionDB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfiguracionDBAdapter() {
		if (configuracionDBItemProvider == null) {
			configuracionDBItemProvider = new ConfiguracionDBItemProvider(this);
		}

		return configuracionDBItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.ConfiguracionDocker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionDockerItemProvider configuracionDockerItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.ConfiguracionDocker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfiguracionDockerAdapter() {
		if (configuracionDockerItemProvider == null) {
			configuracionDockerItemProvider = new ConfiguracionDockerItemProvider(this);
		}

		return configuracionDockerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.ConfiguracionLenguaje} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionLenguajeItemProvider configuracionLenguajeItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.ConfiguracionLenguaje}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfiguracionLenguajeAdapter() {
		if (configuracionLenguajeItemProvider == null) {
			configuracionLenguajeItemProvider = new ConfiguracionLenguajeItemProvider(this);
		}

		return configuracionLenguajeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.ParametroInterno} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametroInternoItemProvider parametroInternoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.ParametroInterno}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParametroInternoAdapter() {
		if (parametroInternoItemProvider == null) {
			parametroInternoItemProvider = new ParametroInternoItemProvider(this);
		}

		return parametroInternoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramaClasesCompleto.ConfiguracionMicroservicios} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguracionMicroserviciosItemProvider configuracionMicroserviciosItemProvider;

	/**
	 * This creates an adapter for a {@link diagramaClasesCompleto.ConfiguracionMicroservicios}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfiguracionMicroserviciosAdapter() {
		if (configuracionMicroserviciosItemProvider == null) {
			configuracionMicroserviciosItemProvider = new ConfiguracionMicroserviciosItemProvider(this);
		}

		return configuracionMicroserviciosItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (diagramaClasesItemProvider != null)
			diagramaClasesItemProvider.dispose();
		if (claseItemProvider != null)
			claseItemProvider.dispose();
		if (interfaceItemProvider != null)
			interfaceItemProvider.dispose();
		if (relacionItemProvider != null)
			relacionItemProvider.dispose();
		if (operacionItemProvider != null)
			operacionItemProvider.dispose();
		if (atributoItemProvider != null)
			atributoItemProvider.dispose();
		if (packageItemProvider != null)
			packageItemProvider.dispose();
		if (herenciaItemProvider != null)
			herenciaItemProvider.dispose();
		if (realizacionItemProvider != null)
			realizacionItemProvider.dispose();
		if (artefactoItemProvider != null)
			artefactoItemProvider.dispose();
		if (endPointItemProvider != null)
			endPointItemProvider.dispose();
		if (configuracionDBItemProvider != null)
			configuracionDBItemProvider.dispose();
		if (configuracionDockerItemProvider != null)
			configuracionDockerItemProvider.dispose();
		if (configuracionLenguajeItemProvider != null)
			configuracionLenguajeItemProvider.dispose();
		if (parametroInternoItemProvider != null)
			parametroInternoItemProvider.dispose();
		if (configuracionMicroserviciosItemProvider != null)
			configuracionMicroserviciosItemProvider.dispose();
	}

}