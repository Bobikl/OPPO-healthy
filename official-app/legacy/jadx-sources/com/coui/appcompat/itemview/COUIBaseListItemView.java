package com.coui.appcompat.itemview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ICOUIBaseListItemView;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.coui.appcompat.preference.COUICustomListSelectedLinearLayout;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.support.preference.R$dimen;
import com.support.preference.R$id;
import com.support.preference.R$layout;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIBaseListItemView extends RelativeLayout implements ICOUIBaseListItemView {
    public static final int CIRCLE = 0;
    public static final int FORCE_CLICKABLE = 1;
    public static final int FORCE_UNCLICKABLE = 2;
    public static final int ROUND = 1;
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f1813j;
    public COUIRoundImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public COUIHintRedDot f1814l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f1815n;
    public COUIHintRedDot o;
    public COUIHintRedDot p;
    public COUIRoundImageView q;
    public TextView r;
    public ViewGroup s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;

    public COUIBaseListItemView(Context context) {
        this(context, null);
    }

    private void setIconMarginDependOnImageView(boolean z) {
        View view = this.f1813j;
        if (view instanceof COUICustomListSelectedLinearLayout) {
            ((COUICustomListSelectedLinearLayout) view).setIconMarginDependOnImageView(z);
        }
    }

    public final void a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                a(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void b(int i, boolean z, int i2, boolean z2) {
        if (z2) {
            this.k.setHasBorder(z);
            this.k.setBorderRectRadius(0);
            this.k.setType(i2);
            return;
        }
        Drawable drawable = this.k.getDrawable();
        if (drawable != null && i == 14) {
            i = drawable.getIntrinsicHeight() / 6;
            Resources resources = getContext().getResources();
            int i3 = R$dimen.coui_preference_icon_min_radius;
            if (i < resources.getDimensionPixelOffset(i3)) {
                i = getContext().getResources().getDimensionPixelOffset(i3);
            } else {
                Resources resources2 = getContext().getResources();
                int i4 = R$dimen.coui_preference_icon_max_radius;
                if (i > resources2.getDimensionPixelOffset(i4)) {
                    i = getContext().getResources().getDimensionPixelOffset(i4);
                }
            }
        }
        this.k.setHasBorder(z);
        this.k.setBorderRectRadius(i);
        this.k.setType(i2);
    }

    public ImageView getAssignIconView() {
        return this.q;
    }

    public ImageView getIconView() {
        return this.k;
    }

    @Override // androidx.recyclerview.widget.ICOUIBaseListItemView
    public boolean getItemEnabled() {
        return this.v;
    }

    public final View getRootItemView() {
        return this.f1813j;
    }

    public final void setAssignIcon(Drawable drawable) {
        COUIRoundImageView cOUIRoundImageView = this.q;
        if (cOUIRoundImageView != null) {
            if (drawable == null) {
                cOUIRoundImageView.setVisibility(8);
            } else {
                cOUIRoundImageView.setImageDrawable(drawable);
                this.q.setVisibility(0);
            }
        }
    }

    public void setAssignRedDotMode(int i) {
        COUIHintRedDot cOUIHintRedDot = this.p;
        if (cOUIHintRedDot != null) {
            if (i == 0) {
                cOUIHintRedDot.setVisibility(8);
                return;
            }
            cOUIHintRedDot.c();
            this.p.setVisibility(0);
            this.p.setPointMode(i);
            this.p.invalidate();
        }
    }

    public final void setAssignment(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.r.setVisibility(8);
        } else {
            this.r.setText(charSequence);
            this.r.setVisibility(0);
        }
    }

    public void setAssignmentColor(int i) {
        if (i != 0) {
            this.r.setTextColor(i);
        }
    }

    public void setClickableStyle(int i) {
        if (i == 1) {
            this.f1813j.setClickable(false);
        } else {
            if (i != 2) {
                return;
            }
            this.f1813j.setClickable(true);
        }
    }

    public void setCustomIconRadius(boolean z) {
        this.t = z;
        b(this.w, this.u, this.x, z);
    }

    @Deprecated
    public final void setEnable(boolean z) {
        a(this, z);
    }

    public final void setIcon(Drawable drawable) {
        if (drawable == null) {
            this.k.setVisibility(8);
        } else {
            this.k.setImageDrawable(drawable);
            this.k.setVisibility(0);
        }
    }

    public void setIconBorderRadius(int i) {
        this.w = i;
        b(i, this.u, this.x, this.t);
    }

    public void setIconHasBorder(boolean z) {
        this.u = z;
        b(this.w, z, this.x, this.t);
    }

    public void setIconRedDotMode(int i) {
        if (i == 0) {
            this.f1814l.setVisibility(8);
            return;
        }
        this.f1814l.c();
        this.f1814l.setVisibility(0);
        this.f1814l.setPointMode(i);
        this.f1814l.invalidate();
    }

    public void setIconStyle(int i) {
        if (i == 0 || i == 1) {
            this.x = i;
            b(this.w, this.u, i, this.t);
        }
    }

    public final void setItemBackground(Drawable drawable) {
        this.f1813j.setBackground(drawable);
    }

    @Override // androidx.recyclerview.widget.ICOUIBaseListItemView
    public void setItemEnabled(boolean z) {
        if (this.v != z) {
            this.v = z;
            a(this, z);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f1813j.setOnClickListener(onClickListener);
    }

    public void setPaddingEnd(int i) {
        View view = this.f1813j;
        view.setPaddingRelative(view.getPaddingStart(), this.f1813j.getPaddingTop(), i, this.f1813j.getPaddingBottom());
    }

    public void setPaddingStart(int i) {
        View view = this.f1813j;
        view.setPaddingRelative(i, view.getPaddingTop(), this.f1813j.getPaddingEnd(), this.f1813j.getPaddingBottom());
    }

    public final void setSummary(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f1815n.setVisibility(8);
        } else {
            this.f1815n.setText(charSequence);
            this.f1815n.setVisibility(0);
        }
    }

    public void setSummaryColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f1815n.setTextColor(colorStateList);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.m.setVisibility(8);
        } else {
            this.m.setText(charSequence);
            this.m.setVisibility(0);
        }
    }

    public void setTitleColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.m.setTextColor(colorStateList);
        }
    }

    public final void setWidgetView(int i) {
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            if (i == 0) {
                viewGroup.setVisibility(8);
                return;
            }
            viewGroup.setVisibility(0);
            this.s.removeAllViews();
            View.inflate(this.i, i, this.s);
        }
    }

    public COUIBaseListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIBaseListItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIBaseListItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.v = true;
        this.w = 14;
        this.x = 1;
        this.i = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIBaseListItemView, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIBaseListItemView_assignInRightAsMainLayout, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIBaseListItemView_iconMarginDependOnImageView, false);
        this.v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIBaseListItemView_itemEnabled, true);
        CharSequence text = typedArrayObtainStyledAttributes.getText(R$styleable.COUIBaseListItemView_title);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(R$styleable.COUIBaseListItemView_summary);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIBaseListItemView_icon);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(R$styleable.COUIBaseListItemView_assignment);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIBaseListItemView_assignmentIcon);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIBaseListItemView_widgetLayout, 0);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = View.inflate(context, z ? R$layout.coui_preference_assignment_in_right : R$layout.coui_preference, this);
        this.f1813j = viewInflate.findViewById(R$id.coui_preference);
        View viewFindViewById = viewInflate.findViewById(R$id.img_layout);
        this.k = (COUIRoundImageView) viewInflate.findViewById(R.id.icon);
        this.f1814l = (COUIHintRedDot) viewInflate.findViewById(R$id.img_red_dot);
        this.m = (TextView) viewInflate.findViewById(R.id.title);
        this.f1815n = (TextView) viewInflate.findViewById(R.id.summary);
        this.o = (COUIHintRedDot) viewInflate.findViewById(R$id.jump_icon_red_dot);
        this.p = (COUIHintRedDot) viewInflate.findViewById(R$id.assignment_red_dot);
        this.q = (COUIRoundImageView) viewInflate.findViewById(R$id.assignment_icon);
        this.r = (TextView) viewInflate.findViewById(R$id.assignment);
        this.s = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        this.f1813j.setClickable(true);
        setIconMarginDependOnImageView(z2);
        viewFindViewById.setVisibility(0);
        setTitle(text);
        setSummary(text2);
        setIcon(drawable);
        setAssignment(text3);
        setAssignIcon(drawable2);
        setWidgetView(resourceId);
        b(this.w, this.u, this.x, this.t);
        a(this, this.v);
    }

    public void setWidgetView(View view) {
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            if (view != null) {
                viewGroup.setVisibility(0);
                this.s.removeAllViews();
                this.s.addView(view);
                return;
            }
            viewGroup.setVisibility(8);
        }
    }
}
