package com.oplus.aiunit.vision;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class xdl extends vdl {
    public static final String STORE_URL = "store_url";
    public static final String TAG = "WatchFaceStoreDetailPresenter";
    public String o;

    @Override // com.oplus.aiunit.vision.la1, com.oplus.aiunit.vision.q11, com.oplus.aiunit.vision.ja1
    public void k(Intent intent) {
        super.k(intent);
        this.o = intent.getStringExtra("store_url");
    }

    @Override // com.oplus.aiunit.vision.la1
    public void u(Bundle bundle) {
        if (TextUtils.isEmpty(this.o)) {
            ltl.i(TAG, "[initDataAfterSync] storeUrl is empty,and return.");
            r();
        } else if (j() != 0) {
            ((wdl) j()).c3(this.o);
        }
    }
}
