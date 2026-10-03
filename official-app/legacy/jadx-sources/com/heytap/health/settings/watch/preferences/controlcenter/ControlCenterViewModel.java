package com.heytap.health.settings.watch.preferences.controlcenter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.health.settings.watch.preferences.dragutils.DragItemBean;
import com.oplus.aiunit.vision.g46;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ControlCenterViewModel extends ViewModel {
    public MutableLiveData<g46> i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MutableLiveData<Integer> f5456j = new MutableLiveData<>();
    public ControlCenterRepository k = new ControlCenterRepository();

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.k.c();
    }

    public List<DragItemBean> u() {
        return this.k.d();
    }

    public void v(String str) {
        this.k.e(str);
    }

    public MutableLiveData<g46> w() {
        this.k.f(this.i);
        return this.i;
    }

    public void x(List<DragItemBean> list) {
        this.k.g(list);
    }

    public MutableLiveData<Integer> y(List<DragItemBean> list) {
        this.k.h(list, this.f5456j);
        return this.f5456j;
    }
}
