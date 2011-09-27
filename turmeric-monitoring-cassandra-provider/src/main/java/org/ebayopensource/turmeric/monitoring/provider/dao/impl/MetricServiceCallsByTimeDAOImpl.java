/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.monitoring.provider.dao.impl;

import org.ebayopensource.turmeric.monitoring.provider.dao.MetricServiceCallsByTimeDAO;
import org.ebayopensource.turmeric.monitoring.provider.model.BasicModel;
import org.ebayopensource.turmeric.monitoring.provider.model.SuperModel;
import org.ebayopensource.turmeric.utils.cassandra.dao.AbstractSuperColumnFamilyDao;



/**
 * The Class ServiceCallsByTimeDAOImpl.
 * 
 * @author jamuguerza
 */
public class MetricServiceCallsByTimeDAOImpl<SK, K>  extends
		AbstractSuperColumnFamilyDao<SK, SuperModel, K, BasicModel>
		implements MetricServiceCallsByTimeDAO<SK, K>  {

	public MetricServiceCallsByTimeDAOImpl(final String clusterName, final String host,
			final String s_keyspace, final String columnFamilyName, final Class<SK> sKTypeClass, final Class<K> kTypeClass) {
		super(clusterName, host, s_keyspace, sKTypeClass, SuperModel.class,
				kTypeClass, BasicModel.class, columnFamilyName);
	}

}
