package com.heytap.health.operations.router.providers;

import android.content.Context;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MedalPublicService extends IProvider {
    void A0(String str);

    LiveData<List<MedalListBean>> C(String str);

    void E();

    View K4(Context context, String str);

    void K8(MutableLiveData<ArrayList<Object>> mutableLiveData);

    TrackMetadataStat L7();

    void Q9(DataInsertOption dataInsertOption);

    LiveData<List<MedalListBean>> W8();

    LiveData<List<MedalListBean>> X2(String str);

    View f9(Context context, String str, @ColorInt int i);

    TrackMetadataStat g5();

    void m7(boolean z);

    void q8();

    void s3(List<String> list);

    void wa(Context context);
}
