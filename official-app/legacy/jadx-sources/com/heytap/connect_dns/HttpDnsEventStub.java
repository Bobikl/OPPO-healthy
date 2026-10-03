package com.heytap.connect_dns;

import com.heytap.connect.api.logger.Logger;
import com.heytap.connect.config.ip.IDns;
import com.heytap.connect.config.ip.OnIpListCallback;
import com.oplus.aiunit.vision.i78;
import com.oplus.aiunit.vision.sx5;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/heytap/connect_dns/HttpDnsEventStub;", "Lcom/oplus/aiunit/vision/sx5;", "", "host", "dnUnit", "", "notifyDnUnitChange", "(Ljava/lang/String;Ljava/lang/String;)V", "", "hosts", "notifyWhiteListChange", "(Ljava/util/List;)V", "ips", "notifyIPListChange", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/heytap/connect/config/ip/IDns;", "dns", "Lcom/heytap/connect/config/ip/IDns;", "getDns", "()Lcom/heytap/connect/config/ip/IDns;", "Lcom/heytap/connect_dns/HttpDnsIpChangeCallBack;", "callBack", "Lcom/heytap/connect_dns/HttpDnsIpChangeCallBack;", "<init>", "(Lcom/heytap/connect/config/ip/IDns;Lcom/heytap/connect_dns/HttpDnsIpChangeCallBack;)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class HttpDnsEventStub implements sx5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isNotifyIPListChange;
    private static boolean isReceiveCommand;

    @Nullable
    private final HttpDnsIpChangeCallBack callBack;

    @Nullable
    private final IDns dns;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/heytap/connect_dns/HttpDnsEventStub$Companion;", "", "", "isReceiveCommand", "Z", "()Z", "setReceiveCommand", "(Z)V", "isNotifyIPListChange", "setNotifyIPListChange", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isNotifyIPListChange() {
            return HttpDnsEventStub.isNotifyIPListChange;
        }

        public final boolean isReceiveCommand() {
            return HttpDnsEventStub.isReceiveCommand;
        }

        public final void setNotifyIPListChange(boolean z) {
            HttpDnsEventStub.isNotifyIPListChange = z;
        }

        public final void setReceiveCommand(boolean z) {
            HttpDnsEventStub.isReceiveCommand = z;
        }
    }

    public HttpDnsEventStub(@Nullable IDns iDns, @Nullable HttpDnsIpChangeCallBack httpDnsIpChangeCallBack) {
        this.dns = iDns;
        this.callBack = httpDnsIpChangeCallBack;
        i78.INSTANCE.a(this);
    }

    @Nullable
    public final IDns getDns() {
        return this.dns;
    }

    public void notifyDnUnitChange(@NotNull String host, @NotNull String dnUnit) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(dnUnit, "dnUnit");
    }

    @Override // com.oplus.aiunit.vision.sx5
    public void notifyIPListChange(@NotNull String host, @NotNull List<String> ips) {
        IDns iDns;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ips, "ips");
        Logger.d$default(Logger.INSTANCE, HttpDnsHelper.INSTANCE.getTAG$connect_release(), "isReceiveCommand : " + isReceiveCommand + " isNotifyIPListChange : " + isNotifyIPListChange, null, null, 12, null);
        if (isReceiveCommand && isNotifyIPListChange && (iDns = this.dns) != null) {
            iDns.getDns(false, new OnIpListCallback() { // from class: com.heytap.connect_dns.HttpDnsEventStub.notifyIPListChange.1
                @Override // com.heytap.connect.config.ip.OnIpListCallback
                public void onIpListCallback() {
                    HttpDnsIpChangeCallBack httpDnsIpChangeCallBack = HttpDnsEventStub.this.callBack;
                    if (httpDnsIpChangeCallBack == null) {
                        return;
                    }
                    httpDnsIpChangeCallBack.notifyIPListChange();
                }
            });
        }
        isReceiveCommand = false;
        isNotifyIPListChange = false;
    }

    @Override // com.oplus.aiunit.vision.sx5
    public void notifyWhiteListChange(@NotNull List<String> hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
    }
}
