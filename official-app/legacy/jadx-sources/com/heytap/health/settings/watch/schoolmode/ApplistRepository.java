package com.heytap.health.settings.watch.schoolmode;

import android.text.TextUtils;
import com.heytap.health.settings.watch.schoolmode.bean.AppItemBean;
import com.heytap.health.settings.watch.schoolmode.bean.DefaultAppInfo;
import com.heytap.health.watch.notification.impl.whitelist.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.s35;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ApplistRepository {
    public String a;
    public List<AppItemBean> b = new ArrayList<AppItemBean>() { // from class: com.heytap.health.settings.watch.schoolmode.ApplistRepository.1
        {
            add(new AppItemBean("com.heytap.wearable.dialer", true, false));
            add(new AppItemBean(a.PACKAGE_MMS, true, false));
            add(new AppItemBean("com.android.settings", false, false));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<DefaultAppInfo> f5468c = new ArrayList();
    public List<AppItemBean> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<AppItemBean> f5469e;

    public ApplistRepository(String str) {
        this.a = str;
    }

    public List<AppItemBean> a() {
        e();
        ArrayList arrayList = new ArrayList();
        if (lza.a(this.f5468c)) {
            return arrayList;
        }
        synchronized (this.f5468c) {
            for (DefaultAppInfo defaultAppInfo : this.f5468c) {
                AppItemBean appItemBean = new AppItemBean();
                appItemBean.setAppName(defaultAppInfo.getAppName());
                appItemBean.setPackageName(defaultAppInfo.getPackageName());
                boolean z = true;
                if (defaultAppInfo.getDefaultSwitchStatus() != 1) {
                    z = false;
                }
                appItemBean.setEnable(z);
                arrayList.add(appItemBean);
            }
        }
        return arrayList;
    }

    public List<AppItemBean> b() {
        e();
        return this.d;
    }

    public void c(int i, long j2, List<AppItemBean> list) {
        if (i != 1) {
            if (i == 2) {
                List<AppItemBean> list2 = this.f5469e;
                if (list2 != null) {
                    list = list2;
                }
                k(list);
                SchoolModeSpHelper.o(this.a, j2);
                this.f5469e = null;
                return;
            }
            return;
        }
        e();
        long jG = SchoolModeSpHelper.g(this.a);
        if (j2 == 0) {
            d(list, jG > 0);
            if (jG == 0) {
                SchoolModeSpHelper.o(this.a, j2);
                SchoolModeSpHelper.i(this.a, list);
                return;
            }
            return;
        }
        if (j2 > jG) {
            d(list, false);
            SchoolModeSpHelper.o(this.a, j2);
            for (AppItemBean appItemBean : list) {
                for (AppItemBean appItemBean2 : this.d) {
                    if (TextUtils.equals(appItemBean.getPackageName(), appItemBean2.getPackageName())) {
                        appItemBean.setIcon(appItemBean2.getIcon());
                        appItemBean.setHighPower(appItemBean2.isHighPower());
                    }
                }
            }
            SchoolModeSpHelper.i(this.a, list);
        }
    }

    public final void d(List<AppItemBean> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (AppItemBean appItemBean : list) {
            AppItemBean appItemBean2 = new AppItemBean();
            appItemBean2.setAppName(appItemBean.getAppName());
            appItemBean2.setPackageName(appItemBean.getPackageName());
            appItemBean2.setType(0);
            appItemBean2.setEnable(appItemBean.isEnable());
            if (!lza.a(this.d)) {
                for (AppItemBean appItemBean3 : this.d) {
                    if (TextUtils.equals(appItemBean.getPackageName(), appItemBean3.getPackageName()) && TextUtils.equals(appItemBean.getAppName(), appItemBean3.getAppName())) {
                        appItemBean2.setHighPower(appItemBean3.isHighPower());
                        appItemBean2.setIcon(appItemBean3.getIcon());
                        appItemBean2.setDisplay(appItemBean3.isDisplay());
                        if (!z) {
                            break;
                        }
                        appItemBean2.setEnable(appItemBean3.isEnable());
                        break;
                    }
                }
            }
            for (AppItemBean appItemBean4 : this.b) {
                if (TextUtils.equals(appItemBean2.getPackageName(), appItemBean4.getPackageName())) {
                    appItemBean2.setEnable(appItemBean4.isEnable());
                    appItemBean2.setCanModify(appItemBean4.isCanModify());
                }
            }
            arrayList.add(appItemBean2);
        }
        this.d = arrayList;
    }

    public final void e() {
        if (this.d == null) {
            List<AppItemBean> listB = SchoolModeSpHelper.b(this.a);
            this.d = listB;
            for (AppItemBean appItemBean : listB) {
                for (AppItemBean appItemBean2 : this.b) {
                    if (TextUtils.equals(appItemBean.getPackageName(), appItemBean2.getPackageName())) {
                        appItemBean.setEnable(appItemBean2.isEnable());
                        appItemBean.setCanModify(appItemBean2.isCanModify());
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getLocalData:");
                sb.append(appItemBean);
            }
        }
        if (lza.a(this.f5468c)) {
            this.f5468c.addAll(SchoolModeSpHelper.d(this.a));
        }
    }

    public void f(List<DefaultAppInfo> list) {
        if (lza.a(list) || lza.a(this.d)) {
            a7b.f("school.AppRepos", "white app icons or device App is empty ");
            return;
        }
        for (DefaultAppInfo defaultAppInfo : list) {
            for (AppItemBean appItemBean : this.d) {
                if (defaultAppInfo != null && appItemBean != null && TextUtils.equals(defaultAppInfo.getPackageName(), appItemBean.getPackageName())) {
                    appItemBean.setIcon(defaultAppInfo.getIconUrl());
                    break;
                }
            }
        }
    }

    public void g(List<DefaultAppInfo> list) {
        boolean z;
        if (lza.a(list)) {
            a7b.m("school.AppRepos", "updateClouldApplist, param invalid");
            return;
        }
        boolean z2 = false;
        for (DefaultAppInfo defaultAppInfo : list) {
            synchronized (this.f5468c) {
                Iterator<DefaultAppInfo> it = this.f5468c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    DefaultAppInfo next = it.next();
                    if (TextUtils.equals(next.getPackageName(), defaultAppInfo.getPackageName())) {
                        if (TextUtils.equals(next.getIconUrl(), defaultAppInfo.getIconUrl())) {
                            z = false;
                        } else {
                            next.setIconUrl(defaultAppInfo.getIconUrl());
                            z2 = true;
                            z = true;
                        }
                        if (next.getDefaultSwitchStatus() != defaultAppInfo.getDefaultSwitchStatus()) {
                            next.setDefaultSwitchStatus(defaultAppInfo.getDefaultSwitchStatus());
                            z2 = true;
                            z = true;
                        }
                        if (next.getDisplay() != defaultAppInfo.getDisplay()) {
                            next.setDisplay(defaultAppInfo.getDisplay());
                            z2 = true;
                            z = true;
                        }
                        if (next.getPowerConsumption() != defaultAppInfo.getPowerConsumption()) {
                            next.setPowerConsumption(defaultAppInfo.getPowerConsumption());
                            z2 = true;
                            z = true;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("updateClouldApplist:");
                        sb.append(next);
                        break;
                    }
                }
                if (!z) {
                    this.f5468c.add(defaultAppInfo);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("updateClouldApplist:");
                    sb2.append(defaultAppInfo);
                    z2 = true;
                }
            }
        }
        if (z2) {
            SchoolModeSpHelper.k(this.a, this.f5468c);
        }
    }

    public void h() {
        boolean z;
        synchronized (this.f5468c) {
            z = false;
            for (DefaultAppInfo defaultAppInfo : this.f5468c) {
                for (AppItemBean appItemBean : this.d) {
                    if (defaultAppInfo.getPackageName().equals(appItemBean.getPackageName()) && (appItemBean.isHighPower() || defaultAppInfo.getPowerConsumption() == 2)) {
                        appItemBean.setHighPower(defaultAppInfo.getPowerConsumption() == 2);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            SchoolModeSpHelper.i(this.a, this.d);
        }
    }

    public void i(boolean z) {
        boolean z2;
        synchronized (this.f5468c) {
            z2 = false;
            for (DefaultAppInfo defaultAppInfo : this.f5468c) {
                for (AppItemBean appItemBean : this.d) {
                    if (TextUtils.equals(defaultAppInfo.getPackageName(), appItemBean.getPackageName()) && TextUtils.equals(defaultAppInfo.getAppName(), appItemBean.getAppName())) {
                        z2 = true;
                        if (z) {
                            appItemBean.setEnable(defaultAppInfo.getDefaultSwitchStatus() == 1);
                        }
                        appItemBean.setIcon(defaultAppInfo.getIconUrl());
                        appItemBean.setHighPower(defaultAppInfo.getPowerConsumption() == 2);
                        appItemBean.setDisplay(defaultAppInfo.getDisplay() == 1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("updateApplistFromClould: ");
                        sb.append(appItemBean);
                        break;
                    }
                }
            }
        }
        if (z2) {
            SchoolModeSpHelper.i(this.a, this.d);
        }
    }

    public void j(List<s35> list) {
        if (lza.a(list)) {
            a7b.m("school.AppRepos", "updateClouldApplistIconUrl list is null");
            return;
        }
        if (lza.a(this.d)) {
            a7b.m("school.AppRepos", "updateClouldApplistIconUrl cache is empty");
            return;
        }
        for (s35 s35Var : list) {
            for (AppItemBean appItemBean : this.d) {
                a7b.f("school.AppRepos", "beanPackageName: " + s35Var.b() + ",appInfoPackageName: " + appItemBean.getPackageName());
                if (TextUtils.equals(s35Var.b(), appItemBean.getPackageName()) && TextUtils.isEmpty(appItemBean.getIcon())) {
                    appItemBean.setIcon(s35Var.a());
                    StringBuilder sb = new StringBuilder();
                    sb.append("package:");
                    sb.append(s35Var.b());
                    sb.append(",IconUrl:");
                    sb.append(s35Var.a());
                }
            }
        }
    }

    public final void k(List<AppItemBean> list) {
        if (list == null) {
            return;
        }
        if (lza.a(this.d)) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateLocalDataEnableState invalid:");
            sb.append(this.d == null);
            a7b.m("school.AppRepos", sb.toString());
            return;
        }
        boolean z = false;
        for (AppItemBean appItemBean : list) {
            for (AppItemBean appItemBean2 : this.d) {
                if (TextUtils.equals(appItemBean2.getAppName(), appItemBean.getAppName()) && TextUtils.equals(appItemBean2.getPackageName(), appItemBean.getPackageName())) {
                    z = appItemBean.isEnable() != appItemBean2.isEnable();
                    appItemBean2.setEnable(appItemBean.isEnable());
                    break;
                }
            }
        }
        if (z) {
            SchoolModeSpHelper.i(this.a, this.d);
        }
    }
}
