/**
 * generated by Xtext 2.17.1
 */
package com.eclipsesource.workflow.dsl.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probability Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eclipsesource.workflow.dsl.workflow.ProbabilityConfiguration#getLow <em>Low</em>}</li>
 *   <li>{@link com.eclipsesource.workflow.dsl.workflow.ProbabilityConfiguration#getMedium <em>Medium</em>}</li>
 *   <li>{@link com.eclipsesource.workflow.dsl.workflow.ProbabilityConfiguration#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see com.eclipsesource.workflow.dsl.workflow.WorkflowPackage#getProbabilityConfiguration()
 * @model
 * @generated
 */
public interface ProbabilityConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Low</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Low</em>' attribute.
   * @see #setLow(float)
   * @see com.eclipsesource.workflow.dsl.workflow.WorkflowPackage#getProbabilityConfiguration_Low()
   * @model
   * @generated
   */
  float getLow();

  /**
   * Sets the value of the '{@link com.eclipsesource.workflow.dsl.workflow.ProbabilityConfiguration#getLow <em>Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low</em>' attribute.
   * @see #getLow()
   * @generated
   */
  void setLow(float value);

  /**
   * Returns the value of the '<em><b>Medium</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Medium</em>' attribute.
   * @see #setMedium(float)
   * @see com.eclipsesource.workflow.dsl.workflow.WorkflowPackage#getProbabilityConfiguration_Medium()
   * @model
   * @generated
   */
  float getMedium();

  /**
   * Sets the value of the '{@link com.eclipsesource.workflow.dsl.workflow.ProbabilityConfiguration#getMedium <em>Medium</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Medium</em>' attribute.
   * @see #getMedium()
   * @generated
   */
  void setMedium(float value);

  /**
   * Returns the value of the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>High</em>' attribute.
   * @see #setHigh(float)
   * @see com.eclipsesource.workflow.dsl.workflow.WorkflowPackage#getProbabilityConfiguration_High()
   * @model
   * @generated
   */
  float getHigh();

  /**
   * Sets the value of the '{@link com.eclipsesource.workflow.dsl.workflow.ProbabilityConfiguration#getHigh <em>High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High</em>' attribute.
   * @see #getHigh()
   * @generated
   */
  void setHigh(float value);

} // ProbabilityConfiguration
