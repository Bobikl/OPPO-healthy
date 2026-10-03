package com.heytap.health.rpc.host;

import com.heytap.health.rpc.RpcMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.health.rpc.host.b, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/rpc/host/b;", "", "", "c", "d", "b", "", "toString", "", "hashCode", "other", "equals", "a", "I", "getCode", "()I", "setCode", "(I)V", "code", "Lcom/heytap/health/rpc/RpcMsg;", "Lcom/heytap/health/rpc/RpcMsg;", "()Lcom/heytap/health/rpc/RpcMsg;", "setRspMsg", "(Lcom/heytap/health/rpc/RpcMsg;)V", "rspMsg", "<init>", "(ILcom/heytap/health/rpc/RpcMsg;)V", "Companion", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RespMsgResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int RESULT_FAIL = 1;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_TIMEOUT = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public RpcMsg rspMsg;

    /* JADX INFO: renamed from: com.heytap.health.rpc.host.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/rpc/host/b$a;", "", "Lcom/heytap/health/rpc/host/b;", "c", "a", "Lcom/heytap/health/rpc/RpcMsg;", "respMsg", "b", "", "RESULT_FAIL", "I", "RESULT_SUCCESS", "RESULT_TIMEOUT", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RespMsgResult a() {
            return new RespMsgResult(1, null);
        }

        @NotNull
        public final RespMsgResult b(@NotNull RpcMsg respMsg) {
            Intrinsics.checkNotNullParameter(respMsg, "respMsg");
            return new RespMsgResult(0, respMsg);
        }

        @NotNull
        public final RespMsgResult c() {
            return new RespMsgResult(2, null);
        }
    }

    public RespMsgResult(int i, @Nullable RpcMsg rpcMsg) {
        this.code = i;
        this.rspMsg = rpcMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final RpcMsg getRspMsg() {
        return this.rspMsg;
    }

    public final boolean b() {
        return this.code == 1;
    }

    public final boolean c() {
        return this.code == 0;
    }

    public final boolean d() {
        return this.code == 2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RespMsgResult)) {
            return false;
        }
        RespMsgResult respMsgResult = (RespMsgResult) other;
        return this.code == respMsgResult.code && Intrinsics.areEqual(this.rspMsg, respMsgResult.rspMsg);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        RpcMsg rpcMsg = this.rspMsg;
        return iHashCode + (rpcMsg == null ? 0 : rpcMsg.hashCode());
    }

    @NotNull
    public String toString() {
        return "RespMsgResult(code=" + this.code + ", rspMsg=" + this.rspMsg + ")";
    }
}
