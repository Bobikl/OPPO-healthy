package com.heytap.nearx.protobuff.wire;

import com.heytap.nearx.protobuff.wire.Message;
import com.heytap.nearx.protobuff.wire.Message.a;
import com.oplus.aiunit.vision.f1f;
import com.oplus.aiunit.vision.kam;
import com.oplus.aiunit.vision.nea;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class d<M extends Message<M, B>, B extends Message.a<M, B>> extends ProtoAdapter<M> {
    public final Class<M> a;
    public final Class<B> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, a<M, B>> f7416c;

    public d(Class<M> cls, Class<B> cls2, Map<Integer, a<M, B>> map) {
        super(FieldEncoding.LENGTH_DELIMITED, cls);
        this.a = cls;
        this.b = cls2;
        this.f7416c = map;
    }

    public static <M extends Message<M, B>, B extends Message.a<M, B>> d<M, B> a(Class<M> cls) {
        Class clsE = e(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : cls.getDeclaredFields()) {
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new a(wireField, field, clsE));
            }
        }
        return new d<>(cls, clsE, Collections.unmodifiableMap(linkedHashMap));
    }

    public static <M extends Message<M, B>, B extends Message.a<M, B>> Class<B> e(Class<M> cls) {
        try {
            return (Class<B>) Class.forName(cls.getName() + "$Builder");
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("No builder class found for message type " + cls.getName());
        }
    }

    @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M decode(f1f f1fVar) throws IOException {
        Message.a aVarF = f();
        long jC = f1fVar.c();
        while (true) {
            int iF = f1fVar.f();
            if (iF == -1) {
                f1fVar.d(jC);
                return (M) aVarF.b();
            }
            a<M, B> aVar = this.f7416c.get(Integer.valueOf(iF));
            if (aVar != null) {
                try {
                    aVar.j(aVarF, (aVar.f() ? aVar.a() : aVar.i()).decode(f1fVar));
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    aVarF.a(iF, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else {
                FieldEncoding fieldEncodingG = f1fVar.g();
                aVarF.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().decode(f1fVar));
            }
        }
    }

    @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void encode(b bVar, M m) throws IOException {
        for (a<M, B> aVar : this.f7416c.values()) {
            Object objB = aVar.b(m);
            if (objB != null) {
                aVar.a().encodeWithTag(bVar, aVar.f7412c, objB);
            }
        }
        bVar.k(m.unknownFields());
    }

    @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int encodedSize(M m) {
        int i = m.cachedSerializedSize;
        if (i != 0) {
            return i;
        }
        int iEncodedSizeWithTag = 0;
        for (a<M, B> aVar : this.f7416c.values()) {
            Object objB = aVar.b(m);
            if (objB != null) {
                iEncodedSizeWithTag += aVar.a().encodedSizeWithTag(aVar.f7412c, objB);
            }
        }
        int size = iEncodedSizeWithTag + m.unknownFields().size();
        m.cachedSerializedSize = size;
        return size;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).a == this.a;
    }

    public B f() {
        try {
            return this.b.newInstance();
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public M redact(M m) {
        Message.a<M, B> aVarNewBuilder = m.newBuilder();
        for (a<M, B> aVar : this.f7416c.values()) {
            if (aVar.f && aVar.a == WireField.Label.REQUIRED) {
                throw new UnsupportedOperationException(String.format("Field '%s' in %s is required and cannot be redacted.", aVar.b, this.javaType.getName()));
            }
            boolean zIsAssignableFrom = Message.class.isAssignableFrom(aVar.i().javaType);
            if (aVar.f || (zIsAssignableFrom && !aVar.a.isRepeated())) {
                Object objE = aVar.e(aVarNewBuilder);
                if (objE != null) {
                    aVar.h(aVarNewBuilder, aVar.a().redact(objE));
                }
            } else if (zIsAssignableFrom && aVar.a.isRepeated()) {
                nea.a((List) aVar.e(aVarNewBuilder), aVar.i());
            }
        }
        aVarNewBuilder.c();
        return (M) aVarNewBuilder.b();
    }

    @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String toString(M m) {
        StringBuilder sb = new StringBuilder();
        for (a<M, B> aVar : this.f7416c.values()) {
            Object objB = aVar.b(m);
            if (objB != null) {
                sb.append(", ");
                sb.append(aVar.b);
                sb.append(kam.h);
                if (aVar.f) {
                    objB = "██";
                }
                sb.append(objB);
            }
        }
        sb.replace(0, 2, this.a.getSimpleName() + '{');
        sb.append('}');
        return sb.toString();
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
