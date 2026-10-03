package com.heytap.accessory.security;

import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.utils.buffer.Buffer;
import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public class l {
    public static final l a;
    public static final l b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f2677c;
    public static final l d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f2678e;
    public static String f;
    public static final /* synthetic */ l[] g;

    static {
        a aVar = new a("IDLE", 0);
        a = aVar;
        l lVar = new l(LanConstants.STATE_WAITING, 1) { // from class: com.heytap.accessory.security.l.b
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.security.l
            public void a(m mVar, Buffer buffer) {
                if (buffer == null) {
                    com.heytap.accessory.base.logging.a.b(l.f, "receive auth msg from client is null.");
                    l.f2678e.a(mVar);
                    return;
                }
                int iB = mVar.b(buffer);
                if (iB == 0) {
                    com.heytap.accessory.base.logging.a.d(l.f, "Changing Server State from STATUS_WAITING to SERVER_CONFIRMED");
                    l.f2677c.a(mVar);
                } else if (iB == 2) {
                    l.d.a(mVar);
                } else if (iB == 3) {
                    mVar.f2680e = ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_KSC_ERROR;
                    l.f2678e.a(mVar);
                } else {
                    l.f2678e.a(mVar);
                    mVar.d.a(null);
                }
                buffer.recycle();
            }

            @Override // com.heytap.accessory.security.l
            public void a(m mVar, com.heytap.accessory.message.b bVar) {
                l.f2677c.a(mVar);
            }
        };
        b = lVar;
        l lVar2 = new l("CONFIRMED", 2) { // from class: com.heytap.accessory.security.l.c
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.security.l
            public void b(m mVar) {
                mVar.f();
            }
        };
        f2677c = lVar2;
        l lVar3 = new l("KSC_ERROR", 3) { // from class: com.heytap.accessory.security.l.d
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.security.l
            public void b(m mVar) {
                mVar.f2680e = ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_KSC_ERROR;
                mVar.i();
            }
        };
        d = lVar3;
        l lVar4 = new l(WeightData_A3.IMPEDANCE_STATUS_ERROR, 4) { // from class: com.heytap.accessory.security.l.e
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.security.l
            public void b(m mVar) {
                mVar.e();
            }
        };
        f2678e = lVar4;
        g = new l[]{aVar, lVar, lVar2, lVar3, lVar4};
        f = l.class.getSimpleName();
    }

    public l(String str, int i) {
        super(str, i);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) g.clone();
    }

    public void a(m mVar, Buffer buffer) {
        com.heytap.accessory.base.logging.a.e(f, "unexpected onMessageReceived for mAccessory " + mVar.d.d().l() + ", ignoring");
    }

    public void b(m mVar) {
    }

    public /* synthetic */ l(String str, int i, a aVar) {
        this(str, i);
    }

    public void a(m mVar, com.heytap.accessory.message.b bVar) {
        com.heytap.accessory.base.logging.a.e(f, "unexpected onMessageDispatched for mAccessory " + mVar.d.d().l() + ", ignoring");
    }

    public void a(m mVar, int i, int i2) {
        if (mVar.d == null) {
            com.heytap.accessory.base.logging.a.a(f, "Security Store not initialized yet. Mark for cleanup and return.");
            mVar.a = true;
        } else {
            f2678e.a(mVar);
        }
    }

    public void a(m mVar) {
        mVar.a(this);
        if (mVar.g() != null) {
            com.heytap.accessory.base.logging.a.a(f, "Entering mState : " + mVar.g());
        }
        b(mVar);
    }

    public final enum a extends l {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.heytap.accessory.security.l
        public void a(m mVar, Buffer buffer) {
            if (buffer == null) {
                com.heytap.accessory.base.logging.a.b(l.f, "receive auth msg from client is null.");
                l.f2678e.a(mVar);
                return;
            }
            int iA = mVar.a(17, buffer);
            if (iA == 2) {
                l.d.a(mVar);
            } else if (iA == 3) {
                mVar.f2680e = ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_KSC_ERROR;
                l.f2678e.a(mVar);
            } else if (iA == 1) {
                l.f2678e.a(mVar);
            }
            buffer.recycle();
        }

        @Override // com.heytap.accessory.security.l
        public void b(m mVar) {
            mVar.h().b(mVar.d.d());
        }

        @Override // com.heytap.accessory.security.l
        public void a(m mVar, com.heytap.accessory.message.b bVar) {
            com.heytap.accessory.base.logging.a.d(l.f, "Changing Server State from STATUS_IDLE to SERVER_WAITING");
            l.b.a(mVar);
        }
    }
}
