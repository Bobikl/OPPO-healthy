package com.oplus.smartenginehelper.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001f\u0010\t\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\b¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\b¢\u0006\u0002\u0010\fJ\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/smartenginehelper/entity/AnimSetEntity;", "", "()V", "mJSONArray", "Lorg/json/JSONArray;", "addAnimator", "", "animatorEntity", "Lcom/oplus/smartenginehelper/entity/AnimatorEntity;", "addAnimatorsSequentially", "animatorEntities", "", "([Lcom/oplus/smartenginehelper/entity/AnimatorEntity;)V", "addAnimatorsTogether", "getJSONArray", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class AnimSetEntity {
    private final JSONArray mJSONArray = new JSONArray();

    public final void addAnimator(@NotNull AnimatorEntity animatorEntity) {
        Intrinsics.checkNotNullParameter(animatorEntity, "animatorEntity");
        this.mJSONArray.put(animatorEntity.getMJSONObject());
    }

    public final void addAnimatorsSequentially(@NotNull AnimatorEntity... animatorEntities) {
        Intrinsics.checkNotNullParameter(animatorEntities, "animatorEntities");
        for (AnimatorEntity animatorEntity : animatorEntities) {
            this.mJSONArray.put(animatorEntity.getMJSONObject());
        }
    }

    public final void addAnimatorsTogether(@NotNull AnimatorEntity... animatorEntities) {
        Intrinsics.checkNotNullParameter(animatorEntities, "animatorEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimatorEntity animatorEntity : animatorEntities) {
            jSONArray.put(animatorEntity.getMJSONObject());
        }
        this.mJSONArray.put(jSONArray);
    }

    @NotNull
    /* JADX INFO: renamed from: getJSONArray, reason: from getter */
    public final JSONArray getMJSONArray() {
        return this.mJSONArray;
    }
}
