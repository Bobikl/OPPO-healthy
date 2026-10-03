package com.oplus.aiunit.vision;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class tb7<Data> implements n2c<File, Data> {
    public final d<Data> a;

    public static class a<Data> implements o2c<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public final void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public final n2c<File, Data> d(@NonNull p7c p7cVar) {
            return new tb7(this.a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            @Override // com.oplus.aiunit.vision.tb7.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.oplus.aiunit.vision.tb7.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.oplus.aiunit.vision.tb7.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements ft4<Data> {
        public final File i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d<Data> f16955j;
        public Data k;

        public c(File file, d<Data> dVar) {
            this.i = file;
            this.f16955j = dVar;
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public Class<Data> a() {
            return this.f16955j.a();
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void b() {
            Data data = this.k;
            if (data != null) {
                try {
                    this.f16955j.close(data);
                } catch (IOException unused) {
                }
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

        /* JADX WARN: Type inference failed for: r2v5, types: [Data, java.lang.Object] */
        @Override // com.oplus.aiunit.vision.ft4
        public void f(@NonNull Priority priority, @NonNull ft4.a<? super Data> aVar) {
            try {
                Data dataB = this.f16955j.b(this.i);
                this.k = dataB;
                aVar.d(dataB);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.e(e2);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void close(Data data) throws IOException;
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            @Override // com.oplus.aiunit.vision.tb7.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.oplus.aiunit.vision.tb7.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.oplus.aiunit.vision.tb7.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public tb7(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<Data> a(@NonNull File file, int i, int i2, @NonNull erd erdVar) {
        return new n2c.a<>(new ebd(file), new c(file, this.a));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull File file) {
        return true;
    }
}
