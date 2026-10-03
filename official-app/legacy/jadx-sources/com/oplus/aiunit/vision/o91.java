package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.drs.track.ITrackApi;
import com.oplus.drs.track.routing.ITrackApiFactory;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/o91;", "Lcom/oplus/drs/track/routing/ITrackApiFactory;", "", "appId", "Lcom/oplus/drs/track/ITrackApi;", "getInstance", "getInstanceForApp", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/af3;", "staticConfig", "", "staticInit", "createTrackApi", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "instanceCache", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public abstract class o91 implements ITrackApiFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Long, ITrackApi> instanceCache = new ConcurrentHashMap<>();

    @NotNull
    public abstract ITrackApi createTrackApi(long appId);

    @Override // com.oplus.drs.track.routing.ITrackApiFactory
    @NotNull
    public ITrackApi getInstance(long appId) {
        ConcurrentHashMap<Long, ITrackApi> concurrentHashMap = this.instanceCache;
        Long lValueOf = Long.valueOf(appId);
        ITrackApi iTrackApi = concurrentHashMap.get(lValueOf);
        if (iTrackApi == null) {
            ITrackApi iTrackApiCreateTrackApi = createTrackApi(appId);
            ITrackApi iTrackApiPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, iTrackApiCreateTrackApi);
            iTrackApi = iTrackApiPutIfAbsent == null ? iTrackApiCreateTrackApi : iTrackApiPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(iTrackApi, "instanceCache.getOrPut(a…TrackApi(appId)\n        }");
        return iTrackApi;
    }

    @Override // com.oplus.drs.track.routing.ITrackApiFactory
    @Nullable
    public ITrackApi getInstanceForApp() {
        long j2 = vb0.sAppModuleId;
        if (j2 == 0) {
            return null;
        }
        return getInstance(j2);
    }

    @Override // com.oplus.drs.track.routing.ITrackApiFactory
    public abstract void staticInit(@NotNull Context context, @NotNull af3 staticConfig);
}
