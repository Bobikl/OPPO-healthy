package com.oplus.aiunit.vision;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class gw7 {
    public final AssetManager d;
    public final cdc<String> a = new cdc<>();
    public final Map<cdc<String>, Typeface> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Typeface> f11917c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11918e = wrf.SUFFIX_NAME_FONT;

    public gw7(Drawable.Callback callback, @Nullable ew7 ew7Var) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            o7b.c("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }

    public final Typeface a(cw7 cw7Var) {
        String strA = cw7Var.a();
        Typeface typeface = this.f11917c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        cw7Var.c();
        cw7Var.b();
        if (cw7Var.d() != null) {
            return cw7Var.d();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.d, "fonts/" + strA + this.f11918e);
        this.f11917c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public Typeface b(cw7 cw7Var) {
        this.a.b(cw7Var.a(), cw7Var.c());
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cw7Var), cw7Var.c());
        this.b.put(this.a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f11918e = str;
    }

    public void d(@Nullable ew7 ew7Var) {
    }

    public final Typeface e(Typeface typeface, String str) {
        int i;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i = 3;
        } else if (zContains) {
            i = 2;
        } else {
            i = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
