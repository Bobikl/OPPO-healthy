package com.heytap.health.core.operation.datacenter;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.SpaceInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public interface ISpaceServer extends IProvider {
    MutableLiveData<Map<String, List<SpaceInfo>>> G2(LifecycleOwner lifecycleOwner, String str);

    MutableLiveData<Map<String, List<SpaceInfo>>> T6(LifecycleOwner lifecycleOwner, String str, String str2);

    MutableLiveData<Map<String, List<SpaceInfo>>> c7(LifecycleOwner lifecycleOwner, String str, String str2);

    MutableLiveData<Map<String, List<SpaceInfo>>> t3(LifecycleOwner lifecycleOwner, String str);
}
