package com.heytap.store.platform.track;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J$\u0010\r\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H&J4\u0010\u0012\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H&J,\u0010\u0012\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J$\u0010\u0019\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\tH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u001dH&¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/platform/track/IStatistics;", "", "addOnCompleteListener", "", "listener", "Lcom/heytap/store/platform/track/OnCompleteListener;", "cleanUserId", "flush", "getUserId", "", "init", "config", "Lcom/heytap/store/platform/track/StatisticsConfig;", "report", ExifInterface.GPS_DIRECTION_TRUE, "event", "data", "Lcom/heytap/store/platform/track/EventData;", "reportByOBus", "appId", "", "eventGroup", "reportEnable", "enable", "", "setCommonProperties", "setUserId", "userId", "setUserProperties", "Lorg/json/JSONObject;", "track_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IStatistics {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void addOnCompleteListener(@NotNull IStatistics iStatistics, @NotNull OnCompleteListener listener) {
            Intrinsics.checkNotNullParameter(iStatistics, "this");
            Intrinsics.checkNotNullParameter(listener, "listener");
        }
    }

    void addOnCompleteListener(@NotNull OnCompleteListener listener);

    void cleanUserId();

    void flush();

    @NotNull
    String getUserId();

    void init(@NotNull StatisticsConfig config);

    <T> void report(@NotNull String event, @NotNull EventData<T> data);

    <T> void reportByOBus(long appId, @NotNull String eventGroup, @NotNull String event, @NotNull EventData<T> data);

    <T> void reportByOBus(@NotNull String eventGroup, @NotNull String event, @NotNull EventData<T> data);

    void reportEnable(boolean enable);

    <T> void setCommonProperties(@NotNull String event, @NotNull EventData<T> data);

    void setUserId(@NotNull String userId);

    void setUserProperties(@NotNull JSONObject data);
}
