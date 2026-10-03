package com.coui.appcompat.tips.def;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.coui.appcompat.tips.COUIMarqueeTextView;
import com.oplus.aiunit.vision.dp9;
import com.oplus.aiunit.vision.rm2;
import com.oplus.aiunit.vision.vhd;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.tips.R$dimen;
import com.support.tips.R$id;
import com.support.tips.R$layout;

/* JADX INFO: loaded from: classes13.dex */
public class COUIDefaultTopTipsView extends ConstraintLayout implements dp9 {
    public static final int ACTION_ID = 3;
    public static final int CLOSE_ID = 4;
    public static final int ICON_ID = 0;
    public static final int IGNORE_ID = 2;
    public static final int IMAGE_BTN_TYPE = 1;
    public static final int TEXT_BTN_TYPE = 0;
    public static final int TITLE_ID = 1;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View.OnClickListener f2139j;
    public View.OnClickListener k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View.OnClickListener f2140l;
    public ImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f2141n;
    public COUIMarqueeTextView o;
    public boolean p;
    public TextView q;
    public TextView r;
    public final ConstraintSet s;
    public vhd t;
    public int u;
    public int v;
    public int w;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (COUIDefaultTopTipsView.this.k != null) {
                COUIDefaultTopTipsView.this.k.onClick(view);
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
            if (COUIDefaultTopTipsView.this.f2139j != null) {
                COUIDefaultTopTipsView.this.f2139j.onClick(view);
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
            if (COUIDefaultTopTipsView.this.f2140l != null) {
                COUIDefaultTopTipsView.this.f2140l.onClick(view);
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public COUIDefaultTopTipsView(@NonNull Context context) {
        this(context, null);
    }

    private int getImageMarginTopMultiText() {
        Layout layout = this.o.getLayout();
        return Math.max((int) ((layout != null ? ((layout.getLineTop(0) + layout.getLineBottom(0)) / 2.0f) + this.o.getY() : 0.0f) - (this.m.getMeasuredHeight() / 2.0f)), this.v);
    }

    public TextView getAction() {
        return this.q;
    }

    public TextView getIgnore() {
        return this.r;
    }

    public TextView getTitle() {
        return this.o;
    }

    public final void h() {
        this.s.clone(this);
        ConstraintSet constraintSet = this.s;
        int i = R$id.title;
        int i2 = R$id.close;
        constraintSet.connect(i, 7, i2, 6);
        this.s.setMargin(i, 7, getContext().getResources().getDimensionPixelSize(R$dimen.coui_toptips_view_btn_margin_right));
        this.s.connect(i, 4, 0, 4);
        ConstraintSet constraintSet2 = this.s;
        int i3 = R$id.ignore;
        constraintSet2.connect(i3, 3, i, 3);
        this.s.setMargin(i3, 3, 0);
        ConstraintSet constraintSet3 = this.s;
        int i4 = R$id.action;
        constraintSet3.connect(i4, 3, i, 3);
        this.s.setMargin(i4, 3, 0);
        this.s.setVisibility(i2, 0);
        this.s.setVisibility(i3, 4);
        this.s.setVisibility(i4, 4);
        this.s.setVisibility(i3, TextUtils.isEmpty(this.r.getText()) ? 8 : 4);
        this.s.setVisibility(i4, TextUtils.isEmpty(this.q.getText()) ? 8 : 4);
        this.s.applyTo(this);
    }

    public final void i() {
        this.s.clone(this);
        if (k()) {
            ConstraintSet constraintSet = this.s;
            int i = R$id.title;
            constraintSet.connect(i, 7, 0, 7);
            if (TextUtils.isEmpty(this.q.getText()) && TextUtils.isEmpty(this.r.getText())) {
                this.s.connect(i, 4, 0, 4);
            } else {
                this.s.connect(i, 4, -1, 4);
            }
            this.s.setMargin(i, 7, getContext().getResources().getDimensionPixelSize(R$dimen.coui_toptips_view_title_end_margin));
            ConstraintSet constraintSet2 = this.s;
            int i2 = R$id.ignore;
            constraintSet2.connect(i2, 3, i, 4);
            this.s.connect(i2, 4, 0, 4);
            ConstraintSet constraintSet3 = this.s;
            Resources resources = getContext().getResources();
            int i3 = R$dimen.coui_toptips_view_btn_top_margin;
            constraintSet3.setMargin(i2, 3, resources.getDimensionPixelSize(i3));
            ConstraintSet constraintSet4 = this.s;
            Resources resources2 = getContext().getResources();
            int i4 = R$dimen.coui_toptips_view_multi_btn_text_bottom_margin;
            constraintSet4.setMargin(i2, 4, resources2.getDimensionPixelSize(i4));
            ConstraintSet constraintSet5 = this.s;
            int i5 = R$id.action;
            constraintSet5.connect(i5, 3, i, 4);
            this.s.connect(i5, 4, 0, 4);
            this.s.setMargin(i5, 3, getContext().getResources().getDimensionPixelSize(i3));
            this.s.setMargin(i5, 4, getContext().getResources().getDimensionPixelSize(i4));
            ConstraintSet constraintSet6 = this.s;
            int i6 = R$id.image;
            constraintSet6.connect(i6, 4, -1, 4);
            this.s.connect(i6, 3, 0, 3);
            this.s.setMargin(i6, 3, getImageMarginTopMultiText());
        } else {
            ConstraintSet constraintSet7 = this.s;
            int i7 = R$id.title;
            int i8 = R$id.ignore;
            constraintSet7.connect(i7, 7, i8, 6);
            this.s.connect(i7, 4, 0, 4);
            this.s.setMargin(i7, 7, getContext().getResources().getDimensionPixelSize(R$dimen.coui_toptips_view_btn_margin_right));
            this.s.connect(i8, 3, i7, 3);
            this.s.connect(i8, 4, i7, 4);
            this.s.setMargin(i8, 3, 0);
            this.s.setMargin(i8, 4, 0);
            ConstraintSet constraintSet8 = this.s;
            int i9 = R$id.action;
            constraintSet8.connect(i9, 3, i7, 3);
            this.s.connect(i9, 4, i7, 4);
            this.s.setMargin(i9, 3, 0);
            this.s.setMargin(i9, 4, 0);
            ConstraintSet constraintSet9 = this.s;
            int i10 = R$id.image;
            constraintSet9.connect(i10, 3, i7, 3);
            this.s.connect(i10, 4, i7, 4);
            this.s.setMargin(i10, 3, 0);
        }
        if (this.t != null && this.u != this.o.getLineCount()) {
            int lineCount = this.o.getLineCount();
            this.u = lineCount;
            this.t.a(lineCount);
        }
        this.s.setVisibility(R$id.close, 4);
        this.s.setVisibility(R$id.ignore, TextUtils.isEmpty(this.r.getText()) ? 8 : 0);
        this.s.setVisibility(R$id.action, TextUtils.isEmpty(this.q.getText()) ? 8 : 0);
        this.s.applyTo(this);
    }

    public void init() {
        LayoutInflater.from(getContext()).inflate(R$layout.coui_default_toptips, this);
        this.m = (ImageView) findViewById(R$id.image);
        this.o = (COUIMarqueeTextView) findViewById(R$id.title);
        TextView textView = (TextView) findViewById(R$id.ignore);
        this.r = textView;
        rm2.b(textView);
        this.r.setOnClickListener(new a());
        TextView textView2 = (TextView) findViewById(R$id.action);
        this.q = textView2;
        rm2.b(textView2);
        this.q.setOnClickListener(new b());
        ImageView imageView = (ImageView) findViewById(R$id.close);
        this.f2141n = imageView;
        imageView.setOnClickListener(new c());
        this.v = getResources().getDimensionPixelSize(R$dimen.coui_toptips_view_multi_title_top_margin);
    }

    public final void j(int i) {
        if (i == 0) {
            i();
        } else {
            h();
        }
        this.i = i;
    }

    public final boolean k() {
        if (this.o.getMaxLines() == 1) {
            return false;
        }
        int measuredWidth = (this.o.getMeasuredWidth() - this.o.getPaddingLeft()) - this.o.getPaddingRight();
        if (measuredWidth <= 0) {
            measuredWidth = this.o.getMeasuredWidth();
        }
        float fMeasureText = this.o.getPaint().measureText(this.o.getText().toString());
        if (fMeasureText > measuredWidth) {
            return true;
        }
        TextView textView = TextUtils.isEmpty(this.r.getText()) ? this.q : this.r;
        boolean z = (TextUtils.isEmpty(this.q.getText()) && TextUtils.isEmpty(this.r.getText())) ? false : true;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.coui_toptips_view_btn_margin);
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return ((int) (((float) this.o.getLeft()) + fMeasureText)) + dimensionPixelSize >= (z ? textView.getRight() : getLeft());
        }
        return ((int) (((float) this.o.getLeft()) + fMeasureText)) + dimensionPixelSize >= (z ? textView.getLeft() : getRight());
    }

    public final void l(TextView textView, int i) {
        textView.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), 0, -2), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight(), Integer.MIN_VALUE), 0, -2));
    }

    public final void m(int i, int i2) {
        if (i == 2) {
            this.r.setTextColor(i2);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("setBtnColorImpl parameter 'which' is wrong");
            }
            this.q.setTextColor(i2);
        }
    }

    public final void n(int i, Drawable drawable) {
        if (i != 4) {
            throw new IllegalArgumentException("setBtnDrawableImpl parameter 'which' is wrong");
        }
        this.f2141n.setImageDrawable(drawable);
        j(1);
    }

    public final void o(int i, CharSequence charSequence) {
        if (i == 2) {
            this.r.setText(charSequence);
            j(0);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("setBtnTextImpl parameter 'which' is wrong");
            }
            this.q.setText(charSequence);
            j(0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (ViewCompat.getLayoutDirection(this) == 1) {
            TextView textView = this.q;
            textView.layout(textView.getLeft(), this.q.getTop(), this.q.getLeft() + this.q.getMeasuredWidth(), this.q.getBottom());
            this.r.layout(this.q.getRight(), this.r.getTop(), this.q.getRight() + this.r.getMeasuredWidth(), this.r.getBottom());
        } else {
            TextView textView2 = this.q;
            textView2.layout(textView2.getRight() - this.q.getMeasuredWidth(), this.q.getTop(), this.q.getRight(), this.q.getBottom());
            this.r.layout(this.q.getLeft() - this.r.getMeasuredWidth(), this.r.getTop(), this.q.getLeft(), this.r.getBottom());
        }
        if (this.i == 0 && this.p) {
            this.p = false;
            i();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() - ((((ConstraintLayout.LayoutParams) this.o.getLayoutParams()).getMarginStart() + this.m.getMeasuredWidth()) + ((ConstraintLayout.LayoutParams) this.m.getLayoutParams()).getMarginStart());
        int i3 = measuredWidth >> 1;
        if (this.q.getMeasuredWidth() <= i3) {
            this.w++;
        }
        if (this.r.getMeasuredWidth() <= i3) {
            this.w += 2;
        }
        int i4 = this.w;
        if (i4 == 0) {
            l(this.q, i3);
            l(this.r, i3);
        } else if (i4 == 1) {
            l(this.r, measuredWidth - this.q.getMeasuredWidth());
        } else if (i4 == 2) {
            l(this.q, measuredWidth - this.r.getMeasuredWidth());
        }
        this.w = 0;
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setCloseBtnListener(View.OnClickListener onClickListener) {
        this.f2140l = onClickListener;
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setCloseDrawable(Drawable drawable) {
        n(4, drawable);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setNegativeButton(CharSequence charSequence) {
        o(2, charSequence);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setNegativeButtonColor(int i) {
        m(2, i);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setNegativeButtonListener(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    public void setOnLinesChangedListener(vhd vhdVar) {
        this.t = vhdVar;
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setPositiveButton(CharSequence charSequence) {
        o(3, charSequence);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setPositiveButtonColor(int i) {
        m(3, i);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setPositiveButtonListener(View.OnClickListener onClickListener) {
        this.f2139j = onClickListener;
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setStartIcon(Drawable drawable) {
        this.m.setImageDrawable(drawable);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setTipsText(CharSequence charSequence) {
        this.p = true;
        this.o.setText(charSequence);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setTipsTextColor(int i) {
        this.o.setTextColor(i);
    }

    public COUIDefaultTopTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIDefaultTopTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.p = true;
        this.s = new ConstraintSet();
        this.u = -1;
        this.w = 0;
        init();
    }
}
