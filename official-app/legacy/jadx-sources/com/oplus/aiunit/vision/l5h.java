package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import com.coui.appcompat.button.COUIButton;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.support.button.R$dimen;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class l5h extends in2 implements ejd, xid {
    public static final int BUTTON_MAX_LINE = 2;
    public static final int MULTI_LINE = 2;
    public static final int SINGLE_LINE = 1;
    public COUIButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13533l;
    public int m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13532j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f13534n = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l5h.this.k != null) {
                l5h.this.k.requestLayout();
            }
        }
    }

    public l5h(@NonNull COUIButton cOUIButton, int i) {
        this.f13533l = 0;
        this.m = 0;
        if (cOUIButton == null) {
            throw new IllegalArgumentException(getClass().getSimpleName() + ": parameter is null!");
        }
        this.k = cOUIButton;
        cOUIButton.setDrawableRadius(-1);
        this.k.setIncludeFontPadding(false);
        this.f13533l = i;
        this.k.setOnSizeChangeListener(this);
        this.k.setOnTextChangeListener(this);
        this.k.setSingleLine(false);
        this.k.setMaxLines(2);
        this.m = this.k.getContext().getResources().getDimensionPixelSize(R$dimen.coui_small_single_btn_padding_horizontal);
        v();
        D();
        j();
    }

    public static int l(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public static float m(Context context, int i, int i2) {
        return gg2.g(i, context.getResources().getConfiguration().fontScale, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        super.g();
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        COUIButton cOUIButton = this.k;
        if (cOUIButton == null) {
            return;
        }
        if ((n(cOUIButton) > this.k.getMeasureMaxHeight() && this.k.getMeasureMaxHeight() != 0) && this.k.n()) {
            this.k.setSingleLine(false);
            this.k.setMaxLines(1);
        } else {
            this.k.setSingleLine(false);
            this.k.setMaxLines(2);
        }
        this.k.requestLayout();
    }

    public final void A(COUIButton cOUIButton, float f) {
        int dimensionPixelSize = cOUIButton.getContext().getResources().getDimensionPixelSize(R$dimen.coui_larger_btn_width);
        if (COUIResponsiveUtils.isSmallScreen(cOUIButton.getContext(), cOUIButton.getContext().getResources().getDisplayMetrics().widthPixels)) {
            dimensionPixelSize = Math.min(Math.max(dimensionPixelSize, cOUIButton.getMeasuredWidth()), cOUIButton.getContext().getResources().getDimensionPixelSize(com.support.appcompat.R$dimen.coui_single_larger_btn_width));
        }
        if (f > dimensionPixelSize - (cOUIButton.getContext().getResources().getDimensionPixelSize(R$dimen.coui_btn_padding_horizontal) * 2)) {
            f(2);
            this.f13532j = 2;
        } else {
            f(1);
            this.f13532j = 1;
        }
    }

    public final void B(COUIButton cOUIButton, float f) {
        if (f > cOUIButton.getContext().getResources().getDimensionPixelSize(R$dimen.coui_medium_btn_width) - (cOUIButton.getContext().getResources().getDimensionPixelSize(R$dimen.coui_btn_padding_horizontal) * 2)) {
            f(2);
        } else {
            f(1);
        }
    }

    public final void C() {
        if (this.f13533l == 2) {
            this.k.post(new Runnable() { // from class: com.oplus.aiunit.vision.k5h
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.x();
                }
            });
        }
    }

    public final void D() {
        if (this.f13533l == 2) {
            if (this.k.getPaint().measureText(this.k.getText() == null ? "" : this.k.getText().toString()) > this.k.getMeasuredWidth() - (this.m * 2)) {
                f(2);
                COUIButton cOUIButton = this.k;
                cOUIButton.setDrawableRadius(l(cOUIButton.getContext(), 14.0f));
            } else {
                f(1);
                this.k.setDrawableRadius(-1);
            }
            this.k.requestLayout();
        }
    }

    public void E(COUIButton cOUIButton) {
        if (this.f13533l == 5) {
            cOUIButton.setAnimType(0);
        }
    }

    @Override // com.oplus.aiunit.vision.xid
    public void a(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            if (i == i3 && i2 == i4) {
                return;
            }
            D();
            E(this.k);
            z();
        }
    }

    @Override // com.oplus.aiunit.vision.ejd
    public void b(View view, CharSequence charSequence, int i, int i2, int i3) {
        if (view == null || !(view instanceof COUIButton)) {
            return;
        }
        COUIButton cOUIButton = (COUIButton) view;
        float fMeasureText = cOUIButton.getPaint().measureText(cOUIButton.getText().toString());
        int i4 = this.f13533l;
        if (i4 == 0 || i4 == 5 || i4 == 6) {
            A(cOUIButton, fMeasureText);
        } else if (i4 == 1) {
            B(cOUIButton, fMeasureText);
        } else if (i4 == 2) {
            C();
        }
    }

    @Override // com.oplus.aiunit.vision.in2
    public View e() {
        return this.k;
    }

    public final void j() {
        if (y()) {
            this.k.setNeedLimitMaxWidth(true);
        } else {
            this.k.setNeedLimitMaxWidth(false);
        }
    }

    public final int n(COUIButton cOUIButton) {
        if (cOUIButton == null) {
            return 0;
        }
        return (((cOUIButton.getLineHeight() * 2) + cOUIButton.getPaddingTop()) + cOUIButton.getPaddingBottom()) - ((int) (cOUIButton.getLineHeight() - (cOUIButton.getLineHeight() / cOUIButton.getLineSpacingMultiplier())));
    }

    public final List<nxe> o(Context context) {
        ArrayList arrayList = new ArrayList();
        int iQ = q(context);
        arrayList.add(new k7h.b(1).b(-2).d(iQ).a());
        arrayList.add(new k7h.b(2).b(-2).d(iQ).a());
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.in2, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k.post(new Runnable() { // from class: com.oplus.aiunit.vision.j5h
            @Override // java.lang.Runnable
            public final void run() {
                this.i.w();
            }
        });
        j();
    }

    public final List<nxe> p(Context context) {
        ArrayList arrayList = new ArrayList();
        int dimensionPixelSize = this.f13533l == 4 ? context.getResources().getDimensionPixelSize(R$dimen.coui_medium_btn_width) : context.getResources().getDimensionPixelSize(R$dimen.coui_larger_btn_width);
        if (COUIResponsiveUtils.isSmallScreen(context, context.getResources().getDisplayMetrics().widthPixels)) {
            dimensionPixelSize = this.f13533l == 7 ? q(context) : -1;
        }
        arrayList.add(new k7h.b(1).b(-2).d(dimensionPixelSize).a());
        y3e.b bVar = new y3e.b(1);
        Resources resources = context.getResources();
        int i = com.support.appcompat.R$dimen.coui_btn_desc_padding_vertical;
        y3e.b bVarE = bVar.b(resources.getDimensionPixelSize(i)).e(context.getResources().getDimensionPixelSize(i));
        Resources resources2 = context.getResources();
        int i2 = R$dimen.coui_btn_padding_horizontal;
        arrayList.add(bVarE.d(resources2.getDimensionPixelSize(i2)).c(context.getResources().getDimensionPixelSize(i2)).a());
        itj.b bVar2 = new itj.b(1);
        Resources resources3 = context.getResources();
        int i3 = R$dimen.coui_btn_group_text_size;
        arrayList.add(bVar2.c(m(context, resources3.getDimensionPixelSize(i3), 4)).b(2.0f).a());
        arrayList.add(new k7h.b(2).b(-2).d(dimensionPixelSize).a());
        arrayList.add(new y3e.b(2).b(context.getResources().getDimensionPixelSize(i)).e(context.getResources().getDimensionPixelSize(i)).d(context.getResources().getDimensionPixelSize(i2)).c(context.getResources().getDimensionPixelSize(i2)).a());
        arrayList.add(new itj.b(2).c(m(context, context.getResources().getDimensionPixelSize(i3), 4)).b(2.0f).a());
        return arrayList;
    }

    public final int q(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.coui_larger_btn_width);
        if (!COUIResponsiveUtils.isSmallScreen(context, context.getResources().getDisplayMetrics().widthPixels) || this.k == null) {
            return dimensionPixelSize;
        }
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.support.appcompat.R$dimen.coui_single_larger_btn_width);
        if (ifk.m(context) >= context.getResources().getDimensionPixelSize(R$dimen.coui_single_larger_window_screen)) {
            return dimensionPixelSize2;
        }
        return -1;
    }

    public final List<nxe> r(Context context) {
        ArrayList arrayList = new ArrayList();
        int iQ = q(context);
        arrayList.add(new k7h.b(1).b(-2).d(iQ).a());
        arrayList.add(new k7h.b(2).b(-2).d(iQ).a());
        y3e.b bVarE = new y3e.b(1).b(l(context, 12.0f)).e(l(context, 12.0f));
        Resources resources = context.getResources();
        int i = R$dimen.coui_btn_padding_horizontal;
        arrayList.add(bVarE.d(resources.getDimensionPixelSize(i)).c(context.getResources().getDimensionPixelSize(i)).a());
        arrayList.add(new y3e.b(2).b(l(context, 6.0f)).e(l(context, 6.0f)).d(context.getResources().getDimensionPixelSize(i)).c(context.getResources().getDimensionPixelSize(i)).a());
        itj.b bVar = new itj.b(1);
        Resources resources2 = context.getResources();
        int i2 = R$dimen.coui_btn_group_text_size;
        arrayList.add(bVar.c(m(context, resources2.getDimensionPixelSize(i2), 4)).b(2.0f).a());
        arrayList.add(new itj.b(2).c(m(context, context.getResources().getDimensionPixelSize(i2), 4)).b(2.0f).a());
        return arrayList;
    }

    public final List<nxe> s(Context context) {
        ArrayList arrayList = new ArrayList();
        k7h.b bVarB = new k7h.b(1).b(-2);
        Resources resources = context.getResources();
        int i = R$dimen.coui_medium_btn_width;
        arrayList.add(bVarB.d(resources.getDimensionPixelSize(i)).a());
        y3e.b bVarE = new y3e.b(1).b(l(context, 12.0f)).e(l(context, 12.0f));
        Resources resources2 = context.getResources();
        int i2 = R$dimen.coui_btn_padding_horizontal;
        arrayList.add(bVarE.d(resources2.getDimensionPixelSize(i2)).c(context.getResources().getDimensionPixelSize(i2)).a());
        itj.b bVar = new itj.b(1);
        Resources resources3 = context.getResources();
        int i3 = R$dimen.coui_btn_group_text_size;
        arrayList.add(bVar.c(m(context, resources3.getDimensionPixelSize(i3), 4)).b(2.0f).a());
        arrayList.add(new k7h.b(2).b(-2).d(context.getResources().getDimensionPixelSize(i)).a());
        arrayList.add(new y3e.b(2).b(l(context, 6.0f)).e(l(context, 6.0f)).d(context.getResources().getDimensionPixelSize(i2)).c(context.getResources().getDimensionPixelSize(i2)).a());
        arrayList.add(new itj.b(2).c(m(context, context.getResources().getDimensionPixelSize(i3), 4)).b(2.0f).a());
        return arrayList;
    }

    public final List<nxe> t(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k7h.b(1).b(context.getResources().getDimensionPixelSize(R$dimen.coui_medium_btn_height)).d(0).c(1.0f).a());
        y3e.b bVarE = new y3e.b(1).b(l(context, 11.0f)).e(l(context, 11.0f));
        Resources resources = context.getResources();
        int i = R$dimen.coui_btn_padding_horizontal;
        arrayList.add(bVarE.d(resources.getDimensionPixelSize(i)).c(context.getResources().getDimensionPixelSize(i)).a());
        arrayList.add(new itj.b(1).c(16.0f).b(1.0f).a());
        arrayList.add(new k7h.b(2).b(-2).d(0).c(1.0f).a());
        arrayList.add(new y3e.b(2).b(l(context, 6.0f)).e(l(context, 6.0f)).d(context.getResources().getDimensionPixelSize(i)).c(context.getResources().getDimensionPixelSize(i)).a());
        arrayList.add(new itj.b(2).c(16.0f).b(1.0f).a());
        return arrayList;
    }

    public final List<nxe> u(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k7h.b(1).b(-2).d(-2).a());
        y3e.b bVar = new y3e.b(1);
        Resources resources = context.getResources();
        int i = R$dimen.coui_small_btn_padding_victical;
        y3e.b bVarE = bVar.b(resources.getDimensionPixelSize(i)).e(context.getResources().getDimensionPixelSize(i));
        Resources resources2 = context.getResources();
        int i2 = R$dimen.coui_small_single_btn_padding_horizontal;
        arrayList.add(bVarE.d(resources2.getDimensionPixelSize(i2)).c(context.getResources().getDimensionPixelSize(i2)).a());
        itj.b bVar2 = new itj.b(1);
        Resources resources3 = context.getResources();
        int i3 = R$dimen.coui_btn_group_small_single_text_size;
        arrayList.add(bVar2.c(m(context, resources3.getDimensionPixelSize(i3), 2)).b(2.0f).a());
        arrayList.add(new k7h.b(2).b(-2).d(-2).a());
        y3e.b bVarE2 = new y3e.b(2).b(context.getResources().getDimensionPixelSize(i)).e(context.getResources().getDimensionPixelSize(i));
        Resources resources4 = context.getResources();
        int i4 = R$dimen.coui_small_btn_padding_horizontal;
        arrayList.add(bVarE2.d(resources4.getDimensionPixelSize(i4)).c(context.getResources().getDimensionPixelSize(i4)).a());
        arrayList.add(new itj.b(2).c(m(context, context.getResources().getDimensionPixelSize(i3), 2)).b(2.0f).a());
        return arrayList;
    }

    public final void v() {
        COUIButton cOUIButton = this.k;
        if (cOUIButton == null) {
            return;
        }
        int i = this.f13533l;
        if (i == 0 || i == 5) {
            c(r(cOUIButton.getContext()));
        } else if (i == 6) {
            c(o(cOUIButton.getContext()));
        } else if (i == 1) {
            c(s(cOUIButton.getContext()));
        } else if (i == 2) {
            c(u(cOUIButton.getContext()));
        } else if (i == 4 || i == 7) {
            c(p(cOUIButton.getContext()));
            f(1);
        } else {
            c(t(cOUIButton.getContext()));
        }
        COUIButton cOUIButton2 = this.k;
        cOUIButton2.setText(cOUIButton2.getText());
    }

    public final boolean y() {
        int i;
        COUIButton cOUIButton = this.k;
        return (cOUIButton == null || (i = this.f13533l) == 2 || i == 4 || !COUIResponsiveUtils.isSmallScreen(cOUIButton.getContext(), this.k.getContext().getResources().getDisplayMetrics().widthPixels)) ? false : true;
    }

    public final void z() {
        if (y()) {
            if (this.k.getMeasuredWidth() >= this.k.getContext().getResources().getDimensionPixelSize(com.support.appcompat.R$dimen.coui_single_larger_btn_width)) {
                super.g();
                v();
                this.k.removeCallbacks(this.f13534n);
                this.k.post(this.f13534n);
                return;
            }
            if (this.k.getLineCount() != this.f13532j) {
                f(this.k.getLineCount());
                this.f13532j = this.k.getLineCount();
            }
        }
    }
}
