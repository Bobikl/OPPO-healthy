package com.oplusos.vfxmodelviewer.view;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/LightConfig;", "", "()V", "direction", "", "getDirection", "()[D", "setDirection", "([D)V", "iblAngle", "getIblAngle", "setIblAngle", "iblIntensity", "", "getIblIntensity", "()F", "setIblIntensity", "(F)V", "intensity", "getIntensity", "setIntensity", "fromJson", "", "jsonObject", "Lorg/json/JSONObject;", "toJson", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LightConfig {
    private float intensity = 100000.0f;

    @NotNull
    private double[] direction = {0.0d, -1.0d, 0.0d};
    private float iblIntensity = 30000.0f;

    @NotNull
    private double[] iblAngle = {0.0d, 0.0d, 0.0d};

    public final void fromJson(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.intensity = jsonObject.getInt("intensity");
        JSONArray jSONArray = jsonObject.getJSONArray("direction");
        this.direction[0] = jSONArray.getDouble(0);
        this.direction[1] = jSONArray.getDouble(1);
        this.direction[2] = jSONArray.getDouble(2);
        if (jsonObject.has("iblIntensity")) {
            this.iblIntensity = jsonObject.getInt("iblIntensity");
        }
        if (jsonObject.has("iblAngle")) {
            JSONArray jSONArray2 = jsonObject.getJSONArray("iblAngle");
            this.iblAngle[0] = jSONArray2.getDouble(0);
            this.iblAngle[1] = jSONArray2.getDouble(1);
            this.iblAngle[2] = jSONArray2.getDouble(2);
        }
    }

    @NotNull
    public final double[] getDirection() {
        return this.direction;
    }

    @NotNull
    public final double[] getIblAngle() {
        return this.iblAngle;
    }

    public final float getIblIntensity() {
        return this.iblIntensity;
    }

    public final float getIntensity() {
        return this.intensity;
    }

    public final void setDirection(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<set-?>");
        this.direction = dArr;
    }

    public final void setIblAngle(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<set-?>");
        this.iblAngle = dArr;
    }

    public final void setIblIntensity(float f) {
        this.iblIntensity = f;
    }

    public final void setIntensity(float f) {
        this.intensity = f;
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("intensity", (int) this.intensity).put("direction", new JSONArray(this.direction)).put("iblIntensity", (int) this.iblIntensity).put("iblAngle", new JSONArray(this.iblAngle));
        return jSONObject;
    }
}
