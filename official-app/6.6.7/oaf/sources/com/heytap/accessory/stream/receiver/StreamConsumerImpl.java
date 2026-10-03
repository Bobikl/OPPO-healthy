package com.heytap.accessory.stream.receiver;

import android.content.Context;
import android.os.Bundle;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.NativeAgent;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.stream.StreamTransferManager;
import com.heytap.accessory.stream.model.CancelRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class StreamConsumerImpl extends NativeAgent implements b {
    public static final String d = "StreamConsumerImpl";
    public Map<String, a> a;
    public ConcurrentHashMap<String, String> b;
    public long c;

    public StreamConsumerImpl(Context context) {
        super("StreamConsumerImpl", context, StreamConsumerConnection.class);
        this.a = new HashMap();
        a();
        com.heytap.accessory.base.logging.a.a(d, "Created stream transfer helper instance");
    }

    public final void a() {
        if (com.heytap.accessory.file.utils.a.a() == null) {
            com.heytap.accessory.file.utils.a.a(getApplicationContext());
        }
        this.b = new ConcurrentHashMap<>();
    }

    @Override // com.heytap.accessory.NativeAgent
    public String getAgentPackagename(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        String agentPackagename = super.getAgentPackagename(str);
        if (agentPackagename != null) {
            this.b.put(str, agentPackagename);
        }
        return agentPackagename;
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onFindPeerAgentsResponse(PeerAgent[] peerAgentArr, int i) {
    }

    @Override // com.heytap.accessory.BaseJobAgent
    public void onServiceConnectionResponse(PeerAgent peerAgent, BaseSocket baseSocket, int i) {
        if (baseSocket == null) {
            com.heytap.accessory.base.logging.a.b(d, "onServiceConnectionResponse , socket is null, " + i);
            return;
        }
        com.heytap.accessory.base.logging.a.c(d, "onServiceConnectionResponse connectionId==" + baseSocket.getConnectionId());
        a(baseSocket, i);
    }

    @Override // com.heytap.accessory.stream.receiver.b
    public void a(CancelRequest cancelRequest) {
        String strValueOf = String.valueOf(cancelRequest.a());
        if (this.a.containsKey(strValueOf)) {
            this.a.get(strValueOf).a(cancelRequest);
        } else {
            com.heytap.accessory.base.logging.a.b(d, "invalid transactionId !!!!");
        }
    }

    @Override // com.heytap.accessory.stream.receiver.b
    public void a(long j, com.heytap.accessory.stream.c cVar) {
        String str = d;
        com.heytap.accessory.base.logging.a.a(str, "registerStreamEventCallback connId=" + this.c);
        String strValueOf = String.valueOf(this.c);
        if (this.a.containsKey(strValueOf)) {
            this.a.get(strValueOf).a(cVar);
        } else {
            com.heytap.accessory.base.logging.a.b(str, "registerStreamEventCallback invalid connectionId !!!!");
        }
    }

    @Override // com.heytap.accessory.stream.receiver.b
    public Bundle a(long j, int i, int i2, boolean z) {
        Bundle bundle = new Bundle();
        String str = d;
        com.heytap.accessory.base.logging.a.a(str, "confirmRequest connectionId=" + j);
        a aVar = this.a.get(String.valueOf(j));
        if (aVar != null) {
            bundle.putParcelable(StreamTransferManager.BUNDLE_KEY_SOURCE, aVar.a(i, i2, z));
        } else {
            com.heytap.accessory.base.logging.a.a(str, new Exception("invalid connectionId !!!!"));
        }
        return bundle;
    }

    public final void a(BaseSocket baseSocket, int i) {
        this.c = Long.parseLong(baseSocket.getConnectionId());
        if (!this.a.containsKey(baseSocket.getConnectionId())) {
            this.a.put(baseSocket.getConnectionId(), new a(this, baseSocket, i));
            this.a.get(baseSocket.getConnectionId()).a(a(baseSocket));
        } else {
            this.a.get(baseSocket.getConnectionId()).a(baseSocket);
        }
    }

    public final List<Integer> a(BaseSocket baseSocket) {
        ArrayList arrayList = new ArrayList();
        int serviceChannelSize = baseSocket.getServiceChannelSize();
        for (int i = 0; i < serviceChannelSize; i++) {
            int serviceChannelId = baseSocket.getServiceChannelId(i);
            if (serviceChannelId != 200) {
                arrayList.add(Integer.valueOf(serviceChannelId));
            }
        }
        return arrayList;
    }
}
