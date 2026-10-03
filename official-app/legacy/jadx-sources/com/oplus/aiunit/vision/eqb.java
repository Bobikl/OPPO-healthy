package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class eqb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eqb f11017c = new eqb();
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Map<String, a> b = new HashMap();

    public static final class a {
        public final long a;
        public final List<MedalListBean> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f11018c;
        public String d;

        public a(long j2) {
            this.a = j2;
        }
    }

    public static eqb e() {
        return f11017c;
    }

    public final List<MedalListBean> b(List<MedalListBean> list) {
        MedalListBean medalListBean;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MedalListBean medalListBean2 : list) {
            if (medalListBean2 != null && !TextUtils.isEmpty(medalListBean2.getCode()) && ((medalListBean = (MedalListBean) linkedHashMap.get(medalListBean2.getCode())) == null || medalListBean2.getAcquisitionDate() >= medalListBean.getAcquisitionDate())) {
                linkedHashMap.put(medalListBean2.getCode(), medalListBean2);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        arrayList.sort(Comparator.comparingLong(new tod()));
        return arrayList;
    }

    public synchronized void c(String str, String str2, List<MedalListBean> list) {
        if (list != null) {
            if (!list.isEmpty() && !TextUtils.isEmpty(str)) {
                a aVar = this.b.get(str);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (aVar == null) {
                    aVar = new a(jCurrentTimeMillis);
                    this.b.put(str, aVar);
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = aVar.d;
                }
                aVar.d = str2;
                aVar.b.addAll(list);
                long j2 = jCurrentTimeMillis - aVar.a;
                oqb.a("StatusProcess:MedalDispatchCenter", "enqueue medals size=" + list.size() + ", all=" + aVar.b.size() + ", elapsed=" + j2 + ", clientDataId=" + aVar.d);
                g(str, aVar, j2 >= 5000 ? 0L : 1500L);
            }
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized void f(String str) {
        a aVarRemove = this.b.remove(str);
        if (aVarRemove != null && !aVarRemove.b.isEmpty()) {
            List<MedalListBean> listB = b(aVarRemove.b);
            oqb.a("StatusProcess:MedalDispatchCenter", "flush medals size=" + listB.size() + ", clientDataId=" + aVarRemove.d);
            new noi(aVarRemove.d).v(listB);
        }
    }

    public final void g(final String str, a aVar, long j2) {
        Runnable runnable = aVar.f11018c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.oplus.aiunit.vision.dqb
            @Override // java.lang.Runnable
            public final void run() {
                this.i.f(str);
            }
        };
        aVar.f11018c = runnable2;
        this.a.postDelayed(runnable2, j2);
    }
}
