package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import com.oplus.aiunit.vision.k20;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    @Nullable
    public static Typeface maybeCopyWithFontWeightAdjustment(@NonNull Context context, @NonNull Typeface typeface) {
        return maybeCopyWithFontWeightAdjustment(context.getResources().getConfiguration(), typeface);
    }

    @Nullable
    public static Typeface maybeCopyWithFontWeightAdjustment(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || k20.a(configuration) == Integer.MAX_VALUE || k20.a(configuration) == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, MathUtils.clamp(typeface.getWeight() + k20.a(configuration), 1, 1000), typeface.isItalic());
    }
}
