package com.oplus.wearable.linkservice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.oplus.aiunit.vision.kd5;
import com.oplus.aiunit.vision.q14;
import com.oplus.aiunit.vision.rml;
import com.oplus.aiunit.vision.u0c;
import com.oplus.aiunit.vision.uml;
import com.oplus.aiunit.vision.utg;
import com.oplus.aiunit.vision.vd7;
import com.oplus.aiunit.vision.veb;
import com.oplus.aiunit.vision.wml;
import com.oplus.aiunit.vision.wte;
import com.oplus.aiunit.vision.wya;
import com.oplus.aiunit.vision.xf3;
import com.oplus.aiunit.vision.xml;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.IWearableCallback;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.IWearableService;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.OnResultCallback;
import com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.common.Module;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WearableApiManager {
    public static WearableApiManager c;
    public static WearableServiceImpl d;
    public final Context a;
    public int b = 0;

    public final class WearableServiceImpl extends IWearableService.Stub {
        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void addListener(String str, IWearableListener iWearableListener) throws RemoteException {
            if (xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.k(str, iWearableListener);
                return;
            }
            uml.b("Olink", "addListener: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void cancelFile(String str, String str2) throws RemoteException {
            vd7.e().b(str2);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void connect(String str, Node node, boolean z) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                uml.b("Olink", "connect: no bt permission ");
                return;
            }
            if (xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.l(str, node, z);
                return;
            }
            uml.b("Olink", "connect: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void createBond(String str, Node node, byte[] bArr) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                uml.b("Olink", "createBond: no bt permission ");
                return;
            }
            if (xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.o(str, node, bArr);
                return;
            }
            uml.b("Olink", "createBond: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void disconnect(String str, Node node) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                uml.b("Olink", "disconnect: no bt permission ");
                return;
            }
            if (xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.p(str, node);
                return;
            }
            uml.b("Olink", "disconnect: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public List<Node> getBondNodes(String str) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                uml.b("Olink", "getBondNodes: no bt permission ");
                return new ArrayList();
            }
            if (!xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                return new ArrayList();
            }
            List<Node> listR = WearableApiManager.this.r();
            uml.a("Olink", "getBondNodes: callerPackage=" + str + " nodes=" + listR.size());
            return listR;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void getBondNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException {
            if (!xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                onResultCallback.onFailure("Not has permission:com.heytap.wearable.linkservice.permission.WEARABLE");
                return;
            }
            try {
                kd5.v().m(onResultCallback);
            } catch (Exception e) {
                if (onResultCallback != null) {
                    onResultCallback.onFailure("e " + e);
                }
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public List<Node> getConnectedNodes(String str) throws RemoteException {
            if (!xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                return new ArrayList();
            }
            try {
                return WearableApiManager.this.s();
            } catch (Exception e) {
                uml.b("Olink", "getConnectedNodes: e " + e);
                return new ArrayList();
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void getConnectedNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException {
            if (!xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                onResultCallback.onFailure("Not has permission:com.heytap.wearable.linkservice.permission.WEARABLE");
                return;
            }
            try {
                kd5.v().f(onResultCallback);
            } catch (Exception e) {
                if (onResultCallback != null) {
                    onResultCallback.onFailure("e " + e);
                }
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public String getWearOSNodeIdByMac(String str, String str2) throws RemoteException {
            if (!xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                uml.b("Olink", "getWearOSNodeIdByMac: check permission failed " + str);
                return null;
            }
            String strK = kd5.v().k(str2);
            uml.a("Olink", "getWearOSNodeIdByMac: " + Binder.getCallingPid() + " " + veb.a(str2) + " " + strK);
            return strK;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public FileTransferTask olinkSendFile(String str, FileTransferTask fileTransferTask) {
            return vd7.e().l(str, fileTransferTask.getNodeId(), fileTransferTask);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public boolean receiveFile(String str, int i, String str2, String str3, String str4) throws RemoteException {
            return vd7.e().h(i, str2, str3, str4);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void rejectFile(String str, String str2) throws RemoteException {
            vd7.e().j(str2);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void removeBond(String str, Node node, IRemoveBoundCallback iRemoveBoundCallback) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                uml.b("Olink", "removeBond: no bt permission ");
                return;
            }
            if (xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.z(str, node, iRemoveBoundCallback);
                return;
            }
            uml.b("Olink", "connect: check permission failed " + str);
            if (iRemoveBoundCallback != null) {
                iRemoveBoundCallback.onDeviceRemovalFailed(node.getNodeId(), -1);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void removeListener(String str, IWearableListener iWearableListener) throws RemoteException {
            if (xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.A(str, iWearableListener);
                return;
            }
            uml.b("Olink", "removeListener: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public boolean sendMessage(String str, String str2, MessageEvent messageEvent, IWearableCallback iWearableCallback) throws RemoteException {
            if (xml.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                return WearableApiManager.this.B(str, str2, messageEvent, iWearableCallback);
            }
            uml.b("Olink", "sendMessage: check permission failed " + str);
            return false;
        }

        private WearableServiceImpl() {
        }
    }

    public WearableApiManager(Context context) {
        this.a = context.getApplicationContext();
    }

    public static WearableApiManager v(Context context) {
        if (c == null) {
            synchronized (WearableApiManager.class) {
                if (c == null) {
                    c = new WearableApiManager(context);
                }
            }
        }
        return c;
    }

    public final void A(String str, IWearableListener iWearableListener) {
        uml.d("Olink", "removeListener: " + str);
        wml.h().w(str, iWearableListener);
    }

    public final boolean B(String str, String str2, MessageEvent messageEvent, IWearableCallback iWearableCallback) {
        if (TextUtils.isEmpty(str2)) {
            uml.k("Olink", "sendMessage: mac is empty");
            return false;
        }
        ModuleInfo moduleInfoH = rml.k().h(str2);
        if (moduleInfoH != null) {
            return u0c.d().i(moduleInfoH, str, messageEvent, iWearableCallback, messageEvent.getPriority().getPriority());
        }
        uml.a("Olink", "sendMessage: not find node for " + str2);
        return false;
    }

    public final void k(String str, IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            uml.b("Olink", "addListener: listener is null, " + str);
            return;
        }
        uml.d("Olink", "addListener: " + str + "#" + Integer.toHexString(iWearableListener.asBinder().hashCode()));
        wml.h().e(str, iWearableListener);
    }

    public final void l(String str, Node node, boolean z) {
        if (node != null) {
            uml.d("Olink", "connect: callerPackage=" + str + "\u3000" + node + " auto=" + z);
            DeviceInfo deviceInfoT = t(node);
            rml.k().o(deviceInfoT);
            kd5.v().i(deviceInfoT, z, false, null);
        }
    }

    public final void m() {
        if (((Boolean) wte.a(this.a, wte.KEY_NEED_CONVERT_DB, Boolean.TRUE)).booleanValue()) {
            try {
                wya.c().a();
            } catch (Exception e) {
                uml.k("Olink", "convertNotEncodeDbIfNeed: exception " + e);
                return;
            }
        }
        wte.b(this.a, wte.KEY_NEED_CONVERT_DB, Boolean.FALSE);
    }

    public final ModuleInfo n(Node node, Module module, boolean z) {
        if (module == null) {
            return null;
        }
        ModuleInfo moduleInfo = new ModuleInfo();
        moduleInfo.setNodeId(node.getNodeId());
        moduleInfo.setConnectionType(module.getConnectionType());
        moduleInfo.setMacAddress(module.getMacAddress());
        moduleInfo.setMainModule(z);
        return moduleInfo;
    }

    public final void o(String str, Node node, byte[] bArr) {
        if (node != null) {
            uml.d("Olink", "createBond: callerPackage=" + str + "\u3000" + node);
            DeviceInfo deviceInfoT = t(node);
            rml.k().o(deviceInfoT);
            kd5.v().i(deviceInfoT, true, true, bArr);
        }
    }

    public final void p(String str, Node node) {
        if (node != null) {
            uml.d("Olink", "disconnect: callerPackage=" + str + "\u3000" + node);
            DeviceInfo deviceInfoT = t(node);
            rml.k().f(deviceInfoT);
            kd5.v().c(deviceInfoT);
        }
    }

    public void q(PrintWriter printWriter, String[] strArr) {
        if (uml.g()) {
            rml.k().g(printWriter, strArr);
            kd5.v().a(printWriter, strArr);
            wml.h().f(printWriter, strArr);
            printWriter.flush();
        }
    }

    public final List<Node> r() {
        if (!BluetoothUtil.INSTANCE.g()) {
            uml.b("Olink", "getBondNodes: no bt permission ");
            return new ArrayList();
        }
        List<DeviceInfo> listH = utg.g().h();
        ArrayList arrayList = new ArrayList();
        Iterator<DeviceInfo> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toNode());
        }
        return arrayList;
    }

    public final List<Node> s() {
        Collection<DeviceInfo> collectionJ = rml.k().j();
        ArrayList arrayList = new ArrayList();
        Iterator<DeviceInfo> it = collectionJ.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toNode());
        }
        return arrayList;
    }

    public final DeviceInfo t(Node node) {
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setBleConnectTimeout(DeviceInfo.GATT_CONNECT_LONG_TIMEOUT);
        deviceInfo.setBleRetryCount(1);
        deviceInfo.setNodeId(node.getNodeId());
        deviceInfo.setMainModuleInfo(n(node, node.getMainModule(), true));
        deviceInfo.setStubModuleInfo(n(node, node.getStubModule(), false));
        return deviceInfo;
    }

    public IWearableService.Stub u() {
        uml.d("Olink", "getBinder: ");
        if (d == null) {
            d = new WearableServiceImpl();
        }
        return d;
    }

    public synchronized void w() {
        boolean z = true;
        int i = this.b + 1;
        this.b = i;
        if (i != 1) {
            z = false;
        }
        if (!z) {
            uml.d("Olink", "init: inited=" + this.b);
            return;
        }
        uml.e();
        uml.d("Olink", "onCreate: " + this + " start ver:br:wsw/stable#097c6ef");
        wya.c().d(this.a);
        m();
        q14.f().h(new xf3());
        kd5.v().initialize(this.a);
        wml.h().m();
        rml.k().l(this.a);
        vd7.e().f();
        u0c.d().f(this.a);
        x();
    }

    @SuppressLint({"WrongConstant"})
    public final void x() {
        Intent intent = new Intent("com.heytap.wearable.linkservice.action.BOOT");
        intent.setPackage(this.a.getPackageName());
        this.a.sendBroadcast(intent, "com.heytap.wearable.linkservice.permission.WEARABLE");
    }

    public synchronized void y() {
        boolean z = true;
        int i = this.b - 1;
        this.b = i;
        if (i != 0) {
            z = false;
        }
        if (!z) {
            uml.d("Olink", "release: inited=" + this.b);
            return;
        }
        rml.k().q();
        wml.h().v();
        u0c.d().h();
        vd7.e().k();
        kd5.v().j(this.a);
    }

    public final void z(String str, Node node, IRemoveBoundCallback iRemoveBoundCallback) {
        if (node != null) {
            uml.d("Olink", "removeBond: callerPackage=" + str + "\u3000" + node.getNodeId());
            DeviceInfo deviceInfoT = t(node);
            rml.k().f(deviceInfoT);
            utg.g().a(node.getNodeId());
            kd5.v().c(deviceInfoT);
            kd5.v().d(deviceInfoT, iRemoveBoundCallback);
        }
    }
}
