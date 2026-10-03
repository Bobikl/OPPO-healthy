package com.coui.appcompat.tips.def;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coui.appcompat.tips.COUICustomTopTips;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.dp9;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.vhd;
import com.support.appcompat.R$attr;

/* JADX INFO: loaded from: classes13.dex */
public class COUIDefaultTopTips extends COUICustomTopTips implements dp9 {
    public dp9 w;

    public class a implements vhd {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.vhd
        public void a(int i) {
        }
    }

    public COUIDefaultTopTips(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.coui.appcompat.tips.COUICustomTopTips
    public void c() {
        ph2.c(this, false);
        this.w = d();
        if (byf.f()) {
            setRadius(lh2.c(getContext(), R$attr.couiRoundCornerMRadius));
            setWeight(lh2.e(getContext(), R$attr.couiRoundCornerMWeight));
        } else {
            setRadius(lh2.c(getContext(), R$attr.couiRoundCornerM));
        }
        setCardBackgroundColor(ColorStateList.valueOf(lh2.a(getContext(), R$attr.couiColorContainer4)));
    }

    public dp9 d() {
        COUIDefaultTopTipsView cOUIDefaultTopTipsView = new COUIDefaultTopTipsView(getContext());
        cOUIDefaultTopTipsView.setOnLinesChangedListener(new a());
        cOUIDefaultTopTipsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setContentView(cOUIDefaultTopTipsView);
        return cOUIDefaultTopTipsView;
    }

    @Override // com.coui.appcompat.tips.COUICustomTopTips
    public int getContentViewId() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setCloseBtnListener(View.OnClickListener onClickListener) {
        this.w.setCloseBtnListener(onClickListener);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setCloseDrawable(Drawable drawable) {
        this.w.setCloseDrawable(drawable);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setNegativeButton(CharSequence charSequence) {
        this.w.setNegativeButton(charSequence);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setNegativeButtonColor(int i) {
        this.w.setNegativeButtonColor(i);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setNegativeButtonListener(View.OnClickListener onClickListener) {
        this.w.setNegativeButtonListener(onClickListener);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setPositiveButton(CharSequence charSequence) {
        this.w.setPositiveButton(charSequence);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setPositiveButtonColor(int i) {
        this.w.setPositiveButtonColor(i);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setPositiveButtonListener(View.OnClickListener onClickListener) {
        this.w.setPositiveButtonListener(onClickListener);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setStartIcon(Drawable drawable) {
        this.w.setStartIcon(drawable);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setTipsText(CharSequence charSequence) {
        this.w.setTipsText(charSequence);
    }

    @Override // com.oplus.aiunit.vision.dp9
    public void setTipsTextColor(int i) {
        this.w.setTipsTextColor(i);
    }

    public COUIDefaultTopTips(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIDefaultTopTips(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
