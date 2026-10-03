package com.heytap.health.operations.router.providers;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import androidx.lifecycle.LiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.operations.bean.MedalListBean;
import com.oplus.aiunit.vision.lbd;
import java.util.List;
import java.util.Map;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public interface IOperatorProvider extends IProvider {
    MedalListBean E3();

    LiveData<String> Fa();

    List<MedalListBean> H();

    @RequiresApi(api = 31)
    Pair<Boolean, LiveData<Boolean>> K6(Activity activity, String str, String str2, String str3, String str4);

    boolean S4();

    View T3(ViewGroup viewGroup, String str);

    lbd<Pair<Boolean, Boolean>> U7(Consumer<Map<Boolean, List<ECGRecord>>> consumer);

    List<MedalListBean> Z5();

    lbd<BaseResponse<Object>> b(Map<String, Object> map);

    void d2();

    void g3();
}
