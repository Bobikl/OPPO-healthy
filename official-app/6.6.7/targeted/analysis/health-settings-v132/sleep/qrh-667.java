package com.oplus.aiunit.model;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.device.sleep.ISleepDataService;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.watch.sporthealthsettings2.SleepSettingEntity;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qr0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
public class qrh {
    public static Map<String, qrh> mManagerMap = new HashMap();
    public final String g;
    public String h;
    public final CopyOnWriteArrayList<gz9> b = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<ez9> c = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<fz9> d = new CopyOnWriteArrayList<>();
    public final SleepSettingEntity e = new SleepSettingEntity();
    public final List<SportHealthSetting> f = new ArrayList();
    public boolean i = false;
    public final irh a = new irh();

    public qrh(String str) {
        this.g = str;
    }

    public static qrh m(String str) {
        qrh qrhVar = mManagerMap.get(str);
        if (qrhVar != null) {
            return qrhVar;
        }
        qrh qrhVar2 = new qrh(str);
        mManagerMap.put(str, qrhVar2);
        return qrhVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(dz9 dz9Var, SportHealthSetting sportHealthSetting, int i) {
        B(SportHealthSetting.USER_REST_NEW, i);
        dz9Var.a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(SportHealthSetting sportHealthSetting, CountDownLatch countDownLatch, Map map, AtomicInteger atomicInteger, SportHealthSetting sportHealthSetting2, gz9 gz9Var, Boolean bool) throws Throwable {
        synchronized (this.e) {
            m8b.f("Sleep-Setting", "Change DB device setting Success, Save to db type=" + sportHealthSetting.name() + ", result=" + bool);
            countDownLatch.countDown();
            if (bool.booleanValue()) {
                this.e.d(sportHealthSetting, (String) map.get(sportHealthSetting));
            } else {
                atomicInteger.addAndGet(1);
            }
            int i = 0;
            B(sportHealthSetting2, 0);
            if (countDownLatch.getCount() == 0) {
                if (!bool.booleanValue() || atomicInteger.get() != 0) {
                    i = 2;
                }
                gz9Var.g(sportHealthSetting2, i);
                ISleepDataService iSleepDataService = (ISleepDataService) e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
                if (iSleepDataService != null) {
                    iSleepDataService.g5(sportHealthSetting, "com.heytap.health.ACTION_SLEEP_SETTING_CHANGED");
                    iSleepDataService.s4(sportHealthSetting);
                }
            }
        }
    }

    public static /* synthetic */ void u(AtomicInteger atomicInteger, CountDownLatch countDownLatch, gz9 gz9Var, SportHealthSetting sportHealthSetting, Throwable th) throws Throwable {
        m8b.f("Sleep-Setting", "Change Sleep setting success, save to db fail=" + th);
        atomicInteger.addAndGet(1);
        countDownLatch.countDown();
        if (countDownLatch.getCount() == 0) {
            gz9Var.g(sportHealthSetting, 2);
        }
    }

    public static /* synthetic */ void v(SportHealthSetting sportHealthSetting, Integer num) {
        m8b.f("Sleep-Setting", "changeSleepSetting2Devices type=" + sportHealthSetting.name() + ", result =" + num);
    }

    public void A() {
        new ArrayList(this.d).forEach(new Consumer() { // from class: com.oplus.aiunit.vision.prh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((fz9) obj).onLoadComplete();
            }
        });
    }

    public void B(SportHealthSetting sportHealthSetting, int i) {
        Iterator<gz9> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().g(sportHealthSetting, i);
        }
    }

    @SuppressLint({"CheckResult"})
    public void C(final SportHealthSetting sportHealthSetting, final Map<SportHealthSetting, String> map, @NonNull final gz9 gz9Var) {
        Map<SportHealthSetting, String> map2 = map;
        final CountDownLatch countDownLatch = new CountDownLatch(map.size());
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        m8b.f("Sleep-Setting", "data size = " + map.size() + "," + map2.get(sportHealthSetting));
        for (final SportHealthSetting sportHealthSetting2 : map.keySet()) {
            m8b.f("Sleep-Setting", " start save =" + map2.get(sportHealthSetting2));
            this.a.k(sportHealthSetting2, map2.get(sportHealthSetting2)).b(new b24() { // from class: com.oplus.aiunit.vision.lrh
                public final void accept(Object obj) throws Throwable {
                    this.i.t(sportHealthSetting, countDownLatch, map, atomicInteger, sportHealthSetting2, gz9Var, (Boolean) obj);
                }
            }, new b24() { // from class: com.oplus.aiunit.vision.mrh
                public final void accept(Object obj) throws Throwable {
                    qrh.u(atomicInteger, countDownLatch, gz9Var, sportHealthSetting2, (Throwable) obj);
                }
            });
            map2 = map;
        }
    }

    public void D(ez9 ez9Var) {
        this.c.remove(ez9Var);
    }

    public void E(fz9 fz9Var) {
        this.d.remove(fz9Var);
    }

    public void F(gz9 gz9Var) {
        m8b.f("Sleep-Setting", "removeSettingChangedListener" + gz9Var.toString());
        this.b.remove(gz9Var);
    }

