package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ser.impl.a;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.j60;
import com.oplus.aiunit.vision.rc1;
import com.oplus.aiunit.vision.wdk;
import com.oplus.aiunit.vision.yla;

/* JADX INFO: loaded from: classes13.dex */
public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter {
    private static final long serialVersionUID = 1;

    public VirtualBeanPropertyWriter(rc1 rc1Var, j60 j60Var, JavaType javaType) {
        this(rc1Var, j60Var, javaType, null, null, null, rc1Var.g());
    }

    public static boolean _suppressNulls(JsonInclude.Value value) {
        JsonInclude.Include valueInclusion;
        return (value == null || (valueInclusion = value.getValueInclusion()) == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.USE_DEFAULTS) ? false : true;
    }

    public static Object _suppressableValue(JsonInclude.Value value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        JsonInclude.Include valueInclusion = value.getValueInclusion();
        if (valueInclusion == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.NON_NULL || valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
            return null;
        }
        return BeanPropertyWriter.MARKER_FOR_EMPTY;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase
    public boolean isVirtual() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, eug eugVar) throws Exception {
        Object objValue = value(obj, jsonGenerator, eugVar);
        if (objValue == null) {
            yla<Object> ylaVar = this._nullSerializer;
            if (ylaVar != null) {
                ylaVar.serialize(null, jsonGenerator, eugVar);
                return;
            } else {
                jsonGenerator.T();
                return;
            }
        }
        yla<?> ylaVar_findAndAddDynamic = this._serializer;
        if (ylaVar_findAndAddDynamic == null) {
            Class<?> cls = objValue.getClass();
            a aVar = this._dynamicSerializers;
            yla<?> ylaVarK = aVar.k(cls);
            ylaVar_findAndAddDynamic = ylaVarK == null ? _findAndAddDynamic(aVar, cls, eugVar) : ylaVarK;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (ylaVar_findAndAddDynamic.isEmpty(eugVar, objValue)) {
                    serializeAsPlaceholder(obj, jsonGenerator, eugVar);
                    return;
                }
            } else if (obj2.equals(objValue)) {
                serializeAsPlaceholder(obj, jsonGenerator, eugVar);
                return;
            }
        }
        if (objValue == obj && _handleSelfReference(obj, jsonGenerator, eugVar, ylaVar_findAndAddDynamic)) {
            return;
        }
        wdk wdkVar = this._typeSerializer;
        if (wdkVar == null) {
            ylaVar_findAndAddDynamic.serialize(objValue, jsonGenerator, eugVar);
        } else {
            ylaVar_findAndAddDynamic.serializeWithType(objValue, jsonGenerator, eugVar, wdkVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, eug eugVar) throws Exception {
        Object objValue = value(obj, jsonGenerator, eugVar);
        if (objValue == null) {
            if (this._nullSerializer != null) {
                jsonGenerator.R(this._name);
                this._nullSerializer.serialize(null, jsonGenerator, eugVar);
                return;
            }
            return;
        }
        yla<?> ylaVar_findAndAddDynamic = this._serializer;
        if (ylaVar_findAndAddDynamic == null) {
            Class<?> cls = objValue.getClass();
            a aVar = this._dynamicSerializers;
            yla<?> ylaVarK = aVar.k(cls);
            ylaVar_findAndAddDynamic = ylaVarK == null ? _findAndAddDynamic(aVar, cls, eugVar) : ylaVarK;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (ylaVar_findAndAddDynamic.isEmpty(eugVar, objValue)) {
                    return;
                }
            } else if (obj2.equals(objValue)) {
                return;
            }
        }
        if (objValue == obj && _handleSelfReference(obj, jsonGenerator, eugVar, ylaVar_findAndAddDynamic)) {
            return;
        }
        jsonGenerator.R(this._name);
        wdk wdkVar = this._typeSerializer;
        if (wdkVar == null) {
            ylaVar_findAndAddDynamic.serialize(objValue, jsonGenerator, eugVar);
        } else {
            ylaVar_findAndAddDynamic.serializeWithType(objValue, jsonGenerator, eugVar, wdkVar);
        }
    }

    public abstract Object value(Object obj, JsonGenerator jsonGenerator, eug eugVar) throws Exception;

    public abstract VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar, rc1 rc1Var, JavaType javaType);

    public VirtualBeanPropertyWriter() {
    }

    public VirtualBeanPropertyWriter(rc1 rc1Var, j60 j60Var, JavaType javaType, yla<?> ylaVar, wdk wdkVar, JavaType javaType2, JsonInclude.Value value, Class<?>[] clsArr) {
        super(rc1Var, rc1Var.H(), j60Var, javaType, ylaVar, wdkVar, javaType2, _suppressNulls(value), _suppressableValue(value), clsArr);
    }

    @Deprecated
    public VirtualBeanPropertyWriter(rc1 rc1Var, j60 j60Var, JavaType javaType, yla<?> ylaVar, wdk wdkVar, JavaType javaType2, JsonInclude.Value value) {
        this(rc1Var, j60Var, javaType, ylaVar, wdkVar, javaType2, value, null);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter) {
        super(virtualBeanPropertyWriter);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter, PropertyName propertyName) {
        super(virtualBeanPropertyWriter, propertyName);
    }
}
