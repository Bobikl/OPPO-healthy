package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import androidx.core.util.Consumer;
import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.health.base.switchManager.SpecialSwitchBean;
import com.heytap.health.operations.router.providers.IOperatorProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes16.dex */
public class u86 {

    public class a extends u61<SpecialSwitchBean> {
        public final /* synthetic */ MutableLiveData i;

        public a(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            aa6.b("ECGCardRepository", "querySpecialSwitch, " + str);
            this.i.postValue(null);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(SpecialSwitchBean specialSwitchBean) {
            aa6.a("ECGCardRepository", specialSwitchBean != null ? specialSwitchBean.toString() : " SpecialSwitchBean is null");
            if (specialSwitchBean == null) {
                u86.this.e(0);
            } else {
                v9g.w().S(v9g.ECG_MEASURE_TYPE, specialSwitchBean.getSwitchStatus());
            }
            this.i.postValue(specialSwitchBean);
        }
    }

    public class b extends u61<String> {
        public final /* synthetic */ int i;

        public b(int i) {
            this.i = i;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            aa6.b("ECGCardRepository", "syncSpecialSwitch" + str);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(String str) {
            v9g.w().S(v9g.ECG_MEASURE_TYPE, this.i);
        }
    }

    public static /* synthetic */ void c(Map map, MutableLiveData mutableLiveData, Pair pair) throws Throwable {
        List list = (List) map.get(Boolean.TRUE);
        if ((list == null || list.isEmpty()) && !((Boolean) pair.getFirst()).booleanValue()) {
            aa6.b("ECGCardRepository", "ecgRecords 没绑定3代表 取旧数据");
            list = (List) map.get(Boolean.FALSE);
        }
        if (list == null || list.isEmpty()) {
            mutableLiveData.postValue(new ECGRecord());
        } else {
            mutableLiveData.postValue((ECGRecord) list.get(0));
        }
    }

    @SuppressLint({"CheckResult"})
    public void b(final MutableLiveData<ECGRecord> mutableLiveData) {
        final HashMap map = new HashMap();
        ((IOperatorProvider) x0.d().h(IOperatorProvider.class)).U7(new Consumer() { // from class: com.oplus.aiunit.vision.s86
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                map.putAll((Map) obj);
            }
        }).a(new o14() { // from class: com.oplus.aiunit.vision.t86
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                u86.c(map, mutableLiveData, (Pair) obj);
            }
        });
    }

    public void d(MutableLiveData<SpecialSwitchBean> mutableLiveData, int i) {
        String ssoid = um.c().getSsoid();
        String strC = o1h.c(b78.a(), o1h.OOBE_MAC);
        HashMap map = new HashMap();
        map.put("ssoid", ssoid);
        map.put(t04.DEVICE_UNIQUE_ID, strC);
        map.put("switchType", Integer.valueOf(i));
        ((p6j) com.heytap.health.network.core.a.j(p6j.class)).g(map).L0(su8.c()).subscribe(new a(mutableLiveData));
    }

    public void e(int i) {
        String ssoid = um.c().getSsoid();
        String strC = o1h.c(b78.a(), o1h.OOBE_MAC);
        HashMap map = new HashMap();
        map.put("ssoid", ssoid);
        map.put(t04.DEVICE_UNIQUE_ID, strC);
        map.put("switchType", 50);
        map.put(fkj.PARAM_SWITCH_STATUS, Integer.valueOf(i));
        map.put("customConfig", "");
        ((p6j) com.heytap.health.network.core.a.j(p6j.class)).d(map).L0(su8.c()).subscribe(new b(i));
    }
}
