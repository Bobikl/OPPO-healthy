package com.nearme.instant.xcard.track;

import android.content.Context;
import com.cloud.sdk.cloudstorage.http.HttpHeaders;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J.\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u0003H&J>\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J\b\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/nearme/instant/xcard/track/IEventTracker;", "", "initEnv", "", HttpHeaders.CTX, "Landroid/content/Context;", "config", "", "", "initForApp", "appId", "", "isAppInitialized", "isEnvInitialized", "trackEvent", "eventGroup", "eventId", "eventInfo", "trackerType", "Lcom/nearme/instant/xcard/track/TrackerType;", "card-track_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IEventTracker {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean initEnv$default(IEventTracker iEventTracker, Context context, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initEnv");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return iEventTracker.initEnv(context, map);
        }
    }

    boolean initEnv(@NotNull Context ctx, @Nullable Map<String, String> config);

    boolean initForApp(@NotNull Context ctx, long appId, @Nullable Map<String, String> config);

    boolean isAppInitialized(long appId);

    boolean isEnvInitialized();

    boolean trackEvent(@NotNull Context ctx, long appId, @NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, String> eventInfo);

    @NotNull
    TrackerType trackerType();
}
