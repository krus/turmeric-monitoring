/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/

package org.ebayopensource.turmeric.monitoring.client.model;

import java.util.ArrayList;
import java.util.List;

import org.ebayopensource.turmeric.monitoring.client.model.MetricsQueryService.Entity;

/**
 * The Class ResourceEntityRequest.
 */
public class ResourceEntityRequest {
    
    /** The resource entity type. */
    public Entity resourceEntityType;
    
    /** The resource entity names. */
    public List<String> resourceEntityNames;
    
    /**
     * Adds the resource entity name.
     *
     * @param name the name
     */
    public void addResourceEntityName (String name) {
        if (resourceEntityNames == null)
            resourceEntityNames = new ArrayList<String>();
        resourceEntityNames.add(name);
    }
}