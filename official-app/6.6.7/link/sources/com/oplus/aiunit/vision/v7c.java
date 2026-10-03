package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import com.heytap.wearable.btnet.proto.HBProxyConfig;
import com.heytap.wearable.btnet.proto.HBProxyStatus;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.MqttTCPTunnelKt;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b;
import java.nio.channels.Selector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010?\u001a\u00020-\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010F\u001a\u00020\t¢\u0006\u0004\bG\u0010HJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0002R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010'R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<¨\u0006I"}, d2 = {"Lcom/oplus/aiunit/vision/v7c;", "Lcom/oppo/bluetooth/btnet/bluetoothproxyserver/server/a;", "", "data", "", "F", "E", "", "ip", "", "port", "", "L", "Lcom/heytap/wearable/btnet/proto/HBProxyConfig;", "config", "U", "j", "packet", "W", "V", "R", "T", "P", "status", "M", "Lcom/oplus/aiunit/vision/seb;", "t", "Lcom/oplus/aiunit/vision/seb;", "proxyConfig", "u", "Ljava/lang/String;", "TAG", "Lb;", "v", "Lb;", "mqttUplinkCodec", "w", "mqttDownLinkCodec", "x", "Z", "isProxyHeartBeat", "Landroid/os/Handler;", "y", "Landroid/os/Handler;", "heartBeatHandler", "", "z", "J", "lastServerHBTime", "A", "isProxySuccessMsgSend", "Lcom/oplus/aiunit/vision/jt;", "B", "Lcom/oplus/aiunit/vision/jt;", "alarmScheduler", "C", "lastHBPacketSendTime", "D", "isLastHBTimeout", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "serverHBTimeoutRunnable", "sendHBRunnable", "socketID", "Ljava/nio/channels/Selector;", "selector", "Lcom/oppo/bluetooth/btnet/bluetoothproxyserver/server/b;", "server", "Lcom/oplus/aiunit/vision/cyg;", "session", "transportType", "<init>", "(Lcom/oplus/aiunit/vision/seb;JLjava/nio/channels/Selector;Lcom/oppo/bluetooth/btnet/bluetoothproxyserver/server/b;Lcom/oplus/aiunit/vision/cyg;I)V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final class v7c extends a {
    public boolean A;

    @Nullable
    public jt B;
    public long C;
    public volatile boolean D;

    @NotNull
    public final Runnable E;

    @NotNull
    public final Runnable F;

    @NotNull
    public final seb t;

    @NotNull
    public final String u;

    @NotNull
    public final b v;

    @NotNull
    public final b w;
    public volatile boolean x;

    @NotNull
    public final Handler y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7c(@NotNull seb sebVar, long j, @Nullable Selector selector, @Nullable b bVar, @NotNull cyg cygVar, int i) {
        super(j, selector, bVar, cygVar, i);
        Intrinsics.checkNotNullParameter(sebVar, "proxyConfig");
        Intrinsics.checkNotNullParameter(cygVar, "session");
        this.t = sebVar;
        this.u = "MQTT";
        this.v = new b();
        this.w = new b();
        this.x = true;
        this.y = new Handler(Looper.getMainLooper());
        this.E = new Runnable() { // from class: com.oplus.aiunit.vision.s7c
            @Override // java.lang.Runnable
            public final void run() {
                v7c.Q(this.i);
            }
        };
        this.F = new Runnable() { // from class: com.oplus.aiunit.vision.t7c
            @Override // java.lang.Runnable
            public final void run() {
                v7c.N(this.i);
            }
        };
    }

    public static final void N(final v7c v7cVar) {
        Intrinsics.checkNotNullParameter(v7cVar, "this$0");
        v7cVar.x(new Runnable() { // from class: com.oplus.aiunit.vision.u7c
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                v7c.O(this.i);
            }
        });
    }

    public static final void O(v7c v7cVar) throws Exception {
        Intrinsics.checkNotNullParameter(v7cVar, "this$0");
        v7cVar.P();
    }

    public static final void Q(v7c v7cVar) {
        Intrinsics.checkNotNullParameter(v7cVar, "this$0");
        v7cVar.D = true;
        v7cVar.M(2);
    }

    public static final void S(v7c v7cVar) throws Exception {
        Intrinsics.checkNotNullParameter(v7cVar, "this$0");
        v7cVar.P();
    }

    @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a
    public void E(@Nullable byte[] data) {
        c cVarB;
        if (data == null) {
            return;
        }
        o5f.c(this.u, "Put server data to decoder, size=" + data.length);
        this.w.c(data);
        do {
            cVarB = this.w.b();
            if (cVarB != null) {
                if (this.x && cVarB.a().b()) {
                    o5f.c(this.u, "Decode mqtt server heart beat, isProxyHB=" + this.x + ", data=" + MqttTCPTunnelKt.a(cVarB.b()) + ", socketId=" + this.a);
                    this.z = System.currentTimeMillis();
                    boolean z = System.currentTimeMillis() - this.C < ((long) this.t.getD()) * 1000;
                    if (this.D && z) {
                        M(1);
                        this.D = false;
                    }
                    this.y.removeCallbacks(this.E);
                } else {
                    o5f.c(this.u, "Decode mqtt server msg, write to client, msgType=" + cVarB.a().a() + ", size=" + cVarB.b().length + ", socketId=" + this.a);
                    V(cVarB.b());
                    if (cVarB.a().a() == b.Companion.c()) {
                        if (!this.A) {
                            this.A = true;
                            M(1);
                        }
                        R();
                    }
                }
            }
        } while (cVarB != null);
    }

    @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a
    public void F(@Nullable byte[] data) throws Exception {
        c cVarB;
        if (data == null) {
            return;
        }
        o5f.a(this.u, "Put client data to decoder, size=" + data.length + " socketId=" + this.a);
        this.v.c(data);
        do {
            cVarB = this.v.b();
            if (cVarB != null) {
                o5f.a(this.u, "Decode mqtt client msg, msgType=" + cVarB.a().a() + " data=" + MqttTCPTunnelKt.a(cVarB.b()) + ", size=" + cVarB.b().length + "  socketId=" + this.a);
                W(cVarB.b());
            }
        } while (cVarB != null);
    }

    public final boolean L(@NotNull String ip, int port) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        return Intrinsics.areEqual(this.t.getA(), ip) && this.t.getB() == port;
    }

    public final void M(int status) {
        m8b.f(this.u, "Send hb status to device, status=" + status);
        wl4.devicePrimary.b.b(new MessageEvent(this.r.h, w7c.INSTANCE.a(), HBProxyStatus.newBuilder().setStatus(status).setIp(this.t.getA()).setPort(this.t.getB()).setProxyType(1).setLastServerHbTime(this.z).build().toByteArray()));
    }

    public final void P() throws Exception {
        m8b.f(this.u, "Proxy send hb to server");
        F(b.Companion.a());
        this.C = System.currentTimeMillis();
        this.y.postDelayed(this.E, ((long) this.t.getD()) * 1000);
    }

    public final void R() {
        m8b.f(this.u, "Start hb loop, interval=" + this.t.getC() + "s");
        x(new Runnable() { // from class: com.oplus.aiunit.vision.r7c
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                v7c.S(this.i);
            }
        });
        if (this.B == null) {
            jt jtVar = new jt(e88.b(), "MQTT_HB", ((long) this.t.getC()) * 1000, 0);
            this.B = jtVar;
            jtVar.j(this.F);
        }
        jt jtVar2 = this.B;
        if (jtVar2 != null) {
            jtVar2.l();
        }
    }

    public final void T() {
        m8b.f(this.u, "Stop hb loop");
        this.y.removeCallbacksAndMessages(null);
        jt jtVar = this.B;
        if (jtVar != null) {
            jtVar.m();
        }
    }

    public final void U(@NotNull HBProxyConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        m8b.f(this.u, "Update hb proxy intercept enable=" + config.getEnable() + ", host=" + this.t.getA() + ", interval=" + config.getHbInterval() + ", timeout=" + config.getHbTimeout());
        if (this.x != config.getEnable()) {
            this.x = config.getEnable();
            if (this.x) {
                R();
            } else {
                T();
            }
        }
        if (config.getEnable()) {
            this.t.f(config.getHbTimeout());
            this.t.e(config.getHbInterval());
        }
    }

    public final void V(byte[] packet) {
        super.E(packet);
    }

    public final void W(byte[] packet) throws Exception {
        super.F(packet);
    }

    @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a
    public void j() {
        super.j();
        T();
        spj spjVar = this.r.k;
        if (spjVar instanceof w7c) {
            Intrinsics.checkNotNull(spjVar, "null cannot be cast to non-null type com.oppo.bluetooth.btnet.bluetoothproxyserver.server.MqttTCPTunnelManager");
            ((w7c) spjVar).i(this.t.getA(), this.t.getB());
        }
    }
}
