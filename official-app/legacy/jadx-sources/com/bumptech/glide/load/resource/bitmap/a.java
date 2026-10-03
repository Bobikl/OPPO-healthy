package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.oplus.aiunit.vision.brd;
import com.oplus.aiunit.vision.ch0;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.erd;
import com.oplus.aiunit.vision.jh8;
import com.oplus.aiunit.vision.kf1;
import com.oplus.aiunit.vision.mf1;
import com.oplus.aiunit.vision.p6b;
import com.oplus.aiunit.vision.uqk;
import com.oplus.aiunit.vision.usf;
import com.oplus.aiunit.vision.z9k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static final brd<Boolean> ALLOW_HARDWARE_CONFIG;
    public static final brd<Boolean> FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS;
    public static final Set<String> f;
    public static final b g;
    public static final Set<ImageHeaderParser.ImageType> h;
    public static final Queue<BitmapFactory.Options> i;
    public final kf1 a;
    public final DisplayMetrics b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ch0 f1407c;
    public final List<ImageHeaderParser> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jh8 f1408e = jh8.b();
    public static final brd<DecodeFormat> DECODE_FORMAT = brd.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
    public static final brd<PreferredColorSpace> PREFERRED_COLOR_SPACE = brd.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    @Deprecated
    public static final brd<DownsampleStrategy> DOWNSAMPLE_STRATEGY = DownsampleStrategy.OPTION;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$a, reason: collision with other inner class name */
    public class C0181a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a(kf1 kf1Var, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b() {
        }
    }

    public interface b {
        void a(kf1 kf1Var, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = brd.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        ALLOW_HARDWARE_CONFIG = brd.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        g = new C0181a();
        h = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        i = uqk.g(0);
    }

    public a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, kf1 kf1Var, ch0 ch0Var) {
        this.d = list;
        this.b = (DisplayMetrics) cpe.d(displayMetrics);
        this.a = (kf1) cpe.d(kf1Var);
        this.f1407c = (ch0) cpe.d(ch0Var);
    }

    public static int a(double d) {
        int iL = l(d);
        int iX = x(((double) iL) * d);
        return x((d / ((double) (iX / iL))) * ((double) iX));
    }

    public static void c(ImageHeaderParser.ImageType imageType, com.bumptech.glide.load.resource.bitmap.b bVar, b bVar2, kf1 kf1Var, DownsampleStrategy downsampleStrategy, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int iFloor;
        int iFloor2;
        if (i3 <= 0 || i4 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i5 + "x" + i6 + "]");
                return;
            }
            return;
        }
        if (r(i2)) {
            i8 = i3;
            i7 = i4;
        } else {
            i7 = i3;
            i8 = i4;
        }
        float fB = downsampleStrategy.b(i7, i8, i5, i6);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + downsampleStrategy + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingA = downsampleStrategy.a(i7, i8, i5, i6);
        if (sampleSizeRoundingA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f2 = i7;
        float f3 = i8;
        int iX = i7 / x(fB * f2);
        int iX2 = i8 / x(fB * f3);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingA == sampleSizeRounding ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (sampleSizeRoundingA == sampleSizeRounding && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f2 / fMin);
            iFloor2 = (int) Math.ceil(f3 / fMin);
            int i9 = iMax / 8;
            if (i9 > 0) {
                iFloor /= i9;
                iFloor2 /= i9;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f4 = iMax;
            iFloor = (int) Math.floor(f2 / f4);
            iFloor2 = (int) Math.floor(f3 / f4);
        } else if (imageType.isWebp()) {
            float f5 = iMax;
            iFloor = Math.round(f2 / f5);
            iFloor2 = Math.round(f3 / f5);
        } else if (i7 % iMax == 0 && i8 % iMax == 0) {
            iFloor = i7 / iMax;
            iFloor2 = i8 / iMax;
        } else {
            int[] iArrM = m(bVar, options, bVar2, kf1Var);
            iFloor = iArrM[0];
            iFloor2 = iArrM[1];
        }
        double dB = downsampleStrategy.b(iFloor, iFloor2, i5, i6);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i3 + "x" + i4 + "], degreesToRotate: " + i2 + ", target: [" + i5 + "x" + i6 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fB + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap i(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, b bVar2, kf1 kf1Var) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar2.b();
            bVar.a();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        z9k.i().lock();
        try {
            try {
                Bitmap bitmapC = bVar.c(options);
                z9k.i().unlock();
                return bitmapC;
            } catch (IllegalArgumentException e2) {
                IOException iOExceptionU = u(e2, i2, i3, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionU);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionU;
                }
                try {
                    kf1Var.b(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapI = i(bVar, options, bVar2, kf1Var);
                    z9k.i().unlock();
                    return bitmapI;
                } catch (IOException unused) {
                    throw iOExceptionU;
                }
            }
        } catch (Throwable th) {
            z9k.i().unlock();
            throw th;
        }
    }

    @Nullable
    @TargetApi(19)
    public static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = i;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            w(optionsPoll);
        }
        return optionsPoll;
    }

    public static int l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    public static int[] m(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, b bVar2, kf1 kf1Var) throws IOException {
        options.inJustDecodeBounds = true;
        i(bVar, options, bVar2, kf1Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    public static boolean r(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static boolean s(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    public static void t(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + n(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + p6b.a(j2));
    }

    public static IOException u(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    public static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    public static void y(BitmapFactory.Options options, kf1 kf1Var, int i2, int i3) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = kf1Var.d(i2, i3, config);
    }

    public final void b(com.bumptech.glide.load.resource.bitmap.b bVar, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        boolean zHasAlpha;
        if (this.f1408e.g(i2, i3, options, z, z2)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = bVar.d().hasAlpha();
        } catch (IOException e2) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e2);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    @RequiresApi(21)
    public usf<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, erd erdVar) throws IOException {
        return e(new com.bumptech.glide.load.resource.bitmap.b.c(parcelFileDescriptor, this.d, this.f1407c), i2, i3, erdVar, g);
    }

    public final usf<Bitmap> e(com.bumptech.glide.load.resource.bitmap.b bVar, int i2, int i3, erd erdVar, b bVar2) throws IOException {
        byte[] bArr = (byte[]) this.f1407c.b(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) erdVar.a(DECODE_FORMAT);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) erdVar.a(PREFERRED_COLOR_SPACE);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) erdVar.a(DownsampleStrategy.OPTION);
        boolean zBooleanValue = ((Boolean) erdVar.a(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
        brd<Boolean> brdVar = ALLOW_HARDWARE_CONFIG;
        try {
            return mf1.c(h(bVar, optionsK, downsampleStrategy, decodeFormat, preferredColorSpace, erdVar.a(brdVar) != null && ((Boolean) erdVar.a(brdVar)).booleanValue(), i2, i3, zBooleanValue, bVar2), this.a);
        } finally {
            v(optionsK);
            this.f1407c.put(bArr);
        }
    }

    public usf<Bitmap> f(InputStream inputStream, int i2, int i3, erd erdVar, b bVar) throws IOException {
        return e(new com.bumptech.glide.load.resource.bitmap.b.C0182b(inputStream, this.d, this.f1407c), i2, i3, erdVar, bVar);
    }

    public usf<Bitmap> g(ByteBuffer byteBuffer, int i2, int i3, erd erdVar) throws IOException {
        return e(new com.bumptech.glide.load.resource.bitmap.b.a(byteBuffer, this.d, this.f1407c), i2, i3, erdVar, g);
    }

    public final Bitmap h(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i2, int i3, boolean z2, b bVar2) throws IOException {
        int i4;
        int i5;
        int i6;
        ColorSpace colorSpace;
        int iRound;
        int iRound2;
        long jB = p6b.b();
        int[] iArrM = m(bVar, options, bVar2, this.a);
        boolean z3 = false;
        int i7 = iArrM[0];
        int i8 = iArrM[1];
        String str = options.outMimeType;
        boolean z4 = (i7 == -1 || i8 == -1) ? false : z;
        int iB = bVar.b();
        int iJ = z9k.j(iB);
        boolean zM = z9k.m(iB);
        if (i2 == Integer.MIN_VALUE) {
            i4 = i3;
            i5 = r(iJ) ? i8 : i7;
        } else {
            i4 = i3;
            i5 = i2;
        }
        if (i4 == Integer.MIN_VALUE) {
            i6 = r(iJ) ? i7 : i8;
        } else {
            i6 = i4;
        }
        ImageHeaderParser.ImageType imageTypeD = bVar.d();
        c(imageTypeD, bVar, bVar2, this.a, downsampleStrategy, iJ, i7, i8, i5, i6, options);
        b(bVar, decodeFormat, z4, zM, options, i5, i6);
        int i9 = options.inSampleSize;
        if (z(imageTypeD)) {
            if (i7 < 0 || i8 < 0 || !z2) {
                float f2 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i10 = options.inSampleSize;
                float f3 = i10;
                int iCeil = (int) Math.ceil(i7 / f3);
                int iCeil2 = (int) Math.ceil(i8 / f3);
                iRound = Math.round(iCeil * f2);
                iRound2 = Math.round(iCeil2 * f2);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i7 + "x" + i8 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f2);
                }
            } else {
                iRound = i5;
                iRound2 = i6;
            }
            if (iRound > 0 && iRound2 > 0) {
                y(options, this.a, iRound, iRound2);
            }
        }
        if (preferredColorSpace != null) {
            if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                z3 = true;
            }
            options.inPreferredColorSpace = ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        }
        Bitmap bitmapI = i(bVar, options, bVar2, this.a);
        bVar2.a(this.a, bitmapI);
        if (Log.isLoggable("Downsampler", 2)) {
            t(i7, i8, str, options, bitmapI, i2, i3, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.b.densityDpi);
        Bitmap bitmapN = z9k.n(this.a, bitmapI, iB);
        if (bitmapI.equals(bitmapN)) {
            return bitmapN;
        }
        this.a.b(bitmapI);
        return bitmapN;
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.a();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    public final boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
