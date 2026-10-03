package com.oplus.aiunit.vision;

import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b;
import java.nio.channels.Selector;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H&¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/spj;", "", "", "host", "", "port", "", "socketID", "Ljava/nio/channels/Selector;", "selector", "Lcom/oppo/bluetooth/btnet/bluetoothproxyserver/server/b;", "server", "Lcom/oplus/aiunit/vision/cyg;", "session", "transportType", "Lcom/oppo/bluetooth/btnet/bluetoothproxyserver/server/a;", "a", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public interface spj {
    @NotNull
    a a(@NotNull String host, int port, long socketID, @NotNull Selector selector, @NotNull b server, @NotNull cyg session, int transportType);
}
