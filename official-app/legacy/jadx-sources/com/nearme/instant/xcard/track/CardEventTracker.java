package com.nearme.instant.xcard.track;

import android.content.Context;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.cloud.sdk.cloudstorage.http.HttpHeaders;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH\u0016J.\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH\u0016J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\u0018J>\u0010\u0019\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J#\u0010\u001e\u001a\u0002H\u001f\"\u0004\b\u0000\u0010\u001f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u0002H\u001fH\u0002¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/nearme/instant/xcard/track/CardEventTracker;", "Lcom/nearme/instant/xcard/track/IEventTracker;", "()V", "EVENT_TRACKER_NOT_INIT", "", "TAG", "mEventTracker", "chooseBestTracker", HttpHeaders.CTX, "Landroid/content/Context;", "priorityType", "Lcom/nearme/instant/xcard/track/TrackerType;", "initEnv", "", "config", "", "initForApp", "appId", "", "initTrackerIfNeeded", "isAppInitialized", "isEnvInitialized", "isTrackerValid", "releaseIfNeeded", "", "trackEvent", "eventGroup", "eventId", "eventInfo", "trackerType", "warning", ExifInterface.GPS_DIRECTION_TRUE, "msg", "t", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "card-track_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardEventTracker implements IEventTracker {

    @NotNull
    private static final String EVENT_TRACKER_NOT_INIT = "EventTacker invalid";

    @NotNull
    public static final CardEventTracker INSTANCE = new CardEventTracker();

    @NotNull
    private static final String TAG = "CardEventTracker";

    @Nullable
    private static IEventTracker mEventTracker;

    private CardEventTracker() {
    }

    private final IEventTracker chooseBestTracker(Context ctx, TrackerType priorityType) {
        if (priorityType == TrackerType.TRACKER_TYPE_DCS) {
            if (DcsTracker.INSTANCE.isSupport(ctx)) {
                return new DcsTracker();
            }
            if (NearxTracker.INSTANCE.isSupport()) {
                return new NearxTracker();
            }
            return null;
        }
        if (NearxTracker.INSTANCE.isSupport()) {
            return new NearxTracker();
        }
        if (DcsTracker.INSTANCE.isSupport(ctx)) {
            return new DcsTracker();
        }
        return null;
    }

    private final <T> T warning(String msg, T t) {
        Log.w(TAG, msg);
        return t;
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean initEnv(@NotNull Context ctx, @Nullable Map<String, String> config) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        IEventTracker iEventTracker = mEventTracker;
        return iEventTracker != null ? iEventTracker.initEnv(ctx, config) : ((Boolean) warning(EVENT_TRACKER_NOT_INIT, Boolean.FALSE)).booleanValue();
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean initForApp(@NotNull Context ctx, long appId, @Nullable Map<String, String> config) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        IEventTracker iEventTracker = mEventTracker;
        return iEventTracker != null ? iEventTracker.initForApp(ctx, appId, config) : ((Boolean) warning(EVENT_TRACKER_NOT_INIT, Boolean.FALSE)).booleanValue();
    }

    public final synchronized boolean initTrackerIfNeeded(@NotNull Context ctx, @NotNull TrackerType priorityType) {
        ClassLoader classLoader;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(priorityType, "priorityType");
        if (mEventTracker == null) {
            mEventTracker = chooseBestTracker(ctx, priorityType);
            StringBuilder sb = new StringBuilder();
            sb.append("use ");
            IEventTracker iEventTracker = mEventTracker;
            sb.append(iEventTracker != null ? iEventTracker.trackerType() : null);
            Log.d(TAG, sb.toString());
        }
        IEventTracker iEventTracker2 = mEventTracker;
        if (iEventTracker2 != null && (classLoader = iEventTracker2.getClass().getClassLoader()) != null && !Intrinsics.areEqual(classLoader, CardEventTracker.class.getClassLoader())) {
            Log.d(TAG, "reuse tracker with host");
        }
        return mEventTracker != null;
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean isAppInitialized(long appId) {
        IEventTracker iEventTracker = mEventTracker;
        return iEventTracker != null ? iEventTracker.isAppInitialized(appId) : ((Boolean) warning(EVENT_TRACKER_NOT_INIT, Boolean.FALSE)).booleanValue();
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean isEnvInitialized() {
        IEventTracker iEventTracker = mEventTracker;
        return iEventTracker != null ? iEventTracker.isEnvInitialized() : ((Boolean) warning(EVENT_TRACKER_NOT_INIT, Boolean.FALSE)).booleanValue();
    }

    public final synchronized boolean isTrackerValid() {
        return mEventTracker != null;
    }

    public final void releaseIfNeeded() {
        ClassLoader classLoader;
        IEventTracker iEventTracker = mEventTracker;
        if (iEventTracker == null || (classLoader = iEventTracker.getClass().getClassLoader()) == null || Intrinsics.areEqual(classLoader, CardEventTracker.class.getClassLoader())) {
            return;
        }
        Log.d(TAG, "release tracker");
        mEventTracker = null;
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean trackEvent(@NotNull Context ctx, long appId, @NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, String> eventInfo) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        IEventTracker iEventTracker = mEventTracker;
        return iEventTracker != null ? iEventTracker.trackEvent(ctx, appId, eventGroup, eventId, eventInfo) : ((Boolean) warning(EVENT_TRACKER_NOT_INIT, Boolean.FALSE)).booleanValue();
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    @NotNull
    public TrackerType trackerType() {
        TrackerType trackerType;
        IEventTracker iEventTracker = mEventTracker;
        return (iEventTracker == null || (trackerType = iEventTracker.trackerType()) == null) ? TrackerType.TRACKER_TYPE_NULL : trackerType;
    }
}
