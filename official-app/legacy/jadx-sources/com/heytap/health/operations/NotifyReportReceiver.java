package com.heytap.health.operations;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.heytap.health.base.track.NxTrackHelper;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.mzj;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/health/operations/NotifyReportReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "Companion", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
public class NotifyReportReceiver extends BroadcastReceiver {

    @NotNull
    public static final String ACTION_NOTIFICATION_DELETE = "com.heytap.health.operation.action_notification_delete";

    @NotNull
    public static final String EXTRA_INTENT_CLASS = "intentClass";

    @NotNull
    public static final String EXTRA_PUSH_TITLE = "pushTitle";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, ACTION_NOTIFICATION_DELETE)) {
            String stringExtra = intent.getStringExtra(EXTRA_PUSH_TITLE);
            a7b.f("NotifyReportReceiver", "report notify clear");
            Map<String, Object> mapOf = NxTrackHelper.K(ClickApiEntity.TIME, mzj.d(System.currentTimeMillis()));
            Intrinsics.checkNotNullExpressionValue(mapOf, "mapOf");
            mapOf.put("elementid", stringExtra);
            NxTrackHelper.S(mapOf);
        }
    }
}
