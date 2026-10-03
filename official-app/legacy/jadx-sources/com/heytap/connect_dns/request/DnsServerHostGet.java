package com.heytap.connect_dns.request;

import com.heytap.connect.Env;
import com.heytap.connect_dns.UrlInfo;
import com.heytap.connect_dns.UtilKt;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.jla;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000  2\u00020\u0001:\u0003! \"B\u0019\b\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0019\u001a\u00020\r8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/heytap/connect_dns/request/DnsServerHostGet;", "", "Lcom/heytap/connect/Env;", "", "isRegionCN", "(Lcom/heytap/connect/Env;)Z", "isReleaseEnv", "", "Lcom/heytap/connect_dns/request/ServerHostInfo;", "getHostListInner", "()Ljava/util/List;", "hostInfo", "", "", "createRealHost", "(Lcom/heytap/connect_dns/request/ServerHostInfo;)[Ljava/lang/String;", "presetHost$delegate", "Lkotlin/Lazy;", "getPresetHost", "()Ljava/lang/String;", "presetHost", "Lcom/heytap/connect_dns/request/DnsServerHostGet$HostContainer;", "hostsGet", "Lcom/heytap/connect_dns/request/DnsServerHostGet$HostContainer;", "getLastHostInner", "lastHostInner", HttpConst.SERVER_ENV, "Lcom/heytap/connect/Env;", "getEnv", "()Lcom/heytap/connect/Env;", "<init>", "(Lcom/heytap/connect/Env;Lcom/heytap/connect_dns/request/DnsServerHostGet$HostContainer;)V", "Companion", "Builder", "HostContainer", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class DnsServerHostGet {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Env env;

    @NotNull
    private final HostContainer hostsGet;

    /* JADX INFO: renamed from: presetHost$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy presetHost;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010\n\u001a\u00020\u00002)\u0010\t\u001a%\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0002¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002)\u0010\t\u001a%\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/heytap/connect_dns/request/DnsServerHostGet$Builder;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "preHost", "", "Lcom/heytap/connect_dns/request/ServerHostInfo;", "hostListCall", "setDomainIPList", "(Lkotlin/jvm/functions/Function1;)Lcom/heytap/connect_dns/request/DnsServerHostGet$Builder;", "setDomainIpListForeign", "Lkotlin/Function0;", "lastHost", "setDomainHost", "(Lkotlin/jvm/functions/Function0;)Lcom/heytap/connect_dns/request/DnsServerHostGet$Builder;", "setDomainHostForeign", "setDomainHostTest", "Lcom/heytap/connect_dns/request/DnsServerHostGet;", jla.DEFAULT_BUILD_METHOD, "()Lcom/heytap/connect_dns/request/DnsServerHostGet;", "Lcom/heytap/connect/Env;", HttpConst.SERVER_ENV, "Lcom/heytap/connect/Env;", "getEnv", "()Lcom/heytap/connect/Env;", "Lcom/heytap/connect_dns/request/DnsServerHostGet$HostContainer;", "container", "Lcom/heytap/connect_dns/request/DnsServerHostGet$HostContainer;", "<init>", "(Lcom/heytap/connect/Env;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        @NotNull
        private final HostContainer container;

        @NotNull
        private final Env env;

        public Builder(@NotNull Env env) {
            Intrinsics.checkNotNullParameter(env, "env");
            this.env = env;
            this.container = new HostContainer();
        }

        @NotNull
        public final DnsServerHostGet build() {
            return new DnsServerHostGet(this.env, this.container, null);
        }

        @NotNull
        public final Env getEnv() {
            return this.env;
        }

        @NotNull
        public final Builder setDomainHost(@NotNull Function0<String> lastHost) {
            Intrinsics.checkNotNullParameter(lastHost, "lastHost");
            this.container.setLastHost(lastHost);
            return this;
        }

        @NotNull
        public final Builder setDomainHostForeign(@NotNull Function0<String> lastHost) {
            Intrinsics.checkNotNullParameter(lastHost, "lastHost");
            this.container.setLastHostForeign(lastHost);
            return this;
        }

        @NotNull
        public final Builder setDomainHostTest(@NotNull Function0<String> lastHost) {
            Intrinsics.checkNotNullParameter(lastHost, "lastHost");
            this.container.setLastHostTest(lastHost);
            return this;
        }

        @NotNull
        public final Builder setDomainIPList(@NotNull Function1<? super String, ? extends List<ServerHostInfo>> hostListCall) {
            Intrinsics.checkNotNullParameter(hostListCall, "hostListCall");
            this.container.setHostListGet(hostListCall);
            return this;
        }

        @NotNull
        public final Builder setDomainIpListForeign(@NotNull Function1<? super String, ? extends List<ServerHostInfo>> hostListCall) {
            Intrinsics.checkNotNullParameter(hostListCall, "hostListCall");
            this.container.setHostForeignListGet(hostListCall);
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/connect_dns/request/DnsServerHostGet$Companion;", "", "Lcom/heytap/connect/Env;", HttpConst.SERVER_ENV, "Lcom/heytap/connect_dns/request/DnsServerHostGet;", "extDnsServerHost", "(Lcom/heytap/connect/Env;)Lcom/heytap/connect_dns/request/DnsServerHostGet;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                Env.valuesCustom();
                int[] iArr = new int[3];
                iArr[Env.DEV.ordinal()] = 1;
                iArr[Env.TEST.ordinal()] = 2;
                iArr[Env.RELEASE.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DnsServerHostGet extDnsServerHost(@NotNull Env env) {
            Intrinsics.checkNotNullParameter(env, "env");
            int iOrdinal = env.ordinal();
            final String host_dns = (iOrdinal == 0 || !(iOrdinal == 1 || iOrdinal == 2)) ? DnsHost.INSTANCE.getHOST_DNS() : DnsHost.INSTANCE.getHOST_DNS_DEV();
            return new Builder(env).setDomainIpListForeign(new Function1<String, List<? extends ServerHostInfo>>() { // from class: com.heytap.connect_dns.request.DnsServerHostGet$Companion$extDnsServerHost$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final List<ServerHostInfo> invoke(@Nullable String str) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
            }).setDomainIPList(new Function1<String, List<? extends ServerHostInfo>>() { // from class: com.heytap.connect_dns.request.DnsServerHostGet$Companion$extDnsServerHost$2
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final List<ServerHostInfo> invoke(@Nullable String str) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
            }).setDomainHostTest(new Function0<String>() { // from class: com.heytap.connect_dns.request.DnsServerHostGet$Companion$extDnsServerHost$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return host_dns;
                }
            }).setDomainHost(new Function0<String>() { // from class: com.heytap.connect_dns.request.DnsServerHostGet$Companion$extDnsServerHost$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return host_dns;
                }
            }).setDomainHostForeign(new Function0<String>() { // from class: com.heytap.connect_dns.request.DnsServerHostGet$Companion$extDnsServerHost$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return host_dns;
                }
            }).build();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tRG\u0010\u0013\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tRG\u0010\u001c\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Lcom/heytap/connect_dns/request/DnsServerHostGet$HostContainer;", "", "Lkotlin/Function0;", "", "lastHostTest", "Lkotlin/jvm/functions/Function0;", "getLastHostTest", "()Lkotlin/jvm/functions/Function0;", "setLastHostTest", "(Lkotlin/jvm/functions/Function0;)V", "lastHostForeign", "getLastHostForeign", "setLastHostForeign", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "preHost", "", "Lcom/heytap/connect_dns/request/ServerHostInfo;", "hostListGet", "Lkotlin/jvm/functions/Function1;", "getHostListGet", "()Lkotlin/jvm/functions/Function1;", "setHostListGet", "(Lkotlin/jvm/functions/Function1;)V", "lastHost", "getLastHost", "setLastHost", "hostForeignListGet", "getHostForeignListGet", "setHostForeignListGet", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class HostContainer {

        @Nullable
        private Function1<? super String, ? extends List<ServerHostInfo>> hostForeignListGet;

        @Nullable
        private Function1<? super String, ? extends List<ServerHostInfo>> hostListGet;

        @Nullable
        private Function0<String> lastHost;

        @Nullable
        private Function0<String> lastHostForeign;

        @Nullable
        private Function0<String> lastHostTest;

        @Nullable
        public final Function1<String, List<ServerHostInfo>> getHostForeignListGet() {
            return this.hostForeignListGet;
        }

        @Nullable
        public final Function1<String, List<ServerHostInfo>> getHostListGet() {
            return this.hostListGet;
        }

        @Nullable
        public final Function0<String> getLastHost() {
            return this.lastHost;
        }

        @Nullable
        public final Function0<String> getLastHostForeign() {
            return this.lastHostForeign;
        }

        @Nullable
        public final Function0<String> getLastHostTest() {
            return this.lastHostTest;
        }

        public final void setHostForeignListGet(@Nullable Function1<? super String, ? extends List<ServerHostInfo>> function1) {
            this.hostForeignListGet = function1;
        }

        public final void setHostListGet(@Nullable Function1<? super String, ? extends List<ServerHostInfo>> function1) {
            this.hostListGet = function1;
        }

        public final void setLastHost(@Nullable Function0<String> function0) {
            this.lastHost = function0;
        }

        public final void setLastHostForeign(@Nullable Function0<String> function0) {
            this.lastHostForeign = function0;
        }

        public final void setLastHostTest(@Nullable Function0<String> function0) {
            this.lastHostTest = function0;
        }
    }

    private DnsServerHostGet(Env env, HostContainer hostContainer) {
        this.env = env;
        this.hostsGet = hostContainer;
        this.presetHost = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.connect_dns.request.DnsServerHostGet$presetHost$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                DnsServerHostGet dnsServerHostGet = this.this$0;
                return dnsServerHostGet.isReleaseEnv(dnsServerHostGet.getEnv()) ? DnsHost.INSTANCE.getHOST_DNS() : DnsHost.INSTANCE.getHOST_DNS_DEV();
            }
        });
    }

    private final String getPresetHost() {
        return (String) this.presetHost.getValue();
    }

    private final boolean isRegionCN(Env env) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isReleaseEnv(Env env) {
        return env == Env.RELEASE;
    }

    @Nullable
    public final String[] createRealHost(@Nullable ServerHostInfo hostInfo) {
        String host;
        if (UtilKt.m4612default((hostInfo == null || (host = hostInfo.getHost()) == null) ? null : Integer.valueOf(host.length())) == 0) {
            return null;
        }
        Intrinsics.checkNotNull(hostInfo);
        if (!UtilKt.isValidIP(hostInfo.getHost())) {
            return new String[]{((Object) hostInfo.getScheme()) + "://" + ((Object) hostInfo.getHost())};
        }
        UrlInfo urlInfo = IUrlParse.INSTANCE.getDEFAULT().parse(hostInfo.getPresetHost());
        if (urlInfo == null) {
            throw new RuntimeException("IUrlParse service must be register");
        }
        String[] strArr = new String[2];
        StringBuilder sb = new StringBuilder();
        sb.append((Object) hostInfo.getScheme());
        sb.append("://");
        sb.append((Object) hostInfo.getHost());
        sb.append(':');
        sb.append(Intrinsics.areEqual(Const.Scheme.SCHEME_HTTPS, hostInfo.getScheme()) ? 443 : 80);
        strArr[0] = sb.toString();
        strArr[1] = UtilKt.m4613default(urlInfo.getHost());
        return strArr;
    }

    @NotNull
    public final Env getEnv() {
        return this.env;
    }

    @NotNull
    public final List<ServerHostInfo> getHostListInner() {
        Function1<String, List<ServerHostInfo>> hostForeignListGet;
        List<ServerHostInfo> listInvoke = (!isRegionCN(this.env) ? (hostForeignListGet = this.hostsGet.getHostForeignListGet()) == null : (hostForeignListGet = this.hostsGet.getHostListGet()) == null) ? hostForeignListGet.invoke(getPresetHost()) : null;
        return listInvoke == null ? new ArrayList() : listInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026 A[PHI: r3
  0x0026: PHI (r3v4 kotlin.jvm.functions.Function0<java.lang.String>) = 
  (r3v2 kotlin.jvm.functions.Function0<java.lang.String>)
  (r3v7 kotlin.jvm.functions.Function0<java.lang.String>)
  (r3v8 kotlin.jvm.functions.Function0<java.lang.String>)
 binds: [B:13:0x0023, B:10:0x001a, B:7:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    @NotNull
    public final String getLastHostInner() {
        Function0<String> lastHostTest;
        Env env = this.env;
        String strInvoke = null;
        if (env == Env.RELEASE) {
            boolean zIsRegionCN = isRegionCN(env);
            HostContainer hostContainer = this.hostsGet;
            if (!zIsRegionCN ? (lastHostTest = hostContainer.getLastHostForeign()) != null : (lastHostTest = hostContainer.getLastHost()) != null) {
                strInvoke = lastHostTest.invoke();
            }
        } else {
            lastHostTest = this.hostsGet.getLastHostTest();
            if (lastHostTest != null) {
                strInvoke = lastHostTest.invoke();
            }
        }
        return UtilKt.m4613default(strInvoke);
    }

    public /* synthetic */ DnsServerHostGet(Env env, HostContainer hostContainer, DefaultConstructorMarker defaultConstructorMarker) {
        this(env, hostContainer);
    }
}
