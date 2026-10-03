package com.coui.appcompat.dialog.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.lh2;
import com.oplus.graphics.OplusOutline;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.dialog.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIAlertDialogClipCornerLinearLayout extends LinearLayoutCompat {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1698j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1699l;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            boolean z = COUIAlertDialogClipCornerLinearLayout.this.f1698j && !COUIAlertDialogClipCornerLinearLayout.this.k;
            if (!COUIAlertDialogClipCornerLinearLayout.this.f1699l || z) {
                outline.setRoundRect(0, 0, COUIAlertDialogClipCornerLinearLayout.this.getMeasuredWidth(), COUIAlertDialogClipCornerLinearLayout.this.getMeasuredHeight(), COUIAlertDialogClipCornerLinearLayout.this.i);
            } else {
                new OplusOutline(outline).setSmoothRoundRect(0, 0, COUIAlertDialogClipCornerLinearLayout.this.getMeasuredWidth(), COUIAlertDialogClipCornerLinearLayout.this.getMeasuredHeight(), COUIAlertDialogClipCornerLinearLayout.this.i, lh2.i(COUIAlertDialogClipCornerLinearLayout.this.getContext(), R$dimen.coui_round_corner_xl_weight));
            }
            bj2.d("COUIAlertDialogClipCorner", "getOutline: notUseRoundCornerWhenBlur" + z + " mBlurBackgroundWindow=" + COUIAlertDialogClipCornerLinearLayout.this.f1698j + " mIsSupportRoundCornerWhenBlur=" + COUIAlertDialogClipCornerLinearLayout.this.k + " mIsSupportSmoothRoundCorner=" + COUIAlertDialogClipCornerLinearLayout.this.f1699l + " mRadius=" + COUIAlertDialogClipCornerLinearLayout.this.i);
        }
    }

    public COUIAlertDialogClipCornerLinearLayout(@NonNull Context context) {
        super(context);
        this.f1698j = false;
        this.k = false;
        this.f1699l = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i > 0) {
            setClipToOutline(true);
            setOutlineProvider(new a());
        }
    }

    public void setBlurBackgroundWindow(boolean z) {
        this.f1698j = z;
    }

    public void setIsSupportRoundCornerWhenBlur(boolean z) {
        this.k = z;
    }

    public COUIAlertDialogClipCornerLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1698j = false;
        this.k = false;
        this.f1699l = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIAlertDialogClipCornerLinearLayout);
        boolean zF = byf.f();
        this.f1699l = zF;
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIAlertDialogClipCornerLinearLayout_clip_radius, lh2.c(getContext(), zF ? R$attr.couiRoundCornerXLRadius : R$attr.couiRoundCornerXL));
        typedArrayObtainStyledAttributes.recycle();
    }

    public COUIAlertDialogClipCornerLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1698j = false;
        this.k = false;
        this.f1699l = false;
    }
}
