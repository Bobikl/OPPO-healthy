package com.heytap.nearx.uikit.widget.tintimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import androidx.collection.LruCache;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class NearTintManager {
    private static final boolean DEBUG = false;
    private static final String TAG = "TintManager";
    private final WeakReference<Context> mContextRef;
    private ColorStateList mDefaultColorStateList;
    private SparseArray<ColorStateList> mTintLists;
    public static final boolean SHOULD_BE_USED = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final WeakHashMap<Context, NearTintManager> INSTANCE_CACHE = new WeakHashMap<>();
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);

    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        private static int generateCacheKey(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter get(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        public PorterDuffColorFilter put(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }
    }

    private NearTintManager(Context context) {
        this.mContextRef = new WeakReference<>(context);
    }

    private ColorStateList createNearDefaultColorStateList(Context context) {
        return new ColorStateList(new int[3][], new int[3]);
    }

    public static NearTintManager get(Context context) {
        WeakHashMap<Context, NearTintManager> weakHashMap = INSTANCE_CACHE;
        NearTintManager nearTintManager = weakHashMap.get(context);
        if (nearTintManager != null) {
            return nearTintManager;
        }
        NearTintManager nearTintManager2 = new NearTintManager(context);
        weakHashMap.put(context, nearTintManager2);
        return nearTintManager2;
    }

    public static Drawable getDrawable(Context context, int i) {
        return ContextCompat.getDrawable(context, i);
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (mode == null) {
            mode = DEFAULT_MODE;
        }
        ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
        PorterDuffColorFilter porterDuffColorFilter = colorFilterLruCache.get(i, mode);
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            colorFilterLruCache.put(i, mode, porterDuffColorFilter);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public static void tintViewBackground(View view, NearTintInfo nearTintInfo) {
        Drawable background = view.getBackground();
        if (nearTintInfo.mHasTintList) {
            setPorterDuffColorFilter(background, nearTintInfo.mTintList.getColorForState(view.getDrawableState(), nearTintInfo.mTintList.getDefaultColor()), nearTintInfo.mHasTintMode ? nearTintInfo.mTintMode : null);
        } else {
            background.clearColorFilter();
        }
    }

    public final ColorStateList getTintList(int i) {
        if (this.mContextRef.get() == null) {
            return null;
        }
        SparseArray<ColorStateList> sparseArray = this.mTintLists;
        ColorStateList colorStateList = sparseArray != null ? sparseArray.get(i) : null;
        if (colorStateList != null) {
            if (this.mTintLists == null) {
                this.mTintLists = new SparseArray<>();
            }
            this.mTintLists.append(i, colorStateList);
        }
        return colorStateList;
    }

    public final PorterDuff.Mode getTintMode(int i) {
        return null;
    }

    public final boolean tintDrawableUsingColorFilter(int i, Drawable drawable) {
        this.mContextRef.get();
        return false;
    }

    public Drawable getDrawable(int i) {
        return getDrawable(i, false);
    }

    public Drawable getDrawable(int i, boolean z) {
        Context context = this.mContextRef.get();
        if (context == null) {
            return null;
        }
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable != null) {
            drawable = drawable.mutate();
            ColorStateList tintList = getTintList(i);
            if (tintList != null) {
                Drawable drawableWrap = DrawableCompat.wrap(drawable);
                DrawableCompat.setTintList(drawableWrap, tintList);
                PorterDuff.Mode tintMode = getTintMode(i);
                if (tintMode == null) {
                    return drawableWrap;
                }
                DrawableCompat.setTintMode(drawableWrap, tintMode);
                return drawableWrap;
            }
            if (!tintDrawableUsingColorFilter(i, drawable) && z) {
                return null;
            }
        }
        return drawable;
    }
}
