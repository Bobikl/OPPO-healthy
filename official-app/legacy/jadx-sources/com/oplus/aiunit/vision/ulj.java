package com.oplus.aiunit.vision;

import java.nio.channels.Selector;
import org.hapjs.card.api.debug.CardDebugController;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H&¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/ulj;", "", "", "host", "", "port", "", "socketID", "Ljava/nio/channels/Selector;", "selector", "Lcom/oppo/bluetooth/btnet/bluetoothproxyserver/server/b;", CardDebugController.EXTRA_SERVER, "Lcom/oplus/aiunit/vision/mug;", "session", "transportType", "Lcom/oppo/bluetooth/btnet/bluetoothproxyserver/server/a;", "a", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public interface ulj {
    @NotNull
    com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a a(@NotNull String host, int port, long socketID, @NotNull Selector selector, @NotNull com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b server, @NotNull mug session, int transportType);
}
