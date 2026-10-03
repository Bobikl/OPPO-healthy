package com.heytap.health.oaf;

import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.heytap.health.adaptersdk.IFileCallback;
import com.heytap.health.adaptersdk.IMessageCallback;
import com.heytap.health.adaptersdk.INodeCallback;
import com.heytap.health.adaptersdk.IOAFAdapterService;
import com.heytap.health.adaptersdk.IResult;
import com.heytap.health.adaptersdk.IRunModeCallback;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.heytap.health.oaf.impl.ConnectHandler;
import com.heytap.health.oaf.impl.LongConnectionHandler;
import com.heytap.health.oafwifi.OafWifiP2p;
import com.heytap.health.owconnect.OWConnectRecord;
import com.heytap.health.watch.oaf.wrapper.AbsFtAgent;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.wearable.oaf.proto.OafRecorder$OAFKscRecorde;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.bni;
import com.oplus.aiunit.vision.byb;
import com.oplus.aiunit.vision.d9a;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.hy3;
import com.oplus.aiunit.vision.kt2;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.lad;
import com.oplus.aiunit.vision.lw9;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.pb7;
import com.oplus.aiunit.vision.q0a;
import com.oplus.aiunit.vision.q9d;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.so5;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.wyf;
import com.oplus.aiunit.vision.zad;
import com.oplus.aiunit.vision.zq8;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.common.Module;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes17.dex */
public class OafHost {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile OafHost f5081l;
    public final String a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConnectHandler f5083e;
    public byb f;
    public pb7 g;
    public LongConnectionHandler h;
    public boolean i;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5082c = false;
    public String d = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d9a.b f5084j = new a();
    public final IOAFAdapterService.Stub k = new AnonymousClass2();

    /* JADX INFO: renamed from: com.heytap.health.oaf.OafHost$2, reason: invalid class name */
    public class AnonymousClass2 extends IOAFAdapterService.Stub {
        private final Executor connectExecutor = zq8.e("OafConnect");

        public AnonymousClass2() {
        }

