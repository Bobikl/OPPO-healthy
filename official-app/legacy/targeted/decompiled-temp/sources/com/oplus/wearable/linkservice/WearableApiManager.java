package com.oplus.wearable.linkservice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.eqg;
import com.oplus.aiunit.vision.fzb;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.jf3;
import com.oplus.aiunit.vision.lxa;
import com.oplus.aiunit.vision.nre;
import com.oplus.aiunit.vision.pc5;
import com.oplus.aiunit.vision.tc7;
import com.oplus.aiunit.vision.til;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.yil;
import com.oplus.aiunit.vision.zil;
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

/* JADX INFO: loaded from: classes5.dex */
public class WearableApiManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WearableApiManager f20139c;
    public static WearableServiceImpl d;
    public final Context a;
    public int b = 0;

    public final class WearableServiceImpl extends IWearableService.Stub {
        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void addListener(String str, IWearableListener iWearableListener) throws RemoteException {
            if (zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.k(str, iWearableListener);
                return;
            }
            wil.b("Olink", "addListener: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void cancelFile(String str, String str2) throws RemoteException {
            tc7.e().b(str2);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void connect(String str, Node node, boolean z) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                wil.b("Olink", "connect: no bt permission ");
                return;
            }
            if (zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.l(str, node, z);
                return;
            }
            wil.b("Olink", "connect: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void createBond(String str, Node node, byte[] bArr) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                wil.b("Olink", "createBond: no bt permission ");
                return;
            }
            if (zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.o(str, node, bArr);
                return;
            }
            wil.b("Olink", "createBond: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void disconnect(String str, Node node) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                wil.b("Olink", "disconnect: no bt permission ");
                return;
            }
            if (zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.p(str, node);
                return;
            }
            wil.b("Olink", "disconnect: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public List<Node> getBondNodes(String str) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                wil.b("Olink", "getBondNodes: no bt permission ");
                return new ArrayList();
            }
            if (!zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                return new ArrayList();
            }
            List<Node> listR = WearableApiManager.this.r();
            wil.a("Olink", "getBondNodes: callerPackage=" + str + " nodes=" + listR.size());
            return listR;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void getBondNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException {
            if (!zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                onResultCallback.onFailure("Not has permission:com.heytap.wearable.linkservice.permission.WEARABLE");
                return;
            }
            try {
                pc5.v().m(onResultCallback);
            } catch (Exception e2) {
                if (onResultCallback != null) {
                    onResultCallback.onFailure("e " + e2);
                }
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public List<Node> getConnectedNodes(String str) throws RemoteException {
            if (!zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                return new ArrayList();
            }
            try {
                return WearableApiManager.this.s();
            } catch (Exception e2) {
                wil.b("Olink", "getConnectedNodes: e " + e2);
                return new ArrayList();
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void getConnectedNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException {
            if (!zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                onResultCallback.onFailure("Not has permission:com.heytap.wearable.linkservice.permission.WEARABLE");
                return;
            }
            try {
                pc5.v().f(onResultCallback);
            } catch (Exception e2) {
                if (onResultCallback != null) {
                    onResultCallback.onFailure("e " + e2);
                }
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public String getWearOSNodeIdByMac(String str, String str2) throws RemoteException {
            if (!zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                wil.b("Olink", "getWearOSNodeIdByMac: check permission failed " + str);
                return null;
            }
            String strK = pc5.v().k(str2);
            wil.a("Olink", "getWearOSNodeIdByMac: " + Binder.getCallingPid() + " " + gdb.a(str2) + " " + strK);
            return strK;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public FileTransferTask olinkSendFile(String str, FileTransferTask fileTransferTask) {
            return tc7.e().l(str, fileTransferTask.getNodeId(), fileTransferTask);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public boolean receiveFile(String str, int i, String str2, String str3, String str4) throws RemoteException {
            return tc7.e().h(i, str2, str3, str4);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void rejectFile(String str, String str2) throws RemoteException {
            tc7.e().j(str2);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void removeBond(String str, Node node, IRemoveBoundCallback iRemoveBoundCallback) throws RemoteException {
            if (!BluetoothUtil.INSTANCE.g()) {
                wil.b("Olink", "removeBond: no bt permission ");
                return;
            }
            if (zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.z(str, node, iRemoveBoundCallback);
                return;
            }
            wil.b("Olink", "connect: check permission failed " + str);
            if (iRemoveBoundCallback != null) {
                iRemoveBoundCallback.onDeviceRemovalFailed(node.getNodeId(), -1);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void removeListener(String str, IWearableListener iWearableListener) throws RemoteException {
            if (zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                WearableApiManager.this.A(str, iWearableListener);
                return;
            }
            wil.b("Olink", "removeListener: check permission failed " + str);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public boolean sendMessage(String str, String str2, MessageEvent messageEvent, IWearableCallback iWearableCallback) throws RemoteException {
            if (zil.b(WearableApiManager.this.a, "com.heytap.wearable.linkservice.permission.WEARABLE", str)) {
                return WearableApiManager.this.B(str, str2, messageEvent, iWearableCallback);
            }
            wil.b("Olink", "sendMessage: check permission failed " + str);
            return false;
        }

        private WearableServiceImpl() {
        }
    }

    public WearableApiManager(Context context) {
        this.a = context.getApplicationContext();
    }

    public static WearableApiManager v(Context context) {
        if (f20139c == null) {
            synchronized (WearableApiManager.class) {
                if (f20139c == null) {
                    f20139c = new WearableApiManager(context);
                }
            }
        }
        return f20139c;
    }

    public final void A(String str, IWearableListener iWearableListener) {
        wil.d("Olink", "removeListener: " + str);
        yil.h().w(str, iWearableListener);
    }

    public final boolean B(String str, String str2, MessageEvent messageEvent, IWearableCallback iWearableCallback) {
        if (TextUtils.isEmpty(str2)) {
            wil.k("Olink", "sendMessage: mac is empty");
            return false;
        }
        ModuleInfo moduleInfoH = til.k().h(str2);
        if (moduleInfoH != null) {
            return fzb.d().i(moduleInfoH, str, messageEvent, iWearableCallback, messageEvent.getPriority().getPriority());
        }
        wil.a("Olink", "sendMessage: not find node for " + str2);
        return false;
    }

    public final void k(String str, IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            wil.b("Olink", "addListener: listener is null, " + str);
            return;
        }
        wil.d("Olink", "addListener: " + str + "#" + Integer.toHexString(iWearableListener.asBinder().hashCode()));
        yil.h().e(str, iWearableListener);
    }

    public final void l(String str, Node node, boolean z) {
        if (node != null) {
            wil.d("Olink", "connect: callerPackage=" + str + "\u3000" + node + " auto=" + z);
            DeviceInfo deviceInfoT = t(node);
            til.k().o(deviceInfoT);
            pc5.v().i(deviceInfoT, z, false, null);
        }
    }

    public final void m() {
        if (((Boolean) nre.a(this.a, nre.KEY_NEED_CONVERT_DB, Boolean.TRUE)).booleanValue()) {
            try {
                lxa.c().a();
            } catch (Exception e2) {
                wil.k("Olink", "convertNotEncodeDbIfNeed: exception " + e2);
                return;
            }
        }
        nre.b(this.a, nre.KEY_NEED_CONVERT_DB, Boolean.FALSE);
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
            wil.d("Olink", "createBond: callerPackage=" + str + "\u3000" + node);
            DeviceInfo deviceInfoT = t(node);
            til.k().o(deviceInfoT);
            pc5.v().i(deviceInfoT, true, true, bArr);
        }
    }

    public final void p(String str, Node node) {
        if (node != null) {
            wil.d("Olink", "disconnect: callerPackage=" + str + "\u3000" + node);
            DeviceInfo deviceInfoT = t(node);
            til.k().f(deviceInfoT);
            pc5.v().c(deviceInfoT);
        }
    }

    public void q(PrintWriter printWriter, String[] strArr) {
        if (wil.g()) {
            til.k().g(printWriter, strArr);
            pc5.v().a(printWriter, strArr);
            yil.h().f(printWriter, strArr);
            printWriter.flush();
        }
    }

    public final List<Node> r() {
        if (!BluetoothUtil.INSTANCE.g()) {
            wil.b("Olink", "getBondNodes: no bt permission ");
            return new ArrayList();
        }
        List<DeviceInfo> listH = eqg.g().h();
        ArrayList arrayList = new ArrayList();
        Iterator<DeviceInfo> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toNode());
        }
        return arrayList;
    }

    public final List<Node> s() {
        Collection<DeviceInfo> collectionJ = til.k().j();
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
        wil.d("Olink", "getBinder: ");
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
            wil.d("Olink", "init: inited=" + this.b);
            return;
        }
        wil.e();
        wil.d("Olink", "onCreate: " + this + " start ver:br:wsw/release#03460bd");
        lxa.c().d(this.a);
        m();
        d14.f().h(new jf3());
        pc5.v().initialize(this.a);
        yil.h().m();
        til.k().l(this.a);
        tc7.e().f();
        fzb.d().f(this.a);
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
            wil.d("Olink", "release: inited=" + this.b);
            return;
        }
        til.k().q();
        yil.h().v();
        fzb.d().h();
        tc7.e().k();
        pc5.v().j(this.a);
    }

    public final void z(String str, Node node, IRemoveBoundCallback iRemoveBoundCallback) {
        if (node != null) {
            wil.d("Olink", "removeBond: callerPackage=" + str + "\u3000" + node.getNodeId());
            DeviceInfo deviceInfoT = t(node);
            til.k().f(deviceInfoT);
            eqg.g().a(node.getNodeId());
            pc5.v().c(deviceInfoT);
            pc5.v().d(deviceInfoT, iRemoveBoundCallback);
        }
    }
}
