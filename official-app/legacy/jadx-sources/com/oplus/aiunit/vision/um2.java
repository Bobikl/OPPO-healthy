package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.collection.LruCache;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class um2 {
    public static final boolean SHOULD_BE_USED = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PorterDuff.Mode f17517c = PorterDuff.Mode.SRC_IN;
    public static final WeakHashMap<Context, um2> d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f17518e = new a(6);
    public final WeakReference<Context> a;
    public SparseArray<ColorStateList> b;

    public static class a extends LruCache<Integer, PorterDuffColorFilter> {
        public a(int i) {
            super(i);
        }
    }

    public um2(Context context) {
        this.a = new WeakReference<>(context);
    }

    public static um2 a(Context context) {
        WeakHashMap<Context, um2> weakHashMap = d;
        um2 um2Var = weakHashMap.get(context);
        if (um2Var != null) {
            return um2Var;
        }
        um2 um2Var2 = new um2(context);
        weakHashMap.put(context, um2Var2);
        return um2Var2;
    }

    public Drawable b(int i) {
        return c(i, false);
    }

    public Drawable c(int i, boolean z) {
        Context context = this.a.get();
        if (context == null) {
            return null;
        }
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable != null) {
            drawable = drawable.mutate();
            ColorStateList colorStateListD = d(i);
            if (colorStateListD != null) {
                Drawable drawableWrap = DrawableCompat.wrap(drawable);
                DrawableCompat.setTintList(drawableWrap, colorStateListD);
                PorterDuff.Mode modeE = e(i);
                if (modeE == null) {
                    return drawableWrap;
                }
                DrawableCompat.setTintMode(drawableWrap, modeE);
                return drawableWrap;
            }
            if (!f(i, drawable) && z) {
                return null;
            }
        }
        return drawable;
    }

    public final ColorStateList d(int i) {
        if (this.a.get() == null) {
            return null;
        }
        SparseArray<ColorStateList> sparseArray = this.b;
        ColorStateList colorStateList = sparseArray != null ? sparseArray.get(i) : null;
        if (colorStateList != null) {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            this.b.append(i, colorStateList);
        }
        return colorStateList;
    }

    public final PorterDuff.Mode e(int i) {
        return null;
    }

    public final boolean f(int i, Drawable drawable) {
        this.a.get();
        return false;
    }
}
