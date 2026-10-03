package com.heytap.health.family;

import android.view.View;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.family.family.R$id;
import com.heytap.health.healthbase.view.ErrorView;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseFamilyActivity extends BaseActivity implements ErrorView.a {
    public ErrorView m;

    public void A() {
        ErrorView errorView = this.m;
        if (errorView != null) {
            errorView.d();
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public void l7() {
        ErrorView errorView = this.m;
        if (errorView != null) {
            errorView.b();
        }
    }

    public void m7() {
        ErrorView errorView = (ErrorView) findViewById(R$id.view_error);
        this.m = errorView;
        errorView.setOnErrorViewClickListener(this);
    }

    public abstract void n7();

    public void o7(int i) {
        ErrorView errorView = this.m;
        if (errorView != null) {
            errorView.setViewBgColor(i);
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ErrorView errorView = this.m;
        if (errorView != null) {
            errorView.a(this);
        }
    }

    @Override // com.heytap.health.healthbase.view.ErrorView.a
    public void s4() {
        ErrorView errorView = this.m;
        if (errorView != null) {
            errorView.d();
            if (this.m.a(this)) {
                n7();
            }
        }
    }
}
