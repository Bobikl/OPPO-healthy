package com.heytap.sporthealth.blib.basic;

import android.app.Application;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.sporthealth.blib.data.NetResult;
import com.oplus.aiunit.vision.afk;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.xs3;
import com.oplus.aiunit.vision.yha;
import io.reactivex.rxjava3.disposables.a;

/* JADX INFO: loaded from: classes2.dex */
public class BasicViewModel<DA> extends ViewModel {
    public MutableLiveData<NetResult<DA>> i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xs3 f7702j = new xs3();
    public Application k;

    public BasicViewModel() {
    }

    public a A(@Nullable Object obj) {
        this.i.postValue(NetResult.newNetResultSuccess());
        return lbd.M().c();
    }

    @CallSuper
    public LiveData<NetResult<DA>> B(@Nullable Object obj) {
        yha.a(getClass().getName(), " * pullData * -> ", obj);
        v(A(obj));
        return this.i;
    }

    public void C(a aVar) {
        this.i.postValue(NetResult.newNetLoading());
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        u();
    }

    public final void u() {
        this.f7702j.f();
    }

    public void v(a aVar) {
        this.f7702j.a(aVar);
    }

    public LiveData<NetResult<DA>> w() {
        return this.i;
    }

    public void x(Throwable th) {
        afk.g(th);
        this.i.postValue(NetResult.newNetResultError());
    }

    public void y(NetResult<DA> netResult) {
        this.i.postValue(netResult);
    }

    public void z(DA da) {
        y(NetResult.newNetResultSuccess(da));
    }

    public BasicViewModel(Application application, Object obj) {
        this.k = application;
        B(obj);
    }
}
