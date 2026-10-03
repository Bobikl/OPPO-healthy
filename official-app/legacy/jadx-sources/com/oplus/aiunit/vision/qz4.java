package com.oplus.aiunit.vision;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class qz4<Model, Data> implements n2c<Model, Data> {
    public final a<Data> a;

    public interface a<Data> {
        Class<Data> a();

        void close(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;
    }

    public static final class b<Data> implements ft4<Data> {
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a<Data> f15996j;
        public Data k;

        public b(String str, a<Data> aVar) {
            this.i = str;
            this.f15996j = aVar;
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public Class<Data> a() {
            return this.f15996j.a();
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void b() {
            try {
                this.f15996j.close(this.k);
            } catch (IOException unused) {
            }
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [Data, java.lang.Object] */
        @Override // com.oplus.aiunit.vision.ft4
        public void f(@NonNull Priority priority, @NonNull ft4.a<? super Data> aVar) {
            try {
                Data dataDecode = this.f15996j.decode(this.i);
                this.k = dataDecode;
                aVar.d(dataDecode);
            } catch (IllegalArgumentException e2) {
                aVar.e(e2);
            }
        }
    }

    public static final class c<Model> implements o2c<Model, InputStream> {
        public final a<InputStream> a = new a();

        public class a implements a<InputStream> {
            public a() {
            }

            @Override // com.oplus.aiunit.vision.qz4.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.oplus.aiunit.vision.qz4.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.oplus.aiunit.vision.qz4.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream decode(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Model, InputStream> d(@NonNull p7c p7cVar) {
            return new qz4(this.a);
        }
    }

    public qz4(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // com.oplus.aiunit.vision.n2c
    public n2c.a<Data> a(@NonNull Model model, int i, int i2, @NonNull erd erdVar) {
        return new n2c.a<>(new ebd(model), new b(model.toString(), this.a));
    }

    @Override // com.oplus.aiunit.vision.n2c
    public boolean b(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }
}
