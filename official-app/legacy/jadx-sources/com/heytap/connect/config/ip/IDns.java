package com.heytap.connect.config.ip;

import com.heytap.connect.api.ConnectResult;
import com.heytap.connect_dns.HttpDnsInitalizedCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/heytap/connect/config/ip/IDns;", "", "Lcom/heytap/connect_dns/HttpDnsInitalizedCallback;", "callBack", "", "onAttach", "(Lcom/heytap/connect_dns/HttpDnsInitalizedCallback;)V", "", "needUse", "Lcom/heytap/connect/config/ip/OnIpListCallback;", "onIpListCallback", "getDns", "(ZLcom/heytap/connect/config/ip/OnIpListCallback;)V", "Lcom/heytap/connect/config/ip/IpInfo;", "currentIp", "()Lcom/heytap/connect/config/ip/IpInfo;", "nextIp", "", "ip", "Lcom/heytap/connect/api/ConnectResult;", "result", "notifyIpResult", "(Ljava/lang/String;Lcom/heytap/connect/api/ConnectResult;)V", "url", "gslbValue", "handleHttpDnsCommand", "(Ljava/lang/String;Ljava/lang/String;)V", "removeCurrentIp", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IDns {
    @Nullable
    IpInfo currentIp();

    void getDns(boolean needUse, @Nullable OnIpListCallback onIpListCallback);

    void handleHttpDnsCommand(@NotNull String url, @NotNull String gslbValue);

    @Nullable
    IpInfo nextIp();

    void notifyIpResult(@NotNull String ip, @NotNull ConnectResult result);

    void onAttach(@NotNull HttpDnsInitalizedCallback callBack);

    void removeCurrentIp();
}
