package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.statistics.NearMeStatistics;
import com.heytap.statistics.event.CustomEvent;
import io.netty.util.internal.StringUtil;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/jsk;", "Lcom/oplus/aiunit/vision/b4k;", "", "appId", "", "categoryId", "eventId", "", "c", "Landroid/content/Context;", "b", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/r7b;", "Lcom/oplus/aiunit/vision/r7b;", "logger", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/r7b;)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class jsk extends b4k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final r7b logger;

    public jsk(@NotNull Context context, @NotNull r7b logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.logger = logger;
    }

    @Override // com.oplus.aiunit.vision.b4k
    public void c(int appId, @NotNull String categoryId, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Map<String, String> mapB = b();
        if (mapB == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        }
        String string = new JSONObject(mapB).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(data as Map<*, *>).toString()");
        String strA = c4k.a(string);
        r7b.b(this.logger, "TrackAdapter", "V1TrackAdapter.track " + strA, null, null, 12, null);
        if (b4k.isDebug && Intrinsics.areEqual(String.valueOf(20214L), String.valueOf(appId))) {
            rd7.b(rd7.STATISTIC_20214_FILE_PATH, "eventID:" + eventId + StringUtil.SPACE + strA);
        }
        NearMeStatistics.onBaseEvent(this.context, appId, new CustomEvent(categoryId, eventId, b()));
    }
}
