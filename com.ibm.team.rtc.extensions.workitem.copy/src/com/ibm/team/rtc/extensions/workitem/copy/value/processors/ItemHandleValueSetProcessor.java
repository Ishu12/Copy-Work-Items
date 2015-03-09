/*******************************************************************************
 * Licensed Materials - Property of IBM
 * © Copyright IBM Corporation 2015. All Rights Reserved.
 * 
 * Note to U.S. Government Users Restricted Rights:
 * Use, duplication or disclosure restricted by GSA ADP Schedule
 * Contract with IBM Corp. 
 *******************************************************************************/
package com.ibm.team.rtc.extensions.workitem.copy.value.processors;

import com.ibm.team.repository.common.IItemHandle;

public class ItemHandleValueSetProcessor<T extends IItemHandle> extends ValueSetProcessor<T> {
	@Override
	protected boolean areSame(T value1, T value2) {
		if (value1 == null && value2 == null)
			return true;

		if (value1 == null || value2 == null)
			return false;

		return value1.sameItemId(value2);
	}
}
