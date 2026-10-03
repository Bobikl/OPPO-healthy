package com.heytap.health.step.detail.ui.stephistory2.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.step.R$id;
import com.heytap.health.step.R$layout;
import com.heytap.health.step.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class StepDetailCardItemView extends ConstraintLayout {
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f6012j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6013l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f6014n;
    public int o;
    public ImageView p;

    public StepDetailCardItemView(@NonNull Context context) {
        super(context);
        this.f6013l = false;
        e(context, null);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.step_StepDetailCardItemView, 0, 0);
        try {
            this.m = typedArrayObtainStyledAttributes.getString(R$styleable.step_StepDetailCardItemView_step_card_mainMsg);
            this.f6014n = typedArrayObtainStyledAttributes.getString(R$styleable.step_StepDetailCardItemView_step_card_subMsg);
            typedArrayObtainStyledAttributes.recycle();
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.step_card_detail_item, this);
            TextView textView = (TextView) viewInflate.findViewById(R$id.detail_item_main_msg);
            this.f6012j = textView;
            textView.setText(!TextUtils.isEmpty(this.m) ? this.m : "");
            this.k = (TextView) viewInflate.findViewById(R$id.detail_item_sub_msg);
            this.i = (ImageView) viewInflate.findViewById(R$id.arrow);
            this.p = (ImageView) viewInflate.findViewById(R$id.divider_line);
            if (TextUtils.isEmpty(this.f6014n)) {
                this.k.setVisibility(8);
            } else {
                this.k.setVisibility(0);
                this.k.setText(this.f6014n);
            }
            if (this.f6013l) {
                this.p.setVisibility(0);
            } else {
                this.p.setVisibility(8);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public StepDetailCardItemView f(int i) {
        this.o = i;
        return this;
    }

    public StepDetailCardItemView g(String str) {
        this.m = str;
        this.f6012j.setText(str);
        return this;
    }

    public int getCardId() {
        return this.o;
    }

    public String getSubMsg() {
        return this.f6014n;
    }

    public StepDetailCardItemView h(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        return this;
    }

    public StepDetailCardItemView i(boolean z) {
        this.f6013l = z;
        if (z) {
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(8);
        }
        return this;
    }

    public StepDetailCardItemView j(String str) {
        this.f6014n = str;
        this.k.setText(str);
        this.k.setVisibility(0);
        return this;
    }

    public StepDetailCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6013l = false;
        e(context, attributeSet);
    }

    public StepDetailCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6013l = false;
        e(context, attributeSet);
    }
}
