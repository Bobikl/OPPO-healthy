package com.heytap.accessory.stream;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.heytap.accessory.BaseAdapter;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.core.IStreamManager;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.stream.model.CallingAgentInfo;
import com.heytap.accessory.stream.model.CancelAllRequest;
import com.heytap.accessory.stream.model.CancelStreamRequest;
import com.heytap.accessory.stream.model.STOperateEntity;
import com.heytap.accessory.stream.model.StreamReceiveEntity;
import com.heytap.accessory.stream.model.StreamSendEntity;
import com.heytap.accessory.stream.utils.StreamUtils;
import com.oplus.aiunit.vision.alf;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public class StreamTransferManager {
    public static final String BUNDLE_KEY_SOURCE = "BUNDLE_KEY_SOURCE";
    private static final int FT_SERVICE_BIND_TIMEOUT = 2000;
    public static final String JSON_UPDATE_MSG = "CallBackJson";
    public static final int STREAM_TRANSFER_ACCEPT_URI = 5;
    public static final int STREAM_TRANSFER_START_URI = 4;
    public static final int STREAM_TRANSFER_STOP = 3;
    public static final int STREAM_TRANSFER_STOP_ALL = 6;
    private static final String TAG = "StreamTransferManager";
    private static UpdateHandler mUpdater;
    private static StreamTransferManager sOnlyInstance;
    private Context mContext;
    ServiceConnection mFTServiceConn = new ServiceConnection() { // from class: com.heytap.accessory.stream.StreamTransferManager.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder == null) {
                SdkLog.e(StreamTransferManager.TAG, "onServiceConnected: Stream Transfer service not created");
                return;
            }
            SdkLog.i(StreamTransferManager.TAG, "inside onServiceConnected mFTServiceConn");
            IStreamManager iStreamManagerAsInterface = IStreamManager.Stub.asInterface(iBinder);
            StreamTransferManager streamTransferManager = StreamTransferManager.this;
            streamTransferManager.mServiceConnectionProxy = new STServiceConnectionProxy(streamTransferManager.mContext, StreamTransferManager.this.mContext.getPackageName(), iStreamManagerAsInterface);
            HandlerThread handlerThread = new HandlerThread("StreamUpdateReceiverThread");
            handlerThread.start();
            if (handlerThread.getLooper() != null) {
                UpdateHandler unused = StreamTransferManager.mUpdater = new UpdateHandler(handlerThread.getLooper());
            }
            boolean unused2 = StreamTransferManager.sIsBound = true;
            SdkLog.i(StreamTransferManager.TAG, "onServiceConnected: Stream Transfer service connected");
            if (StreamTransferManager.mInstanceLock != null) {
                StreamTransferManager.mInstanceLock.countDown();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            SdkLog.d(StreamTransferManager.TAG, "onServiceDisconnected: Stream Transfer service disconnected");
            if (StreamTransferManager.sOnlyInstance != null) {
                StreamTransferManager.sOnlyInstance.mContext.unbindService(this);
                StreamTransferManager.sOnlyInstance.mServiceConnectionProxy = null;
                StreamTransferManager unused = StreamTransferManager.sOnlyInstance = null;
            }
            boolean unused2 = StreamTransferManager.sIsBound = false;
            if (StreamTransferManager.mUpdater != null) {
                StreamTransferManager.mUpdater.getLooper().quit();
                UpdateHandler unused3 = StreamTransferManager.mUpdater = null;
            }
            Iterator it = StreamTransferManager.sCallingAgentInfos.entrySet().iterator();
            while (it.hasNext()) {
                CallingAgentInfo callingAgentInfo = (CallingAgentInfo) ((Map.Entry) it.next()).getValue();
                if (callingAgentInfo != null) {
                    ConcurrentHashMap<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>> transactionsMap = callingAgentInfo.getTransactionsMap();
                    Iterator<Map.Entry<Long, ConcurrentHashMap<Integer, CallingAgentInfo.TransactionDetails>>> it2 = transactionsMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        for (CallingAgentInfo.TransactionDetails transactionDetails : it2.next().getValue().values()) {
                            callingAgentInfo.getLocalCallback().onTransferCompleted(transactionDetails.mConnectionId, transactionDetails.mTransactionId, 20001);
                        }
                    }
                    transactionsMap.clear();
                }
            }
            if (StreamTransferManager.mInstanceLock != null) {
                StreamTransferManager.mInstanceLock.countDown();
            }
        }
    };
    private STServiceConnectionProxy mServiceConnectionProxy;
    private static ConcurrentHashMap<String, CallingAgentInfo> sCallingAgentInfos = new ConcurrentHashMap<>();
    private static List<String> sCallingAgentNames = new CopyOnWriteArrayList();
    private static Map<String, StreamTransfer> sStreamTransferMap = new ConcurrentHashMap();
    private static final CountDownLatch mInstanceLock = new CountDownLatch(1);
    private static boolean sIsBound = false;

    public static class STServiceConnectionProxy {
        private Context mContext;
        private String mPackageName;
        private IStreamManager mService;

        public STServiceConnectionProxy(Context context, String str, IStreamManager iStreamManager) {
            this.mPackageName = str;
            this.mContext = context;
            this.mService = iStreamManager;
        }

        public Context getContext() {
            return this.mContext;
        }

        public String getPackageName() {
            return this.mPackageName;
        }

        public IStreamManager getService() {
            return this.mService;
        }
    }

    public static class UpdateHandler extends Handler {
        public UpdateHandler(Looper looper) {
            super(looper);
        }
    }

    public static CallingAgentInfo getCallingAgentInfo(String str) {
        return sCallingAgentInfos.get(str);
    }

    public static synchronized StreamTransferManager getInstance(Context context, String str) throws IllegalAccessException, GeneralException {
        StreamTransferManager streamTransferManager = sOnlyInstance;
        if (streamTransferManager == null || streamTransferManager.mServiceConnectionProxy == null) {
            StreamTransferManager streamTransferManager2 = new StreamTransferManager();
            sOnlyInstance = streamTransferManager2;
            streamTransferManager2.mContext = context;
            Intent intent = new Intent(StreamInitializer.STREAM_TRANSFER_SERVICE_INTENT);
            String streamMsgPackageName = StreamInitializer.getStreamMsgPackageName(sOnlyInstance.mContext);
            if (streamMsgPackageName == null) {
                throw new GeneralException(20001, "Package name is null!");
            }
            intent.setPackage(streamMsgPackageName);
            String str2 = TAG;
            SdkLog.i(str2, "getInstance: bindService before=" + intent);
            StreamTransferManager streamTransferManager3 = sOnlyInstance;
            if (streamTransferManager3.mContext.bindService(intent, streamTransferManager3.mFTServiceConn, 1)) {
                try {
                    SdkLog.i(str2, "About start waiting");
                    mInstanceLock.await(2000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    SdkLog.w(TAG, "StreamTransferManager getInstance InterruptedException");
                }
                if (!sIsBound) {
                    throw new GeneralException(20001, "Timed out trying to bind to Stream Service!");
                }
                SdkLog.i(TAG, "getInstance: Woken up , StreamService Connected");
            } else {
                SdkLog.e(str2, "getInstance: FTService Connection Failed");
            }
            if (str == null) {
                throw new IllegalAccessException("Calling agent was cleared from record. Please re-register your service.");
            }
            SdkLog.d(TAG, str + " is using StreamService");
        }
        return sOnlyInstance;
    }

    public static StreamTransfer getStreamTransfer(String str) {
        return sStreamTransferMap.get(str);
    }

    public static boolean isBound() {
        return sIsBound;
    }

    public static boolean register(StreamTransfer streamTransfer, String str) {
        if (sCallingAgentNames.contains(str)) {
            SdkLog.d(TAG, "stream register : exist");
            return true;
        }
        sCallingAgentNames.add(str);
        sStreamTransferMap.put(str, streamTransfer);
        return true;
    }

    public static void unregister(String str) {
        String str2 = TAG;
        SdkLog.i(str2, "unregister: remove agent in map:" + str);
        sStreamTransferMap.remove(str);
        sCallingAgentNames.remove(str);
        if (sOnlyInstance == null) {
            SdkLog.e(str2, "FT already unbound for this package. Please check whether the calling agent was registered");
            return;
        }
        if (!sCallingAgentNames.isEmpty()) {
            SdkLog.e(str2, "Other applications are still using this FT binding");
            return;
        }
        StreamTransferManager streamTransferManager = sOnlyInstance;
        streamTransferManager.mContext.unbindService(streamTransferManager.mFTServiceConn);
        sOnlyInstance.mServiceConnectionProxy = null;
        sIsBound = false;
        UpdateHandler updateHandler = mUpdater;
        if (updateHandler != null) {
            updateHandler.getLooper().quit();
            mUpdater = null;
        }
        SdkLog.d(str2, "Stream transfer service disconnected");
    }

    public int cancelAllTransactions(String str, long j2) throws RemoteException {
        SdkLog.d(TAG, "[cancelAll] cancelAllTransactions, agentId:" + str + ",connectionId:" + j2);
        try {
            CancelAllRequest cancelAllRequest = new CancelAllRequest(str, j2);
            Bundle bundleSendCommand = null;
            try {
                STOperateEntity sTOperateEntity = new STOperateEntity(6, cancelAllRequest.toJSON());
                STServiceConnectionProxy sTServiceConnectionProxy = this.mServiceConnectionProxy;
                if (sTServiceConnectionProxy != null) {
                    bundleSendCommand = sTServiceConnectionProxy.getService().sendCommand(sTOperateEntity.toJson().toString(), null);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (bundleSendCommand != null) {
                return bundleSendCommand.getInt("receiveStatus");
            }
            SdkLog.i(TAG, "Stream Transfer Daemon could not queue request");
            return 1;
        } catch (RemoteException e3) {
            e3.printStackTrace();
            return 1;
        }
    }

    public void cancelStream(long j2, int i) {
        try {
            try {
                STOperateEntity sTOperateEntity = new STOperateEntity(3, new CancelStreamRequest(j2, i).toJSON());
                STServiceConnectionProxy sTServiceConnectionProxy = this.mServiceConnectionProxy;
                if (sTServiceConnectionProxy != null) {
                    sTServiceConnectionProxy.getService().sendCommand(sTOperateEntity.toJson().toString(), null);
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

    /* JADX WARN: Code duplicated, block: B:10:0x0051 A[Catch: RemoteException -> 0x008e, JSONException -> 0x0090, TryCatch #1 {JSONException -> 0x0090, blocks: (B:8:0x0039, B:10:0x0051, B:13:0x0065, B:15:0x0088), top: B:25:0x0039, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    /* JADX WARN: Code duplicated, block: B:13:0x0065 A[Catch: RemoteException -> 0x008e, JSONException -> 0x0090, TryCatch #1 {JSONException -> 0x0090, blocks: (B:8:0x0039, B:10:0x0051, B:13:0x0065, B:15:0x0088), top: B:25:0x0039, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0088 A[Catch: RemoteException -> 0x008e, JSONException -> 0x0090, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0090, blocks: (B:8:0x0039, B:10:0x0051, B:13:0x0065, B:15:0x0088), top: B:25:0x0039, outer: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0065, please report this as an issue */
    public ParcelFileDescriptor receiveStream(StreamTransfer.IStreamTransferCallback iStreamTransferCallback, long j2, int i, boolean z) {
        STOperateEntity sTOperateEntity;
        STServiceConnectionProxy sTServiceConnectionProxy;
        Bundle bundleSendCommand;
        String str = TAG;
        SdkLog.d(str, "receiveStream connectionId:" + j2 + " +transId:" + i + " isAccept:" + z);
        if (z) {
            try {
                if (!registerCallback(iStreamTransferCallback, i)) {
                    SdkLog.d(str, "Could not register stream event callback. Declining transfer.");
                    iStreamTransferCallback.onTransferCompleted(j2, i, 3);
                    return null;
                }
                try {
                    sTOperateEntity = new STOperateEntity(5, new StreamReceiveEntity(j2, i, z, 0).toJSON());
                    sTServiceConnectionProxy = this.mServiceConnectionProxy;
                    if (sTServiceConnectionProxy != null) {
                        bundleSendCommand = sTServiceConnectionProxy.getService().sendCommand(sTOperateEntity.toJson().toString(), null);
                    } else {
                        bundleSendCommand = null;
                    }
                    if (bundleSendCommand != null) {
                        SdkLog.i(str, "receiveStatus:" + bundleSendCommand.getInt("receiveStatus"));
                        return (ParcelFileDescriptor) bundleSendCommand.getParcelable(StreamTransfer.RECEIVE_PFD);
                    }
                    SdkLog.i(str, "Stream Transfer Daemon could not queue request");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } catch (RemoteException e3) {
                e3.printStackTrace();
            }
        } else {
            sTOperateEntity = new STOperateEntity(5, new StreamReceiveEntity(j2, i, z, 0).toJSON());
            sTServiceConnectionProxy = this.mServiceConnectionProxy;
            if (sTServiceConnectionProxy != null) {
                bundleSendCommand = sTServiceConnectionProxy.getService().sendCommand(sTOperateEntity.toJson().toString(), null);
            } else {
                bundleSendCommand = null;
            }
            if (bundleSendCommand != null) {
                SdkLog.i(str, "receiveStatus:" + bundleSendCommand.getInt("receiveStatus"));
                return (ParcelFileDescriptor) bundleSendCommand.getParcelable(StreamTransfer.RECEIVE_PFD);
            }
            SdkLog.i(str, "Stream Transfer Daemon could not queue request");
        }
        return null;
    }

    public boolean registerCallback(StreamTransfer.IStreamTransferCallback iStreamTransferCallback, int i) {
        if (iStreamTransferCallback == null) {
            return false;
        }
        try {
            STServiceConnectionProxy sTServiceConnectionProxy = this.mServiceConnectionProxy;
            if (sTServiceConnectionProxy != null) {
                return sTServiceConnectionProxy.getService().registerCallbackFacilitator(i, new StreamCallbackReceiver(mUpdater, iStreamTransferCallback));
            }
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public int sendStream(Context context, String str, StreamTransfer.IStreamTransferCallback iStreamTransferCallback, PeerAgent peerAgent, FileDescriptor fileDescriptor) {
        try {
            return sendStream(context, str, iStreamTransferCallback, peerAgent, ParcelFileDescriptor.dup(fileDescriptor));
        } catch (IOException e2) {
            SdkLog.w(TAG, "sendStream IOException" + e2);
            return -1;
        }
    }

    public int sendStream(Context context, String str, StreamTransfer.IStreamTransferCallback iStreamTransferCallback, PeerAgent peerAgent, InputStream inputStream) {
        ParcelFileDescriptor parcelFileDescriptorPipeFrom;
        if (inputStream != null) {
            try {
                parcelFileDescriptorPipeFrom = StreamUtils.pipeFrom(inputStream, peerAgent.getAccessory().getTransportType());
            } catch (IOException e2) {
                SdkLog.w(TAG, "sendStream IOException" + e2);
                return -1;
            }
        } else {
            parcelFileDescriptorPipeFrom = null;
        }
        return sendStream(context, str, iStreamTransferCallback, peerAgent, parcelFileDescriptorPipeFrom);
    }

    public static void register(String str, CallingAgentInfo callingAgentInfo) {
        sCallingAgentInfos.put(str, callingAgentInfo);
    }

    public int sendStream(Context context, String str, StreamTransfer.IStreamTransferCallback iStreamTransferCallback, PeerAgent peerAgent, ParcelFileDescriptor parcelFileDescriptor) {
        STOperateEntity sTOperateEntity;
        boolean z;
        int i;
        StreamSendEntity streamSendEntity = new StreamSendEntity(peerAgent.getAgentId(), getAgentId(context, str), peerAgent.getAccessoryId(), context.getPackageName(), str);
        Bundle bundleSendCommand = null;
        try {
            sTOperateEntity = new STOperateEntity(4, streamSendEntity.toJson());
        } catch (JSONException e2) {
            e2.printStackTrace();
            sTOperateEntity = null;
        }
        try {
            if (this.mServiceConnectionProxy != null && sTOperateEntity != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(BUNDLE_KEY_SOURCE, parcelFileDescriptor);
                bundleSendCommand = this.mServiceConnectionProxy.getService().sendCommand(sTOperateEntity.toJson().toString(), bundle);
            } else {
                SdkLog.e(TAG, "sendInputStream: invalid state or req is null");
            }
        } catch (RemoteException | JSONException e3) {
            e3.printStackTrace();
        }
        if (bundleSendCommand != null) {
            z = bundleSendCommand.getBoolean("STATUS");
            i = bundleSendCommand.getInt(alf.ID);
        } else {
            z = false;
            i = -1;
        }
        if (z && registerCallback(iStreamTransferCallback, i)) {
            SdkLog.d(TAG, "Stream Pushed and Callback registered");
        }
        return i;
    }
}
