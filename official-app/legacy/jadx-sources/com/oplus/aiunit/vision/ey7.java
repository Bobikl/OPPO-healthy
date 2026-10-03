package com.oplus.aiunit.vision;

import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/ey7;", "", "Landroid/util/SparseArray;", "Lcom/oplus/aiunit/vision/ty7;", "a", "Landroid/util/SparseArray;", "()Landroid/util/SparseArray;", "map", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class ey7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<ty7> map;

    public ey7(@NotNull JSONObject json) throws JSONException {
        JSONObject jSONObject;
        Intrinsics.checkParameterIsNotNull(json, "json");
        this.map = new SparseArray<>();
        JSONArray jSONArray = json.getJSONArray(TypedValues.AttributesType.S_FRAME);
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i)) != null) {
                ty7 ty7Var = new ty7(jSONObject);
                this.map.put(ty7Var.getIndex(), ty7Var);
            }
        }
    }

    @NotNull
    public final SparseArray<ty7> a() {
        return this.map;
    }
}
