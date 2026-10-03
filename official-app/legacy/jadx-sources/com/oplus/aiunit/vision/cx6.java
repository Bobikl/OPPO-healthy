package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import coil.decode.ExifOrientationPolicy;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/cx6;", "", "", "mimeType", "Lokio/BufferedSource;", "source", "Lcoil/decode/ExifOrientationPolicy;", "policy", "Lcom/oplus/aiunit/vision/yw6;", "a", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "b", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "PAINT", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExifUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,132:1\n95#2:133\n95#2:134\n43#2,3:135\n*S KotlinDebug\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n*L\n65#1:133\n67#1:134\n70#1:135,3\n*E\n"})
public final class cx6 {

    @NotNull
    public static final cx6 INSTANCE = new cx6();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Paint PAINT = new Paint(3);

    @NotNull
    public final yw6 a(@Nullable String mimeType, @NotNull BufferedSource source, @NotNull ExifOrientationPolicy policy) {
        if (!dx6.c(policy, mimeType)) {
            return yw6.NONE;
        }
        ExifInterface exifInterface = new ExifInterface(new ax6(source.peek().inputStream()));
        return new yw6(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    @NotNull
    public final Bitmap b(@NotNull Bitmap inBitmap, @NotNull yw6 exifData) {
        if (!exifData.getIsFlipped() && !dx6.a(exifData)) {
            return inBitmap;
        }
        Matrix matrix = new Matrix();
        float width = inBitmap.getWidth() / 2.0f;
        float height = inBitmap.getHeight() / 2.0f;
        if (exifData.getIsFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (dx6.a(exifData)) {
            matrix.postRotate(exifData.getRotationDegrees(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, inBitmap.getWidth(), inBitmap.getHeight());
        matrix.mapRect(rectF);
        float f = rectF.left;
        if (f == 0.0f) {
            if (!(rectF.top == 0.0f)) {
                matrix.postTranslate(-f, -rectF.top);
            }
        } else {
            matrix.postTranslate(-f, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = dx6.b(exifData) ? Bitmap.createBitmap(inBitmap.getHeight(), inBitmap.getWidth(), a.c(inBitmap)) : Bitmap.createBitmap(inBitmap.getWidth(), inBitmap.getHeight(), a.c(inBitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(inBitmap, matrix, PAINT);
        inBitmap.recycle();
        return bitmapCreateBitmap;
    }
}
