package com.heytap.health.monitor.storage;

import android.content.Context;
import android.os.Debug;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.base.sp.MultiProgressDataStoreRepository;
import com.heytap.health.monitor.MemInfo;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ax7;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.u05;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class HeadSizeDataStore {
    public final Context a;
    public final MultiProgressDataStoreRepository b;

    public HeadSizeDataStore(Context context) {
        String str = "monitor_data_" + gxe.c();
        this.a = context;
        this.b = MultiProgressDataStoreRepository.INSTANCE.a(context, str);
        a7b.f("HeadSizeDataStore", "HeadSizeDataStore spName is " + str);
    }

    public List<MemInfo> a() {
        return d("PSS_AVERAGE_ALL");
    }

    public List<MemInfo> b() {
        return d("PSS_AVERAGE_BG");
    }

    public List<MemInfo> c() {
        return d("PSS_AVERAGE_FG");
    }

    public final List<MemInfo> d(String str) {
        String strValueOf = String.valueOf(u05.a());
        ArrayList arrayList = new ArrayList();
        Gson gson = new Gson();
        List<String> list = (List) gson.fromJson(this.b.t("key_save_days"), new TypeToken<ArrayList<String>>() { // from class: com.heytap.health.monitor.storage.HeadSizeDataStore.2
        }.getType());
        if (list != null) {
            for (String str2 : list) {
                if (!Objects.equals(str2, strValueOf)) {
                    try {
                        arrayList.add((MemInfo) gson.fromJson(this.b.t(str2 + str), MemInfo.class));
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    public List<MemInfo> e() {
        return d("PSS_MAX_ALL");
    }

    public List<MemInfo> f() {
        return d("PSS_MAX_BG");
    }

    public List<MemInfo> g() {
        return d("PSS_MAX_FG");
    }

    public void h(String str) {
        Gson gson = new Gson();
        List list = (List) gson.fromJson(this.b.t("key_save_days"), new TypeToken<ArrayList<String>>() { // from class: com.heytap.health.monitor.storage.HeadSizeDataStore.3
        }.getType());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Objects.equals((String) it.next(), str)) {
                it.remove();
                break;
            }
        }
        this.b.D("key_save_days", gson.toJson(list));
        i(str, "PSS_MAX", "_ALL");
        i(str, "PSS_MAX", "_BG");
        i(str, "PSS_MAX", "_FG");
        i(str, "PSS_AVERAGE", "_ALL");
        i(str, "PSS_AVERAGE", "_BG");
        i(str, "PSS_AVERAGE", "_FG");
        i(str, "AVERAGE_TIMES", "_ALL");
        i(str, "AVERAGE_TIMES", "_BG");
        i(str, "AVERAGE_TIMES", "_FG");
    }

    public final void i(String str, String str2, String str3) {
        this.b.E(str + str2 + str3);
    }

    public void j(Debug.MemoryInfo memoryInfo) {
        String strValueOf = String.valueOf(u05.a());
        MemInfo memInfoWith = MemInfo.with(memoryInfo);
        memInfoWith.day = strValueOf;
        memInfoWith.time = System.currentTimeMillis();
        memInfoWith.foreground = ax7.j().l();
        l(memInfoWith);
        if (memInfoWith.foreground) {
            n(memInfoWith);
        } else {
            m(memInfoWith);
        }
    }

    public final void k(MemInfo memInfo, String str) {
        String strValueOf = String.valueOf(u05.a());
        Gson gson = new Gson();
        String json = gson.toJson(memInfo);
        String str2 = strValueOf + "PSS_MAX" + str;
        String str3 = strValueOf + "AVERAGE_TIMES" + str;
        String str4 = strValueOf + "PSS_AVERAGE" + str;
        String strT = this.b.t(str2);
        if (TextUtils.isEmpty(strT)) {
            this.b.D(str2, json);
        } else {
            MemInfo memInfo2 = (MemInfo) gson.fromJson(strT, MemInfo.class);
            memInfo2.day = strValueOf;
            if (memInfo2.totalPss < memInfo.totalPss) {
                this.b.D(str2, json);
            }
        }
        int iO = this.b.o(str3, 0);
        int i = iO + 1;
        this.b.A(str3, i);
        List list = (List) gson.fromJson(this.b.t("key_save_days"), new TypeToken<ArrayList<String>>() { // from class: com.heytap.health.monitor.storage.HeadSizeDataStore.1
        }.getType());
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (!arrayList.contains(strValueOf)) {
            arrayList.add(strValueOf);
        }
        String json2 = gson.toJson(arrayList);
        this.b.D("key_save_days", json2);
        StringBuilder sb = new StringBuilder();
        sb.append("suffix is ");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append(", today_max is ");
        sb.append(strT);
        sb.append(", times is ");
        sb.append(iO);
        sb.append(",SAVE_DAYS | ");
        sb.append(json2);
        if (iO <= 0) {
            this.b.D(str4, json);
            return;
        }
        MemInfo memInfo3 = (MemInfo) gson.fromJson(this.b.t(str4), MemInfo.class);
        if (memInfo3 == null) {
            this.b.E(str3);
            a7b.b("HeadSizeDataStore", "saveMeminfo keyTimes error , keyTimes is " + str3);
            return;
        }
        MemInfo memInfo4 = new MemInfo();
        memInfo4.foreground = ax7.j().l();
        memInfo.time = System.currentTimeMillis();
        memInfo4.day = strValueOf;
        memInfo4.totalPss = ((memInfo3.totalPss * iO) + memInfo.totalPss) / i;
        memInfo4.dalvikPss = ((memInfo3.dalvikPss * iO) + memInfo.dalvikPss) / i;
        memInfo4.nativePss = ((memInfo3.nativePss * iO) + memInfo.nativePss) / i;
        memInfo4.otherPss = ((memInfo3.otherPss * iO) + memInfo.otherPss) / i;
        String json3 = gson.toJson(memInfo4);
        this.b.D(str4, json3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strValueOf);
        sb2.append(" averageJson ");
        sb2.append(json3);
    }

    public final void l(MemInfo memInfo) {
        try {
            k(memInfo, "_ALL");
        } catch (Exception e2) {
            a7b.c("HeadSizeDataStore", "saveMeminfoAll", e2);
        }
    }

    public final void m(MemInfo memInfo) {
        try {
            k(memInfo, "_BG");
        } catch (Exception e2) {
            a7b.c("HeadSizeDataStore", "saveMeminfoBG", e2);
        }
    }

    public final void n(MemInfo memInfo) {
        try {
            k(memInfo, "_FG");
        } catch (Exception e2) {
            a7b.c("HeadSizeDataStore", "saveMeminfoFG", e2);
        }
    }
}
