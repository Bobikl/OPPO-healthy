package com.oplus.onet;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.widget.Toast;
import com.heytap.accessory.BaseAgent;
import com.heytap.accessory.BaseMessage;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.bean.AuthenticationToken;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.sports.service.BgConnect;
import com.oplus.aiunit.vision.d3d;
import com.oplus.aiunit.vision.zqm;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
class DataAgent extends BaseAgent {

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ int f139new = 0;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f20038j;
    public ServiceConnection k;

    public class ServiceConnection extends BaseSocket {
        public ServiceConnection() {
            super(ServiceConnection.class.getName());
        }

        @Override // com.heytap.accessory.BaseSocket
        public final void onError(int i, String str, int i2) {
        }

        @Override // com.heytap.accessory.BaseSocket
        public final void onReceive(long j2, int i, byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                int i2 = DataAgent.f139new;
                d3d.c("DataAgent", "onReceive(), data is null or empty!");
                return;
            }
            try {
                new String(bArr, "UTF-8");
                DataAgent dataAgent = DataAgent.this;
                int i3 = DataAgent.f139new;
                dataAgent.getClass();
            } catch (UnsupportedEncodingException e2) {
                int i4 = DataAgent.f139new;
                StringBuilder sbA = zqm.a("UnsupportedEncodingException exception e=");
                sbA.append(e2.getLocalizedMessage());
                d3d.c("DataAgent", sbA.toString());
            }
        }

