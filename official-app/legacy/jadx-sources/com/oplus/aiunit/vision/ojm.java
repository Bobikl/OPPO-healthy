package com.oplus.aiunit.vision;

import android.content.Context;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.heytap.databaseengine.model.UserGoalInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ojm {
    public ArrayList<OfflineMapProvince> a = new ArrayList<>();
    public yjm b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f14969c;

    public ojm(Context context) {
        this.f14969c = context;
        this.b = yjm.b(context);
    }

    public static void f(OfflineMapCity offlineMapCity, OfflineMapCity offlineMapCity2) {
        offlineMapCity.setUrl(offlineMapCity2.getUrl());
        offlineMapCity.setVersion(offlineMapCity2.getVersion());
        offlineMapCity.setSize(offlineMapCity2.getSize());
        offlineMapCity.setCode(offlineMapCity2.getCode());
        offlineMapCity.setPinyin(offlineMapCity2.getPinyin());
        offlineMapCity.setJianpin(offlineMapCity2.getJianpin());
    }

    public static void g(OfflineMapProvince offlineMapProvince, OfflineMapProvince offlineMapProvince2) {
        offlineMapProvince.setUrl(offlineMapProvince2.getUrl());
        offlineMapProvince.setVersion(offlineMapProvince2.getVersion());
        offlineMapProvince.setSize(offlineMapProvince2.getSize());
        offlineMapProvince.setPinyin(offlineMapProvince2.getPinyin());
        offlineMapProvince.setJianpin(offlineMapProvince2.getJianpin());
    }

    public static boolean j(int i) {
        return i == 4;
    }

    public static boolean k(int i, int i2) {
        return i2 != 1 || i <= 2 || i >= 98;
    }

    public static boolean l(OfflineMapProvince offlineMapProvince) {
        if (offlineMapProvince == null) {
            return false;
        }
        Iterator<OfflineMapCity> it = offlineMapProvince.getCityList().iterator();
        while (it.hasNext()) {
            if (it.next().getState() != 4) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(int i) {
        return i == 0 || i == 2 || i == 3 || i == 1 || i == 102 || i == 101 || i == 103 || i == -1;
    }

    public final OfflineMapCity a(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.a) {
            Iterator<OfflineMapProvince> it = this.a.iterator();
            while (it.hasNext()) {
                for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                    if (offlineMapCity.getCode().equals(str)) {
                        return offlineMapCity;
                    }
                }
            }
            return null;
        }
    }

    public final ArrayList<OfflineMapProvince> b() {
        ArrayList<OfflineMapProvince> arrayList = new ArrayList<>();
        synchronized (this.a) {
            Iterator<OfflineMapProvince> it = this.a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final void c(com.amap.api.col.p0003sl.bb bbVar) {
        String pinyin = bbVar.getPinyin();
        synchronized (this.a) {
            loop0: for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince != null) {
                    for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                        if (offlineMapCity.getPinyin().trim().equals(pinyin.trim())) {
                            d(bbVar, offlineMapCity);
                            e(bbVar, offlineMapProvince);
                            break loop0;
                        }
                    }
                }
            }
        }
    }

    public final void d(com.amap.api.col.p0003sl.bb bbVar, OfflineMapCity offlineMapCity) {
        int iD = bbVar.c().d();
        if (bbVar.c().equals(bbVar.a)) {
            p(bbVar.t());
        } else {
            if (bbVar.c().equals(bbVar.f)) {
                bbVar.getCity();
                o(bbVar);
                bbVar.t().n();
            }
            if (k(bbVar.getcompleteCode(), bbVar.c().d())) {
                h(bbVar.t());
            }
        }
        offlineMapCity.setState(iD);
        offlineMapCity.setCompleteCode(bbVar.getcompleteCode());
    }

    public final void e(com.amap.api.col.p0003sl.bb bbVar, OfflineMapProvince offlineMapProvince) {
        tjm tjmVar;
        int iD = bbVar.c().d();
        if (iD == 6) {
            offlineMapProvince.setState(iD);
            offlineMapProvince.setCompleteCode(0);
            p(new tjm(offlineMapProvince, this.f14969c));
            try {
                ekm.k(offlineMapProvince.getProvinceCode(), this.f14969c);
                return;
            } catch (IOException e2) {
                e2.printStackTrace();
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                return;
            }
        }
        if (j(iD) && l(offlineMapProvince)) {
            if (bbVar.getPinyin().equals(offlineMapProvince.getPinyin())) {
                offlineMapProvince.setState(iD);
                offlineMapProvince.setCompleteCode(bbVar.getcompleteCode());
                offlineMapProvince.setVersion(bbVar.getVersion());
                offlineMapProvince.setUrl(bbVar.getUrl());
                tjmVar = new tjm(offlineMapProvince, this.f14969c);
                tjmVar.m(bbVar.a());
                tjmVar.d(bbVar.getCode());
            } else {
                offlineMapProvince.setState(iD);
                offlineMapProvince.setCompleteCode(100);
                tjmVar = new tjm(offlineMapProvince, this.f14969c);
            }
            tjmVar.n();
            h(tjmVar);
            tjmVar.a();
        }
    }

    public final void h(tjm tjmVar) {
        yjm yjmVar = this.b;
        if (yjmVar == null || tjmVar == null) {
            return;
        }
        yjmVar.e(tjmVar);
    }

    public final void i(List<OfflineMapProvince> list) {
        OfflineMapProvince next;
        OfflineMapCity next2;
        synchronized (this.a) {
            if (this.a.size() > 0) {
                for (int i = 0; i < this.a.size(); i++) {
                    OfflineMapProvince offlineMapProvince = this.a.get(i);
                    Iterator<OfflineMapProvince> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (offlineMapProvince.getPinyin().equals(next.getPinyin())) {
                            break;
                        }
                        if (offlineMapProvince.getPinyin().equals("quanguogaiyaotu") || offlineMapProvince.getProvinceCode().equals("000001") || offlineMapProvince.getProvinceCode().equals(UserGoalInfo.DEVICE_CONSUMPTION_GOAL_DEFAULT)) {
                            if (next.getPinyin().equals("quanguogaiyaotu")) {
                                break;
                            }
                        }
                    }
                    if (next != null) {
                        g(offlineMapProvince, next);
                        ArrayList<OfflineMapCity> cityList = offlineMapProvince.getCityList();
                        ArrayList<OfflineMapCity> cityList2 = next.getCityList();
                        for (int i2 = 0; i2 < cityList.size(); i2++) {
                            OfflineMapCity offlineMapCity = cityList.get(i2);
                            Iterator<OfflineMapCity> it2 = cityList2.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!offlineMapCity.getPinyin().equals(next2.getPinyin()));
                            if (next2 != null) {
                                f(offlineMapCity, next2);
                            }
                        }
                    }
                }
            } else {
                Iterator<OfflineMapProvince> it3 = list.iterator();
                while (it3.hasNext()) {
                    this.a.add(it3.next());
                }
            }
        }
    }

    public final OfflineMapCity m(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.a) {
            Iterator<OfflineMapProvince> it = this.a.iterator();
            while (it.hasNext()) {
                for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                    if (offlineMapCity.getCity().trim().equalsIgnoreCase(str.trim())) {
                        return offlineMapCity;
                    }
                }
            }
            return null;
        }
    }

    public final ArrayList<OfflineMapCity> n() {
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        synchronized (this.a) {
            Iterator<OfflineMapProvince> it = this.a.iterator();
            while (it.hasNext()) {
                Iterator<OfflineMapCity> it2 = it.next().getCityList().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
        }
        return arrayList;
    }

    public final void o(com.amap.api.col.p0003sl.bb bbVar) {
        File[] fileArrListFiles = new File(xsm.h0(this.f14969c)).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile() && file.exists() && file.getName().contains(bbVar.getAdcode()) && file.getName().endsWith(".zip.tmp.dt")) {
                file.delete();
            }
        }
    }

    public final void p(tjm tjmVar) {
        yjm yjmVar = this.b;
        if (yjmVar != null) {
            yjmVar.k(tjmVar);
        }
    }

    public final OfflineMapProvince r(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this.a) {
            for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince.getProvinceName().trim().equalsIgnoreCase(str.trim())) {
                    return offlineMapProvince;
                }
            }
            return null;
        }
    }

    public final ArrayList<OfflineMapCity> s() {
        ArrayList<OfflineMapCity> arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince != null) {
                    for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                        if (offlineMapCity.getState() == 4 || offlineMapCity.getState() == 7) {
                            arrayList.add(offlineMapCity);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapProvince> t() {
        ArrayList<OfflineMapProvince> arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince != null && (offlineMapProvince.getState() == 4 || offlineMapProvince.getState() == 7)) {
                    arrayList.add(offlineMapProvince);
                }
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapCity> u() {
        ArrayList<OfflineMapCity> arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince != null) {
                    for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                        if (q(offlineMapCity.getState())) {
                            arrayList.add(offlineMapCity);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList<OfflineMapProvince> v() {
        ArrayList<OfflineMapProvince> arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList<>();
            for (OfflineMapProvince offlineMapProvince : this.a) {
                if (offlineMapProvince != null && q(offlineMapProvince.getState())) {
                    arrayList.add(offlineMapProvince);
                }
            }
        }
        return arrayList;
    }

    public final void w() {
        x();
        this.b = null;
        this.f14969c = null;
    }

    public final void x() {
        ArrayList<OfflineMapProvince> arrayList = this.a;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.a.clear();
            }
        }
    }
}
