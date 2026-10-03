package com.oplus.aiunit.vision;

import com.heytap.wearable.btnet.proto.HBProxyConfig;
import com.heytap.wearable.btnet.proto.HBProxyConfigResponse;
import com.heytap.wearable.btnet.proto.HBProxySupportRequest;
import com.heytap.wearable.btnet.proto.HBProxySupportResponse;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b;
import java.nio.channels.Selector;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0015B\u000f\u0012\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J@\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\bH\u0002J\u001a\u0010\"\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010%\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0018\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010*R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u0010(¨\u00067"}, d2 = {"Lcom/oplus/aiunit/vision/w7c;", "Lcom/oplus/aiunit/vision/hm4$b;", "Lcom/oplus/aiunit/vision/km4$a;", "Lcom/oplus/aiunit/vision/spj;", "", "ip", "", "port", "", "i", "host", "", "socketID", "Ljava/nio/channels/Selector;", "selector", "Lcom/oppo/bluetooth/btnet/bluetoothproxyserver/server/b;", "server", "Lcom/oplus/aiunit/vision/cyg;", "session", "transportType", "Lcom/oppo/bluetooth/btnet/bluetoothproxyserver/server/a;", "a", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "onMessageReceived", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "onPeerConnected", "onPeerDisconnected", "Lcom/heytap/wearable/btnet/proto/HBProxyConfig;", "config", "c", "d", "f", "e", "h", "g", "resultCode", "j", "I", "serviceId", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ConcurrentHashMap;", "k", "Ljava/util/concurrent/ConcurrentHashMap;", "mqttProxyMap", "l", "RESULT_OK", "m", "RESULT_NOT_OK", "<init>", "(I)V", "Companion", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final class w7c implements hm4.b, km4.a, spj {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int n = 21;
    public static final int o = 22;
    public static final int p = 23;
    public final int i;

    @NotNull
    public final String j = "MQTT";

    @NotNull
    public ConcurrentHashMap<String, HBProxyConfig> k = new ConcurrentHashMap<>();
    public final int l = 1;
    public final int m = 2;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.w7c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/w7c$a;", "", "", "HB_PROXY_CID_STATUS", "I", "a", "()I", "<init>", "()V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return w7c.p;
        }
    }

    public w7c(int i) {
        this.i = i;
        m8b.f("MQTT", "Init TCPTunnelFactory, serviceId=" + i);
        xm5 xm5Var = wl4.devicePrimary;
        xm5Var.b.f(i, -1, this);
        xm5Var.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.spj
    @NotNull
    public a a(@NotNull String host, int port, long socketID, @NotNull Selector selector, @NotNull b server, @NotNull cyg session, int transportType) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(session, "session");
        o5f.a(this.j, "Get tunnel, host=" + host + " port=" + port);
        HBProxyConfig hBProxyConfigF = f(host, port);
        if (hBProxyConfigF == null) {
            return new a(socketID, selector, server, session, transportType);
        }
        o5f.a(this.j, "Use mqtt tunnel, host=" + host + " port=" + port + " hbInterval=" + hBProxyConfigF.getHbInterval() + " hbTimeout=" + hBProxyConfigF.getHbTimeout());
        return new v7c(new seb(host, port, hBProxyConfigF.getHbInterval(), hBProxyConfigF.getHbTimeout()), socketID, selector, server, session, transportType);
    }

    public final void c(HBProxyConfig config) {
        ConcurrentHashMap<String, HBProxyConfig> concurrentHashMap = this.k;
        String ip = config.getIp();
        Intrinsics.checkNotNullExpressionValue(ip, "config.ip");
        concurrentHashMap.put(e(ip, config.getPort()), config);
    }

    public final void d() {
        this.k.clear();
    }

    public final String e(String ip, int port) {
        return ip + "_" + port;
    }

    public final HBProxyConfig f(String host, int port) {
        return this.k.get(e(host, port));
    }

    public final void g(MessageEvent event) {
        try {
            Result.Companion companion = Result.Companion;
            HBProxyConfig from = HBProxyConfig.parseFrom(event.getData());
            m8b.f(this.j, "Heart beat proxy config=" + v2e.b(from));
            if (from.getProxyType() != 1) {
                int i = this.m;
                Intrinsics.checkNotNullExpressionValue(from, "config");
                j(i, from);
                return;
            }
            if (from.getEnable()) {
                Intrinsics.checkNotNullExpressionValue(from, "config");
                c(from);
            } else {
                String ip = from.getIp();
                Intrinsics.checkNotNullExpressionValue(ip, "config.ip");
                i(ip, from.getPort());
            }
            zr0 zr0Var = zr0.INSTANCE;
            int serviceId = event.getServiceId();
            Intrinsics.checkNotNullExpressionValue(from, "config");
            zr0Var.b(serviceId, from);
            j(this.l, from);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public final void h(MessageEvent event) {
        try {
            Result.Companion companion = Result.Companion;
            HBProxySupportRequest from = HBProxySupportRequest.parseFrom(event.getData());
            m8b.f(this.j, "Heart beat proxy support msg=" + v2e.b(from));
            boolean z = true;
            if (from.getVersion() != 1 || from.getProxyType() != 1) {
                z = false;
            }
            Result.constructor-impl(Boolean.valueOf(wl4.devicePrimary.b.b(new MessageEvent(this.i, n, HBProxySupportResponse.newBuilder().setResultCode(z ? this.l : this.m).setRequest(from).build().toByteArray()))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public final void i(@NotNull String ip, int port) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.k.remove(e(ip, port));
    }

    public final void j(int resultCode, HBProxyConfig config) {
        wl4.devicePrimary.b.b(new MessageEvent(this.i, o, HBProxyConfigResponse.newBuilder().setResultCode(resultCode).setConfig(config).build().toByteArray()));
    }

    public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        int commandId = event.getCommandId();
        if (commandId == n) {
            h(event);
        } else if (commandId == o) {
            g(event);
        }
    }

    public void onPeerConnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
    }

    public void onPeerDisconnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m8b.f(this.j, "On disconnect, clear mqtt proxy");
        d();
    }
}
