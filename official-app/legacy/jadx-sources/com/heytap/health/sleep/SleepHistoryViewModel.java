package com.heytap.health.sleep;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.core.operation.datacenter.ISpaceServer;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.x0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class SleepHistoryViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableLiveData<Map<String, List<SpaceInfo>>> f5656j = new MutableLiveData<>();
    public final MutableLiveData<Boolean> k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MutableLiveData<Boolean> f5657l = new MutableLiveData<>();

    public void A(LifecycleOwner lifecycleOwner) {
        ((ISpaceServer) x0.d().b("/operations/SpaceServer").navigation()).t3(lifecycleOwner, b78.a().getString(com.heytap.health.base.R$string.lib_base_code_sleephistory)).observe(lifecycleOwner, new Observer() { // from class: com.oplus.aiunit.vision.ljh
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.z((Map) obj);
            }
        });
    }

    public void w(boolean z, boolean z2) {
        this.k.postValue(Boolean.valueOf(z));
        this.f5657l.postValue(Boolean.valueOf(z2));
    }

    public MutableLiveData<Boolean> x() {
        return this.k;
    }

    public MutableLiveData<Map<String, List<SpaceInfo>>> y() {
        return this.f5656j;
    }

    public final void z(Map<String, List<SpaceInfo>> map) {
        this.f5656j.postValue(map);
    }
}
