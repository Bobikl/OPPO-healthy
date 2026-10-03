package com.heytap.accessory.stream;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import com.heytap.accessory.authcode.AuthenticationManager;
import com.heytap.accessory.core.IStreamManager;
import com.heytap.accessory.stream.model.CancelAllRequest;
import com.heytap.accessory.stream.model.CancelStreamRequest;
import com.heytap.accessory.stream.model.STOperateEntity;
import com.heytap.accessory.stream.model.StreamReceiveEntity;
import com.heytap.accessory.stream.model.StreamSendEntity;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public class StreamServiceStub extends IStreamManager.Stub {
    public static final String b = "StreamServiceStub";
    public Context a;

    public StreamServiceStub(Context context) {
        this.a = context;
    }

    @Override // com.heytap.accessory.core.IStreamManager
    public boolean registerCallbackFacilitator(int i, ResultReceiver resultReceiver) throws RemoteException {
        return d.a(this.a).a(i, resultReceiver);
    }

    @Override // com.heytap.accessory.core.IStreamManager
    public Bundle sendCommand(String str, Bundle bundle) throws RemoteException {
        String str2 = b;
        Log.d(str2, "receive sendCommand:" + str);
        AuthenticationManager.check(this.a, Binder.getCallingUid(), Binder.getCallingPid(), true);
        Bundle bundle2 = new Bundle();
        STOperateEntity sTOperateEntity = new STOperateEntity();
        try {
            sTOperateEntity.fromJSON(str);
            String string = sTOperateEntity.getParams().toString();
            int opCode = sTOperateEntity.getOpCode();
            if (opCode == 3) {
                com.heytap.accessory.base.logging.a.c(str2, "sendCommand STREAM_TRANSFER_STOP at time:" + System.currentTimeMillis());
                CancelStreamRequest cancelStreamRequest = new CancelStreamRequest();
                try {
                    cancelStreamRequest.fromJSON(string);
                    int transactionId = cancelStreamRequest.getTransactionId();
                    long connectionId = cancelStreamRequest.getConnectionId();
                    if (d.a(this.a) == null) {
                        return bundle2;
                    }
                    d.a(this.a).a(connectionId, transactionId);
                    return bundle2;
                } catch (JSONException unused) {
                    com.heytap.accessory.base.logging.a.d(b, "json marshaling failed");
                    return bundle2;
                }
            }
            if (opCode == 4) {
                com.heytap.accessory.base.logging.a.a(str2, "sendCommand STREAM_TRANSFER_START_URI");
                StreamSendEntity streamSendEntity = new StreamSendEntity();
                try {
                    streamSendEntity.fromJSON(string);
                    String peerID = streamSendEntity.getPeerID();
                    String containerID = streamSendEntity.getContainerID();
                    long accessoryID = streamSendEntity.getAccessoryID();
                    String packageName = streamSendEntity.getPackageName();
                    String agentClassName = streamSendEntity.getAgentClassName();
                    d dVarA = d.a(this.a);
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable(StreamTransferManager.BUNDLE_KEY_SOURCE);
                    if (parcelFileDescriptor == null) {
                        com.heytap.accessory.base.logging.a.b("StreamTransferManager.BUNDLE_KEY_SOURCE get null");
                    }
                    bundle2 = dVarA.a(new com.heytap.accessory.stream.model.b(peerID, containerID, accessoryID), packageName, agentClassName, parcelFileDescriptor);
                    return bundle2;
                } catch (JSONException unused2) {
                    com.heytap.accessory.base.logging.a.d(b, "json marshaling failed");
                    return bundle2;
                }
            }
            int iA = -1;
            if (opCode != 5) {
                if (opCode != 6) {
                    com.heytap.accessory.base.logging.a.d(str2, "Wrong commandId");
                    return bundle2;
                }
                CancelAllRequest cancelAllRequest = new CancelAllRequest();
                try {
                    cancelAllRequest.fromJSON(string);
                    String agentId = cancelAllRequest.getAgentId();
                    long connectionId2 = cancelAllRequest.getConnectionId();
                    if (d.a(this.a) != null) {
                        iA = connectionId2 > 0 ? d.a(this.a).a(connectionId2) : d.a(this.a).a(agentId);
                    }
                    bundle2.putInt("receiveStatus", iA);
                    return bundle2;
                } catch (JSONException unused3) {
                    com.heytap.accessory.base.logging.a.d(b, "json marshaling failed");
                    return bundle2;
                }
            }
            StreamReceiveEntity streamReceiveEntity = new StreamReceiveEntity();
            try {
                try {
                    com.heytap.accessory.base.logging.a.a(str2, "Stream_TRANSFER_ACCEPT_URI data=" + string);
                    streamReceiveEntity.fromJSON(string);
                    long connectionId3 = streamReceiveEntity.getConnectionId();
                    int transId = streamReceiveEntity.getTransId();
                    boolean zIsAccept = streamReceiveEntity.isAccept();
                    Bundle bundle3 = new Bundle();
                    if (d.a(this.a) != null) {
                        bundle3 = d.a(this.a).a(connectionId3, transId, zIsAccept);
                    }
                    if (bundle3 == null) {
                        bundle2.putInt("receiveStatus", -1);
                        return bundle2;
                    }
                    bundle2.putParcelable(StreamTransfer.RECEIVE_PFD, bundle3.getParcelable(StreamTransferManager.BUNDLE_KEY_SOURCE));
                    bundle2.putInt("receiveStatus", 0);
                    return bundle2;
                } catch (Exception unused4) {
                    com.heytap.accessory.base.logging.a.e(b, "STREAM_TRANSFER_ACCEPT_URI Exception");
                    return bundle2;
                }
            } catch (JSONException unused5) {
                com.heytap.accessory.base.logging.a.e(b, "json marshaling failed");
                return bundle2;
            }
        } catch (JSONException unused6) {
            com.heytap.accessory.base.logging.a.d(b, "Marshalling received json failed");
            return bundle2;
        }
        com.heytap.accessory.base.logging.a.d(b, "Marshalling received json failed");
        return bundle2;
    }
}
