package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface sc1 {
    @Deprecated
    void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, eug eugVar) throws JsonMappingException;

    void serializeAsField(Object obj, JsonGenerator jsonGenerator, eug eugVar, BeanPropertyWriter beanPropertyWriter) throws Exception;
}
