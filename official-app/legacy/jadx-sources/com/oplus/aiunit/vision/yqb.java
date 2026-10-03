package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;
import com.heytap.health.operation.medal.MedalUploadSaveManager;
import com.heytap.health.operations.bean.MedalListBean;
import com.heytap.health.operations.router.providers.MedalPublicService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class yqb {
    public MedalPublicService a;

    public static class a {
        public static yqb a = new yqb();
    }

    public static void e(Throwable th) {
        a7b.f("MedalRepository", "queryUserMedalMuseum error, message:" + th.getMessage());
    }

    public static yqb f() {
        return a.a;
    }

    public static /* synthetic */ int h(MedalListBean medalListBean, MedalListBean medalListBean2) {
        if (medalListBean == null || medalListBean2 == null) {
            return -1;
        }
        return medalListBean.getAcquisitionDate() == medalListBean2.getAcquisitionDate() ? medalListBean2.getCode().compareTo(medalListBean.getCode()) : String.valueOf(medalListBean2.getAcquisitionDate()).compareTo(String.valueOf(medalListBean.getAcquisitionDate()));
    }

    public static /* synthetic */ int i(MedalListBean medalListBean, MedalListBean medalListBean2) {
        if (medalListBean == null || medalListBean2 == null) {
            return -1;
        }
        return medalListBean.getCode().compareTo(medalListBean2.getCode());
    }

    public static /* synthetic */ void j(ccd ccdVar) throws Throwable {
        Map<String, MedalListBean> mapW = MedalUploadSaveManager.r().w();
        if (mapW == null || mapW.isEmpty()) {
            a7b.f("MedalRepository", "queryUserMedalMuseum, map is empty");
            ccdVar.onComplete();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, MedalListBean>> it = mapW.entrySet().iterator();
        while (it.hasNext()) {
            MedalListBean value = it.next().getValue();
            if (value.isGet() && value.getStatus() == 1 && value.getLogicStatus() == 1) {
                arrayList.add(value);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.xqb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yqb.i((MedalListBean) obj, (MedalListBean) obj2);
            }
        });
        ccdVar.onNext(arrayList);
        ccdVar.onComplete();
    }

    public ArrayList<MedalListBean> g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        a7b.f("MedalRepository", "getSharedMedalList start, Time:" + jCurrentTimeMillis);
        HashMap map = new HashMap(MedalUploadSaveManager.r().u());
        if (map.isEmpty()) {
            a7b.f("MedalRepository", "getSharedMedalList, dataMap is empty");
            return new ArrayList<>(0);
        }
        ArrayList<MedalListBean> arrayList = new ArrayList<>();
        Comparator comparator = new Comparator() { // from class: com.oplus.aiunit.vision.wqb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yqb.h((MedalListBean) obj, (MedalListBean) obj2);
            }
        };
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            List<MedalListBean> list = (List) ((Map.Entry) it.next()).getValue();
            if (lza.a(list)) {
                a7b.f("MedalRepository", "medal type serialize list is null or empty, type:");
            } else {
                ArrayList arrayList2 = new ArrayList(list.size());
                for (MedalListBean medalListBean : list) {
                    if (medalListBean.getStatus() != 2 && medalListBean.getLogicStatus() != 1 && medalListBean.getGetResult() == 1 && medalListBean.getDisplay() == 1) {
                        arrayList2.add(medalListBean);
                    }
                }
                Collections.sort(arrayList2, comparator);
                arrayList.addAll(arrayList2);
            }
        }
        a7b.f("MedalRepository", "getSharedMedalList end, cost time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return arrayList;
    }

    public MutableLiveData<List<MedalListBean>> k() {
        return MedalUploadSaveManager.r().p();
    }

    public io.reactivex.rxjava3.disposables.a l(final MutableLiveData<ArrayList<MedalListBean>> mutableLiveData) {
        lbd lbdVarL0 = lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.tqb
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                yqb.j(ccdVar);
            }
        }).L0(su8.c());
        Objects.requireNonNull(mutableLiveData);
        return lbdVarL0.b(new o14() { // from class: com.oplus.aiunit.vision.uqb
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) {
                mutableLiveData.postValue((ArrayList) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.vqb
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) {
                yqb.e((Throwable) obj);
            }
        });
    }

    public yqb() {
        this.a = (MedalPublicService) x0.d().b("/operation/medal").navigation();
    }
}
