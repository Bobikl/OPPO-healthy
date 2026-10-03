package com.oplus.health.apiprovider;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.heytap.health.annotation.ProcessName;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ani;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.i70;
import com.oplus.aiunit.vision.o2f;
import com.oplus.health.apiprovider.host.ServiceManager;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class ClientManager {
    private static final String TAG = "ClientManager";
    private static ClientManager mClientManager;
    private final o2f mHelper;
    private String mPackageName;
    private final ProcessName mProcessName;
    private final ProcessReceiver mProcessReceiver;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;
    private final com.oplus.health.apiprovider.a<String, IInterface> mServiceCache = new com.oplus.health.apiprovider.a<>(new com.oplus.health.apiprovider.a.b() { // from class: com.oplus.aiunit.vision.sf3
        @Override // com.oplus.health.apiprovider.a.b
        public final IBinder a(Object obj) {
            return ((IInterface) obj).asBinder();
        }
    });
    private final Set<b> mDumpables = new HashSet();
    private final HashMap<String, i70> mConfigMap = new HashMap<>();
    private final HashMap<String, ProcessName> mDynamicService = new HashMap<>();
    private final Set<d> mOnServiceStatusListener = new HashSet();
    private final Set<c> mOnBinderFirstGet = new HashSet();
    private final IServiceCallback mServiceCallback = new IServiceCallback.Stub() { // from class: com.oplus.health.apiprovider.ClientManager.1
        @Override // com.oplus.health.apiprovider.IServiceCallback
        public String dumpWithParam(String[] strArr) throws RemoteException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
            try {
                printWriter.append((CharSequence) "====####==== dump pid=").append((CharSequence) String.valueOf(Process.myPid())).append((CharSequence) " mPackage=").append((CharSequence) ClientManager.this.mPackageName).append((CharSequence) Weather.SEPARATOR);
                try {
                    for (b bVar : ClientManager.this.mDumpables) {
                        printWriter.append((CharSequence) "dump with ").append((CharSequence) String.valueOf(bVar)).append((CharSequence) Weather.SEPARATOR);
                        bVar.dumpWithParam(printWriter, strArr);
                    }
                } catch (Exception e2) {
                    printWriter.append((CharSequence) "    ERROE:").append((CharSequence) Weather.SEPARATOR);
                    a7b.b(ClientManager.TAG, "Exception e" + e2.getMessage());
                    printWriter.close();
                }
                printWriter.flush();
                String string = byteArrayOutputStream.toString();
                printWriter.close();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return string;
            } catch (Throwable th) {
                printWriter.close();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        }

        @Override // com.oplus.health.apiprovider.IServiceCallback
        public void onRemoteDied(String str) throws RemoteException {
            HashSet hashSet;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ClientManager.this.mConfigMap.entrySet()) {
                if (((i70) entry.getValue()).f12405c.mPName.equals(str)) {
                    arrayList.add((String) entry.getKey());
                }
            }
            synchronized (ClientManager.this.mDynamicService) {
                for (Map.Entry entry2 : ClientManager.this.mDynamicService.entrySet()) {
                    if (((ProcessName) entry2.getValue()).mPName.equals(str)) {
                        arrayList.add((String) entry2.getKey());
                    }
                }
            }
            a7b.m(ClientManager.TAG, "onRemoteDied: " + str + " " + arrayList);
            synchronized (ClientManager.this.mServiceCache) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    onServiceRemoved((String) it.next(), str);
                }
            }
            synchronized (ClientManager.this.mOnServiceStatusListener) {
                hashSet = new HashSet(ClientManager.this.mOnServiceStatusListener);
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).b(arrayList, ProcessName.getProcessNameByName(str));
            }
        }

        @Override // com.oplus.health.apiprovider.IServiceCallback
        public void onServiceAdd(String str, String str2) throws RemoteException {
            HashSet hashSet;
            a7b.m(ClientManager.TAG, "onServiceAdd: " + str);
            synchronized (ClientManager.this.mOnServiceStatusListener) {
                hashSet = new HashSet(ClientManager.this.mOnServiceStatusListener);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(str, ProcessName.getProcessNameByName(str2));
            }
        }

        @Override // com.oplus.health.apiprovider.IServiceCallback
        public void onServiceRemoved(String str, String str2) throws RemoteException {
            HashSet hashSet;
            try {
                a7b.m(ClientManager.TAG, "onServiceRemoved: " + str);
                ClientManager.this.mWriteLock.lock();
                ClientManager.this.mServiceCache.g(str);
                synchronized (ClientManager.this.mDynamicService) {
                    ClientManager.this.mDynamicService.remove(str);
                }
                synchronized (ClientManager.this.mOnServiceStatusListener) {
                    hashSet = new HashSet(ClientManager.this.mOnServiceStatusListener);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c(str, ProcessName.getProcessNameByName(str2));
                }
                ClientManager.this.mWriteLock.unlock();
            } catch (Throwable th) {
                ClientManager.this.mWriteLock.unlock();
                throw th;
            }
        }
    };

    public interface a<T> {
        T a(IBinder iBinder);
    }

    public interface b {
        void dumpWithParam(PrintWriter printWriter, String[] strArr);
    }

    public interface c {
        void a(String str, ProcessName processName);
    }

    public interface d {
        void a(String str, ProcessName processName);

        void b(List<String> list, ProcessName processName);

        void c(String str, ProcessName processName);
    }

    public ClientManager() {
        ArrayList<i70> arrayList = new ArrayList();
        ani.b(b78.a(), arrayList);
        for (i70 i70Var : arrayList) {
            this.mConfigMap.put(i70Var.b, i70Var);
        }
        Context contextA = b78.a();
        this.mPackageName = contextA.getPackageName();
        o2f o2fVar = new o2f(contextA, contextA.getPackageName(), this.mServiceCallback);
        this.mHelper = o2fVar;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        this.mProcessReceiver = new ProcessReceiver(o2fVar);
        this.mProcessName = ProcessName.getProcessNameByName(gxe.c().replace(this.mPackageName, ""));
    }

    public static ClientManager getInstance() {
        if (mClientManager == null) {
            synchronized (ClientManager.class) {
                if (mClientManager == null) {
                    mClientManager = new ClientManager();
                }
            }
        }
        return mClientManager;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    private <T extends IInterface> T getService(String str, ProcessName processName, @Nullable Semaphore semaphore, boolean z, a<T> aVar) {
        boolean zPingBinder;
        HashSet hashSet;
        try {
            this.mReadLock.lock();
            T tA = (T) this.mServiceCache.d(str);
            this.mReadLock.unlock();
            if (tA != null) {
                zPingBinder = tA.asBinder().pingBinder();
                a7b.f(TAG, "getService name:" + str + ",pingBinder:" + zPingBinder);
                if (!zPingBinder) {
                    try {
                        this.mWriteLock.lock();
                        this.mServiceCache.g(str);
                        this.mWriteLock.unlock();
                        tA = null;
                    } catch (Throwable th) {
                        this.mWriteLock.unlock();
                        throw th;
                    }
                }
            } else {
                zPingBinder = true;
            }
            if (tA == null) {
                IServiceManager serviceManager = this.mProcessName == processName ? ServiceManager.getInstance(b78.a(), processName) : this.mHelper.f(processName, z, zPingBinder);
                try {
                    if (serviceManager != null) {
                        boolean zTryAcquire = semaphore != null ? semaphore.tryAcquire() : false;
                        try {
                            IBinder service = serviceManager.getService(str, z);
                            if (zTryAcquire) {
                                semaphore.release();
                            }
                            tA = aVar.a(service);
                        } catch (Throwable th2) {
                            if (zTryAcquire) {
                                semaphore.release();
                            }
                            throw th2;
                        }
                    } else {
                        a7b.f(TAG, "getService: ism is null " + str);
                    }
                    if (tA != null) {
                        try {
                            this.mWriteLock.lock();
                            if (this.mServiceCache.d(str) == null) {
                                this.mServiceCache.f(str, tA);
                                synchronized (this.mOnBinderFirstGet) {
                                    hashSet = new HashSet(this.mOnBinderFirstGet);
                                }
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    ((c) it.next()).a(str, processName);
                                }
                            }
                            this.mWriteLock.unlock();
                        } catch (Throwable th3) {
                            this.mWriteLock.unlock();
                            throw th3;
                        }
                    }
                } catch (RemoteException e2) {
                    a7b.m(TAG, "getService: exception " + e2);
                }
            }
            return tA;
        } catch (Throwable th4) {
            this.mReadLock.unlock();
            throw th4;
        }
    }

    public void addDumpables(b bVar) {
        this.mDumpables.add(bVar);
    }

    public void addDynamicService(String str, ProcessName processName, IBinder iBinder) {
        IServiceManager iServiceManagerE = this.mHelper.e(processName, true);
        try {
            if (iServiceManagerE != null) {
                iServiceManagerE.addService(str, iBinder);
                synchronized (this.mDynamicService) {
                    this.mDynamicService.put(str, processName);
                }
                return;
            }
            a7b.f(TAG, "addService: ism is null " + str);
        } catch (RemoteException e2) {
            a7b.m(TAG, "addService: exception " + e2);
        }
    }

    public void addOnBinderFirstGetListener(c cVar) {
        synchronized (this.mOnBinderFirstGet) {
            this.mOnBinderFirstGet.add(cVar);
        }
    }

    public void addServiceStatusListener(d dVar) {
        synchronized (this.mOnServiceStatusListener) {
            this.mOnServiceStatusListener.add(dVar);
        }
    }

    @Nullable
    public <T extends IInterface> T getBuildService(String str, a<T> aVar) {
        return (T) getBuildService(str, true, aVar);
    }

    public HashMap<String, i70> getConfigMap() {
        return this.mConfigMap;
    }

    @Nullable
    public <T extends IInterface> T getDynamicService(String str, ProcessName processName, boolean z, a<T> aVar) {
        return (T) getService(str, processName, null, z, aVar);
    }

    public o2f getHelper() {
        return this.mHelper;
    }

    public void init(Context context) {
        this.mProcessReceiver.b(context);
    }

    public void removeBuildService(String str) {
        i70 i70Var = this.mConfigMap.get(str);
        if (i70Var == null) {
            return;
        }
        removeService(str, i70Var.f12405c);
    }

    public void removeDumpables(b bVar) {
        this.mDumpables.remove(bVar);
    }

    public void removeService(String str, ProcessName processName) {
        IServiceManager iServiceManagerE = this.mHelper.e(processName, false);
        try {
            if (iServiceManagerE != null) {
                iServiceManagerE.removeService(str);
            } else {
                a7b.f(TAG, "removeService: ism is null " + str);
            }
        } catch (RemoteException e2) {
            a7b.m(TAG, "removeService: exception " + e2);
        }
    }

    public void removeServiceStatusListener(d dVar) {
        synchronized (this.mOnServiceStatusListener) {
            this.mOnServiceStatusListener.remove(dVar);
        }
    }

    @Nullable
    public <T extends IInterface> T getBuildService(String str, boolean z, a<T> aVar) {
        i70 i70Var = this.mConfigMap.get(str);
        if (i70Var != null) {
            return (T) getService(str, i70Var.f12405c, i70Var.d, z, aVar);
        }
        a7b.b(TAG, "getBuildService: apiConfig is null " + this.mConfigMap);
        return null;
    }
}
