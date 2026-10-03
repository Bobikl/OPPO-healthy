package com.coui.appcompat.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.preference.ListPreference;
import androidx.preference.PreferenceViewHolder;
import androidx.recyclerview.widget.COUIRecyclerView;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;
import com.coui.appcompat.uiutil.AnimLevel;
import com.oplus.aiunit.vision.bk2;
import com.oplus.aiunit.vision.dg2;
import com.oplus.aiunit.vision.eg2;
import com.oplus.aiunit.vision.ifk;
import com.support.preference.R$dimen;
import com.support.preference.R$style;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIListPreference extends ListPreference implements eg2, COUIRecyclerView.ICOUIDividerDecorationInterface {
    public CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f1905j;
    public CharSequence[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1906l;
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1907n;
    public Point o;
    public View p;
    public View q;
    public TextView r;
    public boolean s;
    public boolean t;
    public AnimLevel u;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            COUIListPreference.this.o.set((int) motionEvent.getX(), (int) motionEvent.getY());
            return false;
        }
    }

    public COUIListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Preference_COUI_COUIWithPopupIcon);
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public boolean drawDivider() {
        if (!(this.q instanceof COUICardListSelectedItemLayout)) {
            return false;
        }
        int iB = dg2.b(this);
        return iB == 1 || iB == 2;
    }

    public AnimLevel e() {
        return this.u;
    }

    public Point g() {
        return this.o;
    }

    public CharSequence getAssignment() {
        return this.m;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerEndAlignView() {
        return null;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerEndInset() {
        return this.f1906l;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public View getDividerStartAlignView() {
        return this.r;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public int getDividerStartInset() {
        return this.f1906l;
    }

    public View getPreferenceView() {
        return this.p;
    }

    public CharSequence[] getSummaries() {
        return this.k;
    }

    public boolean h() {
        return this.t;
    }

    public boolean i() {
        return this.s;
    }

    @Override // com.oplus.aiunit.vision.eg2
    public boolean isSupportCardUse() {
        return this.f1907n;
    }

    public void l(boolean z) {
        this.s = z;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        this.q = preferenceViewHolder.itemView;
        bk2.b(preferenceViewHolder, this.f1905j, this.i, getAssignment());
        dg2.d(preferenceViewHolder.itemView, dg2.b(this));
        this.r = (TextView) preferenceViewHolder.findViewById(R.id.title);
        View view = preferenceViewHolder.itemView;
        this.p = view;
        view.setOnTouchListener(new a());
    }

    public void setAssignment(CharSequence charSequence) {
        if (TextUtils.equals(this.m, charSequence)) {
            return;
        }
        this.m = charSequence;
        notifyChanged();
    }

    public COUIListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        this.o = new Point();
        this.s = true;
        this.t = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPreference, i, i2);
        this.f1907n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_isSupportCardUse, true);
        this.m = typedArrayObtainStyledAttributes.getText(R$styleable.COUIPreference_couiAssignment);
        this.f1905j = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIPreference_coui_jump_mark);
        this.i = typedArrayObtainStyledAttributes.getText(R$styleable.COUIPreference_coui_jump_status1);
        this.s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_couiIfFollowHand, true);
        this.t = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPreference_couiDialogBlurBackground, false);
        this.u = AnimLevel.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPreference_couiBlurAnimLevel, ifk.ANIM_LEVEL_SUPPORT_BLUR_MIN.getIntValue()));
        typedArrayObtainStyledAttributes.recycle();
        this.f1906l = getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_divider_default_horizontal_padding);
    }

    public COUIListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
