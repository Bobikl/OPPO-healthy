package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class f3a {
    public static final Object d = new Object();

    @Nullable
    public final Context a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, xab> f11197c;

    public f3a(Drawable.Callback callback, String str, d3a d3aVar, Map<String, xab> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str + mla.SEPARATOR;
        }
        this.f11197c = map;
        d(d3aVar);
        if (callback instanceof View) {
            this.a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.a = null;
        }
    }

    @Nullable
    public Bitmap a(String str) {
        xab xabVar = this.f11197c.get(str);
        if (xabVar == null) {
            return null;
        }
        Bitmap bitmapB = xabVar.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.a;
        if (context == null) {
            return null;
        }
        String strC = xabVar.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                return c(str, frk.m(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), xabVar.f(), xabVar.d()));
            } catch (IllegalArgumentException e2) {
                o7b.d("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.b + strC), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, frk.m(bitmapDecodeStream, xabVar.f(), xabVar.d()));
                }
                o7b.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e3) {
                o7b.d("Unable to decode image `" + str + "`.", e3);
                return null;
            }
        } catch (IOException e4) {
            o7b.d("Unable to open asset.", e4);
            return null;
        }
    }

    public boolean b(Context context) {
        if (this.a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.a;
    }

    public final Bitmap c(String str, @Nullable Bitmap bitmap) {
        synchronized (d) {
            this.f11197c.get(str).g(bitmap);
        }
        return bitmap;
    }

    public void d(@Nullable d3a d3aVar) {
    }

    @Nullable
    public Bitmap e(String str, @Nullable Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapB = this.f11197c.get(str).b();
            c(str, bitmap);
            return bitmapB;
        }
        xab xabVar = this.f11197c.get(str);
        Bitmap bitmapB2 = xabVar.b();
        xabVar.g(null);
        return bitmapB2;
    }
}
