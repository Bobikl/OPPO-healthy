package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;
import com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfo;
import com.heytap.health.protocol.dm.DMProto$OpenSourceAppListInfo;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Request;

/* JADX INFO: loaded from: classes18.dex */
public class xld {
    public MutableLiveData<ub0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public aid f18670c = new a();
    public wt9 a = (wt9) com.heytap.health.network.core.a.j(wt9.class);

    public class a implements aid {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.aid
        public void a(int i, int i2, byte[] bArr) {
            if (i == 1 && i2 == 118) {
                try {
                    ArrayList arrayList = new ArrayList();
                    DMProto$OpenSourceAppListInfo from = DMProto$OpenSourceAppListInfo.parseFrom(bArr);
                    int dataCount = from.getDataCount();
                    StringBuilder sb = new StringBuilder();
                    sb.append("notifyMessageReceived, count:");
                    sb.append(dataCount);
                    for (int i3 = 0; i3 < dataCount; i3++) {
                        DMProto$OpenSourceAppInfo data = from.getData(i3);
                        xa0 xa0Var = new xa0();
                        xa0Var.a = data.getName();
                        xa0Var.b = data.getPackage();
                        xa0Var.f18550c = data.getVersion();
                        arrayList.add(xa0Var);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("reveive AppList:");
                        sb2.append(xa0Var);
                    }
                    xld.this.m(0, arrayList);
                } catch (Exception e2) {
                    a7b.m("OpenSourceRepository", "notifyMessageReceived exception:" + e2.getMessage());
                    xld.this.m(-1, null);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.aid
        public void b(int i, int i2, byte[] bArr) {
            if (i == 1 && i2 == 118) {
                xld.this.m(-1, null);
            }
        }
    }

    public class b extends u61<yrf> {
        public final /* synthetic */ MutableLiveData i;

        public b(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("getMachineOpenSourceStatement, error:");
            sb.append(str);
            xld.this.l(-1, null, this.i);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(yrf yrfVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("getMachineOpenSourceStatement:");
            sb.append(yrfVar);
            xld.this.l(0, yrfVar == null ? null : yrfVar.a(), this.i);
        }
    }

    public class c extends u61<yrf> {
        public final /* synthetic */ MutableLiveData i;

        public c(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("getAppOpenSourceStatement, error:");
            sb.append(str);
            xld.this.l(-1, null, this.i);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(yrf yrfVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("getAppOpenSourceStatement:");
            sb.append(yrfVar);
            xld.this.l(0, yrfVar == null ? null : yrfVar.a(), this.i);
        }
    }

    public class d extends u61<orf> {
        public final /* synthetic */ MutableLiveData i;

        public d(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            xld.this.k(-1, null, this.i);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(orf orfVar) {
            xld.this.k(0, orfVar == null ? null : orfVar.a(), this.i);
        }
    }

    public class e extends ao0<ytf> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f18674j;

        public e(MutableLiveData mutableLiveData) {
            this.f18674j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(ytf ytfVar) {
            if (this.f18674j == null) {
                return;
            }
            try {
                InputStream inputStreamA = ytfVar.getBody().a();
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStreamA.read(bArr);
                    if (i == -1) {
                        kc7 kc7Var = new kc7();
                        kc7Var.d(ytfVar.getCode());
                        kc7Var.c(sb);
                        this.f18674j.postValue(kc7Var);
                        return;
                    }
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception e2) {
                a7b.b("OpenSourceRepository", "read stream error:" + e2.getMessage());
                onError(new Exception(e2.getMessage()));
            }
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            if (this.f18674j != null) {
                kc7 kc7Var = new kc7();
                kc7Var.d(-1);
                this.f18674j.postValue(kc7Var);
            }
        }
    }

    public xld() {
        kr0.e().g(1, this.f18670c);
    }

    public static /* synthetic */ void n(String str, ccd ccdVar) throws Throwable {
        ccdVar.onNext(new efd().a(new Request.Builder().url(str).build()).execute());
        ccdVar.onComplete();
    }

    public void e(List<aqf> list, MutableLiveData<orf> mutableLiveData) {
        this.a.c(list).L0(su8.c()).subscribe(new d(mutableLiveData));
    }

    public void f() {
        kr0.e().y(1, this.f18670c);
    }

    public void g(final String str, MutableLiveData<kc7> mutableLiveData) {
        lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.wld
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                xld.n(str, ccdVar);
            }
        }).L0(su8.c()).subscribe(new e(mutableLiveData));
    }

    public void h(String str, int i, MutableLiveData<yrf> mutableLiveData) {
        StringBuilder sb = new StringBuilder();
        sb.append("getAppOpenSource, package:");
        sb.append(str);
        sb.append(",version:");
        sb.append(i);
        aqf aqfVar = new aqf();
        aqfVar.a = str;
        aqfVar.b = i;
        this.a.b(aqfVar).L0(su8.c()).subscribe(new c(mutableLiveData));
    }

    public void i(MutableLiveData<ub0> mutableLiveData) {
        this.b = mutableLiveData;
        kr0.e().p();
    }

    public void j(String str, String str2, MutableLiveData<yrf> mutableLiveData) {
        StringBuilder sb = new StringBuilder();
        sb.append("getMachineOpenSource, model:");
        sb.append(str);
        sb.append(",version:");
        sb.append(str2);
        bqf bqfVar = new bqf();
        bqfVar.a = str;
        bqfVar.b = str2;
        this.a.a(bqfVar).L0(su8.c()).subscribe(new b(mutableLiveData));
    }

    public final void k(int i, List<aqf> list, MutableLiveData<orf> mutableLiveData) {
        if (mutableLiveData == null) {
            a7b.m("OpenSourceRepository", "handleCheckAppListHttpResult liveData is null");
            return;
        }
        orf orfVar = new orf();
        orfVar.b = i;
        orfVar.a = list;
        mutableLiveData.postValue(orfVar);
    }

    public final void l(int i, String str, MutableLiveData<yrf> mutableLiveData) {
        if (mutableLiveData == null) {
            a7b.m("OpenSourceRepository", "handleHttpResult liveData is null");
            return;
        }
        yrf yrfVar = new yrf();
        yrfVar.b = i;
        yrfVar.a = str;
        mutableLiveData.postValue(yrfVar);
    }

    public final void m(int i, List<xa0> list) {
        if (this.b != null) {
            ub0 ub0Var = new ub0();
            ub0Var.d(i);
            ub0Var.c(list);
            this.b.postValue(ub0Var);
        }
    }
}
