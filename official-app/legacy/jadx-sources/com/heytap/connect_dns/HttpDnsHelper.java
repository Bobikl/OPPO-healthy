package com.heytap.connect_dns;

import com.heytap.connect.api.ConnectResult;
import com.heytap.connect.api.logger.Logger;
import com.heytap.connect.api.request.IHttpClient;
import com.heytap.connect.config.executor.ExecutorFactory;
import com.heytap.connect_dns.HttpDnsHelper;
import com.heytap.httpdns.webkit.extension.util.DnsEnv;
import com.heytap.httpdns.webkit.extension.util.DnsLogLevel;
import com.oplus.aiunit.vision.DnsInfo;
import com.oplus.aiunit.vision.qt2;
import com.oplus.aiunit.vision.rj9;
import com.oplus.aiunit.vision.xt3;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00068\u0000X\u0080D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/heytap/connect_dns/HttpDnsHelper;", "", "Lcom/heytap/connect_dns/IpInfo;", "Ljava/net/InetAddress;", "createAddressSocket", "(Lcom/heytap/connect_dns/IpInfo;)Ljava/net/InetAddress;", "", "heyTapId", "region", "Lcom/heytap/connect_dns/HttpDnsInitalizedCallback;", "callBack", "", "init", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/connect_dns/HttpDnsInitalizedCallback;)V", "host", "", "getDnsList$connect_release", "(Ljava/lang/String;)Ljava/util/List;", "getDnsList", "", "dnsPort", "(Ljava/lang/String;I)Ljava/util/List;", "url", "ip", "Lcom/heytap/connect/api/ConnectResult;", "result", "reportDnsResult$connect_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/connect/api/ConnectResult;)V", "reportDnsResult", "TAG", "Ljava/lang/String;", "getTAG$connect_release", "()Ljava/lang/String;", "", "isInitFinished", "Z", "()Z", "setInitFinished", "(Z)V", "isCallInit", "setCallInit", "Ljava/util/concurrent/CopyOnWriteArrayList;", "callBacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getCallBacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "setCallBacks", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "Lcom/oplus/aiunit/vision/rj9;", "httpDns", "Lcom/oplus/aiunit/vision/rj9;", "getHttpDns", "()Lcom/oplus/aiunit/vision/rj9;", "setHttpDns", "(Lcom/oplus/aiunit/vision/rj9;)V", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class HttpDnsHelper {

    @NotNull
    public static final HttpDnsHelper INSTANCE = new HttpDnsHelper();

    @NotNull
    private static final String TAG = "HttpDnsHelper";

    @NotNull
    private static CopyOnWriteArrayList<HttpDnsInitalizedCallback> callBacks = new CopyOnWriteArrayList<>();

    @Nullable
    private static rj9 httpDns;
    private static boolean isCallInit;
    private static boolean isInitFinished;

    private HttpDnsHelper() {
    }

    private final InetAddress createAddressSocket(IpInfo ipInfo) {
        InetAddress byName;
        try {
            if (!UtilKt.isIpv4(ipInfo.getIp())) {
                if (UtilKt.isValidIpv6(ipInfo.getIp())) {
                    byName = InetAddress.getByName(ipInfo.getIp());
                }
                return ipInfo.getInetAddress();
            }
            byName = InetAddress.getByAddress(ipInfo.getHost(), UtilKt.textToByteV4(ipInfo.getIp()));
            ipInfo.setInetAddress(byName);
            return ipInfo.getInetAddress();
        } catch (UnknownHostException unused) {
            Logger.e$default(Logger.INSTANCE, TAG, Intrinsics.stringPlus("create inetAddress fail ", ipInfo.getIp()), null, null, 12, null);
            return null;
        }
    }

    public static /* synthetic */ void init$default(HttpDnsHelper httpDnsHelper, String str, String str2, HttpDnsInitalizedCallback httpDnsInitalizedCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        httpDnsHelper.init(str, str2, httpDnsInitalizedCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x003e A[LOOP:0: B:10:0x0038->B:12:0x003e, LOOP_END] */
    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    public static final void m4610init$lambda1(boolean z, rj9 rj9Var, String str) {
        Logger logger;
        String tAG$connect_release;
        String strStringPlus;
        Iterator<HttpDnsInitalizedCallback> it;
        if (z) {
            HttpDnsHelper httpDnsHelper = INSTANCE;
            httpDnsHelper.setInitFinished(true);
            if (rj9Var != null) {
                httpDnsHelper.setHttpDns(rj9Var);
                logger = Logger.INSTANCE;
                tAG$connect_release = httpDnsHelper.getTAG$connect_release();
                strStringPlus = "HttpDNSRequestCallBack success";
            }
            it = INSTANCE.getCallBacks().iterator();
            while (it.hasNext()) {
                it.next().onHttpDnsInitalized();
            }
            INSTANCE.getCallBacks().clear();
        }
        logger = Logger.INSTANCE;
        tAG$connect_release = INSTANCE.getTAG$connect_release();
        strStringPlus = Intrinsics.stringPlus("HttpDNSRequestCallBack fail, error is ", str);
        Logger.d$default(logger, tAG$connect_release, strStringPlus, null, null, 12, null);
        it = INSTANCE.getCallBacks().iterator();
        while (it.hasNext()) {
            it.next().onHttpDnsInitalized();
        }
        INSTANCE.getCallBacks().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reportDnsResult$lambda-6, reason: not valid java name */
    public static final void m4611reportDnsResult$lambda6(ConnectResult result, String url, String ip) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(ip, "$ip");
        int i = result.result() == 2 ? 200 : 501;
        rj9 httpDns2 = INSTANCE.getHttpDns();
        if (httpDns2 == null) {
            return;
        }
        httpDns2.e(url, ip, i, MapsKt__MapsKt.emptyMap());
    }

    @NotNull
    public final CopyOnWriteArrayList<HttpDnsInitalizedCallback> getCallBacks() {
        return callBacks;
    }

    @Nullable
    public final List<IpInfo> getDnsList$connect_release(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        rj9 rj9Var = httpDns;
        List<DnsInfo> listC = rj9Var == null ? null : rj9Var.c(host);
        if (listC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listC, 10));
        for (DnsInfo dnsInfo : listC) {
            ArrayList arrayList2 = arrayList;
            IpInfo ipInfo = new IpInfo(host, dnsInfo.getTtl(), null, dnsInfo.getIp(), dnsInfo.getPort(), dnsInfo.getWeight(), null, 0, 0L, null, 0L, null, 0L, 8132, null);
            INSTANCE.createAddressSocket(ipInfo);
            arrayList2.add(ipInfo);
            arrayList = arrayList2;
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
    }

    @Nullable
    public final rj9 getHttpDns() {
        return httpDns;
    }

    @NotNull
    public final String getTAG$connect_release() {
        return TAG;
    }

    public final void init(@NotNull String heyTapId, @Nullable String region, @NotNull HttpDnsInitalizedCallback callBack) {
        Intrinsics.checkNotNullParameter(heyTapId, "heyTapId");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Logger logger = Logger.INSTANCE;
        String str = TAG;
        Logger.d$default(logger, str, "HttpDnsHelper init", null, null, 12, null);
        if (isInitFinished) {
            Logger.d$default(logger, str, "HttpDnsHelper had init.", null, null, 12, null);
            callBack.onHttpDnsInitalized();
            return;
        }
        callBacks.add(callBack);
        if (isCallInit) {
            return;
        }
        boolean z = true;
        isCallInit = true;
        xt3.b bVarQ = new xt3.b().q(new DefaultRequestHandler(IHttpClient.INSTANCE.getDEFAULT()));
        if (region != null && region.length() != 0) {
            z = false;
        }
        if (z) {
            region = "CN";
        }
        rj9.b(ContextHolder.INSTANCE.getContext().getApplicationContext(), bVarQ.p(region).l(DnsEnv.RELEASE).o(DnsLogLevel.LEVEL_DEBUG).n(new LogHook()).m(heyTapId).k(), new qt2() { // from class: com.oplus.aiunit.vision.pj9
            @Override // com.oplus.aiunit.vision.qt2
            public final void a(boolean z2, rj9 rj9Var, String str2) {
                HttpDnsHelper.m4610init$lambda1(z2, rj9Var, str2);
            }
        });
    }

    public final boolean isCallInit() {
        return isCallInit;
    }

    public final boolean isInitFinished() {
        return isInitFinished;
    }

    public final void reportDnsResult$connect_release(@NotNull final String url, @NotNull final String ip, @NotNull final ConnectResult result) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(result, "result");
        if (url.length() == 0) {
            return;
        }
        ExecutorFactory.INSTANCE.getDEFAULT().coreExecutor().execute(new Runnable() { // from class: com.oplus.aiunit.vision.oj9
            @Override // java.lang.Runnable
            public final void run() {
                HttpDnsHelper.m4611reportDnsResult$lambda6(result, url, ip);
            }
        });
    }

    public final void setCallBacks(@NotNull CopyOnWriteArrayList<HttpDnsInitalizedCallback> copyOnWriteArrayList) {
        Intrinsics.checkNotNullParameter(copyOnWriteArrayList, "<set-?>");
        callBacks = copyOnWriteArrayList;
    }

    public final void setCallInit(boolean z) {
        isCallInit = z;
    }

    public final void setHttpDns(@Nullable rj9 rj9Var) {
        httpDns = rj9Var;
    }

    public final void setInitFinished(boolean z) {
        isInitFinished = z;
    }

    @Nullable
    public final List<IpInfo> getDnsList$connect_release(@NotNull String host, int dnsPort) {
        Intrinsics.checkNotNullParameter(host, "host");
        Logger.d$default(Logger.INSTANCE, TAG, Intrinsics.stringPlus("dnsPort : ", Integer.valueOf(dnsPort)), null, null, 12, null);
        rj9 rj9Var = httpDns;
        List<DnsInfo> listD = rj9Var == null ? null : rj9Var.d(host, dnsPort);
        if (listD == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD, 10));
        for (DnsInfo dnsInfo : listD) {
            ArrayList arrayList2 = arrayList;
            IpInfo ipInfo = new IpInfo(host, dnsInfo.getTtl(), null, dnsInfo.getIp(), dnsInfo.getPort(), dnsInfo.getWeight(), null, 0, 0L, null, 0L, null, 0L, 8132, null);
            INSTANCE.createAddressSocket(ipInfo);
            arrayList2.add(ipInfo);
            arrayList = arrayList2;
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
    }
}
