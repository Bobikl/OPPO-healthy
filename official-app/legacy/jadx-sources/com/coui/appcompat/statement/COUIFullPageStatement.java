package com.coui.appcompat.statement;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.coui.appcompat.button.COUIButton;
import com.oplus.aiunit.vision.gg2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.statement.R$attr;
import com.support.statement.R$dimen;
import com.support.statement.R$id;
import com.support.statement.R$layout;
import com.support.statement.R$style;
import com.support.statement.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIFullPageStatement extends LinearLayout {
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public COUIButton f2090j;
    public COUIButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2091l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public COUIButton f2092n;
    public TextView o;
    public LayoutInflater p;
    public Context q;
    public f r;
    public COUIMaxHeightScrollView s;
    public ScrollView t;
    public LinearLayoutCompat u;
    public int v;
    public int w;
    public COUIMaxHeightScrollView x;
    public LinearLayout y;
    public LinearLayout z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (COUIFullPageStatement.this.r != null) {
                COUIFullPageStatement.this.r.onBottomButtonClick();
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (COUIFullPageStatement.this.r != null) {
                COUIFullPageStatement.this.r.onExitButtonClick();
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (COUIFullPageStatement.this.r != null) {
                COUIFullPageStatement.this.r.onBottomButtonClick();
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (COUIFullPageStatement.this.r != null) {
                COUIFullPageStatement.this.r.onExitButtonClick();
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class e implements Runnable {

        public class a implements View.OnTouchListener {
            public a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (COUIFullPageStatement.this.x.getHeight() < COUIFullPageStatement.this.x.getMaxHeight()) {
                COUIFullPageStatement.this.x.setOnTouchListener(new a());
            }
        }
    }

    public interface f {
        void onBottomButtonClick();

        void onExitButtonClick();
    }

    public COUIFullPageStatement(Context context) {
        this(context, null);
    }

    public final void c() {
        if (this.x == null) {
            return;
        }
        post(new e());
    }

    public final void d() {
        LayoutInflater layoutInflater = (LayoutInflater) this.q.getSystemService("layout_inflater");
        this.p = layoutInflater;
        View viewInflate = layoutInflater.inflate(this.w, this);
        this.i = (TextView) viewInflate.findViewById(R$id.txt_statement);
        this.s = (COUIMaxHeightScrollView) viewInflate.findViewById(R$id.scroll_text);
        this.f2091l = g(this.q.getResources().getConfiguration()) && !f(this.q.getResources().getConfiguration());
        this.m = (TextView) viewInflate.findViewById(R$id.txt_exit);
        this.f2090j = (COUIButton) viewInflate.findViewById(R$id.btn_confirm);
        if (e()) {
            this.f2092n = (COUIButton) viewInflate.findViewById(R$id.btn_exit_land);
            this.k = (COUIButton) viewInflate.findViewById(R$id.btn_confirm_land);
            this.z = (LinearLayout) viewInflate.findViewById(R$id.button_layout_land);
            this.y = (LinearLayout) viewInflate.findViewById(R$id.button_layout_normal);
            this.k.setSingleLine(false);
            this.k.setMaxLines(2);
            this.k.setOnClickListener(new a());
            this.f2092n.setOnClickListener(new b());
        }
        this.o = (TextView) viewInflate.findViewById(R$id.txt_title);
        this.x = (COUIMaxHeightScrollView) viewInflate.findViewById(R$id.title_scroll_view);
        this.t = (ScrollView) viewInflate.findViewById(R$id.scroll_button);
        this.u = (LinearLayoutCompat) viewInflate.findViewById(R$id.custom_functional_area);
        h();
        c();
        gg2.c(this.i, 2);
        this.f2090j.setSingleLine(false);
        this.f2090j.setMaxLines(2);
        this.f2090j.setOnClickListener(new c());
        this.m.setOnClickListener(new d());
        gg2.c(this.m, 4);
    }

    public final boolean e() {
        return this.w == R$layout.coui_full_page_statement;
    }

    public final boolean f(@NonNull Configuration configuration) {
        return configuration.orientation == 1;
    }

    public final boolean g(Configuration configuration) {
        return configuration.smallestScreenWidthDp < 480;
    }

    public TextView getAppStatement() {
        return this.i;
    }

    public COUIButton getConfirmButton() {
        return (this.f2091l && e()) ? this.k : this.f2090j;
    }

    public TextView getExitButton() {
        return (this.f2091l && e()) ? this.f2092n : this.m;
    }

    public COUIMaxHeightScrollView getScrollTextView() {
        return this.s;
    }

    public void h() {
        if (e()) {
            if (this.f2091l) {
                this.y.setVisibility(8);
                this.z.setVisibility(0);
            } else {
                this.y.setVisibility(0);
                this.z.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.w == R$layout.coui_full_page_statement_tiny) {
            return;
        }
        boolean z = g(configuration) && !f(configuration);
        if (!z) {
            this.f2090j.getLayoutParams().width = getContext().createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.coui_full_page_statement_button_width);
        }
        if (this.f2091l != z) {
            this.f2091l = z;
            h();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.w == R$layout.coui_full_page_statement_tiny) {
            ViewParent parent = this.t.getParent();
            if (parent instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) parent;
                int bottom = ((linearLayout.getBottom() - linearLayout.getTop()) - this.t.getTop()) - this.t.getMeasuredHeight();
                ScrollView scrollView = this.t;
                scrollView.layout(scrollView.getLeft(), this.t.getTop() + bottom, this.t.getRight(), this.t.getBottom() + bottom);
            }
        }
    }

    public void setAppStatement(CharSequence charSequence) {
        this.i.setText(charSequence);
    }

    public void setAppStatementTextColor(int i) {
        this.i.setTextColor(i);
    }

    public void setButtonDisableColor(int i) {
        this.f2090j.setDisabledColor(i);
        if (e()) {
            this.k.setDisabledColor(i);
        }
    }

    public void setButtonDrawableColor(int i) {
        this.f2090j.setDrawableColor(i);
        if (e()) {
            this.k.setDrawableColor(i);
        }
    }

    public void setButtonListener(f fVar) {
        this.r = fVar;
    }

    public void setButtonText(CharSequence charSequence) {
        this.f2090j.setText(charSequence);
        if (e()) {
            this.k.setText(charSequence);
        }
    }

    public void setCustomView(View view) {
        LinearLayoutCompat linearLayoutCompat = this.u;
        if (linearLayoutCompat != null) {
            if (view == null) {
                linearLayoutCompat.removeAllViews();
                this.u.setVisibility(8);
            } else {
                linearLayoutCompat.setVisibility(0);
                this.u.removeAllViews();
                this.u.addView(view);
            }
        }
    }

    public void setExitButtonText(CharSequence charSequence) {
        if (e()) {
            this.f2092n.setText(charSequence);
        }
        this.m.setText(charSequence);
    }

    public void setExitTextColor(int i) {
        this.m.setTextColor(i);
    }

    public void setStatementMaxHeight(int i) {
        this.s.setMaxHeight(i);
    }

    public void setTitleText(CharSequence charSequence) {
        this.o.setText(charSequence);
    }

    public COUIFullPageStatement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiFullPageStatementStyle);
    }

    public COUIFullPageStatement(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_COUI_COUIFullPageStatement);
    }

    public COUIFullPageStatement(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.q = context;
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.v = attributeSet.getStyleAttribute();
        } else {
            this.v = i;
        }
        TypedArray typedArrayObtainStyledAttributes = this.q.obtainStyledAttributes(attributeSet, R$styleable.COUIFullPageStatement, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.COUIFullPageStatement_exitButtonText);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.COUIFullPageStatement_bottomButtonText);
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.COUIFullPageStatement_couiFullPageStatementTitleText);
        this.w = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIFullPageStatement_android_layout, R$layout.coui_full_page_statement);
        d();
        this.i.setText(typedArrayObtainStyledAttributes.getString(R$styleable.COUIFullPageStatement_appStatement));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIFullPageStatement_couiFullPageStatementTextButtonColor, 0);
        if (color != 0) {
            this.m.setTextColor(color);
        }
        this.i.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.COUIFullPageStatement_couiFullPageStatementTextColor, 0));
        if (string2 != null) {
            this.f2090j.setText(string2);
            if (e()) {
                this.k.setText(string2);
            }
        }
        if (string != null) {
            if (e()) {
                this.f2092n.setText(string);
            }
            this.m.setText(string);
        }
        if (string3 != null) {
            this.o.setText(string3);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
