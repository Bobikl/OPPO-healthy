package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

/* JADX INFO: loaded from: classes13.dex */
public interface aze {
    @Deprecated
    void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, eug eugVar) throws JsonMappingException;

    void serializeAsField(Object obj, JsonGenerator jsonGenerator, eug eugVar, PropertyWriter propertyWriter) throws Exception;
}
