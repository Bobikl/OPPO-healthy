package com.oplus.drs.track;

import com.oplus.aiunit.vision.zp9;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\tH'J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J,\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0013H&J,\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J8\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\"\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J\"\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J.\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013H&J,\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J8\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J\u001e\u0010\u0019\u001a\u00020\t2\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\t0\u0016H&J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000bH&J\n\u0010\u001c\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u001d\u001a\u00020\tH&J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u000bH&J\n\u0010 \u001a\u0004\u0018\u00010\u000bH&J\b\u0010!\u001a\u00020\tH&J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000bH&J\n\u0010$\u001a\u0004\u0018\u00010\u000bH&J\b\u0010%\u001a\u00020\tH&J\u0010\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0011H&J\b\u0010(\u001a\u00020\u0011H&J\b\u0010)\u001a\u00020\tH&J\u0010\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u000bH&J\u0010\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H&J\b\u0010/\u001a\u00020\tH&J\n\u00100\u001a\u0004\u0018\u00010,H&¨\u00061"}, d2 = {"Lcom/oplus/drs/track/ITrackApi;", "", "Lcom/oplus/drs/track/TrackConfig;", "config", "", "init", "", "id", "getMaxCacheSize", "", "flush", "", "eventGroup", "eventId", "track", "Lcom/oplus/drs/track/ITrackEventCallBack;", "callBack", "Lorg/json/JSONObject;", SAPropertyFilter.PROPERTIES, "", "trackTimerStart", "trackTimerEnd", "Lkotlin/Function1;", "Lcom/oplus/drs/track/StdId;", "callback", "getStdId", "clientId", "setClientId", "getClientId", "clearClientId", "userId", "setUserId", "getUserId", "clearUserId", "customClientId", "setCustomClientId", "getCustomClientId", "clearCustomClientId", "customHead", "setCustomHead", "getCustomHead", "clearCustomHead", "feedbackRegion", "setFeedBackRegion", "Lcom/oplus/aiunit/vision/zp9;", "process", "setExceptionProcess", "removeExceptionProcess", "getExceptionProcess", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public interface ITrackApi {
    void clearClientId();

    void clearCustomClientId();

    void clearCustomHead();

    void clearUserId();

    @Deprecated(message = "reference realtime track")
    void flush();

    @Nullable
    String getClientId();

    @Nullable
    String getCustomClientId();

    @NotNull
    JSONObject getCustomHead();

    @Nullable
    zp9 getExceptionProcess();

    long getMaxCacheSize();

    void getStdId(@NotNull Function1<? super StdId, Unit> callback);

    @Nullable
    String getUserId();

    long id();

    boolean init(@NotNull TrackConfig config);

    void removeExceptionProcess();

    void setClientId(@NotNull String clientId);

    void setCustomClientId(@NotNull String customClientId);

    void setCustomHead(@NotNull JSONObject customHead);

    void setExceptionProcess(@NotNull zp9 process);

    void setFeedBackRegion(@NotNull String feedbackRegion);

    void setUserId(@NotNull String userId);

    void track(@NotNull String eventGroup, @NotNull String eventId);

    void track(@NotNull String eventGroup, @NotNull String eventId, @Nullable ITrackEventCallBack callBack);

    void track(@NotNull String eventGroup, @NotNull String eventId, @NotNull Map<String, ? extends Object> properties);

    void track(@NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, ? extends Object> properties, @Nullable ITrackEventCallBack callBack);

    void track(@NotNull String eventGroup, @NotNull String eventId, @Nullable JSONObject properties);

    void track(@NotNull String eventGroup, @NotNull String eventId, @Nullable JSONObject properties, @Nullable ITrackEventCallBack callBack);

    void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId);

    void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable ITrackEventCallBack callBack);

    void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, ? extends Object> properties);

    void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, ? extends Object> properties, @Nullable ITrackEventCallBack callBack);

    void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable JSONObject properties);

    void trackTimerEnd(@NotNull String eventGroup, @NotNull String eventId, @Nullable JSONObject properties, @Nullable ITrackEventCallBack callBack);

    void trackTimerStart(@NotNull String eventGroup, @NotNull String eventId);
}
