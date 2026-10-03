package com.oplus.aiunit.vision;

import com.tencent.qgame.animplayer.mix.Src;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR3\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/dli;", "", "Ljava/util/HashMap;", "", "Lcom/tencent/qgame/animplayer/mix/Src;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "map", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class dli {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Src> map;

    public dli(@NotNull JSONObject json) throws JSONException {
        JSONObject jSONObject;
        Intrinsics.checkParameterIsNotNull(json, "json");
        this.map = new HashMap<>();
        JSONArray jSONArray = json.getJSONArray("src");
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i)) != null) {
                Src src = new Src(jSONObject);
                if (src.getSrcType() != Src.SrcType.UNKNOWN) {
                    this.map.put(src.getSrcId(), src);
                }
            }
        }
    }

    @NotNull
    public final HashMap<String, Src> a() {
        return this.map;
    }
}
