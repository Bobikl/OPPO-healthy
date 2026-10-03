package com.heytap.health.base.view.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.R$string;
import com.heytap.health.base.view.HealthFullPageStatement;

/* JADX INFO: loaded from: classes15.dex */
public class FullPageStatementLayout extends FrameLayout {
    public HealthFullPageStatement i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f3319j;

    public class a implements HealthFullPageStatement.a {
        public a() {
        }

        @Override // com.heytap.health.base.view.HealthFullPageStatement.a
        public void onBottomButtonClick() {
            if (FullPageStatementLayout.this.f3319j != null) {
                FullPageStatementLayout.this.f3319j.e();
            }
        }

        @Override // com.heytap.health.base.view.HealthFullPageStatement.a
        public void onExitButtonClick() {
            if (FullPageStatementLayout.this.f3319j != null) {
                FullPageStatementLayout.this.f3319j.d();
            }
        }
    }

    public interface b {
        void d();

        void e();
    }

    public FullPageStatementLayout(@NonNull Context context) {
        this(context, false);
    }

    @SuppressLint({"MissingInflatedId"})
    public final void b(Context context, boolean z) {
        HealthFullPageStatement healthFullPageStatement = (HealthFullPageStatement) LayoutInflater.from(context).inflate(z ? R$layout.lib_base_full_screen_statement : R$layout.lib_base_full_page_statement, this).findViewById(R$id.full_page_statement);
        this.i = healthFullPageStatement;
        healthFullPageStatement.setButtonText(context.getString(R$string.lib_base_agree_and_continue));
        this.i.setExitButtonText(context.getString(R$string.lib_base_not_agree));
        this.i.setButtonListener(new a());
    }

    public void c(String str, String str2) {
        this.i.setButtonText(str);
        this.i.setExitButtonText(str2);
    }

    public void d(boolean z) {
        this.i.getTitleView().setVisibility(z ? 0 : 8);
    }

    public TextView getAppSecondStatementView() {
        return this.i.getAppSecondStatementView();
    }

    public TextView getAppStatementView() {
        return this.i.getAppStatementView();
    }

    public void setExitButtonTextColor(int i) {
        this.i.setExitButtonTextColor(i);
    }

    public void setListener(b bVar) {
        this.f3319j = bVar;
    }

    public void setStatement(String str) {
        this.i.setAppStatement(str);
    }

    public void setTitleText(String str) {
        this.i.setTitleText(str);
    }

    public FullPageStatementLayout(@NonNull Context context, boolean z) {
        super(context);
        b(context, z);
    }

    public void setStatement(SpannableString spannableString) {
        this.i.setAppStatement(spannableString);
    }

    public FullPageStatementLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, false);
    }

    public FullPageStatementLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, false);
    }
}
