package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.nearx.taphttp.statitics.HttpStatHelper;
import com.heytap.statistics.NearMeStatistics;
import com.heytap.statistics.event.CustomEvent;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/oni;", "", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/r7b;", "logger", "", "", "map", "eventId", "", "a", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class oni {
    public static final oni INSTANCE = new oni();

    public final boolean a(@NotNull Context context, @NotNull r7b logger, @NotNull Map<String, String> map, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        try {
            NearMeStatistics.onBaseEvent(context, HttpStatHelper.APP_CODE, new CustomEvent("10000", eventId, map));
            r7b.l(logger, HttpStatHelper.TAG, "统计数据已通过1.0上报", null, null, 12, null);
            return true;
        } catch (Exception unused) {
            return true;
        } catch (Throwable th) {
            return true ^ (th instanceof NoClassDefFoundError);
        }
    }
}