        @Override // com.heytap.accessory.BaseSocket
        public final void onServiceConnectionLost(long j2, int i) {
            DataAgent dataAgent = DataAgent.this;
            int i2 = DataAgent.f139new;
            dataAgent.a("Disconnected");
            DataAgent dataAgent2 = DataAgent.this;
            ServiceConnection serviceConnection = dataAgent2.k;
            if (serviceConnection != null) {
                serviceConnection.close();
                dataAgent2.k = null;
            }
        }
    }

    public class a extends BaseMessage {
        public a(BaseAgent baseAgent) {
            super(baseAgent);
        }

        @Override // com.heytap.accessory.BaseMessage
        public final void onError(PeerAgent peerAgent, int i, int i2) {
            String str;
            switch (i2) {
                case 10101:
                    str = " FAILURE[ " + i2 + " ] : UNKNOWN ";
                    break;
                case 10102:
                    str = " FAILURE[ " + i2 + " ] : PEER_AGENT_UNREACHABLE ";
                    break;
                case 10103:
                    str = " FAILURE[ " + i2 + " ] : PEER_AGENT_NO_RESPONSE ";
                    break;
                case 10104:
                default:
                    str = null;
                    break;
                case 10105:
                    str = " FAILURE[ " + i2 + " ] : ERROR_PEER_AGENT_NOT_SUPPORTED ";
                    break;
                case 10106:
                    str = " FAILURE[ " + i2 + " ] : ERROR_PEER_SERVICE_NOT_SUPPORTED ";
                    break;
                case 10107:
                    str = " FAILURE[ " + i2 + " ] : ERROR_SERVICE_NOT_SUPPORTED ";
                    break;
            }
            String str2 = "" + i + ":" + str;
            int i3 = DataAgent.f139new;
            d3d.c("DataAgent", "onError(), id: " + i + ", ToAgent: " + peerAgent.getAgentId() + ", errorCode: " + i2 + ", desc: " + str);
            StringBuilder sb = new StringBuilder();
            sb.append("NAK Received: ");
            sb.append(str2);
            d3d.f("DataAgent", sb.toString());
        }

        @Override // com.heytap.accessory.BaseMessage
        public final void onReceive(PeerAgent peerAgent, byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                int i = DataAgent.f139new;
                d3d.c("DataAgent", "onReceive(), message is null or empty!");
                return;
            }
            try {
                int i2 = DataAgent.f139new;
                d3d.b("DataAgent", "onReceive(), FromAgent : " + peerAgent.getAgentId() + " Message : " + new String(bArr, "UTF-8"));
                new String(bArr, "UTF-8");
                DataAgent.this.getClass();
            } catch (UnsupportedEncodingException e2) {
                int i3 = DataAgent.f139new;
                StringBuilder sbA = zqm.a("onReceive(), UnsupportedEncodingException exception e=");
                sbA.append(e2.getLocalizedMessage());
                d3d.c("DataAgent", sbA.toString());
            }
        }

        @Override // com.heytap.accessory.BaseMessage
        public final void onSent(PeerAgent peerAgent, int i) {
            int i2 = DataAgent.f139new;
            d3d.b("DataAgent", "onSent(), id: " + i + ", ToAgent: " + peerAgent.getAgentId());
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            sb.append(" SUCCESS ");
            d3d.f("DataAgent", "ACK Received: " + sb.toString());
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ String i;

        public b(String str) {
            this.i = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toast.makeText(DataAgent.this.getApplicationContext(), this.i, 0).show();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ PeerAgent[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f20040j;

        public c(PeerAgent[] peerAgentArr, int i) {
            this.i = peerAgentArr;
            this.f20040j = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.i != null) {
                if (this.f20040j == 1) {
                    DataAgent dataAgent = DataAgent.this;
                    int i = DataAgent.f139new;
                    dataAgent.getClass();
                    d3d.f("DataAgent", "PEER_AGENT_AVAILABLE");
                    return;
                }
                DataAgent dataAgent2 = DataAgent.this;
                int i2 = DataAgent.f139new;
                dataAgent2.getClass();
                d3d.f("DataAgent", "PEER_AGENT_UNAVAILABLE");
            }
        }
    }

    public class d extends Binder {
        public d(DataAgent dataAgent) {
        }
    }

    public DataAgent() {
        super("DataAgent");
        this.i = new d(this);
        this.f20038j = new Handler(Looper.getMainLooper());
        this.k = null;
    }

    public final void a(String str) {
        this.f20038j.post(new b(str));
    }

    @Override // com.heytap.accessory.BaseAgent
    public final void onAuthenticationResponse(PeerAgent peerAgent, AuthenticationToken authenticationToken, int i) {
        super.onAuthenticationResponse(peerAgent, authenticationToken, i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.i;
    }

    @Override // com.heytap.accessory.BaseAgent, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((NotificationManager) getSystemService(BgConnect.KEY_NOTIFICATION)).createNotificationChannel(new NotificationChannel("sample_channel_01", "Accessory_SDK_Sample", 2));
        startForeground(1, new Notification.Builder(getBaseContext(), "sample_channel_01").setContentTitle("DataAgent").setContentText("").setChannelId("sample_channel_01").build());
        new a(this);
    }

    @Override // com.heytap.accessory.BaseAgent
    public final void onError(PeerAgent peerAgent, String str, int i) {
        super.onError(peerAgent, str, i);
    }

    @Override // com.heytap.accessory.BaseAgent
    public final void onFindPeerAgentsResponse(PeerAgent[] peerAgentArr, int i) {
        d3d.b("DataAgent", "onFindPeerAgentsResponse : " + i);
        if (i != 0 || peerAgentArr == null) {
            if (i == 10001) {
                d3d.c("DataAgent", "FIND_PEER_DEVICE_NOT_CONNECTED");
            } else if (i == 10002) {
                d3d.c("DataAgent", "FIND_PEER_SERVICE_NOT_FOUND");
            } else {
                d3d.c("DataAgent", "R.string.NoPeersFound");
            }
            a("PEERAGENT_NOT_FOUND");
            return;
        }
        a("PEERAGENT_FOUND");
        for (PeerAgent peerAgent : peerAgentArr) {
            StringBuilder sbA = zqm.a("PEERAGENT_FOUND:");
            sbA.append(peerAgentArr.length);
            sbA.append(",");
            sbA.append(peerAgent);
            d3d.f("DataAgent", sbA.toString());
        }
    }

    @Override // com.heytap.accessory.BaseAgent
    public final void onPeerAgentsUpdated(PeerAgent[] peerAgentArr, int i) {
        this.f20038j.post(new c(peerAgentArr, i));
    }

    @Override // com.heytap.accessory.BaseAgent
    public final void onServiceConnectionRequested(PeerAgent peerAgent) {
        super.onServiceConnectionRequested(peerAgent);
        if (peerAgent != null) {
            acceptServiceConnectionRequest(peerAgent);
        }
    }

    @Override // com.heytap.accessory.BaseAgent
    public final void onServiceConnectionResponse(PeerAgent peerAgent, BaseSocket baseSocket, int i) {
        super.onServiceConnectionResponse(peerAgent, baseSocket, i);
        if (i == 0) {
            this.k = (ServiceConnection) baseSocket;
            a("Connected");
        } else if (i == 10005) {
            a("Connected");
            Toast.makeText(getBaseContext(), "CONNECTION_ALREADY_EXIST", 1).show();
        } else if (i == 10009) {
            Toast.makeText(getBaseContext(), "CONNECTION_DUPLICATE_REQUEST", 1).show();
        } else {
            d3d.c("DataAgent", "R.string.ConnectionFailure");
        }
    }
}
