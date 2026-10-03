package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u001f\u0010\u001d\u001a\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u001f\u0010!\u001a\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0003¨\u0006,"}, d2 = {"Lcom/oplus/smartenginehelper/entity/LottieEntity;", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", "id", "", "(Ljava/lang/String;)V", "setAutoPlay", "", ParserTag.AUTO_PLAY, "", "setLoop", ParserTag.LOOP, "setOnAnimationCancel", "animListenerEntities", "", "Lcom/oplus/smartenginehelper/entity/AnimListenerEntity;", "([Lcom/oplus/smartenginehelper/entity/AnimListenerEntity;)V", "setOnAnimationCancelToCallContentProvider", "contentProviderListenerEntity", "Lcom/oplus/smartenginehelper/entity/ContentProviderListenerEntity;", "setOnAnimationCancelToStartActivity", "startActivityListenerEntity", "Lcom/oplus/smartenginehelper/entity/StartActivityListenerEntity;", "setOnAnimationCancelToStartService", "startServiceListenerEntity", "Lcom/oplus/smartenginehelper/entity/StartServiceListenerEntity;", "setOnAnimationEnd", "setOnAnimationEndToCallContentProvider", "setOnAnimationEndToStartActivity", "setOnAnimationEndToStartService", "setOnAnimationRepeat", "setOnAnimationRepeatToCallContentProvider", "setOnAnimationRepeatToStartActivity", "setOnAnimationRepeatToStartService", "setOnAnimationStart", "setOnAnimationStartToCallContentProvider", "setOnAnimationStartToStartActivity", "setOnAnimationStartToStartService", ClickApiEntity.SET_PROGRESS, "progress", "", "setResource", "rawId", "", "src", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class LottieEntity extends ViewEntity {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieEntity(@NotNull String id) throws JSONException {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", ParserTag.TYPE_LOTTIE);
    }

    public final void setAutoPlay(boolean autoPlay) throws JSONException {
        getMJSONObject().put(ParserTag.AUTO_PLAY, autoPlay);
    }

    public final void setLoop(boolean loop) throws JSONException {
        getMJSONObject().put(ParserTag.LOOP, loop);
    }

    public final void setOnAnimationCancel(@NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_CANCEL, jSONArray);
    }

    public final void setOnAnimationCancelToCallContentProvider(@NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_CANCEL, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationCancelToStartActivity(@NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_CANCEL, startActivityListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationCancelToStartService(@NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_CANCEL, startServiceListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationEnd(@NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_END, jSONArray);
    }

    public final void setOnAnimationEndToCallContentProvider(@NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_END, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationEndToStartActivity(@NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_END, startActivityListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationEndToStartService(@NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_END, startServiceListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationRepeat(@NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_REPEAT, jSONArray);
    }

    public final void setOnAnimationRepeatToCallContentProvider(@NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_REPEAT, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationRepeatToStartActivity(@NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_REPEAT, startActivityListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationRepeatToStartService(@NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_REPEAT, startServiceListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationStart(@NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_START, jSONArray);
    }

    public final void setOnAnimationStartToCallContentProvider(@NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_START, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationStartToStartActivity(@NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_START, startActivityListenerEntity.getMJSONObject());
    }

    public final void setOnAnimationStartToStartService(@NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        getMJSONObject().put(ParserTag.TAG_ON_ANIMATION_START, startServiceListenerEntity.getMJSONObject());
    }

    public final void setProgress(float progress) throws JSONException {
        getMJSONObject().put("progress", Float.valueOf(progress));
    }

    public final void setResource(@NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(src, "src");
        getMJSONObject().put(ParserTag.ASSET_NAME, src);
    }

    public final void setResource(int rawId) throws JSONException {
        getMJSONObject().put(ParserTag.ASSET_NAME, rawId);
    }
}
