package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.ch0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface ImageHeaderParser {
    public static final int UNKNOWN_ORIENTATION = -1;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i = a.a[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageType.values().length];
            a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    ImageType a(@NonNull InputStream inputStream) throws IOException;

    int b(@NonNull InputStream inputStream, @NonNull ch0 ch0Var) throws IOException;

    int c(@NonNull ByteBuffer byteBuffer, @NonNull ch0 ch0Var) throws IOException;

    @NonNull
    ImageType d(@NonNull ByteBuffer byteBuffer) throws IOException;
}
