package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.operation.medal.MedalUploadSaveManager;
import com.heytap.health.operation.medal.bean.MedalAllListBean;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class cqb implements bk5 {
    @Override // com.oplus.aiunit.vision.bk5
    public List<MedalListBean> a(String str) {
        List<MedalAllListBean> listS = MedalUploadSaveManager.r().s();
        ArrayList arrayList = new ArrayList();
        oqb.c("DeviceMedalManager", " updateAllDeviceMedal ===> for: ", str);
        Iterator<MedalAllListBean> it = listS.iterator();
        while (it.hasNext()) {
            for (MedalListBean medalListBean : it.next().getMedalList()) {
                if (TextUtils.isEmpty(str)) {
                    arrayList.add(medalListBean);
                } else if ("obtained_medal".equals(str)) {
                    if (medalListBean.isGet()) {
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
    public List<MedalListBean> b(List<MedalListBean> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        oqb.c("DeviceMedalManager", " refreshMedalMsgToDevice ===> ", list);
        return list;
    }
}
