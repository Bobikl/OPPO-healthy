package com.oplus.aiunit.model;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.accessory.accessorymanager.AccessoryManager;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.health.oaf.LinkReasonBean;
import com.heytap.health.oaf.LinkReasonType;
import com.heytap.health.owconnect.OWConnectRecord;
import com.heytap.health.protocol.dm.DMProto$NotifyDisconnectRequest;
import com.heytap.health.protocol.dm.DMProto$NotifyDisconnectResponse;
import com.heytap.wearable.oaf.proto.WatchMode;
import com.oplus.aiunit.vision.ayf;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.if8;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o4c;
import com.oplus.aiunit.vision.uml;
import com.oplus.aiunit.vision.veb;
import com.oplus.aiunit.vision.vy3;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\official-device-assets\classes17.dex */
public class vbd {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public final a j;
    public byte[] n;
    public PeerAccessory o;
    public boolean i = false;
    public final Handler k = new Handler(o4c.a());
    public long l = 0;
    public final Map<String, ServiceProfile> p = new HashMap();
    public final int q = 3;
    public int r = 0;
    public final b m = new b();

    public interface a {
        void a(vbd vbdVar, boolean z, LinkReasonBean linkReasonBean);

        void d(vbd vbdVar, DMProto$NotifyDisconnectResponse dMProto$NotifyDisconnectResponse);

        void g(vbd vbdVar);

        void i(vbd vbdVar, int i, int i2);
    }

    public static class b {
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public boolean e = false;
        public final AtomicInteger a = new AtomicInteger(0);

        public void i() {
            this.a.set(0);
            if (!this.e) {
                this.b = 0;
                this.c = 0;
            }
            this.d = 0;
            this.e = false;
        }
    }

