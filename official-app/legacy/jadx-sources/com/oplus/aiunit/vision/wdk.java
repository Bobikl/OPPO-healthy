package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class wdk {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonTypeInfo.As.values().length];
            a = iArr;
            try {
                iArr[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonTypeInfo.As.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public abstract wdk a(BeanProperty beanProperty);

    public abstract String b();

    public abstract JsonTypeInfo.As c();

    public WritableTypeId d(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i = a.a[c().ordinal()];
        if (i == 1) {
            writableTypeId.f2243e = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.d = b();
        } else if (i == 2) {
            writableTypeId.f2243e = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.d = b();
        } else if (i == 3) {
            writableTypeId.f2243e = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.d = b();
        } else if (i == 4) {
            writableTypeId.f2243e = WritableTypeId.Inclusion.WRAPPER_ARRAY;
        } else if (i != 5) {
            fvk.c();
        } else {
            writableTypeId.f2243e = WritableTypeId.Inclusion.WRAPPER_OBJECT;
        }
        return writableTypeId;
    }

    public WritableTypeId e(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId writableTypeIdD = d(obj, jsonToken);
        writableTypeIdD.f2242c = obj2;
        return writableTypeIdD;
    }

    public WritableTypeId f(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId writableTypeIdD = d(obj, jsonToken);
        writableTypeIdD.b = cls;
        return writableTypeIdD;
    }

    public abstract WritableTypeId g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    public abstract WritableTypeId h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;
}
