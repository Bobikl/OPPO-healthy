package com.heytap.connect_dns.request;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/connect_dns/request/DnsHost;", "", "", "HOST_DNS_DEV", "Ljava/lang/String;", "getHOST_DNS_DEV", "()Ljava/lang/String;", "HOST_DNS", "getHOST_DNS", "HTTPDNS_PATH_GET", "getHTTPDNS_PATH_GET", "HTTPDNS_PATH_GET_SET_AND_IP", "getHTTPDNS_PATH_GET_SET_AND_IP", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class DnsHost {

    @NotNull
    public static final DnsHost INSTANCE = new DnsHost();

    @NotNull
    private static final String HOST_DNS = "http://apisnd.heytapmobi.com";

    @NotNull
    private static final String HOST_DNS_DEV = "http://apisnd-test.wanyol.com";

    @NotNull
    private static final String HTTPDNS_PATH_GET = "/httpdns/get";

    @NotNull
    private static final String HTTPDNS_PATH_GET_SET_AND_IP = "/d";

    private DnsHost() {
    }

    @NotNull
    public final String getHOST_DNS() {
        return HOST_DNS;
    }

    @NotNull
    public final String getHOST_DNS_DEV() {
        return HOST_DNS_DEV;
    }

    @NotNull
    public final String getHTTPDNS_PATH_GET() {
        return HTTPDNS_PATH_GET;
    }

    @NotNull
    public final String getHTTPDNS_PATH_GET_SET_AND_IP() {
        return HTTPDNS_PATH_GET_SET_AND_IP;
    }
}
