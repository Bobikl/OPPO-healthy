package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.tips.R$attr;
import com.support.tips.R$dimen;
import com.support.tips.R$id;
import com.support.tips.R$layout;
import com.support.tips.R$style;
import com.support.tips.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class si2 implements qi2 {
    public dz9 a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f16595c;
    public ImageView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f16596e;
    public ScrollView f;
    public TextView g;
    public TextView h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f16597j;
    public Bitmap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f16598l;
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f16599n;

    @StringRes
    public int o;

    @StringRes
    public int p;

    @StringRes
    public int q;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            si2.this.a.a();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public static class b {
        public int a;
        public Drawable b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap f16600c;
        public CharSequence d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f16601e;
        public CharSequence f;

        @StringRes
        public int g;

        @StringRes
        public int h;

        @StringRes
        public int i;

        public si2 j() {
            return new si2(this, null);
        }

        public b k(int i) {
            this.a = i;
            return this;
        }

        public b l(CharSequence charSequence) {
            this.d = charSequence;
            this.h = 0;
            return this;
        }

        public b m(CharSequence charSequence) {
            this.f = charSequence;
            this.i = 0;
            return this;
        }

        public b n(CharSequence charSequence) {
            this.f16601e = charSequence;
            this.g = 0;
            return this;
        }
    }

    public /* synthetic */ si2(b bVar, a aVar) {
        this(bVar);
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void a(dz9 dz9Var, Context context, int i) {
        this.a = dz9Var;
        this.b = context;
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void b(ViewGroup viewGroup, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
        this.g.setMaxWidth((((i - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - layoutParams.getMarginStart()) - layoutParams.getMarginEnd());
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f16596e.getLayoutParams();
        this.f16596e.setMaxWidth((((i - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - layoutParams2.getMarginStart()) - layoutParams2.getMarginEnd());
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        this.h.setMaxWidth((((i - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - layoutParams3.getMarginStart()) - layoutParams3.getMarginEnd());
    }

    @Override // com.oplus.aiunit.vision.qi2
    public int c(int i, ViewGroup viewGroup) {
        return Math.min(viewGroup.getMeasuredWidth(), i);
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void d(CharSequence charSequence) {
        this.o = 0;
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.f16598l = charSequence;
        }
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void e() {
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void f(ViewGroup viewGroup) {
        Context context = this.b;
        int[] iArr = R$styleable.COUIToolTips;
        int[] iArr2 = this.f16595c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, iArr2[0], iArr2[1]);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUIToolTips_couiToolTipsContentTextColor);
        typedArrayObtainStyledAttributes.recycle();
        this.d = (ImageView) viewGroup.findViewById(R$id.iv_icon);
        this.f16596e = (TextView) viewGroup.findViewById(R$id.tv_title);
        this.f = (ScrollView) viewGroup.findViewById(R$id.scrollView);
        this.g = (TextView) viewGroup.findViewById(R$id.contentTv);
        this.h = (TextView) viewGroup.findViewById(R$id.tv_dismiss);
        int i = this.i;
        if (i != 0) {
            this.d.setImageResource(i);
        } else {
            Drawable drawable = this.f16597j;
            if (drawable != null) {
                this.d.setImageDrawable(drawable);
            } else {
                Bitmap bitmap = this.k;
                if (bitmap != null) {
                    this.d.setImageBitmap(bitmap);
                }
            }
        }
        int i2 = this.p;
        if (i2 != 0) {
            this.f16596e.setText(this.b.getString(i2));
        } else if (!TextUtils.isEmpty(this.m)) {
            this.f16596e.setText(this.m);
        }
        this.g.setMovementMethod(LinkMovementMethod.getInstance());
        if (colorStateList != null) {
            this.g.setTextColor(colorStateList);
        }
        int i3 = this.o;
        if (i3 != 0) {
            this.g.setText(this.b.getString(i3));
        } else if (!TextUtils.isEmpty(this.f16598l)) {
            this.g.setText(this.f16598l);
        }
        int i4 = this.q;
        if (i4 != 0) {
            this.h.setText(this.b.getString(i4));
        } else if (!TextUtils.isEmpty(this.f16599n)) {
            this.h.setText(this.f16599n);
        }
        this.h.setOnClickListener(new a());
        rm2.b(this.h);
    }

    @Override // com.oplus.aiunit.vision.qi2
    public int[] g() {
        int[] iArr = this.f16595c;
        iArr[0] = R$attr.couiToolTipsIconStyle;
        iArr[1] = R$style.COUIToolTips_Icon;
        return iArr;
    }

    @Override // com.oplus.aiunit.vision.qi2
    public int getLayoutId() {
        return R$layout.coui_tool_tips_icon_style_layout;
    }

    @Override // com.oplus.aiunit.vision.qi2
    public int getMaxWidth() {
        return this.b.getResources().getDimensionPixelSize(R$dimen.tool_tips_max_width);
    }

    public TextView i() {
        return this.g;
    }

    public si2(b bVar) {
        this.f16595c = new int[2];
        this.i = bVar.a;
        this.f16597j = bVar.b;
        this.k = bVar.f16600c;
        this.m = bVar.f16601e;
        this.f16598l = bVar.d;
        this.f16599n = bVar.f;
        this.p = bVar.g;
        this.o = bVar.h;
        this.q = bVar.i;
    }
}
