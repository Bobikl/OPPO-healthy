package com.platform.usercenter.account.ams.ipc.support;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.IBinder;
import com.platform.usercenter.account.ams.ipc.IAmsBinder;
import com.platform.usercenter.account.ams.ipc.RequestConstant;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.account.ams.ipc.utils.AcIpcLogUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class AcIpcBinderProvider {
    private static final String TAG = "AcIpcBinderProvider";
    private final ArrayList<AcInnerCallbackWrapper> mCallbacks;
    private IBinder.DeathRecipient mDeath;
    private IAmsBinder sIAmsBinder;
    private IBinder sLinkedBinder;

    public static class AcIpcBinderProviderHolder {
        private static final AcIpcBinderProvider sINSTANCE = new AcIpcBinderProvider();

        private AcIpcBinderProviderHolder() {
        }
    }

    private boolean binderValid(IAmsBinder iAmsBinder) {
        return iAmsBinder != null && iAmsBinder.asBinder().isBinderAlive();
    }

    private IBinder.DeathRecipient getDeathRecipient(Context context) {
        if (this.mDeath == null) {
            this.mDeath = new IBinder.DeathRecipient() { // from class: com.platform.usercenter.account.ams.ipc.support.AcIpcBinderProvider.1
                @Override // android.os.IBinder.DeathRecipient
                public void binderDied() {
                    AcIpcLogUtil.e(AcIpcBinderProvider.TAG, "Binder is dead! callback size: " + AcIpcBinderProvider.this.mCallbacks.size());
                    AcIpcBinderProvider.this.reset();
                    ArrayList arrayList = new ArrayList(AcIpcBinderProvider.this.mCallbacks);
                    AcIpcBinderProvider.this.mCallbacks.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        IAcIpcRequestCallback<Object> callback = ((AcInnerCallbackWrapper) it.next()).getCallback();
                        ResponseEnum responseEnum = ResponseEnum.REMOTE_SERVICE_DEAD;
                        callback.call(new AcIpcResponse(responseEnum.getCode(), responseEnum.getRemark(), null));
                    }
                }
            };
        }
        return this.mDeath;
    }

    public static AcIpcBinderProvider getInstance() {
        return AcIpcBinderProviderHolder.sINSTANCE;
    }

    private IAmsBinder requireBinder(Context context, String str, IAcIpcUriProvider iAcIpcUriProvider) {
        ContentProviderClient providerClient;
        try {
            providerClient = iAcIpcUriProvider.getProviderClient(context);
            try {
                unlinkDeathLocked();
                IAmsBinder iAmsBinderAsInterface = providerClient != null ? IAmsBinder.Stub.asInterface(providerClient.call(RequestConstant.BINDER_REQUEST, null, null).getBinder(RequestConstant.KEY_GET_BINDER)) : null;
                this.sIAmsBinder = iAmsBinderAsInterface;
                if (iAmsBinderAsInterface != null) {
                    iAmsBinderAsInterface.asBinder().linkToDeath(getDeathRecipient(context), 0);
                    this.sLinkedBinder = this.sIAmsBinder.asBinder();
                }
                if (this.sIAmsBinder == null) {
                    reset();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("requireBinder, traceId: ");
                sb.append(str);
                sb.append(", binder is null? ");
                sb.append(this.sIAmsBinder == null);
                AcIpcLogUtil.i(TAG, sb.toString());
                IAmsBinder iAmsBinder = this.sIAmsBinder;
                if (providerClient == null) {
                    AcIpcLogUtil.e(TAG, "close providerClient but providerClient = null");
                } else {
                    providerClient.close();
                }
                return iAmsBinder;
            } catch (Throwable th) {
                th = th;
                try {
                    AcIpcLogUtil.e(TAG, "requireBinder, traceId: " + str + ", error:", th);
                    reset();
                    if (providerClient == null) {
                    }
                    return null;
                } finally {
                    if (providerClient != null) {
                        providerClient.close();
                    } else {
                        AcIpcLogUtil.e(TAG, "close providerClient but providerClient = null");
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            providerClient = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset() {
        unlinkDeathLocked();
        this.sIAmsBinder = null;
    }

    private void unlinkDeathLocked() {
        IBinder.DeathRecipient deathRecipient;
        IBinder iBinder = this.sLinkedBinder;
        if (iBinder == null || (deathRecipient = this.mDeath) == null) {
            this.sLinkedBinder = null;
            return;
        }
        try {
            iBinder.unlinkToDeath(deathRecipient, 0);
        } catch (Throwable th) {
            AcIpcLogUtil.e(TAG, "unlinkToDeath error:", th);
        }
        this.sLinkedBinder = null;
    }

    public IAmsBinder get(Context context, boolean z, String str, IAcIpcUriProvider iAcIpcUriProvider) {
        IAmsBinder iAmsBinder = this.sIAmsBinder;
        if (!z && binderValid(iAmsBinder)) {
            AcIpcLogUtil.i(TAG, "get binder,binder has valid cache");
            return iAmsBinder;
        }
        requireBinder(context, str, iAcIpcUriProvider);
        AcIpcLogUtil.i(TAG, "get binder,get binder from ContentProvider");
        return this.sIAmsBinder;
    }

    public void register(AcInnerCallbackWrapper acInnerCallbackWrapper) {
        AcIpcLogUtil.i(TAG, "register callback : " + acInnerCallbackWrapper);
        this.mCallbacks.add(acInnerCallbackWrapper);
    }

    public void unregister(AcInnerCallbackWrapper acInnerCallbackWrapper) {
        AcIpcLogUtil.i(TAG, "unregister callback : " + acInnerCallbackWrapper);
        this.mCallbacks.remove(acInnerCallbackWrapper);
    }

    private AcIpcBinderProvider() {
        this.mCallbacks = new ArrayList<>();
    }
}
