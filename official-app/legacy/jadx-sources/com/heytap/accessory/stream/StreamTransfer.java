package com.heytap.accessory.stream;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.heytap.accessory.BaseAgent;
import com.heytap.accessory.BaseJobAgent;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.bean.UnSupportException;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.stream.model.CallingAgentInfo;
import com.heytap.accessory.utils.BroadcastUtils;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class StreamTransfer {
    public static final String ACTION_STREAM_TRANSFER_REQUESTED = "com.heytap.accessory.streamconnection";
    public static final int ERROR_CANCEL_ACC_SLEEPING = 17;
    public static final int ERROR_CHANNEL_IO = 1;
    public static final int ERROR_COMMAND_DROPPED = 3;
    public static final int ERROR_CONNECTION_LOST = 5;
    public static final int ERROR_FATAL = 20001;
    public static final int ERROR_FILE_IO = 2;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_SUPPORTED = 12;
    public static final int ERROR_PEER_AGENT_BUSY = 8;
    public static final int ERROR_PEER_AGENT_NO_RESPONSE = 4;
    public static final int ERROR_PEER_AGENT_REJECTED = 9;
    public static final int ERROR_RECEIVER_MEMORY_LACKING = 15;
    public static final int ERROR_RECEIVER_WAIT_TILL_TIMEOUT = 16;
    public static final int ERROR_REQUEST_NOT_QUEUED = -1;
    public static final int ERROR_SPACE_NOT_AVAILABLE = 11;
    public static final int ERROR_TRANSACTION_NOT_FOUND = 13;
    public static final String RECEIVE_PFD = "receivePfd";
    private static final int ST_CANCEL_TRANS_ID = -1;
    private static final int ST_DEFAULT_CONNECTION_ID = 0;
    private static final int ST_DEFAULT_TRANS_ID = 0;
    private static final String TAG = "StreamTransfer";
    private String mAgentName;
    private Object mCallingAgent;
    private CallingAgentInfo mCallingAgentInfo;
    private ConcurrentHashMap<Long, Boolean> mConnectionMap;
    private Context mContext;
    private EventListener mEventListener;
    private StreamHandler mHandler;
    private IStreamTransferCallback mLocalCallback;
    private HandlerThread mStreamTransferHandlerThread;
    private ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> mTransactionsMap;
    private ConcurrentHashMap<Long, ConcurrentHashMap<Integer, Boolean>> mTransferRequestMap;

    public static class BackgroundExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(final Thread thread, final Throwable th) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.heytap.accessory.stream.StreamTransfer.BackgroundExceptionHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    SdkLog.e(StreamTransfer.TAG, "Exception in StreamTransfer Handler thread :" + thread.getName());
                    throw new RuntimeException(th);
                }
            });
        }

        private BackgroundExceptionHandler() {
        }
    }

    public interface EventListener {
        void onCancelAllCompleted(int i, int i2);

        void onStreamReceived(long j2, int i, InputStream inputStream);

        void onTransferCompleted(long j2, int i, int i2);

        void onTransferRequested(long j2, int i, int i2);
    }

    public interface IStreamTransferCallback {
        void onCancelAllCompleted(int[] iArr, int i);

        void onTransferCompleted(long j2, int i, int i2);

        void onTransferRequested(long j2, int i);
    }

    public static class StreamHandler extends Handler {
        public StreamHandler(Looper looper) {
            super(looper);
        }
    }

    public StreamTransfer(BaseAgent baseAgent, EventListener eventListener) throws SdkUnsupportedException {
        this(baseAgent, baseAgent.getApplicationContext(), eventListener);
    }

    private boolean checkReceiveParams(long j2, int i) {
        if (!containsTransactionKey(j2, i)) {
            return true;
        }
        SdkLog.d(TAG, "transactionId already exist");
        return false;
    }

    private boolean checkStreamUnSupport(PeerAgent peerAgent) {
        return peerAgent == null || peerAgent.getAccessory() == null || !peerAgent.getAccessory().supportStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean containsTransactionKey(long j2, int i) {
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap;
        ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails> concurrentHashMap2;
        concurrentHashMap = this.mTransactionsMap;
        return (concurrentHashMap == null || (concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(j2))) == null) ? false : concurrentHashMap2.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean containsTransactionRequestKey(long j2, int i) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap;
        concurrentHashMap = this.mTransferRequestMap.get(Long.valueOf(j2));
        return concurrentHashMap != null ? concurrentHashMap.containsKey(Integer.valueOf(i)) : false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized CallingAgentInfo.TransactionDetails getTransaction(long j2, int i) {
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap;
        ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails> concurrentHashMap2;
        concurrentHashMap = this.mTransactionsMap;
        return (concurrentHashMap == null || (concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(j2))) == null) ? null : concurrentHashMap2.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean getTransactionRequestState(long j2, int i) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.mTransferRequestMap.get(Long.valueOf(j2));
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.get(Integer.valueOf(i)).booleanValue();
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
        if (i == 17) {
            SdkLog.i(TAG, "onCancelAllCompleted() -> ERROR_CANCEL_ACC_SLEEPING");
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
        if (i == 15) {
            SdkLog.i(TAG, "onTransferCompleted() -> ERROR_RECEIVER_MEMORY_LACKING");
            return;
        }
        if (i == 16) {
            SdkLog.i(TAG, "onTransferCompleted() -> ERROR_RECEIVER_WAIT_TILL_TIMEOUT");
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

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void putConnectionRequest(long j2, boolean z) {
        this.mConnectionMap.put(Long.valueOf(j2), Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void putTransaction(long j2, int i, CallingAgentInfo.TransactionDetails transactionDetails) {
        SdkLog.i(TAG, "putTransaction: connectionId:" + j2);
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap = this.mTransactionsMap;
        if (concurrentHashMap != null) {
            ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails> concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(j2));
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                this.mTransactionsMap.put(Long.valueOf(j2), concurrentHashMap2);
            }
            concurrentHashMap2.put(Integer.valueOf(i), transactionDetails);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void putTransactionRequest(long j2, int i, boolean z) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.mTransferRequestMap.get(Long.valueOf(j2));
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        concurrentHashMap.put(Integer.valueOf(i), Boolean.valueOf(z));
        this.mTransferRequestMap.put(Long.valueOf(j2), concurrentHashMap);
        SdkLog.d(TAG, "transaction request : " + j2 + " , " + i + " , " + z + " , " + getTransactionRequestState(j2, i));
    }

    private boolean register() {
        if (!StreamTransferManager.register(this, this.mAgentName)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread("StreamTransferHandlerThread");
        this.mStreamTransferHandlerThread = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new BackgroundExceptionHandler());
        this.mStreamTransferHandlerThread.start();
        SdkLog.d(TAG, "StreamTransferHandlerThread started");
        Looper looper = this.mStreamTransferHandlerThread.getLooper();
        if (looper != null) {
            this.mHandler = new StreamHandler(looper);
        }
        if (this.mHandler == null) {
            return false;
        }
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap = new ConcurrentHashMap<>();
        this.mTransactionsMap = concurrentHashMap;
        CallingAgentInfo callingAgentInfo = new CallingAgentInfo(this.mEventListener, this.mStreamTransferHandlerThread, this.mHandler, this.mLocalCallback, concurrentHashMap);
        this.mCallingAgentInfo = callingAgentInfo;
        StreamTransferManager.register(this.mAgentName, callingAgentInfo);
        this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.stream.StreamTransfer.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    StreamTransferManager.getInstance(StreamTransfer.this.mContext, StreamTransfer.this.mAgentName);
                } catch (GeneralException | IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeTransaction(long j2, int i) {
        ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails> concurrentHashMap;
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap2 = this.mTransactionsMap;
        if (concurrentHashMap2 != null && (concurrentHashMap = concurrentHashMap2.get(Long.valueOf(j2))) != null) {
            concurrentHashMap.remove(Integer.valueOf(i));
            if (concurrentHashMap.isEmpty()) {
                this.mTransactionsMap.remove(Long.valueOf(j2));
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
    public synchronized void removeTransactionRequest(long j2, int i) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.mTransferRequestMap.get(Long.valueOf(j2));
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(Integer.valueOf(i));
            if (concurrentHashMap.isEmpty()) {
                this.mTransferRequestMap.remove(Long.valueOf(j2));
            }
        }
    }

    private boolean validateParam(PeerAgent peerAgent) throws UnSupportException {
        if (peerAgent == null) {
            throw new IllegalArgumentException("PeerAgent cannot be null");
        }
        if (checkStreamUnSupport(peerAgent)) {
            throw new UnSupportException("the peer agent doesn't support the stream feature, please check");
        }
        Object obj = this.mCallingAgent;
        if (obj == null || this.mEventListener == null) {
            SdkLog.e(TAG, "Using invalid instance of StreamTransfer(). Please re-register.");
            return false;
        }
        if (obj instanceof BaseJobAgent) {
            if (!((BaseJobAgent) obj).getSuccessfulConnections().isEmpty()) {
                return true;
            }
            SdkLog.e(TAG, "current baseJobAgent has not setup service connection, please connect service first");
            return false;
        }
        if (!(obj instanceof BaseAgent) || !((BaseAgent) obj).getSuccessfulConnections().isEmpty()) {
            return true;
        }
        SdkLog.e(TAG, "current baseAgent has not setup service connection, please connect service first");
        return false;
    }

    public void cancel(long j2, int i) {
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "Using invalid instance of StreamTransfer(). Please re-register.");
            return;
        }
        if (!containsTransactionKey(j2, i)) {
            SdkLog.e(TAG, "Wrong transaction id used for cancel");
            return;
        }
        try {
            CallingAgentInfo.TransactionDetails transaction = getTransaction(j2, i);
            if (transaction == null) {
                SdkLog.d(TAG, "cancelStream aborted because service connection or transaction already closed.");
            } else {
                int i2 = transaction.mTransactionId;
                if (i2 == 0) {
                    transaction.mTransactionId = -1;
                    SdkLog.d(TAG, "Cancel called before transaction id is genereated" + i);
                } else if (i2 == -1) {
                    SdkLog.d(TAG, "Cancel called again before transaction id is genereated" + i);
                } else {
                    StreamTransferManager.getInstance(this.mContext, this.mAgentName).cancelStream(j2, transaction.mTransactionId);
                }
            }
            this.mConnectionMap.remove(Long.valueOf(j2));
        } catch (GeneralException | IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    public void cancelAll() {
        SdkLog.d(TAG, "[cancelAll] Stream");
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "[cancelAll] Using invalid instance of  Please re-register.");
            return;
        }
        try {
            final StreamTransferManager streamTransferManager = StreamTransferManager.getInstance(this.mContext, this.mAgentName);
            final String agentId = streamTransferManager.getAgentId(this.mContext, this.mAgentName);
            if (TextUtils.isEmpty(agentId)) {
                SdkLog.e(TAG, "[cancelAll] Your service was not found. Please re-register");
            } else {
                this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.stream.StreamTransfer.4
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (StreamTransfer.this) {
                            for (Long l2 : StreamTransfer.this.mTransactionsMap.keySet()) {
                                if (StreamTransfer.this.mConnectionMap.containsKey(l2)) {
                                    int iCancelAllTransactions = ((Boolean) StreamTransfer.this.mConnectionMap.get(l2)).booleanValue() ? streamTransferManager.cancelAllTransactions("0", l2.longValue()) : streamTransferManager.cancelAllTransactions(agentId, 0L);
                                    if (StreamTransfer.this.mEventListener == null) {
                                        SdkLog.w(StreamTransfer.TAG, "[cancelAll] listener is null.");
                                        return;
                                    }
                                    SdkLog.d(StreamTransfer.TAG, "[cancelAll] cancel status " + iCancelAllTransactions);
                                    if (iCancelAllTransactions == 0) {
                                        StreamTransfer.this.handleOnCancelAllCompletedErrorCode(12);
                                        StreamTransfer.this.mEventListener.onCancelAllCompleted(-1, 12);
                                    } else if (iCancelAllTransactions == 13) {
                                        StreamTransfer.this.handleOnCancelAllCompletedErrorCode(13);
                                        StreamTransfer.this.mEventListener.onCancelAllCompleted(-1, 13);
                                    } else if (iCancelAllTransactions == 17) {
                                        StreamTransfer.this.handleOnCancelAllCompletedErrorCode(17);
                                        StreamTransfer.this.mEventListener.onCancelAllCompleted(-1, 17);
                                    }
                                }
                            }
                            StreamTransfer.this.mConnectionMap.clear();
                        }
                    }
                });
            }
        } catch (GeneralException | IllegalAccessException e2) {
            SdkLog.e(TAG, "[cancelAll]" + e2);
            SdkLog.d(TAG, "get StreamTransferManager null,cancelAll failed");
        }
    }

    public void close() {
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "Using invalid instance of StreamTransfer(). Please re-register.");
            return;
        }
        SdkLog.d(TAG, "stopStreamTransferService() called by : " + this.mAgentName);
        cancelAll();
        StreamTransferManager.unregister(this.mAgentName);
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> concurrentHashMap = this.mTransactionsMap;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        StreamHandler streamHandler = this.mHandler;
        if (streamHandler != null) {
            streamHandler.removeCallbacksAndMessages(null);
            this.mHandler.getLooper().quit();
        }
        this.mCallingAgent = null;
        this.mEventListener = null;
    }

    public void informIncomingSTRequest(Context context, Intent intent) {
        final int intExtra = intent.getIntExtra("transId", -1);
        String stringExtra = intent.getStringExtra("agentClass");
        final long longExtra = intent.getLongExtra("connectionId", 0L);
        final int i = Integer.parseInt(intent.getStringExtra("contId"));
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
        final CallingAgentInfo callingAgentInfo = StreamTransferManager.getCallingAgentInfo(stringExtra);
        if (callingAgentInfo == null) {
            SdkLog.e(TAG, "AgentInfo is NULL! Re-Registering");
            register();
            informIncomingSTRequest(context, intent);
        } else {
            if (callingAgentInfo.getEventListener() == null) {
                SdkLog.e(TAG, "callback is not registered for " + stringExtra);
                return;
            }
            SdkLog.d(TAG, "Informing app of incoming stream transfer request on registered callback-tid: " + intExtra);
            this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.stream.StreamTransfer.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        StreamTransferManager.getInstance(StreamTransfer.this.mContext, StreamTransfer.this.mAgentName).registerCallback(StreamTransfer.this.mLocalCallback, intExtra);
                        StreamTransfer.this.putTransactionRequest(longExtra, intExtra, true);
                        callingAgentInfo.getEventListener().onTransferRequested(longExtra, i, intExtra);
                    } catch (GeneralException | IllegalAccessException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    public void receive(final long j2, final int i) {
        SdkLog.i(TAG, "receive task: " + i + " , " + hashCode());
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "Using invalid instance of StreamTransfer(). Please re-register.");
            putTransactionRequest(j2, i, false);
            return;
        }
        if (!checkReceiveParams(j2, i) || !containsTransactionRequestKey(j2, i)) {
            SdkLog.d(TAG, "TransactionId: Given[" + i + "] not exist");
            putTransactionRequest(j2, i, false);
            throw new IllegalArgumentException("Wrong filepath or transaction id used");
        }
        CallingAgentInfo.TransactionDetails transactionDetails = new CallingAgentInfo.TransactionDetails();
        transactionDetails.mConnectionId = j2;
        transactionDetails.mTransactionId = i;
        putTransaction(j2, i, transactionDetails);
        putConnectionRequest(j2, true);
        if (StreamInitializer.getStreamMsgPackageName(this.mContext) == null) {
            SdkLog.v(TAG, "Accessory Framework doesn't support content URI !!");
        }
        this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.stream.StreamTransfer.2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [int] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorReceiveStream = StreamTransferManager.getInstance(StreamTransfer.this.mContext, StreamTransfer.this.mAgentName).receiveStream(StreamTransfer.this.mLocalCallback, j2, i, true);
                        if (parcelFileDescriptorReceiveStream != null) {
                            StreamTransfer.this.mEventListener.onStreamReceived(j2, i, new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorReceiveStream));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } finally {
                    StreamTransfer.this.putTransactionRequest(j2, i, false);
                }
            }
        });
    }

    public void reject(final long j2, final int i) {
        if (this.mCallingAgent == null || this.mEventListener == null) {
            SdkLog.d(TAG, "Using invalid instance of StreamTransfer(). Please re-register.");
        } else {
            if (!checkReceiveParams(j2, i) || !containsTransactionRequestKey(j2, i)) {
                throw new IllegalArgumentException("Wrong transaction id used in reject()");
            }
            new CallingAgentInfo.TransactionDetails().mTransactionId = i;
            removeTransaction(j2, i);
            this.mHandler.post(new Runnable() { // from class: com.heytap.accessory.stream.StreamTransfer.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        StreamTransferManager.getInstance(StreamTransfer.this.mContext, StreamTransfer.this.mAgentName).receiveStream(null, j2, i, false);
                    } catch (GeneralException | IllegalAccessException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    @Deprecated
    public int send(PeerAgent peerAgent, InputStream inputStream, int i) throws UnSupportException {
        return send(peerAgent, inputStream, (FileDescriptor) null);
    }

    public StreamTransfer(BaseJobAgent baseJobAgent, EventListener eventListener) throws SdkUnsupportedException {
        this(baseJobAgent, baseJobAgent.getApplicationContext(), eventListener);
    }

    @Deprecated
    public int send(PeerAgent peerAgent, FileDescriptor fileDescriptor, int i) throws UnSupportException {
        return send(peerAgent, (InputStream) null, fileDescriptor);
    }

    public StreamTransfer(Object obj, Context context, EventListener eventListener) throws SdkUnsupportedException {
        this.mTransactionsMap = new ConcurrentHashMap<>();
        this.mConnectionMap = new ConcurrentHashMap<>();
        this.mTransferRequestMap = new ConcurrentHashMap<>();
        this.mLocalCallback = new IStreamTransferCallback() { // from class: com.heytap.accessory.stream.StreamTransfer.1
            @Override // com.heytap.accessory.stream.StreamTransfer.IStreamTransferCallback
            public void onCancelAllCompleted(int[] iArr, int i) {
                if (iArr == null) {
                    StreamTransfer.this.handleOnCancelAllCompletedErrorCode(13);
                    return;
                }
                for (int i2 : iArr) {
                    Iterator it = StreamTransfer.this.mTransactionsMap.keySet().iterator();
                    while (it.hasNext()) {
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) StreamTransfer.this.mTransactionsMap.get(Long.valueOf(((Long) it.next()).longValue()));
                        if (concurrentHashMap != null) {
                            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                if (((CallingAgentInfo.TransactionDetails) entry.getValue()).mTransactionId == i2 && StreamTransfer.this.mEventListener != null) {
                                    StreamTransfer.this.removeTransactionByTransId(((Integer) entry.getKey()).intValue());
                                }
                            }
                        }
                    }
                }
                if (StreamTransfer.this.mEventListener != null) {
                    StreamTransfer.this.handleOnCancelAllCompletedErrorCode(i);
                    for (int i3 : iArr) {
                        StreamTransfer.this.mEventListener.onCancelAllCompleted(i3, 13);
                    }
                }
            }

            @Override // com.heytap.accessory.stream.StreamTransfer.IStreamTransferCallback
            public void onTransferCompleted(long j2, int i, int i2) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) StreamTransfer.this.mTransactionsMap.get(Long.valueOf(j2));
                if (concurrentHashMap == null) {
                    SdkLog.e(StreamTransfer.TAG, "connectionId =" + j2 + "not exits");
                    return;
                }
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (((CallingAgentInfo.TransactionDetails) entry.getValue()).mTransactionId == i && StreamTransfer.this.mEventListener != null) {
                        StreamTransfer.this.handleOnTransferCompletedErrorCode(i2);
                        if (StreamTransfer.this.mEventListener != null) {
                            StreamTransfer.this.mEventListener.onTransferCompleted(j2, ((Integer) entry.getKey()).intValue(), i2);
                        }
                        StreamTransfer.this.removeTransaction(j2, ((Integer) entry.getKey()).intValue());
                        StreamTransfer.this.removeTransactionRequest(j2, i);
                        return;
                    }
                }
                if (StreamTransfer.this.getTransactionRequestState(j2, i) && i2 == 9) {
                    SdkLog.d(StreamTransfer.TAG, "Ignoring onTransferCompleted because setup in progress");
                    return;
                }
                if (!StreamTransfer.this.containsTransactionRequestKey(j2, i) || StreamTransfer.this.containsTransactionKey(j2, i) || StreamTransfer.this.mEventListener == null) {
                    return;
                }
                StreamTransfer.this.handleOnTransferCompletedErrorCode(i2);
                if (StreamTransfer.this.mEventListener != null) {
                    StreamTransfer.this.mEventListener.onTransferCompleted(j2, i, i2);
                }
                StreamTransfer.this.removeTransactionRequest(j2, i);
                StreamTransfer.this.removeTransactionByTransId(i);
            }

            @Override // com.heytap.accessory.stream.StreamTransfer.IStreamTransferCallback
            public void onTransferRequested(long j2, int i) {
                SdkLog.d(StreamTransfer.TAG, "onTransferRequested");
                CallingAgentInfo.TransactionDetails transaction = StreamTransfer.this.getTransaction(0L, i);
                StreamTransfer.this.removeTransaction(0L, i);
                SdkLog.i(StreamTransfer.TAG, "onTransferRequested: mTransactionsMap：" + StreamTransfer.this.mTransactionsMap.size());
                StreamTransfer.this.putTransaction(j2, i, transaction);
                StreamTransfer.this.putConnectionRequest(j2, false);
            }
        };
        if (obj != null && eventListener != null) {
            this.mCallingAgent = obj;
            this.mContext = context;
            this.mAgentName = obj.getClass().getName();
            SdkLog.d(TAG, "new StreamTransfer: " + this.mAgentName);
            this.mEventListener = eventListener;
            StreamInitializer.initialize(this.mContext);
            if (register()) {
                return;
            }
            SdkLog.d(TAG, "Agent already registered");
            CallingAgentInfo callingAgentInfo = StreamTransferManager.getCallingAgentInfo(this.mAgentName);
            this.mCallingAgentInfo = callingAgentInfo;
            if (callingAgentInfo != null) {
                this.mStreamTransferHandlerThread = callingAgentInfo.getHandlerThread();
                this.mHandler = (StreamHandler) this.mCallingAgentInfo.getHandler();
                this.mTransactionsMap = this.mCallingAgentInfo.getTransactionsMap();
                this.mCallingAgentInfo.setEventListener(this.mEventListener);
                this.mCallingAgentInfo.setLocalCallback(this.mLocalCallback);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("StreamEventCallback parameter cannot be null");
    }

    public int send(PeerAgent peerAgent, InputStream inputStream) throws UnSupportException {
        return send(peerAgent, inputStream, (FileDescriptor) null);
    }

    public int send(PeerAgent peerAgent, FileDescriptor fileDescriptor) throws UnSupportException {
        return send(peerAgent, (InputStream) null, fileDescriptor);
    }

    private int send(PeerAgent peerAgent, InputStream inputStream, FileDescriptor fileDescriptor) throws UnSupportException {
        int iSendStream;
        int i = -1;
        if (validateParam(peerAgent)) {
            if (StreamInitializer.getStreamMsgPackageName(this.mContext) == null) {
                SdkLog.v(TAG, "FTCore version doesnot support content uri");
            } else if (inputStream == null && fileDescriptor == null) {
                SdkLog.e(TAG, "input source is wrong!!");
                return -1;
            }
            CallingAgentInfo.TransactionDetails transactionDetails = new CallingAgentInfo.TransactionDetails();
            try {
                if (inputStream == null) {
                    iSendStream = StreamTransferManager.getInstance(this.mContext, this.mAgentName).sendStream(this.mContext, this.mAgentName, this.mLocalCallback, peerAgent, fileDescriptor);
                } else {
                    iSendStream = StreamTransferManager.getInstance(this.mContext, this.mAgentName).sendStream(this.mContext, this.mAgentName, this.mLocalCallback, peerAgent, inputStream);
                }
                i = iSendStream;
            } catch (GeneralException | IllegalAccessException e2) {
                e2.printStackTrace();
            }
            SdkLog.d(TAG, "received tx from STCore" + i);
            transactionDetails.mTransactionId = i;
            putTransaction(0L, i, transactionDetails);
        }
        return i;
    }
}
