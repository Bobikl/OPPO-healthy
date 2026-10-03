package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.health.device_data_sync.data_sync.SleepCalibrationItem;
import com.heytap.health.device_data_sync.data_sync.SleepFixDataItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class vah {
    public final String a = "SleepCalibrationTransform";

    public List<SleepCalibrationItem> a(SleepDataStat sleepDataStat) {
        if (TextUtils.isEmpty(sleepDataStat.getMetadata())) {
            return new ArrayList();
        }
        try {
            JSONObject jSONObject = new JSONObject(sleepDataStat.getMetadata());
            if (!jSONObject.has(SleepDataStat.SLEEP_CALIBRATION_RESULT_SENT)) {
                return new ArrayList();
            }
            String strOptString = jSONObject.optString(SleepDataStat.SLEEP_CALIBRATION_RESULT_SENT);
            if (!TextUtils.isEmpty(strOptString) && strOptString.length() >= 2) {
                int i = Integer.parseInt(strOptString.substring(0, 1));
                a7b.f("SleepCalibrationTransform", "analyzeSleepCalibration used:" + i);
                if (i != 1) {
                    return new ArrayList();
                }
                List<SleepCalibrationItem> listD = sc8.d(strOptString.substring(2), SleepCalibrationItem.class);
                if (hz.b(listD)) {
                    return new ArrayList();
                }
                Iterator<SleepCalibrationItem> it = listD.iterator();
                while (it.hasNext()) {
                    a7b.f("SleepCalibrationTransform", "sleepCalibration Item:" + it.next().toString());
                }
                return listD;
            }
            return new ArrayList();
        } catch (Exception e2) {
            a7b.c("SleepCalibrationTransform", "exception: ", e2);
            return new ArrayList();
        }
    }

    public List<SleepFixDataItem> b(SleepDataStat sleepDataStat) {
        if (TextUtils.isEmpty(sleepDataStat.getMetadata())) {
            return new ArrayList();
        }
        try {
            JSONObject jSONObject = new JSONObject(sleepDataStat.getMetadata());
            if (!jSONObject.has(SleepDataStat.SLEEP_CHECK_RESULT_SENT)) {
                return new ArrayList();
            }
            String strOptString = jSONObject.optString(SleepDataStat.SLEEP_CHECK_RESULT_SENT);
            if (!TextUtils.isEmpty(strOptString) && strOptString.length() >= 2) {
                List<SleepFixDataItem> listD = sc8.d(strOptString.substring(2), SleepFixDataItem.class);
                if (hz.b(listD)) {
                    return new ArrayList();
                }
                int i = 0;
                int iOptInt = jSONObject.has(SleepDataStat.SLEEP_CHECK_RESULT_DEVICE_USED) ? jSONObject.optInt(SleepDataStat.SLEEP_CHECK_RESULT_DEVICE_USED) : 0;
                ListIterator<SleepFixDataItem> listIterator = listD.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.next();
                    if (((1 << i) & iOptInt) == 0) {
                        listIterator.remove();
                    }
                    i++;
                }
                Iterator<SleepFixDataItem> it = listD.iterator();
                while (it.hasNext()) {
                    a7b.f("SleepCalibrationTransform", "fixDataItems:" + it.next().toString());
                }
                return listD;
            }
            return new ArrayList();
        } catch (Exception e2) {
            a7b.c("SleepCalibrationTransform", "exception: ", e2);
            return new ArrayList();
        }
    }

    public oah c(long j2, long j3, List<SleepDataStat> list) {
        ArrayList<List> arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList();
        for (SleepDataStat sleepDataStat : list) {
            arrayList.add(b(sleepDataStat));
            arrayList2.add(a(sleepDataStat));
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        while (j2 < j3) {
            int i = v05.i(v05.o(j2));
            StringBuilder sb = new StringBuilder();
            sb.append("date:");
            sb.append(i);
            map.put(String.valueOf(i), new ArrayList());
            map2.put(String.valueOf(i), new ArrayList());
            j2 += 86400000;
        }
        for (List list2 : arrayList) {
            if (!list2.isEmpty()) {
                int i2 = v05.i(v05.o(((long) ((SleepFixDataItem) list2.get(0)).getSleepInTime()) * 1000));
                map.put(String.valueOf(i2), list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    a7b.f("SleepCalibrationTransform", "build fix itemDate:" + i2 + "/" + ((SleepFixDataItem) it.next()).toString());
                }
            }
        }
        for (List list3 : arrayList2) {
            if (!list3.isEmpty()) {
                int i3 = v05.i(v05.o(((long) ((SleepCalibrationItem) list3.get(0)).getStartTimestamp()) * 1000));
                map2.put(String.valueOf(i3), list3);
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    a7b.f("SleepCalibrationTransform", "build fix calibration:" + i3 + "/" + ((SleepCalibrationItem) it2.next()).toString());
                }
            }
        }
        oah oahVar = new oah();
        oahVar.d(map);
        oahVar.c(map2);
        return oahVar;
    }
}
