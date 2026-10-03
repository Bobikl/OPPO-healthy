package com.nearme.instant.xcard.track;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.cloud.sdk.cloudstorage.http.HttpHeaders;
import com.oplus.statistics.OTrackConfig;
import com.oplus.statistics.OTrackContext;
import com.oplus.statistics.OplusTrack;
import com.oplus.statistics.util.ApkInfoUtil;
import com.oplus.statistics.util.VersionUtil;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J.\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J>\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/nearme/instant/xcard/track/DcsTracker;", "Lcom/nearme/instant/xcard/track/IEventTracker;", "()V", "mInitState", "Landroid/util/SparseBooleanArray;", "initEnv", "", HttpHeaders.CTX, "Landroid/content/Context;", "config", "", "", "initForApp", "appId", "", "isAppInitialized", "isEnvInitialized", "trackEvent", "eventGroup", "eventId", "eventInfo", "trackerType", "Lcom/nearme/instant/xcard/track/TrackerType;", "Companion", "card-track_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DcsTracker implements IEventTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String OPLUS_CTA_UPDATE_SERVICE = "oplus_customize_cta_update_service";

    @NotNull
    private static final String OPLUS_CTA_USER_EXPERIENCE = "oplus_customize_cta_user_experience";

    @NotNull
    public static final String TAG = "DcsTracker";

    @NotNull
    private final SparseBooleanArray mInitState = new SparseBooleanArray();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/nearme/instant/xcard/track/DcsTracker$Companion;", "", "()V", "OPLUS_CTA_UPDATE_SERVICE", "", "OPLUS_CTA_USER_EXPERIENCE", "TAG", "isSupport", "", HttpHeaders.CTX, "Landroid/content/Context;", "card-track_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupport(@NotNull Context ctx) {
            Object objM5287constructorimpl;
            Object objM5287constructorimpl2;
            Object objM5287constructorimpl3;
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(Integer.valueOf(Settings.System.getInt(ctx.getContentResolver(), DcsTracker.OPLUS_CTA_UPDATE_SERVICE)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                Log.w(DcsTracker.TAG, "get cta_update_service fail", thM5290exceptionOrNullimpl);
            }
            if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
                objM5287constructorimpl = -1;
            }
            if (((Number) objM5287constructorimpl).intValue() != 1) {
                Log.w(DcsTracker.TAG, "cta != 1");
                return false;
            }
            try {
                objM5287constructorimpl2 = Result.m5287constructorimpl(Integer.valueOf(Settings.System.getInt(ctx.getContentResolver(), DcsTracker.OPLUS_CTA_USER_EXPERIENCE)));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5287constructorimpl2 = Result.m5287constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM5290exceptionOrNullimpl2 = Result.m5290exceptionOrNullimpl(objM5287constructorimpl2);
            if (thM5290exceptionOrNullimpl2 != null) {
                Log.e(DcsTracker.TAG, "get cta_update_service fail", thM5290exceptionOrNullimpl2);
            }
            if (Result.m5293isFailureimpl(objM5287constructorimpl2)) {
                objM5287constructorimpl2 = -1;
            }
            if (((Number) objM5287constructorimpl2).intValue() != 1) {
                Log.w(DcsTracker.TAG, "userExperience != 1");
                return false;
            }
            try {
                Log.d(DcsTracker.TAG, "Support dcs tracker ver:1.0, buildType:release, sameClassLoader: " + Intrinsics.areEqual(OplusTrack.class.getClassLoader(), Companion.class.getClassLoader()));
                objM5287constructorimpl3 = Result.m5287constructorimpl(Boolean.valueOf(VersionUtil.isContentProviderRecorder(ctx)));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                objM5287constructorimpl3 = Result.m5287constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable thM5290exceptionOrNullimpl3 = Result.m5290exceptionOrNullimpl(objM5287constructorimpl3);
            if (thM5290exceptionOrNullimpl3 != null) {
                Log.e(DcsTracker.TAG, "Not support dcs tracker: " + thM5290exceptionOrNullimpl3.getMessage());
            }
            Boolean bool = Boolean.FALSE;
            if (Result.m5293isFailureimpl(objM5287constructorimpl3)) {
                objM5287constructorimpl3 = bool;
            }
            return ((Boolean) objM5287constructorimpl3).booleanValue();
        }
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean initEnv(@NotNull Context ctx, @Nullable Map<String, String> config) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return true;
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean initForApp(@NotNull Context ctx, long appId, @Nullable Map<String, String> config) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (isAppInitialized(appId)) {
            return true;
        }
        String strValueOf = String.valueOf(appId);
        if (OTrackContext.get(strValueOf) != null) {
            this.mInitState.put((int) appId, true);
            return true;
        }
        synchronized (this) {
            int i = (int) appId;
            if (!this.mInitState.get(i, false)) {
                Object obj = null;
                OTrackConfig oTrackConfigBuild = config != null ? new OTrackConfig.Builder().build() : null;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM5287constructorimpl = Result.m5287constructorimpl(ApkInfoUtil.getAppCode(ctx));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                }
                OplusTrack.init(ctx, strValueOf, oTrackConfigBuild);
                this.mInitState.put(i, true);
                try {
                    String appCode = ApkInfoUtil.getAppCode(ctx);
                    if (Intrinsics.areEqual(appCode, strValueOf)) {
                        if (!Intrinsics.areEqual(Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl, appCode)) {
                            if (!Result.m5293isFailureimpl(objM5287constructorimpl)) {
                                obj = objM5287constructorimpl;
                            }
                            ApkInfoUtil.putAppCodeToCache(ctx, (String) obj);
                        }
                    }
                    Result.m5287constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m5287constructorimpl(ResultKt.createFailure(th2));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        Log.d(TAG, "init dcs track for " + appId);
        return true;
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean isAppInitialized(long appId) {
        return this.mInitState.get((int) appId, false);
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean isEnvInitialized() {
        return true;
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    public boolean trackEvent(@NotNull Context ctx, long appId, @NotNull String eventGroup, @NotNull String eventId, @Nullable Map<String, String> eventInfo) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (isAppInitialized(appId)) {
            return OplusTrack.onCommon(ctx, String.valueOf(appId), eventGroup, eventId, eventInfo);
        }
        Log.e(TAG, "DcsTracker of appId=[" + appId + "] is not inited.");
        return false;
    }

    @Override // com.nearme.instant.xcard.track.IEventTracker
    @NotNull
    public TrackerType trackerType() {
        return TrackerType.TRACKER_TYPE_DCS;
    }
}
