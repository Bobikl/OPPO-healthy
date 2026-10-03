package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\"\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/xhc;", "", "Landroid/content/Context;", "context", "", "drawableId", "Landroid/graphics/drawable/Drawable;", "a", "Landroid/content/res/TypedArray;", "styleableId", "b", ResourcesUtil.ResourceType.DRAWABLE, ParserTag.TAG_COLORS, "d", "Landroid/graphics/Bitmap;", "bitmap", "color", "c", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class xhc {

    @NotNull
    public static final xhc INSTANCE = new xhc();

    @JvmStatic
    @Nullable
    public static final Drawable a(@NotNull Context context, int drawableId) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AppCompatResources.getDrawable(context, drawableId);
    }

    @JvmStatic
    @Nullable
    public static final Drawable b(@NotNull Context context, @NotNull TypedArray a, int styleableId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a, "a");
        try {
            int resourceId = a.getResourceId(styleableId, -1);
            if (resourceId != -1) {
                return AppCompatResources.getDrawable(context, resourceId);
            }
            return null;
        } catch (Exception unused) {
            fjc.b("ColorDrawableCompatUtil", Intrinsics.stringPlus(" Could not find resource ", Integer.valueOf(styleableId)));
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final Bitmap c(@NotNull Bitmap bitmap, int color) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        Bitmap bitmapResult = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        new Canvas(bitmapResult).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Intrinsics.checkNotNullExpressionValue(bitmapResult, "bitmapResult");
        return bitmapResult;
    }

    @JvmStatic
    @Nullable
    public static final Drawable d(@Nullable Drawable drawable, int colors) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof AnimatedStateListDrawableCompat) {
            return drawable;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawableWrap.mutate(), colors);
        return drawableWrap;
    }
}
