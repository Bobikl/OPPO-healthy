package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.protocol.workout.WorkoutProto$SportsDataItem;
import com.heytap.health.protocol.workout.WorkoutProto$SportsDataItemList;
import com.heytap.health.settings.watch.sporthealthsettings.activity.customize.bean.CustomizeBean;
import com.heytap.health.settings.watch.sporthealthsettings.activity.customize.bean.CustomizeDataBean;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class oh4 {
    public static final String TAG = "CustomizeDataUtil";
    public static final int TYPE_NOT_CUSTOMIZE = -1;

    public class a extends ao0<Map<Integer, String>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f14938j;

        public a(MutableLiveData mutableLiveData) {
            this.f14938j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Map<Integer, String> map) {
            this.f14938j.postValue(map);
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            StringBuilder sb = new StringBuilder();
            sb.append("getRemainingData-->error:");
            sb.append(th.getMessage());
        }
    }

    public static void c(Map<Integer, String> map, Map<Integer, String> map2, int i, String str) {
        if (map2 == null || map2.isEmpty() || map2.containsKey(Integer.valueOf(i))) {
            if (map2 != null && !map2.isEmpty()) {
                String str2 = map2.get(Integer.valueOf(i));
                if (!TextUtils.isEmpty(str2)) {
                    str = str2;
                }
            }
            map.put(Integer.valueOf(i), str);
        }
    }

    public static List<CustomizeDataBean> d(List<CustomizeDataBean> list, Integer num, Map<Integer, String> map) {
        Map<Integer, String> mapF = f(num.intValue(), map);
        StringBuilder sb = new StringBuilder();
        sb.append("filterData-->initdata:");
        sb.append(list.toString());
        CustomizeDataBean customizeDataBean = new CustomizeDataBean("", 0);
        ArrayList arrayList = new ArrayList();
        for (Integer num2 : mapF.keySet()) {
            customizeDataBean.setType(num2.intValue());
            String str = mapF.get(num2);
            if (list.contains(customizeDataBean)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("filterData-->contains:");
                sb2.append(str);
                sb2.append(" type:");
                sb2.append(num2);
            } else {
                arrayList.add(new CustomizeDataBean(str, num2.intValue()));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("filterData-->add:");
                sb3.append(str);
                sb3.append(" type:");
                sb3.append(num2);
            }
        }
        return arrayList;
    }

    public static Map<Integer, String> e(int i) {
        return f(i, lh4.c());
    }

    public static Map<Integer, String> f(int i, Map<Integer, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c(linkedHashMap, map, 2, BaseApplication.a().getString(R$string.settings_customize_sport_data_time));
        c(linkedHashMap, map, 3, BaseApplication.a().getString(R$string.settings_customize_sport_data_rate));
        c(linkedHashMap, map, 4, BaseApplication.a().getString(R$string.settings_customize_sport_record_cal));
        if (i == 1003) {
            return linkedHashMap;
        }
        c(linkedHashMap, map, 5, BaseApplication.a().getString(R$string.settings_customize_sport_record_distance));
        c(linkedHashMap, map, 6, BaseApplication.a().getString(R$string.settings_customize_sport_data_pace));
        c(linkedHashMap, map, 7, BaseApplication.a().getString(R$string.settings_customize_sport_record_avg_speed));
        c(linkedHashMap, map, 9, BaseApplication.a().getString(R$string.settings_customize_sport_record_step_num));
        c(linkedHashMap, map, 10, BaseApplication.a().getString(R$string.settings_customize_sport_data_frequency));
        c(linkedHashMap, map, 11, BaseApplication.a().getString(R$string.settings_customize_sport_record_frequency));
        c(linkedHashMap, map, 14, BaseApplication.a().getString(R$string.settings_customize_sport_data_speed_hour));
        if (i == 1002) {
            return linkedHashMap;
        }
        c(linkedHashMap, map, 12, BaseApplication.a().getString(R$string.settings_customize_sport_data_altitude));
        c(linkedHashMap, map, 13, BaseApplication.a().getString(R$string.settings_customize_sport_record_step_height));
        if (i == -1) {
            c(linkedHashMap, map, 8, BaseApplication.a().getString(R$string.settings_customize_sport_record_ride_avg_speed));
            c(linkedHashMap, map, 15, BaseApplication.a().getString(R$string.settings_customize_sport_data_swimming_pace));
            c(linkedHashMap, map, 16, BaseApplication.a().getString(R$string.settings_customize_sport_data_number_swims));
            c(linkedHashMap, map, 17, BaseApplication.a().getString(R$string.settings_customize_sport_data_strokes));
            c(linkedHashMap, map, 19, BaseApplication.a().getString(R$string.settings_customize_sport_data_times));
            c(linkedHashMap, map, 20, BaseApplication.a().getString(R$string.settings_customize_sport_data_speed));
            c(linkedHashMap, map, 21, BaseApplication.a().getString(R$string.settings_customize_sport_data_skiing_distance));
            c(linkedHashMap, map, 22, BaseApplication.a().getString(R$string.settings_customize_sport_data_skiing_max_speed));
            c(linkedHashMap, map, 23, BaseApplication.a().getString(R$string.settings_customize_sport_data_skiing_trips));
            c(linkedHashMap, map, 24, BaseApplication.a().getString(R$string.settings_customize_sport_data_skiing_total_duration));
            c(linkedHashMap, map, 25, BaseApplication.a().getString(R$string.settings_customize_sport_data_skiing_duration));
            c(linkedHashMap, map, 26, BaseApplication.a().getString(R$string.settings_customize_sport_data_skiing_cumulative_decline));
            c(linkedHashMap, map, 27, BaseApplication.a().getString(R$string.settings_customize_sport_data_skiing_maximum_slope));
        }
        return linkedHashMap;
    }

    public static LiveData<Map<Integer, String>> g() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        if (lh4.h()) {
            zq0.w().T(new MessageEvent(4, sgi.a(gl4.managerApi.getCurrActiveMac()).g1() ? 63 : 16, null), new m6c() { // from class: com.oplus.aiunit.vision.mh4
                @Override // com.oplus.aiunit.vision.m6c
                public final void f(m6c.a aVar) {
                    oh4.o(mutableLiveData, aVar);
                }
            });
        } else {
            mutableLiveData.postValue(lh4.c());
        }
        return mutableLiveData;
    }

    public static List<Integer> h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1001);
        arrayList.add(1002);
        arrayList.add(1003);
        return arrayList;
    }

    public static String[] i() {
        List<Integer> listH = h();
        String[] strArr = new String[listH.size()];
        Iterator<Integer> it = listH.iterator();
        int i = 0;
        while (it.hasNext()) {
            String strL = l(it.next());
            if (!TextUtils.isEmpty(strL)) {
                strArr[i] = strL;
                i++;
            }
        }
        return strArr;
    }

    public static CustomizeBean j(int i, String str) {
        Integer[] numArr;
        CustomizeBean customizeBean = new CustomizeBean(1);
        if (i == 1003) {
            numArr = new Integer[]{2, 3, 4};
        } else {
            numArr = ((Boolean) lc5.d(str).a(new z3c())).booleanValue() ? new Integer[]{2, 3, 4, 5} : new Integer[]{2, 3, 4, 5, 6};
        }
        customizeBean.setCustomizeDataBeans(new ArrayList(q(true, i, numArr)));
        return customizeBean;
    }

    public static int k(int i) {
        return i == 1003 ? 3 : 5;
    }

    public static String l(Integer num) {
        switch (num.intValue()) {
            case 1001:
                return BaseApplication.a().getString(R$string.settings_customize_sport_father_type_outdoor);
            case 1002:
                return BaseApplication.a().getString(R$string.settings_customize_sport_indoor_sport);
            case 1003:
                return BaseApplication.a().getString(R$string.settings_customize_sport_father_type_water);
            default:
                return null;
        }
    }

    public static boolean m(String str) {
        return "-1".equals(str);
    }

    public static /* synthetic */ void n(m6c.a aVar, ccd ccdVar) throws Throwable {
        MessageEvent messageEventE = aVar.e();
        HashMap map = new HashMap();
        if (messageEventE != null) {
            for (WorkoutProto$SportsDataItem workoutProto$SportsDataItem : WorkoutProto$SportsDataItemList.parseFrom(messageEventE.getData()).getItemList()) {
                map.put(Integer.valueOf(workoutProto$SportsDataItem.getType()), workoutProto$SportsDataItem.getName());
            }
            lh4.d(map);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getRemainingData-->");
        sb.append(map.toString());
        ccdVar.onNext(map);
        ccdVar.onComplete();
    }

    public static /* synthetic */ void o(MutableLiveData mutableLiveData, final m6c.a aVar) {
        lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.nh4
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                oh4.n(aVar, ccdVar);
            }
        }).L0(su8.c()).subscribe(new a(mutableLiveData));
    }

    public static List<CustomizeDataBean> p(List<CustomizeDataBean> list, List<CustomizeDataBean> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (CustomizeDataBean customizeDataBean : list2) {
            customizeDataBean.setAdd(list.contains(customizeDataBean));
            if (!list.contains(customizeDataBean) && !customizeDataBean.isTipType()) {
                customizeDataBean.setAdd(false);
                arrayList.add(customizeDataBean);
            }
        }
        list2.clear();
        list2.addAll(arrayList);
        return list2;
    }

    public static List<CustomizeDataBean> q(boolean z, int i, Integer... numArr) {
        ArrayList arrayList = new ArrayList();
        Map<Integer, String> mapE = e(i);
        ArrayList arrayList2 = new ArrayList(Arrays.asList(numArr));
        for (Integer num : mapE.keySet()) {
            if (arrayList2.contains(num)) {
                arrayList.add(new CustomizeDataBean(mapE.get(num), num.intValue(), z));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("specifyData-->");
        sb.append(arrayList);
        return arrayList;
    }
}
