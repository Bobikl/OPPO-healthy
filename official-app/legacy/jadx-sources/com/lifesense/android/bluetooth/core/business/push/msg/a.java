package com.lifesense.android.bluetooth.core.business.push.msg;

import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public String a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PacketProfile f8609c;
    public List<String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f8610e;
    public b f;

    public b a() {
        return this.f;
    }

    public c b() {
        return this.f8610e;
    }

    public byte[] c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public PacketProfile e() {
        return this.f8609c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.a(this)) {
            return false;
        }
        String strD = d();
        String strD2 = aVar.d();
        if (strD != null ? !strD.equals(strD2) : strD2 != null) {
            return false;
        }
        if (!Arrays.equals(c(), aVar.c())) {
            return false;
        }
        PacketProfile packetProfileE = e();
        PacketProfile packetProfileE2 = aVar.e();
        if (packetProfileE != null ? !packetProfileE.equals(packetProfileE2) : packetProfileE2 != null) {
            return false;
        }
        List<String> listF = f();
        List<String> listF2 = aVar.f();
        if (listF != null ? !listF.equals(listF2) : listF2 != null) {
            return false;
        }
        c cVarB = b();
        c cVarB2 = aVar.b();
        if (cVarB != null ? !cVarB.equals(cVarB2) : cVarB2 != null) {
            return false;
        }
        b bVarA = a();
        b bVarA2 = aVar.a();
        return bVarA != null ? bVarA.equals(bVarA2) : bVarA2 == null;
    }

    public List<String> f() {
        return this.d;
    }

    public int hashCode() {
        String strD = d();
        int iHashCode = (((strD == null ? 43 : strD.hashCode()) + 59) * 59) + Arrays.hashCode(c());
        PacketProfile packetProfileE = e();
        int iHashCode2 = (iHashCode * 59) + (packetProfileE == null ? 43 : packetProfileE.hashCode());
        List<String> listF = f();
        int iHashCode3 = (iHashCode2 * 59) + (listF == null ? 43 : listF.hashCode());
        c cVarB = b();
        int i = iHashCode3 * 59;
        int iHashCode4 = cVarB == null ? 43 : cVarB.hashCode();
        b bVarA = a();
        return ((i + iHashCode4) * 59) + (bVarA != null ? bVarA.hashCode() : 43);
    }

    public String toString() {
        return "BasePushMessage(pushMacAddress=" + d() + ", pushData=" + Arrays.toString(c()) + ", pushType=" + e() + ", pushValues=" + f() + ", phoneStateMessage=" + b() + ", phoneMsg=" + a() + ")";
    }

    public void a(PacketProfile packetProfile) {
        this.f8609c = packetProfile;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(byte[] bArr) {
        this.b = bArr;
    }

    public boolean a(Object obj) {
        return obj instanceof a;
    }
}
