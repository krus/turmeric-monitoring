/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.monitoring.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * ErrorMetricsGraphResponse.
 */
public class ErrorMetricsGraphResponse extends JavaScriptObject {
    
    /**
     * Instantiates a new error metrics graph response.
     */
    protected ErrorMetricsGraphResponse() {
    }
    
    /**
     * From json.
     *
     * @param json the json
     * @return the error metrics graph response
     */
    public static final native ErrorMetricsGraphResponse fromJSON (String json) /*-{
        try {
            return eval('(' + json + ')');
        } catch (err) {
            return null;
        }
    }-*/;
    
 
    
    /**
     * Gets the return data.
     *
     * @return the return data
     */
    public final native JsArray<MetricGraphDataJS> getReturnData () /*-{
        if (!this.getErrorGraphResponse)
            return null;
        return this.getErrorGraphResponse.returnData;
    }-*/;
}
