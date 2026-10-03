package com.heytap.health.core.operation.datacenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.model.SpaceInfo;
import com.oplus.aiunit.vision.a7b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/operations/SpaceServer")
public class SpaceServerImpl implements ISpaceServer, LifecycleEventObserver {
    public ConcurrentHashMap<String, SpaceViewModel> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MutableLiveData<Map<String, List<SpaceInfo>>> f3694j;

    @Override // com.heytap.health.core.operation.datacenter.ISpaceServer
    @SuppressLint({"RestrictedApi"})
    public MutableLiveData<Map<String, List<SpaceInfo>>> G2(LifecycleOwner lifecycleOwner, String str) {
        return c7(lifecycleOwner, str, "");
    }

    @Override // com.heytap.health.core.operation.datacenter.ISpaceServer
    @SuppressLint({"RestrictedApi"})
    public MutableLiveData<Map<String, List<SpaceInfo>>> T6(LifecycleOwner lifecycleOwner, String str, String str2) {
        ViewModelProvider viewModelProvider;
        if (lifecycleOwner == null) {
            a7b.b("SpaceServerImpl", "querySpaceDataOneCard, context is null");
            return this.f3694j;
        }
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            a7b.b("SpaceServerImpl", "querySpaceDataOneCard, not main thread, check if execute on main thread!");
            return this.f3694j;
        }
        lifecycleOwner.getLifecycle().addObserver(this);
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                a7b.f("SpaceServerImpl", "querySpaceDataOneCard, pageCode is empty or null");
                return this.f3694j;
            }
            SpaceViewModel spaceViewModel = this.i.get(str);
            if (spaceViewModel != null) {
                a7b.f("SpaceServerImpl", "querySpaceDataOneCard, viewModel exist ");
                MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveDataV = spaceViewModel.v(str, str2);
                this.f3694j = mutableLiveDataV;
                return mutableLiveDataV;
            }
            if (lifecycleOwner instanceof FragmentActivity) {
                viewModelProvider = new ViewModelProvider((FragmentActivity) lifecycleOwner);
            } else {
                viewModelProvider = lifecycleOwner instanceof Fragment ? new ViewModelProvider((Fragment) lifecycleOwner) : null;
            }
            if (viewModelProvider == null) {
                a7b.f("SpaceServerImpl", "querySpaceDataOneCard, viewModelProvider is null");
                return this.f3694j;
            }
            SpaceViewModel spaceViewModel2 = (SpaceViewModel) viewModelProvider.get(SpaceViewModel.class);
            this.i.put(str, spaceViewModel2);
            MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveDataV2 = spaceViewModel2.v(str, str2);
            this.f3694j = mutableLiveDataV2;
            return mutableLiveDataV2;
        }
    }

    @Override // com.heytap.health.core.operation.datacenter.ISpaceServer
    public MutableLiveData<Map<String, List<SpaceInfo>>> c7(LifecycleOwner lifecycleOwner, String str, String str2) {
        ViewModelProvider viewModelProvider;
        if (lifecycleOwner == null) {
            a7b.b("SpaceServerImpl", "querySpaceRemoteOneCard, context is null");
            return this.f3694j;
        }
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            a7b.b("SpaceServerImpl", "querySpaceRemoteOneCard, not main thread, check if execute on main thread!");
            return this.f3694j;
        }
        lifecycleOwner.getLifecycle().addObserver(this);
        if (TextUtils.isEmpty(str)) {
            a7b.f("SpaceServerImpl", "querySpaceRemoteOneCard, pageCode is empty or null");
            return this.f3694j;
        }
        SpaceViewModel spaceViewModel = this.i.get(str);
        if (spaceViewModel != null) {
            a7b.f("SpaceServerImpl", "querySpaceRemoteOneCard, viewModel exist");
            MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveDataW = spaceViewModel.w(str, str2);
            this.f3694j = mutableLiveDataW;
            return mutableLiveDataW;
        }
        if (lifecycleOwner instanceof FragmentActivity) {
            viewModelProvider = new ViewModelProvider((FragmentActivity) lifecycleOwner);
        } else {
            viewModelProvider = lifecycleOwner instanceof Fragment ? new ViewModelProvider((Fragment) lifecycleOwner) : null;
        }
        if (viewModelProvider == null) {
            a7b.f("SpaceServerImpl", "querySpaceRemoteOneCard, viewModelProvider is null");
            return this.f3694j;
        }
        SpaceViewModel spaceViewModel2 = (SpaceViewModel) viewModelProvider.get(SpaceViewModel.class);
        this.i.put(str, spaceViewModel2);
        MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveDataW2 = spaceViewModel2.w(str, str2);
        this.f3694j = mutableLiveDataW2;
        return mutableLiveDataW2;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        this.f3694j = new MutableLiveData<>();
        this.i = new ConcurrentHashMap<>();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    @SuppressLint({"RestrictedApi"})
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            a7b.f("SpaceServerImpl", "onStateChanged--onDestroy");
            ConcurrentHashMap<String, SpaceViewModel> concurrentHashMap = this.i;
            if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                for (SpaceViewModel spaceViewModel : this.i.values()) {
                    if (spaceViewModel != null) {
                        spaceViewModel.onCleared();
                    }
                }
                this.i.clear();
            }
            MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveData = this.f3694j;
            if (mutableLiveData != null) {
                mutableLiveData.removeObservers(lifecycleOwner);
            }
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    @Override // com.heytap.health.core.operation.datacenter.ISpaceServer
    @SuppressLint({"RestrictedApi"})
    public MutableLiveData<Map<String, List<SpaceInfo>>> t3(LifecycleOwner lifecycleOwner, String str) {
        return T6(lifecycleOwner, str, "");
    }
}
