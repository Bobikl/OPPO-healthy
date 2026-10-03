package com.heytap.health.settings.watch.preferences.quickcenter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.health.settings.watch.preferences.dragutils.DragItemBean;
import com.oplus.aiunit.vision.g46;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class QuickCenterViewModel extends ViewModel {
    public MutableLiveData<g46> i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MutableLiveData<Integer> f5467j = new MutableLiveData<>();
    public QuickCenterRepository k = new QuickCenterRepository();

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.k.f();
    }

    public List<DragItemBean> u() {
        return this.k.h();
    }

    public void v(String str, String str2) {
        this.k.j(str, str2);
    }

    public MutableLiveData<g46> w() {
        this.k.k(this.i);
        return this.i;
    }

    public void x(List<DragItemBean> list) {
        this.k.l(list);
    }

    public MutableLiveData<Integer> y(List<DragItemBean> list) {
        this.k.n(list, this.f5467j);
        return this.f5467j;
    }
}
