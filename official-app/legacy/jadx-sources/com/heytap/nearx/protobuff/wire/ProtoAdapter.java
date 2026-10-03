package com.heytap.nearx.protobuff.wire;

import com.oplus.aiunit.vision.f1f;
import com.oplus.aiunit.vision.uyl;
import com.oplus.aiunit.vision.xoe;
import java.io.IOException;
import java.io.InputStream;
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

/* JADX INFO: loaded from: classes17.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<ByteString> BYTES;
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;
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
    private final FieldEncoding fieldEncoding;
    final Class<?> javaType;
    ProtoAdapter<List<E>> packedAdapter;
    ProtoAdapter<List<E>> repeatedAdapter;

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i, Class<?> cls) {
            super("Unknown enum tag " + i + " for " + cls.getCanonicalName());
            this.value = i;
        }
    }

    public static class a extends ProtoAdapter<Float> {
        public a(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float decode(f1f f1fVar) throws IOException {
            return Float.valueOf(Float.intBitsToFloat(f1fVar.i()));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Float f) throws IOException {
            bVar.l(Float.floatToIntBits(f.floatValue()));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Float f) {
            return 4;
        }
    }

    public static class b extends ProtoAdapter<Double> {
        public b(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double decode(f1f f1fVar) throws IOException {
            return Double.valueOf(Double.longBitsToDouble(f1fVar.j()));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Double d) throws IOException {
            bVar.m(Double.doubleToLongBits(d.doubleValue()));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Double d) {
            return 8;
        }
    }

    public static class c extends ProtoAdapter<String> {
        public c(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String decode(f1f f1fVar) throws IOException {
            return f1fVar.k();
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, String str) throws IOException {
            bVar.o(str);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(String str) {
            return com.heytap.nearx.protobuff.wire.b.h(str);
        }
    }

    public static class d extends ProtoAdapter<ByteString> {
        public d(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteString decode(f1f f1fVar) throws IOException {
            return f1fVar.h();
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, ByteString byteString) throws IOException {
            bVar.k(byteString);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(ByteString byteString) {
            return byteString.size();
        }
    }

    public class e extends ProtoAdapter<List<E>> {
        public e(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<E> decode(f1f f1fVar) throws IOException {
            return Collections.singletonList(ProtoAdapter.this.decode(f1fVar));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, List<E> list) throws IOException {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ProtoAdapter.this.encode(bVar, list.get(i));
            }
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void encodeWithTag(com.heytap.nearx.protobuff.wire.b bVar, int i, List<E> list) throws IOException {
            if (list.isEmpty()) {
                return;
            }
            super.encodeWithTag(bVar, i, list);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int encodedSize(List<E> list) {
            int size = list.size();
            int iEncodedSize = 0;
            for (int i = 0; i < size; i++) {
                iEncodedSize += ProtoAdapter.this.encodedSize(list.get(i));
            }
            return iEncodedSize;
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int encodedSizeWithTag(int i, List<E> list) {
            if (list.isEmpty()) {
                return 0;
            }
            return super.encodedSizeWithTag(i, list);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public List<E> redact(List<E> list) {
            return Collections.emptyList();
        }
    }

    public class f extends ProtoAdapter<List<E>> {
        public f(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<E> decode(f1f f1fVar) throws IOException {
            return Collections.singletonList(ProtoAdapter.this.decode(f1fVar));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, List<E> list) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void encodeWithTag(com.heytap.nearx.protobuff.wire.b bVar, int i, List<E> list) throws IOException {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ProtoAdapter.this.encodeWithTag(bVar, i, list.get(i2));
            }
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int encodedSize(List<E> list) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int encodedSizeWithTag(int i, List<E> list) {
            int size = list.size();
            int iEncodedSizeWithTag = 0;
            for (int i2 = 0; i2 < size; i2++) {
                iEncodedSizeWithTag += ProtoAdapter.this.encodedSizeWithTag(i, list.get(i2));
            }
            return iEncodedSizeWithTag;
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public List<E> redact(List<E> list) {
            return Collections.emptyList();
        }
    }

    public static class g extends ProtoAdapter<Boolean> {
        public g(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean decode(f1f f1fVar) throws IOException {
            int iL = f1fVar.l();
            if (iL == 0) {
                return Boolean.FALSE;
            }
            if (iL == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", Integer.valueOf(iL)));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Boolean bool) throws IOException {
            bVar.q(bool.booleanValue() ? 1 : 0);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Boolean bool) {
            return 1;
        }
    }

    public static class h extends ProtoAdapter<Integer> {
        public h(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer decode(f1f f1fVar) throws IOException {
            return Integer.valueOf(f1fVar.l());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Integer num) throws IOException {
            bVar.n(num.intValue());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Integer num) {
            return com.heytap.nearx.protobuff.wire.b.e(num.intValue());
        }
    }

    public static class i extends ProtoAdapter<Integer> {
        public i(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer decode(f1f f1fVar) throws IOException {
            return Integer.valueOf(f1fVar.l());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Integer num) throws IOException {
            bVar.q(num.intValue());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Integer num) {
            return com.heytap.nearx.protobuff.wire.b.i(num.intValue());
        }
    }

    public static class j extends ProtoAdapter<Integer> {
        public j(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer decode(f1f f1fVar) throws IOException {
            return Integer.valueOf(com.heytap.nearx.protobuff.wire.b.a(f1fVar.l()));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Integer num) throws IOException {
            bVar.q(com.heytap.nearx.protobuff.wire.b.c(num.intValue()));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Integer num) {
            return com.heytap.nearx.protobuff.wire.b.i(com.heytap.nearx.protobuff.wire.b.c(num.intValue()));
        }
    }

    public static class k extends ProtoAdapter<Integer> {
        public k(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer decode(f1f f1fVar) throws IOException {
            return Integer.valueOf(f1fVar.i());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Integer num) throws IOException {
            bVar.l(num.intValue());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Integer num) {
            return 4;
        }
    }

    public static class l extends ProtoAdapter<Long> {
        public l(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long decode(f1f f1fVar) throws IOException {
            return Long.valueOf(f1fVar.m());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Long l2) throws IOException {
            bVar.r(l2.longValue());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Long l2) {
            return com.heytap.nearx.protobuff.wire.b.j(l2.longValue());
        }
    }

    public static class m extends ProtoAdapter<Long> {
        public m(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long decode(f1f f1fVar) throws IOException {
            return Long.valueOf(f1fVar.m());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Long l2) throws IOException {
            bVar.r(l2.longValue());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Long l2) {
            return com.heytap.nearx.protobuff.wire.b.j(l2.longValue());
        }
    }

    public static class n extends ProtoAdapter<Long> {
        public n(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long decode(f1f f1fVar) throws IOException {
            return Long.valueOf(com.heytap.nearx.protobuff.wire.b.b(f1fVar.m()));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Long l2) throws IOException {
            bVar.r(com.heytap.nearx.protobuff.wire.b.d(l2.longValue()));
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Long l2) {
            return com.heytap.nearx.protobuff.wire.b.j(com.heytap.nearx.protobuff.wire.b.d(l2.longValue()));
        }
    }

    public static class o extends ProtoAdapter<Long> {
        public o(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long decode(f1f f1fVar) throws IOException {
            return Long.valueOf(f1fVar.j());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Long l2) throws IOException {
            bVar.m(l2.longValue());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Long l2) {
            return 8;
        }
    }

    public static final class p<K, V> extends ProtoAdapter<Map.Entry<K, V>> {
        public final ProtoAdapter<K> a;
        public final ProtoAdapter<V> b;

        public p(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.a = protoAdapter;
            this.b = protoAdapter2;
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> decode(f1f f1fVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Map.Entry<K, V> entry) throws IOException {
            this.a.encodeWithTag(bVar, 1, entry.getKey());
            this.b.encodeWithTag(bVar, 2, entry.getValue());
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Map.Entry<K, V> entry) {
            return this.a.encodedSizeWithTag(1, entry.getKey()) + this.b.encodedSizeWithTag(2, entry.getValue());
        }
    }

    public static final class q<K, V> extends ProtoAdapter<Map<K, V>> {
        public final p<K, V> a;

        public q(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.a = new p<>(protoAdapter, protoAdapter2);
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, V> decode(f1f f1fVar) throws IOException {
            long jC = f1fVar.c();
            K kDecode = null;
            V vDecode = null;
            while (true) {
                int iF = f1fVar.f();
                if (iF == -1) {
                    break;
                }
                if (iF == 1) {
                    kDecode = this.a.a.decode(f1fVar);
                } else if (iF == 2) {
                    vDecode = this.a.b.decode(f1fVar);
                }
            }
            f1fVar.d(jC);
            if (kDecode == null) {
                throw new IllegalStateException("Map entry with null key");
            }
            if (vDecode != null) {
                return Collections.singletonMap(kDecode, vDecode);
            }
            throw new IllegalStateException("Map entry with null value");
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.heytap.nearx.protobuff.wire.b bVar, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void encodeWithTag(com.heytap.nearx.protobuff.wire.b bVar, int i, Map<K, V> map) throws IOException {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.a.encodeWithTag(bVar, i, it.next());
            }
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int encodedSizeWithTag(int i, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            int iEncodedSizeWithTag = 0;
            while (it.hasNext()) {
                iEncodedSizeWithTag += this.a.encodedSizeWithTag(i, it.next());
            }
            return iEncodedSizeWithTag;
        }

        @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> redact(Map<K, V> map) {
            return Collections.emptyMap();
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        BOOL = new g(fieldEncoding, Boolean.class);
        INT32 = new h(fieldEncoding, Integer.class);
        UINT32 = new i(fieldEncoding, Integer.class);
        SINT32 = new j(fieldEncoding, Integer.class);
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        k kVar = new k(fieldEncoding2, Integer.class);
        FIXED32 = kVar;
        SFIXED32 = kVar;
        INT64 = new l(fieldEncoding, Long.class);
        UINT64 = new m(fieldEncoding, Long.class);
        SINT64 = new n(fieldEncoding, Long.class);
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        o oVar = new o(fieldEncoding3, Long.class);
        FIXED64 = oVar;
        SFIXED64 = oVar;
        FLOAT = new a(fieldEncoding2, Float.class);
        DOUBLE = new b(fieldEncoding3, Double.class);
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        STRING = new c(fieldEncoding4, String.class);
        BYTES = new d(fieldEncoding4, ByteString.class);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.fieldEncoding = fieldEncoding;
        this.javaType = cls;
    }

    private ProtoAdapter<List<E>> createPacked() {
        FieldEncoding fieldEncoding = this.fieldEncoding;
        FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
        if (fieldEncoding != fieldEncoding2) {
            return new e(fieldEncoding2, List.class);
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    private ProtoAdapter<List<E>> createRepeated() {
        return new f(this.fieldEncoding, List.class);
    }

    public static <M extends Message> ProtoAdapter<M> get(M m2) {
        return get(m2.getClass());
    }

    public static <E extends uyl> com.heytap.nearx.protobuff.wire.c<E> newEnumAdapter(Class<E> cls) {
        return new com.heytap.nearx.protobuff.wire.c<>(cls);
    }

    public static <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new q(protoAdapter, protoAdapter2);
    }

    public static <M extends Message<M, B>, B extends Message.a<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return com.heytap.nearx.protobuff.wire.d.a(cls);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterCreatePacked = createPacked();
        this.packedAdapter = protoAdapterCreatePacked;
        return protoAdapterCreatePacked;
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterCreateRepeated = createRepeated();
        this.repeatedAdapter = protoAdapterCreateRepeated;
        return protoAdapterCreateRepeated;
    }

    public abstract E decode(f1f f1fVar) throws IOException;

    public final E decode(InputStream inputStream) throws IOException {
        xoe.a(inputStream, "stream == null");
        return decode(Okio.buffer(Okio.source(inputStream)));
    }

    public abstract void encode(com.heytap.nearx.protobuff.wire.b bVar, E e2) throws IOException;

    public final void encode(OutputStream outputStream, E e2) throws IOException {
        xoe.a(e2, "value == null");
        xoe.a(outputStream, "stream == null");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(outputStream));
        encode(bufferedSinkBuffer, e2);
        bufferedSinkBuffer.emit();
    }

    public void encodeWithTag(com.heytap.nearx.protobuff.wire.b bVar, int i2, E e2) throws IOException {
        bVar.p(i2, this.fieldEncoding);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            bVar.q(encodedSize(e2));
        }
        encode(bVar, e2);
    }

    public abstract int encodedSize(E e2);

    public int encodedSizeWithTag(int i2, E e2) {
        int iEncodedSize = encodedSize(e2);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += com.heytap.nearx.protobuff.wire.b.i(iEncodedSize);
        }
        return iEncodedSize + com.heytap.nearx.protobuff.wire.b.g(i2);
    }

    public E redact(E e2) {
        return null;
    }

    public String toString(E e2) {
        return e2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoAdapter<?> withLabel(WireField.Label label) {
        if (label.isRepeated()) {
            return label.isPacked() ? asPacked() : asRepeated();
        }
        return this;
    }

    public static <M> ProtoAdapter<M> get(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e2);
        }
    }

    public final E decode(BufferedSource bufferedSource) throws IOException {
        xoe.a(bufferedSource, "source == null");
        return decode(new f1f(bufferedSource));
    }

    public final void encode(BufferedSink bufferedSink, E e2) throws IOException {
        xoe.a(e2, "value == null");
        xoe.a(bufferedSink, "sink == null");
        encode(new com.heytap.nearx.protobuff.wire.b(bufferedSink), e2);
    }

    public static ProtoAdapter<?> get(String str) {
        try {
            int iIndexOf = str.indexOf(35);
            return (ProtoAdapter) Class.forName(str.substring(0, iIndexOf)).getField(str.substring(iIndexOf + 1)).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
            throw new IllegalArgumentException("failed to access " + str, e2);
        }
    }

    public final E decode(ByteString byteString) throws IOException {
        xoe.a(byteString, "bytes == null");
        return decode(new Buffer().write(byteString));
    }

    public final byte[] encode(E e2) {
        xoe.a(e2, "value == null");
        Buffer buffer = new Buffer();
        try {
            encode(buffer, e2);
            return buffer.readByteArray();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public final E decode(byte[] bArr) throws IOException {
        xoe.a(bArr, "bytes == null");
        return decode(new Buffer().write(bArr));
    }
}
