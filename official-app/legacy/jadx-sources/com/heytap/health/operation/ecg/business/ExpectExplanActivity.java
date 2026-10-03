package com.heytap.health.operation.ecg.business;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.R$string;
import com.heytap.sporthealth.blib.basic.ui.BasicActivity;

/* JADX INFO: loaded from: classes17.dex */
public class ExpectExplanActivity extends BasicActivity {
    public static void V7(Context context) {
        context.startActivity(new Intent(context, (Class<?>) ExpectExplanActivity.class));
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicActivity
    public Class I7() {
        return null;
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicActivity
    public int K7() {
        return R$layout.ecg_activity_expect_explan;
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicActivity
    public void initView() {
        Q7(null);
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicActivity, android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle(getString(R$string.ecg_title_expert_explan));
    }
}
