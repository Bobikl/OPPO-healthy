package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.operation.medal.MedalUploadSaveManager;
import com.heytap.health.operation.medal.bean.MedalAllListBean;
import com.heytap.health.operation.medal.bean.MedalUploadBean;
import com.heytap.health.operation.medal.core.Utils;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class j61 implements hea {
    public final String a = "MedalLogic:" + p();
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f12765c = new ArrayList();
    public List<MedalListBean> d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<MedalUploadBean> f12766e = new CopyOnWriteArrayList();
    public String f;

    public j61() {
        v();
    }

    public static /* synthetic */ int s(String str, String str2) {
        return Utils.e(str2) - Utils.e(str);
    }

    public void c(String str) {
        this.f12765c.add(str);
    }

    public void d(String str) {
        e(str, true);
    }

    public void e(String str, boolean z) {
        Iterator<MedalAllListBean> it = MedalUploadSaveManager.r().s().iterator();
        while (it.hasNext()) {
            for (MedalListBean medalListBean : it.next().getMedalList()) {
                if (!z || !medalListBean.isGet()) {
                    if (medalListBean.getCode().startsWith(str)) {
                        this.f12765c.add(medalListBean.getCode());
                    }
                }
            }
        }
    }

    public void f(String str, boolean z) {
        Iterator<MedalAllListBean> it = MedalUploadSaveManager.r().s().iterator();
        while (it.hasNext()) {
            for (MedalListBean medalListBean : it.next().getMedalList()) {
                if (!z || !medalListBean.isGet()) {
                    String code = medalListBean.getCode();
                    if (code.startsWith("cme_month") && code.contains(str)) {
                        this.f12765c.add(code);
                    }
                }
            }
        }
    }

    public void g() {
        if (r()) {
            return;
        }
        a7b.f(this.a, "medal:" + this.f12765c.get(this.b) + " break record ");
    }

    public void h() {
        a7b.f(this.a, "  > checkUpdate");
    }

    public void i(List<MedalUploadBean> list, List<MedalListBean> list2) {
        this.b++;
        if (r()) {
            u(list, list2);
        } else {
            h();
        }
    }

    public void j(List<MedalUploadBean> list, List<MedalListBean> list2) {
        this.b++;
        if (r()) {
            u(list, list2);
        } else {
            a();
        }
    }

    public String k() {
        return "[medalPops][size=" + this.d.size() + "]{" + this.d.toString() + "}-> [uploads][size=" + this.f12766e.size() + "]{" + this.f12766e.toString() + "} " + this;
    }

    public DataReadOption l() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(v9g.w().D("user_ssoid"));
        return dataReadOption;
    }

    public int m(String str) {
        try {
            return new JSONObject(str).optInt("totalDistance");
        } catch (Exception unused) {
            return 0;
        }
    }

    public MedalListBean n() {
        MedalListBean medalListBeanT;
        return (r() || (medalListBeanT = MedalUploadSaveManager.r().t(this.f12765c.get(this.b))) == null) ? new MedalListBean() : medalListBeanT;
    }

    public List<MedalListBean> o() {
        return this.d;
    }

    public abstract String p();

    public List<MedalUploadBean> q() {
        return this.f12766e;
    }

    public final boolean r() {
        return this.f12765c.size() <= this.b;
    }

    public void t() {
        if (r()) {
            return;
        }
        a7b.f(this.a, "get new medal:" + this.f12765c.get(this.b));
    }

    public void u(List<MedalUploadBean> list, List<MedalListBean> list2) {
        a7b.f(this.a, this + "  > onInterceptFinish");
    }

    public abstract void v();

    public void w(MedalListBean medalListBean, MedalUploadBean medalUploadBean) {
        if (medalUploadBean != null) {
            this.f12766e.add(medalUploadBean);
        }
        if (!TextUtils.isEmpty(this.f) && !op5.PHONE.equals(this.f) && emd.a(gl4.managerApi.getCurrentConnectId()).Y7()) {
            oqb.a(this.a, "MedalNotificationHelper watch23 " + this.f + " medal:" + medalListBean);
            t();
            return;
        }
        if (ax7.j().k()) {
            this.d.add(medalListBean);
        } else {
            oqb.a(this.a, "MedalNotificationHelper background " + medalListBean);
            Utils.k(medalListBean);
            new pqb(b78.a(), medalListBean.getName());
        }
        t();
    }

    public void x() {
        List<String> list = this.f12765c;
        if (list == null || list.size() <= 1) {
            return;
        }
        Collections.sort(this.f12765c, new Comparator() { // from class: com.oplus.aiunit.vision.i61
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j61.s((String) obj, (String) obj2);
            }
        });
    }

    public void y(CountDownLatch countDownLatch) {
        z(countDownLatch, 10);
    }

    public void z(CountDownLatch countDownLatch, int i) {
        try {
            countDownLatch.await(i, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            a7b.b(this.a, "waitTask fail:" + e2.toString());
        }
    }
}
