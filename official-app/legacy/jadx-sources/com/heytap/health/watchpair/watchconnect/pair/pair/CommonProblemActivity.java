package com.heytap.health.watchpair.watchconnect.pair.pair;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.heytap.health.base.R$anim;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.watchpair.R$id;
import com.heytap.health.watchpair.R$layout;

/* JADX INFO: loaded from: classes19.dex */
public class CommonProblemActivity extends BaseActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m7(View view) {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R$anim.lib_base_top_to_bottom_in, R$anim.lib_base_top_to_bottom_out);
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"ResourceType"})
    public void onCreate(@Nullable Bundle bundle) {
        overridePendingTransition(R$anim.lib_base_bottom_to_top_in, R$anim.lib_base_bottom_to_top_out);
        super.onCreate(bundle);
        setContentView(R$layout.activity_pairfailreason);
        ((TextView) findViewById(R$id.cancel_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.bo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.m7(view);
            }
        });
    }
}
