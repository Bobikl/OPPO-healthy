package com.heytap.health.heartrate.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.base.R$string;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.core.operation.datacenter.ISpaceServer;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateActivityViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableLiveData<Map<String, List<SpaceInfo>>> f5751j = new MutableLiveData<>();

    public MutableLiveData<Map<String, List<SpaceInfo>>> w() {
        return this.f5751j;
    }

    public final void x(Map<String, List<SpaceInfo>> map) {
        this.f5751j.postValue(map);
    }

    public void y(LifecycleOwner lifecycleOwner) {
        ((ISpaceServer) e1.d().b("/operations/SpaceServer").navigation()).t3(lifecycleOwner, e88.a().getString(R$string.lib_base_code_heartrate)).observe(lifecycleOwner, new Observer() { // from class: com.oplus.aiunit.vision.i39
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.x((Map) obj);
            }
        });
    }
}