package com.heytap.health.watchface.business.creation.utils;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.health.base.base.BaseIntentService;
import com.oplus.aiunit.vision.i11;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.ntl;
import com.oplus.aiunit.vision.sd4;
import com.oplus.aiunit.vision.td4;
import com.oplus.aiunit.vision.vda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class CreationOperateService extends BaseIntentService {
    public static final String TAG = "CreationOperateService";

    public CreationOperateService() {
        super(TAG);
    }

    public static void a(Context context, String str, String str2, int i) throws Exception {
        Intent intent = new Intent(context, (Class<?>) CreationOperateService.class);
        intent.putExtra("bundle_cmd", 1);
        intent.putExtra("bundle_wf_device_mac", str);
        intent.putExtra("bundle_wf_unique_id", str2);
        intent.putExtra("bundle_wf_style_index", i);
        context.startService(intent);
    }

    public final void b(@NotNull Intent intent) {
        String strK = vda.k(intent, "bundle_wf_unique_id");
        i11 i11VarJ = ntl.m().j(vda.k(intent, "bundle_wf_device_mac"));
        if (i11VarJ == null) {
            ltl.i(TAG, "[setCurrentWf] currentDataManager = null.");
            return;
        }
        if (TextUtils.isEmpty(strK)) {
            strK = sd4.d(i11VarJ, vda.f(intent, "bundle_wf_type", 0));
        }
        int iF = vda.f(intent, "bundle_wf_style_index", 0);
        if (TextUtils.isEmpty(strK)) {
            ltl.i(TAG, "[setCurrentWf]--> empty operateWfUnique");
        } else {
            td4.c(i11VarJ, strK, iF);
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        if (intent == null) {
            ltl.i(TAG, "[onHandleIntent]--> intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("bundle_cmd", 0);
        if (intExtra == 1) {
            b(intent);
            return;
        }
        ltl.i(TAG, "[onHandleIntent] no cmd handle,cmd = " + intExtra);
    }
}
