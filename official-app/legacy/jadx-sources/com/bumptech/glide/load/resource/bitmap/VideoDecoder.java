package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.oplus.aiunit.vision.brd;
import com.oplus.aiunit.vision.btf;
import com.oplus.aiunit.vision.erd;
import com.oplus.aiunit.vision.kf1;
import com.oplus.aiunit.vision.mf1;
import com.oplus.aiunit.vision.usf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class VideoDecoder<T> implements btf<T, Bitmap> {
    public static final long DEFAULT_FRAME = -1;
    public final e<T> a;
    public final kf1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f1405c;
    public static final brd<Long> TARGET_FRAME = brd.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final brd<Integer> FRAME_OPTION = brd.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    public static final f d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<String> f1404e = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public class a implements brd.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        @Override // com.oplus.aiunit.vision.brd.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Long l2, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    }

    public class b implements brd.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        @Override // com.oplus.aiunit.vision.brd.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
        }
    }

    @RequiresApi(16)
    public static final class c implements e<AssetFileDescriptor> {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @RequiresApi(23)
    public static final class d implements e<ByteBuffer> {

        public class a extends MediaDataSource {
            public final /* synthetic */ ByteBuffer i;

            public a(ByteBuffer byteBuffer) {
                this.i = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.i.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j2, byte[] bArr, int i, int i2) {
                if (j2 >= this.i.limit()) {
                    return -1;
                }
                this.i.position((int) j2);
                int iMin = Math.min(i2, this.i.remaining());
                this.i.get(bArr, i, iMin);
                return iMin;
            }
        }

        public final MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    @VisibleForTesting
    public interface e<T> {
        @RequiresApi(16)
        void a(MediaExtractor mediaExtractor, T t) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    @VisibleForTesting
    public static class f {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    public static final class g implements e<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        @RequiresApi(16)
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(kf1 kf1Var, e<T> eVar) {
        this(kf1Var, eVar, d);
    }

    @RequiresApi(16)
    public static btf<AssetFileDescriptor, Bitmap> c(kf1 kf1Var) {
        return new VideoDecoder(kf1Var, new c(null));
    }

    @RequiresApi(api = 23)
    public static btf<ByteBuffer, Bitmap> d(kf1 kf1Var) {
        return new VideoDecoder(kf1Var, new d());
    }

    @TargetApi(30)
    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        boolean z = false;
        try {
            if (i(mediaMetadataRetriever) && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                z = true;
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        if (!z) {
            return bitmap;
        }
        if (Log.isLoggable("VideoDecoder", 3)) {
            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j2, i);
    }

    @Nullable
    @TargetApi(27)
    public static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i6 == 90 || i6 == 270) {
                i5 = i4;
                i4 = i5;
            }
            float fB = downsampleStrategy.b(i4, i5, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j2, i, Math.round(i4 * fB), Math.round(fB * i5));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    @RequiresApi(30)
    public static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i = Integer.parseInt(strExtractMetadata);
        return (i == 7 || i == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    @VisibleForTesting
    public static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i = Build.VERSION.SDK_INT;
        return i >= 30 && i < 33;
    }

    public static boolean k() {
        Iterator<String> it = f1404e.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static btf<ParcelFileDescriptor, Bitmap> m(kf1 kf1Var) {
        return new VideoDecoder(kf1Var, new g());
    }

    @Override // com.oplus.aiunit.vision.btf
    public usf<Bitmap> a(@NonNull T t, int i, int i2, @NonNull erd erdVar) throws IOException {
        long jLongValue = ((Long) erdVar.a(TARGET_FRAME)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) erdVar.a(FRAME_OPTION);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) erdVar.a(DownsampleStrategy.OPTION);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.DEFAULT;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f1405c.a();
        try {
            this.a.b(mediaMetadataRetrieverA, t);
            return mf1.c(f(t, mediaMetadataRetrieverA, jLongValue, num.intValue(), i, i2, downsampleStrategy2), this.b);
        } finally {
            mediaMetadataRetrieverA.close();
        }
    }

    @Override // com.oplus.aiunit.vision.btf
    public boolean b(@NonNull T t, @NonNull erd erdVar) {
        return true;
    }

    @Nullable
    public final Bitmap f(@NonNull T t, MediaMetadataRetriever mediaMetadataRetriever, long j2, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        if (l(t, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapH = (i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.NONE) ? null : h(mediaMetadataRetriever, j2, i, i2, i3, downsampleStrategy);
        if (bitmapH == null) {
            bitmapH = g(mediaMetadataRetriever, j2, i);
        }
        Bitmap bitmapE = e(mediaMetadataRetriever, bitmapH);
        if (bitmapE != null) {
            return bitmapE;
        }
        throw new VideoDecoderException();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #2 {all -> 0x006a, blocks: (B:27:0x0059, B:29:0x005f), top: B:41:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0066 A[DONT_GENERATE] */
    public final boolean l(@NonNull T t, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (!(str != null && str.matches(".+_cheets|cheets_.+"))) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
            try {
                if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    this.a.a(mediaExtractor2, t);
                    int trackCount = mediaExtractor2.getTrackCount();
                    for (int i = 0; i < trackCount; i++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i).getString("mime"))) {
                            mediaExtractor2.release();
                            return true;
                        }
                    }
                    mediaExtractor2.release();
                } catch (Throwable th) {
                    th = th;
                    mediaExtractor = mediaExtractor2;
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                    }
                }
                return false;
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @VisibleForTesting
    public VideoDecoder(kf1 kf1Var, e<T> eVar, f fVar) {
        this.b = kf1Var;
        this.a = eVar;
        this.f1405c = fVar;
    }
}
