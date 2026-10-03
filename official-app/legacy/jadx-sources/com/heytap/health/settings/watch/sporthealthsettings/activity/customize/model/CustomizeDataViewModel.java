package com.heytap.health.settings.watch.sporthealthsettings.activity.customize.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.settings.watch.sporthealthsettings.activity.customize.bean.CustomizeBean;
import com.heytap.health.settings.watch.sporthealthsettings.activity.customize.bean.CustomizeDataBean;
import com.oplus.aiunit.vision.oh4;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class CustomizeDataViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MutableLiveData<List<CustomizeDataBean>> f5503j = new MutableLiveData<>();

    public LiveData<List<CustomizeDataBean>> v(List<CustomizeDataBean> list) {
        if (!list.isEmpty() && list.contains(w())) {
            this.f5503j.postValue(list);
            return this.f5503j;
        }
        Iterator<CustomizeDataBean> it = list.iterator();
        boolean zIsAdd = true;
        int i = 0;
        while (it.hasNext()) {
            zIsAdd = it.next().isAdd();
            if (!zIsAdd) {
                list.add(i, w());
                break;
            }
            i++;
        }
        if (zIsAdd) {
            list.add(i, w());
        }
        this.f5503j.setValue(list);
        return this.f5503j;
    }

    @NotNull
    public final CustomizeDataBean w() {
        return new CustomizeDataBean(BaseApplication.a().getString(R$string.settings_customize_sport_can_select_new), -1);
    }

    public void x(CustomizeBean customizeBean) {
        v(oh4.p(customizeBean.getNormalSelectData(), customizeBean.getCustomizeDataBeans()));
    }
}
