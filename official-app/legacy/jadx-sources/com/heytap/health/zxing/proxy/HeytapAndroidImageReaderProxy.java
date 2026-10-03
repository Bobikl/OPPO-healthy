package com.heytap.health.zxing.proxy;

import android.annotation.SuppressLint;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.HeytapAndroidImageProxyUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import com.oplus.aiunit.vision.c99;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes19.dex */
public class HeytapAndroidImageReaderProxy implements ImageReaderProxy {
    public final c99 a;

    public HeytapAndroidImageReaderProxy(int i, int i2, int i3, int i4) {
        this.a = new c99(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Executor executor, final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReader imageReader) {
        executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.a99
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$setOnImageAvailableListener$0(onImageAvailableListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$0(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    @SuppressLint({"RestrictedApi"})
    public ImageProxy acquireLatestImage() {
        Image imageH;
        try {
            imageH = this.a.h();
        } catch (RuntimeException e2) {
            if (!c(e2)) {
                throw e2;
            }
            imageH = null;
        }
        if (imageH == null) {
            return null;
        }
        return HeytapAndroidImageProxyUtil.getImageProxy(imageH);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    @SuppressLint({"RestrictedApi"})
    public ImageProxy acquireNextImage() {
        Image imageA;
        try {
            imageA = this.a.a();
        } catch (RuntimeException e2) {
            if (!c(e2)) {
                throw e2;
            }
            imageA = null;
        }
        if (imageA == null) {
            return null;
        }
        return HeytapAndroidImageProxyUtil.getImageProxy(imageA);
    }

    public final boolean c(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @SuppressLint({"RestrictedApi"})
    public void clearOnImageAvailableListener() {
        this.a.i(null, null);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @SuppressLint({"RestrictedApi"})
    public void close() {
        this.a.b();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @SuppressLint({"RestrictedApi"})
    public synchronized int getHeight() {
        return this.a.c();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @SuppressLint({"RestrictedApi"})
    public synchronized int getImageFormat() {
        return this.a.d();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @SuppressLint({"RestrictedApi"})
    public synchronized int getMaxImages() {
        return this.a.e();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    @SuppressLint({"RestrictedApi"})
    public synchronized Surface getSurface() {
        return this.a.f();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @SuppressLint({"RestrictedApi"})
    public synchronized int getWidth() {
        return this.a.g();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @SuppressLint({"RestrictedApi"})
    public void setOnImageAvailableListener(@NonNull final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @NonNull final Executor executor) {
        this.a.i(new ImageReader.OnImageAvailableListener() { // from class: com.oplus.aiunit.vision.z89
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                this.a.d(executor, onImageAvailableListener, imageReader);
            }
        }, MainThreadAsyncHandler.getInstance());
    }
}
