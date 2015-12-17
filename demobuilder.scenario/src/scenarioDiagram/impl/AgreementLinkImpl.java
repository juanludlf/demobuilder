/**
 */
package scenarioDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenarioDiagram.AgreementLink;
import scenarioDiagram.GuaranteeTerm;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceNeed;
import scenarioDiagram.ServiceOffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.AgreementLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link scenarioDiagram.impl.AgreementLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgreementLinkImpl extends ScenarioElementImpl implements AgreementLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ServiceNeed source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ServiceOffer target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.AGREEMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNeed getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ServiceNeed)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.AGREEMENT_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNeed basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ServiceNeed newSource, NotificationChain msgs) {
		ServiceNeed oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.AGREEMENT_LINK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ServiceNeed newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK, ServiceNeed.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK, ServiceNeed.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.AGREEMENT_LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOffer getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ServiceOffer)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.AGREEMENT_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOffer basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ServiceOffer newTarget, NotificationChain msgs) {
		ServiceOffer oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.AGREEMENT_LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ServiceOffer newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK, ServiceOffer.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK, ServiceOffer.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.AGREEMENT_LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.AGREEMENT_LINK__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK, ServiceNeed.class, msgs);
				return basicSetSource((ServiceNeed)otherEnd, msgs);
			case ScenarioDiagramPackage.AGREEMENT_LINK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK, ServiceOffer.class, msgs);
				return basicSetTarget((ServiceOffer)otherEnd, msgs);
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SOURCE:
				return basicSetSource(null, msgs);
			case ScenarioDiagramPackage.AGREEMENT_LINK__TARGET:
				return basicSetTarget(null, msgs);
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ScenarioDiagramPackage.AGREEMENT_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SOURCE:
				setSource((ServiceNeed)newValue);
				return;
			case ScenarioDiagramPackage.AGREEMENT_LINK__TARGET:
				setTarget((ServiceOffer)newValue);
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SOURCE:
				setSource((ServiceNeed)null);
				return;
			case ScenarioDiagramPackage.AGREEMENT_LINK__TARGET:
				setTarget((ServiceOffer)null);
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SOURCE:
				return source != null;
			case ScenarioDiagramPackage.AGREEMENT_LINK__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //AgreementLinkImpl
