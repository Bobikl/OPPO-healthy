package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.Nullable;
import com.heytap.health.watch.calendar.bean.CalendarBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ot4 {
    public w3b a;
    public lof b;

    public boolean a() {
        return this.a.b();
    }

    public boolean b(CalendarBean calendarBean) {
        return this.a.c(calendarBean);
    }

    public final ArrayList<CalendarBean> c(HashMap<Integer, CalendarBean> map, HashMap<Integer, CalendarBean> map2) {
        ArrayList<CalendarBean> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, CalendarBean> entry : map.entrySet()) {
            if (!map2.containsKey(Integer.valueOf(entry.getKey().intValue()))) {
                CalendarBean value = entry.getValue();
                value.setOperateType(3);
                arrayList.add(value);
            }
        }
        for (Map.Entry<Integer, CalendarBean> entry2 : map2.entrySet()) {
            int iIntValue = entry2.getKey().intValue();
            if (map.containsKey(Integer.valueOf(iIntValue))) {
                CalendarBean calendarBean = map2.get(Integer.valueOf(iIntValue));
                CalendarBean calendarBean2 = map.get(Integer.valueOf(iIntValue));
                if (calendarBean == null || calendarBean2 == null) {
                    a7b.b("DataModel", "doGetHybridCalendarBeans remote or local is null");
                } else if (!calendarBean.equals(calendarBean2)) {
                    calendarBean.setWatchEventId(calendarBean2.getWatchEventId());
                    calendarBean.setOperateType(2);
                    arrayList.add(calendarBean);
                }
            } else {
                CalendarBean value2 = entry2.getValue();
                value2.setOperateType(1);
                arrayList.add(value2);
            }
        }
        return arrayList;
    }

    public Map<Integer, CalendarBean> d(ArrayList<CalendarBean> arrayList) {
        HashMap map = new HashMap();
        for (CalendarBean calendarBean : arrayList) {
            int eventId = calendarBean.getEventId();
            if (!map.containsKey(Integer.valueOf(eventId))) {
                map.put(Integer.valueOf(eventId), calendarBean);
            }
        }
        return map;
    }

    public ArrayList<CalendarBean> e(HashMap<Integer, CalendarBean> map, HashMap<Integer, CalendarBean> map2) {
        return c(map, map2);
    }

    @Nullable
    public ArrayList<CalendarBean> f() {
        return this.a.k();
    }

    public ArrayList<CalendarBean> g() {
        return this.b.g();
    }

    public void h(Context context) {
        w3b w3bVarF = w3b.f();
        this.a = w3bVarF;
        w3bVarF.h(context);
        lof lofVarD = lof.d();
        this.b = lofVarD;
        lofVarD.i(context);
    }

    public boolean i(CalendarBean calendarBean) {
        return this.a.i(calendarBean);
    }

    public boolean j(CalendarBean calendarBean) {
        return this.a.l(calendarBean);
    }
}
