package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class jd2 implements n2c<File, ByteBuffer> {

    public static final class a implements ft4<ByteBuffer> {
        public final File i;

        public a(File file) {
            this.i = file;
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public void f(@NonNull Priority priority, @NonNull ft4.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(md2.a(this.i));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.e(e2);
            }
        }
    }

    public static class b implements o2c<File, ByteBuffer> {
        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<File, ByteBuffer> d(@NonNull p7c p7cVar) {
            return new jd2();
        }
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<ByteBuffer> a(@NonNull File file, int i, int i2, @NonNull erd erdVar) {
        return new n2c.a<>(new ebd(file), new a(file));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull File file) {
        return true;
    }
}
