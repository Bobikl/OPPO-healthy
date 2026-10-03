package com.heytap.store.platform.tools;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0003H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u000eH&J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0003H&J\u0012\u0010\u0012\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u0003H&J+\u0010\u0012\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001H&¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u0003H&¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/platform/tools/ResourcesDelegate;", "", "getColor", "", "colorResId", "getDimension", "", "dimenResId", "getDimensionPixelOffset", "getDimensionPixelSize", "getDrawable", "Landroid/graphics/drawable/Drawable;", "drawableResId", "getResources", "Landroid/content/res/Resources;", "getResourcesPath", "", "resourcesId", "getString", "stringRes", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "arrayResId", "(I)[Ljava/lang/String;", "utils_release"}, k = 1, mv = {1, 4, 0})
public interface ResourcesDelegate {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        public static int getDimensionPixelSize(@NotNull ResourcesDelegate resourcesDelegate, @DimenRes int i) {
            return resourcesDelegate.getResources().getDimensionPixelSize(i);
        }
    }

    int getColor(@ColorRes int colorResId);

    float getDimension(@DimenRes int dimenResId);

    int getDimensionPixelOffset(@DimenRes int dimenResId);

    int getDimensionPixelSize(@DimenRes int dimenResId);

    @Nullable
    Drawable getDrawable(@DrawableRes int drawableResId);

    @NotNull
    Resources getResources();

    @Nullable
    String getResourcesPath(@IdRes int resourcesId);

    @NotNull
    String getString(@StringRes int stringRes);

    @NotNull
    String getString(@StringRes int stringRes, @NotNull Object... formatArgs);

    @NotNull
    String[] getStringArray(@ArrayRes int arrayResId);
}
