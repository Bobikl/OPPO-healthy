package com.heytap.health.bloodoxygen.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.base.R$string;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.core.operation.datacenter.ISpaceServer;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.x0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class BloodOxygenSpaceViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableLiveData<Map<String, List<SpaceInfo>>> f3425j = new MutableLiveData<>();

    public MutableLiveData<Map<String, List<SpaceInfo>>> w() {
        return this.f3425j;
    }

    public final void x(Map<String, List<SpaceInfo>> map) {
        this.f3425j.postValue(map);
    }

    public void y(LifecycleOwner lifecycleOwner) {
        ((ISpaceServer) x0.d().b("/operations/SpaceServer").navigation()).t3(lifecycleOwner, b78.a().getString(R$string.lib_base_code_bloodoxygen)).observe(lifecycleOwner, new Observer() { // from class: com.oplus.aiunit.vision.sm1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.x((Map) obj);
            }
        });
    }
}
