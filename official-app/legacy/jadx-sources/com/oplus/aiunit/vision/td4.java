package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.adaptation.common.ConfigHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class td4 {
    public static void a() {
        eoi.a(-1, 4);
        bue.j().r();
    }

    public static void b(i11 i11Var, String str) {
        List<BaseWatchFaceBean> listK = i11Var.k();
        ConfigHolder configHolderE = i11Var.e();
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            BaseWatchFaceBean baseWatchFaceBean = listK.get(i);
            if (baseWatchFaceBean.getWfUnique().equals(str)) {
                if (baseWatchFaceBean.isCurrent()) {
                    int i2 = i + 1;
                    if (i2 < size) {
                        listK.get(i2).setCurrent(true);
                    } else {
                        listK.get(i - 1).setCurrent(true);
                    }
                }
                listK.remove(baseWatchFaceBean);
                break;
            }
        }
        nul.a(i11Var, listK, configHolderE);
        a();
    }

    @Deprecated
    public static void c(i11 i11Var, String str, int i) {
        if (i11Var == null) {
            ltl.d("CreationOperateHelper", "[setCurrentAndNotifyChanged] --> device info in main process is null");
            return;
        }
        List<BaseWatchFaceBean> listK = i11Var.k();
        String deviceMac = i11Var.h().getDeviceMac();
        ConfigHolder configHolderE = i11Var.e();
        g(i11Var, listK, deviceMac, str, i);
        nul.a(i11Var, listK, configHolderE);
        a();
    }

    public static void d(i11 i11Var, String str, String str2) {
        if (i11Var == null) {
            ltl.d("CreationOperateHelper", "[setCurrentAndNotifyChanged] --> device info in main process is null");
            return;
        }
        List<BaseWatchFaceBean> listK = i11Var.k();
        String deviceMac = i11Var.h().getDeviceMac();
        ConfigHolder configHolderE = i11Var.e();
        h(i11Var, listK, deviceMac, str, str2);
        nul.a(i11Var, listK, configHolderE);
        a();
    }

    public static void e(i11 i11Var, String str, String str2, int i) {
        ConfigHolder configHolderE = i11Var.e();
        if (configHolderE != null) {
            if (configHolderE.isNewCreationInteractive()) {
                d(i11Var, str, str2);
            } else {
                c(i11Var, str, i);
            }
        }
    }

    public static void f(i11 i11Var, String str, String str2) {
        if (i11Var == null) {
            ltl.d("CreationOperateHelper", "[setCurrentAndNotifyChanged] --> device info in main process is null");
            return;
        }
        List<BaseWatchFaceBean> listK = i11Var.k();
        String deviceMac = i11Var.h().getDeviceMac();
        ConfigHolder configHolderE = i11Var.e();
        i(i11Var, listK, deviceMac, str, str2, 0);
        nul.a(i11Var, listK, configHolderE);
        a();
    }

    @Deprecated
    public static BaseWatchFaceBean g(i11 i11Var, List<BaseWatchFaceBean> list, String str, String str2, int i) {
        return i(i11Var, list, str, str2, "", i);
    }

    public static BaseWatchFaceBean h(i11 i11Var, List<BaseWatchFaceBean> list, String str, String str2, String str3) {
        BaseWatchFaceBean baseWatchFaceBean;
        ltl.a("CreationOperateHelper", "[setLocalCurrent] ...operateWfUnique " + str2 + " styleUnique " + str3);
        synchronized (ial.class) {
            baseWatchFaceBean = null;
            boolean z = false;
            for (BaseWatchFaceBean baseWatchFaceBean2 : list) {
                if (TextUtils.equals(baseWatchFaceBean2.getWfUnique(), str2)) {
                    if (baseWatchFaceBean2.isUniversal()) {
                        baseWatchFaceBean = baseWatchFaceBean2;
                    } else {
                        list.remove(baseWatchFaceBean2);
                        baseWatchFaceBean = baseWatchFaceBean2;
                        z = true;
                    }
                }
                baseWatchFaceBean2.setCurrent(false);
            }
            if (z) {
                list.add(0, baseWatchFaceBean);
            }
            if (baseWatchFaceBean == null) {
                baseWatchFaceBean = new BaseWatchFaceBean();
                baseWatchFaceBean.setWfUnique(str2);
                list.add(0, baseWatchFaceBean);
            }
            List<ud4> listW = com.heytap.health.watchface.business.creation.db.a.a().w(sd4.a(i11Var, str2), str);
            ArrayList arrayList = new ArrayList();
            for (ud4 ud4Var : listW) {
                if (TextUtils.equals(str3, ud4Var.b)) {
                    arrayList.add(ud4Var.d);
                    break;
                }
            }
            baseWatchFaceBean.setStyleUnique(str3);
            baseWatchFaceBean.setCurrent(true);
            baseWatchFaceBean.setUniversal(true);
            baseWatchFaceBean.setHidden(false);
            baseWatchFaceBean.setPreviewUrls(arrayList);
            baseWatchFaceBean.setCurrentStyleIndex(0);
            ltl.a("CreationOperateHelper", "[setLocalCurrent] target " + baseWatchFaceBean);
        }
        return baseWatchFaceBean;
    }

    public static BaseWatchFaceBean i(i11 i11Var, List<BaseWatchFaceBean> list, String str, String str2, String str3, int i) {
        BaseWatchFaceBean baseWatchFaceBean;
        ltl.a("CreationOperateHelper", "[setLocalCurrent] ...operateWfUnique " + str2 + " styleIndex " + i);
        synchronized (ial.class) {
            baseWatchFaceBean = null;
            boolean z = false;
            for (BaseWatchFaceBean baseWatchFaceBean2 : list) {
                if (TextUtils.equals(baseWatchFaceBean2.getWfUnique(), str2)) {
                    if (baseWatchFaceBean2.isUniversal()) {
                        baseWatchFaceBean = baseWatchFaceBean2;
                    } else {
                        list.remove(baseWatchFaceBean2);
                        baseWatchFaceBean = baseWatchFaceBean2;
                        z = true;
                    }
                }
                baseWatchFaceBean2.setCurrent(false);
            }
            if (z) {
                list.add(0, baseWatchFaceBean);
            }
            if (baseWatchFaceBean == null) {
                baseWatchFaceBean = new BaseWatchFaceBean();
                baseWatchFaceBean.setWfUnique(str2);
                list.add(0, baseWatchFaceBean);
            }
            int iB = sd4.b(i11Var, str2, str3);
            List<ud4> listW = com.heytap.health.watchface.business.creation.db.a.a().w(iB, str);
            ArrayList arrayList = new ArrayList();
            if (iB == 9 || iB == 10 || iB == 11) {
                for (ud4 ud4Var : listW) {
                    if (TextUtils.equals(ud4Var.b, str2)) {
                        arrayList.add(ud4Var.d);
                        break;
                    }
                }
            } else {
                Iterator<ud4> it = listW.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().d);
                }
            }
            baseWatchFaceBean.setCurrent(true);
            baseWatchFaceBean.setUniversal(true);
            baseWatchFaceBean.setHidden(false);
            baseWatchFaceBean.setPreviewUrls(arrayList);
            baseWatchFaceBean.setCurrentStyleIndex(i);
            ltl.a("CreationOperateHelper", "[setLocalCurrent] target " + baseWatchFaceBean);
        }
        return baseWatchFaceBean;
    }

    public static BaseWatchFaceBean j(i11 i11Var, String str, String str2, int i) {
        ltl.a("CreationOperateHelper", "[setLocalCurrent] ...operateWfUnique " + str2 + " styleIndex " + i);
        synchronized (ial.class) {
            BaseWatchFaceBean baseWatchFaceBeanA = ial.a(i11Var, str2);
            if (baseWatchFaceBeanA == null) {
                ltl.i("CreationOperateHelper", "[setLocalCurrent] not find watchface,operateWfUnique  " + str2);
                return null;
            }
            List<ud4> listW = com.heytap.health.watchface.business.creation.db.a.a().w(sd4.a(i11Var, str2), str);
            ArrayList arrayList = new ArrayList();
            Iterator<ud4> it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d);
            }
            baseWatchFaceBeanA.setPreviewUrls(arrayList);
            baseWatchFaceBeanA.setCurrentStyleIndex(i);
            ltl.a("CreationOperateHelper", "[setLocalCurrent] target " + baseWatchFaceBeanA);
            return baseWatchFaceBeanA;
        }
    }
}
