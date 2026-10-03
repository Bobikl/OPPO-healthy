package com.heytap.health.operation.medal.core;

import android.text.TextUtils;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.operation.medal.bean.MedalUploadBean;
import com.heytap.health.operations.bean.MedalListBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.krb;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v9g;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class Utils {
    public static final int NUMBER_ONE_THOUSAND = 1000;

    public static boolean a(MedalListBean medalListBean) {
        return !medalListBean.isGet() && medalListBean.isOnline();
    }

    public static boolean b(MedalListBean medalListBean) {
        return medalListBean.isOnline();
    }

    public static synchronized void c() {
        a7b.f("MedalLogic:MedalUtils", "clearBgGetMedals: ");
        v9g.x(krb.e()).U(krb.ALL_BG_MEDALS, "[]");
    }

    public static synchronized List<MedalListBean> d() {
        a7b.f("MedalLogic:MedalUtils", "getBgGetMedals: ");
        return (List) sc8.b(v9g.x(krb.e()).E(krb.ALL_BG_MEDALS, "[]"), new TypeToken<List<MedalListBean>>() { // from class: com.heytap.health.operation.medal.core.Utils.2
        }.getType());
    }

    public static int e(String str) {
        int i = Integer.MAX_VALUE;
        if (!TextUtils.isEmpty(str)) {
            try {
                int i2 = (int) Float.parseFloat(str.substring(str.lastIndexOf("_") + 1));
                i = i2 > 0 ? i2 : Integer.MAX_VALUE;
                a7b.f("MedalLogic:MedalUtils", str + "  -> get medial target: " + i);
            } catch (Exception e2) {
                a7b.b("MedalLogic:MedalUtils", str + " ==> " + e2.toString());
            }
        }
        return i;
    }

    public static MedalUploadBean f(MedalListBean medalListBean, long j2, int i, int i2) {
        return g(medalListBean, Long.valueOf(j2), i, i2, System.currentTimeMillis());
    }

    public static MedalUploadBean g(MedalListBean medalListBean, Object obj, int i, int i2, long j2) {
        String ssoid = um.c().getSsoid();
        MedalUploadBean medalUploadBean = new MedalUploadBean();
        medalUploadBean.setCode(medalListBean.getCode());
        medalUploadBean.setGetResult(i);
        medalUploadBean.setSsoid(ssoid);
        medalUploadBean.setMedalFlag(i2);
        medalUploadBean.setRemark(String.valueOf(obj));
        medalUploadBean.setRecordDuration((int) medalListBean.getRecordDuration());
        medalUploadBean.setBreakRecordTimes(medalListBean.getBreakRecordTimes());
        if (j2 > 0) {
            medalListBean.setAcquisitionDate(j2);
            medalUploadBean.setAcquisitionDate(j2);
        }
        medalListBean.setRemark(String.valueOf(obj));
        medalListBean.setGetResult(i);
        medalListBean.setFlag(i2);
        return medalUploadBean;
    }

    public static MedalUploadBean h(MedalListBean medalListBean, String str, int i, int i2) {
        String ssoid = um.c().getSsoid();
        MedalUploadBean medalUploadBean = new MedalUploadBean();
        medalUploadBean.setCode(medalListBean.getCode());
        medalUploadBean.setAcquisitionDate(System.currentTimeMillis());
        medalUploadBean.setGetResult(i);
        medalUploadBean.setSsoid(ssoid);
        medalUploadBean.setMedalFlag(i2);
        medalUploadBean.setRemark(str);
        medalListBean.setAcquisitionDate(System.currentTimeMillis());
        medalListBean.setRemark(str);
        medalListBean.setGetResult(i);
        medalListBean.setFlag(i2);
        return medalUploadBean;
    }

    public static MedalUploadBean i(MedalListBean medalListBean, long j2, int i, int i2) {
        String ssoid = um.c().getSsoid();
        MedalUploadBean medalUploadBean = new MedalUploadBean();
        medalUploadBean.setCode(medalListBean.getCode());
        medalUploadBean.setAcquisitionDate(medalListBean.getAcquisitionDate());
        medalUploadBean.setGetResult(i);
        medalUploadBean.setSsoid(ssoid);
        medalUploadBean.setMedalFlag(i2);
        medalUploadBean.setRemark(String.valueOf(j2));
        medalListBean.setRemark(String.valueOf(j2));
        medalListBean.setGetResult(i);
        medalListBean.setFlag(i2);
        return medalUploadBean;
    }

    public static MedalUploadBean j(MedalListBean medalListBean) {
        String ssoid = um.c().getSsoid();
        MedalUploadBean medalUploadBean = new MedalUploadBean();
        medalUploadBean.setCode(medalListBean.getCode());
        if (1 == medalListBean.getGetResult()) {
            medalUploadBean.setAcquisitionDate(medalListBean.getAcquisitionDate());
        }
        medalUploadBean.setGetResult(medalListBean.getGetResult());
        medalUploadBean.setSsoid(ssoid);
        medalUploadBean.setMedalFlag(medalListBean.getFlag());
        medalUploadBean.setRemark(String.valueOf(medalListBean.getRemark()));
        medalUploadBean.setRecordDuration((int) medalListBean.getRecordDuration());
        medalUploadBean.setBreakRecordTimes(medalListBean.getBreakRecordTimes());
        return medalUploadBean;
    }

    public static synchronized void k(MedalListBean medalListBean) {
        String strE = krb.e();
        a7b.f("MedalLogic:MedalUtils", "saveBgGetMedals: medalName=" + strE + "  medalListBean=" + medalListBean);
        String strE2 = v9g.x(strE).E(krb.ALL_BG_MEDALS, "[]");
        List list = (List) sc8.b(strE2, new TypeToken<List<MedalListBean>>() { // from class: com.heytap.health.operation.medal.core.Utils.1
        }.getType());
        if (list != null) {
            list.add(medalListBean);
        }
        try {
            strE2 = sc8.g(list);
        } catch (JsonIOException e2) {
            a7b.b("MedalLogic:MedalUtils", "gson toJson exception" + e2.getMessage());
        }
        v9g.x(strE).U(krb.ALL_BG_MEDALS, strE2);
    }
}
