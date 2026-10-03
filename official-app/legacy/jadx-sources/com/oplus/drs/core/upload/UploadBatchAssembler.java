package com.oplus.drs.core.upload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.b87;
import com.oplus.aiunit.vision.co3;
import com.oplus.aiunit.vision.qaf;
import com.oplus.aiunit.vision.w56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.core.ratelimit.QuotaCheckResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class UploadBatchAssembler {
    public final com.oplus.drs.core.db.service.a a;
    public final AppServerDirectiveStore b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.oplus.drs.core.upload.gate.a f19799c;

    @Nullable
    public final qaf d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal<Long> f19800e = new ThreadLocal<>();
    public final AtomicInteger f = new AtomicInteger(0);

    public enum ProtocolType {
        TRACK,
        LEGACY_TRIPLET
    }

    public static final class a {
        public final String a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<co3> f19801c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19802e;
        public final ProtocolType f;

        public a(String str, int i, List<co3> list, boolean z, int i2) {
            this(str, i, list, z, i2, ProtocolType.TRACK);
        }

        public a(String str, int i, List<co3> list, boolean z, int i2, ProtocolType protocolType) {
            this.a = str;
            this.b = i;
            this.f19801c = list;
            this.d = z;
            this.f19802e = i2;
            this.f = protocolType;
        }
    }

    public UploadBatchAssembler(com.oplus.drs.core.db.service.a aVar, AppServerDirectiveStore appServerDirectiveStore, @NonNull com.oplus.drs.core.upload.gate.a aVar2, @Nullable qaf qafVar) {
        this.a = aVar;
        this.b = appServerDirectiveStore;
        this.f19799c = aVar2;
        this.d = qafVar;
    }

    public final boolean a() {
        return this.f19799c.g().f();
    }

    public long b() {
        Long l2 = this.f19800e.get();
        this.f19800e.remove();
        if (l2 == null) {
            return 0L;
        }
        return Math.max(0L, l2.longValue());
    }

    public final long c(@NonNull List<co3> list) {
        long j2 = 0;
        for (co3 co3Var : list) {
            if (co3Var != null) {
                j2 += (long) co3Var.v;
            }
        }
        return j2;
    }

    public final long d(co3 co3Var) {
        byte[] bArr = co3Var.g;
        int length = bArr != null ? bArr.length : 0;
        String str = co3Var.f10170e;
        return length + (str != null ? str.length() : 0) + 200;
    }

    public void e(a aVar, boolean z) {
        int size;
        String str = aVar.a;
        if (str == null || str.isEmpty()) {
            throw new IllegalStateException("Scoped piggyback requires non-empty appId");
        }
        List<co3> list = aVar.f19801c;
        if (list == null) {
            throw new IllegalStateException("Scoped piggyback requires non-null records");
        }
        if (aVar.d || aVar.f != ProtocolType.TRACK || (size = list.size()) >= 100) {
            return;
        }
        int i = 100 - size;
        Iterator<co3> it = aVar.f19801c.iterator();
        long jD = 0;
        while (it.hasNext()) {
            jD += d(it.next());
        }
        int iMin = Math.min(100, i * 5);
        List<co3> listU = this.a.u(aVar.a, 1, 0L, iMin <= 0 ? i : iMin, z, a());
        if (listU == null || listU.isEmpty()) {
            return;
        }
        for (co3 co3Var : listU) {
            if (co3Var.m != 0) {
                co3Var.r = false;
                co3Var.s = false;
                jD += d(co3Var);
                if (jD > 1048576) {
                    return;
                }
                aVar.f19801c.add(co3Var);
                if (aVar.f19801c.size() >= 100) {
                    return;
                }
            }
        }
    }

    @Nullable
    public final a f(@Nullable a aVar) {
        List<co3> list;
        long jC;
        QuotaCheckResult quotaCheckResultJ;
        if (aVar == null) {
            return null;
        }
        if (this.d == null || aVar.a == null || (list = aVar.f19801c) == null || list.isEmpty() || (quotaCheckResultJ = this.d.j(aVar.a, (jC = c(aVar.f19801c)))) == null || quotaCheckResultJ.d()) {
            return aVar;
        }
        z6b.k("UploadBatchAssembler", "filterByUploadQuota skip appId=" + aVar.a + ", rawBytes=" + jC + ", res=" + quotaCheckResultJ);
        return null;
    }

    @Nullable
    public final List<a> g(@Nullable List<a> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a aVarF = f(it.next());
            if (aVarF != null) {
                arrayList.add(aVarF);
            }
        }
        return arrayList;
    }

    public final Set<String> h() {
        qaf qafVar = this.d;
        if (qafVar == null) {
            return null;
        }
        Set<String> setM = qafVar.m();
        if (setM != null && !setM.isEmpty()) {
            z6b.k("UploadBatchAssembler", "getExcludedAppIds: " + setM.size() + " appIds excluded");
        }
        return setM;
    }

    public final long[] i(List<co3> list, long j2, long j3) {
        for (co3 co3Var : list) {
            co3Var.r = false;
            co3Var.s = false;
            long j4 = co3Var.p;
            if (j4 > j2) {
                j3 = co3Var.a;
                j2 = j4;
            } else if (j4 == j2) {
                long j5 = co3Var.a;
                if (j5 > j3) {
                    j3 = j5;
                }
            }
        }
        return new long[]{j2, j3};
    }

    @Nullable
    public List<a> j(boolean z, long[] jArr, long[] jArr2) {
        return r(z, jArr, jArr2, true);
    }

    @Nullable
    public final List<a> k(boolean z) {
        String str;
        String str2;
        List<co3> listO = this.a.o(100, z);
        if (listO == null || listO.isEmpty() || (str = listO.get(0).i) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (co3 co3Var : listO) {
            if (co3Var != null && (str2 = co3Var.i) != null && str.equals(str2)) {
                co3Var.r = false;
                co3Var.s = true;
                arrayList.add(co3Var);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return g(v(str, 1, arrayList, false, 0));
    }

    @Nullable
    public List<a> l(boolean z, long[] jArr, long[] jArr2) {
        return n(z, jArr, jArr2, new int[]{0, 1, 2, 3});
    }

    @Nullable
    public List<a> m(boolean z, long[] jArr, long[] jArr2) {
        return n(z, jArr, jArr2, new int[]{4, 5});
    }

    @Nullable
    public final List<a> n(boolean z, long[] jArr, long[] jArr2, int[] iArr) {
        List<a> listO = o(z, true, jArr2, iArr);
        if (listO != null && !listO.isEmpty()) {
            return listO;
        }
        List<a> listO2 = o(z, false, jArr, iArr);
        if (listO2 == null || listO2.isEmpty()) {
            return null;
        }
        return listO2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final List<a> o(boolean z, boolean z2, long[] jArr, int[] iArr) {
        Object[] objArrR;
        boolean z3;
        int i;
        long j2 = 0;
        boolean z4 = false;
        long j3 = (jArr == null || jArr.length <= 0) ? 0L : jArr[0];
        int i2 = 1;
        if (jArr != null && jArr.length > 1) {
            j2 = jArr[1];
        }
        boolean zA = a();
        Set<String> setH = h();
        long j4 = j2;
        long j5 = j3;
        for (int i3 = 0; i3 < 100 && (objArrR = this.a.r(j5, j4, z, z2, zA, setH, iArr)) != null; i3++) {
            String str = (String) objArrR[z4 ? 1 : 0];
            int iIntValue = ((Integer) objArrR[i2 == true ? 1 : 0]).intValue();
            int iIntValue2 = ((Integer) objArrR[2]).intValue();
            long jLongValue = ((Long) objArrR[3]).longValue();
            AppServerDirectiveStore appServerDirectiveStore = this.b;
            AppServerDirectiveStore.a aVarC = appServerDirectiveStore == null ? AppServerDirectiveStore.a.NONE : appServerDirectiveStore.c(str);
            if (aVarC.a()) {
                if (aVarC.a == AppServerDirectiveStore.DirectiveType.BACKOFF) {
                    t(aVarC.f19798c);
                }
                z6b.q("UploadBatchAssembler", "prepareNrByGroup skip blocked appId=" + str + ", untilMs=" + aVarC.b);
                long[] jArrQ = this.a.q(str, iIntValue2, jLongValue, j5, j4, z, zA, iArr);
                if (jArrQ == null || jArrQ.length < 2) {
                    return null;
                }
                long j6 = jArrQ[z4 ? 1 : 0];
                long j7 = jArrQ[i2 == true ? 1 : 0];
                if (jArr != null && jArr.length > i2) {
                    jArr[z4 ? 1 : 0] = j6;
                    jArr[i2 == true ? 1 : 0] = j7;
                }
                j5 = j6;
                j4 = j7;
                z3 = z4 ? 1 : 0;
                i = i2 == true ? 1 : 0;
            } else {
                List<co3> listP = this.a.p(str, iIntValue2, jLongValue, j5, j4, 100, z, zA, iArr);
                if (listP == null || listP.isEmpty()) {
                    long[] jArrQ2 = this.a.q(str, iIntValue2, jLongValue, j5, j4, z, zA, iArr);
                    if (jArrQ2 == null || jArrQ2.length < 2) {
                        break;
                    }
                    z3 = false;
                    long j8 = jArrQ2[0];
                    i = 1;
                    long j9 = jArrQ2[1];
                    if (jArr != null && jArr.length > 1) {
                        jArr[0] = j8;
                        jArr[1] = j9;
                    }
                    j4 = j9;
                    j5 = j8;
                } else {
                    long j10 = j5;
                    long j11 = j4;
                    boolean z5 = i2;
                    for (co3 co3Var : listP) {
                        co3Var.r = z5;
                        co3Var.s = z4;
                        long j12 = co3Var.p;
                        if (j12 > j10) {
                            j11 = co3Var.a;
                            j10 = j12;
                        } else if (j12 == j10) {
                            long j13 = co3Var.a;
                            if (j13 > j11) {
                                j11 = j13;
                            }
                        }
                        z4 = false;
                        z5 = 1;
                    }
                    if (jArr != null && jArr.length > 1) {
                        jArr[0] = j10;
                        jArr[1] = j11;
                    }
                    boolean z6 = iIntValue2 == 0;
                    List<a> listG = g(v(str, iIntValue, listP, z6, z6 ? (int) jLongValue : 0));
                    if (listG != null && !listG.isEmpty()) {
                        return listG;
                    }
                    z6b.q("UploadBatchAssembler", "prepareNrByGroupInternal all batches filtered by quota, appId=" + str);
                    z3 = false;
                    i = 1;
                }
            }
            z4 = z3;
            i2 = i;
        }
        return null;
    }

    @Nullable
    public List<a> p(boolean z, long[] jArr, long[] jArr2) {
        List<a> listK;
        if ((this.f.incrementAndGet() % (b87.a(w56.h(), b87.FF_CORE_RT_MIGRATION_CUTOVER, false) ? 20 : 5) == 0) && (listK = k(z)) != null && !listK.isEmpty()) {
            return listK;
        }
        List<a> listR = r(z, jArr, jArr2, false);
        return (listR == null || listR.isEmpty()) ? k(z) : listR;
    }

    @Nullable
    public final a q(boolean z, long[] jArr, boolean z2) {
        Object[] objArrX;
        int i;
        long j2;
        long j3;
        long j4 = 0;
        long j5 = (jArr == null || jArr.length <= 0) ? 0L : jArr[0];
        if (jArr != null && jArr.length > 1) {
            j4 = jArr[1];
        }
        boolean zA = a();
        int i2 = 2;
        int[] iArr = z2 ? new int[]{2, 1} : new int[]{2};
        Set<String> setH = h();
        long j6 = j4;
        long j7 = j5;
        int i3 = 0;
        while (i3 < 100 && (objArrX = this.a.x(j7, j6, z, zA, setH, iArr)) != null) {
            String str = (String) objArrX[0];
            int iIntValue = ((Integer) objArrX[1]).intValue();
            long jLongValue = ((Long) objArrX[i2]).longValue();
            AppServerDirectiveStore appServerDirectiveStore = this.b;
            AppServerDirectiveStore.a aVarC = appServerDirectiveStore == null ? AppServerDirectiveStore.a.NONE : appServerDirectiveStore.c(str);
            if (aVarC.a()) {
                if (aVarC.a == AppServerDirectiveStore.DirectiveType.BACKOFF) {
                    t(aVarC.f19798c);
                }
                z6b.q("UploadBatchAssembler", "prepareRtHighPriority skip blocked appId=" + str);
                long[] jArrW = this.a.w(str, jLongValue, j7, j6, z, zA, iArr);
                if (jArrW == null || jArrW.length < i2) {
                    return null;
                }
                j2 = jArrW[0];
                j3 = jArrW[1];
                i = i3;
                w(jArr, j2, j3);
            } else {
                i = i3;
                List<co3> listT = this.a.t(str, jLongValue, j7, j6, 100, z, zA, iArr);
                if (listT == null || listT.isEmpty()) {
                    long[] jArrW2 = this.a.w(str, jLongValue, j7, j6, z, zA, iArr);
                    if (jArrW2 == null || jArrW2.length < i2) {
                        break;
                    }
                    j2 = jArrW2[0];
                    j3 = jArrW2[1];
                    w(jArr, j2, j3);
                } else {
                    int i4 = i2;
                    long[] jArrI = i(listT, j7, j6);
                    w(jArr, jArrI[0], jArrI[1]);
                    a aVarF = f(new a(str, iIntValue, listT, true, (int) jLongValue));
                    if (aVarF != null) {
                        return aVarF;
                    }
                    z6b.q("UploadBatchAssembler", "prepareRtHighPriority skip quota-limited appId=" + str);
                    i2 = i4;
                }
                i3 = i + 1;
                i2 = i2;
            }
            j7 = j2;
            j6 = j3;
            i3 = i + 1;
            i2 = i2;
        }
        return null;
    }

    @Nullable
    public final List<a> r(boolean z, long[] jArr, long[] jArr2, boolean z2) {
        a aVarQ = q(z, jArr2, z2);
        if (aVarQ != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(aVarQ);
            return arrayList;
        }
        List<a> listS = s(z, jArr, z2);
        if (listS == null || listS.isEmpty()) {
            return null;
        }
        return listS;
    }

    @Nullable
    public final List<a> s(boolean z, long[] jArr, boolean z2) {
        Object[] objArrY;
        int i;
        int i2;
        long j2 = 0;
        long j3 = (jArr == null || jArr.length <= 0) ? 0L : jArr[0];
        if (jArr != null && jArr.length > 1) {
            j2 = jArr[1];
        }
        boolean zA = a();
        int i3 = 2;
        int[] iArr = z2 ? new int[]{2, 1} : new int[]{2};
        Set<String> setH = h();
        long j4 = j2;
        long j5 = j3;
        int i4 = 0;
        while (i4 < 100 && (objArrY = this.a.y(j5, j4, z, zA, setH, iArr)) != null) {
            String str = (String) objArrY[0];
            int iIntValue = ((Integer) objArrY[1]).intValue();
            AppServerDirectiveStore appServerDirectiveStore = this.b;
            AppServerDirectiveStore.a aVarC = appServerDirectiveStore == null ? AppServerDirectiveStore.a.NONE : appServerDirectiveStore.c(str);
            if (aVarC.a()) {
                if (aVarC.a == AppServerDirectiveStore.DirectiveType.BACKOFF) {
                    t(aVarC.f19798c);
                }
                z6b.q("UploadBatchAssembler", "prepareRtNormalPriority skip blocked appId=" + str);
                long[] jArrV = this.a.v(str, j5, j4, z, zA, iArr);
                if (jArrV == null || jArrV.length < i3) {
                    return null;
                }
                long j6 = jArrV[0];
                long j7 = jArrV[1];
                i = i4;
                w(jArr, j6, j7);
                j5 = j6;
                j4 = j7;
                i2 = i3;
            } else {
                int i5 = i3;
                i = i4;
                List<co3> listS = this.a.s(str, j5, j4, 100, z, zA, iArr);
                if (listS == null || listS.isEmpty()) {
                    long[] jArrV2 = this.a.v(str, j5, j4, z, zA, iArr);
                    if (jArrV2 == null || jArrV2.length < i5) {
                        break;
                    }
                    long j8 = jArrV2[0];
                    long j9 = jArrV2[1];
                    i2 = i5;
                    w(jArr, j8, j9);
                    j5 = j8;
                    j4 = j9;
                } else {
                    i2 = i5;
                    long[] jArrI = i(listS, j5, j4);
                    w(jArr, jArrI[0], jArrI[1]);
                    List<a> listG = g(v(str, iIntValue, listS, false, 0));
                    if (listG != null && !listG.isEmpty()) {
                        return listG;
                    }
                    z6b.q("UploadBatchAssembler", "prepareRtNormalPriority all batches filtered by quota, appId=" + str);
                }
            }
            i4 = i + 1;
            i3 = i2;
        }
        return null;
    }

    public final void t(long j2) {
        if (j2 <= 0) {
            return;
        }
        Long l2 = this.f19800e.get();
        if (l2 == null || l2.longValue() <= 0 || j2 < l2.longValue()) {
            this.f19800e.set(Long.valueOf(j2));
        }
    }

    public void u() {
        this.f19800e.set(0L);
    }

    @Nullable
    public final List<a> v(String str, int i, List<co3> list, boolean z, int i2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new a(str, i, list, true, i2, ProtocolType.TRACK));
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (co3 co3Var : list) {
            if (UploadManager.j(co3Var)) {
                arrayList3.add(co3Var);
            } else if (co3Var.t == 5) {
                arrayList4.add(co3Var);
            } else {
                arrayList2.add(co3Var);
            }
        }
        ArrayList arrayList5 = new ArrayList(3);
        if (!arrayList2.isEmpty()) {
            arrayList5.add(new a(str, i, arrayList2, false, 0, ProtocolType.TRACK));
        }
        if (!arrayList4.isEmpty()) {
            arrayList5.add(new a(str, i, arrayList4, false, 0, ProtocolType.TRACK));
        }
        if (arrayList3.isEmpty()) {
            return arrayList5;
        }
        arrayList5.add(new a(str, i, arrayList3, false, 0, ProtocolType.LEGACY_TRIPLET));
        return arrayList5;
    }

    public final void w(long[] jArr, long j2, long j3) {
        if (jArr == null || jArr.length <= 1) {
            return;
        }
        jArr[0] = j2;
        jArr[1] = j3;
    }
}
