package com.heytap.health.core.operation.datacenter;

import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.base.base.BaseViewModel;
import com.oplus.aiunit.vision.v4i;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class SpaceViewModel extends BaseViewModel {
    public static final String TAG = "SpaceViewModel";

    @Override // com.heytap.health.base.base.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }

    public MutableLiveData<Map<String, List<SpaceInfo>>> v(String str, String str2) {
        v4i v4iVar = new v4i();
        MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveDataJ = v4iVar.j(str);
        u(v4iVar.s(str, str2, mutableLiveDataJ));
        return mutableLiveDataJ;
    }

    public MutableLiveData<Map<String, List<SpaceInfo>>> w(String str, String str2) {
        v4i v4iVar = new v4i();
        MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveDataJ = v4iVar.j(str);
        u(v4iVar.t(str, str2, mutableLiveDataJ));
        return mutableLiveDataJ;
    }

    public MutableLiveData<Integer> x(String str) {
        v4i v4iVar = new v4i();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        u(v4iVar.u(str, mutableLiveData));
        return mutableLiveData;
    }
}
