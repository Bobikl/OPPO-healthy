package com.heytap.accessory.file;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import com.heytap.accessory.BaseAdapter;
import com.heytap.accessory.Config;
import com.heytap.accessory.api.IDeathCallback;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.UnSupportException;
import com.heytap.accessory.core.IFileManager;
import com.heytap.accessory.file.model.CancelAllRequest;
import com.heytap.accessory.file.model.CancelFileRequest;
import com.heytap.accessory.file.model.FTOperateEntity;
import com.heytap.accessory.file.model.FileReceiveEntity;
import com.heytap.accessory.file.model.FileSendEntity;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.oplus.aiunit.vision.alf;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public class FileTransferManager {
    public static final int FILE_TRANSFER_ACCEPT = 2;
    public static final int FILE_TRANSFER_ACCEPT_URI = 5;
    public static final int FILE_TRANSFER_START = 1;
    public static final int FILE_TRANSFER_START_URI = 4;
    public static final int FILE_TRANSFER_STOP = 3;
    public static final int FILE_TRANSFER_STOP_ALL = 6;
    private static final int FT_SERVICE_BIND_TIMEOUT = 2000;
    public static final String JSON_UPDATE_MSG = "CallBackJson";
    private static final int MAX_FILE_INFO_LENGTH = 4096;
    private static final String TAG = "FileTransferManager";
    private static CountDownLatch mInstanceLock;
    private static UpdateHandler mUpdater;
    private static FileTransferManager sInstance;
    private Context mContext;
    private IDeathCallback mDeathCallback;
    ServiceConnection mFTServiceConn = new ServiceConnection() { // from class: com.heytap.accessory.file.FileTransferManager.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder == null) {
                SdkLog.e(FileTransferManager.TAG, "onServiceConnected: File Transfer service not created");
                return;
            }
            SdkLog.i(FileTransferManager.TAG, "inside onServiceConnected mFTServiceConn");
            IFileManager iFileManagerAsInterface = IFileManager.Stub.asInterface(iBinder);
            FileTransferManager fileTransferManager = FileTransferManager.this;
            fileTransferManager.mServiceConnectionProxy = new FTServiceConnectionProxy(fileTransferManager.mContext, FileTransferManager.this.mContext.getPackageName(), iFileManagerAsInterface);
            HandlerThread handlerThread = new HandlerThread("FileUpdateReceiverThread");
            handlerThread.start();
            if (handlerThread.getLooper() != null) {
                UpdateHandler unused = FileTransferManager.mUpdater = new UpdateHandler(handlerThread.getLooper());
            }
            boolean unused2 = FileTransferManager.sIsBound = true;
            SdkLog.i(FileTransferManager.TAG, "onServiceConnected: File Transfer service connected");
            if (FileTransferManager.mInstanceLock != null) {
                FileTransferManager.mInstanceLock.countDown();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            SdkLog.d(FileTransferManager.TAG, "onServiceDisconnected: File Transfer service disconnected");
            if (FileTransferManager.sInstance != null) {
                FileTransferManager.sInstance.mContext.unbindService(this);
                FileTransferManager.sInstance.mServiceConnectionProxy = null;
                FileTransferManager unused = FileTransferManager.sInstance = null;
            }
            boolean unused2 = FileTransferManager.sIsBound = false;
            if (FileTransferManager.mUpdater != null) {
                FileTransferManager.mUpdater.getLooper().quit();
                UpdateHandler unused3 = FileTransferManager.mUpdater = null;
            }
            Iterator it = FileTransferManager.sCallingAgentInfos.entrySet().iterator();
            while (it.hasNext()) {
                CallingAgentInfo callingAgentInfo = (CallingAgentInfo) ((Map.Entry) it.next()).getValue();
                if (callingAgentInfo != null) {
                    ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> transactionsMap = callingAgentInfo.getTransactionsMap();
                    Iterator<Map.Entry<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>>> it2 = transactionsMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        for (CallingAgentInfo.TransactionDetails transactionDetails : it2.next().getValue().values()) {
                            callingAgentInfo.getLocalCallback().onTransferCompleted(transactionDetails.mConnectionId, transactionDetails.mTransactionId, transactionDetails.mFilePath, 0L, 20001);
                        }
                    }
                    transactionsMap.clear();
                }
            }
            if (FileTransferManager.mInstanceLock != null) {
                FileTransferManager.mInstanceLock.countDown();
            }
        }
    };
    private FTServiceConnectionProxy mServiceConnectionProxy;
    private static final List<String> sCallingAgentNames = new CopyOnWriteArrayList();
    private static final Map<String, FileTransfer> sFileTransferMap = new ConcurrentHashMap();
    private static final ConcurrentHashMap<String, CallingAgentInfo> sCallingAgentInfos = new ConcurrentHashMap<>();
    private static volatile boolean sIsBound = false;

    public static final class DeathCallbackStub extends IDeathCallback.Stub {
        private final String mPackageName;

        public DeathCallbackStub(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Invalid packageName:null");
            }
            this.mPackageName = str;
        }

        @Override // com.heytap.accessory.api.IDeathCallback
        public String getAppName() throws RemoteException {
            return this.mPackageName;
        }
    }

    public static class FTServiceConnectionProxy {
        private final Context mContext;
        private final String mPackageName;
        private final IFileManager mService;

        public FTServiceConnectionProxy(Context context, String str, IFileManager iFileManager) {
            this.mPackageName = str;
            this.mContext = context;
            this.mService = iFileManager;
        }

        public Context getContext() {
            return this.mContext;
        }

        public String getPackageName() {
            return this.mPackageName;
        }

        public IFileManager getService() {
            return this.mService;
        }
    }

    public static class UpdateHandler extends Handler {
        public UpdateHandler(Looper looper) {
            super(looper);
        }
    }

    private boolean checkFileUnSupport(PeerAgent peerAgent) {
        return peerAgent == null || peerAgent.getAccessory() == null || !peerAgent.getAccessory().supportFile();
    }

    public static CallingAgentInfo getCallingAgentInfo(String str) {
        return sCallingAgentInfos.get(str);
    }

    public static synchronized FileTransferManager getInstance(Context context, String str) throws IllegalAccessException, GeneralException {
        FileTransferManager fileTransferManager = sInstance;
        if (fileTransferManager == null || fileTransferManager.mServiceConnectionProxy == null) {
            FileTransferManager fileTransferManager2 = new FileTransferManager();
            sInstance = fileTransferManager2;
            fileTransferManager2.mContext = context;
            Intent intent = new Intent(FTInitializer.FILE_TRANSFER_SERVICE_INTENT);
            String fileTransferPackageName = FTInitializer.getFileTransferPackageName(sInstance.mContext);
            if (fileTransferPackageName == null) {
                throw new GeneralException(20001, "Package name is null!");
            }
            intent.setPackage(fileTransferPackageName);
            String str2 = TAG;
            SdkLog.i(str2, "getInstance: bindService before" + intent);
            FileTransferManager fileTransferManager3 = sInstance;
            if (fileTransferManager3.mContext.bindService(intent, fileTransferManager3.mFTServiceConn, 1)) {
                try {
                    mInstanceLock = new CountDownLatch(1);
                    SdkLog.i(str2, "SAFTAdapter: About start waiting");
                    mInstanceLock.await(2000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    SdkLog.e(TAG, "getInstance: InterruptedException");
                }
                if (!sIsBound) {
                    throw new GeneralException(20001, "Timed out trying to bind to FT Service!");
                }
                SdkLog.i(TAG, "getInstance: Woken up , FTService Connected");
            } else {
                SdkLog.e(str2, "getInstance: FTService Connection Failed");
            }
        }
        if (str == null) {
            throw new IllegalAccessException("Calling agent was cleared from record. Please re-register your service.");
        }
        SdkLog.d(TAG, str + " is using FTService");
        return sInstance;
    }

    public static FileTransfer getStreamTransfer(String str) {
        return sFileTransferMap.get(str);
    }

    public static boolean isBound() {
        return sIsBound;
    }

    public static boolean register(FileTransfer fileTransfer, String str) {
        List<String> list = sCallingAgentNames;
        if (list.contains(str)) {
            SdkLog.d(TAG, "file register : exist");
            return true;
        }
        list.add(str);
        sFileTransferMap.put(str, fileTransfer);
        return true;
    }

    public static void unregister(String str) {
        List<String> list = sCallingAgentNames;
        list.remove(str);
        sFileTransferMap.remove(str);
        if (sInstance == null) {
            SdkLog.e(TAG, "FT already unbound for this package. Please check whether the calling agent was registered");
            return;
        }
        if (!list.isEmpty()) {
            SdkLog.e(TAG, "Other applications are still using this FT binding");
            return;
        }
        FileTransferManager fileTransferManager = sInstance;
        fileTransferManager.mContext.unbindService(fileTransferManager.mFTServiceConn);
        sInstance.mServiceConnectionProxy = null;
        sIsBound = false;
        UpdateHandler updateHandler = mUpdater;
        if (updateHandler != null) {
            updateHandler.getLooper().quit();
            mUpdater = null;
        }
        SdkLog.d(TAG, "File transfer service disconnected");
    }

    public int cancelAllTransactions(String str) throws RemoteException {
        try {
            CancelAllRequest cancelAllRequest = new CancelAllRequest(str);
            Bundle bundleSendCommand = null;
            try {
                FTOperateEntity fTOperateEntity = new FTOperateEntity(6, cancelAllRequest.toJSON());
                FTServiceConnectionProxy fTServiceConnectionProxy = this.mServiceConnectionProxy;
                if (fTServiceConnectionProxy != null) {
                    bundleSendCommand = fTServiceConnectionProxy.getService().sendCommand(fTOperateEntity.toJson().toString());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (bundleSendCommand != null) {
                return bundleSendCommand.getInt("receiveStatus");
            }
            SdkLog.i(TAG, "File Transfer Daemon could not queue request");
            return 1;
        } catch (RemoteException e3) {
            e3.printStackTrace();
            return 1;
        }
    }

    public void cancelFile(long j2, int i) {
        try {
            try {
                FTOperateEntity fTOperateEntity = new FTOperateEntity(3, new CancelFileRequest(j2, i).toJSON());
                FTServiceConnectionProxy fTServiceConnectionProxy = this.mServiceConnectionProxy;
                if (fTServiceConnectionProxy != null) {
                    fTServiceConnectionProxy.getService().sendCommand(fTOperateEntity.toJson().toString());
                    return;
                }
                return;
            } catch (JSONException e2) {
                e2.printStackTrace();
                return;
            }
        } catch (RemoteException e3) {
            e3.printStackTrace();
        }
        e3.printStackTrace();
    }

    public synchronized boolean checkAuthentication(String str) throws GeneralException {
        try {
            if (this.mServiceConnectionProxy.getService() != null) {
                return this.mServiceConnectionProxy.getService().handleAuthenticationWithPermission(Config.getSdkVersionCode(), str);
            }
        } catch (RemoteException e2) {
            SdkLog.e(TAG, "exception: " + e2.getMessage());
        }
        return false;
    }

    public String getAgentId(Context context, String str) {
        String string;
        SdkLog.w(TAG, "Fetching from framework,agentName:" + str);
        try {
            string = BaseAdapter.getDefaultAdapter(context.getApplicationContext()).getLocalAgentId(str);
        } catch (GeneralException unused) {
            SdkLog.e(TAG, "Fetching from framework failed ");
            string = this.mContext.createDeviceProtectedStorageContext().getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).getString(str, "");
        }
        SdkLog.w(TAG, "getAgentId :" + string);
        return string;
    }

    public void receiveFile(FileTransfer.IFileTransferCallback iFileTransferCallback, long j2, int i, String str, String str2, boolean z) {
        if (z) {
            try {
                if (!registerCallback(iFileTransferCallback, i)) {
                    SdkLog.d(TAG, "Could not register file event callback. Declining transfer.");
                    iFileTransferCallback.onTransferCompleted(j2, i, str, 0L, 3);
                    return;
                }
            } catch (RemoteException e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (!registerDeathCallback(0L, j2)) {
            SdkLog.d(TAG, "Register death callback fail.");
        }
        try {
            FTOperateEntity fTOperateEntity = str2 != null ? new FTOperateEntity(5, new FileReceiveEntity(j2, i, str, str2, z).toJSON()) : new FTOperateEntity(5, new FileReceiveEntity(j2, i, "", "", false).toJSON());
            FTServiceConnectionProxy fTServiceConnectionProxy = this.mServiceConnectionProxy;
            Bundle bundleSendCommand = fTServiceConnectionProxy != null ? fTServiceConnectionProxy.getService().sendCommand(fTOperateEntity.toJson().toString()) : null;
            if (bundleSendCommand == null) {
                SdkLog.i(TAG, "File Transfer Daemon could not queue request");
                return;
            }
            int i2 = bundleSendCommand.getInt("receiveStatus");
            SdkLog.i(TAG, "receiveStatus:" + i2);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    public boolean registerCallback(FileTransfer.IFileTransferCallback iFileTransferCallback, int i) {
        if (iFileTransferCallback == null) {
            return false;
        }
        try {
            FTServiceConnectionProxy fTServiceConnectionProxy = this.mServiceConnectionProxy;
            if (fTServiceConnectionProxy != null) {
                return fTServiceConnectionProxy.getService().registerCallbackFacilitator(i, new FileCallbackReceiver(mUpdater, iFileTransferCallback));
            }
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public boolean registerDeathCallback(long j2, long j3) {
        if (this.mDeathCallback == null) {
            this.mDeathCallback = new DeathCallbackStub(sInstance.mContext.getPackageName());
        }
        try {
            FTServiceConnectionProxy fTServiceConnectionProxy = this.mServiceConnectionProxy;
            if (fTServiceConnectionProxy != null) {
                return fTServiceConnectionProxy.getService().registerDeathCallback(this.mDeathCallback, j2, j3);
            }
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public int sendFile(Context context, String str, FileTransfer.IFileTransferCallback iFileTransferCallback, PeerAgent peerAgent, String str2, String str3) throws UnSupportException {
        FTOperateEntity fTOperateEntity;
        boolean z;
        int i;
        if (checkFileUnSupport(peerAgent)) {
            throw new UnSupportException("the peer agent doesn't support the file feature, please check");
        }
        String agentId = getAgentId(context, str);
        Bundle bundleSendCommand = null;
        if (str2 != null) {
            File file = new File(str3);
            try {
                fTOperateEntity = new FTOperateEntity(4, new FileSendEntity(str3, "", "", peerAgent.getAgentId(), agentId, peerAgent.getAccessoryId(), file.length(), file.getName(), str2, context.getPackageName(), str).toJson());
            } catch (JSONException e2) {
                e2.printStackTrace();
                fTOperateEntity = null;
            }
        } else {
            fTOperateEntity = null;
        }
        try {
            FTServiceConnectionProxy fTServiceConnectionProxy = this.mServiceConnectionProxy;
            if (fTServiceConnectionProxy == null || fTOperateEntity == null) {
                SdkLog.e(TAG, "sendFile: invalid state or req is null");
            } else {
                bundleSendCommand = fTServiceConnectionProxy.getService().sendCommand(fTOperateEntity.toJson().toString());
            }
        } catch (RemoteException | JSONException e3) {
            e3.printStackTrace();
        }
        Bundle bundle = bundleSendCommand;
        if (bundle != null) {
            z = bundle.getBoolean("STATUS");
            i = bundle.getInt(alf.ID);
        } else {
            z = false;
            i = 0;
        }
        if (!registerDeathCallback(Long.parseLong(agentId), 0L)) {
            SdkLog.d(TAG, "Register death callback fail.");
        }
        if (!z || !registerCallback(iFileTransferCallback, i)) {
            return -1;
        }
        SdkLog.d(TAG, "File Pushed and Callback registered");
        return i;
    }

    public static void register(String str, CallingAgentInfo callingAgentInfo) {
        sCallingAgentInfos.put(str, callingAgentInfo);
    }

    public void receiveFile(FileTransfer.IFileTransferCallback iFileTransferCallback, long j2, int i, Uri uri, boolean z) {
        FTOperateEntity fTOperateEntity;
        if (z) {
            try {
                if (!registerCallback(iFileTransferCallback, i)) {
                    SdkLog.d(TAG, "Could not register file event callback. Declining transfer.");
                    iFileTransferCallback.onTransferCompleted(j2, i, uri.toString(), 0L, 3);
                    return;
                }
            } catch (RemoteException e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (!registerDeathCallback(0L, j2)) {
            SdkLog.d(TAG, "Register death callback fail.");
        }
        try {
            if (uri != null) {
                fTOperateEntity = new FTOperateEntity(5, new FileReceiveEntity(j2, i, uri.toString(), uri.toString(), z).toJSON());
            } else {
                fTOperateEntity = new FTOperateEntity(5, new FileReceiveEntity(j2, i, "", "", false).toJSON());
            }
            FTServiceConnectionProxy fTServiceConnectionProxy = this.mServiceConnectionProxy;
            Bundle bundleSendCommand = fTServiceConnectionProxy != null ? fTServiceConnectionProxy.getService().sendCommand(fTOperateEntity.toJson().toString()) : null;
            if (bundleSendCommand != null) {
                int i2 = bundleSendCommand.getInt("receiveStatus");
                SdkLog.i(TAG, "receiveStatus:" + i2);
                return;
            }
            SdkLog.i(TAG, "File Transfer Daemon could not queue request");
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b A[Catch: RemoteException | JSONException -> 0x0113, TRY_LEAVE, TryCatch #4 {RemoteException | JSONException -> 0x0113, blocks: (B:48:0x00f2, B:51:0x00f8, B:52:0x010b), top: B:78:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00e8: MOVE (r19 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:43:0x00e8 */
    @RequiresApi(api = 16)
    @WorkerThread
    public int sendFile(Context context, String str, String str2, FileTransfer.IFileTransferCallback iFileTransferCallback, PeerAgent peerAgent, Uri uri) throws Throwable {
        FTOperateEntity fTOperateEntity;
        Bundle bundle;
        boolean z;
        int i;
        FTServiceConnectionProxy fTServiceConnectionProxy;
        long j2;
        Cursor cursorQuery;
        Cursor cursor;
        if (!checkFileUnSupport(peerAgent)) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                if (str2.length() <= 4096) {
                    String agentId = getAgentId(context, str);
                    Bundle bundleSendCommand = null;
                    Cursor cursor2 = null;
                    bundleSendCommand = null;
                    if (uri != null) {
                        String string = "null";
                        try {
                            try {
                                cursorQuery = context.getContentResolver().query(uri, null, null, null, null, null);
                                try {
                                    if (cursorQuery == null) {
                                        SdkLog.i(TAG, "send File: query cursor null");
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return -1;
                                    }
                                    if (cursorQuery.moveToNext()) {
                                        j2 = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                                        try {
                                            string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            SdkLog.i(TAG, "send File: fileSize = " + j2 + " fileName = " + string);
                                        } catch (Exception e2) {
                                            e = e2;
                                            SdkLog.e(TAG, "sendFile Exception:" + e);
                                            if (cursorQuery != null) {
                                            }
                                            fTOperateEntity = new FTOperateEntity(4, new FileSendEntity(uri.toString(), "", str2, peerAgent.getAgentId(), agentId, peerAgent.getAccessoryId(), j2, string, uri.toString(), context.getPackageName(), str).toJson());
                                            fTServiceConnectionProxy = this.mServiceConnectionProxy;
                                            if (fTServiceConnectionProxy == null) {
                                                SdkLog.e(TAG, "sendFile: invalid state or req is null");
                                            } else {
                                                SdkLog.e(TAG, "sendFile: invalid state or req is null");
                                            }
                                            bundle = bundleSendCommand;
                                            if (bundle != null) {
                                                z = bundle.getBoolean("STATUS");
                                                i = bundle.getInt(alf.ID);
                                            } else {
                                                z = false;
                                                i = -1;
                                            }
                                            if (!registerDeathCallback(Long.parseLong(agentId), 0L)) {
                                                SdkLog.d(TAG, "Register death callback fail.");
                                            }
                                            if (z) {
                                            }
                                            return -1;
                                        }
                                    } else {
                                        SdkLog.i(TAG, "send File: empty");
                                        j2 = 0;
                                    }
                                    cursorQuery.close();
                                    try {
                                        fTOperateEntity = new FTOperateEntity(4, new FileSendEntity(uri.toString(), "", str2, peerAgent.getAgentId(), agentId, peerAgent.getAccessoryId(), j2, string, uri.toString(), context.getPackageName(), str).toJson());
                                    } catch (JSONException e3) {
                                        e3.printStackTrace();
                                        fTOperateEntity = null;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    j2 = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            j2 = 0;
                            cursorQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } else {
                        fTOperateEntity = null;
                    }
                    try {
                        fTServiceConnectionProxy = this.mServiceConnectionProxy;
                        if (fTServiceConnectionProxy == null && fTOperateEntity != null) {
                            bundleSendCommand = fTServiceConnectionProxy.getService().sendCommand(fTOperateEntity.toJson().toString());
                        } else {
                            SdkLog.e(TAG, "sendFile: invalid state or req is null");
                        }
                    } catch (RemoteException | JSONException e6) {
                        e6.printStackTrace();
                    }
                    bundle = bundleSendCommand;
                    if (bundle != null) {
                        z = bundle.getBoolean("STATUS");
                        i = bundle.getInt(alf.ID);
                    } else {
                        z = false;
                        i = -1;
                    }
                    if (!registerDeathCallback(Long.parseLong(agentId), 0L)) {
                        SdkLog.d(TAG, "Register death callback fail.");
                    }
                    if (z || !registerCallback(iFileTransferCallback, i)) {
                        return -1;
                    }
                    SdkLog.d(TAG, "File Pushed and Callback registered");
                    return i;
                }
                throw new UnSupportException("the param fileInfo is too long!");
            }
            throw new RuntimeException("current task should not use in main thread");
        }
        throw new UnSupportException("the peer agent doesn't support the file feature, please check");
    }
}
