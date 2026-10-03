package com.nearme.instant.xcard.track;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.exifinterface.media.ExifInterface;
import com.cloud.sdk.cloudstorage.http.HttpHeaders;
import com.oplus.nearx.track.TrackApi;
import com.oplus.nearx.track.TrackApiHelper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J.\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J>\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J#\u0010\u0019\u001a\u0002H\u001a\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u0002H\u001aH\u0002¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/nearme/instant/xcard/track/NearxTracker;", "Lcom/nearme/instant/xcard/track/IEventTracker;", "()V", "mEnvInitState", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mInitState", "Landroid/util/SparseBooleanArray;", "initEnv", "", HttpHeaders.CTX, "Landroid/content/Context;", "config", "", "", "initForApp", "appId", "", "isAppInitialized", "isEnvInitialized", "trackEvent", "eventGroup", "eventId", "eventInfo", "trackerType", "Lcom/nearme/instant/xcard/track/TrackerType;", "warning", ExifInterface.GPS_DIRECTION_TRUE, "msg", "t", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Companion", "card-track_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NearxTracker implements IEventTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "NearxTracker";

    @NotNull
    private final AtomicBoolean mEnvInitState = new AtomicBoolean(false);

    @NotNull
    private final SparseBooleanArray mInitState = new SparseBooleanArray();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/nearme/instant/xcard/track/NearxTracker$Companion;", "", "()V", "TAG", "", "isSupport", "", "card-track_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupport() {
            Object objM5287constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(Integer.valueOf(Log.d(NearxTracker.TAG, "Support nearx tracker ver:3.4.29.2, buildType:release, sameClassLoader: " + Intrinsics.areEqual(TrackApi.INSTANCE.getClass().getClassLoader(), Companion.class.getClassLoader()))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                Log.e(NearxTracker.TAG, "Not support nearx tracker: " + thM5290exceptionOrNullimpl.getMessage());
            }
            return Result.m5294isSuccessimpl(objM5287constructorimpl);
        }
    }

    private final <T> T warning(String msg, T t) {
        Log.w(TAG, msg);
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean initEnv(@NotNull Context ctx, @Nullable Map<String, String> config) {
        TrackApi.c cVarA;
        String region;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (this.mEnvInitState.get()) {
            return true;
        }
        if (config == null) {
            cVarA = new TrackApi.c.a(TrackApiHelper.INSTANCE.getRegion()).a();
        } else {
            if (config.containsKey("region")) {
                region = config.get("region");
                if (region == null) {
                    region = "";
                }
            } else {
                region = TrackApiHelper.INSTANCE.getRegion();
            }
            TrackApi.c.a aVar = new TrackApi.c.a(region);
            String str = config.get(IEventTrackerKt.CFG_TRACK_IN_CUR_PROCESS);
            aVar.d(str != null ? Boolean.parseBoolean(str) : true);
            String str2 = config.get(IEventTrackerKt.CFG_STORAGE_PREFIX);
            if (str2 == null) {
                str2 = "instant_card_";
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Result.m5287constructorimpl(aVar.n(str2));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            String str3 = config.get(IEventTrackerKt.CFG_LOG_ENABLE);
            aVar.c(str3 != null ? Boolean.parseBoolean(str3) : false);
            cVarA = aVar.a();
            if (cVarA == null) {
                cVarA = new TrackApi.c.a(TrackApiHelper.INSTANCE.getRegion()).a();
            }
        }
        synchronized (this) {
            if (!this.mEnvInitState.get()) {
                if (!(ctx.getApplicationContext() instanceof Application)) {
                    Log.e(TAG, "Context must is Application");
                    return false;
                }
                TrackApi.Companion companion3 = TrackApi.INSTANCE;
                Context applicationContext = ctx.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                companion3.n((Application) applicationContext, cVarA);
                this.mEnvInitState.set(true);
            }
            Unit unit = Unit.INSTANCE;
            return true;
        }
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean initForApp(@NotNull Context ctx, long appId, @Nullable Map<String, String> config) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (isAppInitialized(appId)) {
            return true;
        }
        String str3 = null;
        if (config == null || (str = config.get("bizKey")) == null) {
            if (config != null) {
                str = config.get("appKey");
            } else {
                str = null;
            }
            if (str == null) {
                return ((Boolean) warning("init config must contain: key", Boolean.FALSE)).booleanValue();
            }
        }
        if (config == null || (str2 = config.get("bizSecret")) == null) {
            if (config != null) {
                str3 = config.get("appSecret");
            }
            if (str3 == null) {
                return ((Boolean) warning("init config must contain: secret", Boolean.FALSE)).booleanValue();
            }
            str2 = str3;
        }
        TrackApi.b bVarA = new TrackApi.b.a(str, str2).a();
        synchronized (this) {
            int i = (int) appId;
            if (!this.mInitState.get(i, false)) {
                TrackApi.INSTANCE.j(appId).D(bVarA);
                this.mInitState.put(i, true);
            }
            Unit unit = Unit.INSTANCE;
        }
        Log.d(TAG, "init nearx tracker for " + appId);
        return true;
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean isAppInitialized(long appId) {
        return this.mInitState.get((int) appId, false);
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean isEnvInitialized() {
        return this.mEnvInitState.get();
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean trackEvent(@NotNull Context ctx, long appId, @NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, String> eventInfo) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (!isAppInitialized(appId)) {
            Log.e(TAG, "NearxTracker of appId=[" + appId + "] is not inited.");
            return false;
        }
        try {
            TrackApi trackApiJ = TrackApi.INSTANCE.j(appId);
            if (eventInfo == null) {
                eventInfo = MapsKt__MapsKt.emptyMap();
            }
            trackApiJ.M(eventGroup, eventId, eventInfo);
            return true;
        } catch (Exception e2) {
            Log.e(TAG, "trackEvent error:", e2);
            return false;
        }
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    @NotNull
    public TrackerType trackerType() {
        return TrackerType.TRACKER_TYPE_NEARX;
    }
}
