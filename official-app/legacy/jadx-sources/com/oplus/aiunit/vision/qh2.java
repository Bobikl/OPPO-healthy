package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.ViewGroupUtils;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.tips.R$attr;
import com.support.tips.R$dimen;
import com.support.tips.R$id;
import com.support.tips.R$layout;
import com.support.tips.R$style;
import com.support.tips.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class qh2 implements qi2 {
    public dz9 a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f15801c;
    public TextView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScrollView f15802e;
    public ImageView f;
    public int g;
    public CharSequence h;

    @StringRes
    public int i;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            qh2.this.a.a();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ ViewGroup i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f15803j;

        public b(ViewGroup viewGroup, int i) {
            this.i = viewGroup;
            this.f15803j = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            ViewGroupUtils.getDescendantRect(this.i, qh2.this.f, rect);
            int i = this.f15803j;
            rect.inset(-i, -i);
            this.i.setTouchDelegate(new TouchDelegate(rect, qh2.this.f));
        }
    }

    public static class c {
        public CharSequence a;

        @StringRes
        public int b;

        public qh2 c() {
            return new qh2(this, null);
        }
    }

    public /* synthetic */ qh2(c cVar, a aVar) {
        this(cVar);
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void a(dz9 dz9Var, Context context, int i) {
        this.a = dz9Var;
        this.b = context;
        this.g = i;
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void b(ViewGroup viewGroup, int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f15802e.getLayoutParams();
        this.d.setMaxWidth((((i - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - layoutParams.leftMargin) - layoutParams.rightMargin);
    }

    @Override // com.oplus.aiunit.vision.qi2
    public int c(int i, ViewGroup viewGroup) {
        return Math.min(viewGroup.getMeasuredWidth(), i);
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void d(CharSequence charSequence) {
        this.i = 0;
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.h = charSequence;
        }
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void e() {
    }

    @Override // com.oplus.aiunit.vision.qi2
    public void f(ViewGroup viewGroup) {
        Context context = this.b;
        int[] iArr = R$styleable.COUIToolTips;
        int[] iArr2 = this.f15801c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, iArr2[0], iArr2[1]);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIToolTips_couiToolTipsContainerLayoutGravity, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIToolTips_couiToolTipsContainerLayoutMarginStart, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIToolTips_couiToolTipsContainerLayoutMarginTop, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIToolTips_couiToolTipsContainerLayoutMarginEnd, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIToolTips_couiToolTipsContainerLayoutMarginBottom, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUIToolTips_couiToolTipsContentTextColor);
        typedArrayObtainStyledAttributes.recycle();
        TextView textView = (TextView) viewGroup.findViewById(R$id.contentTv);
        this.d = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ScrollView scrollView = (ScrollView) viewGroup.findViewById(R$id.scrollView);
        this.f15802e = scrollView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollView.getLayoutParams();
        layoutParams.gravity = i;
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize3);
        this.f15802e.setLayoutParams(layoutParams);
        this.d.setTextSize(0, (int) gg2.g(this.b.getResources().getDimensionPixelSize(this.g == 0 ? R$dimen.tool_tips_content_text_size : R$dimen.detail_floating_content_text_size), this.b.getResources().getConfiguration().fontScale, 4));
        if (colorStateList != null) {
            this.d.setTextColor(colorStateList);
        }
        int i2 = this.i;
        if (i2 != 0) {
            this.d.setText(this.b.getString(i2));
        } else if (!TextUtils.isEmpty(this.h)) {
            this.d.setText(this.h);
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(R$id.dismissIv);
        this.f = imageView;
        if (this.g == 0) {
            imageView.setVisibility(0);
            this.f.setOnClickListener(new a());
        } else {
            imageView.setVisibility(8);
        }
        this.f.post(new b(viewGroup, this.b.getResources().getDimensionPixelOffset(R$dimen.couiToolTipsCancelButtonInsects)));
    }

    @Override // com.oplus.aiunit.vision.qi2
    public int[] g() {
        if (this.g == 0) {
            int[] iArr = this.f15801c;
            iArr[0] = R$attr.couiToolTipsStyle;
            iArr[1] = lh2.j(this.b) ? R$style.COUIToolTips_Dark : R$style.COUIToolTips;
        } else {
            int[] iArr2 = this.f15801c;
            iArr2[0] = R$attr.couiToolTipsDetailFloatingStyle;
            iArr2[1] = lh2.j(this.b) ? R$style.COUIToolTips_DetailFloating_Dark : R$style.COUIToolTips_DetailFloating;
        }
        return this.f15801c;
    }

    @Override // com.oplus.aiunit.vision.qi2
    public int getLayoutId() {
        return R$layout.coui_tool_tips_layout;
    }

    @Override // com.oplus.aiunit.vision.qi2
    public int getMaxWidth() {
        return this.b.getResources().getDimensionPixelSize(R$dimen.tool_tips_max_width);
    }

    public qh2(c cVar) {
        this.f15801c = new int[2];
        this.h = cVar.a;
        this.i = cVar.b;
    }
}
