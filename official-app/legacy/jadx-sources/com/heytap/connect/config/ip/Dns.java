package com.heytap.connect.config.ip;

import com.heytap.connect.api.ConnectResult;
import com.heytap.connect_dns.HttpDnsInitalizedCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0018\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010!\u001a\u00020 8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/heytap/connect/config/ip/Dns;", "Lcom/heytap/connect/config/ip/IDns;", "", "removeCurrentIp", "()V", "", "url", "gslbValue", "handleHttpDnsCommand", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/heytap/connect_dns/HttpDnsInitalizedCallback;", "callBack", "onAttach", "(Lcom/heytap/connect_dns/HttpDnsInitalizedCallback;)V", "", "needUse", "Lcom/heytap/connect/config/ip/OnIpListCallback;", "onIpListCallback", "getDns", "(ZLcom/heytap/connect/config/ip/OnIpListCallback;)V", "Lcom/heytap/connect/config/ip/IpInfo;", "currentIp", "()Lcom/heytap/connect/config/ip/IpInfo;", "nextIp", "ip", "Lcom/heytap/connect/api/ConnectResult;", "result", "notifyIpResult", "(Ljava/lang/String;Lcom/heytap/connect/api/ConnectResult;)V", "Ljava/lang/String;", "getIp", "()Ljava/lang/String;", "", "port", "I", "getPort", "()I", "<init>", "(Ljava/lang/String;I)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class Dns implements IDns {

    @NotNull
    private final String ip;
    private final int port;

    public Dns(@NotNull String ip, int i) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.ip = ip;
        this.port = i;
    }

    @Override // com.heytap.connect.config.ip.IDns
    @Nullable
    public IpInfo currentIp() {
        return new IpInfo(this.ip, this.port, 0L, 0, null, 0L, 60, null);
    }

    @Override // com.heytap.connect.config.ip.IDns
    public void getDns(boolean needUse, @Nullable OnIpListCallback onIpListCallback) {
        if (onIpListCallback == null) {
            return;
        }
        onIpListCallback.onIpListCallback();
    }

    @NotNull
    public final String getIp() {
        return this.ip;
    }

    public final int getPort() {
        return this.port;
    }

    @Override // com.heytap.connect.config.ip.IDns
    public void handleHttpDnsCommand(@NotNull String url, @NotNull String gslbValue) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(gslbValue, "gslbValue");
    }

    @Override // com.heytap.connect.config.ip.IDns
    @Nullable
    public IpInfo nextIp() {
        return null;
    }

    @Override // com.heytap.connect.config.ip.IDns
    public void notifyIpResult(@NotNull String ip, @NotNull ConnectResult result) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // com.heytap.connect.config.ip.IDns
    public void onAttach(@NotNull HttpDnsInitalizedCallback callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        callBack.onHttpDnsInitalized();
    }

    @Override // com.heytap.connect.config.ip.IDns
    public void removeCurrentIp() {
    }
}
