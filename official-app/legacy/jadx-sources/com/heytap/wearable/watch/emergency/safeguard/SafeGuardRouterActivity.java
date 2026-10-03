package com.heytap.wearable.watch.emergency.safeguard;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.mmd;
import com.oplus.aiunit.vision.pag;
import com.oplus.aiunit.vision.vda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/SafeGuardRouterActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", LogFieldKey.MESSAGE_KEY, "Ljava/lang/String;", "tag", "<init>", "()V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SafeGuardRouterActivity extends BaseActivity {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String tag = "HSG_RouterActivity";

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String strK = vda.k(getIntent(), pag.KEY_SAFE_GUARD_URL);
        if (strK != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("url: ");
            sb.append(strK);
            mmd.c().a(Uri.parse(strK), null);
        }
        finish();
    }
}
