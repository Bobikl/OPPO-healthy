package com.oplus.aiunit.model;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.protobuf.ByteString;
import com.heytap.accessory.accessorymanager.AccessoryManager;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.pair.PairManager;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.oaf.LinkReasonBean;
import com.heytap.health.oaf.LinkReasonType;
import com.heytap.health.owconnect.OWConnectRecord;
import com.heytap.health.protocol.dm.DMProto$NotifyDisconnectResponse;
import com.heytap.wearable.oaf.proto.OafRecorder;
import com.oplus.aiunit.vision.d8b;
import com.oplus.aiunit.vision.dzb;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.g5g;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.h65;
import com.oplus.aiunit.vision.mvc;
import com.oplus.aiunit.vision.n9d;
import com.oplus.aiunit.vision.o4c;
import com.oplus.aiunit.vision.sa5;
import com.oplus.aiunit.vision.tx9;
import com.oplus.aiunit.vision.uml;
import com.oplus.aiunit.vision.vx9;
import com.oplus.aiunit.vision.vy3;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\official-device-assets\classes17.dex */
public class lbd implements vbd.a, ibd.c, dzb {
    public static final int MAX_KSC_RETRY = 4;
    public final boolean A;
    public boolean D;
    public final String i;
    public final String j;
    public final vbd k;
    public final vbd l;
    public uu1 m;
    public ibd n;
    public mbd o;
    public boolean p;
    public final OafRecorder.NodeRecode.Builder s;
    public int t;
    public final h65 v;
    public boolean w;
    public final cef z;
    public volatile Node q = null;
    public volatile int r = 0;
    public String u = "";
    public boolean x = false;
    public int y = 4;
    public int B = -1;

