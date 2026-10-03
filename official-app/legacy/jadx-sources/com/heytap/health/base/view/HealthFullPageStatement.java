package com.heytap.health.base.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.coui.appcompat.button.COUILoadingButton;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.ui.widget.HealthButton;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.gg2;
import com.oplus.aiunit.vision.hx9;
import com.oplus.aiunit.vision.l5h;
import com.support.statement.R$attr;
import com.support.statement.R$styleable;

/* JADX INFO: loaded from: classes15.dex */
public class HealthFullPageStatement extends LinearLayout {
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public COUILoadingButton f3289j;
    public HealthButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public COUIToolbar f3290l;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BounceNestedScrollView f3291n;
    public final int o;
    public TextView p;
    public TextView q;

    public interface a {
        void onBottomButtonClick();

        void onExitButtonClick();
    }

    public HealthFullPageStatement(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f3289j.F();
        a aVar = this.m;
        if (aVar != null) {
            aVar.onBottomButtonClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        a aVar = this.m;
        if (aVar != null) {
            aVar.onExitButtonClick();
        }
    }

    public final void c() {
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(hx9.b(getContext()) ? R$layout.lib_base_color_full_statement_in_secondary : R$layout.lib_base_color_full_statement, this);
        this.i = (TextView) viewInflate.findViewById(R$id.txt_statement);
        this.f3289j = (COUILoadingButton) viewInflate.findViewById(R$id.btn_confirm);
        this.f3291n = (BounceNestedScrollView) viewInflate.findViewById(R$id.scroll_text);
        this.k = (HealthButton) viewInflate.findViewById(R$id.txt_exit);
        this.q = (TextView) viewInflate.findViewById(R$id.txt_3);
        this.f3290l = (COUIToolbar) viewInflate.findViewById(R$id.txt_title);
        this.p = (TextView) viewInflate.findViewById(R$id.txt_second_statement);
        this.f3291n.setMaxHeight(ejg.a(viewInflate.getContext(), 248.0f));
        gg2.c(this.i, 2);
        this.f3289j.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ar8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.d(view);
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.br8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.e(view);
            }
        });
    }

    public void f() {
        COUILoadingButton cOUILoadingButton = this.f3289j;
        if (cOUILoadingButton != null) {
            cOUILoadingButton.E();
        }
    }

    public TextView getAppSecondStatementView() {
        return this.p;
    }

    public TextView getAppStatement() {
        return this.i;
    }

    public TextView getAppStatementView() {
        return this.i;
    }

    public BounceNestedScrollView getScrollTextView() {
        return this.f3291n;
    }

    public TextView getTextView3() {
        return this.q;
    }

    public COUIToolbar getTitleView() {
        return this.f3290l;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    public void setAppStatement(CharSequence charSequence) {
        this.i.setText(charSequence);
    }

    public void setAppStatementTextColor(int i) {
        this.i.setTextColor(i);
    }

    public void setButtonDrawableColor(int i) {
        this.f3289j.setDrawableColor(i);
    }

    public void setButtonListener(a aVar) {
        this.m = aVar;
    }

    public void setButtonText(CharSequence charSequence) {
        this.f3289j.setText(charSequence);
    }

    public void setExitButtonText(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    public void setExitButtonTextColor(int i) {
        this.k.setTextColor(i);
    }

    public void setExitTextColor(int i) {
        this.k.setTextColor(i);
    }

    public void setSecondStatement(SpannableString spannableString) {
        this.p.setVisibility(0);
        this.p.setText(spannableString);
    }

    public void setTitleText(CharSequence charSequence) {
        this.f3290l.setTitle(charSequence);
        this.f3290l.setIsTitleCenterStyle(true);
    }

    public HealthFullPageStatement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiFullPageStatementStyle);
    }

    public void setAppStatement(String str) {
        this.i.setText(str);
    }

    public HealthFullPageStatement(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public void setAppStatement(SpannableString spannableString) {
        this.i.setText(spannableString);
    }

    public HealthFullPageStatement(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.o = attributeSet.getStyleAttribute();
        } else {
            this.o = i;
        }
        c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIFullPageStatement, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.COUIFullPageStatement_exitButtonText);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.COUIFullPageStatement_bottomButtonText);
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.COUIFullPageStatement_couiFullPageStatementTitleText);
        this.i.setText(typedArrayObtainStyledAttributes.getString(R$styleable.COUIFullPageStatement_appStatement));
        this.i.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.COUIFullPageStatement_couiFullPageStatementTextColor, getContext().getColor(R$color.lib_base_8A000000)));
        if (string2 != null) {
            this.f3289j.setText(string2);
        }
        if (string != null) {
            this.k.setText(string);
            new l5h(this.k, 5);
        }
        if (string3 != null) {
            this.f3290l.setTitle(string3);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
