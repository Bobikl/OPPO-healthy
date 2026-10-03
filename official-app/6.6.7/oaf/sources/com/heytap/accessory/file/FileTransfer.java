package com.heytap.accessory.file;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.FileProvider;
import com.heytap.accessory.BaseAgent;
import com.heytap.accessory.BaseJobAgent;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.bean.UnSupportException;
import com.heytap.accessory.file.model.Constant;
import com.heytap.accessory.file.model.FileDescription;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.utils.BroadcastUtils;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FileTransfer {
    public static final String ACTION_AFP_FILE_TRANSFER_REQUESTED = "com.heytap.accessory.ftconnection";
    private static final boolean COVERED_MODE = true;
    public static final int ERROR_CHANNEL_IO = 1;
    public static final int ERROR_COMMAND_DROPPED = 3;
    public static final int ERROR_CONNECTION_LOST = 5;
    public static final int ERROR_FATAL = 20001;
    public static final int ERROR_FILE_IO = 2;
    public static final int ERROR_MD5_VERIFY_FAILED = 10;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_SUPPORTED = 12;
    public static final int ERROR_PEER_AGENT_BUSY = 8;
    public static final int ERROR_PEER_AGENT_NO_RESPONSE = 4;
    public static final int ERROR_PEER_AGENT_REJECTED = 9;
    public static final int ERROR_REQUEST_NOT_QUEUED = -1;
    public static final int ERROR_SPACE_NOT_AVAILABLE = 11;
    public static final int ERROR_TRANSACTION_NOT_FOUND = 13;
    private static final String FILE_PROVIDER = "androidx.core.content.FileProvider";
    private static final String FILE_PROVIDER_V4 = "android.support.v4.content.FileProvider";
    private static final int FT_CANCEL_TRANS_ID = -1;
    private static final int FT_DEFAULT_CONNECTION_ID = 0;
    private static final int FT_DEFAULT_TRANS_ID = 0;
    private static final String TAG = "FileTransfer";
    private String mAgentName;
    private Object mCallingAgent;
    private CallingAgentInfo mCallingAgentInfo;
    private Context mContext;
    private EventListener mEventListener;
    private HandlerThread mFileTransferHandlerThread;
    private FTHandler mHandler;
    IFileTransferCallback mLocalCallback;
    private ConcurrentHashMap<Integer, Uri> mTransactionUriMap;
    private ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> mTransactionsMap;
    private ConcurrentHashMap<Long, ConcurrentHashMap<Integer, Boolean>> mTransferRequestMap;

    public static class BackgroundExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            SdkLog.e(FileTransfer.TAG, "Exception in FileTransfer Handler thread :" + thread.getName(), th);
        }

        private BackgroundExceptionHandler() {
        }
    }

    public interface EventListener {
        void onCancelAllCompleted(int i, int i2);

        void onProgressChanged(long j, int i, int i2);

        void onTransferCompleted(long j, int i, String str, long j2, int i2);

        void onTransferRequested(long j, int i, int i2, FileDescription fileDescription);
    }

    public static class FTHandler extends Handler {
        public FTHandler(Looper looper) {
            super(looper);
        }
    }

    public interface IFileTransferCallback {
        void onCancelAllCompleted(int[] iArr, int i);

        void onProgressChanged(long j, int i, int i2);

        void onTransferCompleted(long j, int i, String str, long j2, int i2);

        void onTransferRequested(long j, int i, String str);
    }

    public FileTransfer(BaseAgent baseAgent, EventListener eventListener) throws SdkUnsupportedException {
        this(baseAgent, baseAgent.getApplicationContext(), eventListener);
    }

    private boolean changeFileName(String str, String str2) {
        File file = new File(str2);
        if (file.isFile() && file.exists()) {
            String str3 = str2.substring(0, str2.lastIndexOf("/") + 1) + str2.substring(str.lastIndexOf("/") + 1, str2.lastIndexOf(".")) + System.currentTimeMillis() + str2.substring(str2.lastIndexOf("."));
            if (!file.renameTo(new File(str3))) {
                SdkLog.e(TAG, "File rename failed");
                return false;
            }
            SdkLog.v(TAG, "File successfully renamed " + str3);
            file.delete();
        } else {
            if (!new File(str).renameTo(new File(str2))) {
                SdkLog.e(TAG, "File rename failed");
                return false;
            }
            SdkLog.v(TAG, "File successfully renamed: " + str2);
        }
        return COVERED_MODE;
    }

    private boolean checkReceiveParams(String str, long j, int i) {
        boolean zExists;
        if (TextUtils.isEmpty(str)) {
            SdkLog.e(TAG, "filepath empty!");
        } else {
            if (!checkPathPermission(str)) {
                SdkLog.e(TAG, "checkReceiveParams return false, cannot save file in third internal path!");
                return false;
            }
            File file = new File(str);
            if (!file.isDirectory()) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    zExists = parentFile.exists();
                    if (!zExists) {
                        SdkLog.e(TAG, "Parent Directory does not exist!");
                    }
                } else {
                    SdkLog.e(TAG, "getParentFile() is null ");
                }
                if (zExists || !containsTransactionKey(j, i)) {
                    return zExists;
                }
                SdkLog.e(TAG, "transactionId already exist");
                return false;
            }
            SdkLog.e(TAG, "given path is a directory");
        }
        zExists = false;
        if (zExists) {
        }
        return zExists;
    }

    private void checkSource(String str) {
        if (str == null || str.length() == 0 || !checkPathPermission(str)) {
            throw new IllegalArgumentException("Wrong file path");
        }
        try {
            SdkLog.v(TAG, "File has a valid extentsion: " + str.substring(str.lastIndexOf(".")));
            Uri uri = Uri.parse(str);
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                str = uri.getPath();
                if (str != null) {
                    SdkLog.v(TAG, "URI scheme is SCHEME_FILE  File Path : " + str);
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                Cursor cursorQuery = this.mContext.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    try {
                        str = cursorQuery.getString(0);
                        if (str != null) {
                            SdkLog.v(TAG, "URI ContentResolver is SCHEME_CONTENT File Path : " + str);
                        }
                        cursorQuery.close();
                        cursorQuery = null;
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            File file = new File(str);
            if (!file.exists()) {
                throw new IllegalArgumentException("File doesnot exist");
            }
            if (file.isDirectory()) {
                throw new IllegalArgumentException("File is a directory");
            }
            if (file.length() == 0) {
                throw new IllegalArgumentException("File length is 0");
            }
            SdkLog.v(TAG, "File is valid !!");
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Wrong file..does not have extension");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean containsTransactionKey(long j, int i) {
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap;
        ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails> concurrentHashMap2;
        concurrentHashMap = this.mTransactionsMap;
        return (concurrentHashMap == null || (concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(j))) == null) ? false : concurrentHashMap2.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean containsTransactionRequestKey(long j, int i) {
        boolean zContainsKey;
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.mTransferRequestMap.get(Long.valueOf(j));
        if (concurrentHashMap != null) {
            zContainsKey = concurrentHashMap.containsKey(Integer.valueOf(i));
        } else {
            SdkLog.d(TAG, "TransferRequest record null");
            zContainsKey = false;
        }
        return zContainsKey;
    }

    private String getContentURIAuthority() {
        List<ProviderInfo> listQueryContentProviders;
        try {
            listQueryContentProviders = this.mContext.getPackageManager().queryContentProviders(this.mContext.getPackageName(), Process.myUid(), 0);
        } catch (Exception e) {
            SdkLog.e(TAG, "queryContentProviders failed!", e);
            listQueryContentProviders = null;
        }
        if (listQueryContentProviders != null) {
            for (ProviderInfo providerInfo : listQueryContentProviders) {
                if (FILE_PROVIDER.equalsIgnoreCase(providerInfo.name)) {
                    SdkLog.d(TAG, "Authority:" + providerInfo.authority);
                    return providerInfo.authority;
                }
                if (FILE_PROVIDER_V4.equalsIgnoreCase(providerInfo.name)) {
                    SdkLog.d(TAG, "Authority:" + providerInfo.authority);
                    return providerInfo.authority;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized CallingAgentInfo.TransactionDetails getTransaction(long j, int i) {
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap;
        ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails> concurrentHashMap2;
        concurrentHashMap = this.mTransactionsMap;
        return (concurrentHashMap == null || (concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(j))) == null) ? null : concurrentHashMap2.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean getTransactionRequestState(long j, int i) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.mTransferRequestMap.get(Long.valueOf(j));
        if (concurrentHashMap == null) {
            return false;
        }
        Boolean bool = concurrentHashMap.get(Integer.valueOf(i));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnCancelAllCompletedErrorCode(int i) {
        if (i == 12) {
            SdkLog.i(TAG, "onCancelAllCompleted() -> ERROR_NOT_SUPPORTED");
            return;
        }
        if (i == 13) {
            SdkLog.i(TAG, "onCancelAllCompleted() -> ERROR_TRANSACTION_NOT_FOUND");
            return;
        }
        SdkLog.w(TAG, "onCancelAllCompleted() error_code: " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnTransferCompletedErrorCode(int i) {
        if (i == 8) {
            SdkLog.i(TAG, "onTransferCompleted() -> ERROR_PEER_AGENT_BUSY");
        }
        if (i == 9) {
            SdkLog.i(TAG, "onTransferCompleted() -> ERROR_PEER_AGENT_REJECTED");
            return;
        }
        if (i == 11) {
            SdkLog.i(TAG, "onTransferCompleted() -> ERROR_SPACE_NOT_AVAILABLE");
            return;
        }
        if (i == 20001) {
            SdkLog.i(TAG, "onTransferCompleted() -> ERROR_FATAL");
            return;
        }
        switch (i) {
            case -1:
                SdkLog.i(TAG, "onTransferCompleted() -> ERROR_REQUEST_NOT_QUEUED");
                break;
            case 0:
                SdkLog.i(TAG, "onTransferCompleted() -> ERROR_NONE");
                break;
            case 1:
                SdkLog.i(TAG, "onTransferCompleted() -> ERROR_CHANNEL_IO");
                break;
            case 2:
                SdkLog.i(TAG, "onTransferCompleted() -> ERROR_FILE_IO");
                break;
            case 3:
                SdkLog.i(TAG, "onTransferCompleted() -> ERROR_COMMAND_DROPPED");
                break;
            case 4:
                SdkLog.i(TAG, "onTransferCompleted() -> ERROR_PEER_AGENT_NO_RESPONSE");
                break;
            case 5:
                SdkLog.i(TAG, "onTransferCompleted() -> ERROR_CONNECTION_LOST");
                break;
            default:
                SdkLog.w(TAG, "onTransferCompleted() error_code: " + i);
                break;
        }
    }

    private synchronized void putTransaction(long j, int i, CallingAgentInfo.TransactionDetails transactionDetails) {
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap = this.mTransactionsMap;
        if (concurrentHashMap != null) {
            ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails> concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(j));
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                this.mTransactionsMap.put(Long.valueOf(j), concurrentHashMap2);
            }
            concurrentHashMap2.put(Integer.valueOf(i), transactionDetails);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void putTransactionRequest(long j, int i, boolean z) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.mTransferRequestMap.get(Long.valueOf(j));
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        concurrentHashMap.put(Integer.valueOf(i), Boolean.valueOf(z));
        this.mTransferRequestMap.put(Long.valueOf(j), concurrentHashMap);
        SdkLog.d(TAG, "TransferRequest : , connectionId: " + j + ", transactionId: " + i + ", isRequest: " + z + ", state: " + getTransactionRequestState(j, i) + ", hash: " + hashCode());
    }

    private boolean register() {
        if (!FileTransferManager.register(this, this.mAgentName)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread("FileTransferHandlerThread");
        this.mFileTransferHandlerThread = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new BackgroundExceptionHandler());
        this.mFileTransferHandlerThread.start();
        SdkLog.d(TAG, "FileTransferHandlerThread started");
        Looper looper = this.mFileTransferHandlerThread.getLooper();
        if (looper != null) {
            this.mHandler = new FTHandler(looper);
        }
        if (this.mHandler == null) {
            return false;
        }
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap = new ConcurrentHashMap<>();
        this.mTransactionsMap = concurrentHashMap;
        CallingAgentInfo callingAgentInfo = new CallingAgentInfo(this.mEventListener, this.mFileTransferHandlerThread, this.mHandler, this.mLocalCallback, concurrentHashMap);
        this.mCallingAgentInfo = callingAgentInfo;
        FileTransferManager.register(this.mAgentName, callingAgentInfo);
        this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.file.FileTransfer.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FileTransferManager.getInstance(FileTransfer.this.mContext, FileTransfer.this.mAgentName);
                } catch (GeneralException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        return COVERED_MODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeTransaction(long j, int i) {
        ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails> concurrentHashMap;
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap2 = this.mTransactionsMap;
        if (concurrentHashMap2 != null && (concurrentHashMap = concurrentHashMap2.get(Long.valueOf(j))) != null) {
            concurrentHashMap.remove(Integer.valueOf(i));
            if (concurrentHashMap.isEmpty()) {
                this.mTransactionsMap.remove(Long.valueOf(j));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeTransactionByTransId(int i) {
        Set<Long> setKeySet;
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap = this.mTransactionsMap;
        if (concurrentHashMap != null && (setKeySet = concurrentHashMap.keySet()) != null) {
            Iterator<Long> it = setKeySet.iterator();
            while (it.hasNext()) {
                removeTransaction(it.next().longValue(), i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeTransactionRequest(long j, int i) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.mTransferRequestMap.get(Long.valueOf(j));
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(Integer.valueOf(i));
            if (concurrentHashMap.isEmpty()) {
                this.mTransferRequestMap.remove(Long.valueOf(j));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void revokeUriPermission(int i) {
        String fileTransferPackageName = FTInitializer.getFileTransferPackageName(this.mContext);
        Uri uri = this.mTransactionUriMap.get(Integer.valueOf(i));
        if (uri != null) {
            revokeUriPermission(fileTransferPackageName, uri, 3);
            return;
        }
        SdkLog.w(TAG, "cannot find transactionId:" + i);
    }

    private boolean validateParam(PeerAgent peerAgent) {
        if (peerAgent == null) {
            throw new IllegalArgumentException("PeerAgent cannot be null");
        }
        Object obj = this.mCallingAgent;
        if (obj == null || this.mEventListener == null) {
            SdkLog.e(TAG, "Using invalid instance of FileTransfer(). Please re-register.");
            return false;
        }
        if (obj instanceof BaseJobAgent) {
            if (!((BaseJobAgent) obj).getSuccessfulConnections().isEmpty()) {
                return COVERED_MODE;
            }
            SdkLog.e(TAG, "current baseJobAgent has not setup service connection, please connect service first");
            return false;
        }
        if (!(obj instanceof BaseAgent) || !((BaseAgent) obj).getSuccessfulConnections().isEmpty()) {
            return COVERED_MODE;
        }
        SdkLog.e(TAG, "current baseAgent has not setup service connection, please connect service first");
        return false;
    }

    public void cancel(final long j, final int i) {
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "Using invalid instance of FileTransfer(). Please re-register.");
            return;
        }
        if (containsTransactionKey(j, i)) {
            this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.file.FileTransfer.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        CallingAgentInfo.TransactionDetails transaction = FileTransfer.this.getTransaction(j, i);
                        if (transaction == null) {
                            SdkLog.d(FileTransfer.TAG, "cancelFile aborted because service connection or transaction already closed.");
                        } else {
                            int i2 = transaction.mTransactionId;
                            if (i2 == 0) {
                                transaction.mTransactionId = -1;
                                SdkLog.d(FileTransfer.TAG, "Cancel called before transaction id is genereated" + i);
                            } else if (i2 == -1) {
                                SdkLog.d(FileTransfer.TAG, "Cancel called again before transaction id is genereated" + i);
                            } else {
                                FileTransferManager.getInstance(FileTransfer.this.mContext, FileTransfer.this.mAgentName).cancelFile(j, transaction.mTransactionId);
                            }
                        }
                    } catch (GeneralException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Wrong connection(" + j + ") transaction id(" + i + ") used for cancel.");
    }

    public void cancelAll() {
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "Using invalid instance of  Please re-register.");
            return;
        }
        try {
            final String agentId = FileTransferManager.getInstance(this.mContext, this.mAgentName).getAgentId(this.mContext, this.mAgentName);
            if (TextUtils.isEmpty(agentId)) {
                SdkLog.e(TAG, "Your service was not found. Please re-register");
            } else {
                this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.file.FileTransfer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            int iCancelAllTransactions = FileTransferManager.getInstance(FileTransfer.this.mContext, FileTransfer.this.mAgentName).cancelAllTransactions(agentId);
                            SdkLog.d(FileTransfer.TAG, "cancel status " + iCancelAllTransactions);
                            EventListener eventListener = FileTransfer.this.mEventListener;
                            if (eventListener == null) {
                                SdkLog.w(FileTransfer.TAG, "[cancelAll] listener is null.");
                                return;
                            }
                            if (iCancelAllTransactions == 0) {
                                FileTransfer.this.handleOnCancelAllCompletedErrorCode(12);
                                eventListener.onCancelAllCompleted(-1, 12);
                            } else if (iCancelAllTransactions == 13) {
                                FileTransfer.this.handleOnCancelAllCompletedErrorCode(13);
                                eventListener.onCancelAllCompleted(-1, 13);
                            }
                        } catch (GeneralException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (GeneralException | IllegalAccessException e) {
            SdkLog.e(TAG, "[cancelAll]" + e);
            SdkLog.d(TAG, "get StreamTransferManager null,cancelAll failed!");
        }
    }

    public boolean checkPathPermission(String str) {
        SdkLog.d(TAG, "checkPathPermission calling pkg: " + this.mContext.getPackageName() + " file Path:" + str);
        return str.startsWith("/data/data") ? str.contains(this.mContext.getPackageName()) : COVERED_MODE;
    }

    public void close() {
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "Using invalid instance of FileTransfer(). Please re-register.");
            return;
        }
        SdkLog.d(TAG, "stopFileTransferService() called by : " + this.mAgentName);
        FileTransferManager.unregister(this.mAgentName);
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap = this.mTransactionsMap;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        FTHandler fTHandler = this.mHandler;
        if (fTHandler != null) {
            fTHandler.removeCallbacksAndMessages(null);
            this.mHandler.getLooper().quit();
        }
        this.mCallingAgent = null;
        this.mEventListener = null;
    }

    public void informIncomingFTRequest(Context context, Intent intent) {
        final int intExtra = intent.getIntExtra("transId", -1);
        String stringExtra = intent.getStringExtra("agentClass");
        final long longExtra = intent.getLongExtra("connectionId", 0L);
        final int i = Integer.parseInt(intent.getStringExtra("contId"));
        final long longExtra2 = intent.getLongExtra(Constant.FILE_SIZE, 0L);
        SdkLog.d(TAG, "receive incoming FTRequest; transactionId = " + intExtra + "; connectionId = " + longExtra + "; implClass = " + stringExtra + "; fileSize = " + longExtra2 + "; peerAgentId = " + i);
        if (stringExtra == null) {
            stringExtra = this.mContext.createDeviceProtectedStorageContext().getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).getString(intent.getStringExtra("peerId"), null);
        }
        SdkLog.d(TAG, "class now:" + stringExtra + " , " + hashCode());
        if (stringExtra == null) {
            SdkLog.e(TAG, "Target agent was cleared. Re-registering");
            context.sendBroadcast(BroadcastUtils.getRegistrationIntent(context.getPackageName()));
            return;
        }
        if (this.mCallingAgent == null) {
            SdkLog.e(TAG, "Calling agent was cleared");
            return;
        }
        if (!stringExtra.equalsIgnoreCase(this.mAgentName)) {
            SdkLog.e(TAG, "Class name not matched with " + this.mAgentName);
            return;
        }
        final CallingAgentInfo callingAgentInfo = FileTransferManager.getCallingAgentInfo(stringExtra);
        if (callingAgentInfo == null) {
            SdkLog.e(TAG, "AgentInfo is NULL! Re-Registering");
            register();
            informIncomingFTRequest(context, intent);
        } else {
            if (callingAgentInfo.getEventListener() == null) {
                SdkLog.e(TAG, "callback is not registered for " + stringExtra);
                return;
            }
            final String stringExtra2 = intent.getStringExtra("filePath");
            final String stringExtra3 = intent.getStringExtra("fileName");
            SdkLog.d(TAG, "Informing app of incoming file transfer request on registered callback-tid: " + intExtra);
            this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.file.FileTransfer.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        FileTransferManager.getInstance(FileTransfer.this.mContext, FileTransfer.this.mAgentName).registerCallback(FileTransfer.this.mLocalCallback, intExtra);
                        FileTransfer.this.putTransactionRequest(longExtra, intExtra, FileTransfer.COVERED_MODE);
                        callingAgentInfo.getEventListener().onTransferRequested(longExtra, i, intExtra, new FileDescription.Builder().setFileName(stringExtra3).setFileSize(longExtra2).setCustomFileInfo(stringExtra2).build());
                    } catch (GeneralException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public boolean isInternalPath(String str) {
        return str.startsWith("/data/data");
    }

    public void receive(final long j, final int i, final String str) {
        Uri uriForFile;
        SdkLog.i(TAG, "receive path: " + str + ", connectionId" + j + ", transactionId" + i + ", " + hashCode());
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "Using invalid instance of FileTransfer(). Please re-register.");
            putTransactionRequest(j, i, false);
            return;
        }
        if (!checkReceiveParams(str, j, i) || !containsTransactionRequestKey(j, i)) {
            putTransactionRequest(j, i, false);
            throw new IllegalArgumentException("Wrong filepath or transaction id used");
        }
        CallingAgentInfo.TransactionDetails transactionDetails = new CallingAgentInfo.TransactionDetails();
        transactionDetails.mConnectionId = j;
        transactionDetails.mTransactionId = i;
        transactionDetails.mFilePath = str;
        putTransaction(j, i, transactionDetails);
        String fileTransferPackageName = FTInitializer.getFileTransferPackageName(this.mContext);
        String contentURIAuthority = getContentURIAuthority();
        if (fileTransferPackageName == null || contentURIAuthority == null) {
            SdkLog.v(TAG, "Accessory Framework doesn't support content URI !!");
            uriForFile = null;
        } else {
            try {
                if (str == null) {
                    SdkLog.e(TAG, "File path is wrong!!");
                    return;
                }
                SdkLog.v(TAG, "File :" + str);
                File file = new File(str);
                SdkLog.e(TAG, "Temporary File Created for content URI : " + file.createNewFile());
                uriForFile = FileProvider.getUriForFile(this.mContext, contentURIAuthority, file);
                try {
                    if (uriForFile == null) {
                        SdkLog.e(TAG, "Cannot create the content URI !");
                        if (file.delete()) {
                            SdkLog.v(TAG, "temp file deleted successfully ");
                        } else {
                            SdkLog.e(TAG, "temp file could not be deleted ");
                        }
                    } else {
                        transactionDetails.mSource = str;
                        this.mContext.grantUriPermission(fileTransferPackageName, uriForFile, 2);
                    }
                } catch (IOException e) {
                    e = e;
                    revokeUriPermission(fileTransferPackageName, uriForFile, 2);
                    SdkLog.e(TAG, "Cannot create the File !", e);
                    uriForFile = null;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    revokeUriPermission(fileTransferPackageName, uriForFile, 2);
                    SdkLog.e(TAG, "Cannot create the content URI !", e);
                    uriForFile = null;
                } catch (NullPointerException e3) {
                    e = e3;
                    revokeUriPermission(fileTransferPackageName, uriForFile, 2);
                    SdkLog.e(TAG, "Cannot create the content URI !!", e);
                    uriForFile = null;
                }
                if (uriForFile == null || isInternalPath(str)) {
                    throw new IllegalArgumentException("the receive path is illegal:" + str);
                }
            } catch (IOException e4) {
                e = e4;
                uriForFile = null;
            } catch (IllegalArgumentException e5) {
                e = e5;
                uriForFile = null;
            } catch (NullPointerException e6) {
                e = e6;
                uriForFile = null;
            }
        }
        final String string = uriForFile != null ? uriForFile.toString() : null;
        this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.file.FileTransfer.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        FileTransferManager.getInstance(FileTransfer.this.mContext, FileTransfer.this.mAgentName).receiveFile(FileTransfer.this.mLocalCallback, j, i, str, string, FileTransfer.COVERED_MODE);
                        FileTransfer.this.mTransactionUriMap.put(Integer.valueOf(i), Uri.parse(string));
                    } catch (GeneralException | IllegalAccessException e7) {
                        e7.printStackTrace();
                    }
                } finally {
                    FileTransfer.this.putTransactionRequest(j, i, false);
                }
            }
        });
    }

    public void reject(final long j, final int i) {
        SdkLog.d(TAG, "file reject, connId: " + j + ", transId: " + i);
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "Using invalid instance of FileTransfer(). Please re-register.");
            return;
        }
        if (!checkReceiveParams("", j, i) || !containsTransactionRequestKey(j, i)) {
            throw new IllegalArgumentException("Wrong transaction id used in reject()");
        }
        CallingAgentInfo.TransactionDetails transactionDetails = new CallingAgentInfo.TransactionDetails();
        transactionDetails.mTransactionId = i;
        transactionDetails.mFilePath = "";
        removeTransaction(j, i);
        this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.file.FileTransfer.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FileTransferManager.getInstance(FileTransfer.this.mContext, FileTransfer.this.mAgentName).receiveFile(null, j, i, null, false);
                } catch (GeneralException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public int send(PeerAgent peerAgent, String str) throws UnSupportException {
        Uri uri;
        int iSendFile;
        Uri uriForFile;
        if (!validateParam(peerAgent)) {
            return -1;
        }
        checkSource(str);
        String fileTransferPackageName = FTInitializer.getFileTransferPackageName(this.mContext);
        String contentURIAuthority = getContentURIAuthority();
        if (fileTransferPackageName == null || contentURIAuthority == null) {
            SdkLog.v(TAG, "FTCore version doesnot support content uri");
            uri = null;
        } else {
            try {
                SdkLog.v(TAG, "File :" + str);
                uriForFile = FileProvider.getUriForFile(this.mContext, contentURIAuthority, new File(str));
                try {
                    if (uriForFile == null) {
                        SdkLog.e(TAG, "Cannot create the content URI !");
                    } else {
                        this.mContext.grantUriPermission(fileTransferPackageName, uriForFile, 1);
                    }
                } catch (IllegalArgumentException e) {
                    e = e;
                    revokeUriPermission(fileTransferPackageName, uriForFile, 1);
                    SdkLog.e(TAG, "Cannot create the content URI !", e);
                    uriForFile = null;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                uriForFile = null;
            }
            if (uriForFile == null && isInternalPath(str)) {
                throw new IllegalArgumentException("content uri needs to be implemented for sending from internal folders.Please check file-transfer sdk documentation for more details");
            }
            uri = uriForFile;
        }
        CallingAgentInfo.TransactionDetails transactionDetails = new CallingAgentInfo.TransactionDetails();
        String string = uri != null ? uri.toString() : null;
        SdkLog.v(TAG, "FTCore strURI=" + string);
        try {
            iSendFile = FileTransferManager.getInstance(this.mContext, this.mAgentName).sendFile(this.mContext, this.mAgentName, this.mLocalCallback, peerAgent, string, str);
        } catch (GeneralException | IllegalAccessException e3) {
            e3.printStackTrace();
            iSendFile = -1;
        }
        SdkLog.d(TAG, "received tx from FTCore" + iSendFile);
        transactionDetails.mTransactionId = iSendFile;
        transactionDetails.mFilePath = str;
        putTransaction(0L, iSendFile, transactionDetails);
        if (iSendFile == -1) {
            SdkLog.d(TAG, "send file failed,revokeUriPermission");
            revokeUriPermission(fileTransferPackageName, uri, 1);
        } else if (uri != null) {
            this.mTransactionUriMap.put(Integer.valueOf(iSendFile), uri);
        }
        return iSendFile;
    }

    public FileTransfer(BaseJobAgent baseJobAgent, EventListener eventListener) throws SdkUnsupportedException {
        this(baseJobAgent, baseJobAgent.getApplicationContext(), eventListener);
    }

    public FileTransfer(Object obj, Context context, EventListener eventListener) throws SdkUnsupportedException {
        this.mTransactionsMap = new ConcurrentHashMap<>();
        this.mTransferRequestMap = new ConcurrentHashMap<>();
        this.mTransactionUriMap = new ConcurrentHashMap<>();
        this.mLocalCallback = new IFileTransferCallback() { // from class: com.heytap.accessory.file.FileTransfer.1
            @Override // com.heytap.accessory.file.FileTransfer.IFileTransferCallback
            public void onCancelAllCompleted(int[] iArr, int i) {
                for (int i2 : iArr) {
                    Iterator it = FileTransfer.this.mTransactionsMap.keySet().iterator();
                    while (it.hasNext()) {
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FileTransfer.this.mTransactionsMap.get(Long.valueOf(((Long) it.next()).longValue()));
                        if (concurrentHashMap != null) {
                            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                if (((CallingAgentInfo.TransactionDetails) entry.getValue()).mTransactionId == i2 && FileTransfer.this.mEventListener != null) {
                                    FileTransfer.this.removeTransactionByTransId(((Integer) entry.getKey()).intValue());
                                    FileTransfer.this.revokeUriPermission(i2);
                                }
                            }
                        }
                    }
                }
                if (FileTransfer.this.mEventListener != null) {
                    FileTransfer.this.handleOnCancelAllCompletedErrorCode(i);
                    FileTransfer.this.mEventListener.onCancelAllCompleted(0, i);
                }
            }

            @Override // com.heytap.accessory.file.FileTransfer.IFileTransferCallback
            public void onProgressChanged(long j, int i, int i2) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FileTransfer.this.mTransactionsMap.get(Long.valueOf(j));
                if (concurrentHashMap == null) {
                    SdkLog.w(FileTransfer.TAG, "detailsMap == null");
                    return;
                }
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (((CallingAgentInfo.TransactionDetails) entry.getValue()).mTransactionId == i && FileTransfer.this.mEventListener != null) {
                        FileTransfer.this.mEventListener.onProgressChanged(j, ((Integer) entry.getKey()).intValue(), i2);
                        return;
                    }
                }
            }

            @Override // com.heytap.accessory.file.FileTransfer.IFileTransferCallback
            public void onTransferCompleted(long j, int i, String str, long j2, int i2) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FileTransfer.this.mTransactionsMap.get(Long.valueOf(j));
                if (concurrentHashMap == null) {
                    SdkLog.w(FileTransfer.TAG, "onTransferCompleted detailsMap == null");
                    return;
                }
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    CallingAgentInfo.TransactionDetails transactionDetails = (CallingAgentInfo.TransactionDetails) entry.getValue();
                    if (transactionDetails.mTransactionId == i && FileTransfer.this.mEventListener != null) {
                        if (transactionDetails.mSource != null && i2 != 0) {
                            File file = new File(transactionDetails.mSource + "_temp_" + i);
                            if (!file.isFile() || !file.exists()) {
                                SdkLog.e(FileTransfer.TAG, "temp file could not be deleted - " + transactionDetails.mSource);
                            } else if (file.delete()) {
                                SdkLog.v(FileTransfer.TAG, "temp file deleted successfully - " + transactionDetails.mSource);
                            } else {
                                SdkLog.e(FileTransfer.TAG, "temp file could not be deleted - " + transactionDetails.mSource);
                            }
                            transactionDetails.mSource = null;
                        }
                        FileTransfer.this.handleOnTransferCompletedErrorCode(i2);
                        FileTransfer.this.mEventListener.onTransferCompleted(j, ((Integer) entry.getKey()).intValue(), str, j2, i2);
                        FileTransfer.this.removeTransaction(j, ((Integer) entry.getKey()).intValue());
                        FileTransfer.this.removeTransactionRequest(j, i);
                        FileTransfer.this.revokeUriPermission(i);
                        return;
                    }
                }
                if (FileTransfer.this.getTransactionRequestState(j, i) && i2 == 9) {
                    SdkLog.d(FileTransfer.TAG, "Ignoring onTransferCompleted because setup in progress");
                    return;
                }
                if (!FileTransfer.this.containsTransactionRequestKey(j, i) || FileTransfer.this.containsTransactionKey(j, i) || FileTransfer.this.mEventListener == null) {
                    return;
                }
                FileTransfer.this.handleOnTransferCompletedErrorCode(i2);
                FileTransfer.this.mEventListener.onTransferCompleted(j, i, str, j2, i2);
                FileTransfer.this.removeTransactionRequest(j, i);
            }

            @Override // com.heytap.accessory.file.FileTransfer.IFileTransferCallback
            public void onTransferRequested(long j, int i, String str) {
                SdkLog.d(FileTransfer.TAG, "onTransferRequested");
            }
        };
        if (obj != null && eventListener != null) {
            this.mCallingAgent = obj;
            this.mContext = context;
            this.mAgentName = obj.getClass().getName();
            this.mEventListener = eventListener;
            FTInitializer.init(this.mContext);
            if (register()) {
                return;
            }
            SdkLog.d(TAG, "Agent already registered");
            CallingAgentInfo callingAgentInfo = FileTransferManager.getCallingAgentInfo(this.mAgentName);
            this.mCallingAgentInfo = callingAgentInfo;
            if (callingAgentInfo != null) {
                this.mFileTransferHandlerThread = callingAgentInfo.getHandlerThread();
                this.mHandler = (FTHandler) this.mCallingAgentInfo.getHandler();
                this.mTransactionsMap = this.mCallingAgentInfo.getTransactionsMap();
                this.mCallingAgentInfo.setEventListener(this.mEventListener);
                this.mCallingAgentInfo.setLocalCallback(this.mLocalCallback);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FileEventCallback parameter cannot be null");
    }

    private void revokeUriPermission(String str, Uri uri, int i) {
        if (!TextUtils.isEmpty(str) && uri != null) {
            SdkLog.d(TAG, "revokeUriPermission packageName:" + str + " uri:" + uri);
            this.mContext.revokeUriPermission(str, uri, i);
            return;
        }
        SdkLog.w("revokeUriPermission failed, params invalid");
    }

    @RequiresApi(api = 16)
    public int send(PeerAgent peerAgent, Uri uri) throws UnSupportException {
        return send(peerAgent, uri, "");
    }

    @RequiresApi(api = 16)
    public int send(PeerAgent peerAgent, Uri uri, @NonNull String str) throws UnSupportException {
        int iSendFile;
        if (!validateParam(peerAgent)) {
            return -1;
        }
        SdkLog.d(TAG, "peerAgent:" + peerAgent);
        String fileTransferPackageName = FTInitializer.getFileTransferPackageName(this.mContext);
        if (fileTransferPackageName != null) {
            try {
                if (uri == null) {
                    SdkLog.e(TAG, "File path is wrong!!");
                    return -1;
                }
                SdkLog.v(TAG, "File :" + uri);
                this.mContext.grantUriPermission(fileTransferPackageName, uri, 1);
            } catch (Exception e) {
                SdkLog.e(TAG, "send Error grantUriPermission!!" + e);
            }
        } else {
            SdkLog.v(TAG, "FTCore version doesnot support content uri");
        }
        CallingAgentInfo.TransactionDetails transactionDetails = new CallingAgentInfo.TransactionDetails();
        try {
            iSendFile = FileTransferManager.getInstance(this.mContext, this.mAgentName).sendFile(this.mContext, this.mAgentName, str, this.mLocalCallback, peerAgent, uri);
        } catch (GeneralException | IllegalAccessException e2) {
            revokeUriPermission(fileTransferPackageName, uri, 1);
            SdkLog.e(TAG, "sendFile failed!", e2);
            iSendFile = -1;
        }
        SdkLog.d(TAG, "received tx from FTCore" + iSendFile);
        transactionDetails.mTransactionId = iSendFile;
        transactionDetails.mFilePath = uri != null ? uri.toString() : "";
        putTransaction(0L, iSendFile, transactionDetails);
        if (iSendFile == -1) {
            SdkLog.d(TAG, "send file failed,revokeUriPermission");
            revokeUriPermission(fileTransferPackageName, uri, 1);
        } else if (uri != null) {
            this.mTransactionUriMap.put(Integer.valueOf(iSendFile), uri);
        }
        return iSendFile;
    }

    public void receive(final long j, final int i, final Uri uri) {
        SdkLog.i(TAG, "receive receiveFileUri: " + uri + ", connectionId:" + j + ", transactionId:" + i + ", " + hashCode());
        if (this.mCallingAgent != null && this.mEventListener != null) {
            if (containsTransactionRequestKey(j, i)) {
                CallingAgentInfo.TransactionDetails transactionDetails = new CallingAgentInfo.TransactionDetails();
                transactionDetails.mConnectionId = j;
                transactionDetails.mTransactionId = i;
                transactionDetails.mFilePath = uri.toString();
                putTransaction(j, i, transactionDetails);
                String fileTransferPackageName = FTInitializer.getFileTransferPackageName(this.mContext);
                if (fileTransferPackageName != null) {
                    try {
                        transactionDetails.mSource = uri.toString();
                        this.mContext.grantUriPermission(fileTransferPackageName, uri, 2);
                    } catch (Exception e) {
                        revokeUriPermission(fileTransferPackageName, uri, 2);
                        SdkLog.e(TAG, "Error grantUriPermission!!", e);
                    }
                } else {
                    SdkLog.v(TAG, "Accessory Framework doesn't support content URI !!");
                }
                this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.file.FileTransfer.3
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            try {
                                FileTransferManager.getInstance(FileTransfer.this.mContext, FileTransfer.this.mAgentName).receiveFile(FileTransfer.this.mLocalCallback, j, i, uri, FileTransfer.COVERED_MODE);
                                FileTransfer.this.mTransactionUriMap.put(Integer.valueOf(i), uri);
                            } catch (GeneralException | IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        } finally {
                            FileTransfer.this.putTransactionRequest(j, i, false);
                        }
                    }
                });
                return;
            }
            SdkLog.d(TAG, "TransactionId: Given[" + i + "] not exist");
            putTransactionRequest(j, i, false);
            throw new IllegalArgumentException("Wrong filepath or transaction id used");
        }
        SdkLog.d(TAG, "Using invalid instance of FileTransfer(). Please re-register.");
        putTransactionRequest(j, i, false);
    }
}
