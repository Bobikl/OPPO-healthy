package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.operation.medal.MedalUploadSaveManager;
import com.heytap.health.operation.medal.bean.MedalAllListBean;
import com.heytap.health.operation.medal.bean.MedalUploadBean;
import com.heytap.health.operation.medal.core.Utils;
import com.heytap.health.operation.medalv2.MedalBatchPopActivity;
import com.heytap.health.operation.medalv2.MedalListDetailActivity;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes17.dex */
public final class noi {
    public static final int NUMBER_POP_6 = 6;
    public static final CopyOnWriteArrayList<Runnable> f = new CopyOnWriteArrayList<>();
    public static volatile long g = 0;
    public List<MedalUploadBean> a = new CopyOnWriteArrayList();
    public List<MedalListBean> b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<j61> f14582c = new CopyOnWriteArrayList();
    public String d = um.c().getSsoid();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14583e;

    public class a implements Runnable {
        public final /* synthetic */ List i;

        public a(List list) {
            this.i = list;
        }

        public static /* synthetic */ boolean c(ArrayList arrayList, MedalUploadBean medalUploadBean) {
            oqb.a(" toSeedlingCard --> " + medalUploadBean.getCode());
            if (!TextUtils.isEmpty(medalUploadBean.getCode()) && DateUtils.isToday(medalUploadBean.getAcquisitionDate())) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (medalUploadBean.getCode().startsWith((String) it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static /* synthetic */ MedalListBean d(MedalUploadBean medalUploadBean) {
            return MedalUploadSaveManager.r().t(medalUploadBean.getCode());
        }

        @Override // java.lang.Runnable
        public void run() {
            final ArrayList arrayList = new ArrayList();
            arrayList.add(krb.CMEALLSTEPS);
            arrayList.add(krb.CMEDAYSTEP);
            arrayList.add(krb.CMESINGLEWORKMILE);
            Optional optionalMax = this.i.stream().filter(new Predicate() { // from class: com.oplus.aiunit.vision.loi
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return noi.a.c(arrayList, (MedalUploadBean) obj);
                }
            }).map(new Function() { // from class: com.oplus.aiunit.vision.moi
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return noi.a.d((MedalUploadBean) obj);
                }
            }).max(Comparator.comparingLong(new bod()));
            if (optionalMax.isPresent()) {
                MedalListBean medalListBean = (MedalListBean) optionalMax.get();
                oqb.a(" toSeedlingCard --> broadcast > " + medalListBean);
                Context contextA = b78.a();
                Intent intent = new Intent("com.heytap.seedling.STEP_MEDAL");
                intent.putExtra("STEP_MEDAL_DATA", medalListBean);
                intent.setPackage(contextA.getPackageName());
                contextA.sendBroadcast(intent);
            }
        }
    }

    public noi() {
    }

    public static void h(Runnable runnable) {
        if (!k()) {
            runnable.run();
        } else {
            oqb.c("StatusProcess:StatusProcess", "doAfterProcessFinish >> run process");
            f.add(runnable);
        }
    }

    public static boolean k() {
        return g > 0 && Math.abs(System.currentTimeMillis() - g) < 60000;
    }

