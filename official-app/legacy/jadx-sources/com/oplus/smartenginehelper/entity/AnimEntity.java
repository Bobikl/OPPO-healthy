package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/oplus/smartenginehelper/entity/AnimEntity;", "", "id", "", "(Ljava/lang/String;)V", "mJSONObject", "Lorg/json/JSONObject;", "getJSONObject", "setAfterId", "", "afterId", "setAnimSet", "animSetEntity", "Lcom/oplus/smartenginehelper/entity/AnimSetEntity;", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class AnimEntity {
    private final JSONObject mJSONObject;

    public AnimEntity(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        JSONObject jSONObject = new JSONObject();
        this.mJSONObject = jSONObject;
        jSONObject.put("id", id);
    }

    @NotNull
    /* JADX INFO: renamed from: getJSONObject, reason: from getter */
    public final JSONObject getMJSONObject() {
        return this.mJSONObject;
    }

    public final void setAfterId(@NotNull String afterId) throws JSONException {
        Intrinsics.checkNotNullParameter(afterId, "afterId");
        this.mJSONObject.put(ParserTag.TAG_AFTER, afterId);
    }

    public final void setAnimSet(@NotNull AnimSetEntity animSetEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(animSetEntity, "animSetEntity");
        this.mJSONObject.put(ParserTag.TAG_ANIM_SET, animSetEntity.getMJSONArray());
    }
}
