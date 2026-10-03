package com.omron;

import com.oplus.mydevices.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class bw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final bw f8855c = new bw();
    private final Map<Integer, List<bz>> a;
    private final Map<Integer, List<bu>> b = new HashMap();

    public class b implements bz {
        private b() {
        }

        @Override // com.omron.bz
        public by a(int i, int i2, byte[] bArr) {
            if (bArr.length < 2) {
                return null;
            }
            int i3 = ((bArr[1] & 255) << 8) | (bArr[0] & 255);
            List list = (List) bw.this.b.get(Integer.valueOf(i3));
            if (list == null) {
                return new bs(i, i2, bArr, i3);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bs bsVarA = ((bu) it.next()).a(i, i2, bArr, i3);
                if (bsVarA != null) {
                    return bsVarA;
                }
            }
            return new bs(i, i2, bArr, i3);
        }
    }

    private bw() {
        a(76, new cm());
        a(Constants.LINKAGE_MANUAL_SET_ACTIVE, new cn());
        a(410, new co());
        bt btVar = new bt();
        cl clVar = new cl();
        cr crVar = new cr();
        this.a = new HashMap();
        a(1, new ch());
        a(2, btVar);
        a(3, btVar);
        a(4, btVar);
        a(5, btVar);
        a(6, btVar);
        a(7, btVar);
        a(8, clVar);
        a(9, clVar);
        a(10, new ct());
        a(20, btVar);
        a(21, btVar);
        a(22, crVar);
        a(22, new cb());
        a(31, btVar);
        a(32, crVar);
        a(33, crVar);
        a(255, new b());
    }

    public static bw a() {
        return f8855c;
    }

    private by a(int i, int i2, byte[] bArr) {
        List<bz> list = this.a.get(Integer.valueOf(i2));
        if (list == null) {
            return new by(i, i2, bArr);
        }
        Iterator<bz> it = list.iterator();
        while (it.hasNext()) {
            by byVarA = it.next().a(i, i2, bArr);
            if (byVarA != null) {
                return byVarA;
            }
        }
        return new by(i, i2, bArr);
    }

    public List<by> a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return a(bArr, 0, bArr.length);
    }

    public List<by> a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (i >= 0 && i2 >= 0 && bArr.length > i) {
            int iMin = Math.min(i2 + i, bArr.length);
            while (i < iMin) {
                int i3 = bArr[i] & 255;
                if (i3 == 0 || (iMin - i) - 1 <= i3) {
                    break;
                }
                arrayList.add(a(i3, bArr[i + 1] & 255, Arrays.copyOfRange(bArr, i + 2, i + i3 + 1)));
                i += i3 + 1;
            }
        }
        return arrayList;
    }

    public void a(int i, bu buVar) {
        if (i < 0 || 65535 < i) {
            throw new IllegalArgumentException(String.format("'companyId' is out of the valid range: %d", Integer.valueOf(i)));
        }
        if (buVar == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        List<bu> arrayList = this.b.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.b.put(numValueOf, arrayList);
        }
        arrayList.add(0, buVar);
    }

    public void a(int i, bz bzVar) {
        if (i < 0 || 255 < i) {
            throw new IllegalArgumentException(String.format("'type' is out of the valid range: %d", Integer.valueOf(i)));
        }
        if (bzVar == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        List<bz> arrayList = this.a.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.a.put(numValueOf, arrayList);
        }
        arrayList.add(0, bzVar);
    }
}
