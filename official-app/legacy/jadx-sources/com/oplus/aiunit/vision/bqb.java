package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.health.operation.medal.MedalUploadSaveManager;
import com.heytap.health.operation.medal.bean.MedalAllListBean;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class bqb implements bk5 {
    public static List<MedalListBean> a = new ArrayList();
    public static List<String> b = Arrays.asList(krb.CMEALLACT, krb.CMEDAYACT, krb.CMESINGLESWIMMING, krb.CMESINGLERUNMILE, krb.CMESINGLEWORKMILE, krb.CMESINGLERIDING, krb.CMERUNSPEED);

    public static void c() {
        oqb.c("MedalDeviceOld", " updateAllDeviceMedal ===> ");
        a.clear();
        Iterator<MedalAllListBean> it = MedalUploadSaveManager.r().s().iterator();
        while (it.hasNext()) {
            for (MedalListBean medalListBean : it.next().getMedalList()) {
                Iterator<String> it2 = b.iterator();
                while (it2.hasNext()) {
                    if (medalListBean.getCode().startsWith(it2.next())) {
                        a.add(medalListBean);
                    }
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.bk5
    public List<MedalListBean> a(String str) {
        c();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            oqb.c("MedalDeviceOld", " updateAllDeviceMedal ===> all device medal ");
            arrayList.addAll(a);
        } else {
            oqb.c("MedalDeviceOld", " updateAllDeviceMedal ===> for: ", str);
            for (MedalListBean medalListBean : a) {
                if ("obtained_medal".equals(str)) {
                    if (medalListBean.isGetRow() || medalListBean.getCode().startsWith(krb.CMEALLACT) || medalListBean.getCode().startsWith(krb.CMEDAYACT)) {
                        arrayList.add(medalListBean);
                    }
                } else if (medalListBean.getCode().contains(str)) {
                    arrayList.add(medalListBean);
                }
            }
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.bk5
    public List<MedalListBean> b(@NonNull List<MedalListBean> list) {
        oqb.c("MedalDeviceOld", " refreshMedalMsgToDevice ===> ", "obtained_medal");
        return a("obtained_medal");
    }
}
