package com.heytap.health.settings.watch.schoolmode.ui;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.health.settings.watch.schoolmode.ApplistRepository;
import com.heytap.health.settings.watch.schoolmode.bean.AppItemBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.huf;
import com.oplus.aiunit.vision.lhg;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.nhg;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class AllowedAppsDetailViewModel extends ViewModel {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<AppItemBean> f5473j;
    public MutableLiveData<huf> k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public lhg f5474l = new lhg() { // from class: com.oplus.aiunit.vision.x00
        @Override // com.oplus.aiunit.vision.lhg
        public final void a(huf hufVar) {
            this.a.y(hufVar);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(huf hufVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("ApplistInfoCallback:");
        sb.append(hufVar);
        if (hufVar.a() == 0) {
            A((List) hufVar.b());
        }
        this.k.postValue(hufVar);
    }

    public final void A(List<AppItemBean> list) {
        w();
        if (lza.a(list)) {
            return;
        }
        for (AppItemBean appItemBean : list) {
            for (AppItemBean appItemBean2 : this.f5473j) {
                if (TextUtils.equals(appItemBean2.getAppName(), appItemBean.getAppName()) && TextUtils.equals(appItemBean2.getPackageName(), appItemBean.getPackageName())) {
                    appItemBean2.setEnable(appItemBean.isEnable());
                }
            }
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        nhg.F().S(this.f5474l);
    }

    public MutableLiveData<huf> v() {
        return this.k;
    }

    public List<AppItemBean> w() {
        if (this.f5473j == null) {
            this.f5473j = new ApplistRepository(this.i).b();
        }
        return this.f5473j;
    }

    public void x(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("init:");
        sb.append(str);
        this.i = str;
        nhg.F().Y(this.i);
        nhg.F().B(this.f5474l);
    }

    public void z(List<AppItemBean> list) {
        if (lza.a(list)) {
            a7b.m("school.AppsViewModel", "setApplistInfosMessage param is null");
        } else {
            nhg.F().W(list, System.currentTimeMillis(), 15000, 1);
        }
    }
}
