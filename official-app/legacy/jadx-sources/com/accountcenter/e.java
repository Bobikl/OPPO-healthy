package com.accountcenter;

import android.content.Context;
import com.heytap.usercenter.accountsdk.AccountAsyncTask;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.oplus.aiunit.vision.ztf;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends AccountAsyncTask {
    public final /* synthetic */ ztf a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Context context, String str, ztf ztfVar) {
        super(context, str);
        this.b = fVar;
        this.a = ztfVar;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAsyncTask
    public final void onPostExecute(AccountEntity accountEntity) {
        h.a(this.b.b, accountEntity, (CoreResponse) this.a.a(), this.b.f481c);
    }
}
