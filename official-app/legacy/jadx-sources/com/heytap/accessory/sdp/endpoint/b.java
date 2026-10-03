package com.heytap.accessory.sdp.endpoint;

import android.bluetooth.BluetoothAdapter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2631c = b.class.getSimpleName() + " - epitrack";
    public static d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static d f2632e;
    public d a;
    public int b;

    public b(int i) {
        this.b = i;
        f2632e = d;
        d dVarA = a(i);
        d = dVarA;
        this.a = a(dVarA);
    }

    public static boolean e() {
        d dVar = f2632e;
        if (dVar == null || d == null) {
            return true;
        }
        int iO = dVar.o();
        int iO2 = d.o();
        if (iO != iO2) {
            com.heytap.accessory.base.logging.a.a(f2631c, "Local config changed: serviceCount. , acc: " + iO + ", nowEpi: " + iO2);
            return true;
        }
        String strE = f2632e.e();
        String strE2 = d.e();
        if (!TextUtils.equals(strE, strE2)) {
            com.heytap.accessory.base.logging.a.a(f2631c, "Local config changed: deviceName. , acc: " + strE + ", nowEpi: " + strE2);
            return true;
        }
        long jA = f2632e.a();
        long jA2 = d.a();
        if (jA != jA2) {
            com.heytap.accessory.base.logging.a.a(f2631c, "Local config changed: apdu. , acc: " + jA + ", nowEpi: " + jA2);
            return true;
        }
        long jN = f2632e.n();
        long jN2 = d.n();
        if (jN != jN2) {
            com.heytap.accessory.base.logging.a.a(f2631c, "Local config changed: ssdu. , acc: " + jN + ", nowEpi: " + jN2);
            return true;
        }
        com.heytap.accessory.base.logging.a.a(f2631c, "Local config not changed:name:" + f2632e.e() + ", cachedServiceCount:" + iO + ", ssdu:" + jN + ", apdu:" + jA);
        return false;
    }

    public com.heytap.accessory.message.a a(int i, int i2) {
        String str = f2631c;
        com.heytap.accessory.base.logging.a.a(str, "epi composeMessage: MsgType: " + i + " Status: " + i2);
        int iB = b(i);
        if (i == 1 || i == 2) {
            return e.a(this.a, i, this.b == 1, iB);
        }
        if (i == 3) {
            return e.a(this.a, iB);
        }
        if (i == 4) {
            return e.a(this.a, i2, iB);
        }
        com.heytap.accessory.base.logging.a.b(str, "Unsupported Message Type Received !!");
        return null;
    }

    public boolean b(d dVar) {
        boolean z;
        d dVar2 = this.a;
        boolean z2 = true;
        if (dVar2 != null) {
            if (dVar2.b() != dVar.b()) {
                if (dVar.b() == 1) {
                    com.heytap.accessory.base.logging.a.a(f2631c, "Counter offering CL Mode");
                    z = false;
                } else {
                    z = true;
                }
                this.a.a((byte) 0);
            } else {
                z = true;
            }
            if (this.a.q() != dVar.q()) {
                byte bQ = (byte) (this.a.q() & dVar.q());
                this.a.f(bQ);
                if (bQ != dVar.q()) {
                    com.heytap.accessory.base.logging.a.a(f2631c, "Counter offering TL Mode");
                    z = false;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (this.a.a() >= dVar.a()) {
                this.a.a(dVar.a());
            } else {
                com.heytap.accessory.base.logging.a.a(f2631c, "Counter offering APDU Size");
                arrayList.add(1);
            }
            if (this.a.n() >= dVar.n()) {
                this.a.f(dVar.n());
            } else {
                com.heytap.accessory.base.logging.a.a(f2631c, "Counter offering SSDU Size");
                arrayList.add(2);
            }
            if (this.a.g() >= dVar.g()) {
                this.a.c(dVar.g());
            } else {
                com.heytap.accessory.base.logging.a.a(f2631c, "Counter offering Max Sessions");
                arrayList.add(3);
            }
            if (this.a.m() >= dVar.m()) {
                this.a.e(dVar.m());
            } else {
                com.heytap.accessory.base.logging.a.a(f2631c, "Counter offering SL Timeout");
                arrayList.add(4);
            }
            if (this.a.r() >= dVar.r()) {
                this.a.h(dVar.r());
            } else {
                com.heytap.accessory.base.logging.a.a(f2631c, "Counter offering TL Window Size");
                arrayList.add(5);
            }
            if (this.a.c() != dVar.c()) {
                if (dVar.c() != 1) {
                    this.a.b(dVar.c());
                    com.heytap.accessory.base.logging.a.a(f2631c, "Compression bit set to peer compression bit " + dVar.c());
                } else {
                    com.heytap.accessory.base.logging.a.a(f2631c, "Counter offering Compression Bit");
                    arrayList.add(11);
                }
            }
            if (this.a.h() != dVar.h() && dVar.h() != 1) {
                this.a.d(dVar.h());
                com.heytap.accessory.base.logging.a.a(f2631c, "DY connection bit set to peer type " + ((int) dVar.h()));
            }
            for (int i : com.heytap.accessory.misc.config.a.f2604c) {
                arrayList.add(Integer.valueOf(i));
            }
            com.heytap.accessory.base.logging.a.d(f2631c, "checkParamsForCompatibility: APDU " + Integer.toHexString(this.a.a()) + " SSDU " + Integer.toHexString(this.a.n()));
            int[] iArr = com.heytap.accessory.misc.config.a.b;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(Integer.valueOf(iArr[i2]));
            }
            if (this.b != 1) {
                arrayList.remove((Object) 14);
            }
            Collections.sort(arrayList);
            if (arrayList.isEmpty()) {
                arrayList = null;
                z2 = z;
            } else {
                z2 = false;
            }
            this.a.a(arrayList);
        }
        return z2;
    }

    public final int c(int i) {
        if (i == 1 || i == 2) {
            return 41;
        }
        if (i != 3) {
            return i != 4 ? 3 : 4;
        }
        return 39;
    }

    public void d(int i) {
        if (this.a.l() > i) {
            com.heytap.accessory.base.logging.a.e(f2631c, "update p version " + this.a.l() + " to " + i);
            this.a.d(i);
        }
    }

    public void c(d dVar) {
        this.a.c(dVar.j());
        this.a.a(dVar.e());
        this.a.b(dVar.d());
        this.a.e(dVar.s());
        this.a.d(dVar.k());
        this.a.g(dVar.o());
        if (this.b == 1) {
            this.a.b(dVar.f());
        }
        com.heytap.accessory.base.logging.a.a(f2631c, "PeerID = " + dVar.j());
    }

    @NonNull
    public static d d() {
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    f2632e = null;
                    d = a(2);
                }
            }
        }
        return d;
    }

    public d a(Buffer buffer, int i) {
        String str = f2631c;
        com.heytap.accessory.base.logging.a.a(str, "parseMessage: MessageType " + i);
        int iC = c(i);
        com.heytap.accessory.base.logging.a.a(str, "parseMessage: MinLength " + iC + " MessageLength " + buffer.getLength());
        if (i == 1 || i == 2) {
            return e.a(buffer, this.b == 1, iC);
        }
        if (i == 3) {
            return e.b(buffer, iC);
        }
        if (i != 4) {
            com.heytap.accessory.base.logging.a.b(str, "Unsupported Message Type Received !!");
            return null;
        }
        return e.a(buffer, iC);
    }

    public d c() {
        return this.a;
    }

    public static String a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        String name = defaultAdapter != null ? defaultAdapter.getName() : null;
        return name == null ? "OPLUS" : name;
    }

    public static d a(int i) {
        d dVarA;
        try {
            dVarA = new a(i).a(g.a(PlatformUtils.getContext()));
            try {
                com.heytap.accessory.base.logging.a.a(f2631c, "[epiparamtrack]parseEpiXML result:" + dVarA);
            } catch (Throwable unused) {
                com.heytap.accessory.base.logging.a.e(f2631c, "reading epi xml failed, use the default init.");
            }
        } catch (Throwable unused2) {
            dVarA = null;
        }
        return dVarA == null ? new d(i) : dVarA;
    }

    public final d a(d dVar) {
        d dVar2 = new d();
        dVar2.d(dVar.l());
        dVar2.c(dVar.j());
        dVar2.a(dVar.b());
        dVar2.f(dVar.q());
        dVar2.a(dVar.a());
        dVar2.f(dVar.n());
        dVar2.c(dVar.g());
        dVar2.e(dVar.m());
        dVar2.h(dVar.r());
        dVar2.d(dVar.k());
        dVar2.e(dVar.s());
        dVar2.a(dVar.e());
        dVar2.b(dVar.c());
        dVar2.b(dVar.d());
        dVar2.g(dVar.o());
        dVar2.d(dVar.h());
        dVar2.b(dVar.f());
        dVar2.a(new ArrayList(dVar.i()));
        return dVar2;
    }

    public final int b(int i) {
        if (i == 1 || i == 2) {
            return b() + 41;
        }
        if (i != 3) {
            return i != 4 ? 3 : 4;
        }
        return 39;
    }

    public final int b() {
        int length;
        List<Integer> listI = this.a.i();
        int i = 0;
        if (listI != null && !listI.isEmpty()) {
            Iterator<Integer> it = listI.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                int iIntValue = it.next().intValue();
                if (iIntValue != 14) {
                    switch (iIntValue) {
                        case 1:
                            i = i2 + 4;
                            continue;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            i = i2 + 2;
                            continue;
                        case 6:
                            length = this.a.k().length();
                            break;
                        case 7:
                            length = this.a.s().length();
                            break;
                        case 8:
                            length = this.a.e().length();
                            break;
                        default:
                            i = i2 + 1;
                            continue;
                    }
                    i = i2 + length + 1;
                } else {
                    i = i2 + 6;
                }
            }
            com.heytap.accessory.base.logging.a.a(f2631c, "getLengthForFeatureParams:  " + i);
        }
        return i;
    }
}
