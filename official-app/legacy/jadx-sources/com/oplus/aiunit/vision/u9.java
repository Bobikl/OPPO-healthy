package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.sdk.teenageauth.AcTeenagerVerifyResult;

/* JADX INFO: loaded from: classes6.dex */
public interface u9 {
    void startTeenageVerifyForResult(Context context, String str, String str2, @NonNull c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var);
}
