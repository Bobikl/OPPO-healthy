package com.heytap.health.watch.calendar.colorconnect.client;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.watch.calendar.manager.CalSyncDispatcher;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/calendar/CalendarMessageReceiver")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/health/watch/calendar/colorconnect/client/CalendarMessageReceiver;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "", "onMessageReceived", "<init>", "()V", "Companion", "a", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CalendarMessageReceiver extends DMIMessageHandler {

    @NotNull
    public static final String TAG = "CalHealth.CalendarMessageReceiver";

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(@NotNull String nodeId, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        CalSyncDispatcher.INSTANCE.k(nodeId, messageEvent);
    }
}
