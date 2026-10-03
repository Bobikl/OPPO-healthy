package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.core.operation.render.image.ImageRender;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.wearable.emergency.api.emergency.EmergencyMainApis;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class v4i {
    public Map<String, MutableLiveData<Map<String, List<SpaceInfo>>>> b = new HashMap();
    public fy9 a = (fy9) com.heytap.health.network.core.a.j(fy9.class);

    public class a extends ao0<CommonBackBean> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            if (commonBackBean == null) {
                a7b.f("SpaceRepository", "updateSpaceInfo error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean k(String str, String str2, MutableLiveData mutableLiveData, CommonBackBean commonBackBean) throws Throwable {
        a7b.f("SpaceRepository", "queryDbSpaceById, pageCode = " + str + ",cardCode = " + str2);
        boolean z = false;
        if (commonBackBean.getErrorCode() == 0 && commonBackBean.getObj() != null) {
            a7b.f("SpaceRepository", "queryDbSpaceById, filter list");
            if (((List) commonBackBean.getObj()).size() > 0) {
                z = true;
            }
        }
        if (!z) {
            a7b.f("SpaceRepository", "local data is empty, query data remote");
            t(str, str2, mutableLiveData);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(MutableLiveData mutableLiveData, CommonBackBean commonBackBean) throws Throwable {
        a7b.f("SpaceRepository", "queryDataByPageId, update ui with local data " + mutableLiveData);
        mutableLiveData.postValue(i((List) commonBackBean.getObj()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, String str2, MutableLiveData mutableLiveData, CommonBackBean commonBackBean) throws Throwable {
        a7b.f("SpaceRepository", "queryDataByPageId success, query data remote");
        t(str, str2, mutableLiveData);
    }

    public static /* synthetic */ boolean n(BaseResponse baseResponse) throws Throwable {
        return baseResponse.getErrorCode() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(MutableLiveData mutableLiveData, String str, String str2, BaseResponse baseResponse) throws Throwable {
        a7b.f("SpaceRepository", "querySpaceRemote success" + mutableLiveData);
        if (!lza.a((List) baseResponse.getBody())) {
            mutableLiveData.postValue(i((List) baseResponse.getBody()));
            v(str, str2, (List) baseResponse.getBody());
        } else {
            a7b.f("SpaceRepository", "listBaseResponse body is null or empty");
            mutableLiveData.postValue(new HashMap());
            v(str, str2, (List) baseResponse.getBody());
        }
    }

    public static /* synthetic */ void p(MutableLiveData mutableLiveData, Throwable th) throws Throwable {
        a7b.b("SpaceRepository", "querySpaceRemote error, message:" + th.getMessage());
        mutableLiveData.postValue(new HashMap());
    }

    public static /* synthetic */ void q(MutableLiveData mutableLiveData, BaseResponse baseResponse) throws Throwable {
        mutableLiveData.postValue(Integer.valueOf(new JSONObject(baseResponse.getBody().toString()).getInt("impressions")));
        a7b.f("SpaceRepository", "syncUserImpressions result : " + baseResponse.isSuccess());
    }

    public static /* synthetic */ void r(MutableLiveData mutableLiveData, Throwable th) throws Throwable {
        mutableLiveData.postValue(0);
        a7b.b("SpaceRepository", "syncUserImpressions Error : " + th.getMessage());
    }

    public final Map<String, List<SpaceInfo>> i(List<SpaceInfo> list) {
        HashMap map = new HashMap();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SpaceInfo spaceInfo = list.get(i);
            if (!g4i.containerTypeList.contains(Integer.valueOf(spaceInfo.getContainerType()))) {
                a7b.f("SpaceRepository", "data Useless, filter, containerType:" + spaceInfo.getContainerType());
            } else if (v9g.x(ImageRender.SP_SPACE_RECYCLER).r(spaceInfo.getStrategyCode(), false)) {
                a7b.f("SpaceRepository", "singleCard close, StrategyCode:" + spaceInfo.getStrategyCode());
            } else if (map.containsKey(spaceInfo.getCardCode())) {
                List list2 = (List) map.get(spaceInfo.getCardCode());
                Objects.requireNonNull(list2);
                list2.add(spaceInfo);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(spaceInfo);
                map.put(spaceInfo.getCardCode(), arrayList);
            }
        }
        return map;
    }

    public synchronized MutableLiveData<Map<String, List<SpaceInfo>>> j(String str) {
        MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveData;
        mutableLiveData = this.b.get(str);
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.b.put(str, mutableLiveData);
        }
        return mutableLiveData;
    }

    public io.reactivex.rxjava3.disposables.a s(final String str, final String str2, final MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveData) {
        return SportHealthDataAPI.getInstance().querySpaceByPageCode(str, str2).P(new mpe() { // from class: com.oplus.aiunit.vision.n4i
            @Override // com.oplus.aiunit.vision.mpe
            public final boolean test(Object obj) {
                return this.i.k(str, str2, mutableLiveData, (CommonBackBean) obj);
            }
        }).J(new o14() { // from class: com.oplus.aiunit.vision.o4i
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.l(mutableLiveData, (CommonBackBean) obj);
            }
        }).a(new o14() { // from class: com.oplus.aiunit.vision.p4i
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.m(str, str2, mutableLiveData, (CommonBackBean) obj);
            }
        });
    }

    public io.reactivex.rxjava3.disposables.a t(final String str, final String str2, final MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveData) {
        HashMap map = new HashMap();
        map.put(EmergencyMainApis.EVENT_OPEN_PAGE_PRAM_CODE, str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("cardCode", str2);
        }
        map.put("mobileUniqueId", ilj.e());
        return this.a.b(map).L0(su8.c()).P(new mpe() { // from class: com.oplus.aiunit.vision.q4i
            @Override // com.oplus.aiunit.vision.mpe
            public final boolean test(Object obj) {
                return v4i.n((BaseResponse) obj);
            }
        }).b(new o14() { // from class: com.oplus.aiunit.vision.r4i
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.o(mutableLiveData, str, str2, (BaseResponse) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.s4i
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                v4i.p(mutableLiveData, (Throwable) obj);
            }
        });
    }

    public io.reactivex.rxjava3.disposables.a u(String str, final MutableLiveData<Integer> mutableLiveData) {
        HashMap map = new HashMap();
        map.put("materielCode", str);
        return this.a.a(map).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.t4i
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                v4i.q(mutableLiveData, (BaseResponse) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.u4i
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                v4i.r(mutableLiveData, (Throwable) obj);
            }
        });
    }

    public final void v(String str, String str2, List<SpaceInfo> list) {
        a7b.f("SpaceRepository", "updateSpaceInfo");
        SportHealthDataAPI.getInstance().updateSpaceInfo(str, str2, list).subscribe(new a());
    }
}