    public static /* synthetic */ void l(j61 j61Var, CountDownLatch countDownLatch, Integer num) throws Throwable {
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                j61Var.a();
                oqb.a("doSingleLogic: " + j61Var.a + "    [cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms]");
            } catch (Exception e2) {
                oqb.c("doSingleLogic error!");
                oqb.d(e2);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    public static /* synthetic */ int m(MedalListBean medalListBean, MedalListBean medalListBean2) {
        return Long.compare(medalListBean2.getAcquisitionDate(), medalListBean.getAcquisitionDate());
    }

    public static /* synthetic */ boolean n(MedalListBean medalListBean) {
        return medalListBean == null || !medalListBean.shouldPopAfterObtain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Context context, Integer num) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        j();
        s(context);
        y();
        oqb.a("StatusProcess:StatusProcess", "total cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static /* synthetic */ void p(Integer num) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Throwable th) throws Throwable {
        oqb.d(th);
        y();
    }

    public final void A(List<MedalUploadBean> list) {
        if (!Objects.equals(this.d, um.c().getSsoid())) {
            oqb.c("StatusProcess:StatusProcess", this + " >> popAndUploadMedals: account changed ,process finish");
            return;
        }
        List<MedalAllListBean> listS = MedalUploadSaveManager.r().s();
        if (list.size() > 0) {
            oqb.a("StatusProcess:StatusProcess", "uploadData >>> ", Integer.valueOf(list.size()));
            oqb.a("StatusProcess:StatusProcess", "clientDataId >>> ", this.f14583e);
            for (MedalUploadBean medalUploadBean : list) {
                if (!TextUtils.isEmpty(medalUploadBean.getCode())) {
                    if (medalUploadBean.getCode().startsWith(krb.SPORTMAN)) {
                        a7b.f("StatusProcess:StatusProcess", "medal upload data, filter cme_sport_duration");
                    } else {
                        medalUploadBean.setClientDataId(this.f14583e);
                    }
                }
            }
            MedalUploadSaveManager.r().P(list, listS);
        }
    }

    public void g(j61 j61Var) {
        if (j61Var == null) {
            oqb.c("StatusProcess:StatusProcess", "BaseLogic can not be null!");
        } else {
            this.f14582c.add(j61Var);
        }
    }

    public final void i(final j61 j61Var, final CountDownLatch countDownLatch) {
        lbd.h0(1).n0(su8.a()).J(new o14() { // from class: com.oplus.aiunit.vision.joi
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                noi.l(j61Var, countDownLatch, (Integer) obj);
            }
        }).c();
    }