    @SuppressLint({"HandlerLeak"})
    public final Handler C = new a(o4c.a());
    public boolean E = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                uml.d(lbd.this.i, "timeout wait client dis rsp, dis initiative");
                lbd.this.w = false;
                lbd.this.y();
            } else if (i == 2) {
                uml.d(lbd.this.i, "reCreateBond: ");
                lbd.this.z.onReCreateBond(lbd.this.j, lbd.this.G());
            }
        }
    }

    public class b implements tx9 {
        public final /* synthetic */ String i;

        public b(String str) {
            this.i = str;
        }

        @SuppressLint({"MissingPermission"})
        public boolean a() {
            int bondState = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(lbd.this.j).getBondState();
            boolean z = bondState == 12;
            if (!z) {
                uml.k(lbd.this.i, "retry device not bond " + bondState);
            }
            return z;
        }

        public boolean b() {
            if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                return lbd.this.w;
            }
            return false;
        }

        public void retry() {
            OWConnectRecord.INSTANCE.k(this.i, com.heytap.health.oaf.event.a.AUTO_RETRY);
            com.heytap.health.oaf.event.a.p().i(this.i, com.heytap.health.oaf.event.a.AUTO_RETRY);
            com.heytap.health.oaf.event.a.p().h(this.i, false, false);
            lbd.this.w();
        }
    }

    public class c implements vx9.a {
        public c() {
        }

        public void a(sa5 sa5Var, int i) {
            if (OWConnectRecord.INSTANCE.D()) {
                lbd.this.v.start();
            } else {
                lbd.this.v.stop();
            }
        }

        public void b(sa5 sa5Var) {
            lbd.this.v.stop();
        }
    }

    public class d implements uu1.b {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        @Override // com.oplus.aiunit.vision.uu1.b
        public boolean connect() {
            uml.d(lbd.this.i, "connect:");
            PairManager.getInstance().startBond(lbd.this.j, this.a);
            return true;
        }

        @Override // com.oplus.aiunit.vision.uu1.b
        public void disconnect() {
            uml.d(lbd.this.i, "disconnect:");
            PairManager.getInstance().cancelBond(lbd.this.j);
        }
    }

    public lbd(String str, OafRecorder.NodeRecode.Builder builder, cef cefVar) {
        this.j = str;
        this.s = builder;
        this.z = cefVar;
        String str2 = str.substring(str.length() - 5) + "'" + m88.a();
        this.i = "OafDevice:" + str2;
        String str3 = "OafNode:" + str2 + ":";
        int connectionType = builder.getConnectionType();
        int iD = vy3.d(connectionType);
        this.k = new vbd(str3 + "M", str, iD, 0, false, this);
        boolean zE = vy3.e(connectionType);
        this.A = zE;
        this.l = new vbd(str3 + "S", str, iD, 1, zE, this);
        h65 h65Var = new h65("OAF:" + str2, 0, true, str);
        this.v = h65Var;
        h65Var.c(new b(str));
        h65Var.setOnConnectChangeHoldListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        ur7.INSTANCE.b(this.j, this.s.getConnectionType());
    }

    public void A() {
        uml.d(this.i, "disconnectAsUnderlayerReport:");
        y();
    }

    public final void B() {
        AccessoryManager accessoryManagerL = this.n.l();
        this.l.f(accessoryManagerL);
        this.k.f(accessoryManagerL);
    }

    public void C() {
        uml.d(this.i, "forgetDevice:");
        this.w = false;
        this.k.s();
        this.l.s();
        this.n.z(this);
        this.o.b(this.j);
        com.heytap.health.adaptersdk.a.f().l(this);
        uu1 uu1Var = this.m;
        if (uu1Var != null) {
            uu1Var.n();
        }
        yt2.m().y(this.j, X(false, false), new LinkReasonBean(LinkReasonType.DISCONNECT_NORMAL, "forgetDev"), va4.a(J()));
    }

    public String D() {
        return this.j;
    }

    public Map<String, ServiceProfile> E() {
        HashMap map = new HashMap();
        Map<String, ServiceProfile> mapG = this.k.g(this.n.l());
        if (mapG != null) {
            map.putAll(mapG);
        } else {
            uml.b(this.i, "getAvailableServices: mainServices is null");
        }
        Map<String, ServiceProfile> mapG2 = this.l.g(this.n.l());
        if (mapG2 != null) {
            map.putAll(mapG2);
        } else {
            uml.b(this.i, "getAvailableServices: subServices is null");
        }
        return map;
    }

    public byte[] F() {
        return this.s.getRemoteDeviceId().toByteArray();
    }

    public synchronized Node G() {
        if (this.q == null) {
            uml.k(this.i, "getLastNode: mLastNode==null");
            X(false, false);
        }
        return this.q;
    }

    public OafRecorder.NodeRecode.Builder H() {
        return this.s;
    }

    public OafRecorder.NodeRecode.Builder I() {
        return this.s;
    }

    public int J() {
        if (this.A) {
            return this.l.h();
        }
        return this.r == 3 ? 1 : 0;
    }

    public void K(ibd ibdVar, mbd mbdVar) {
        uml.d(this.i, "init:");
        this.n = ibdVar;
        ibdVar.i(this);
        this.o = mbdVar;
        com.heytap.health.adaptersdk.a.f().e(this);
    }

    public boolean L() {
        return this.r == 3;
    }

    public boolean M() {
        uu1 uu1Var = this.m;
        if (uu1Var != null) {
            return uu1Var.l();
        }
        return false;
    }

    public void N(int i) {
        boolean z = false;
        boolean z2 = i == -1111;
        boolean zO = this.m.o();
        String str = zO ? "SP" : "NP";
        this.o.b(this.j);
        Node nodeG = G();
        if (!zO && z2) {
            z = true;
        }
        mvc.b(nodeG, z);
        yt2.m().y(this.j, nodeG, new LinkReasonBean(LinkReasonType.DISCONNECT_KSC, "kscPairFailed:" + str + "(" + i + ")"), 1);
    }

    public boolean P() {
        if (!this.A) {
            uml.d(this.i, "needConnectMain: not need get runMode");
            return false;
        }
        int iJ = J();
        boolean zA = g5g.a(iJ);
        boolean zB = g5g.b(iJ);
        uml.d(this.i, "needConnectMain: runMode=" + iJ + " highPerformance=" + zA + " mix=" + zB);
        return zA || zB;
    }

    public void Q(vbd vbdVar, LinkReasonBean linkReasonBean) {
        vbdVar.q(linkReasonBean);
        vbdVar.x(null, null);
        this.r = 0;
    }

    public final void R() {
        h65 h65Var;
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            uml.d(this.i, "onOafNodeDisconnect: bluetooth no Enabled");
            h65 h65Var2 = this.v;
            if (h65Var2 != null) {
                h65Var2.stop();
                return;
            }
            return;
        }
        if (!OWConnectRecord.INSTANCE.D()) {
            this.v.stop();
            return;
        }
        if (!this.w || (h65Var = this.v) == null) {
            return;
        }
        if (this.x) {
            uml.d(this.i, "onOafNodeDisconnect: refresh retry");
            this.v.stop();
            this.v.start();
            this.x = false;
            return;
        }
        if (h65Var.g()) {
            this.v.a((sa5) null, -1);
        } else {
            uml.d(this.i, "onOafNodeDisconnect: start retry");
            this.v.start();
        }
    }

    public boolean S() {
        return this.E;
    }

    public synchronized void T(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.B = ((Boolean) gd5.d(str2).a(new n9d())).booleanValue() ? 1 : 7;
            uml.d(this.i, "setOafModelId: mDeviceType " + this.B);
        }
        byte[] bArrHexStrToByteArray = HexUtils.hexStrToByteArray(str);
        if (bArrHexStrToByteArray == null) {
            uml.k(this.i, "setOafModelId: oafModelId is null " + str);
            return;
        }
        if (Arrays.equals(this.s.getOafModelId().toByteArray(), bArrHexStrToByteArray)) {
            return;
        }
        uml.d(this.i, "setOafModelId: oafModelId=" + str + ", " + HexUtils.byteArrayToHexStr(bArrHexStrToByteArray));
        this.s.setOafModelId(ByteString.copyFrom(bArrHexStrToByteArray));
        this.o.d(this, true);
        if (bArrHexStrToByteArray.length > 0) {
            uml.d(this.i, "connect: " + HexUtils.byteArrayToHexStr(bArrHexStrToByteArray));
            byte[] byteArray = this.s.getLocalDeviceId().toByteArray();
            if (byteArray == null || byteArray.length == 0) {
                try {
                    byteArray = this.n.l().getLocalDeviceId();
                } catch (IOException e) {
                    uml.d(this.i, "connect error: " + e.getMessage());
                }
            }
            m53.a().b(byteArray, this.s.getRemoteDeviceId().toByteArray(), bArrHexStrToByteArray);
        }
    }

    public void U(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr != null) {
            this.s.setLocalDeviceId(ByteString.copyFrom(bArr));
        } else {
            uml.b(this.i, "setParam localDeviceId null");
        }
        if (bArr2 != null) {
            this.s.setRemoteDeviceId(ByteString.copyFrom(bArr2));
        } else {
            uml.b(this.i, "setParam remoteDeviceId null");
        }
        if (bArr3 != null) {
            this.s.setKscAlias(ByteString.copyFrom(bArr3));
        } else {
            uml.b(this.i, "setParam kscAlias null");
        }
        if (bArr4 != null) {
            this.s.setKsc(ByteString.copyFrom(bArr4));
        } else {
            uml.b(this.i, "setParam ksc null");
        }
        this.o.d(this, true);
    }

    public void V(boolean z) {
        this.E = z;
    }

    public void W(PrintWriter printWriter, boolean z) {
        this.D = z;
        printWriter.println("address=" + this.j);
        this.v.j(printWriter, z);
    }

    public synchronized Node X(boolean z, boolean z2) {
        if (vy3.f(this.s.getConnectionType())) {
            z2 = true;
        }
        this.q = rcd.c(this.j, this.u, this.s.getConnectionType(), this.s.getNodeId(), z, z2);
        uml.d(this.i, "updateNode: connected=" + z + " main=" + z2 + " set mLastNode= " + Integer.toHexString(this.q.hashCode()));
        return this.q;
    }

    @Override // com.oplus.aiunit.vision.vbd.a
    public void a(vbd vbdVar, boolean z, LinkReasonBean linkReasonBean) {
        uml.a(this.i, "onOafNodeDisconnect: preConnected=" + z + " " + this.x);
        if (vbdVar == this.l) {
            this.r = 0;
            yt2.m().y(this.j, X(false, false), linkReasonBean, va4.a(J()));
            R();
            return;
        }
        if (vbdVar == this.k && P()) {
            Node nodeX = X(false, false);
            this.r = 0;
            yt2.m().y(this.j, nodeX, linkReasonBean, va4.a(J()));
            R();
        }
    }

    @Override // com.oplus.aiunit.vision.ibd.c
    public void c(PeerAccessory peerAccessory) {
        if (TextUtils.equals(peerAccessory.getAddress(), this.j)) {
            this.y = 4;
            int transportType = peerAccessory.getTransportType();
            int uUIDType = peerAccessory.getUUIDType();
            uml.d(this.i, "onAccessoryConnect: transportType=" + transportType + " uuidType=" + uUIDType);
            if (transportType == this.k.i() && uUIDType == this.k.j()) {
                this.u = peerAccessory.getName();
                this.k.x(this.n.l(), peerAccessory);
                this.k.p(!this.p);
                this.r = 3;
                return;
            }
            if (transportType == this.l.i() && uUIDType == this.l.j()) {
                this.l.x(this.n.l(), peerAccessory);
                this.l.p(true);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.vbd.a
    public void d(vbd vbdVar, DMProto$NotifyDisconnectResponse dMProto$NotifyDisconnectResponse) {
        if (!this.C.hasMessages(1)) {
            uml.k(this.i, "onNotifyDisconnectResponse: ignore this event, cause not request disconnect");
            return;
        }
        uml.d(this.i, "onNotifyDisconnectResponse: do disconnect");
        this.C.removeMessages(1);
        this.w = false;
        y();
    }

    @Override // com.oplus.aiunit.vision.ibd.c
    public void e(PeerAccessory peerAccessory) {
        if (TextUtils.equals(peerAccessory.getAddress(), this.j)) {
            this.r = 0;
            this.w = false;
            B();
            if (this.y <= 0) {
                uml.k(this.i, "onAccessoryKscError: retried failed again");
                d8b.d(e88.a(), this.i, "KSC 重试失败");
                yt2.m().y(this.j, G(), new LinkReasonBean(LinkReasonType.DISCONNECT_KSC, "kscRetryFailed"), va4.a(J()));
            } else {
                uml.d(this.i, "onAccessoryKscError: remain " + this.y);
                this.C.sendEmptyMessageDelayed(2, 200L);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lbd) {
            return Objects.equals(this.j, ((lbd) obj).j);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ibd.c
    public void f(PeerAccessory peerAccessory, LinkReasonBean linkReasonBean) {
        vbd vbdVar;
        if (TextUtils.equals(peerAccessory.getAddress(), this.j) && !this.C.hasMessages(2)) {
            int transportType = peerAccessory.getTransportType();
            int uUIDType = peerAccessory.getUUIDType();
            uml.d(this.i, "onAccessoryDisconnect: transportType=" + transportType + " uuidType=" + uUIDType);
            if (transportType == this.k.i() && uUIDType == this.k.j()) {
                vbdVar = this.k;
            } else {
                vbdVar = (transportType == this.l.i() && uUIDType == this.l.j()) ? this.l : null;
            }
            if (vbdVar != null) {
                Q(vbdVar, linkReasonBean);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.vbd.a
    public void g(vbd vbdVar) {
        uml.d(this.i, "onOafNodeConnect: " + vbdVar.j());
        vbd vbdVar2 = this.l;
        if (vbdVar == vbdVar2) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.kbd
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.O();
                }
            });
            boolean zP = P();
            uml.d(this.i, "onOafNodeConnect: sub connected needConnectMain=" + zP);
            if (zP) {
                OWConnectRecord.INSTANCE.i();
                this.k.d(this.n, this.t, this.s.getConnectionType(), this.B);
                return;
            }
            this.w = true;
            Node nodeX = X(true, false);
            this.r = 3;
            h65 h65Var = this.v;
            int iF = h65Var != null ? h65Var.f() : 0;
            OWConnectRecord.INSTANCE.l();
            yt2.m().v(this.j, nodeX, va4.a(J()), iF, "McuConn");
            h65 h65Var2 = this.v;
            if (h65Var2 != null) {
                h65Var2.b((sa5) null);
            }
            if (this.p) {
                this.o.c(this);
                return;
            }
            return;
        }
        if (vbdVar != this.k) {
            uml.b(this.i, "onOafNodeConnect: unknown oafNode " + vbdVar);
            return;
        }
        if (vbdVar2 != null && !vbdVar2.k()) {
            uml.b(this.i, "onOafNodeConnect: main connected , but subNode not connected, ignore");
            return;
        }
        this.w = true;
        uml.d(this.i, "onOafNodeConnect: main connected");
        Node nodeX2 = X(true, true);
        this.r = 3;
        h65 h65Var3 = this.v;
        int iF2 = h65Var3 != null ? h65Var3.f() : 0;
        OWConnectRecord.INSTANCE.l();
        yt2.m().v(this.j, nodeX2, va4.a(J()), iF2, "ApConn");
        h65 h65Var4 = this.v;
        if (h65Var4 != null) {
            h65Var4.b((sa5) null);
        }
        if (this.p) {
            this.o.c(this);
        }
    }

    @Override // com.oplus.aiunit.vision.ibd.c
    public void h(@NonNull List<PeerAccessory> list) {
        boolean z = false;
        boolean z2 = false;
        for (PeerAccessory peerAccessory : list) {
            if (TextUtils.equals(peerAccessory.getAddress(), this.j)) {
                if (peerAccessory.getUUIDType() == this.l.j()) {
                    z2 = true;
                } else if (peerAccessory.getUUIDType() == this.k.j()) {
                    z = true;
                }
            }
        }
        int iJ = J();
        uml.d(this.i, "onAccessoryCrash: lastMain=" + z + " lastSub=" + z2 + " runMode=" + iJ + " status=" + this.r);
        if (z2) {
            Q(this.l, new LinkReasonBean(LinkReasonType.DISCONNECT_OAF_CRASH, "Oaf Crash,Mcu Not Connect"));
        } else {
            if (z) {
                return;
            }
            if (g5g.a(iJ) || g5g.b(iJ)) {
                Q(this.k, new LinkReasonBean(LinkReasonType.DISCONNECT_OAF_CRASH, "Oaf Crash,Need AP Connect,But AP Not Connect"));
            }
        }
    }

    public int hashCode() {
        return Objects.hashCode(this.j);
    }

    @Override // com.oplus.aiunit.vision.vbd.a
    public void i(vbd vbdVar, int i, int i2) {
        uml.d(this.i, "onRunModeChanged: preMode=" + i + " runMode=" + i2 + " mStatus=" + this.r);
        if (L()) {
            yt2.m().I(this.j, G(), i, i2);
        }
    }

    public void onMessageReceived(String str, MessageEvent messageEvent) {
        if (TextUtils.equals(str, this.j)) {
            this.l.r(str, messageEvent);
        }
    }

    public final boolean s(String str) {
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        try {
            return ((Boolean) remoteDevice.getClass().getDeclaredMethod("cancelBondProcess", new Class[0]).invoke(remoteDevice, new Object[0])).booleanValue();
        } catch (Exception e) {
            uml.k(this.i, "cancelBondProcess failed " + e);
            return false;
        }
    }

    public void t(boolean z, boolean z2) {
        u(z, z2, true);
    }

    public void u(boolean z, boolean z2, boolean z3) {
        boolean z4;
        h65 h65Var;
        this.w = z2;
        this.x = z3;
        if (z3 && (h65Var = this.v) != null) {
            h65Var.stop();
        }
        byte[] byteArray = this.s.getLocalDeviceId().toByteArray();
        byte[] byteArray2 = this.s.getRemoteDeviceId().toByteArray();
        byte[] byteArray3 = this.s.getKscAlias().toByteArray();
        byte[] byteArray4 = this.s.getKsc().toByteArray();
        boolean z5 = true;
        if (byteArray2 == null || byteArray2.length == 0) {
            uml.b(this.i, "mLocalDeviceId is null");
            z4 = true;
        } else {
            z4 = false;
        }
        if (byteArray3 == null || byteArray3.length == 0) {
            uml.b(this.i, "kscAlias is null");
            z4 = true;
        }
        if (byteArray4 == null || byteArray4.length == 0) {
            uml.b(this.i, "mKsc is null");
        } else {
            z5 = z4;
        }
        if (z5 || z) {
            this.y = 4;
            uml.d(this.i, "connect: reset ksc retry");
        }
        if (z5) {
            this.z.onReCreateBond(this.j, G());
            return;
        }
        this.k.w(byteArray, byteArray2, byteArray3, byteArray4);
        this.l.w(byteArray, byteArray2, byteArray3, byteArray4);
        this.p = z;
        this.t = 0;
        w();
    }

    public void v(boolean z, boolean z2, boolean z3, String str) {
        if (!this.w) {
            uml.d(this.i, "connectCheckExpect: out not expect connect, ignore");
            return;
        }
        if (z3 && this.D) {
            uml.d(this.i, "connectCheckExpect: Shield connect ignore");
        } else if (L()) {
            uml.d(this.i, "connected, ignore");
        } else {
            OWConnectRecord.INSTANCE.k(this.j, str);
            u(z, this.w, z2);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void w() {
        OWConnectRecord.INSTANCE.A();
        if (this.B == -1) {
            boolean zBooleanValue = ((Boolean) gd5.c(this.j).a(new Function1() { // from class: com.oplus.aiunit.vision.jbd
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((DeviceInfo) obj).M9());
                }
            })).booleanValue();
            if (!zBooleanValue) {
                zBooleanValue = ((Boolean) gd5.a(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.j).getName()).a(new n9d())).booleanValue();
            }
            uml.d(this.i, "connectInner: isSmartWatch " + zBooleanValue);
            this.B = zBooleanValue ? 1 : 7;
        }
        if (this.C.hasMessages(1)) {
            uml.d(this.i, "connectInner: remove disconnect timeout");
        }
        this.C.removeMessages(1);
        byte[] byteArray = this.s.getOafModelId().toByteArray();
        if (byteArray != null && byteArray.length > 0) {
            uml.d(this.i, "connect: " + HexUtils.byteArrayToHexStr(byteArray));
            byte[] byteArray2 = this.s.getLocalDeviceId().toByteArray();
            if (byteArray2 == null || byteArray2.length == 0) {
                try {
                    byteArray2 = this.n.l().getLocalDeviceId();
                } catch (IOException e) {
                    uml.b(this.i, "IOException e = " + e.getMessage());
                }
            }
            m53.a().b(byteArray2, this.s.getRemoteDeviceId().toByteArray(), byteArray);
        }
        if (this.r != 2) {
            this.l.d(this.n, this.t, this.s.getConnectionType(), this.B);
            return;
        }
        uml.k(this.i, "connect: " + this.r + " ignore");
    }

    public synchronized void x(Context context, boolean z, int i) {
        if (this.m == null) {
            this.m = new uu1(this.j, z, new d(i));
        }
        this.y--;
        this.m.i();
    }

    public final void y() {
        h65 h65Var;
        AccessoryManager accessoryManagerL = this.n.l();
        this.r = 1;
        if (!this.w && (h65Var = this.v) != null) {
            h65Var.stop();
        }
        this.l.f(accessoryManagerL);
        this.k.f(accessoryManagerL);
        uu1 uu1Var = this.m;
        if (uu1Var != null) {
            uu1Var.n();
        }
    }

    public void z(Context context, boolean z, String str) {
        this.w = false;
        boolean zCancelBond = PairManager.getInstance().cancelBond(this.j);
        uu1 uu1Var = this.m;
        if (uu1Var != null) {
            uu1Var.j();
        }
        h65 h65Var = this.v;
        if (h65Var != null) {
            h65Var.stop();
        }
        boolean zL = L();
        if (!zL) {
            z = true;
        }
        this.C.removeMessages(2);
        if (!z) {
            this.C.removeMessages(1);
            this.C.sendEmptyMessageDelayed(1, 500L);
            this.k.u("dis req timeout=500ms");
            return;
        }
        uml.d(this.i, "disconnect: direct conn=" + zL);
        y();
        if (zCancelBond) {
            boolean zS = s(this.j);
            uml.d(this.i, "disconnect: cancelBondProcess=" + zS);
            Node nodeX = X(false, false);
            yt2.m().y(this.j, nodeX, new LinkReasonBean(LinkReasonType.DISCONNECT_NORMAL, "external reason:" + str), va4.a(J()));
        }
    }
}
