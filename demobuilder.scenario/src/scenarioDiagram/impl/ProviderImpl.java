/**
 */
package scenarioDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenarioDiagram.Actor;
import scenarioDiagram.Provider;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ProviderImpl#getServiceLinks <em>Service Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderImpl extends ScenarioElementImpl implements Provider {
	/**
	 * The cached value of the '{@link #getServiceLinks() <em>Service Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLink> serviceLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLink> getServiceLinks() {
		if (serviceLinks == null) {
			serviceLinks = new EObjectWithInverseResolvingEList<ServiceLink>(ServiceLink.class, this, ScenarioDiagramPackage.PROVIDER__SERVICE_LINKS, ScenarioDiagramPackage.SERVICE_LINK__ACTOR);
		}
		return serviceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.PROVIDER__SERVICE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.PROVIDER__SERVICE_LINKS:
				return ((InternalEList<?>)getServiceLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioDiagramPackage.PROVIDER__SERVICE_LINKS:
				return getServiceLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenarioDiagramPackage.PROVIDER__SERVICE_LINKS:
				getServiceLinks().clear();
				getServiceLinks().addAll((Collection<? extends ServiceLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScenarioDiagramPackage.PROVIDER__SERVICE_LINKS:
				getServiceLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScenarioDiagramPackage.PROVIDER__SERVICE_LINKS:
				return serviceLinks != null && !serviceLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Actor.class) {
			switch (derivedFeatureID) {
				case ScenarioDiagramPackage.PROVIDER__SERVICE_LINKS: return ScenarioDiagramPackage.ACTOR__SERVICE_LINKS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Actor.class) {
			switch (baseFeatureID) {
				case ScenarioDiagramPackage.ACTOR__SERVICE_LINKS: return ScenarioDiagramPackage.PROVIDER__SERVICE_LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProviderImpl
