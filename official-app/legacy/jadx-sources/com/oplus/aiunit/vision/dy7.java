package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\u001c\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u0017\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000e¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/dy7;", "", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setSrcId", "(Ljava/lang/String;)V", "srcId", "", "b", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "setZ", "(I)V", "z", "Lcom/oplus/aiunit/vision/ane;", "c", "Lcom/oplus/aiunit/vision/ane;", "()Lcom/oplus/aiunit/vision/ane;", "setFrame", "(Lcom/oplus/aiunit/vision/ane;)V", TypedValues.AttributesType.S_FRAME, "setMFrame", "mFrame", "setMt", "mt", "f", "getIndex", "index", "Lorg/json/JSONObject;", "json", "<init>", "(ILorg/json/JSONObject;)V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class dy7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String srcId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int z;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public PointRect frame;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public PointRect mFrame;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int mt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int index;

    public dy7(int i, @NotNull JSONObject json) throws JSONException {
        Intrinsics.checkParameterIsNotNull(json, "json");
        this.index = i;
        this.srcId = "";
        String string = json.getString("srcId");
        Intrinsics.checkExpressionValueIsNotNull(string, "json.getString(\"srcId\")");
        this.srcId = string;
        this.z = json.getInt("z");
        JSONArray jSONArray = json.getJSONArray(TypedValues.AttributesType.S_FRAME);
        this.frame = new PointRect(jSONArray.getInt(0), jSONArray.getInt(1), jSONArray.getInt(2), jSONArray.getInt(3));
        JSONArray jSONArray2 = json.getJSONArray("mFrame");
        this.mFrame = new PointRect(jSONArray2.getInt(0), jSONArray2.getInt(1), jSONArray2.getInt(2), jSONArray2.getInt(3));
        this.mt = json.getInt("mt");
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PointRect getFrame() {
        return this.frame;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final PointRect getMFrame() {
        return this.mFrame;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMt() {
        return this.mt;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSrcId() {
        return this.srcId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getZ() {
        return this.z;
    }
}
