/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.team.rtc.extensions.workitem.copy.value.processors;

import org.eclipse.core.runtime.IProgressMonitor;

import com.ibm.team.repository.common.TeamRepositoryException;
import com.ibm.team.rtc.extensions.workitem.copy.internal.EvaluationContext;
import com.ibm.team.workitem.common.model.IAttribute;
import com.ibm.team.workitem.common.model.IWorkItem;

public class WorkItemTypeProcessor extends DefaultValueProcessor<String> {

	@Override
	public void prepareTargetValue(IWorkItem target, IAttribute targetAttribute, IAttribute sourceAttribute, String sourceValue, EvaluationContext context, IProgressMonitor monitor) throws TeamRepositoryException {
		setValue(target, targetAttribute, getMapping(target, targetAttribute, sourceValue, context, monitor));
	}

	public String getMapping(IWorkItem target, IAttribute targetAttribute, String sourceValue, EvaluationContext context, IProgressMonitor monitor) throws TeamRepositoryException {
		return sourceValue;
	}

}
