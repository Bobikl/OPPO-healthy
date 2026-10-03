package com.oplus.nearx.protobuff.wire;

import com.oplus.aiunit.vision.e1f;
import com.oplus.aiunit.vision.zoe;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<ByteString> BYTES;
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<Long> UINT64;
    public final FieldEncoding a;
    public final Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProtoAdapter<List<E>> f19902c;
    public ProtoAdapter<List<E>> d;

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i, Class<?> cls) {
            super("Unknown enum tag " + i + " for " + cls.getCanonicalName());
            this.value = i;
        }
    }

    public static final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ProtoAdapter<K> f19905e;
        public final ProtoAdapter<V> f;

        public MapEntryProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.f19905e = protoAdapter;
            this.f = protoAdapter2;
        }

        @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> e(e1f e1fVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void h(b bVar, Map.Entry<K, V> entry) throws IOException {
            this.f19905e.l(bVar, 1, entry.getKey());
            this.f.l(bVar, 2, entry.getValue());
        }

        @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public int m(Map.Entry<K, V> entry) {
            return this.f19905e.n(1, entry.getKey()) + this.f.n(2, entry.getValue());
        }
    }

    public static final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MapEntryProtoAdapter<K, V> f19906e;

        public MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.f19906e = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
        }

        @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public Map<K, V> e(e1f e1fVar) throws IOException {
            long jC = e1fVar.c();
            K kE = null;
            V vE = null;
            while (true) {
                int iF = e1fVar.f();
                if (iF == -1) {
                    break;
                }
                if (iF == 1) {
                    kE = this.f19906e.f19905e.e(e1fVar);
                } else if (iF == 2) {
                    vE = this.f19906e.f.e(e1fVar);
                }
            }
            e1fVar.d(jC);
            if (kE == null) {
                throw new IllegalStateException("Map entry with null key");
            }
            if (vE != null) {
                return Collections.singletonMap(kE, vE);
            }
            throw new IllegalStateException("Map entry with null value");
        }

        @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void h(b bVar, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void l(b bVar, int i, Map<K, V> map) throws IOException {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.f19906e.l(bVar, i, it.next());
            }
        }

        @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public int m(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int n(int i, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            int iN = 0;
            while (it.hasNext()) {
                iN += this.f19906e.n(i, it.next());
            }
            return iN;
        }

        @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public Map<K, V> r(Map<K, V> map) {
            return Collections.emptyMap();
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        BOOL = new ProtoAdapter<Boolean>(fieldEncoding, Boolean.class) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.1
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Boolean e(e1f e1fVar) throws IOException {
                int iL = e1fVar.l();
                if (iL == 0) {
                    return Boolean.FALSE;
                }
                if (iL == 1) {
                    return Boolean.TRUE;
                }
                throw new IOException(String.format("Invalid boolean value 0x%02x", Integer.valueOf(iL)));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Boolean bool) throws IOException {
                bVar.q(bool.booleanValue() ? 1 : 0);
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Boolean bool) {
                return 1;
            }
        };
        Class<Integer> cls = Integer.class;
        INT32 = new ProtoAdapter<Integer>(fieldEncoding, cls) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.2
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Integer e(e1f e1fVar) throws IOException {
                return Integer.valueOf(e1fVar.l());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Integer num) throws IOException {
                bVar.n(num.intValue());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Integer num) {
                return b.e(num.intValue());
            }
        };
        UINT32 = new ProtoAdapter<Integer>(fieldEncoding, cls) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.3
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Integer e(e1f e1fVar) throws IOException {
                return Integer.valueOf(e1fVar.l());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Integer num) throws IOException {
                bVar.q(num.intValue());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Integer num) {
                return b.i(num.intValue());
            }
        };
        SINT32 = new ProtoAdapter<Integer>(fieldEncoding, cls) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.4
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Integer e(e1f e1fVar) throws IOException {
                return Integer.valueOf(b.a(e1fVar.l()));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Integer num) throws IOException {
                bVar.q(b.c(num.intValue()));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Integer num) {
                return b.i(b.c(num.intValue()));
            }
        };
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        ProtoAdapter<Integer> protoAdapter = new ProtoAdapter<Integer>(fieldEncoding2, cls) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.5
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Integer e(e1f e1fVar) throws IOException {
                return Integer.valueOf(e1fVar.i());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Integer num) throws IOException {
                bVar.l(num.intValue());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Integer num) {
                return 4;
            }
        };
        FIXED32 = protoAdapter;
        SFIXED32 = protoAdapter;
        Class<Long> cls2 = Long.class;
        INT64 = new ProtoAdapter<Long>(fieldEncoding, cls2) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.6
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Long e(e1f e1fVar) throws IOException {
                return Long.valueOf(e1fVar.m());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Long l2) throws IOException {
                bVar.r(l2.longValue());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Long l2) {
                return b.j(l2.longValue());
            }
        };
        UINT64 = new ProtoAdapter<Long>(fieldEncoding, cls2) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.7
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Long e(e1f e1fVar) throws IOException {
                return Long.valueOf(e1fVar.m());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Long l2) throws IOException {
                bVar.r(l2.longValue());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Long l2) {
                return b.j(l2.longValue());
            }
        };
        SINT64 = new ProtoAdapter<Long>(fieldEncoding, cls2) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.8
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Long e(e1f e1fVar) throws IOException {
                return Long.valueOf(b.b(e1fVar.m()));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Long l2) throws IOException {
                bVar.r(b.d(l2.longValue()));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Long l2) {
                return b.j(b.d(l2.longValue()));
            }
        };
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        ProtoAdapter<Long> protoAdapter2 = new ProtoAdapter<Long>(fieldEncoding3, cls2) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.9
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Long e(e1f e1fVar) throws IOException {
                return Long.valueOf(e1fVar.j());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Long l2) throws IOException {
                bVar.m(l2.longValue());
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Long l2) {
                return 8;
            }
        };
        FIXED64 = protoAdapter2;
        SFIXED64 = protoAdapter2;
        FLOAT = new ProtoAdapter<Float>(fieldEncoding2, Float.class) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.10
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Float e(e1f e1fVar) throws IOException {
                return Float.valueOf(Float.intBitsToFloat(e1fVar.i()));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Float f) throws IOException {
                bVar.l(Float.floatToIntBits(f.floatValue()));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Float f) {
                return 4;
            }
        };
        DOUBLE = new ProtoAdapter<Double>(fieldEncoding3, Double.class) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.11
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Double e(e1f e1fVar) throws IOException {
                return Double.valueOf(Double.longBitsToDouble(e1fVar.j()));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, Double d) throws IOException {
                bVar.m(Double.doubleToLongBits(d.doubleValue()));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(Double d) {
                return 8;
            }
        };
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        STRING = new ProtoAdapter<String>(fieldEncoding4, String.class) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.12
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public String e(e1f e1fVar) throws IOException {
                return e1fVar.k();
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, String str) throws IOException {
                bVar.o(str);
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(String str) {
                return b.h(str);
            }
        };
        BYTES = new ProtoAdapter<ByteString>(fieldEncoding4, ByteString.class) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.13
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public ByteString e(e1f e1fVar) throws IOException {
                return e1fVar.h();
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, ByteString byteString) throws IOException {
                bVar.k(byteString);
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public int m(ByteString byteString) {
                return byteString.size();
            }
        };
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.a = fieldEncoding;
        this.b = cls;
    }

    public static <M> ProtoAdapter<M> o(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e2);
        }
    }

    public static ProtoAdapter<?> p(String str) {
        try {
            int iIndexOf = str.indexOf(35);
            return (ProtoAdapter) Class.forName(str.substring(0, iIndexOf)).getField(str.substring(iIndexOf + 1)).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
            throw new IllegalArgumentException("failed to access " + str, e2);
        }
    }

    public static <K, V> ProtoAdapter<Map<K, V>> q(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public final ProtoAdapter<List<E>> a() {
        ProtoAdapter<List<E>> protoAdapter = this.f19902c;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterC = c();
        this.f19902c = protoAdapterC;
        return protoAdapterC;
    }

    public final ProtoAdapter<List<E>> b() {
        ProtoAdapter<List<E>> protoAdapter = this.d;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterD = d();
        this.d = protoAdapterD;
        return protoAdapterD;
    }

    public final ProtoAdapter<List<E>> c() {
        FieldEncoding fieldEncoding = this.a;
        FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
        if (fieldEncoding != fieldEncoding2) {
            return new ProtoAdapter<List<E>>(fieldEncoding2, List.class) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.14
                @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public List<E> e(e1f e1fVar) throws IOException {
                    return Collections.singletonList(ProtoAdapter.this.e(e1fVar));
                }

                @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public void h(b bVar, List<E> list) throws IOException {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ProtoAdapter.this.h(bVar, list.get(i));
                    }
                }

                @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public void l(b bVar, int i, List<E> list) throws IOException {
                    if (list.isEmpty()) {
                        return;
                    }
                    super.l(bVar, i, list);
                }

                @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public int m(List<E> list) {
                    int size = list.size();
                    int iM = 0;
                    for (int i = 0; i < size; i++) {
                        iM += ProtoAdapter.this.m(list.get(i));
                    }
                    return iM;
                }

                @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public int n(int i, List<E> list) {
                    if (list.isEmpty()) {
                        return 0;
                    }
                    return super.n(i, list);
                }

                @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public List<E> r(List<E> list) {
                    return Collections.emptyList();
                }
            };
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    public final ProtoAdapter<List<E>> d() {
        return new ProtoAdapter<List<E>>(this.a, List.class) { // from class: com.oplus.nearx.protobuff.wire.ProtoAdapter.15
            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public List<E> e(e1f e1fVar) throws IOException {
                return Collections.singletonList(ProtoAdapter.this.e(e1fVar));
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public void h(b bVar, List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public void l(b bVar, int i, List<E> list) throws IOException {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ProtoAdapter.this.l(bVar, i, list.get(i2));
                }
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public int m(List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public int n(int i, List<E> list) {
                int size = list.size();
                int iN = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    iN += ProtoAdapter.this.n(i, list.get(i2));
                }
                return iN;
            }

            @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public List<E> r(List<E> list) {
                return Collections.emptyList();
            }
        };
    }

    public abstract E e(e1f e1fVar) throws IOException;

    public final E f(BufferedSource bufferedSource) throws IOException {
        zoe.a(bufferedSource, "source == null");
        return e(new e1f(bufferedSource));
    }

    public final E g(byte[] bArr) throws IOException {
        zoe.a(bArr, "bytes == null");
        return f(new Buffer().write(bArr));
    }

    public abstract void h(b bVar, E e2) throws IOException;

    public final void i(OutputStream outputStream, E e2) throws IOException {
        zoe.a(e2, "value == null");
        zoe.a(outputStream, "stream == null");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(outputStream));
        j(bufferedSinkBuffer, e2);
        bufferedSinkBuffer.emit();
    }

    public final void j(BufferedSink bufferedSink, E e2) throws IOException {
        zoe.a(e2, "value == null");
        zoe.a(bufferedSink, "sink == null");
        h(new b(bufferedSink), e2);
    }

    public final byte[] k(E e2) {
        zoe.a(e2, "value == null");
        Buffer buffer = new Buffer();
        try {
            j(buffer, e2);
            return buffer.readByteArray();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public void l(b bVar, int i, E e2) throws IOException {
        bVar.p(i, this.a);
        if (this.a == FieldEncoding.LENGTH_DELIMITED) {
            bVar.q(m(e2));
        }
        h(bVar, e2);
    }

    public abstract int m(E e2);

    public int n(int i, E e2) {
        int iM = m(e2);
        if (this.a == FieldEncoding.LENGTH_DELIMITED) {
            iM += b.i(iM);
        }
        return iM + b.g(i);
    }

    public E r(E e2) {
        return null;
    }

    public String s(E e2) {
        return e2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoAdapter<?> t(WireField$Label wireField$Label) {
        if (wireField$Label.isRepeated()) {
            return wireField$Label.isPacked() ? a() : b();
        }
        return this;
    }
}
