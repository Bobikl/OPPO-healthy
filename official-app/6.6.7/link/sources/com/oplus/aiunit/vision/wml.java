package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.os.BundleCompat;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.WearableListenerService;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import com.oplus.weatherservicesdk.model.SecureSettingsData;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wml {
    public static volatile wml e;
    public final Map<String, pml> a = new HashMap();
    public a b;
    public final Lock c;
    public final Lock d;

    public final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 100:
                    Bundle data = message.getData();
                    if (data != null) {
                        wml.this.s(data.getString("node_id"), (MessageEvent) BundleCompat.getParcelable(data, "message_event", MessageEvent.class));
                        break;
                    }
                    break;
                case 102:
                    wml.this.r((FileTransferTask) message.obj);
                    break;
                case 103:
                    wml.this.q((FileTransferTask) message.obj);
                    break;
                case 104:
                    wml.this.p((FileTransferTask) message.obj);
                    break;
            }
        }
    }

    public wml() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.writeLock();
        this.d = reentrantReadWriteLock.readLock();
        this.b = new a(Looper.getMainLooper());
    }

    public static wml h() {
        if (e == null) {
            synchronized (wml.class) {
                if (e == null) {
                    e = new wml();
                }
            }
        }
        return e;
    }

    public void e(String str, IWearableListener iWearableListener) {
        try {
            this.d.lock();
            pml pmlVar = this.a.get(str);
            this.d.unlock();
            if (pmlVar != null) {
                pmlVar.l(iWearableListener);
            }
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public void f(PrintWriter printWriter, String[] strArr) {
        printWriter.println("WearableProxyManager:");
        try {
            this.d.lock();
            printWriter.println("  mClientProxies: " + this.a.size());
            for (Map.Entry<String, pml> entry : this.a.entrySet()) {
                printWriter.println(entry.getKey() + "    " + entry.getValue().toString());
            }
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public pml g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            this.d.lock();
            return this.a.get(str);
        } finally {
            this.d.unlock();
        }
    }

    public void i(FileTransferTask fileTransferTask) {
        a aVar = this.b;
        if (aVar != null) {
            this.b.sendMessage(aVar.obtainMessage(104, fileTransferTask));
        }
    }

    public void j(FileTransferTask fileTransferTask) {
        a aVar = this.b;
        if (aVar != null) {
            this.b.sendMessage(aVar.obtainMessage(103, fileTransferTask));
        }
    }

    public void k(FileTransferTask fileTransferTask) {
        a aVar = this.b;
        if (aVar != null) {
            this.b.sendMessage(aVar.obtainMessage(102, fileTransferTask));
        }
    }

    public void l(String str, MessageEvent messageEvent) {
        a aVar = this.b;
        if (aVar != null) {
            Message messageObtainMessage = aVar.obtainMessage(100);
            Bundle bundle = new Bundle();
            bundle.putString("node_id", str);
            bundle.putParcelable("message_event", messageEvent);
            messageObtainMessage.setData(bundle);
            this.b.sendMessage(messageObtainMessage);
        }
    }

    public void m() {
        List<PackageInfo> packagesHoldingPermissions = e88.a().getPackageManager().getPackagesHoldingPermissions(new String[]{"com.heytap.wearable.linkservice.permission.WEARABLE"}, 128);
        try {
            this.c.lock();
            if (this.a.size() > 0) {
                this.a.clear();
            }
            Iterator<PackageInfo> it = packagesHoldingPermissions.iterator();
            while (it.hasNext()) {
                pml pmlVarT = t(it.next());
                this.a.put(pmlVarT.c(), pmlVarT);
            }
        } finally {
            this.c.unlock();
        }
    }

    public void n(DeviceInfo deviceInfo) {
        try {
            this.d.lock();
            Iterator<pml> it = this.a.values().iterator();
            while (it.hasNext()) {
                it.next().e(deviceInfo);
            }
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public void o(DeviceInfo deviceInfo, int i) {
        try {
            this.d.lock();
            Iterator<pml> it = this.a.values().iterator();
            while (it.hasNext()) {
                it.next().f(deviceInfo);
            }
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public final void p(FileTransferTask fileTransferTask) {
        if (fileTransferTask == null) {
            return;
        }
        try {
            this.d.lock();
            for (pml pmlVar : this.a.values()) {
                if (pmlVar.m(fileTransferTask.getServiceId())) {
                    pmlVar.g(fileTransferTask);
                }
            }
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public final void q(FileTransferTask fileTransferTask) {
        if (fileTransferTask == null) {
            return;
        }
        try {
            this.d.lock();
            for (pml pmlVar : this.a.values()) {
                if (pmlVar.m(fileTransferTask.getServiceId())) {
                    pmlVar.h(fileTransferTask);
                }
            }
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public final void r(FileTransferTask fileTransferTask) {
        if (fileTransferTask == null) {
            return;
        }
        try {
            this.d.lock();
            for (pml pmlVar : this.a.values()) {
                if (pmlVar.m(fileTransferTask.getServiceId())) {
                    pmlVar.i(fileTransferTask);
                }
            }
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public final void s(String str, MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        try {
            this.d.lock();
            Collection<pml> collectionValues = this.a.values();
            if (collectionValues.size() == 0) {
                uml.b("WearableProxyManager", "onMessageEvent: not find client");
            }
            boolean z = false;
            for (pml pmlVar : collectionValues) {
                if (pmlVar.m(messageEvent.getServiceId())) {
                    pmlVar.j(str, messageEvent);
                    z = true;
                }
            }
            if (!z) {
                uml.k("WearableProxyManager", "onMessageEvent: not client register " + messageEvent.getServiceId());
            }
        } finally {
            this.d.unlock();
        }
    }

    public final pml t(PackageInfo packageInfo) {
        ComponentName componentName;
        List<ResolveInfo> listQueryIntentServices = e88.a().getPackageManager().queryIntentServices(new Intent(WearableListenerService.BIND_INTENT_ACTION), 131072);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && TextUtils.equals(serviceInfo.packageName, packageInfo.packageName)) {
                arrayList.add(resolveInfo);
            }
        }
        if (arrayList.size() > 0) {
            ServiceInfo serviceInfo2 = ((ResolveInfo) arrayList.get(0)).serviceInfo;
            componentName = new ComponentName(serviceInfo2.packageName, serviceInfo2.name);
            uml.d("WearableProxyManager", "parsePackageInfo: listener service is " + componentName);
        } else {
            componentName = null;
        }
        Bundle bundle = packageInfo.applicationInfo.metaData;
        Set<Integer> setU = u(bundle != null ? String.valueOf(bundle.get("serviceId")) : "");
        pml pmlVar = new pml(e88.a(), packageInfo.packageName);
        pmlVar.b(componentName);
        pmlVar.o(setU);
        return pmlVar;
    }

    public final Set<Integer> u(String str) {
        if (str == null) {
            return null;
        }
        HashSet<String> hashSet = new HashSet(Arrays.asList(str.split(SecureSettingsData.SEPARATOR)));
        HashSet hashSet2 = new HashSet();
        for (String str2 : hashSet) {
            if (!TextUtils.isEmpty(str2)) {
                Integer numValueOf = TextUtils.isDigitsOnly(str2) ? Integer.valueOf(str2) : str2.matches("0[xX][0-9,a-fA-F]+") ? Integer.valueOf(str2.substring(2), 16) : null;
                if (numValueOf != null) {
                    hashSet2.add(numValueOf);
                }
            }
        }
        return hashSet2;
    }

    public void v() {
        try {
            this.c.lock();
            this.a.clear();
        } finally {
            this.c.unlock();
        }
    }

    public void w(String str, IWearableListener iWearableListener) {
        try {
            this.d.lock();
            pml pmlVar = this.a.get(str);
            this.d.unlock();
            if (pmlVar != null) {
                pmlVar.n(iWearableListener);
            }
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }
}
