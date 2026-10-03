package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.JsonElement;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.operation.courses.bean.AiCourseDetailBean;
import com.heytap.health.operation.courses.bean.MiaoCourseDetailBean;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class wb4 {

    public class a extends nnc.a<MiaoCourseDetailBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f18195j;

        public a(MutableLiveData mutableLiveData) {
            this.f18195j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.nnc.a
        public void f(nnc<MiaoCourseDetailBean> nncVar) {
            this.f18195j.postValue(nncVar);
        }

        @Override // com.oplus.aiunit.vision.nnc.a
        public void g(nnc<MiaoCourseDetailBean> nncVar) {
            this.f18195j.postValue(nncVar);
        }
    }

    public class b extends nnc.a<MiaoCourseDetailBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f18196j;

        public b(MutableLiveData mutableLiveData) {
            this.f18196j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.nnc.a
        public void f(nnc<MiaoCourseDetailBean> nncVar) {
            this.f18196j.postValue(nncVar);
        }

        @Override // com.oplus.aiunit.vision.nnc.a
        public void g(nnc<MiaoCourseDetailBean> nncVar) {
            this.f18196j.postValue(nncVar);
        }
    }

    public class c extends nnc.a<AiCourseDetailBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f18197j;

        public c(MutableLiveData mutableLiveData) {
            this.f18197j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.nnc.a
        public void f(nnc<AiCourseDetailBean> nncVar) {
            this.f18197j.postValue(nncVar);
        }

        @Override // com.oplus.aiunit.vision.nnc.a
        public void g(nnc<AiCourseDetailBean> nncVar) {
            this.f18197j.postValue(nncVar);
        }
    }

    public class d extends nnc.a<JsonElement> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OLiveData f18198j;

        public d(OLiveData oLiveData) {
            this.f18198j = oLiveData;
        }

        @Override // com.oplus.aiunit.vision.nnc.a
        public void f(nnc<JsonElement> nncVar) {
            this.f18198j.postValue(nncVar);
        }

        @Override // com.oplus.aiunit.vision.nnc.a
        public void g(nnc<JsonElement> nncVar) {
            this.f18198j.postValue(nncVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Context context, OLiveData<nnc<JsonElement>> oLiveData, String str) {
        HashMap map = new HashMap();
        map.put("courseSource", 2);
        map.put("courseCode", str);
        ((mdd) ((ib4) com.heytap.health.network.core.a.j(ib4.class)).b(map).L0(su8.c()).d1(l4g.a((LifecycleOwner) context))).subscribe(new d(oLiveData));
    }

    public static /* synthetic */ jdd d(String str, String str2) throws Throwable {
        return ((ib4) com.heytap.health.network.core.a.j(ib4.class)).d(mna.INSTANCE.a(), str);
    }

    public static /* synthetic */ jdd e(final String str, String str2) throws Throwable {
        v9g.x("keepCourse").U("SupportFatBurning", str2);
        return mna.INSTANCE.k().u(new d08() { // from class: com.oplus.aiunit.vision.vb4
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return wb4.d(str, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Context context, int i, MutableLiveData<nnc<AiCourseDetailBean>> mutableLiveData) {
        HashMap map = new HashMap();
        map.put("evaluationItems", new int[]{i});
        ((mdd) ((ib4) com.heytap.health.network.core.a.j(ib4.class)).c(map).L0(su8.c()).d1(l4g.a((LifecycleOwner) context))).subscribe(new c(mutableLiveData));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(Context context, String str, MutableLiveData<nnc<MiaoCourseDetailBean>> mutableLiveData) {
        HashMap map = new HashMap();
        map.put("courseSource", 2);
        map.put("courseCode", str);
        ((mdd) ((ib4) com.heytap.health.network.core.a.j(ib4.class)).a(map).L0(su8.c()).d1(l4g.a((LifecycleOwner) context))).subscribe(new a(mutableLiveData));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Context context, final String str, MutableLiveData<nnc<MiaoCourseDetailBean>> mutableLiveData) {
        ((mdd) mna.INSTANCE.f().Q(new d08() { // from class: com.oplus.aiunit.vision.ub4
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return wb4.e(str, (String) obj);
            }
        }).L0(su8.c()).d1(l4g.a((LifecycleOwner) context))).subscribe(new b(mutableLiveData));
    }
}
