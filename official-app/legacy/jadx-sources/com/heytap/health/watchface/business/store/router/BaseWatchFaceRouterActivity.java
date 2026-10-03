package com.heytap.health.watchface.business.store.router;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.R$style;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseWatchFaceRouterActivity extends BaseActivity {
    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public abstract void l7();

    public abstract boolean m7();

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        setTheme(R$style.watch_face_router);
        super.onCreate(bundle);
        setContentView(R$layout.watch_face_activity_push_new_watch_face);
        if (m7()) {
            l7();
        } else {
            finish();
        }
    }
}
