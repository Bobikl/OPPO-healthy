package com.oplus.aiunit.vision;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 28)
public final class h55 implements ImageDecoder.OnHeaderDecodedListener {
    public final jh8 a = jh8.b();
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12000c;
    public final DecodeFormat d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DownsampleStrategy f12001e;
    public final boolean f;
    public final PreferredColorSpace g;

    public class a implements ImageDecoder.OnPartialImageListener {
        public a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public h55(int i, int i2, @NonNull erd erdVar) {
        this.b = i;
        this.f12000c = i2;
        this.d = (DecodeFormat) erdVar.a(com.bumptech.glide.load.resource.bitmap.a.DECODE_FORMAT);
        this.f12001e = (DownsampleStrategy) erdVar.a(DownsampleStrategy.OPTION);
        brd<Boolean> brdVar = com.bumptech.glide.load.resource.bitmap.a.ALLOW_HARDWARE_CONFIG;
        this.f = erdVar.a(brdVar) != null && ((Boolean) erdVar.a(brdVar)).booleanValue();
        this.g = (PreferredColorSpace) erdVar.a(com.bumptech.glide.load.resource.bitmap.a.PREFERRED_COLOR_SPACE);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        boolean z = false;
        if (this.a.f(this.b, this.f12000c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f12000c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f12001e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.g;
        if (preferredColorSpace != null) {
            if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
