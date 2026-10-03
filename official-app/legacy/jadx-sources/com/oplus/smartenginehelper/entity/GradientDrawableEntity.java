package com.oplus.smartenginehelper.entity;

import android.graphics.drawable.GradientDrawable;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00020\t\"\u00020\nJ\u0012\u0010\u000b\u001a\u00020\u00042\n\u0010\f\u001a\u00020\r\"\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007J\u0012\u0010\u0013\u001a\u00020\u00042\n\u0010\u0014\u001a\u00020\r\"\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0007¨\u0006\u001a"}, d2 = {"Lcom/oplus/smartenginehelper/entity/GradientDrawableEntity;", "Lcom/oplus/smartenginehelper/entity/DrawableEntity;", "()V", "setColors", "", ParserTag.TAG_COLORS, "", "", "([Ljava/lang/String;)V", "", "", "setCornerRadii", "cornerRadiusArray", "", "", "setCornerRadius", ParserTag.TAG_CORNER_RADIUS, "setGradientType", ParserTag.TAG_GRADIENT_TYPE, "setOffsets", ParserTag.TAG_OFFSETS, "setOrientation", "orientation", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "setShape", ParserTag.TAG_SHAPE, "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class GradientDrawableEntity extends DrawableEntity {
    public GradientDrawableEntity() throws JSONException {
        getMJSONObject().put("type", ParserTag.TAG_GRADIENT_DRAWABLE);
    }

    public final void setColors(@NotNull int... colors) throws JSONException {
        Intrinsics.checkNotNullParameter(colors, "colors");
        JSONArray jSONArray = new JSONArray();
        for (int i : colors) {
            jSONArray.put(i);
        }
        getMJSONObject().put(ParserTag.TAG_COLORS, jSONArray);
    }

    public final void setCornerRadii(@NotNull float... cornerRadiusArray) throws JSONException {
        Intrinsics.checkNotNullParameter(cornerRadiusArray, "cornerRadiusArray");
        JSONArray jSONArray = new JSONArray();
        for (float f : cornerRadiusArray) {
            jSONArray.put(Float.valueOf(f));
        }
        getMJSONObject().put(ParserTag.TAG_CORNER_RADII, jSONArray);
    }

    public final void setCornerRadius(float cornerRadius) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_CORNER_RADIUS, Float.valueOf(cornerRadius));
    }

    public final void setGradientType(int gradientType) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_GRADIENT_TYPE, gradientType);
    }

    public final void setOffsets(@NotNull float... offsets) throws JSONException {
        Intrinsics.checkNotNullParameter(offsets, "offsets");
        JSONArray jSONArray = new JSONArray();
        for (float f : offsets) {
            jSONArray.put(Float.valueOf(f));
        }
        getMJSONObject().put(ParserTag.TAG_OFFSETS, jSONArray);
    }

    public final void setOrientation(@NotNull String orientation) throws JSONException {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        getMJSONObject().put("orientation", orientation);
    }

    public final void setShape(int shape) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_SHAPE, shape);
    }

    public final void setGradientType(@NotNull String gradientType) throws JSONException {
        Intrinsics.checkNotNullParameter(gradientType, "gradientType");
        getMJSONObject().put(ParserTag.TAG_GRADIENT_TYPE, gradientType);
    }

    public final void setOrientation(@NotNull GradientDrawable.Orientation orientation) throws JSONException {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        getMJSONObject().put("orientation", orientation);
    }

    public final void setShape(@NotNull String shape) throws JSONException {
        Intrinsics.checkNotNullParameter(shape, "shape");
        getMJSONObject().put(ParserTag.TAG_SHAPE, shape);
    }

    public final void setColors(@NotNull String... colors) throws JSONException {
        Intrinsics.checkNotNullParameter(colors, "colors");
        JSONArray jSONArray = new JSONArray();
        for (String str : colors) {
            jSONArray.put(str);
        }
        getMJSONObject().put(ParserTag.TAG_COLORS, jSONArray);
    }
}