    public vbd(String str, String str2, int i, int i2, boolean z, a aVar) {
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.a = str;
        this.j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(ibd ibdVar, ConnectConfig connectConfig) {
        boolean z = false;
        while (true) {
            AccessoryManager accessoryManagerL = ibdVar.l();
            try {
                dcd.INSTANCE.a(this.b, accessoryManagerL);
                accessoryManagerL.connect(connectConfig);
                uml.d(this.a, "connectI: succ");
                return;
            } catch (IOException e) {
                uml.b(this.a, "connectI: ex " + e);
                if (z) {
                    q(new LinkReasonBean(LinkReasonType.DISCONNECT_OAF, "connectI: ex " + e.getMessage()));
                    return;
                }
                ibdVar.y();
                ibdVar.p(e88.a());
                z = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(boolean z) {
        if (!z) {
            this.m.c = 2;
            this.j.g(this);
            this.m.e = true;
            v("retry");
            return;
        }
        int i = this.m.c;
        if (i == 0) {
            int i2 = this.r;
            if (i2 < 3) {
                this.r = i2 + 1;
                uml.k(this.a, "requestWatchModeSync: fail retry:" + this.r);
                t(true);
                return;
            }
            uml.k(this.a, "requestWatchModeSync: timeout 10000 " + i);
            OWConnectRecord.INSTANCE.r(this.b, "Get Runmode Time Out,Disconnect");
            LinkReasonType linkReasonType = LinkReasonType.DISCONNECT_BUSINESS_135;
            q(new LinkReasonBean(linkReasonType, "Get Runmode Time Out,Disconnect", linkReasonType.ordinal()));
        }
    }

    public void d(final ibd ibdVar, final int i, final int i2, final int i3) {
        this.k.post(new Runnable() { // from class: com.oplus.aiunit.vision.tbd
            @Override // java.lang.Runnable
            public final void run() {
                this.i.l(ibdVar, i, i2, i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:22:0x011f  */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void l(final ibd ibdVar, int i, int i2, int i3) {
        long j;
        final ConnectConfig connectConfig = new ConnectConfig(this.b, this.c, this.f, this.g, i);
        connectConfig.setRetryMode(i);
        connectConfig.setUidType(this.d);
        connectConfig.setDeviceType(i3);
        boolean z = false;
        while (true) {
            AccessoryManager accessoryManagerL = ibdVar.l();
            try {
                if (!accessoryManagerL.checkKscExist(this.g)) {
                    accessoryManagerL.setKsc(this.f, this.g, this.h);
                    uml.d(this.a, "handlePairConnectedSuccess: set ksc success");
                    break;
                }
                break;
            } catch (Throwable th) {
                uml.b(this.a, "connectI: ex " + th);
                if (z) {
                    break;
                }
                ibdVar.y();
                ibdVar.p(e88.a());
                z = true;
            }
        }
        uml.d(this.a, "connect: " + veb.a(this.b) + " trans=" + this.c + " uuid=" + this.d + " retryMode=" + i + " deviceType=" + i3);
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("connect: mLocal=");
        sb.append(veb.a(if8.a(this.n)));
        sb.append(" mRemote=");
        sb.append(veb.a(if8.a(this.f)));
        sb.append(" mKscAlias=");
        sb.append(veb.a(if8.a(this.g)));
        sb.append(" mKsc=");
        sb.append(veb.a(if8.a(this.h)));
        uml.d(str, sb.toString());
        if (this.m.e) {
            uml.k(this.a, "connect: already connected reset status");
            this.m.i();
        }
        this.k.removeCallbacksAndMessages(null);
        boolean zA = vy3.a(i2);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.l;
        if (zA) {
            j = 2000;
            if (jElapsedRealtime < 2000) {
                long j2 = 2000 - jElapsedRealtime;
                if (j2 <= 2000) {
                    j = j2;
                }
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.ubd
            @Override // java.lang.Runnable
            public final void run() {
                this.i.m(ibdVar, connectConfig);
            }
        };
        if (j <= 0) {
            runnable.run();
            return;
        }
        m8b.f(this.a, "connectI: delay=" + j);
        this.k.postDelayed(runnable, j);
    }

    public void f(AccessoryManager accessoryManager) {
        try {
            this.k.removeCallbacksAndMessages(null);
            this.l = SystemClock.elapsedRealtime();
            accessoryManager.disconnect(this.b, this.c, this.d);
        } catch (IOException e) {
            uml.b(this.a, "disconnect: ex " + e);
        }
    }

    @Nullable
    public Map<String, ServiceProfile> g(AccessoryManager accessoryManager) {
        HashMap map;
        PeerAccessory peerAccessory = this.o;
        if (peerAccessory == null) {
            return null;
        }
        List<? extends ServiceProfile> availableServices = accessoryManager.getAvailableServices(peerAccessory.getId());
        OWConnectRecord.INSTANCE.E(this.o, availableServices);
        synchronized (this.p) {
            this.p.clear();
            for (int i = 0; i < availableServices.size(); i++) {
                ServiceProfile serviceProfile = availableServices.get(i);
                this.p.put(serviceProfile.getId(), serviceProfile);
            }
            map = new HashMap(this.p);
        }
        return map;
    }

    public int h() {
        return this.m.c;
    }

    public int i() {
        return this.c;
    }

    public int j() {
        return this.d;
    }

    public boolean k() {
        return this.i;
    }

    public final void o(String str, b bVar) {
        uml.d(this.a, "notifyStateChanged: connected=" + bVar.e);
        if (bVar.e) {
            this.j.i(this, this.m.b, this.m.c);
        } else {
            this.j.g(this);
            bVar.e = true;
        }
    }

    public void p(boolean z) {
        uml.d(this.a, "onConnect: ");
        this.i = true;
        uml.d(this.a, "onConnect: mNeedRequestRunMode=" + this.e + " wait=" + z);
        if (!this.e) {
            this.j.g(this);
        } else {
            this.r = 0;
            t(z);
        }
    }

    public void q(LinkReasonBean linkReasonBean) {
        this.k.removeCallbacksAndMessages(null);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, this.i, linkReasonBean);
        }
        this.i = false;
        this.m.e = false;
        this.m.i();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public void r(String str, MessageEvent messageEvent) {
        int serviceId = messageEvent.getServiceId();
        int commandId = messageEvent.getCommandId();
        DMProto$NotifyDisconnectResponse from = null;
        if (serviceId != 1 || commandId != 35) {
            if (serviceId == 1 && commandId == 44) {
                byte[] data = messageEvent.getData();
                if (data != null) {
                    try {
                        from = DMProto$NotifyDisconnectResponse.parseFrom(data);
                    } catch (InvalidProtocolBufferException unused) {
                        uml.k(this.a, "onMessageReceived: disconnectResponse parse pb error");
                    }
                }
                uml.d(this.a, "onMessageReceived: disconnectResponse=" + from);
                this.j.d(this, from);
                return;
            }
            return;
        }
        this.k.removeCallbacksAndMessages(null);
        try {
            WatchMode.WatchModeInfo from2 = WatchMode.WatchModeInfo.parseFrom(messageEvent.getData());
            int requestSeq = from2.getRequestSeq();
            int replaySeq = from2.getReplaySeq();
            int workMode = from2.getWorkMode();
            b bVar = this.m;
            bVar.b = bVar.c;
            this.m.c = workMode;
            uml.d(this.a, "onMessageReceived: requestSeq=" + requestSeq + " replaySeq=" + replaySeq + " workMode=" + workMode + " preMode=" + this.m.b);
            if (replaySeq - this.m.d != 1) {
                uml.b(this.a, "onMessageReceived: replaySeq discontinuous");
            }
            if (requestSeq != 0 && requestSeq == this.m.a.get()) {
                uml.d(this.a, "onMessageReceived: active request requestSeq=" + requestSeq + " success " + workMode);
            }
            this.m.d = replaySeq;
            o(str, this.m);
            b bVar2 = this.m;
            bVar2.b = bVar2.c;
        } catch (InvalidProtocolBufferException e) {
            uml.b(this.a, "onMessageReceived: ex " + e);
        }
    }

    public void s() {
    }

    public final void t(final boolean z) {
        this.k.removeCallbacksAndMessages(null);
        v("get");
        this.k.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.sbd
            @Override // java.lang.Runnable
            public final void run() {
                this.i.n(z);
            }
        }, 10000L);
    }

    public void u(String str) {
        com.heytap.health.adaptersdk.a.f().m(this.b, new MessageEvent(1, 43, ((DMProto$NotifyDisconnectRequest) DMProto$NotifyDisconnectRequest.newBuilder().setMsg(str).setTimeoutToConnectable(0).build()).toByteArray()), (ayf) null);
        uml.d(this.a, "sendDisconnectReq: send disconnect req " + str);
    }

    public final void v(String str) {
        int iIncrementAndGet = this.m.a.incrementAndGet();
        int iB = dcd.INSTANCE.b(this.b);
        uml.d(this.a, "requestWatchModeSync: " + veb.a(this.b) + " requestSeq=" + iIncrementAndGet + " reason=" + str + " role=" + iB);
        com.heytap.health.adaptersdk.a.f().m(this.b, new MessageEvent(1, 35, WatchMode.WatchModeInfo.newBuilder().setRequestSeq(iIncrementAndGet).setParingSequence(iB).setPhoneType(1).build().toByteArray()), (ayf) null);
    }

    public void w(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.n = bArr;
        this.f = bArr2;
        this.g = bArr3;
        this.h = bArr4;
    }

    public void x(AccessoryManager accessoryManager, PeerAccessory peerAccessory) {
        this.o = peerAccessory;
        if (peerAccessory == null) {
            uml.d(this.a, "updateAccessory clear");
            synchronized (this.p) {
                this.p.clear();
            }
            return;
        }
        List<? extends ServiceProfile> availableServices = accessoryManager.getAvailableServices(peerAccessory.getId());
        OWConnectRecord.INSTANCE.E(peerAccessory, availableServices);
        if (availableServices.isEmpty()) {
            uml.k(this.a, "updateAccessory is empty");
        }
        synchronized (this.p) {
            this.p.clear();
            for (ServiceProfile serviceProfile : availableServices) {
                if (this.p.put(serviceProfile.getId(), serviceProfile) == null) {
                    uml.d(this.a, "add urn1:" + serviceProfile.getId());
                } else {
                    uml.d(this.a, "add urn2:" + serviceProfile.getId());
                }
            }
        }
    }
}
