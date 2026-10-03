package com.oplusos.vfxmodelviewer.filament.android;

import android.graphics.Bitmap;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.Texture;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class TextureHelper {
    private static final int BITMAP_CONFIG_ALPHA_8 = 0;
    private static final int BITMAP_CONFIG_HARDWARE = 5;
    private static final int BITMAP_CONFIG_RGBA_4444 = 2;
    private static final int BITMAP_CONFIG_RGBA_8888 = 3;
    private static final int BITMAP_CONFIG_RGBA_F16 = 4;
    private static final int BITMAP_CONFIG_RGB_565 = 1;

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.HARDWARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private TextureHelper() {
    }

    private static native void nSetBitmap(long j, long j2, int i, int i2, int i3, int i4, int i5, Bitmap bitmap, int i6);

    private static native void nSetBitmapWithCallback(long j, long j2, int i, int i2, int i3, int i4, int i5, Bitmap bitmap, int i6, Object obj, Runnable runnable);

    public static void setBitmap(@NonNull Engine engine, @NonNull Texture texture, @IntRange(from = 0) int i, @NonNull Bitmap bitmap) {
        setBitmap(engine, texture, i, 0, 0, texture.getWidth(i), texture.getHeight(i), bitmap);
    }

    private static int toNativeFormat(Bitmap.Config config) {
        int i = 1.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 3 : 5;
        }
        return 4;
    }

    public static void setBitmap(@NonNull Engine engine, @NonNull Texture texture, @IntRange(from = 0) int i, @NonNull Bitmap bitmap, Object obj, Runnable runnable) {
        setBitmap(engine, texture, i, 0, 0, texture.getWidth(i), texture.getHeight(i), bitmap, obj, runnable);
    }

    public static void setBitmap(@NonNull Engine engine, @NonNull Texture texture, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5, @NonNull Bitmap bitmap) {
        int nativeFormat = toNativeFormat(bitmap.getConfig());
        if (nativeFormat != 2 && nativeFormat != 5) {
            nSetBitmap(texture.getNativeObject(), engine.getNativeObject(), i, i2, i3, i4, i5, bitmap, nativeFormat);
            return;
        }
        throw new IllegalArgumentException("Unsupported config: ARGB_4444 or HARDWARE");
    }

    public static void setBitmap(@NonNull Engine engine, @NonNull Texture texture, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5, @NonNull Bitmap bitmap, Object obj, Runnable runnable) {
        int nativeFormat = toNativeFormat(bitmap.getConfig());
        if (nativeFormat != 2 && nativeFormat != 5) {
            nSetBitmapWithCallback(texture.getNativeObject(), engine.getNativeObject(), i, i2, i3, i4, i5, bitmap, nativeFormat, obj, runnable);
            return;
        }
        throw new IllegalArgumentException("Unsupported config: ARGB_4444 or HARDWARE");
    }
}
