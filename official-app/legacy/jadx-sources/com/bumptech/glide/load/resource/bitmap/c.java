package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.btf;
import com.oplus.aiunit.vision.ch0;
import com.oplus.aiunit.vision.erd;
import com.oplus.aiunit.vision.eu6;
import com.oplus.aiunit.vision.kf1;
import com.oplus.aiunit.vision.usf;
import com.oplus.aiunit.vision.vfb;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class c implements btf<InputStream, Bitmap> {
    public final com.bumptech.glide.load.resource.bitmap.a a;
    public final ch0 b;

    public static class a implements com.bumptech.glide.load.resource.bitmap.a.b {
        public final RecyclableBufferedInputStream a;
        public final eu6 b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, eu6 eu6Var) {
            this.a = recyclableBufferedInputStream;
            this.b = eu6Var;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a(kf1 kf1Var, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                kf1Var.b(bitmap);
                throw iOExceptionA;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b() {
            this.a.g();
        }
    }

    public c(com.bumptech.glide.load.resource.bitmap.a aVar, ch0 ch0Var) {
        this.a = aVar;
        this.b = ch0Var;
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Bitmap> a(@NonNull InputStream inputStream, int i, int i2, @NonNull erd erdVar) throws IOException {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.b);
        }
        eu6 eu6VarG = eu6.g(recyclableBufferedInputStream);
        try {
            return this.a.f(new vfb(eu6VarG), i, i2, erdVar, new a(recyclableBufferedInputStream, eu6VarG));
        } finally {
            eu6VarG.release();
            if (z) {
                recyclableBufferedInputStream.release();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull erd erdVar) {
        return this.a.p(inputStream);
    }
}
