package com.heytap.health.settings.me.account.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.settings.R$id;
import com.heytap.health.settings.R$layout;
import com.heytap.health.settings.R$styleable;

/* JADX INFO: loaded from: classes17.dex */
public class AccountItemView extends ConstraintLayout {
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f5339j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5340l;
    public String m;

    public AccountItemView(@NonNull Context context) {
        super(context);
        e(context, null);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.AccountItemView, 0, 0);
        try {
            this.f5340l = typedArrayObtainStyledAttributes.getString(R$styleable.AccountItemView_mainMsg);
            this.m = typedArrayObtainStyledAttributes.getString(R$styleable.AccountItemView_subMsg);
            this.k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AccountItemView_showArrow, true);
            typedArrayObtainStyledAttributes.recycle();
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.settings_view_account_item, this);
            TextView textView = (TextView) viewInflate.findViewById(R$id.account_item_main_msg);
            this.i = textView;
            textView.setText(!TextUtils.isEmpty(this.f5340l) ? this.f5340l : "");
            this.f5339j = (TextView) viewInflate.findViewById(R$id.account_item_sub_msg);
            if (TextUtils.isEmpty(this.m)) {
                this.f5339j.setVisibility(8);
            } else {
                this.f5339j.setVisibility(0);
                this.f5339j.setText(this.m);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public AccountItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    public AccountItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context, attributeSet);
    }
}
