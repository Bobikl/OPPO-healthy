package com.oplus.nearx.protobuff.wire;

import com.oplus.aiunit.vision.e1f;
import com.oplus.aiunit.vision.kam;
import com.oplus.aiunit.vision.mea;
import com.oplus.nearx.protobuff.wire.Message;
import com.oplus.nearx.protobuff.wire.Message.a;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class RuntimeMessageAdapter<M extends Message<M, B>, B extends Message.a<M, B>> extends ProtoAdapter<M> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<M> f19908e;
    public final Class<B> f;
    public final Map<Integer, a<M, B>> g;

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeMessageAdapter) && ((RuntimeMessageAdapter) obj).f19908e == this.f19908e;
    }

    public int hashCode() {
        return this.f19908e.hashCode();
    }

    @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public M e(e1f e1fVar) throws IOException {
        Message.a aVarX = x();
        long jC = e1fVar.c();
        while (true) {
            int iF = e1fVar.f();
            if (iF == -1) {
                e1fVar.d(jC);
                return (M) aVarX.b();
            }
            a<M, B> aVar = this.g.get(Integer.valueOf(iF));
            if (aVar != null) {
                try {
                    aVar.h(aVarX, (aVar.d() ? aVar.a() : aVar.g()).e(e1fVar));
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    aVarX.a(iF, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else {
                FieldEncoding fieldEncodingG = e1fVar.g();
                aVarX.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().e(e1fVar));
            }
        }
    }

    @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(b bVar, M m) throws IOException {
        for (a<M, B> aVar : this.g.values()) {
            Object objB = aVar.b(m);
            if (objB != null) {
                aVar.a().l(bVar, aVar.f19909c, objB);
            }
        }
        bVar.k(m.unknownFields());
    }

    @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int m(M m) {
        int i = m.cachedSerializedSize;
        if (i != 0) {
            return i;
        }
        int iN = 0;
        for (a<M, B> aVar : this.g.values()) {
            Object objB = aVar.b(m);
            if (objB != null) {
                iN += aVar.a().n(aVar.f19909c, objB);
            }
        }
        int size = iN + m.unknownFields().size();
        m.cachedSerializedSize = size;
        return size;
    }

    public B x() {
        try {
            return this.f.newInstance();
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public M r(M m) {
        Message.a<M, B> aVarNewBuilder = m.newBuilder();
        for (a<M, B> aVar : this.g.values()) {
            if (aVar.f && aVar.a == WireField$Label.REQUIRED) {
                throw new UnsupportedOperationException(String.format("Field '%s' in %s is required and cannot be redacted.", aVar.b, this.b.getName()));
            }
            boolean zIsAssignableFrom = Message.class.isAssignableFrom(aVar.g().b);
            if (aVar.f || (zIsAssignableFrom && !aVar.a.isRepeated())) {
                Object objC = aVar.c(aVarNewBuilder);
                if (objC != null) {
                    aVar.f(aVarNewBuilder, aVar.a().r(objC));
                }
            } else if (zIsAssignableFrom && aVar.a.isRepeated()) {
                mea.a((List) aVar.c(aVarNewBuilder), aVar.g());
            }
        }
        aVarNewBuilder.c();
        return (M) aVarNewBuilder.b();
    }

    @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public String s(M m) {
        StringBuilder sb = new StringBuilder();
        for (a<M, B> aVar : this.g.values()) {
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
        sb.replace(0, 2, this.f19908e.getSimpleName() + '{');
        sb.append('}');
        return sb.toString();
    }
}
