package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.mla;
import com.oplus.aiunit.vision.wdk;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ValueNode extends BaseJsonNode {
    private static final long serialVersionUID = 1;

    @Override // com.oplus.aiunit.vision.ela
    public ela _at(mla mlaVar) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public abstract JsonToken asToken();

    @Override // com.oplus.aiunit.vision.ela
    public <T extends ela> T deepCopy() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final ObjectNode findParent(String str) {
        return null;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final List<ela> findParents(String str, List<ela> list) {
        return list;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final ela findValue(String str) {
        return null;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final List<ela> findValues(String str, List<ela> list) {
        return list;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final List<String> findValuesAsText(String str, List<String> list) {
        return list;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final ela get(int i) {
        return null;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final boolean has(int i) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final boolean hasNonNull(int i) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isEmpty() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public void serializeWithType(JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        WritableTypeId writableTypeIdG = wdkVar.g(jsonGenerator, wdkVar.d(this, asToken()));
        serialize(jsonGenerator, eugVar);
        wdkVar.h(jsonGenerator, writableTypeIdG);
    }

    @Override // com.oplus.aiunit.vision.ela
    public final ela get(String str) {
        return null;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final boolean has(String str) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final boolean hasNonNull(String str) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.ela
    public final ela path(int i) {
        return MissingNode.getInstance();
    }

    @Override // com.oplus.aiunit.vision.ela
    public final ela path(String str) {
        return MissingNode.getInstance();
    }
}
