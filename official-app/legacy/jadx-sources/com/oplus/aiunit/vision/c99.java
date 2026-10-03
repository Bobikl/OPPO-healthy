package com.oplus.aiunit.vision;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u000e\u001a\n \u0004*\u0004\u0018\u00010\r0\rJ\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/c99;", "", "Landroid/media/Image;", b2n.g, "kotlin.jvm.PlatformType", "a", "", "b", "", "c", b2n.f, "d", MapSchema.FIELD_NAME_ENTRY, "Landroid/view/Surface;", "f", "Landroid/media/ImageReader$OnImageAvailableListener;", "listener", "Landroid/os/Handler;", "handler", "i", "", "Ljava/lang/String;", "TAG", "Landroid/media/ImageReader;", "Landroid/media/ImageReader;", "getImageReader", "()Landroid/media/ImageReader;", "imageReader", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "format", "maxImages", "<init>", "(IIII)V", "lib_zxing_release"}, k = 1, mv = {1, 8, 0})
public final class c99 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "ImageReaderWarrper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ImageReader imageReader;

    public c99(int i, int i2, int i3, int i4) {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i, i2, i3, i4);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "newInstance(width, height, format, maxImages)");
        this.imageReader = imageReaderNewInstance;
    }

    public final Image a() {
        return this.imageReader.acquireNextImage();
    }

    public final void b() {
        this.imageReader.close();
    }

    public final int c() {
        return this.imageReader.getHeight();
    }

    public final int d() {
        return this.imageReader.getImageFormat();
    }

    public final int e() {
        return this.imageReader.getMaxImages();
    }

    public final Surface f() {
        return this.imageReader.getSurface();
    }

    public final int g() {
        return this.imageReader.getWidth();
    }

    @Nullable
    public final Image h() {
        Image image;
        Image imageAcquireNextImage = this.imageReader.acquireNextImage();
        if (imageAcquireNextImage == null) {
            return null;
        }
        while (true) {
            try {
                try {
                    Object objInvoke = this.imageReader.getClass().getDeclaredMethod("acquireNextImageNoThrowISE", new Class[0]).invoke(this.imageReader, new Object[0]);
                    image = objInvoke instanceof Image ? (Image) objInvoke : null;
                } catch (Exception e2) {
                    gw2.b(this.TAG, "heytapGetLatestImage error :" + e2.getMessage());
                }
                if (image == null) {
                    return imageAcquireNextImage;
                }
                imageAcquireNextImage.close();
                imageAcquireNextImage = image;
            } catch (Throwable th) {
                imageAcquireNextImage.close();
                throw th;
            }
        }
    }

    public final void i(@Nullable ImageReader.OnImageAvailableListener listener, @Nullable Handler handler) {
        this.imageReader.setOnImageAvailableListener(listener, handler);
    }
}
