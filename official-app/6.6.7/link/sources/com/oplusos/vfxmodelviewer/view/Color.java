package com.oplusos.vfxmodelviewer.view;

import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.entity.ViewEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0000J&\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0003J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010+J\u000e\u0010,\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(J\t\u0010-\u001a\u00020(HÖ\u0001J\u0006\u0010.\u001a\u00020(J\u0006\u0010/\u001a\u00020+J\u0006\u00100\u001a\u00020(J\t\u00101\u001a\u00020$HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u00063"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/Color;", "", "r", "", "g", "b", "a", "(FFFF)V", "getA", "()F", "setA", "(F)V", "getB", "setB", "getG", "setG", "getR", "setR", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "fromColor", "", "color", "fromFloat", "_r", "_g", "_b", "_a", "fromHex", "hex", "", ViewEntity.ALPHA, "fromInt", "intColor", "", "fromJson", "array", "Lorg/json/JSONArray;", "fromSRGBInt", "hashCode", "toInt", "toJson", "toSRGBInt", "toString", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Color {
    public static final double GAMMA = 2.2d;
    private float a;
    private float b;
    private float g;
    private float r;

    public Color() {
        this(vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null);
    }

    public static /* synthetic */ Color copy$default(Color color, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = color.r;
        }
        if ((i & 2) != 0) {
            f2 = color.g;
        }
        if ((i & 4) != 0) {
            f3 = color.b;
        }
        if ((i & 8) != 0) {
            f4 = color.a;
        }
        return color.copy(f, f2, f3, f4);
    }

    public static /* synthetic */ void fromHex$default(Color color, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        color.fromHex(str, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getA() {
        return this.a;
    }

    @NotNull
    public final Color copy(float r, float g, float b, float a) {
        return new Color(r, g, b, a);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Color)) {
            return false;
        }
        Color color = (Color) other;
        return Intrinsics.areEqual(Float.valueOf(this.r), Float.valueOf(color.r)) && Intrinsics.areEqual(Float.valueOf(this.g), Float.valueOf(color.g)) && Intrinsics.areEqual(Float.valueOf(this.b), Float.valueOf(color.b)) && Intrinsics.areEqual(Float.valueOf(this.a), Float.valueOf(color.a));
    }

    public final void fromColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.r = color.r;
        this.g = color.g;
        this.b = color.b;
        this.a = color.a;
    }

    public final void fromFloat(float _r, float _g, float _b, float _a) {
        this.r = _r;
        this.g = _g;
        this.b = _b;
        this.a = _a;
    }

    public final void fromHex(@NotNull String hex, float alpha) {
        Intrinsics.checkNotNullParameter(hex, "hex");
        if (StringsKt.startsWith$default(hex, "#", false, 2, (Object) null)) {
            hex = StringsKt.removeRange(hex, 0, 1).toString();
        }
        if (hex.length() >= 7) {
            return;
        }
        fromInt(Integer.parseInt(hex, 16));
        this.a = alpha;
    }

    public final void fromInt(int intColor) {
        this.r = ((intColor >> 16) & 255) / 255.0f;
        this.g = ((intColor >> 8) & 255) / 255.0f;
        this.b = (intColor & 255) / 255.0f;
        this.a = ((intColor >> 24) & 255) / 255.0f;
    }

    public final void fromJson(@Nullable JSONArray array) {
        if (array == null) {
            return;
        }
        this.r = (float) array.getDouble(0);
        this.g = (float) array.getDouble(1);
        this.b = (float) array.getDouble(2);
        this.a = (float) array.getDouble(3);
    }

    public final void fromSRGBInt(int intColor) {
        this.r = (float) java.lang.Math.pow(((double) ((intColor >> 16) & 255)) / 255.0d, 2.2d);
        this.g = (float) java.lang.Math.pow(((double) ((intColor >> 8) & 255)) / 255.0d, 2.2d);
        this.b = (float) java.lang.Math.pow(((double) (intColor & 255)) / 255.0d, 2.2d);
        this.a = ((intColor >> 24) & 255) / 255.0f;
    }

    public final float getA() {
        return this.a;
    }

    public final float getB() {
        return this.b;
    }

    public final float getG() {
        return this.g;
    }

    public final float getR() {
        return this.r;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.r) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.a);
    }

    public final void setA(float f) {
        this.a = f;
    }

    public final void setB(float f) {
        this.b = f;
    }

    public final void setG(float f) {
        this.g = f;
    }

    public final void setR(float f) {
        this.r = f;
    }

    public final int toInt() {
        float f = 255;
        return (MathKt.roundToInt(this.a * f) << 24) | (MathKt.roundToInt(this.r * f) << 16) | (MathKt.roundToInt(this.g * f) << 8) | MathKt.roundToInt(this.b * f);
    }

    @NotNull
    public final JSONArray toJson() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(0, this.r);
        jSONArray.put(1, this.g);
        jSONArray.put(2, this.b);
        jSONArray.put(3, this.a);
        return jSONArray;
    }

    public final int toSRGBInt() {
        double d = 255;
        return (MathKt.roundToInt(this.a * 255) << 24) | (MathKt.roundToInt(java.lang.Math.pow(this.r, 0.45454545454545453d) * d) << 16) | (MathKt.roundToInt(java.lang.Math.pow(this.g, 0.45454545454545453d) * d) << 8) | MathKt.roundToInt(java.lang.Math.pow(this.b, 0.45454545454545453d) * d);
    }

    @NotNull
    public String toString() {
        return "Color(r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", a=" + this.a + ')';
    }

    public Color(float f, float f2, float f3, float f4) {
        this.r = f;
        this.g = f2;
        this.b = f3;
        this.a = f4;
    }

    public /* synthetic */ Color(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) != 0 ? 1.0f : f3, (i & 8) != 0 ? 1.0f : f4);
    }
}
