package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(28)
public final class m50 {
    public final List<ImageHeaderParser> a;
    public final ch0 b;

    public static final class a implements usf<Drawable> {
        public final AnimatedImageDrawable i;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.i = animatedImageDrawable;
        }

        @Override // com.oplus.aiunit.vision.usf
        @NonNull
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.oplus.aiunit.vision.usf
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.i;
        }

        @Override // com.oplus.aiunit.vision.usf
        public int getSize() {
            return this.i.getIntrinsicWidth() * this.i.getIntrinsicHeight() * uqk.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // com.oplus.aiunit.vision.usf
        public void recycle() {
            this.i.stop();
            this.i.clearAnimationCallbacks();
        }
    }

    public static final class b implements btf<ByteBuffer, Drawable> {
        public final m50 a;

        public b(m50 m50Var) {
            this.a = m50Var;
        }

        @Override // com.oplus.aiunit.vision.btf
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public usf<Drawable> a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull erd erdVar) throws IOException {
            return this.a.b(ImageDecoder.createSource(byteBuffer), i, i2, erdVar);
        }

        @Override // com.oplus.aiunit.vision.btf
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull erd erdVar) throws IOException {
            return this.a.d(byteBuffer);
        }
    }

    public static final class c implements btf<InputStream, Drawable> {
        public final m50 a;

        public c(m50 m50Var) {
            this.a = m50Var;
        }

        @Override // com.oplus.aiunit.vision.btf
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public usf<Drawable> a(@NonNull InputStream inputStream, int i, int i2, @NonNull erd erdVar) throws IOException {
            return this.a.b(ImageDecoder.createSource(md2.b(inputStream)), i, i2, erdVar);
        }

        @Override // com.oplus.aiunit.vision.btf
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(@NonNull InputStream inputStream, @NonNull erd erdVar) throws IOException {
            return this.a.c(inputStream);
        }
    }

    public m50(List<ImageHeaderParser> list, ch0 ch0Var) {
        this.a = list;
        this.b = ch0Var;
    }

    public static btf<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, ch0 ch0Var) {
        return new b(new m50(list, ch0Var));
    }

    public static btf<InputStream, Drawable> f(List<ImageHeaderParser> list, ch0 ch0Var) {
        return new c(new m50(list, ch0Var));
    }

    public usf<Drawable> b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull erd erdVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new h55(i, i2, erdVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.a.f(this.a, inputStream, this.b));
    }

    public boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.a.g(this.a, byteBuffer));
    }

    public final boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }
}
