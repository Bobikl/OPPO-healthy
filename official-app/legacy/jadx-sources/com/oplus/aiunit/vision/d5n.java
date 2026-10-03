package com.oplus.aiunit.vision;

import com.heytap.store.base.widget.banner.config.BannerConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class d5n {
    public j6n b;
    public List<k6n> a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<k6n> f10398c = new ArrayList<>();

    public class a implements Comparator<k6n> {
        public a() {
        }

        public static int a(k6n k6nVar, k6n k6nVar2) {
            return k6nVar2.f13176c - k6nVar.f13176c;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(k6n k6nVar, k6n k6nVar2) {
            return a(k6nVar, k6nVar2);
        }
    }

    public static List<k6n> b(List<k6n> list) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            k6n k6nVar = list.get(i);
            map.put(Integer.valueOf(k6nVar.f13176c), k6nVar);
        }
        arrayList.addAll(map.values());
        return arrayList;
    }

    public static boolean d(j6n j6nVar, long j2, long j3) {
        return j2 > 0 && j3 - j2 < ((long) ((j6nVar.g > 10.0f ? 1 : (j6nVar.g == 10.0f ? 0 : -1)) >= 0 ? 2000 : BannerConfig.LOOP_TIME));
    }

    public static boolean e(List<k6n> list, List<k6n> list2) {
        if (list != null && list2 != null) {
            int size = list.size();
            int size2 = list2.size();
            int i = size + size2;
            if (size <= size2) {
                list2 = list;
                list = list2;
            }
            HashMap map = new HashMap(list.size());
            Iterator<k6n> it = list.iterator();
            while (it.hasNext()) {
                map.put(Long.valueOf(it.next().a), 1);
            }
            Iterator<k6n> it2 = list2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (((Integer) map.get(Long.valueOf(it2.next().a))) != null) {
                    i2++;
                }
            }
            if (((double) i2) * 2.0d >= ((double) i) * 0.5d) {
                return true;
            }
        }
        return false;
    }

    public final List<k6n> a(j6n j6nVar, List<k6n> list, boolean z, long j2, long j3) {
        if (!h(j6nVar, list, z, j2, j3)) {
            return null;
        }
        g(this.f10398c, list);
        this.a.clear();
        this.a.addAll(list);
        this.b = j6nVar;
        return this.f10398c;
    }

    public final boolean c(j6n j6nVar) {
        float f = j6nVar.g;
        float f2 = 10.0f;
        if (f > 10.0f) {
            f2 = 200.0f;
        } else if (f > 2.0f) {
            f2 = 50.0f;
        }
        return j6nVar.a(this.b) > ((double) f2);
    }

    public final List<k6n> f(List<k6n> list) {
        Collections.sort(list, new a());
        return list;
    }

    public final void g(List<k6n> list, List<k6n> list2) {
        list.clear();
        if (list2 != null) {
            List<k6n> listF = f(b(list2));
            int size = listF.size();
            if (size > 40) {
                size = 40;
            }
            for (int i = 0; i < size; i++) {
                list.add(listF.get(i));
            }
        }
    }

    public final boolean h(j6n j6nVar, List<k6n> list, boolean z, long j2, long j3) {
        if (!z || !d(j6nVar, j2, j3) || list == null || list.size() <= 0) {
            return false;
        }
        if (this.b == null) {
            return true;
        }
        boolean zC = c(j6nVar);
        return !zC ? true ^ e(list, this.a) : zC;
    }
}
