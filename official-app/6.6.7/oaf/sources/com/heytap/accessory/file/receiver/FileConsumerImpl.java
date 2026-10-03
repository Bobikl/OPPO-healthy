package com.heytap.accessory.file.receiver;

import android.content.Context;
import android.os.Bundle;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.NativeAgent;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.file.d;
import com.heytap.accessory.file.model.CancelRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FileConsumerImpl extends NativeAgent implements b {
    public static final String c = "FileConsumerImpl";
    public Map<String, c> a;
    public ConcurrentHashMap<String, String> b;

    public FileConsumerImpl(Context context) {
        super("FileConsumerImpl", context, FTConsumerConnection.class);
        this.a = new HashMap();
        a();
        com.heytap.accessory.base.logging.a.a(c, "Created file transfer helper instance");
    }

    public void a() {
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
            com.heytap.accessory.base.logging.a.c(c, "onServiceConnectionResponse connHelper is null");
            return;
        }
        com.heytap.accessory.base.logging.a.c(c, "onServiceConnectionResponse connectionId=" + baseSocket.getConnectionId());
        a(baseSocket, i);
    }

    @Override // com.heytap.accessory.file.receiver.b
    public void a(CancelRequest cancelRequest) {
        String strValueOf = String.valueOf(cancelRequest.a());
        if (this.a.containsKey(strValueOf)) {
            this.a.get(strValueOf).a(cancelRequest);
        } else {
            com.heytap.accessory.base.logging.a.b(c, "invalid transactionId !!!!");
        }
    }

    @Override // com.heytap.accessory.file.receiver.b
    public void a(long j, d dVar) {
        String str = c;
        com.heytap.accessory.base.logging.a.a(str, "registerFileEventCallback connId=" + j);
        String strValueOf = String.valueOf(j);
        if (this.a.get(strValueOf) != null) {
            this.a.get(strValueOf).a(dVar);
        } else {
            com.heytap.accessory.base.logging.a.b(str, "registerFileEventCallback invalid connectionId !!!!");
        }
    }

    @Override // com.heytap.accessory.file.receiver.b
    public void a(long j, int i, int i2, String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("REFF_PATH", str);
        bundle.putString("FILE_PATH", str2);
        String str3 = c;
        com.heytap.accessory.base.logging.a.a(str3, "confirmRequest connectionId=" + j);
        String strValueOf = String.valueOf(j);
        if (this.a.containsKey(strValueOf)) {
            this.a.get(strValueOf).a(i, i2, str, str2, z);
        } else {
            com.heytap.accessory.base.logging.a.b(str3, "invalid connectionId !!!!");
        }
    }

    public void a(BaseSocket baseSocket, int i) {
        if (!this.a.containsKey(baseSocket.getConnectionId())) {
            this.a.put(baseSocket.getConnectionId(), new c(this, baseSocket, i));
            c cVar = this.a.get(baseSocket.getConnectionId());
            if (cVar != null) {
                cVar.a(a(baseSocket));
                return;
            }
            return;
        }
        c cVar2 = this.a.get(baseSocket.getConnectionId());
        if (cVar2 != null) {
            cVar2.a(baseSocket);
            cVar2.a(a(baseSocket));
        }
    }

    public final List<Integer> a(BaseSocket baseSocket) {
        ArrayList arrayList = new ArrayList();
        int serviceChannelSize = baseSocket.getServiceChannelSize();
        for (int i = 0; i < serviceChannelSize; i++) {
            int serviceChannelId = baseSocket.getServiceChannelId(i);
            if (serviceChannelId != 100) {
                arrayList.add(Integer.valueOf(serviceChannelId));
            }
        }
        return arrayList;
    }
}