    public final void j() {
        if (this.f14582c.isEmpty()) {
            oqb.c("StatusProcess:StatusProcess", "mInterceptors can not be empty!");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        oqb.a("StatusProcess:StatusProcess", "handleIntercept at time " + jCurrentTimeMillis);
        CountDownLatch countDownLatch = new CountDownLatch(this.f14582c.size());
        Iterator<j61> it = this.f14582c.iterator();
        while (it.hasNext()) {
            i(it.next(), countDownLatch);
        }
        try {
            countDownLatch.await(18L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            oqb.c("StatusProcess:StatusProcess", e2.toString());
        }
        for (j61 j61Var : this.f14582c) {
            oqb.a(j61Var.a + " StatusProcess.handleIntercept getMedal " + j61Var.k());
            this.b.addAll(j61Var.o());
            this.a.addAll(j61Var.q());
        }
        oqb.a("StatusProcess:StatusProcess", "handleIntercept[cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms]");
    }

    public void r(List<MedalUploadBean> list, List<MedalListBean> list2) {
        A(list);
        z(list);
        Iterator<MedalListBean> it = list2.iterator();
        while (it.hasNext()) {
            MedalListBean next = it.next();
            if (next.getAcquisitionDate() <= krb.MEDAL_GET_MIN_TIME) {
                oqb.a("uploadGetMedal >> filtter 过滤获得勋章时间小于2018年的数据 不合理");
                next.setGetResult(0);
                it.remove();
            } else {
                next.setAckStatus(1);
            }
        }
        oqb.a("StatusProcess:StatusProcess", " >> pop medals num:" + list2.size(), this);
        if (list2.isEmpty()) {
            return;
        }
        Collections.sort(list2, new Comparator() { // from class: com.oplus.aiunit.vision.ioi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return noi.m((MedalListBean) obj, (MedalListBean) obj2);
            }
        });
        String json = new Gson().toJson(list2.subList(0, Math.min(list2.size(), 3)));
        qqb.INSTANCE.a(json);
        oqb.a("popAndUploadMedals >> lastedMedal > " + json);
        if (ax7.j().k()) {
            MedalUploadSaveManager.r().i();
            eqb.e().c(um.c().getSsoid(), this.f14583e, new ArrayList(list2));
        } else {
            for (MedalListBean medalListBean : list2) {
                oqb.a("StatusProcess:StatusProcess", "popAndUploadMedals >> in background > " + medalListBean.getName());
                Utils.k(medalListBean);
            }
            new pqb(b78.a(), "");
        }
        dk5.g(list2);
    }

    public final void s(Context context) {
        if (Objects.equals(this.d, um.c().getSsoid())) {
            r(this.a, this.b);
            return;
        }
        oqb.c("StatusProcess:StatusProcess", this + " >> popAndUploadMedals: account changed ,process finish");
    }

    public final void t(Context context, List<MedalListBean> list) {
        oqb.a("StatusProcess:StatusProcess", "popBatchMedals > medal count: " + list.size());
        Intent intentM7 = MedalBatchPopActivity.m7(context, new ArrayList(list));
        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
        activityOptionsMakeBasic.setLaunchDisplayId(0);
        context.startActivity(intentM7, activityOptionsMakeBasic.toBundle());
    }

    public void u() {
        if (!ax7.j().k()) {
            oqb.a("popCacheMedals > is background");
            return;
        }
        List<MedalListBean> listD = Utils.d();
        oqb.a("BackGroundGetMedalShow > getBgGetMedals: " + listD);
        Utils.c();
        if (listD == null || listD.isEmpty()) {
            oqb.a("popCacheMedals > empty");
            return;
        }
        oqb.a("popCacheMedals > bg medals enqueue > " + listD.size());
        eqb.e().c(um.c().getSsoid(), null, new ArrayList(listD));
    }

    public void v(@NonNull List<MedalListBean> list) {
        if (!ax7.j().k()) {
            oqb.a("popMedals > is background, size: " + list.size() + ", medals:" + list);
            return;
        }
        list.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.koi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return noi.n((MedalListBean) obj);
            }
        });
        if (list.size() <= 0) {
            oqb.a("popMedals > empty");
            return;
        }
        oqb.a("StatusProcess:StatusProcess", "pop medals > " + Arrays.toString(list.toArray()));
        Activity activityS = op.n().s();
        if (activityS == null) {
            oqb.a("StatusProcess:StatusProcess", "popMedals topAvailableActivity is null");
            return;
        }
        pqb.a(activityS);
        Collections.reverse(list);
        if (list.size() > 6) {
            t(activityS, list);
        } else {
            w(activityS, list);
        }
    }

    public final void w(Context context, List<MedalListBean> list) {
        Intent[] intentArr = new Intent[list.size()];
        for (int i = 0; i < list.size(); i++) {
            MedalListBean medalListBean = list.get(i);
            Intent intent = new Intent(context, (Class<?>) MedalListDetailActivity.class);
            intent.putExtra("medal_type_code", medalListBean);
            intent.putExtra("medal_flag_pop", true);
            intentArr[i] = intent;
        }
        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
        activityOptionsMakeBasic.setLaunchDisplayId(0);
        context.startActivities(intentArr, activityOptionsMakeBasic.toBundle());
    }

    public void x(final Context context) {
        if (!k()) {
            g = System.currentTimeMillis();
            lbd.h0(1).n0(su8.c()).J(new o14() { // from class: com.oplus.aiunit.vision.foi
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) throws Throwable {
                    this.i.o(context, (Integer) obj);
                }
            }).b(new o14() { // from class: com.oplus.aiunit.vision.goi
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) throws Throwable {
                    noi.p((Integer) obj);
                }
            }, new o14() { // from class: com.oplus.aiunit.vision.hoi
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) throws Throwable {
                    this.i.q((Throwable) obj);
                }
            });
        } else {
            oqb.c("StatusProcess:StatusProcess", "process: has a process running at time: %tT" + new Date(g));
        }
    }

    public final void y() {
        g = 0L;
        while (true) {
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = f;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            } else {
                copyOnWriteArrayList.remove(0).run();
            }
        }
    }

    public final void z(List<MedalUploadBean> list) {
        ThreadUtils.doInBackground(new a(list));
    }

    public noi(String str) {
        this.f14583e = str;
    }
}
