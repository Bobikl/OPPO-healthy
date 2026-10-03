package com.heytap.health.operations.router.providers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.ECGRecord;

/* JADX INFO: loaded from: classes17.dex */
public interface IECGService extends IProvider {
    Intent I1(Context context);

    Intent M(boolean z, View view);

    void N6(String str, @Nullable ECGRecord eCGRecord);

    View a5(Activity activity, ECGRecord eCGRecord);

    View v5(Activity activity, ECGRecord eCGRecord);
}
