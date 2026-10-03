package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.oplus.aiunit.vision.eck;
import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.ifa;
import com.oplus.aiunit.vision.wdk;
import com.oplus.aiunit.vision.yad;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseJsonNode extends ela implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract JsonToken asToken();

    @Override // com.oplus.aiunit.vision.ela
    public final ela findPath(String str) {
        ela elaVarFindValue = findValue(str);
        return elaVarFindValue == null ? MissingNode.getInstance() : elaVarFindValue;
    }

    public abstract int hashCode();

    @Override // com.fasterxml.jackson.core.d
    public JsonParser.NumberType numberType() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.ela
    public ela required(String str) {
        return (ela) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getSimpleName());
    }

    @Override // com.oplus.aiunit.vision.wla
    public abstract void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException;

    @Override // com.oplus.aiunit.vision.wla
    public abstract void serializeWithType(JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException;

    @Override // com.oplus.aiunit.vision.ela
    public String toPrettyString() {
        return ifa.b(this);
    }

    @Override // com.oplus.aiunit.vision.ela
    public String toString() {
        return ifa.c(this);
    }

    public JsonParser traverse() {
        return new eck(this);
    }

    public Object writeReplace() {
        return NodeSerialization.from(this);
    }

    public JsonParser traverse(yad yadVar) {
        return new eck(this, yadVar);
    }

    @Override // com.oplus.aiunit.vision.ela
    public ela required(int i) {
        return (ela) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getSimpleName());
    }
}
