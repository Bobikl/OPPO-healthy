package com.heytap.nearx.cloudconfig.api;

import android.content.Context;
import com.heytap.nearx.cloudconfig.stat.TrackApi_20246;
import com.heytap.nearx.track.NearxTrackHelper;
import com.heytap.statistics.NearMeStatistics;
import com.heytap.statistics.event.CustomEvent;
import com.oplus.aiunit.vision.r7b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ<\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0002J,\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0002J<\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0016R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/DefaultStatisticHandler;", "Lcom/heytap/nearx/cloudconfig/api/StatisticHandler;", "Landroid/content/Context;", "context", "", "appId", "", "categoryId", "eventId", "", "map", "", "reportStatisticV1", "reportStatisticV2", "", "recordCustomEvent", "isV1Enable", "Z", "isV2Enable", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasRemind", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/oplus/aiunit/vision/r7b;", "logger", "Lcom/oplus/aiunit/vision/r7b;", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/r7b;)V", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class DefaultStatisticHandler implements StatisticHandler {
    private AtomicBoolean hasRemind;
    private boolean isV1Enable;
    private boolean isV2Enable;
    private final r7b logger;

    public DefaultStatisticHandler(@NotNull Context context, @NotNull r7b logger) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(logger, "logger");
        this.logger = logger;
        this.isV1Enable = true;
        this.isV2Enable = true;
        this.hasRemind = new AtomicBoolean(false);
    }

    private final boolean reportStatisticV1(Context context, int appId, String categoryId, String eventId, Map<String, String> map) {
        if (!this.isV1Enable) {
            return false;
        }
        try {
            NearMeStatistics.onBaseEvent(context, appId, new CustomEvent(categoryId, eventId, map));
        } catch (NoClassDefFoundError e2) {
            r7b.n(this.logger, "DefaultStatisticHandler", "b. 尝试使用统计上报库v1[com.android.statistics.v2:statistics]失败:数据未成功上报，库未接入", e2, null, 8, null);
            this.isV1Enable = false;
            return false;
        } catch (Throwable th) {
            r7b.n(this.logger, "DefaultStatisticHandler", "[v2:statistics]数据上报失败", th, null, 8, null);
        }
        return true;
    }

    private final boolean reportStatisticV2(String categoryId, String eventId, Map<String, String> map) {
        if (!this.isV2Enable) {
            return false;
        }
        try {
            if (!NearxTrackHelper.hasInit) {
                return false;
            }
            TrackApi_20246.NearxTrack nearxTrackObtain = TrackApi_20246.NearxTrack.obtain(categoryId, eventId);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                nearxTrackObtain.add(entry.getKey(), entry.getValue());
            }
            nearxTrackObtain.commit();
            return true;
        } catch (NoClassDefFoundError e2) {
            r7b.n(this.logger, "DefaultStatisticHandler", "a.尝试使用统计上报库v2[com.heytap.nearx:track]失败:数据未成功上报，库未接入", e2, null, 8, null);
            this.isV2Enable = false;
            return false;
        } catch (Throwable th) {
            r7b.n(this.logger, "DefaultStatisticHandler", "[nearx:track]数据上报失败", th, null, 8, null);
        }
    }

    @Override // com.heytap.nearx.cloudconfig.api.StatisticHandler
    public void recordCustomEvent(@NotNull Context context, int appId, @NotNull String categoryId, @NotNull String eventId, @NotNull Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(categoryId, "categoryId");
        Intrinsics.checkParameterIsNotNull(eventId, "eventId");
        Intrinsics.checkParameterIsNotNull(map, "map");
        if (reportStatisticV2(categoryId, eventId, map) || reportStatisticV1(context, appId, categoryId, eventId, map)) {
            return;
        }
        r7b.d(this.logger, "DefaultStatisticHandler", "统计上报库未接入->强烈建议引入统计上报，用以分析各项数据指标。", null, null, 12, null);
        if (this.hasRemind.compareAndSet(false, true)) {
            if (this.isV2Enable) {
                r7b.d(this.logger, "DefaultStatisticHandler", "使用统计 V1.0 增加下方依赖即可：\n    implementation('com.android.statistics.v2:statistics:5.4.13')", null, null, 12, null);
            } else {
                r7b.d(this.logger, "DefaultStatisticHandler", "使用统计 V2.0 增加下方依赖即可：\n    implementation 'com.heytap.nearx:track:1.0.8'\n    implementation 'androidx.annotation:annotation:1.1.0'", null, null, 12, null);
            }
        }
    }
}
