package com.oplus.aiunit.vision;

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

/* JADX INFO: loaded from: classes19.dex */
public class e3a {
    public static final Object d = new Object();
    public final Context a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, gi6> f10777c;

    public e3a(Drawable.Callback callback, String str, c3a c3aVar, Map<String, gi6> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str + mla.SEPARATOR;
        }
        this.f10777c = map;
        d(c3aVar);
        if (callback instanceof View) {
            this.a = ((View) callback).getContext().getApplicationContext();
        } else {
            u7b.c("EffectiveAnimationDrawable must be inside of a view for images to work.");
            this.a = null;
        }
    }

    @Nullable
    public Bitmap a(String str) {
        gi6 gi6Var = this.f10777c.get(str);
        if (gi6Var == null) {
            return null;
        }
        Bitmap bitmapA = gi6Var.a();
        if (bitmapA != null) {
            return bitmapA;
        }
        Context context = this.a;
        if (context == null) {
            return null;
        }
        String strB = gi6Var.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strB.startsWith("data:") && strB.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strB.substring(strB.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e2) {
                u7b.d("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.b)) {
                u7b.c("Set non folder.");
                return null;
            }
            u7b.c("bitmapForId filename = " + strB + ";imagesFolder = " + this.b);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.b + strB), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, prk.m(bitmapDecodeStream, gi6Var.e(), gi6Var.c()));
                }
                u7b.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e3) {
                u7b.d("Unable to decode image `" + str + "`.", e3);
                return null;
            }
        } catch (IOException e4) {
            u7b.d("Unable to open asset.", e4);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.a == null) || this.a.equals(context);
    }

    public final Bitmap c(String str, @Nullable Bitmap bitmap) {
        synchronized (d) {
            u7b.c("putBitmap key = " + str);
            this.f10777c.get(str).f(bitmap);
        }
        return bitmap;
    }

    public void d(@Nullable c3a c3aVar) {
    }
}
