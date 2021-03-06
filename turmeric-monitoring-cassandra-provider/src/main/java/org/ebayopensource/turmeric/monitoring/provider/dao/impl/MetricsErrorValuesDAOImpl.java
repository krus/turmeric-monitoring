/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.monitoring.provider.dao.impl;

import java.util.List;
import java.util.Set;

import me.prettyprint.cassandra.serializers.ObjectSerializer;
import me.prettyprint.cassandra.serializers.StringSerializer;
import me.prettyprint.hector.api.beans.ColumnSlice;
import me.prettyprint.hector.api.factory.HFactory;
import me.prettyprint.hector.api.query.QueryResult;
import me.prettyprint.hector.api.query.SliceQuery;

import org.ebayopensource.turmeric.monitoring.provider.dao.MetricsErrorValuesDAO;
import org.ebayopensource.turmeric.runtime.error.cassandra.model.ErrorValue;
import org.ebayopensource.turmeric.utils.cassandra.dao.AbstractColumnFamilyDao;

// TODO: Auto-generated Javadoc
/**
 * The Class MetricsErrorValuesDAOImpl.
 *
 * @author jamuguerza
 */
public class MetricsErrorValuesDAOImpl extends AbstractColumnFamilyDao<String, org.ebayopensource.turmeric.runtime.error.cassandra.model.ErrorValue> implements
		MetricsErrorValuesDAO<String> {
		


	/**
	 * Instantiates a new metrics error values dao impl.
	 *
	 * @param clusterName the cluster name
	 * @param host the host
	 * @param s_keyspace the s_keyspace
	 * @param columnFamilyName the column family name
	 * @param kTypeClass the k type class
	 */
	public MetricsErrorValuesDAOImpl(String clusterName, String host,
			String s_keyspace, String columnFamilyName, final Class<String> kTypeClass) {
		super(clusterName, host, s_keyspace, kTypeClass, ErrorValue.class,
				columnFamilyName);
	}

	
}
