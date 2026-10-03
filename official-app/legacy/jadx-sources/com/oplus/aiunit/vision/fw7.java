package com.oplus.aiunit.vision;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class fw7 {
    public final AssetManager d;
    public final bdc<String> a = new bdc<>();
    public final Map<bdc<String>, Typeface> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Typeface> f11527c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11528e = wrf.SUFFIX_NAME_FONT;

    public fw7(Drawable.Callback callback, @Nullable dw7 dw7Var) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            u7b.c("EffectiveAnimationDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }

    public final Typeface a(aw7 aw7Var) {
        String strA = aw7Var.a();
        Typeface typeface = this.f11527c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        aw7Var.c();
        aw7Var.b();
        if (aw7Var.d() != null) {
            return aw7Var.d();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.d, "fonts/" + strA + this.f11528e);
        this.f11527c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public Typeface b(aw7 aw7Var) {
        this.a.b(aw7Var.a(), aw7Var.c());
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(aw7Var), aw7Var.c());
        this.b.put(this.a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f11528e = str;
    }

    public void d(@Nullable dw7 dw7Var) {
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
