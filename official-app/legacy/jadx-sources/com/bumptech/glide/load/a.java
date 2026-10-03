package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.oplus.aiunit.vision.ch0;
import com.oplus.aiunit.vision.ix3;
import com.oplus.aiunit.vision.md2;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    public class C0175a implements h {
        public final /* synthetic */ InputStream a;

        public C0175a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    public class b implements h {
        public final /* synthetic */ ByteBuffer a;

        public b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.a);
            } finally {
                md2.d(this.a);
            }
        }
    }

    public class c implements h {
        public final /* synthetic */ ParcelFileDescriptorRewinder a;
        public final /* synthetic */ ch0 b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ch0 ch0Var) {
            this.a = parcelFileDescriptorRewinder;
            this.b = ch0Var;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.a.c().getFileDescriptor()), this.b);
                try {
                    ImageHeaderParser.ImageType imageTypeA = imageHeaderParser.a(recyclableBufferedInputStream2);
                    recyclableBufferedInputStream2.release();
                    this.a.c();
                    return imageTypeA;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    this.a.c();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class d implements g {
        public final /* synthetic */ ByteBuffer a;
        public final /* synthetic */ ch0 b;

        public d(ByteBuffer byteBuffer, ch0 ch0Var) {
            this.a = byteBuffer;
            this.b = ch0Var;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.a, this.b);
            } finally {
                md2.d(this.a);
            }
        }
    }

    public class e implements g {
        public final /* synthetic */ InputStream a;
        public final /* synthetic */ ch0 b;

        public e(InputStream inputStream, ch0 ch0Var) {
            this.a = inputStream;
            this.b = ch0Var;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.a, this.b);
            } finally {
                this.a.reset();
            }
        }
    }

    public class f implements g {
        public final /* synthetic */ ParcelFileDescriptorRewinder a;
        public final /* synthetic */ ch0 b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ch0 ch0Var) {
            this.a = parcelFileDescriptorRewinder;
            this.b = ch0Var;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.a.c().getFileDescriptor()), this.b);
                try {
                    int iB = imageHeaderParser.b(recyclableBufferedInputStream2, this.b);
                    recyclableBufferedInputStream2.release();
                    this.a.c();
                    return iB;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    this.a.c();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public interface g {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    @RequiresApi(21)
    public static int a(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull ch0 ch0Var) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, ch0Var));
    }

    public static int b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull ch0 ch0Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, ch0Var);
        }
        inputStream.mark(ix3.DEFAULT_MQTT_MAX_SIZE);
        return d(list, new e(inputStream, ch0Var));
    }

    public static int c(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer, @NonNull ch0 ch0Var) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, ch0Var));
    }

    public static int d(@NonNull List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = gVar.a(list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    @NonNull
    @RequiresApi(21)
    public static ImageHeaderParser.ImageType e(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull ch0 ch0Var) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, ch0Var));
    }

    @NonNull
    public static ImageHeaderParser.ImageType f(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull ch0 ch0Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, ch0Var);
        }
        inputStream.mark(ix3.DEFAULT_MQTT_MAX_SIZE);
        return h(list, new C0175a(inputStream));
    }

    @NonNull
    public static ImageHeaderParser.ImageType g(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    @NonNull
    public static ImageHeaderParser.ImageType h(@NonNull List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a(list.get(i));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
