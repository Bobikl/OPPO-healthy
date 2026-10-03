package com.heytap.epona.ipc.local;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.epona.IRemoteTransfer;
import com.heytap.epona.ITransferCallback;
import com.heytap.epona.Request;
import com.heytap.epona.Response;
import com.heytap.epona.ipc.local.RemoteTransfer;
import com.oplus.aiunit.vision.fp6;
import com.oplus.aiunit.vision.mu5;
import com.oplus.aiunit.vision.oee;
import com.oplus.aiunit.vision.s7b;
import com.oplus.aiunit.vision.vr2;
import com.oplus.aiunit.vision.x2f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class RemoteTransfer extends IRemoteTransfer.Stub {
    public static final String APP_PLATFORM_PACKAGE_NAME = "com.heytap.appplatform";
    private static final String TAG = "RemoteTransfer";
    private static volatile RemoteTransfer sInstance;
    private Map<String, IRemoteTransfer> mTransferCache = new HashMap();

    private RemoteTransfer() {
        oee.a().b(fp6.f());
        s7b.b(TAG, "init PermissionCheck in RemoteTransfer", new Object[0]);
    }

    private boolean checkEponaPermission(Request request) {
        if (request == null || fp6.e() == null) {
            s7b.c(TAG, "Request is null.", new Object[0]);
            return true;
        }
        String packageName = fp6.e().getPackageName();
        return oee.a().d(request.getComponentName(), request.getActionName(), packageName);
    }

    private boolean dispatcherProviderExist() {
        Context contextF = fp6.f();
        return (contextF == null || contextF.getPackageManager().resolveContentProvider("com.heytap.appplatform.dispatcher", 131072) == null) ? false : true;
    }

    public static RemoteTransfer getInstance() {
        if (sInstance == null) {
            synchronized (RemoteTransfer.class) {
                if (sInstance == null) {
                    sInstance = new RemoteTransfer();
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$asyncCall$0(ITransferCallback iTransferCallback, Response response) {
        try {
            iTransferCallback.onReceive(response);
        } catch (RemoteException e2) {
            s7b.c(TAG, "failed to asyncCall and exception is %s", e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findRemoteTransfer$1(String str) {
        this.mTransferCache.remove(str);
    }

    @Override // com.heytap.epona.IRemoteTransfer
    public void asyncCall(Request request, final ITransferCallback iTransferCallback) throws RemoteException {
        if (!oee.a().c() || checkEponaPermission(request)) {
            fp6.j(request).c(new vr2() { // from class: com.oplus.aiunit.vision.tof
                @Override // com.oplus.aiunit.vision.vr2
                public final void onReceive(Response response) {
                    RemoteTransfer.lambda$asyncCall$0(iTransferCallback, response);
                }
            });
            return;
        }
        s7b.c(TAG, "Epona Authentication failed, request : " + request.toString(), new Object[0]);
        iTransferCallback.onReceive(Response.errorResponse("Epona Authentication failed, request : " + request.toString()));
    }

    @Override // com.heytap.epona.IRemoteTransfer
    public Response call(Request request) throws RemoteException {
        if (!oee.a().c() || checkEponaPermission(request)) {
            return fp6.j(request).d();
        }
        s7b.c(TAG, "Epona Authentication failed, request : " + request.toString(), new Object[0]);
        return Response.errorResponse("Epona Authentication failed, request : " + request.toString());
    }

    public IRemoteTransfer findRemoteTransfer(final String str) {
        IBinder binder = null;
        if (!dispatcherProviderExist()) {
            s7b.b(TAG, "DispatcherProvider is not exist", new Object[0]);
            return null;
        }
        IRemoteTransfer iRemoteTransferAsInterface = this.mTransferCache.get(str);
        if (iRemoteTransferAsInterface == null) {
            Context contextF = fp6.f();
            if ("com.heytap.appplatform".equals(contextF.getPackageName())) {
                binder = mu5.c().b(str);
            } else {
                new Bundle().putString("com.heytap.epona.Dispatcher.TRANSFER_KEY", str);
                Bundle bundleA = x2f.a(contextF, str);
                if (bundleA != null) {
                    binder = bundleA.getBinder("com.heytap.epona.Dispatcher.TRANSFER_VALUE");
                } else {
                    s7b.c(TAG, "Find remote transfer bundle null.", new Object[0]);
                }
            }
            if (binder != null) {
                iRemoteTransferAsInterface = IRemoteTransfer.Stub.asInterface(binder);
                this.mTransferCache.put(str, iRemoteTransferAsInterface);
                try {
                    binder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.sof
                        @Override // android.os.IBinder.DeathRecipient
                        public final void binderDied() {
                            this.a.lambda$findRemoteTransfer$1(str);
                        }
                    }, 0);
                } catch (RemoteException e2) {
                    s7b.f(TAG, e2.toString(), new Object[0]);
                }
            } else {
                s7b.c(TAG, "Get remote binder null. ComponentName : %s", str);
            }
        }
        return iRemoteTransferAsInterface;
    }

    @Override // com.heytap.epona.IRemoteTransfer.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (RuntimeException e2) {
            s7b.c(TAG, "onTransact Exception: " + e2.toString(), new Object[0]);
            throw e2;
        }
    }

    public void registerToRemote(String str, String str2) {
        boolean zE;
        if (!dispatcherProviderExist()) {
            s7b.b(TAG, "DispatcherProvider is not exist", new Object[0]);
            return;
        }
        Context contextF = fp6.f();
        if ("com.heytap.appplatform".equals(contextF.getPackageName())) {
            zE = mu5.c().e(str, this, "com.heytap.appplatform");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("com.heytap.epona.Dispatcher.TRANSFER_KEY", str);
            bundle.putBinder("com.heytap.epona.Dispatcher.TRANSFER_VALUE", this);
            zE = contextF.getContentResolver().call("com.heytap.appplatform.dispatcher", "com.heytap.epona.Dispatcher.REGISTER_TRANSFER", (String) null, bundle).getBoolean("REGISTER_TRANSFER_RESULT");
        }
        if (zE) {
            return;
        }
        s7b.f(TAG, "Register " + str + "==>" + str2 + " failed for \"" + str + "\" is already registered", new Object[0]);
    }

    public String remoteSnapshot() {
        Bundle bundleCall;
        if (dispatcherProviderExist() && (bundleCall = fp6.f().getContentResolver().call("com.heytap.appplatform.dispatcher", "com.heytap.epona.Dispatcher.REMOTE_SNAPSHOT", (String) null, (Bundle) null)) != null) {
            return bundleCall.getString("REMOTE_SNAPSHOT");
        }
        return null;
    }
}
