package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

/* JADX INFO: loaded from: classes13.dex */
public class WritableTypeId {
    public Object a;
    public Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2242c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Inclusion f2243e;
    public JsonToken f;
    public boolean g;

    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean requiresObjectContext() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this(obj, jsonToken, null);
    }

    public WritableTypeId(Object obj, JsonToken jsonToken, Object obj2) {
        this.a = obj;
        this.f2242c = obj2;
        this.f = jsonToken;
    }
}
