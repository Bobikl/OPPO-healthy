package com.heytap.health.operation.medal;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.core.provider.adapter.open.MedalAdapter;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.operation.medal.MedalUploadSaveManager;
import com.heytap.health.operation.medal.bean.MedalAllListBean;
import com.heytap.health.operation.medal.bean.MedalUploadBean;
import com.heytap.health.operation.medal.bean.MedalUserActList;
import com.heytap.health.operation.medal.check.DailyStepMedal;
import com.heytap.health.operations.bean.MedalListBean;
import com.heytap.health.operations.bean.MedalRecordBean;
import com.heytap.health.operations.router.providers.MedalPublicService;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.aqb;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.crb;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.e08;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.krb;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.noi;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.oa2;
import com.oplus.aiunit.vision.oqb;
import com.oplus.aiunit.vision.qqb;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.u61;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.vbb;
import com.oplus.aiunit.vision.vpb;
import com.oplus.aiunit.vision.wpb;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.y0k;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class MedalUploadSaveManager {
    public static final Object h = new Object();
    public volatile List<MedalAllListBean> a;
    public volatile Map<String, MedalListBean> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map<String, List<MedalListBean>> f5195c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f5196e;
    public Map<String, MedalListBean> f;
    public String g;

    public class a extends u61<List<MedalRecordBean>> {
        public final /* synthetic */ List i;

        public a(List list) {
            this.i = list;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            oqb.a("uploadGetMedal-> onFailure, errMsg=", str, "e=", th);
            boolean zK = MedalUploadSaveManager.this.k(th);
            if (!rpc.c() || zK) {
                oqb.c("MedalUploadSaveManager", "===================== uploadGetMedal-----failure > cache upload bean next times upload ======================");
            } else {
                MedalUploadSaveManager.this.G(this.i);
            }
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(List<MedalRecordBean> list) {
            MedalUploadSaveManager.this.G(this.i);
            oqb.c("MedalUploadSaveManager", "================  uploadGetMedal-----onSuccess =================");
            MedalUploadSaveManager.this.p();
        }
    }

    public class b implements aed<Boolean> {
        public final /* synthetic */ MutableLiveData i;

        public b(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.aed
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            oqb.a(" cache medal data >> ", bool, this.i);
            if (this.i != null) {
                MedalUploadSaveManager.this.x(bool.booleanValue());
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            oqb.d(th);
            if (this.i != null) {
                MedalUploadSaveManager medalUploadSaveManager = MedalUploadSaveManager.this;
                medalUploadSaveManager.x(!medalUploadSaveManager.s().isEmpty());
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        }
    }

    public class c implements Comparator<MedalRecordBean> {
        public c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MedalRecordBean medalRecordBean, MedalRecordBean medalRecordBean2) {
            if (medalRecordBean == null || medalRecordBean2 == null) {
                return -1;
            }
            return medalRecordBean.getCode().compareTo(medalRecordBean2.getCode());
        }
    }

    public class d extends u61<Object> {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            oqb.a("MedalUploadSaveManager", "uploadMedalAckStatus-----onFailure" + th);
        }

        @Override // com.oplus.aiunit.vision.u61
        public void d(Object obj) {
            oqb.a("MedalUploadSaveManager", "uploadMedalAckStatus-----onSuccess");
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ MutableLiveData i;

        public e(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public void run() {
            oqb.c("MedalUploadSaveManager", "getHomeShowMedal > doAfterProcessFinish");
            MedalUploadSaveManager.this.n(this.i);
        }
    }

    public class f implements Comparator<MedalListBean> {
        public f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MedalListBean medalListBean, MedalListBean medalListBean2) {
            return Long.compare(medalListBean2.getAcquisitionDate(), medalListBean.getAcquisitionDate());
        }
    }

    public class g extends u61<List<MedalListBean>> {
        public final /* synthetic */ MutableLiveData i;

        public g(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b("MedalUploadSaveManager", "queryUserMedalDataList failed, message:" + th.getMessage());
            this.i.postValue(null);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(List<MedalListBean> list) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryUserMedalDataList succeed, result:");
            sb.append(list.toString());
            if (!lza.a(list)) {
                this.i.postValue(list);
            } else {
                a7b.f("MedalUploadSaveManager", "queryUserMedalDataList succeed, result is null or empty");
                this.i.postValue(null);
            }
        }
    }

    public static class h {
        public static MedalUploadSaveManager a = new MedalUploadSaveManager();

        public static void b() {
            MedalUploadSaveManager medalUploadSaveManager = new MedalUploadSaveManager();
            a = medalUploadSaveManager;
            oqb.c("MedalUploadSaveManager", "reset  xxxxxxxxxxxxxxxxxxxx ", medalUploadSaveManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd B(lbd lbdVar, lbd lbdVar2, lbd lbdVar3, final MutableLiveData mutableLiveData, BaseResponse baseResponse) throws Throwable {
        return lbd.l1(lbdVar, lbdVar2, lbdVar3, new e08() { // from class: com.oplus.aiunit.vision.frb
            @Override // com.oplus.aiunit.vision.e08
            public final Object a(Object obj, Object obj2, Object obj3) {
                return this.a.A(mutableLiveData, (BaseResponse) obj, (BaseResponse) obj2, (BaseResponse) obj3);
            }
        });
    }

    public static /* synthetic */ void C(List list, BaseResponse baseResponse) throws Throwable {
        if (baseResponse.isSuccess()) {
            oa2.d(krb.CACHE_UPLOAD_MEDALS).a0(krb.CACHE_UPLOAD_MEDALS);
            oqb.c("MedalUploadSaveManager", "================ uploadCachedMedal uploadGetMedal-----onSuccess =================");
        } else {
            oqb.c("MedalUploadSaveManager", "================ uploadCachedMedal uploadGetMedal-----fail =================", baseResponse.getMessage());
            oa2.d(krb.CACHE_UPLOAD_MEDALS).U(krb.CACHE_UPLOAD_MEDALS, sc8.g(list));
        }
    }

    public static /* synthetic */ void D(List list, Throwable th) throws Throwable {
        oqb.c("MedalUploadSaveManager", "================ uploadCachedMedal uploadGetMedal-----fail =================", th.getMessage());
        oa2.d(krb.CACHE_UPLOAD_MEDALS).U(krb.CACHE_UPLOAD_MEDALS, sc8.g(list));
    }

    public static /* synthetic */ BaseResponse E(Throwable th) throws Throwable {
        return new BaseResponse();
    }

    public static MedalUploadSaveManager r() {
        return h.a;
    }

    public MutableLiveData<List<MedalListBean>> F(String str) {
        a7b.f("MedalUploadSaveManager", "queryUserMedalDataList ...");
        MutableLiveData<List<MedalListBean>> mutableLiveData = new MutableLiveData<>();
        HashMap map = new HashMap();
        map.put("clientDataId", str);
        ((wpb) com.heytap.health.network.core.a.j(wpb.class)).d(map).L0(su8.c()).subscribe(new g(mutableLiveData));
        return mutableLiveData;
    }

    public final void G(List<MedalUploadBean> list) {
        synchronized (h) {
            String strE = oa2.d(krb.CACHE_UPLOAD_MEDALS).E(krb.CACHE_UPLOAD_MEDALS, "");
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            ArrayList arrayList = new ArrayList(sc8.d(strE, MedalUploadBean.class));
            arrayList.removeAll(list);
            if (arrayList.isEmpty()) {
                oa2.d(krb.CACHE_UPLOAD_MEDALS).a0(krb.CACHE_UPLOAD_MEDALS);
            } else {
                oa2.d(krb.CACHE_UPLOAD_MEDALS).U(krb.CACHE_UPLOAD_MEDALS, sc8.g(arrayList));
            }
        }
    }

    public synchronized void H() {
        oqb.c("MedalUploadSaveManager", "resetCache  xxxxxxxxxxxxxxxxxxxx ", this);
        oqb.b("MedalUploadSaveManager", "resetCache  xxxxxxxxxxxxxxxxxxxx ", this.g);
        this.f5196e = 0L;
        if (this.a != null) {
            this.a.clear();
        }
        if (this.b != null) {
            this.b.clear();
        }
        this.g = "";
        K();
        h.b();
    }

    public final void I(MedalUserActList medalUserActList) {
        List<MedalUserActList.HistoryListBean> historyList = medalUserActList.getHistoryList();
        int joinCount = 0;
        if (historyList != null) {
            Iterator<MedalUserActList.HistoryListBean> it = historyList.iterator();
            while (it.hasNext()) {
                joinCount += it.next().getJoinCount();
            }
        }
        v9g.x(krb.e()).S(krb.ALL_REDENVELOPE_JOINTIMES, joinCount);
    }

    public synchronized void J(List<MedalAllListBean> list) {
        boolean z;
        oqb.c(" ================  syncMedalInfo  ================");
        if (TextUtils.isEmpty(this.g)) {
            z = false;
        } else {
            Gson gson = new Gson();
            String str = krb.ALLMEDALSTATE + vbb.d(this.g);
            String strE = v9g.x(krb.e()).E(str, "");
            String json = gson.toJson(list);
            if (TextUtils.isEmpty(strE)) {
                oqb.c("MedalUploadSaveManager", "syncMedalInfo first time, no old data");
                z = true;
            } else {
                z = z(strE, json, gson);
                oqb.c("MedalUploadSaveManager", "syncMedalInfo dataChanged: " + z + ", oldLength: " + strE.length() + ", newLength: " + json.length());
            }
            v9g.x(krb.e()).U(str, json);
        }
        this.a = list;
        M();
        N();
        p();
        if (z) {
            oqb.c("MedalUploadSaveManager", "Medal data changed, notify ContentProvider");
            MedalAdapter.m(b78.a());
        } else {
            oqb.c("MedalUploadSaveManager", "Medal data not changed, skip notify");
        }
    }

    public void K() {
        oqb.c(">>>>>>>>>>>>>>>>>>>>>>>>>>>>> unInitMedal");
        this.d = false;
    }

    public final void L(List<MedalRecordBean> list, List<MedalAllListBean> list2) {
        MedalListBean medalListBean;
        if (l()) {
            oqb.c("updateMedal：account changed finish >>> ");
            return;
        }
        s();
        Collections.sort(list2, new crb());
        c cVar = new c();
        Collections.sort(list, cVar);
        oqb.c("updateMedal  => MedalRecordLits size", Integer.valueOf(list.size()));
        for (MedalAllListBean medalAllListBean : list2) {
            Collections.sort(medalAllListBean.getMedalList(), new aqb());
            Collections.sort(list, cVar);
            for (MedalListBean medalListBean2 : medalAllListBean.getMedalList()) {
                MedalRecordBean medalRecordBean = new MedalRecordBean();
                medalRecordBean.setCode(medalListBean2.getCode());
                int iBinarySearch = Collections.binarySearch(list, medalRecordBean, cVar);
                if (iBinarySearch > -1) {
                    MedalRecordBean medalRecordBean2 = list.get(iBinarySearch);
                    oqb.b("updateMedal  => refresh MedalListBean from MedalRecordBean ", medalRecordBean2.toString());
                    medalListBean2.setAcquisitionDate(medalRecordBean2.getAcquisitionDate());
                    medalListBean2.setGetResult(medalRecordBean2.getGetResult());
                    medalListBean2.setRemark(medalRecordBean2.getRemark());
                    medalListBean2.setFlag(medalRecordBean2.getFlag());
                    medalListBean2.setAckStatus(medalRecordBean2.getAckStatus());
                    medalListBean2.setBreakRecordTimes(medalRecordBean2.getBreakRecordTimes());
                    medalListBean2.setRecordDuration2(medalRecordBean2.getRecordDuration());
                    medalListBean2.setObtainStatus(medalRecordBean2.getObtainStatus());
                }
                oqb.b("updateMedal: updata medal data from cache >>> " + this.b.size());
                if (!this.b.isEmpty() && (medalListBean = this.b.get(medalListBean2.getCode())) != null) {
                    medalListBean2.setProgress(medalListBean.getProgress());
                    if (medalListBean.getGetResult() > medalListBean2.getGetResult() || medalListBean.getAcquisitionDate() > medalListBean2.getAcquisitionDate()) {
                        oqb.b("updateMedal getResult diff => refresh MedalListBean from medalCacheListBean ", medalListBean.toString());
                        oqb.b("updateMedal getResult diff => refresh MedalListBean from medalCloud ", medalListBean2.toString());
                        if (!Objects.toString(medalListBean.getRemark(), "").equals(Objects.toString(medalListBean2.getRemark(), ""))) {
                            oqb.c("MedalUploadSaveManager", medalListBean2.getName(), " remark diff => Remark=", medalListBean2.getRemark(), "  cacheRemark=", medalListBean.getRemark());
                            medalListBean2.setRemark(medalListBean.getRemark());
                        }
                        medalListBean2.setGetResult(medalListBean.getGetResult());
                        medalListBean2.setBreakRecordTimes(medalListBean.getBreakRecordTimes());
                        medalListBean2.setRecordDuration2((int) medalListBean.getRecordDuration());
                        medalListBean2.setAcquisitionDate(medalListBean.getAcquisitionDate());
                        medalListBean2.setObtainStatus(medalListBean.getObtainStatus());
                        oqb.c("MedalUploadSaveManager", medalListBean2.getName(), " getResult diff => ", Long.valueOf(medalListBean2.getAcquisitionDate()));
                    }
                }
                if (medalListBean2.isGetRow() && medalListBean2.getAcquisitionDate() <= krb.MEDAL_GET_MIN_TIME) {
                    MedalListBean medalListBean3 = this.b.get(medalListBean2.getCode());
                    if (medalListBean3 == null || !medalListBean3.isGet()) {
                        oqb.c("勋章已获得但是获得时间小于2018年那么修改为未获得 >> ", medalListBean2);
                        medalListBean2.setAcquisitionDate(0L);
                        medalListBean2.setGetResult(0);
                    } else {
                        medalListBean2.setAcquisitionDate(medalListBean3.getAcquisitionDate());
                    }
                }
            }
        }
    }

    public final synchronized void M() {
        oqb.c("=================== updateMedalMap (medal geted) ==========================");
        oqb.b("=================== updateMedalMap (medal geted) ==========================", oa2.b());
        Iterator<MedalAllListBean> it = this.a.iterator();
        while (it.hasNext()) {
            for (MedalListBean medalListBean : it.next().getMedalList()) {
                this.b.put(medalListBean.getCode(), medalListBean);
                if (medalListBean.isGet()) {
                    oqb.c(medalListBean.getCode(), medalListBean.getName(), String.format("%tD", Long.valueOf(medalListBean.getAcquisitionDate())), medalListBean.getRemark());
                }
            }
        }
        oqb.c("^^^^^^^^^^^^^^^^^^^^ updateMedalMap (medal geted) ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public final synchronized void N() {
        this.f5195c.clear();
        Iterator<MedalAllListBean> it = this.a.iterator();
        while (it.hasNext()) {
            for (MedalListBean medalListBean : it.next().getMedalList()) {
                String typeCode = medalListBean.getTypeCode();
                if (this.f5195c.containsKey(typeCode)) {
                    List<MedalListBean> list = this.f5195c.get(typeCode);
                    if (list != null) {
                        list.add(medalListBean);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(medalListBean);
                    this.f5195c.put(typeCode, arrayList);
                }
            }
        }
    }

    public lbd<BaseResponse<List<MedalRecordBean>>> O() {
        String strE = oa2.d(krb.CACHE_UPLOAD_MEDALS).E(krb.CACHE_UPLOAD_MEDALS, "");
        oqb.c("MedalUploadSaveManager", "================ uploadCachedMedal uploadGetMedal =================", strE);
        try {
            List listD = sc8.d(strE, MedalUploadBean.class);
            if (listD == null || listD.isEmpty()) {
                BaseResponse baseResponse = new BaseResponse();
                baseResponse.setErrorCode(0);
                return lbd.h0(baseResponse);
            }
            final List<MedalUploadBean> listB = krb.b(listD);
            if (listB != null && !listB.isEmpty()) {
                return ((wpb) com.heytap.health.network.core.a.j(wpb.class)).b(listD).L0(su8.c()).J(new o14() { // from class: com.oplus.aiunit.vision.grb
                    @Override // com.oplus.aiunit.vision.o14
                    public final void accept(Object obj) throws Throwable {
                        MedalUploadSaveManager.C(listB, (BaseResponse) obj);
                    }
                }).H(new o14() { // from class: com.oplus.aiunit.vision.hrb
                    @Override // com.oplus.aiunit.vision.o14
                    public final void accept(Object obj) throws Throwable {
                        MedalUploadSaveManager.D(listB, (Throwable) obj);
                    }
                }).t0(new d08() { // from class: com.oplus.aiunit.vision.irb
                    @Override // com.oplus.aiunit.vision.d08
                    public final Object apply(Object obj) {
                        return MedalUploadSaveManager.E((Throwable) obj);
                    }
                });
            }
            oa2.d(krb.CACHE_UPLOAD_MEDALS).a0(krb.CACHE_UPLOAD_MEDALS);
            BaseResponse baseResponse2 = new BaseResponse();
            baseResponse2.setErrorCode(0);
            return lbd.h0(baseResponse2);
        } catch (Exception e2) {
            oqb.d(e2);
            oa2.d(krb.CACHE_UPLOAD_MEDALS).a0(krb.CACHE_UPLOAD_MEDALS);
            BaseResponse baseResponse3 = new BaseResponse();
            baseResponse3.setErrorCode(0);
            return lbd.h0(baseResponse3);
        }
    }

    public void P(List<MedalUploadBean> list, List<MedalAllListBean> list2) {
        J(list2);
        List<MedalUploadBean> listB = krb.b(list);
        oqb.a("MedalUploadSaveManager", "uploadGetMedal >>> ", listB);
        if (listB == null || listB.isEmpty()) {
            oa2.d(krb.CACHE_UPLOAD_MEDALS).a0(krb.CACHE_UPLOAD_MEDALS);
            return;
        }
        synchronized (h) {
            String strE = oa2.d(krb.CACHE_UPLOAD_MEDALS).E(krb.CACHE_UPLOAD_MEDALS, "");
            if (TextUtils.isEmpty(strE)) {
                oa2.d(krb.CACHE_UPLOAD_MEDALS).U(krb.CACHE_UPLOAD_MEDALS, sc8.g(listB));
            } else {
                oqb.c("MedalUploadSaveManager", "======= uploadGetMedal >>> merge with existing cache ", strE);
                ArrayList arrayList = new ArrayList(sc8.d(strE, MedalUploadBean.class));
                arrayList.addAll(listB);
                oa2.d(krb.CACHE_UPLOAD_MEDALS).U(krb.CACHE_UPLOAD_MEDALS, sc8.g(new ArrayList(new HashSet(krb.b(arrayList)))));
            }
        }
        ((wpb) com.heytap.health.network.core.a.j(wpb.class)).b(listB).L0(su8.c()).subscribe(new a(listB));
    }

    public void Q(List<MedalListBean> list) {
        if (list.isEmpty()) {
            a7b.b("MedalUploadSaveManager", "uploadMedalAckStatus:error: is empty");
            return;
        }
        List list2 = (List) list.stream().map(new god()).collect(Collectors.toList());
        HashMap map = new HashMap();
        map.put("codes", list2);
        ((wpb) com.heytap.health.network.core.a.j(wpb.class)).c(map).L0(su8.c()).subscribe(new d());
    }

    @NotNull
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Boolean A(MutableLiveData<ArrayList<Object>> mutableLiveData, BaseResponse<List<MedalAllListBean>> baseResponse, BaseResponse<MedalUserActList> baseResponse2, BaseResponse<List<MedalRecordBean>> baseResponse3) {
        if (baseResponse.getErrorCode() != 0 || baseResponse2.getErrorCode() != 0 || baseResponse3.getErrorCode() != 0) {
            a7b.b("MedalUploadSaveManager", "fetch data failed");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(r().v());
            }
            return Boolean.FALSE;
        }
        oqb.c("MedalUploadSaveManager", "========= fetch data success =============");
        oa2.d(krb.e()).U(krb.ALL_BONES, baseResponse2.getBody().getTotalComplianceBonus());
        I(baseResponse2.getBody());
        List<MedalAllListBean> body = baseResponse.getBody();
        L(baseResponse3.getBody(), body);
        J(body);
        if (mutableLiveData != null) {
            mutableLiveData.postValue(r().v());
        }
        this.d = true;
        return Boolean.TRUE;
    }

    public synchronized void i() {
        oqb.c("cacheAfterPop：--->>>");
        if (!TextUtils.isEmpty(this.g)) {
            String json = new Gson().toJson(this.a);
            v9g.x(krb.e()).U(krb.ALLMEDALSTATE + vbb.d(this.g), json);
        }
    }

    @SuppressLint({"DefaultLocale"})
    public synchronized void j(final MutableLiveData<ArrayList<Object>> mutableLiveData) {
        if (noi.k()) {
            oqb.c("MedalUploadSaveManager", "do not cacheMedalList becase check medal status process is running > ");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(r().v());
            }
            return;
        }
        if (this.d && TimeUnit.MILLISECONDS.toMinutes(Math.abs(System.currentTimeMillis() - this.f5196e)) <= 1) {
            oqb.c("MedalUploadSaveManager", String.format("do not cacheMedalList in 1 minute > last checked time %tT", new Date(this.f5196e)));
            if (mutableLiveData != null) {
                mutableLiveData.postValue(r().v());
            }
            return;
        }
        this.f5196e = System.currentTimeMillis();
        oqb.c(String.format("MedalUploadSaveManager > cacheMedalList >> at time %tT", new Date(this.f5196e)));
        HashMap map = new HashMap();
        map.put("flag", 0);
        final lbd<BaseResponse<List<MedalAllListBean>>> lbdVarE = ((wpb) com.heytap.health.network.core.a.j(wpb.class)).e(map);
        final lbd<BaseResponse<MedalUserActList>> lbdVarG = ((wpb) com.heytap.health.network.core.a.j(wpb.class)).g();
        String ssoid = um.c().getSsoid();
        if (TextUtils.isEmpty(ssoid)) {
            this.f5196e = 0L;
            return;
        }
        if (TextUtils.isEmpty(this.g)) {
            this.g = ssoid;
        }
        final lbd<BaseResponse<List<MedalRecordBean>>> lbdVarA = ((wpb) com.heytap.health.network.core.a.j(wpb.class)).a(map);
        O().Q(new d08() { // from class: com.oplus.aiunit.vision.erb
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.B(lbdVarE, lbdVarG, lbdVarA, mutableLiveData, (BaseResponse) obj);
            }
        }).L0(su8.c()).subscribe(new b(mutableLiveData));
    }

    public final boolean k(Throwable th) {
        return (th instanceof TimeoutException) || (th instanceof IOException);
    }

    public final synchronized boolean l() {
        String ssoid = um.c().getSsoid();
        if (Objects.equals(ssoid, this.g)) {
            return false;
        }
        this.g = Objects.toString(ssoid, "");
        if (this.a != null) {
            this.a.clear();
        }
        if (this.b != null) {
            this.b.clear();
        }
        this.f5196e = 0L;
        K();
        oqb.c("updateMedal：account is changed clear medal cache >>> ");
        oqb.b("updateMedal：account is changed clear medal cache >>> ", ssoid, this.g);
        j(null);
        return true;
    }

    public final int m(List<MedalAllListBean> list) {
        int i = 0;
        if (list != null) {
            Iterator<MedalAllListBean> it = list.iterator();
            while (it.hasNext()) {
                List<MedalListBean> medalList = it.next().getMedalList();
                if (medalList != null) {
                    for (MedalListBean medalListBean : medalList) {
                        if (medalListBean != null && medalListBean.getObtainStatus() == 1 && medalListBean.getObtainTime() > 0) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    public MutableLiveData<List<MedalListBean>> n(MutableLiveData<List<MedalListBean>> mutableLiveData) {
        List<MedalListBean> arrayList = new ArrayList<>();
        for (MedalListBean medalListBean : this.b.values()) {
            if (medalListBean.isGet() && medalListBean.getStatus() == 1) {
                arrayList.add(medalListBean);
            }
        }
        Collections.sort(arrayList, new f());
        if (arrayList.size() > 3) {
            arrayList = arrayList.subList(0, 3);
        }
        String json = new Gson().toJson(arrayList);
        qqb.INSTANCE.a(json);
        mutableLiveData.postValue(arrayList);
        oqb.a("getHomeShowMedal > doGetHomeShowMedal > lastedMedal : ", json);
        return mutableLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final synchronized ArrayList o(List<MedalAllListBean> list) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        ?? StartsWith;
        int i4;
        MedalAllListBean medalAllListBean;
        String str;
        int i5;
        int i6;
        boolean z;
        int i7;
        boolean z2;
        arrayList = new ArrayList();
        this.f.clear();
        int i8 = 0;
        int i9 = 0;
        while (i9 < list.size()) {
            MedalAllListBean medalAllListBean2 = list.get(i9);
            List<MedalListBean> medalList = medalAllListBean2.getMedalList();
            if (lza.a(medalList)) {
                i2 = i8;
                i = i9;
            } else {
                List<MedalListBean> listA = MedalHelper.INSTANCE.a(medalList);
                if (listA.isEmpty()) {
                    i2 = i8;
                    i = i9;
                } else {
                    MedalAllListBean medalAllListBean3 = new MedalAllListBean();
                    medalAllListBean3.setMedalNameZN(medalAllListBean2.getMedalNameZN());
                    medalAllListBean3.setMedalNameEN(medalAllListBean2.getMedalNameEN());
                    medalAllListBean3.setMedalSort(medalAllListBean2.getMedalSort());
                    arrayList.add(medalAllListBean3);
                    int i10 = 2;
                    Object[] objArr = new Object[2];
                    objArr[i8] = "MedalUploadSaveManager";
                    objArr[1] = "  - getAllMedal : title: " + medalAllListBean3.getMedalNameZN();
                    oqb.a(objArr);
                    String str2 = "";
                    int i11 = i8;
                    int i12 = i11;
                    int i13 = i12;
                    int i14 = i13;
                    ?? r16 = i14;
                    MedalListBean medalListBean = null;
                    while (i12 < listA.size()) {
                        MedalListBean medalListBean2 = listA.get(i12);
                        String typeCode = medalListBean2.getTypeCode();
                        if (Objects.equals(str2, typeCode)) {
                            i3 = i11;
                        } else {
                            if (i11 == 0 && medalListBean != null) {
                                Object[] objArr2 = new Object[i10];
                                objArr2[i8] = "MedalUploadSaveManager";
                                objArr2[1] = "  - getAllMedal : (last one) sub fitst medal : " + medalListBean2.toString();
                                oqb.a(objArr2);
                                arrayList.add(medalListBean);
                            }
                            i3 = 0;
                            medalListBean = null;
                            StartsWith = typeCode.startsWith("cme_month");
                        }
                        if (StartsWith != 0) {
                            StartsWith = r16;
                            if (medalListBean2.getDisplay() != 1) {
                                oqb.c("MedalUploadSaveManager", "  - getAllMedal : maybe medalList not display : " + medalListBean2.toString());
                            } else {
                                if (this.f.get(typeCode) != null) {
                                    oqb.c("MedalUploadSaveManager", "  - getAllMedal : maybe medalList find next get medal : " + medalListBean2.toString());
                                } else {
                                    LocalDate localDateNow = LocalDate.now();
                                    String[] strArrSplit = medalListBean2.getCode().split("_");
                                    int monthValue = localDateNow.getMonthValue();
                                    int year = localDateNow.getYear();
                                    str = str2;
                                    try {
                                        i4 = i9;
                                        try {
                                            int i15 = Integer.parseInt(strArrSplit[strArrSplit.length - 5]);
                                            int i16 = Integer.parseInt(strArrSplit[strArrSplit.length - 2]);
                                            medalAllListBean = medalAllListBean3;
                                            try {
                                                int i17 = Integer.parseInt(strArrSplit[strArrSplit.length - 3]);
                                                if (year != i15) {
                                                    oqb.c("MedalUploadSaveManager", "  - getAllMedal : time type medal  : year ", Integer.valueOf(year), "medal year ", Integer.valueOf(i15));
                                                    arrayList.add(medalListBean2);
                                                    this.f.put(typeCode, medalListBean2);
                                                } else {
                                                    oqb.c("MedalUploadSaveManager", "  - getAllMedal : time type medal  : time ", Integer.valueOf(monthValue), "medal end month ", Integer.valueOf(i16));
                                                    if (monthValue < i16) {
                                                        this.f.put(typeCode, medalListBean2);
                                                        if (medalListBean != null) {
                                                            arrayList.add(medalListBean);
                                                            i3 = 0;
                                                            medalListBean2 = null;
                                                        } else {
                                                            medalListBean2 = medalListBean;
                                                        }
                                                    } else {
                                                        if (medalListBean2.isGet()) {
                                                            if (i3 != 0 && medalListBean == null) {
                                                                arrayList.remove(arrayList.size() - 1);
                                                            }
                                                            oqb.c("MedalUploadSaveManager", "  - getAllMedal : fond time medal get ", medalListBean2);
                                                            medalListBean = medalListBean2;
                                                            z2 = false;
                                                            i3 = 0;
                                                        } else if (monthValue > i16 || monthValue < i17 || i3 != 0) {
                                                            z2 = true;
                                                        } else {
                                                            if (medalListBean == null) {
                                                                arrayList.add(medalListBean2);
                                                            }
                                                            this.f.put(typeCode, medalListBean2);
                                                            z2 = true;
                                                            i3 = 1;
                                                        }
                                                        if (i12 == listA.size() - 1) {
                                                            if (z2 && !medalListBean2.isGet()) {
                                                                this.f.put(typeCode, medalListBean2);
                                                            }
                                                            if (medalListBean != null) {
                                                                oqb.a("MedalUploadSaveManager", "  - getAllMedal : (last one) sub fitst medal : " + medalListBean.toString());
                                                                arrayList.add(medalListBean);
                                                                i3 = 0;
                                                                medalListBean2 = null;
                                                            }
                                                        }
                                                        medalListBean2 = medalListBean;
                                                    }
                                                    i7 = i3;
                                                    i11 = i7;
                                                    medalListBean = medalListBean2;
                                                    str2 = typeCode;
                                                    i5 = 2;
                                                    i6 = 0;
                                                    z = true;
                                                }
                                            } catch (NumberFormatException e2) {
                                                e = e2;
                                                oqb.c("MedalUploadSaveManager", "  - getAllMedal parseInt error. code=" + medalListBean2.getCode(), e);
                                                y0k.i("code=" + medalListBean2.getCode() + " error");
                                            }
                                        } catch (NumberFormatException e3) {
                                            e = e3;
                                            medalAllListBean = medalAllListBean3;
                                            oqb.c("MedalUploadSaveManager", "  - getAllMedal parseInt error. code=" + medalListBean2.getCode(), e);
                                            y0k.i("code=" + medalListBean2.getCode() + " error");
                                            i5 = 2;
                                            i6 = 0;
                                            z = true;
                                            i11 = i3;
                                            str2 = str;
                                            i12++;
                                            i8 = i6;
                                            medalAllListBean3 = medalAllListBean;
                                            i10 = i5;
                                            i9 = i4;
                                            r16 = StartsWith;
                                        }
                                    } catch (NumberFormatException e4) {
                                        e = e4;
                                        i4 = i9;
                                    }
                                }
                                i5 = 2;
                                i6 = 0;
                                z = true;
                                i11 = i3;
                                str2 = str;
                            }
                            i4 = i9;
                            medalAllListBean = medalAllListBean3;
                            str = str2;
                            i5 = 2;
                            i6 = 0;
                            z = true;
                            i11 = i3;
                            str2 = str;
                        } else {
                            StartsWith = r16;
                            i4 = i9;
                            medalAllListBean = medalAllListBean3;
                            str = str2;
                            if (i3 == 0 && medalListBean2.getDisplay() == 1) {
                                if (medalListBean2.getGetResult() == 0) {
                                    i14++;
                                    this.f.put(typeCode, medalListBean2);
                                    if (medalListBean != null) {
                                        oqb.a("MedalUploadSaveManager", "  - getAllMedal : (middle one has next target) sub fitst medal : " + medalListBean2.toString());
                                        arrayList.add(medalListBean);
                                    } else {
                                        oqb.a("MedalUploadSaveManager", "  - getAllMedal : (fitst one no get) sub fitst medal : " + medalListBean2.toString());
                                        arrayList.add(medalListBean2);
                                    }
                                    medalListBean2 = medalListBean;
                                    i7 = 1;
                                } else {
                                    i13++;
                                    if (i12 == listA.size() - 1) {
                                        oqb.a("MedalUploadSaveManager", "  - getAllMedal : (last one) sub fitst medal : " + medalListBean2.toString());
                                        arrayList.add(medalListBean2);
                                        i7 = i3;
                                        medalListBean2 = null;
                                    } else {
                                        i7 = i3;
                                    }
                                }
                                i11 = i7;
                                medalListBean = medalListBean2;
                                str2 = typeCode;
                                i5 = 2;
                                i6 = 0;
                                z = true;
                            }
                            i5 = 2;
                            i6 = 0;
                            z = true;
                            oqb.c("MedalUploadSaveManager", "  - getAllMedal : maybe medalList not display : " + medalListBean2.toString());
                            i11 = i3;
                            str2 = str;
                        }
                        i12++;
                        i8 = i6;
                        medalAllListBean3 = medalAllListBean;
                        i10 = i5;
                        i9 = i4;
                        r16 = StartsWith;
                    }
                    i = i9;
                    MedalAllListBean medalAllListBean4 = medalAllListBean3;
                    i2 = i8;
                    if (i13 + i14 <= 0) {
                        arrayList.remove(medalAllListBean4);
                    }
                }
            }
            i9 = i + 1;
            i8 = i2;
        }
        return arrayList;
    }

    public MutableLiveData<List<MedalListBean>> p() {
        oqb.c("MedalUploadSaveManager", " getHomeShowMedal >> ");
        return q(false);
    }

    public MutableLiveData<List<MedalListBean>> q(boolean z) {
        oqb.c("MedalUploadSaveManager", " getHomeShowMedal >> ", Boolean.valueOf(z));
        MutableLiveData<List<MedalListBean>> mutableLiveData = new MutableLiveData<>();
        if (!krb.g()) {
            oqb.c("MedalUploadSaveManager", " data is dowloading >> ");
            return n(mutableLiveData);
        }
        n(mutableLiveData);
        noi.h(new e(mutableLiveData));
        return mutableLiveData;
    }

    public synchronized List<MedalAllListBean> s() {
        if (TextUtils.isEmpty(this.g)) {
            this.g = oa2.b();
        }
        if (TextUtils.isEmpty(this.g)) {
            return new ArrayList();
        }
        if (this.a == null || this.a.isEmpty()) {
            String strE = krb.e();
            oqb.b(oa2.b(), " === getMedalAllList === ", strE);
            String strE2 = v9g.x(strE).E(krb.ALLMEDALSTATE + vbb.d(this.g), "");
            this.a = (List) new Gson().fromJson(strE2, new TypeToken<List<MedalAllListBean>>() { // from class: com.heytap.health.operation.medal.MedalUploadSaveManager.1
            }.getType());
            if (this.a != null && !this.a.isEmpty()) {
                oqb.c("=================== getMedalAllList from sp ==========================");
                oqb.b(oa2.b(), "cache from sp ", strE2);
                M();
            }
            oqb.c("getMedalAllList return empty list! mAllMedals=", this.a);
            return new ArrayList();
        }
        N();
        return this.a;
    }

    public MedalListBean t(String str) {
        if (this.b == null || this.b.isEmpty()) {
            s();
        }
        return this.b.get(str);
    }

    public Map<String, List<MedalListBean>> u() {
        if (this.f5195c.isEmpty()) {
            s();
        }
        return this.f5195c;
    }

    public ArrayList v() {
        return l() ? new ArrayList() : o(s());
    }

    public Map<String, MedalListBean> w() {
        if (this.b == null || this.b.isEmpty()) {
            s();
        }
        return this.b;
    }

    public final void x(boolean z) {
        oqb.c("MedalUploadSaveManager", "initFinish  >>>>>>> ", Boolean.valueOf(z));
        if (z) {
            this.d = true;
            oqb.a("MedalUploadSaveManager", "initFinish, status process after fetch data success -->>>> ");
            ((MedalPublicService) x0.d().b("/operation/medal").navigation()).m7(true);
            List<MedalAllListBean> listS = s();
            if (lza.a(listS)) {
                a7b.b("MedalUploadSaveManager", "medalAllList is null!");
                return;
            }
            Iterator<MedalAllListBean> it = listS.iterator();
            MedalListBean medalListBean = null;
            while (it.hasNext()) {
                for (MedalListBean medalListBean2 : it.next().getMedalList()) {
                    if (medalListBean2 != null && medalListBean2.getCode() != null && medalListBean2.getCode().startsWith("cme_month_")) {
                        String[] strArrSplit = medalListBean2.getCode().split("_");
                        a7b.f("MedalUploadSaveManager", "codeParams[2] is " + strArrSplit[2] + ",codeParams[4] is " + strArrSplit[4]);
                        if (strArrSplit[2].equals(String.valueOf(LocalDate.now().plusMonths(1L).getYear())) && strArrSplit[4].equals(String.valueOf(LocalDate.now().plusMonths(1L).getMonth().getValue()))) {
                            a7b.f("MedalUploadSaveManager", "get medal code!!!!");
                            medalListBean = medalListBean2;
                            break;
                        }
                    }
                }
            }
            if (medalListBean != null) {
                vpb.a(medalListBean);
            }
        }
    }

    public boolean y() {
        if (!this.d && !rpc.c()) {
            this.d = !s().isEmpty();
        }
        oqb.c(">>>>>>>>>>>>>>>>>>>>>>>>>>>>> isInitMedal", Boolean.valueOf(this.d));
        return this.d;
    }

    public final boolean z(String str, String str2, Gson gson) {
        try {
            Type type = new TypeToken<List<MedalAllListBean>>() { // from class: com.heytap.health.operation.medal.MedalUploadSaveManager.5
            }.getType();
            List<MedalAllListBean> list = (List) gson.fromJson(str, type);
            List<MedalAllListBean> list2 = (List) gson.fromJson(str2, type);
            if (list == null || list2 == null) {
                oqb.c("MedalUploadSaveManager", "isMedalDataChanged: null list");
                return true;
            }
            int iM = m(list);
            int iM2 = m(list2);
            boolean z = iM2 > iM;
            oqb.c("MedalUploadSaveManager", "isMedalDataChanged: oldObtainedCount=" + iM + ", newObtainedCount=" + iM2 + ", hasNewMedal=" + z);
            return z;
        } catch (Exception e2) {
            oqb.d(e2);
            return true;
        }
    }

    public MedalUploadSaveManager() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.f5195c = new HashMap();
        this.d = false;
        this.f = new HashMap();
        this.g = "";
        DailyStepMedal.INSTANCE.a();
    }
}
