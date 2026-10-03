package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;

/* JADX INFO: loaded from: classes13.dex */
public class nsg implements po9 {
    @Override // com.oplus.aiunit.vision.po9
    public boolean a(int i, Bundle bundle, bm9 bm9Var) {
        if (bundle != null && bm9Var != null) {
            if (i == 1) {
                Authorization.Request request = new Authorization.Request(bundle);
                if (!request.checkArgs()) {
                    return false;
                }
                String str = request.scope;
                if (str != null) {
                    request.scope = str.replace(" ", "");
                }
                String str2 = request.optionalScope1;
                if (str2 != null) {
                    request.optionalScope1 = str2.replace(" ", "");
                }
                String str3 = request.optionalScope0;
                if (str3 != null) {
                    request.optionalScope0 = str3.replace(" ", "");
                }
                bm9Var.b(request);
                return true;
            }
            if (i == 2) {
                v81 response = new Authorization.Response(bundle);
                if (response.checkArgs()) {
                    bm9Var.c(response);
                    return true;
                }
            }
        }
        return false;
    }
}
