package com.heytap.health.settings.me.privacycenter;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.coui.appcompat.button.COUIButton;
import com.heytap.health.base.view.BounceNestedScrollView;
import com.heytap.health.settings.R$id;
import com.heytap.health.settings.R$layout;
import com.heytap.health.settings.R$styleable;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.gg2;
import com.support.statement.R$dimen;
import com.support.toolbar.R$drawable;

/* JADX INFO: loaded from: classes17.dex */
public class CustomFullPageStatement extends LinearLayout {
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public COUIButton f5359j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f5360l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f5361n;
    public d o;
    public BounceNestedScrollView p;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CustomFullPageStatement.this.o != null) {
                CustomFullPageStatement.this.o.onBottomButtonClick();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CustomFullPageStatement.this.o != null) {
                CustomFullPageStatement.this.o.onExitButtonClick();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CustomFullPageStatement.this.o != null) {
                CustomFullPageStatement.this.o.a();
            }
        }
    }

    public interface d {
        void a();

        void onBottomButtonClick();

        void onExitButtonClick();
    }

    public CustomFullPageStatement(Context context) {
        this(context, null);
    }

    public final void b() {
        View viewInflate = LayoutInflater.from(this.f5361n).inflate(R$layout.view_custom_full_page_statement, this);
        this.i = (TextView) viewInflate.findViewById(R$id.txt_statement);
        this.f5359j = (COUIButton) viewInflate.findViewById(R$id.btn_confirm);
        this.p = (BounceNestedScrollView) viewInflate.findViewById(R$id.scroll_text);
        this.f5360l = (TextView) viewInflate.findViewById(R$id.txt_exit);
        this.k = (TextView) viewInflate.findViewById(R$id.txt_exit2);
        this.m = (TextView) viewInflate.findViewById(R$id.txt_title);
        TextView textView = this.f5360l;
        Context context = this.f5361n;
        int i = R$drawable.coui_toolbar_text_menu_bg;
        textView.setBackground(AppCompatResources.getDrawable(context, i));
        this.k.setBackground(AppCompatResources.getDrawable(this.f5361n, i));
        this.p.setMaxHeight(ejg.a(viewInflate.getContext(), 226.0f));
        gg2.c(this.i, 2);
        gg2.c(this.f5360l, 4);
        gg2.c(this.k, 4);
        this.f5359j.setOnClickListener(new a());
        this.f5360l.setOnClickListener(new b());
        this.k.setOnClickListener(new c());
    }

    public void c(Context context, AttributeSet attributeSet, int i) {
        this.f5361n = context;
        b();
        TypedArray typedArrayObtainStyledAttributes = this.f5361n.obtainStyledAttributes(attributeSet, R$styleable.CustomFullPageStatement, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.CustomFullPageStatement_exitButtonText);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.CustomFullPageStatement_exitButtonText2);
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.CustomFullPageStatement_bottomButtonText);
        String string4 = typedArrayObtainStyledAttributes.getString(R$styleable.CustomFullPageStatement_fullPageStatementTitleText);
        this.i.setText(typedArrayObtainStyledAttributes.getString(R$styleable.CustomFullPageStatement_appStatement));
        TextView textView = this.f5360l;
        int i2 = R$styleable.CustomFullPageStatement_fullPageStatementTextButtonColor;
        textView.setTextColor(typedArrayObtainStyledAttributes.getColor(i2, 0));
        this.k.setTextColor(typedArrayObtainStyledAttributes.getColor(i2, 0));
        this.i.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.CustomFullPageStatement_fullPageStatementTextColor, 0));
        if (string3 != null) {
            this.f5359j.setText(string3);
        }
        if (string != null) {
            this.f5360l.setText(string);
        }
        if (string2 != null) {
            this.k.setText(string2);
        }
        if (string4 != null) {
            this.m.setText(string4);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public TextView getAppStatementView() {
        return this.i;
    }

    public BounceNestedScrollView getScrollTextView() {
        return this.p;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f5359j.getLayoutParams().width = getContext().createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.coui_full_page_statement_button_width);
        super.onConfigurationChanged(configuration);
    }

    public void setAppStatement(String str) {
        this.i.setText(str);
    }

    public void setAppStatementTextColor(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setButtonListener(d dVar) {
        this.o = dVar;
    }

    public void setButtonText(String str) {
        this.f5359j.setText(str);
    }

    public void setExitButton2Text(String str) {
        this.k.setText(str);
    }

    public void setExitButtonText(String str) {
        this.f5360l.setText(str);
    }

    public void setExitText2Color(int i) {
        TextView textView = this.k;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setExitTextColor(int i) {
        TextView textView = this.f5360l;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitleText(CharSequence charSequence) {
        this.m.setText(charSequence);
    }

    public CustomFullPageStatement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setAppStatement(SpannableString spannableString) {
        this.i.setText(spannableString);
    }

    public void setButtonText(CharSequence charSequence) {
        this.f5359j.setText(charSequence);
    }

    public void setExitButton2Text(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    public void setExitButtonText(CharSequence charSequence) {
        this.f5360l.setText(charSequence);
    }

    public CustomFullPageStatement(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet, i);
    }

    public void setAppStatement(CharSequence charSequence) {
        this.i.setText(charSequence);
    }
}
