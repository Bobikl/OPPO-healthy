package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J&\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006J\u001f\u0010\u001a\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'J\u001f\u0010(\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!J\u000e\u0010*\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$J\u000e\u0010+\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'J\u001f\u0010,\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u000e\u0010-\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!J\u000e\u0010.\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$J\u000e\u0010/\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'J\u001f\u00100\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u000e\u00101\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!J\u000e\u00102\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$J\u000e\u00103\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'J\u000e\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u000206J\u000e\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u0014J\u001f\u0010;\u001a\u00020\u000f2\u0012\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001c\"\u00020\u0003¢\u0006\u0002\u0010=R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/oplus/smartenginehelper/entity/AnimatorEntity;", "", "paramsName", "", "values", "", "", "(Ljava/lang/String;[F)V", "(Ljava/lang/String;)V", "mJSONObject", "Lorg/json/JSONObject;", "mParamsJSONArray", "Lorg/json/JSONArray;", "mParamsJSONObject", "addValues", "", "value", "getJSONObject", "setDuration", "duration", "", "setInterpolator", "x1", "y1", "x2", "y2", "setOnAnimationCancel", "animListenerEntities", "", "Lcom/oplus/smartenginehelper/entity/AnimListenerEntity;", "([Lcom/oplus/smartenginehelper/entity/AnimListenerEntity;)V", "setOnAnimationCancelToCallContentProvider", "contentProviderListenerEntity", "Lcom/oplus/smartenginehelper/entity/ContentProviderListenerEntity;", "setOnAnimationCancelToStartActivity", "startActivityListenerEntity", "Lcom/oplus/smartenginehelper/entity/StartActivityListenerEntity;", "setOnAnimationCancelToStartService", "startServiceListenerEntity", "Lcom/oplus/smartenginehelper/entity/StartServiceListenerEntity;", "setOnAnimationEnd", "setOnAnimationEndToCallContentProvider", "setOnAnimationEndToStartActivity", "setOnAnimationEndToStartService", "setOnAnimationRepeat", "setOnAnimationRepeatToCallContentProvider", "setOnAnimationRepeatToStartActivity", "setOnAnimationRepeatToStartService", "setOnAnimationStart", "setOnAnimationStartToCallContentProvider", "setOnAnimationStartToStartActivity", "setOnAnimationStartToStartService", "setRepeatCount", ParserTag.TAG_REPEAT_COUNT, "", "setRepeatMode", "repeatMode", "setStartDelay", ParserTag.TAG_START_DELAY, "setTarget", "targets", "([Ljava/lang/String;)V", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class AnimatorEntity {
    private final JSONObject mJSONObject;
    private final JSONArray mParamsJSONArray;
    private final JSONObject mParamsJSONObject;

    public AnimatorEntity(@NotNull String paramsName, @NotNull float... values) throws JSONException {
        Intrinsics.checkNotNullParameter(paramsName, "paramsName");
        Intrinsics.checkNotNullParameter(values, "values");
        JSONObject jSONObject = new JSONObject();
        this.mJSONObject = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.mParamsJSONObject = jSONObject2;
        this.mParamsJSONArray = new JSONArray();
        jSONObject.put("params", jSONObject2);
        for (float f : values) {
            this.mParamsJSONArray.put(Float.valueOf(f));
        }
        this.mParamsJSONObject.put(paramsName, this.mParamsJSONArray);
    }

    public final void addValues(float value) {
        this.mParamsJSONArray.put(Float.valueOf(value));
    }

    @NotNull
    /* JADX INFO: renamed from: getJSONObject, reason: from getter */
    public final JSONObject getMJSONObject() {
        return this.mJSONObject;
    }

    public final void setDuration(long duration) throws JSONException {
        this.mJSONObject.put("duration", duration);
    }

    public final void setInterpolator(float x1, float y1, float x2, float y2) throws JSONException {
        this.mJSONObject.put(ParserTag.TAG_INTERPOLATOR, new JSONArray(new float[]{x1, y1, x2, y2}));
    }

    public final void setOnAnimationCancel(@NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_CANCEL, jSONArray);
    }

    public final void setOnAnimationCancelToCallContentProvider(@NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_CANCEL, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationCancelToStartActivity(@NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_CANCEL, startActivityListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationCancelToStartService(@NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_CANCEL, startServiceListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationEnd(@NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_END, jSONArray);
    }

    public final void setOnAnimationEndToCallContentProvider(@NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_END, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationEndToStartActivity(@NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_END, startActivityListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationEndToStartService(@NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_END, startServiceListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationRepeat(@NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_REPEAT, jSONArray);
    }

    public final void setOnAnimationRepeatToCallContentProvider(@NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_REPEAT, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationRepeatToStartActivity(@NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_REPEAT, startActivityListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationRepeatToStartService(@NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_REPEAT, startServiceListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationStart(@NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_START, jSONArray);
    }

    public final void setOnAnimationStartToCallContentProvider(@NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_START, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationStartToStartActivity(@NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_START, startActivityListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationStartToStartService(@NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        this.mJSONObject.put(ParserTag.TAG_ON_ANIMATION_START, startServiceListenerEntity.getMJSONObject());
    }

    public final void setRepeatCount(int repeatCount) throws JSONException {
        this.mJSONObject.put(ParserTag.TAG_REPEAT_COUNT, repeatCount);
    }

    public final void setRepeatMode(int repeatMode) throws JSONException {
        this.mJSONObject.put("repeatMode", repeatMode);
    }

    public final void setStartDelay(long startDelay) throws JSONException {
        this.mJSONObject.put(ParserTag.TAG_START_DELAY, startDelay);
    }

    public final void setTarget(@NotNull String... targets) throws JSONException {
        Intrinsics.checkNotNullParameter(targets, "targets");
        this.mJSONObject.put("target", new JSONArray(targets));
    }

    public final void addValues(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mParamsJSONArray.put(value);
    }

    public AnimatorEntity(@NotNull String paramsName) throws JSONException {
        Intrinsics.checkNotNullParameter(paramsName, "paramsName");
        JSONObject jSONObject = new JSONObject();
        this.mJSONObject = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.mParamsJSONObject = jSONObject2;
        JSONArray jSONArray = new JSONArray();
        this.mParamsJSONArray = jSONArray;
        jSONObject.put("params", jSONObject2);
        jSONObject2.put(paramsName, jSONArray);
    }
}
