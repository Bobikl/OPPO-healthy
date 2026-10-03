package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.oplus.aiunit.vision.oc1;
import com.oplus.aiunit.vision.rc1;

/* JADX INFO: loaded from: classes13.dex */
public class InvalidDefinitionException extends JsonMappingException {
    protected transient oc1 _beanDesc;
    protected transient rc1 _property;
    protected final JavaType _type;

    public InvalidDefinitionException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, oc1 oc1Var, rc1 rc1Var) {
        return new InvalidDefinitionException(jsonParser, str, oc1Var, rc1Var);
    }

    public oc1 getBeanDescription() {
        return this._beanDesc;
    }

    public rc1 getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonParser, str, javaType);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, oc1 oc1Var, rc1 rc1Var) {
        return new InvalidDefinitionException(jsonGenerator, str, oc1Var, rc1Var);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonGenerator, str, javaType);
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super(jsonGenerator, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public InvalidDefinitionException(JsonParser jsonParser, String str, oc1 oc1Var, rc1 rc1Var) {
        super(jsonParser, str);
        this._type = oc1Var == null ? null : oc1Var.A();
        this._beanDesc = oc1Var;
        this._property = rc1Var;
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, oc1 oc1Var, rc1 rc1Var) {
        super(jsonGenerator, str);
        this._type = oc1Var == null ? null : oc1Var.A();
        this._beanDesc = oc1Var;
        this._property = rc1Var;
    }
}
