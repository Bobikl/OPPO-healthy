package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import com.heytap.health.operation.medal.bean.MedalUploadBean;
import com.heytap.health.operation.medal.core.Utils;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class wr4 extends j61 {
    public static Pair<ur4.b, List<ur4.b>> h;
    public static long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f18373j = v05.a(20190101);
    public static String k;
    public long g;

    public static void C() {
        oqb.c("DailySportContinuousAccomplishDays,  reset ");
    }

    public final boolean A(long j2) {
        oqb.c("isReadAllData", Long.valueOf(j2));
        return j2 == f18373j;
    }

    public final boolean B() {
        String strC = oa2.c();
        try {
            return TextUtils.isEmpty(k) || !Objects.equals(strC, k);
        } finally {
            k = strC;
        }
    }

    @Override // com.oplus.aiunit.vision.hea
    public void a() {
        int i2;
        int i3;
        MedalListBean medalListBeanN = n();
        if (!Utils.b(medalListBeanN)) {
            if (TextUtils.isEmpty(medalListBeanN.getProgress())) {
                medalListBeanN.setProgress("0");
            }
            oqb.c(this.a, "isDataSyncFirstFinish check medal return ", medalListBeanN);
            j(this.f12766e, this.d);
            return;
        }
        int i4 = (int) Float.parseFloat(medalListBeanN.getTarget());
        oqb.b(this.a, "intercept > == target:", Integer.valueOf(i4), medalListBeanN.toString());
        if (i4 == 1 && medalListBeanN.isGet()) {
            j(this.f12766e, this.d);
            return;
        }
        medalListBeanN.setRemark(medalListBeanN.getRemark() == null ? "" : medalListBeanN.getRemark());
        long acquisitionDate = medalListBeanN.getAcquisitionDate();
        long j2 = f18373j;
        if (medalListBeanN.getRemark().contains("_")) {
            String[] strArrSplit = medalListBeanN.getRemark().split("_");
            try {
                if (strArrSplit.length > 4) {
                    int i5 = Integer.parseInt(strArrSplit[1]);
                    long j3 = Long.parseLong(strArrSplit[2]);
                    acquisitionDate = Long.parseLong(strArrSplit[4]);
                    i2 = i5;
                    j2 = j3;
                } else {
                    i2 = 0;
                }
            } catch (Exception e2) {
                oqb.d(e2);
                j2 = f18373j;
            }
            oqb.c(this.a, " remark ", medalListBeanN.getRemark(), String.format("lastGetMedalTimeFirstDay:%tD", Long.valueOf(j2)));
        } else {
            i2 = 0;
        }
        if (i2 < 0) {
            oqb.c(this.a, "times < 0. times =", Integer.valueOf(i2));
            j2 = f18373j;
            i2 = 0;
        }
        if (i != j2 || B()) {
            i = j2;
            Pair<ur4.b, List<ur4.b>> pairC = ur4.c(j2, 10000L);
            h = pairC;
            oqb.c(this.a, "continuouslyAccomplishMarks ==> calc data progress ", pairC.first);
        } else {
            oqb.c(this.a, "continuouslyAccomplishMarks ==> progress ", h.first);
        }
        Pair<ur4.b, List<ur4.b>> pair = h;
        ur4.b bVar = (ur4.b) pair.first;
        List list = (List) pair.second;
        int iJ = bVar.j();
        boolean zA = A(bVar.i());
        int iMax = Math.max(20190101, bVar.g());
        if (bVar.j() == 0) {
            i3 = 0;
            if (!e93.b(list)) {
                medalListBeanN.setProgress("0");
                j(this.f12766e, this.d);
                return;
            }
        } else {
            i3 = 0;
        }
        this.g = v05.a(bVar.h());
        Iterator it = list.iterator();
        ur4.b bVar2 = null;
        int iG = iMax;
        int i6 = i3;
        while (it.hasNext()) {
            ur4.b bVar3 = (ur4.b) it.next();
            Iterator it2 = it;
            if (bVar3.j() >= i4) {
                i6++;
                iG = bVar3.g();
                bVar2 = bVar3;
            }
            it = it2;
        }
        if (iJ >= i4) {
            medalListBeanN.setProgress("0");
            int i7 = i6;
            long jA = v05.a(iG) + (((long) (i4 - 1)) * 86400000);
            if (!medalListBeanN.isGetRow() || acquisitionDate < jA) {
                oqb.c(this.a, "lastGet ", Long.valueOf(acquisitionDate), Long.valueOf(jA), "");
                int i8 = i7 + 1;
                if (!zA) {
                    i2 += i8;
                } else if (i2 <= i8) {
                    i2 = i8;
                }
                int iG2 = bVar.g();
                if (DateUtils.isToday(jA)) {
                    jA = System.currentTimeMillis();
                }
                long j4 = jA;
                String str = this.g + "_" + i2 + "_" + v05.a(iG2) + "_" + iJ + "_" + j4;
                w(medalListBeanN, Utils.g(medalListBeanN, str, 1, 0, j4));
                oqb.c(this.a, "recent medal get, isDataSyncFirstFinish readAllData ", Boolean.valueOf(zA), " check target ", Integer.valueOf(i4), "remark ", str);
            } else {
                int iG3 = bVar.g();
                medalListBeanN.setRemark(this.g + "_" + i2 + "_" + v05.a(iG3) + "_" + iJ + "_" + acquisitionDate);
                medalListBeanN.setAcquisitionDate(acquisitionDate);
                oqb.c(this.a, "recent medal already get, isDataSyncFirstFinish readAllData ", Boolean.valueOf(zA), " check target ", Integer.valueOf(i4), "cal piledUpTimes ", Integer.valueOf(i2), "nextCheckStartTime", Integer.valueOf(iG3));
            }
        } else {
            int i9 = i6;
            String strValueOf = String.valueOf((iJ * 1.0f) / i4);
            medalListBeanN.setProgress(strValueOf);
            if (zA) {
                if (i2 <= i9) {
                    i2 = i9;
                }
            } else if (i9 != 0) {
                i2 = (i2 - 1) + i9;
            }
            int iG4 = iJ > 0 ? bVar.g() : ur4.h(((ur4.b) list.get(list.size() - 1)).h(), 1);
            long jA2 = bVar2 != null ? v05.a(iG) + (((long) (i4 - 1)) * 86400000) : medalListBeanN.getAcquisitionDate();
            String str2 = this.g + "_" + i2 + "_" + v05.a(iG4) + "_" + iJ + "_" + acquisitionDate;
            medalListBeanN.setRemark(str2);
            if (i2 > 0) {
                medalListBeanN.setGetResult(1);
                medalListBeanN.setAcquisitionDate(jA2);
                MedalUploadBean medalUploadBean = new MedalUploadBean();
                medalUploadBean.setCode(medalListBeanN.getCode());
                medalUploadBean.setAcquisitionDate(medalListBeanN.getAcquisitionDate());
                medalUploadBean.setGetResult(1);
                medalUploadBean.setMedalFlag(medalListBeanN.getFlag());
                medalUploadBean.setRemark(str2);
                this.f12766e.add(medalUploadBean);
            }
            oqb.c(this.a, "recent medal not get, isDataSyncFirstFinish readAllData ", Boolean.valueOf(zA), " check target ", Integer.valueOf(i4), "cal piledUpTimes ", Integer.valueOf(i2), "nextCheckStartTime", Integer.valueOf(iG4), "progress", strValueOf);
        }
        oqb.c(this.a, "intercept > target:", Integer.valueOf(i4), medalListBeanN.getRemark(), " >>>>> finish");
        j(this.f12766e, this.d);
    }

    @Override // com.oplus.aiunit.vision.j61
    public String p() {
        return "DailySportContinuousAccomplishDays";
    }

    @Override // com.oplus.aiunit.vision.j61
    public void v() {
        e(krb.CMEALLACT, false);
    }
}
