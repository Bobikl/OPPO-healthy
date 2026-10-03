package com.oplus.aiunit.vision;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.business.creation.base.edit.BaseEditActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class j21 extends jf6 {
    public static final String TAG = "BaseEditPresenter";
    public String A;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y = -1;
    public String z = "";

    public class a implements l6h<List<vd4>> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.l6h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<vd4> list) {
            kf6 kf6Var = (kf6) j21.this.j();
            if (kf6Var == null) {
                ltl.b(j21.TAG, "[prepareRecords] --> error,view is null");
            } else if (list != null && list.size() > 0) {
                kf6Var.E(list);
            } else {
                kf6Var.E(new ArrayList());
                ltl.b(j21.TAG, "[prepareRecords] --> error,view or records is null");
            }
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            ltl.b(j21.TAG, "[onError] --> error=" + th.getMessage());
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(x5h x5hVar) throws Throwable {
        boolean z;
        List<ud4> listW = com.heytap.health.watchface.business.creation.db.a.a().w(this.u, getDeviceMac());
        if (!listW.isEmpty()) {
            boolean zW = W();
            ltl.a(TAG, "prepareRecords onGetRecords " + listW + " isByStyleUnique " + zW);
            if (zW) {
                BaseWatchFaceBean baseWatchFaceBeanA = ial.a(this.q, this.A);
                if (baseWatchFaceBeanA == null) {
                    ltl.i(TAG, "[prepareRecords] styleUnique not find wfBean ");
                    listW.get(0).f = true;
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= listW.size()) {
                            z = false;
                            break;
                        }
                        if (TextUtils.equals(baseWatchFaceBeanA.getStyleUnique(), listW.get(i).b)) {
                            listW.get(i).f = true;
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (!z) {
                        listW.get(0).f = true;
                    }
                }
            } else {
                int i2 = this.y;
                if (i2 < 0 || i2 >= listW.size()) {
                    listW.get(0).f = true;
                    ltl.b(TAG, "[prepareRecords] --> with wrong styleIndex");
                } else {
                    listW.get(this.y).f = true;
                }
            }
        }
        ltl.a(TAG, "prepareRecords after onGetRecords " + listW);
        x5hVar.onSuccess(vd4.b(listW));
    }

    @Override // com.oplus.aiunit.vision.qa1
    public void D(Bundle bundle) {
        List<BaseWatchFaceBean> listK = this.q.k();
        this.A = sd4.d(this.q, this.u);
        for (BaseWatchFaceBean baseWatchFaceBean : listK) {
            if (TextUtils.equals(baseWatchFaceBean.getWfUnique(), this.A)) {
                this.w = baseWatchFaceBean.isCurrent();
                this.y = baseWatchFaceBean.getCurrentStyleIndex();
                this.z = baseWatchFaceBean.getStyleUnique();
                break;
            }
        }
        if (this.y == -1 && this.u == 1 && !this.v) {
            this.y = 0;
        }
        if (this.u == 0) {
            ltl.b(TAG, "[confirmCreationType] --> error, type=0");
        }
        X();
    }

    @Override // com.oplus.aiunit.vision.jf6
    public boolean R() {
        return this.v;
    }

    @Override // com.oplus.aiunit.vision.jf6
    public int S() {
        return this.u;
    }

    @Override // com.oplus.aiunit.vision.jf6
    public int T() {
        return this.y;
    }

    @Override // com.oplus.aiunit.vision.jf6
    public String U() {
        return this.z;
    }

    @Override // com.oplus.aiunit.vision.jf6
    public boolean V() {
        return this.w;
    }

    @Override // com.oplus.aiunit.vision.jf6
    public boolean W() {
        i11 i11Var = this.q;
        if (i11Var != null) {
            return i11Var.e().isNewCreationInteractive();
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.jf6
    public void X() {
        f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.i21
            @Override // com.oplus.aiunit.vision.o6h
            public final void a(x5h x5hVar) throws Throwable {
                this.a.c0(x5hVar);
            }
        }).y(su8.c()).s(f30.c()).b(new a());
    }

    @Override // com.oplus.aiunit.vision.jf6
    public void Y(int i) {
        this.y = i;
    }

    @Override // com.oplus.aiunit.vision.jf6
    public void Z(String str) {
        this.z = str;
    }

    @Override // com.oplus.aiunit.vision.qa1, com.oplus.aiunit.vision.q11, com.oplus.aiunit.vision.ja1
    public void k(Intent intent) {
        if (intent != null) {
            super.k(intent);
            this.u = intent.getIntExtra("tag_type", 0);
            this.v = intent.getBooleanExtra(BaseEditActivity.TAG_ADD_NEW, false);
            this.x = intent.getBooleanExtra(BaseEditActivity.TAG_JUMP, true);
        }
    }
}