    public void G(final SportHealthSetting sportHealthSetting, Map<SportHealthSetting, String> map) {
        m8b.f("Sleep-Setting", "sendDataToDevices data type =  " + sportHealthSetting.name());
        if (q()) {
            drh.b(o(), sportHealthSetting, map, new ln3() { // from class: com.oplus.aiunit.vision.krh
                public final void onResult(Object obj) {
                    qrh.v(sportHealthSetting, (Integer) obj);
                }
            });
        } else {
            m8b.f("Sleep-Setting", "Devices no connect,please try again");
        }
    }

    public void H(String str) {
        this.h = str;
    }

    public void f(ez9 ez9Var) {
        if (this.c.contains(ez9Var)) {
            return;
        }
        this.c.add(ez9Var);
    }

    public void g(fz9 fz9Var) {
        if (this.d.contains(fz9Var)) {
            return;
        }
        this.d.add(fz9Var);
        if (this.i) {
            fz9Var.onLoadComplete();
        }
    }

    public void h(gz9 gz9Var) {
        if (this.b.contains(gz9Var)) {
            return;
        }
        this.b.add(gz9Var);
    }

    @SuppressLint({"CheckResult"})
    public void i(SportHealthSetting sportHealthSetting, Map<SportHealthSetting, String> map, @NonNull gz9 gz9Var) {
        C(sportHealthSetting, map, gz9Var);
        G(sportHealthSetting, map);
    }

    @SuppressLint({"CheckResult"})
    public void j(Map<SportHealthSetting, String> map, @NonNull final dz9 dz9Var) {
        C(SportHealthSetting.USER_REST_NEW, map, new gz9() { // from class: com.oplus.aiunit.vision.orh
            @Override // com.oplus.aiunit.model.gz9
            public final void g(SportHealthSetting sportHealthSetting, int i) {
                this.i.r(dz9Var, sportHealthSetting, i);
            }
        });
    }

    public final synchronized void k(SportHealthSetting sportHealthSetting) {
        this.f.remove(sportHealthSetting);
        if (this.f.isEmpty()) {
            this.i = true;
            A();
        }
    }

    public final List<SportHealthSetting> l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SportHealthSetting.USER_REST_NEW);
        arrayList.add(SportHealthSetting.BED_TIME);
        arrayList.add(SportHealthSetting.BED_TIME_SWITCH);
        arrayList.add(SportHealthSetting.STAY_UP_BED_TIME);
        arrayList.add(SportHealthSetting.STAY_UP_BED_TIME_SWITCH);
        arrayList.add(SportHealthSetting.SLEEP_MODEL_SETTINGS);
        arrayList.add(SportHealthSetting.CLOSE_MUSIC);
        arrayList.add(SportHealthSetting.SLEEP_GOAL);
        arrayList.add(SportHealthSetting.SILENCE_NOTIFICATIONS_DURING_NAP_SWITCH);
        arrayList.add(SportHealthSetting.NAP_START_TIME);
        arrayList.add(SportHealthSetting.NAP_DURATION);
        return arrayList;
    }

    public SleepSettingEntity n() {
        return this.e;
    }

    public SleepSettingBean o() {
        return this.e.a();
    }

    public boolean p() {
        return this.i;
    }

    public final boolean q() {
        String strX = qr0.w().x();
        return strX != null && (strX.equals(this.g) || strX.equals(this.h));
    }

    @SuppressLint({"CheckResult"})
    public void w() {
        m8b.f("Sleep-Setting", "start load All Sleep Setting");
        this.f.clear();
        this.i = false;
        List<SportHealthSetting> listL = l();
        this.f.addAll(listL);
        Iterator<SportHealthSetting> it = listL.iterator();
        while (it.hasNext()) {
            y(it.next(), false);
        }
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void s(SportHealthSetting sportHealthSetting, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = sportHealthSetting == SportHealthSetting.USER_REST_NEW ? rrh.e() : rrh.c(sportHealthSetting, true, true);
        if (strE.isEmpty()) {
            k(sportHealthSetting);
            m8b.b("Sleep-Setting", "Read preference error, name=" + sportHealthSetting.name() + ", cost=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return;
        }
        String strC = this.e.c(sportHealthSetting);
        m8b.f("Sleep-Setting", "Read preference name=" + sportHealthSetting.name() + " Success, cost=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        this.e.d(sportHealthSetting, strE);
        B(sportHealthSetting, 0);
        if (!z && strC != null && !TextUtils.equals(strC, strE)) {
            m8b.f("Sleep-Setting", "sleep setting change item: " + sportHealthSetting.name() + ", oldValue: " + strC + ", newValue: " + strE);
            z(sportHealthSetting);
        }
        k(sportHealthSetting);
    }

    @SuppressLint({"CheckResult"})
    public void y(final SportHealthSetting sportHealthSetting, final boolean z) {
        ThreadUtils.doInBackground("SleepSet", new Runnable() { // from class: com.oplus.aiunit.vision.nrh
            @Override // java.lang.Runnable
            public final void run() {
                this.i.s(sportHealthSetting, z);
            }
        });
    }

    public void z(SportHealthSetting sportHealthSetting) {
        Iterator<ez9> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().l(sportHealthSetting);
        }
    }
}