package com.heytap.health.rpc.host;

import com.heytap.health.rpc.RpcMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/rpc/host/RpcMsgApiImpl;", "Lcom/heytap/health/rpc/host/IRpcMsgApi$Stub;", "()V", "RPC_MSG_AIDL_API", "", "addMsgListener", "", "listener", "Lcom/heytap/health/rpc/host/RpcMsgListener;", "removeMsgListener", "sendMsg", "appId", "", "msg", "Lcom/heytap/health/rpc/RpcMsg;", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RpcMsgApiImpl extends IRpcMsgApi.Stub {

    @NotNull
    public static final RpcMsgApiImpl INSTANCE = new RpcMsgApiImpl();

    @NotNull
    public static final String RPC_MSG_AIDL_API = "rpc_msg_aidl_api";

    private RpcMsgApiImpl() {
    }

    @Override // com.heytap.health.rpc.host.IRpcMsgApi
    public void addMsgListener(@Nullable RpcMsgListener listener) {
        if (listener == null) {
            return;
        }
        d.INSTANCE.e(listener);
    }

    @Override // com.heytap.health.rpc.host.IRpcMsgApi
    public void removeMsgListener(@Nullable RpcMsgListener listener) {
        if (listener == null) {
            return;
        }
        d.INSTANCE.l(listener);
    }

    @Override // com.heytap.health.rpc.host.IRpcMsgApi
    public void sendMsg(int appId, @Nullable RpcMsg msg) {
        if (msg == null) {
            return;
        }
        d.INSTANCE.m(appId, msg);
    }
}
