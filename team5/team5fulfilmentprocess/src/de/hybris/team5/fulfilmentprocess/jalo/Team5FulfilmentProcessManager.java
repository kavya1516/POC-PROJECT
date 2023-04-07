/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.team5.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.team5.fulfilmentprocess.constants.Team5FulfilmentProcessConstants;

public class Team5FulfilmentProcessManager extends GeneratedTeam5FulfilmentProcessManager
{
	public static final Team5FulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Team5FulfilmentProcessManager) em.getExtension(Team5FulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
