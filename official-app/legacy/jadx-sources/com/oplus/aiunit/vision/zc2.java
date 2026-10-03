package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class zc2<Data> implements n2c<byte[], Data> {
    public final b<Data> a;

    public static class a implements o2c<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.zc2$a$a, reason: collision with other inner class name */
        public class C0948a implements b<ByteBuffer> {
            public C0948a() {
            }

            @Override // com.oplus.aiunit.vision.zc2.b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.oplus.aiunit.vision.zc2.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<byte[], ByteBuffer> d(@NonNull p7c p7cVar) {
            return new zc2(new C0948a());
        }
    }

    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements ft4<Data> {
        public final byte[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final b<Data> f19363j;

        public c(byte[] bArr, b<Data> bVar) {
            this.i = bArr;
            this.f19363j = bVar;
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public Class<Data> a() {
            return this.f19363j.a();
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void b() {
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void cancel() {
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void f(@NonNull Priority priority, @NonNull ft4.a<? super Data> aVar) {
            aVar.d(this.f19363j.b(this.i));
        }
    }

    public static class d implements o2c<byte[], InputStream> {

        public class a implements b<InputStream> {
            public a() {
            }

            @Override // com.oplus.aiunit.vision.zc2.b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.oplus.aiunit.vision.zc2.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<byte[], InputStream> d(@NonNull p7c p7cVar) {
            return new zc2(new a());
        }
    }

    public zc2(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<Data> a(@NonNull byte[] bArr, int i, int i2, @NonNull erd erdVar) {
        return new n2c.a<>(new ebd(bArr), new c(bArr, this.a));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull byte[] bArr) {
        return true;
    }
}
