package com.heytap.accessory.file;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.heytap.accessory.api.IDeathCallback;
import com.heytap.accessory.authcode.AuthenticationManager;
import com.heytap.accessory.core.IFileManager;
import com.heytap.accessory.file.model.CancelAllRequest;
import com.heytap.accessory.file.model.CancelFileRequest;
import com.heytap.accessory.file.model.FTOperateEntity;
import com.heytap.accessory.file.model.FileReceiveEntity;
import com.heytap.accessory.file.model.FileSendEntity;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public class FileServiceNative extends IFileManager.Stub {
    public static final String b = "FileServiceNative";
    public static boolean d;
    public Context a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2543c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static RemoteCallbackList<IDeathCallback> f2544e = new a();

    public class a extends RemoteCallbackList<IDeathCallback> {
        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(IDeathCallback iDeathCallback, Object obj) {
            long jLongValue = ((Long) obj).longValue();
            com.heytap.accessory.base.logging.a.a(FileServiceNative.b, "onCallbackDied fileCancelKey:" + jLongValue);
            synchronized (FileServiceNative.f2543c) {
                if (e.a(com.heytap.accessory.file.utils.a.a()) != null) {
                    if (FileServiceNative.d) {
                        e.a(com.heytap.accessory.file.utils.a.a()).a(String.valueOf(jLongValue));
                    } else {
                        e.a(com.heytap.accessory.file.utils.a.a()).a(jLongValue);
                    }
                }
            }
        }
    }

    public FileServiceNative(Context context) {
        this.a = context;
    }

    @Override // com.heytap.accessory.core.IFileManager
    public boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException {
        return AuthenticationManager.checkPermission(this.a, Binder.getCallingUid(), Binder.getCallingPid(), str, false);
    }

    @Override // com.heytap.accessory.core.IFileManager
    public boolean registerCallbackFacilitator(int i, ResultReceiver resultReceiver) throws RemoteException {
        return e.a(this.a).a(i, resultReceiver);
    }

    @Override // com.heytap.accessory.core.IFileManager
    public boolean registerDeathCallback(IDeathCallback iDeathCallback, long j2, long j3) throws RemoteException {
        com.heytap.accessory.base.logging.a.a(b, "registerDeathCallback: agentId = " + j2 + " connectionId = " + j3);
        if (j2 > 0) {
            d = true;
        } else {
            d = false;
            j2 = j3;
        }
        int registeredCallbackCount = f2544e.getRegisteredCallbackCount();
        for (int i = 0; i < registeredCallbackCount; i++) {
            IDeathCallback iDeathCallback2 = (IDeathCallback) f2544e.getRegisteredCallbackItem(i);
            long jLongValue = ((Long) f2544e.getRegisteredCallbackCookie(i)).longValue();
            if (iDeathCallback.getAppName().equals(iDeathCallback2.getAppName()) && j2 != jLongValue) {
                com.heytap.accessory.base.logging.a.a(b, "registerDeathCallback: fileCancelKey update, remove former callback");
                f2544e.unregister(iDeathCallback);
                break;
            }
            if (iDeathCallback.getAppName().equals(iDeathCallback2.getAppName())) {
                com.heytap.accessory.base.logging.a.a(b, "registerDeathCallback: already register!");
                return false;
            }
        }
        return f2544e.register(iDeathCallback, Long.valueOf(j2));
    }

    @Override // com.heytap.accessory.core.IFileManager
    public Bundle sendCommand(String str) throws RemoteException {
        AuthenticationManager.check(this.a, Binder.getCallingUid(), Binder.getCallingPid(), true);
        Bundle bundle = new Bundle();
        FTOperateEntity fTOperateEntity = new FTOperateEntity();
        try {
            String str2 = b;
            com.heytap.accessory.base.logging.a.a(str2, "sendCommand commandData:" + str);
            fTOperateEntity.fromJSON(str);
            String string = fTOperateEntity.getParams().toString();
            int opCode = fTOperateEntity.getOpCode();
            if (opCode == 3) {
                CancelFileRequest cancelFileRequest = new CancelFileRequest();
                try {
                    cancelFileRequest.fromJSON(string);
                    int transactionId = cancelFileRequest.getTransactionId();
                    long connectionId = cancelFileRequest.getConnectionId();
                    if (e.a(this.a) == null) {
                        return bundle;
                    }
                    e.a(this.a).a(connectionId, transactionId);
                    return bundle;
                } catch (JSONException unused) {
                    com.heytap.accessory.base.logging.a.d(b, "json marshaling failed");
                    return bundle;
                }
            }
            if (opCode == 4) {
                FileSendEntity fileSendEntity = new FileSendEntity();
                try {
                    fileSendEntity.fromJSON(string);
                    bundle = e.a(this.a).a(fileSendEntity.getSrcFilePath(), fileSendEntity.getDestFilePath(), fileSendEntity.getFileInfo(), new com.heytap.accessory.file.model.b(fileSendEntity.getPeerID(), fileSendEntity.getContainerID(), fileSendEntity.getAccessoryID()), fileSendEntity.getFileSize(), fileSendEntity.getFileName(), fileSendEntity.getFileURI(), fileSendEntity.getPackageName(), fileSendEntity.getAgentClassName());
                    return bundle;
                } catch (JSONException unused2) {
                    com.heytap.accessory.base.logging.a.d(b, "json marshaling failed");
                    return bundle;
                }
            }
            if (opCode != 5) {
                if (opCode != 6) {
                    com.heytap.accessory.base.logging.a.d(str2, "Wrong commandId");
                    return bundle;
                }
                CancelAllRequest cancelAllRequest = new CancelAllRequest();
                try {
                    cancelAllRequest.fromJSON(string);
                    bundle.putInt("receiveStatus", e.a(this.a) != null ? e.a(this.a).a(cancelAllRequest.getAgentId()) : -1);
                    return bundle;
                } catch (JSONException unused3) {
                    com.heytap.accessory.base.logging.a.d(b, "json marshaling failed");
                    return bundle;
                }
            }
            FileReceiveEntity fileReceiveEntity = new FileReceiveEntity();
            try {
                com.heytap.accessory.base.logging.a.a(str2, "FILE_TRANSFER_ACCEPT_URI data=" + string);
                fileReceiveEntity.fromJSON(string);
                bundle.putInt("receiveStatus", e.a(this.a) != null ? e.a(this.a).a(fileReceiveEntity.getConnectionId(), fileReceiveEntity.getId(), fileReceiveEntity.getPath(), fileReceiveEntity.getFileUri(), fileReceiveEntity.isAccept()) : -1);
                return bundle;
            } catch (JSONException unused4) {
                com.heytap.accessory.base.logging.a.d(b, "json marshaling failed");
                return bundle;
            }
        } catch (JSONException unused5) {
            com.heytap.accessory.base.logging.a.d(b, "Marshalling received json failed");
            return bundle;
        }
        com.heytap.accessory.base.logging.a.d(b, "Marshalling received json failed");
        return bundle;
    }
}
