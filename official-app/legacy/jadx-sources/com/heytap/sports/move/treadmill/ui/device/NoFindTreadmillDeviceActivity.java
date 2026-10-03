package com.heytap.sports.move.treadmill.ui.device;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.sports.R$id;
import com.heytap.sports.R$layout;

/* JADX INFO: loaded from: classes2.dex */
@Route(path = "/sports/NoFindTreadmillDeviceActivity")
public class NoFindTreadmillDeviceActivity extends BaseActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m7(View view) {
        finish();
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_nofind_treadmilldevice);
        findViewById(R$id.tv_nofind_device_close).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ysc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.m7(view);
            }
        });
    }
}
