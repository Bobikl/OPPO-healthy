package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.oplus.aiunit.vision.aze;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.hla;
import com.oplus.aiunit.vision.sc1;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class SimpleBeanPropertyFilter implements sc1, aze {

    public static class FilterExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final Set<String> _propertiesToInclude;

        public FilterExceptFilter(Set<String> set) {
            this._propertiesToInclude = set;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return this._propertiesToInclude.contains(beanPropertyWriter.getName());
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(PropertyWriter propertyWriter) {
            return this._propertiesToInclude.contains(propertyWriter.getName());
        }
    }

    public static class SerializeExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        static final SerializeExceptFilter INCLUDE_ALL = new SerializeExceptFilter();
        private static final long serialVersionUID = 1;
        protected final Set<String> _propertiesToExclude;

        public SerializeExceptFilter() {
            this._propertiesToExclude = Collections.emptySet();
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return !this._propertiesToExclude.contains(beanPropertyWriter.getName());
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(PropertyWriter propertyWriter) {
            return !this._propertiesToExclude.contains(propertyWriter.getName());
        }

        public SerializeExceptFilter(Set<String> set) {
            this._propertiesToExclude = set;
        }
    }

    public static class a implements aze {
        public final /* synthetic */ sc1 i;

        public a(sc1 sc1Var) {
            this.i = sc1Var;
        }

        @Override // com.oplus.aiunit.vision.aze
        public void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, eug eugVar) throws JsonMappingException {
            this.i.depositSchemaProperty((BeanPropertyWriter) propertyWriter, objectNode, eugVar);
        }

        @Override // com.oplus.aiunit.vision.aze
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, eug eugVar, PropertyWriter propertyWriter) throws Exception {
            this.i.serializeAsField(obj, jsonGenerator, eugVar, (BeanPropertyWriter) propertyWriter);
        }
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static aze from(sc1 sc1Var) {
        return new a(sc1Var);
    }

    public static SimpleBeanPropertyFilter serializeAll() {
        return SerializeExceptFilter.INCLUDE_ALL;
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(Set<String> set) {
        return new SerializeExceptFilter(set);
    }

    @Override // com.oplus.aiunit.vision.sc1
    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, eug eugVar) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(objectNode, eugVar);
        }
    }

    public boolean include(BeanPropertyWriter beanPropertyWriter) {
        return true;
    }

    public boolean includeElement(Object obj) {
        return true;
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, eug eugVar, PropertyWriter propertyWriter) throws Exception {
        if (includeElement(obj)) {
            propertyWriter.serializeAsElement(obj, jsonGenerator, eugVar);
        }
    }

    @Override // com.oplus.aiunit.vision.sc1
    @Deprecated
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, eug eugVar, BeanPropertyWriter beanPropertyWriter) throws Exception {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.serializeAsField(obj, jsonGenerator, eugVar);
        } else {
            if (jsonGenerator.l()) {
                return;
            }
            beanPropertyWriter.serializeAsOmittedField(obj, jsonGenerator, eugVar);
        }
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new FilterExceptFilter(hashSet);
    }

    @Deprecated
    public static SimpleBeanPropertyFilter serializeAll(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new SerializeExceptFilter(hashSet);
    }

    public boolean include(PropertyWriter propertyWriter) {
        return true;
    }

    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, hla hlaVar, eug eugVar) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(hlaVar, eugVar);
        }
    }

    @Override // com.oplus.aiunit.vision.aze
    @Deprecated
    public void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, eug eugVar) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(objectNode, eugVar);
        }
    }

    @Override // com.oplus.aiunit.vision.aze
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, eug eugVar, PropertyWriter propertyWriter) throws Exception {
        if (include(propertyWriter)) {
            propertyWriter.serializeAsField(obj, jsonGenerator, eugVar);
        } else {
            if (jsonGenerator.l()) {
                return;
            }
            propertyWriter.serializeAsOmittedField(obj, jsonGenerator, eugVar);
        }
    }

    public void depositSchemaProperty(PropertyWriter propertyWriter, hla hlaVar, eug eugVar) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(hlaVar, eugVar);
        }
    }
}
