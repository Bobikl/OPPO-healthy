package com.oplus.aiunit.vision;

import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.oplus.drs.track.ITrackApi;
import com.oplus.drs.track.ITrackEventCallBack;
import com.oplus.drs.track.StdId;
import com.oplus.drs.track.TrackConfig;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.random.Random;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J,\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J,\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J8\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\"\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J.\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0016J,\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J8\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001e\u0010\u001a\u001a\u00020\t2\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\t0\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\u0010\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000bH\u0016J\n\u0010%\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010&\u001a\u00020\tH\u0016J\u0010\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0011H\u0016J\b\u0010)\u001a\u00020\u0011H\u0016J\b\u0010*\u001a\u00020\tH\u0016J\u0010\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u000bH\u0016J\u0010\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0016J\b\u00100\u001a\u00020\tH\u0016J\n\u00101\u001a\u0004\u0018\u00010-H\u0016¨\u00064"}, d2 = {"Lcom/oplus/aiunit/vision/w5k;", "Lcom/oplus/drs/track/ITrackApi;", "Lcom/oplus/drs/track/TrackConfig;", "config", "", "init", "", "id", "getMaxCacheSize", "", "flush", "", "eventGroup", "eventId", "track", "Lcom/oplus/drs/track/ITrackEventCallBack;", "callBack", "Lorg/json/JSONObject;", SAPropertyFilter.PROPERTIES, "", "", "trackTimerStart", "trackTimerEnd", "Lkotlin/Function1;", "Lcom/oplus/drs/track/StdId;", "callback", "getStdId", "clientId", "setClientId", "getClientId", "clearClientId", "userId", "setUserId", "getUserId", "clearUserId", "customClientId", "setCustomClientId", "getCustomClientId", "clearCustomClientId", "customHead", "setCustomHead", "getCustomHead", "clearCustomHead", "feedbackRegion", "setFeedBackRegion", "Lcom/oplus/aiunit/vision/zp9;", "process", "setExceptionProcess", "removeExceptionProcess", "getExceptionProcess", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class w5k implements ITrackApi {
    @Override // com.oplus.drs.track.ITrackApi
    public void clearClientId() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void clearCustomClientId() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void clearCustomHead() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void clearUserId() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void flush() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    @Nullable
    public String getClientId() {
        TrackLogger.m("empty", "empty impl, get getClientId", new Object[0]);
        return null;
    }

    @Override // com.oplus.drs.track.ITrackApi
    @Nullable
    public String getCustomClientId() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
        return null;
    }

    @Override // com.oplus.drs.track.ITrackApi
    @NotNull
    public JSONObject getCustomHead() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
        return new JSONObject();
    }

    @Override // com.oplus.drs.track.ITrackApi
    @Nullable
    public zp9 getExceptionProcess() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
        return null;
    }

    @Override // com.oplus.drs.track.ITrackApi
    public long getMaxCacheSize() {
        return zz4.JOURNAL_SIZE_LIMIT_LOW;
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void getStdId(@NotNull Function1<? super StdId, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        TrackLogger.m("empty", "empty impl, get StdId", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    @Nullable
    public String getUserId() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
        return null;
    }

    @Override // com.oplus.drs.track.ITrackApi
    /* JADX INFO: renamed from: id */
    public long getAppId() {
        return Random.INSTANCE.nextLong();
    }

    @Override // com.oplus.drs.track.ITrackApi
    public boolean init(@NotNull TrackConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return true;
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void removeExceptionProcess() {
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void setClientId(@NotNull String clientId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        TrackLogger.m("empty", "empty impl, set StdId", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void setCustomClientId(@NotNull String customClientId) {
        Intrinsics.checkNotNullParameter(customClientId, "customClientId");
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void setCustomHead(@NotNull JSONObject customHead) {
        Intrinsics.checkNotNullParameter(customHead, "customHead");
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void setExceptionProcess(@NotNull zp9 process) {
        Intrinsics.checkNotNullParameter(process, "process");
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void setFeedBackRegion(@NotNull String feedbackRegion) {
        Intrinsics.checkNotNullParameter(feedbackRegion, "feedbackRegion");
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void setUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        TrackLogger.m("empty", "empty impl", new Object[0]);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void track(@NotNull String eventGroup, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track time end, group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void trackTimerStart(@NotNull String eventGroup, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track time start, group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void track(@NotNull String eventGroup, @NotNull String eventId, @Nullable ITrackEventCallBack callBack) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable ITrackEventCallBack callBack) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track time end, group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void track(@NotNull String eventGroup, @NotNull String eventId, @Nullable JSONObject properties) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable JSONObject properties) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track time end, group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void track(@NotNull String eventGroup, @NotNull String eventId, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(properties, "properties");
        TrackLogger.m("empty", "empty impl, track group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track time end, group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void track(@NotNull String eventGroup, @NotNull String eventId, @Nullable JSONObject properties, @Nullable ITrackEventCallBack callBack) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable JSONObject properties, @Nullable ITrackEventCallBack callBack) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track time end, group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void track(@NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, ? extends Object> properties, @Nullable ITrackEventCallBack callBack) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track group=%s, eventId=%s", eventGroup, eventId);
    }

    @Override // com.oplus.drs.track.ITrackApi
    public void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, ? extends Object> properties, @Nullable ITrackEventCallBack callBack) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        TrackLogger.m("empty", "empty impl, track time end, group=%s, eventId=%s", eventGroup, eventId);
    }
}
