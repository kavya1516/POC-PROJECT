/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.team5.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.team5.core.constants.Team5CoreConstants;
import de.hybris.team5.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class Team5CoreManager extends GeneratedTeam5CoreManager
{
	public static final Team5CoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Team5CoreManager) em.getExtension(Team5CoreConstants.EXTENSIONNAME);
	}
}
