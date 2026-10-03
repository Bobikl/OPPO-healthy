package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.bytedance.sdk.open.douyin.model.OpenRecord;

/* JADX INFO: loaded from: classes13.dex */
public class flm implements po9 {
    @Override // com.oplus.aiunit.vision.po9
    public boolean a(int i, Bundle bundle, bm9 bm9Var) {
        if (bundle != null && bm9Var != null) {
            if (i == 7) {
                OpenRecord.Request request = new OpenRecord.Request(bundle);
                if (!request.checkArgs()) {
                    return false;
                }
                bm9Var.b(request);
                return true;
            }
            if (i == 8) {
                OpenRecord.Response response = new OpenRecord.Response(bundle);
                if (response.checkArgs()) {
                    bm9Var.c(response);
                    return true;
                }
            }
        }
        return false;
    }
}