        private void connectNodeInner(Node node, boolean z, boolean z2, byte[] bArr, String str) {
            Module mainModule = node.getMainModule();
            if (mainModule == null) {
                wil.b(OafHost.this.a, "connectNode: error node callerPid=" + Binder.getCallingPid() + " oaf=" + OafHost.this.f5082c + " " + node);
                return;
            }
            String macAddress = mainModule.getMacAddress();
            if (OafHost.this.i) {
                wil.k(OafHost.this.a, "connectNode: ShieldConnect");
                kt2.m().y(macAddress, node, new LinkReasonBean(LinkReasonType.DISCONNECT_NORMAL, "ShieldConnect"), 3);
                return;
            }
            wil.d(OafHost.this.a, "connectNode: callerPid=" + Binder.getCallingPid() + " oaf=" + OafHost.this.f5082c + " " + node + " auto=" + z);
            String str2 = OafHost.this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("connectNode: initInfo=");
            sb.append(bni.INSTANCE.a());
            wil.d(str2, sb.toString());
            lad.INSTANCE.d(node);
            com.heytap.health.oaf.event.a.p().h(macAddress, z2, true);
            com.heytap.health.oaf.event.a.p().i(macAddress, str);
            String strL = kt2.m().l(node);
            OafRecorder$OAFKscRecorde oafRecorder$OAFKscRecordeB = (!z2 || strL == null) ? null : zad.b(strL);
            if (z2 && oafRecorder$OAFKscRecordeB != null && bArr != null) {
                oafRecorder$OAFKscRecordeB = zad.b(new String(bArr));
            }
            if (hy3.b(mainModule.getConnectionType())) {
                oafRecorder$OAFKscRecordeB = OafRecorder$OAFKscRecorde.newBuilder().setRemoteDeviceId(ByteString.copyFrom(q9d.mDeviceId)).setKscAlias(ByteString.copyFrom(q9d.mAlias)).setKsc(ByteString.copyFrom(q9d.mKsc)).build();
                wil.b(OafHost.this.a, "connectNode: device no ksc set default");
                z2 = true;
            }
            try {
                OWConnectRecord.INSTANCE.k(macAddress, str);
                if (!z2) {
                    OafHost.this.f5083e.connect(macAddress, z2, z, true);
                    return;
                }
                so5.h().m(node.getNodeId());
                if (oafRecorder$OAFKscRecordeB == null) {
                    OafHost.this.f5083e.createBound(macAddress, node);
                } else {
                    OafHost.this.f5083e.createBond(macAddress, node, oafRecorder$OAFKscRecordeB, z);
                }
            } catch (Exception e2) {
                wil.b(OafHost.this.a, "connectNode: ex " + e2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$connectNode$0(Node node, boolean z, String str, boolean z2, byte[] bArr) {
            wil.a(OafHost.this.a, "connectNode: node=" + gdb.a(node.getNodeId()) + " bundle=" + node.getExtra());
            BluetoothUtil bluetoothUtil = BluetoothUtil.INSTANCE;
            if (!bluetoothUtil.j()) {
                wil.k(OafHost.this.a, "connectNode: BlueTooth No Enable ");
                return;
            }
            if (node.getMainModule().getConnectionType() == 9) {
                q0a.INSTANCE.o(node, z, str);
            } else if (bluetoothUtil.g()) {
                connectNodeInner(node, z2, z, bArr, str);
            } else {
                wil.b(OafHost.this.a, "connectNode: no bt permission ");
            }
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void addFileListener(IFileCallback iFileCallback) throws RemoteException {
            wil.d(OafHost.this.a, "addFileListener: " + Binder.getCallingPid() + " " + iFileCallback.asBinder());
            kt2.m().h(iFileCallback);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void addMessageListener(IMessageCallback iMessageCallback) throws RemoteException {
            wil.d(OafHost.this.a, "addMessageListener: " + Binder.getCallingPid() + " " + iMessageCallback.asBinder());
            kt2.m().i(iMessageCallback);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void addNodeListener(INodeCallback iNodeCallback) throws RemoteException {
            wil.d(OafHost.this.a, "addNodeListener:  " + Binder.getCallingPid() + " " + iNodeCallback.asBinder());
            kt2.m().j(iNodeCallback);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void addRunModeListener(IRunModeCallback iRunModeCallback) throws RemoteException {
            kt2.m().k(iRunModeCallback);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void cancelFile(String str) throws RemoteException {
            wil.d(OafHost.this.a, "cancelFile: " + str);
            try {
                OafHost.this.g.i(str);
            } catch (Exception e2) {
                wil.c(OafHost.this.a, "cancelFile: ", e2);
            }
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void connectNode(final Node node, final boolean z, final boolean z2, final byte[] bArr, final String str) throws RemoteException {
            this.connectExecutor.execute(new Runnable() { // from class: com.heytap.health.oaf.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$connectNode$0(node, z2, str, z, bArr);
                }
            });
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void disconnectNode(Node node, boolean z, String str) throws RemoteException {
            if (node.getMainModule().getConnectionType() == 9) {
                q0a.INSTANCE.p(node, z, str);
                return;
            }
            String nodeId = node.getNodeId();
            if (OafHost.this.i) {
                wil.k(OafHost.this.a, "connectNode: ShieldConnect");
                kt2.m().y(nodeId, node, new LinkReasonBean(LinkReasonType.DISCONNECT_NORMAL, "ShieldConnect"), 3);
                return;
            }
            wil.d(OafHost.this.a, "disconnectNode: " + Binder.getCallingPid() + " oaf=" + OafHost.this.f5082c + " " + gdb.a(nodeId));
            String str2 = OafHost.this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("disconnectNode: initInfo=");
            sb.append(bni.INSTANCE.a());
            wil.d(str2, sb.toString());
            if (!BluetoothUtil.INSTANCE.g()) {
                wil.b(OafHost.this.a, "disconnectNode: no bt permission ");
                return;
            }
            com.heytap.health.oaf.event.a.p().j(nodeId, z, true);
            com.heytap.health.oaf.event.a.p().k(nodeId, "dev-dis,external reason:" + str);
            OWConnectRecord.INSTANCE.r(nodeId, str);
            if (z) {
                OafHost.this.f5083e.removeBond(b78.a(), nodeId, str);
            } else {
                OafHost.this.f5083e.disconnect(b78.a(), node, str);
            }
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public List<Node> getBondedNodes() throws RemoteException {
            try {
                return OafHost.this.f5083e.getBoundedPeerAccessory();
            } catch (Exception e2) {
                wil.b(OafHost.this.a, "getBondedNodes: e " + e2);
                return null;
            }
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public List<Node> getConnectedNodes() throws RemoteException {
            try {
                return OafHost.this.f5083e.getConnectedNode();
            } catch (Exception e2) {
                wil.b(OafHost.this.a, "getBondedNodes: e " + e2);
                return null;
            }
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public int getRunMode(String str) throws RemoteException {
            return OafHost.this.f5083e.getRunMode(str);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public boolean isOafConnect(String str) throws RemoteException {
            return OafHost.this.f5083e.isOafConnect(str) || OafHost.this.f5083e.getOafController().q(str);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public boolean receiveFile(String str, String str2) throws RemoteException {
            wil.a(OafHost.this.a, "receiveFile: taskId=" + str + " path=" + str2);
            return OafHost.this.g.p(str, str2);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void rejectFile(String str) throws RemoteException {
            OafHost.this.g.q(str);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void removeFileListener(IFileCallback iFileCallback) throws RemoteException {
            wil.d(OafHost.this.a, "removeFileListener: " + Binder.getCallingPid() + " " + iFileCallback.asBinder());
            kt2.m().K(iFileCallback);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void removeMessageListener(IMessageCallback iMessageCallback) throws RemoteException {
            wil.d(OafHost.this.a, "removeMessageListener: " + Binder.getCallingPid() + " " + iMessageCallback.asBinder());
            kt2.m().L(iMessageCallback);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void removeNodeListener(INodeCallback iNodeCallback) throws RemoteException {
            wil.d(OafHost.this.a, "removeNodeListener: " + Binder.getCallingPid() + " " + iNodeCallback.asBinder());
            kt2.m().M(iNodeCallback);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void removeRunModeListener(IRunModeCallback iRunModeCallback) throws RemoteException {
            kt2.m().N(iRunModeCallback);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public String sendFile(String str, String str2, int i, String str3, Uri uri) throws RemoteException {
            return OafHost.this.g.t(str, str2, i, str3, uri);
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public boolean sendMessage(String str, MessageEvent messageEvent, IResult iResult) throws RemoteException {
            byb bybVar;
            try {
                synchronized (OafHost.class) {
                    bybVar = OafHost.this.f;
                }
                return bybVar.k(str, messageEvent, iResult);
            } catch (Exception e2) {
                wil.d(OafHost.this.a, "sendMessage:" + e2);
                lw9.a(iResult, false, -1, e2.getMessage());
                return false;
            }
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void setOafModelInfo(String str, String str2, String str3) throws RemoteException {
            OafHost.this.f5083e.setOafModelId(str, str2, str3);
        }
    }

    public class a implements d9a.b {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.d9a.b
        public void a(String str, String str2) {
            OafHost.this.f5083e.connectForInnerRetry(str, str2, false);
        }

        @Override // com.oplus.aiunit.vision.d9a.b
        public void b(String str) {
            OafHost.this.f5083e.triggerAllDeviceOnce(str);
        }

        @Override // com.oplus.aiunit.vision.d9a.b
        public void c(String str, String str2) {
            OafHost.this.f5083e.disconnectForInnerRetry(str, str2);
        }
    }

    public OafHost() {
        String str = "OafHost@" + Integer.toHexString(hashCode());
        this.a = str;
        wil.d(str, "create: ");
    }

    public static OafHost i() {
        if (f5081l == null) {
            synchronized (OafHost.class) {
                if (f5081l == null) {
                    f5081l = new OafHost();
                }
            }
        }
        return f5081l;
    }

    public void g(PrintWriter printWriter, String[] strArr) {
        if (!qe0.w()) {
            printWriter.println("release app not support");
            return;
        }
        if (strArr.length > 0) {
            if (TextUtils.equals("shieldAutoConnect", strArr[0])) {
                boolean zEquals = strArr.length == 2 ? TextUtils.equals(SpeechConstant.TRUE_STR, strArr[1]) : false;
                i().n(printWriter, zEquals);
                printWriter.println("shieldAutoConnect -> " + zEquals);
            }
        }
        wyf.d().a(printWriter, strArr);
    }

    public ConnectHandler h() {
        return this.f5083e;
    }

    public IOAFAdapterService.Stub j() {
        if (!this.b) {
            wil.k(this.a, "getOafBinder: not init");
            q();
        }
        return this.k;
    }

    public String k() {
        String str;
        synchronized (OafHost.class) {
            str = this.d;
        }
        return str;
    }

    public boolean l() {
        return this.f5082c;
    }

    public final void m() {
        wil.a(this.a, "notifyRebind: ");
        Intent intent = new Intent(l9d.a(b78.a()));
        intent.setPackage(b78.a().getPackageName());
        b78.a().sendBroadcast(intent, "com.heytap.wearable.linkservice.permission.WEARABLE");
    }

    public void n(PrintWriter printWriter, boolean z) {
        wil.b(this.a, "shieldAutoConnect: shield=" + z);
        this.i = z;
        this.f5083e.shieldAutoConnect(printWriter, z);
    }

    public void o(String str) {
        wil.k(this.a, "tryConnectWithOafNotify: remoteDeviceId " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5083e.connectForOaf(str, true);
    }

    public void p() {
        wil.d(this.a, "tryDestroy: mInitialized=" + this.b);
        synchronized (OafHost.class) {
            d9a.c().i(b78.a());
            this.h.f();
            this.g.r();
            this.f5083e.release();
            this.f.i();
            this.b = false;
        }
    }

    public void q() {
        boolean zW = qe0.w();
        wil.d(this.a, "tryInit: mInitialized=" + this.b + " logFull=" + zW);
        synchronized (OafHost.class) {
            if (this.b) {
                return;
            }
            boolean upVar = OAF.setup(b78.a(), zW);
            this.f5082c = upVar;
            if (upVar) {
                this.d = OAF.getSystemOAFVersion(b78.a());
            } else {
                this.d = OAF.getInnerOafSdkVersion();
            }
            kt2.m().n();
            ConnectHandler connectHandler = new ConnectHandler();
            this.f5083e = connectHandler;
            connectHandler.init(b78.a());
            byb bybVar = new byb(this.f5083e);
            this.f = bybVar;
            bybVar.f(b78.a());
            pb7 pb7Var = new pb7(this.f5083e);
            this.g = pb7Var;
            pb7Var.k(b78.a());
            LongConnectionHandler longConnectionHandler = new LongConnectionHandler(this.f5083e, this.f, this.g);
            this.h = longConnectionHandler;
            longConnectionHandler.b(b78.a());
            d9a.c().f().e().d().g().h(b78.a(), this.f5084j);
            this.b = true;
            wil.d(this.a, "tryInit: init mUseSystemOaf=" + this.f5082c + " logFull=" + zW);
            final OafWifiP2p oafWifiP2p = OafWifiP2p.INSTANCE;
            Objects.requireNonNull(oafWifiP2p);
            AbsFtAgent.p2pInterceptor = new md1() { // from class: com.oplus.aiunit.vision.x9d
                @Override // com.oplus.aiunit.vision.md1
                public final Object apply(Object obj, Object obj2) {
                    return Boolean.valueOf(oafWifiP2p.f((AbsFtAgent) obj, (FileTransferTask) obj2));
                }
            };
            m();
        }
    }
}
