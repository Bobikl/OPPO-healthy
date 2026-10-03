package com.oplus.drs.track.routing.origin;

import android.content.Context;
import com.oplus.aiunit.vision.af3;
import com.oplus.aiunit.vision.vb0;
import com.oplus.aiunit.vision.w5k;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.oplus.drs.track.ITrackApi;
import com.oplus.drs.track.routing.ITrackApiFactory;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/drs/track/routing/origin/TrackApiEmptyFactory;", "Lcom/oplus/drs/track/routing/ITrackApiFactory;", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/af3;", "staticConfig", "", "staticInit", "", "appId", "Lcom/oplus/drs/track/ITrackApi;", "getInstance", "getInstanceForApp", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "getMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "map", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class TrackApiEmptyFactory implements ITrackApiFactory {

    @NotNull
    public static final String TAG = "empty";

    @NotNull
    public static final TrackApiEmptyFactory INSTANCE = new TrackApiEmptyFactory();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<Long, ITrackApi> map = new ConcurrentHashMap<>();

    private TrackApiEmptyFactory() {
    }

    @Override // com.oplus.drs.track.routing.ITrackApiFactory
    @NotNull
    public ITrackApi getInstance(long appId) {
        ConcurrentHashMap<Long, ITrackApi> concurrentHashMap = map;
        synchronized (concurrentHashMap) {
            ITrackApi iTrackApi = concurrentHashMap.get(Long.valueOf(appId));
            if (iTrackApi != null) {
                return iTrackApi;
            }
            w5k w5kVar = new w5k();
            concurrentHashMap.put(Long.valueOf(appId), w5kVar);
            return w5kVar;
        }
    }

    @Override // com.oplus.drs.track.routing.ITrackApiFactory
    @Nullable
    public ITrackApi getInstanceForApp() {
        return getInstance(vb0.sAppModuleId);
    }

    @NotNull
    public final ConcurrentHashMap<Long, ITrackApi> getMap() {
        return map;
    }

    @Override // com.oplus.drs.track.routing.ITrackApiFactory
    public void staticInit(@NotNull Context context, @NotNull af3 staticConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(staticConfig, "staticConfig");
        TrackLogger.m("empty", "empty staticInit", new Object[0]);
    }
}
