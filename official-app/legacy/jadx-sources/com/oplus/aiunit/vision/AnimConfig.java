package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.v30, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 H2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\bF\u0010GJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0011R\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u0011R\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u0011R\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u0011R\"\u0010&\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b%\u0010\u0011R\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b\t\u00100\"\u0004\b1\u00102R\"\u00105\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010/\u001a\u0004\b\u001e\u00100\"\u0004\b4\u00102R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b.\u0010)\"\u0004\b6\u0010+R\"\u00109\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\n\u001a\u0004\b\u000e\u0010\f\"\u0004\b8\u0010\u0011R$\u0010?\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b\u001a\u0010C\"\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/oplus/aiunit/vision/v30;", "", "Lorg/json/JSONObject;", "json", "", LogFieldKey.LEVEL_KEY, "", "toString", "", "a", "I", "getVersion", "()I", "version", "b", "getTotalFrames", "setTotalFrames", "(I)V", "totalFrames", "c", "i", "v", Fields.WIDTH_FIELD, "d", "q", Fields.HEIGHT_FIELD, MapSchema.FIELD_NAME_ENTRY, b2n.g, "u", "videoWidth", "f", b2n.f, "t", "videoHeight", "getOrien", "setOrien", "orien", LogFieldKey.PROCESS_NAME_KEY, "fps", "Z", MapSchema.FIELD_NAME_KEY, "()Z", "setMix", "(Z)V", "isMix", "Lcom/oplus/aiunit/vision/ane;", "j", "Lcom/oplus/aiunit/vision/ane;", "()Lcom/oplus/aiunit/vision/ane;", LogFieldKey.MESSAGE_KEY, "(Lcom/oplus/aiunit/vision/ane;)V", "alphaPointRect", "s", "rgbPointRect", "n", "isDefaultConfig", "o", "defaultVideoMode", "Lorg/json/JSONObject;", "getJsonConfig", "()Lorg/json/JSONObject;", "r", "(Lorg/json/JSONObject;)V", "jsonConfig", "Lcom/oplus/aiunit/vision/ugb;", "maskConfig", "Lcom/oplus/aiunit/vision/ugb;", "()Lcom/oplus/aiunit/vision/ugb;", "setMaskConfig", "(Lcom/oplus/aiunit/vision/ugb;)V", "<init>", "()V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class AnimConfig {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int totalFrames;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int height;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int videoWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public int videoHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public int orien;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public int fps;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public boolean isMix;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isDefaultConfig;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public JSONObject jsonConfig;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int version = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public PointRect alphaPointRect = new PointRect(0, 0, 0, 0);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    public PointRect rgbPointRect = new PointRect(0, 0, 0, 0);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int defaultVideoMode = 1;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PointRect getAlphaPointRect() {
        return this.alphaPointRect;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDefaultVideoMode() {
        return this.defaultVideoMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFps() {
        return this.fps;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final ugb e() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final PointRect getRgbPointRect() {
        return this.rgbPointRect;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getVideoHeight() {
        return this.videoHeight;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getVideoWidth() {
        return this.videoWidth;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsDefaultConfig() {
        return this.isDefaultConfig;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsMix() {
        return this.isMix;
    }

    public final boolean l(@NotNull JSONObject json) {
        Intrinsics.checkParameterIsNotNull(json, "json");
        try {
            JSONObject jSONObject = json.getJSONObject(UTraceSQLiteHelperKt.COL_INFO);
            int i = jSONObject.getInt("v");
            if (this.version != i) {
                q0.INSTANCE.b("AnimPlayer.AnimConfig", "current version=" + this.version + " target=" + i);
                return false;
            }
            this.totalFrames = jSONObject.getInt("f");
            this.width = jSONObject.getInt("w");
            this.height = jSONObject.getInt(b2n.g);
            this.videoWidth = jSONObject.getInt("videoW");
            this.videoHeight = jSONObject.getInt("videoH");
            this.orien = jSONObject.getInt("orien");
            this.fps = jSONObject.getInt("fps");
            this.isMix = jSONObject.getInt("isVapx") == 1;
            JSONArray jSONArray = jSONObject.getJSONArray("aFrame");
            if (jSONArray != null) {
                this.alphaPointRect = new PointRect(jSONArray.getInt(0), jSONArray.getInt(1), jSONArray.getInt(2), jSONArray.getInt(3));
                JSONArray jSONArray2 = jSONObject.getJSONArray("rgbFrame");
                if (jSONArray2 != null) {
                    this.rgbPointRect = new PointRect(jSONArray2.getInt(0), jSONArray2.getInt(1), jSONArray2.getInt(2), jSONArray2.getInt(3));
                    return true;
                }
            }
            return false;
        } catch (JSONException e2) {
            q0.INSTANCE.c("AnimPlayer.AnimConfig", "json parse fail " + e2, e2);
            return false;
        }
    }

    public final void m(@NotNull PointRect pointRect) {
        Intrinsics.checkParameterIsNotNull(pointRect, "<set-?>");
        this.alphaPointRect = pointRect;
    }

    public final void n(boolean z) {
        this.isDefaultConfig = z;
    }

    public final void o(int i) {
        this.defaultVideoMode = i;
    }

    public final void p(int i) {
        this.fps = i;
    }

    public final void q(int i) {
        this.height = i;
    }

    public final void r(@Nullable JSONObject jSONObject) {
        this.jsonConfig = jSONObject;
    }

    public final void s(@NotNull PointRect pointRect) {
        Intrinsics.checkParameterIsNotNull(pointRect, "<set-?>");
        this.rgbPointRect = pointRect;
    }

    public final void t(int i) {
        this.videoHeight = i;
    }

    @NotNull
    public String toString() {
        return "AnimConfig(version=" + this.version + ", totalFrames=" + this.totalFrames + ", width=" + this.width + ", height=" + this.height + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", orien=" + this.orien + ", fps=" + this.fps + ", isMix=" + this.isMix + ", alphaPointRect=" + this.alphaPointRect + ", rgbPointRect=" + this.rgbPointRect + ", isDefaultConfig=" + this.isDefaultConfig + ')';
    }

    public final void u(int i) {
        this.videoWidth = i;
    }

    public final void v(int i) {
        this.width = i;
    }
}
