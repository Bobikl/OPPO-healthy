package com.heytap.health.healthecg.util;

import android.text.TextUtils;
import com.github.mikephil.charting.data.Entry;
import com.google.gson.reflect.TypeToken;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.healthecg.bean.ECGUploadVerifyBean;
import com.heytap.health.healthecg.bean.ECGUser;
import com.heytap.health.healthecg.bean.ECGVerifyRecord;
import com.oplus.aiunit.vision.aa6;
import com.oplus.aiunit.vision.ka6;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.x05;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class ECGDataHelper {
    @NotNull
    public static ECGUploadVerifyBean a(UserInfo userInfo, ECGRecord eCGRecord, Object obj, Object obj2) {
        ECGUploadVerifyBean eCGUploadVerifyBean = new ECGUploadVerifyBean();
        ECGUser eCGUser = new ECGUser();
        eCGUser.setName(userInfo.getUserName());
        eCGUser.setAge(Integer.parseInt(x05.g("yyyy")) - Integer.parseInt(userInfo.getBirthday().substring(0, 4)));
        eCGUser.setDiseasesHis(obj);
        eCGUser.setHeight(Integer.parseInt(Objects.toString(userInfo.getHeight(), "0")) / 10);
        eCGUser.setWeight(Integer.parseInt(Objects.toString(userInfo.getWeight(), "0")) / 1000);
        eCGUser.setSex(!userInfo.getSex().equals("M") ? 1 : 0);
        eCGUser.setUid(userInfo.getUserId());
        eCGUser.setSymptom(obj2);
        eCGUser.setClientDataId(eCGRecord.getClientDataId());
        eCGUser.setOpenId(userInfo.getUserId());
        eCGUploadVerifyBean.setUser(eCGUser);
        eCGUploadVerifyBean.seteCGRecord(new ECGVerifyRecord(eCGRecord, b(eCGRecord)));
        eCGUploadVerifyBean.setOpenId(userInfo.getUserId());
        eCGUploadVerifyBean.setClientDataId(eCGRecord.getClientDataId());
        return eCGUploadVerifyBean;
    }

    public static double b(ECGRecord eCGRecord) {
        return eCGRecord.getDeviceVersion() == 1 ? 6.723908108108108E-4d : 0.2661d;
    }

    public static ArrayList<Entry> c(ECGRecord eCGRecord) {
        return d(eCGRecord, 1000.0f);
    }

    public static ArrayList<Entry> d(ECGRecord eCGRecord, float f) {
        Map map;
        if (!TextUtils.isEmpty(eCGRecord.getData()) && (map = (Map) sc8.b(eCGRecord.getData(), new TypeToken<Map<String, String>>() { // from class: com.heytap.health.healthecg.util.ECGDataHelper.1
        }.getType())) != null) {
            String str = (String) map.get("ecg");
            if (str == null || str.length() <= 0) {
                return new ArrayList<>();
            }
            ArrayList<Entry> arrayList = new ArrayList<>();
            String[] strArrSplit = str.split(",");
            int i = Integer.parseInt(strArrSplit[0]);
            float f2 = 0.0f;
            for (int i2 = i + 1; i2 < strArrSplit.length; i2 += i) {
                arrayList.add(new Entry(f2, Float.parseFloat(strArrSplit[i2])));
                f2 = (float) (((double) f2) + 0.004d);
            }
            ka6.b(arrayList, eCGRecord.getHand(), eCGRecord.getAvgHeartRate(), f, eCGRecord.getDeviceVersion());
            aa6.a("ECGDataHelper", "已解析一次心电数据");
            return arrayList;
        }
        return new ArrayList<>();
    }
}
