package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.adaptation.device.rswatch.bean.DialOnlineBean;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ial {
    public static BaseWatchFaceBean a(i11 i11Var, String str) {
        return b(i11Var.k(), str);
    }

    public static BaseWatchFaceBean b(List<BaseWatchFaceBean> list, String str) {
        ltl.a("WatchFaceFavoritesHelper", "[findWfBean] currentFavorites " + list);
        if (list != null) {
            for (BaseWatchFaceBean baseWatchFaceBean : list) {
                if (TextUtils.equals(baseWatchFaceBean.getWfUnique(), str)) {
                    return baseWatchFaceBean;
                }
            }
        }
        return null;
    }

    public static boolean c(DialOnlineBean dialOnlineBean) {
        if (dialOnlineBean == null) {
            return false;
        }
        List<BaseWatchFaceBean> listH = ntl.m().h();
        String dialKey = dialOnlineBean.getDialKey();
        if (listH != null) {
            Iterator<BaseWatchFaceBean> it = listH.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().getWfUnique(), dialKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(i11 i11Var, String str) {
        return f(i11Var.k(), str, null);
    }

    public static boolean e(String str) {
        return f(ntl.m().f().k(), str, null);
    }

    public static boolean f(List<BaseWatchFaceBean> list, String str, String str2) {
        if (list != null) {
            for (BaseWatchFaceBean baseWatchFaceBean : list) {
                String wfUnique = baseWatchFaceBean.getWfUnique();
                String wfVersion = baseWatchFaceBean.getWfVersion();
                if (TextUtils.equals(wfUnique, str) && (TextUtils.isEmpty(str2) || TextUtils.equals(str2, wfVersion))) {
                    return true;
                }
            }
        }
        return false;
    }
}
