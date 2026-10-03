package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.oplus.aiunit.vision.ch0;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.md2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface b {

    public static final class a implements b {
        public final ByteBuffer a;
        public final List<ImageHeaderParser> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ch0 f1409c;

        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, ch0 ch0Var) {
            this.a = byteBuffer;
            this.b = list;
            this.f1409c = ch0Var;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int b() throws IOException {
            return com.bumptech.glide.load.a.c(this.b, md2.d(this.a), this.f1409c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.g(this.b, md2.d(this.a));
        }

        public final InputStream e() {
            return md2.g(md2.d(this.a));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$b, reason: collision with other inner class name */
    public static final class C0182b implements b {
        public final com.bumptech.glide.load.data.c a;
        public final ch0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<ImageHeaderParser> f1410c;

        public C0182b(InputStream inputStream, List<ImageHeaderParser> list, ch0 ch0Var) {
            this.b = (ch0) cpe.d(ch0Var);
            this.f1410c = (List) cpe.d(list);
            this.a = new com.bumptech.glide.load.data.c(inputStream, ch0Var);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void a() {
            this.a.a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int b() throws IOException {
            return com.bumptech.glide.load.a.b(this.f1410c, this.a.c(), this.b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.a.c(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.f(this.f1410c, this.a.c(), this.b);
        }
    }

    @RequiresApi(21)
    public static final class c implements b {
        public final ch0 a;
        public final List<ImageHeaderParser> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f1411c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, ch0 ch0Var) {
            this.a = (ch0) cpe.d(ch0Var);
            this.b = (List) cpe.d(list);
            this.f1411c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int b() throws IOException {
            return com.bumptech.glide.load.a.a(this.b, this.f1411c, this.a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f1411c.c().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.e(this.b, this.f1411c, this.a);
        }
    }

    void a();

    int b() throws IOException;

    @Nullable
    Bitmap c(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
