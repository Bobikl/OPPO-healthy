package com.heytap.accessory.security;

import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.utils.buffer.Buffer;
import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public class i {
    public static final i a;
    public static final i b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f2671c;
    public static final i d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f2672e;
    public static final String f;
    public static final /* synthetic */ i[] g;

    public final enum a extends i {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.heytap.accessory.security.i
        public void a(j jVar, com.heytap.accessory.message.b bVar) {
            com.heytap.accessory.base.logging.a.d(i.f, "Sent commitment");
            i.b.a(jVar);
        }

        @Override // com.heytap.accessory.security.i
        public void b(j jVar) {
            jVar.h().b(jVar.b.d());
            int iA = jVar.a(16, (Buffer) null);
            if (iA == 2) {
                i.d.a(jVar);
            } else if (iA == 1) {
                i.f2672e.a(jVar);
            }
        }
    }

    static {
        a aVar = new a("IDLE", 0);
        a = aVar;
        i iVar = new i(LanConstants.STATE_WAITING, 1) { // from class: com.heytap.accessory.security.i.b
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.security.i
            public void a(j jVar, Buffer buffer) {
                String str = i.f;
                com.heytap.accessory.base.logging.a.d(str, "Changing Client State from CLIENT_IDLE to CLIENT_WAITING ");
                if (buffer == null) {
                    com.heytap.accessory.base.logging.a.b(str, "Received Client Challenge from server is null");
                    i.f2672e.a(jVar);
                    return;
                }
                int iA = jVar.a(18, buffer);
                com.heytap.accessory.base.logging.a.c(str, "auth state:WAITING, checkAndSendAuthPacket result:" + iA);
                if (iA == 1) {
                    i.f2672e.a(jVar);
                } else if (iA == 2) {
                    i.d.a(jVar);
                } else if (iA == 3) {
                    jVar.f2674e = ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_KSC_ERROR;
                    i.f2672e.a(jVar);
                } else if (iA == 4) {
                    jVar.f2674e = ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_REMOTE_CREDENTIALS_FAILED;
                    i.f2672e.a(jVar);
                } else if (iA == 5) {
                    jVar.f2674e = ConnectConstant.ERROR_CHANNEL_AUTH_RESPONSE_INVALID;
                    i.f2672e.a(jVar);
                }
                buffer.recycle();
            }

            @Override // com.heytap.accessory.security.i
            public void a(j jVar, com.heytap.accessory.message.b bVar) {
                com.heytap.accessory.base.logging.a.d(i.f, "Changing Client State from CLIENT_WAITING to CLIENT_ACCEPTED");
                i.f2671c.a(jVar);
            }
        };
        b = iVar;
        i iVar2 = new i("CONFIRMED", 2) { // from class: com.heytap.accessory.security.i.c
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.security.i
            public void b(j jVar) {
                jVar.f();
            }
        };
        f2671c = iVar2;
        i iVar3 = new i("KSC_ERROR", 3) { // from class: com.heytap.accessory.security.i.d
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.security.i
            public void b(j jVar) {
                jVar.f2674e = ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_KSC_ERROR;
                jVar.i();
            }
        };
        d = iVar3;
        i iVar4 = new i(WeightData_A3.IMPEDANCE_STATUS_ERROR, 4) { // from class: com.heytap.accessory.security.i.e
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.security.i
            public void b(j jVar) {
                jVar.e();
            }
        };
        f2672e = iVar4;
        g = new i[]{aVar, iVar, iVar2, iVar3, iVar4};
        f = i.class.getSimpleName();
    }

    public i(String str, int i) {
        super(str, i);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) g.clone();
    }

    public void a(j jVar, Buffer buffer) {
        com.heytap.accessory.base.logging.a.e(f, "unexpected onMessageReceived for mAccessory " + jVar.b.d().l() + ", ignoring");
    }

    public void b(j jVar) {
    }

    public /* synthetic */ i(String str, int i, a aVar) {
        this(str, i);
    }

    public void a(j jVar, com.heytap.accessory.message.b bVar) {
        com.heytap.accessory.base.logging.a.e(f, "unexpected onMessageDispatched for mAccessory " + jVar.b.d().l() + ", ignoring");
    }

    public void a(j jVar, int i, int i2) {
        if (jVar.b == null) {
            com.heytap.accessory.base.logging.a.a(f, "Security Store not initialized yet. Mark for cleanup and return.");
            jVar.a = true;
        } else {
            if (i2 != 0) {
                jVar.f2674e = ConnectConstant.ERROR_CHANNEL_AUTH_DISCONNECTED_UNEXPECTED;
            }
            f2672e.a(jVar);
        }
    }

    public void a(j jVar) {
        jVar.a(this);
        com.heytap.accessory.base.logging.a.a(f, "Entering mState : " + jVar.g());
        b(jVar);
    }
}
