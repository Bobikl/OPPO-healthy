package com.heytap.connect.config.connectid;

import com.heytap.connect.TapConnectClient;
import com.heytap.connect.config.TapConnectConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/connect/config/connectid/IConnectId;", "", "Lcom/heytap/connect/TapConnectClient;", "client", "Lcom/heytap/connect/config/TapConnectConfig;", "tapConnectConfig", "", "onAttach", "(Lcom/heytap/connect/TapConnectClient;Lcom/heytap/connect/config/TapConnectConfig;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IConnectId {
    void onAttach(@NotNull TapConnectClient client, @Nullable TapConnectConfig tapConnectConfig);
}
