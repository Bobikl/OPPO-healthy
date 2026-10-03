package com.coui.appcompat.bottomfloatingtoolbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.oplus.aiunit.vision.fj2;
import com.support.bottomnavigation.R$attr;
import com.support.bottomnavigation.R$dimen;
import com.support.bottomnavigation.R$id;
import com.support.bottomnavigation.R$layout;
import com.support.reddot.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class COUIBottomFloatingToolbarItemView extends FrameLayout {
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f1556j;
    public final COUIHintRedDot k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f1557l;
    public final fj2 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1558n;
    public final String o;
    public int p;
    public boolean q;

    public COUIBottomFloatingToolbarItemView(@NonNull Context context) {
        this(context, null);
    }

    public void a(a aVar) {
        setId(aVar.f());
        setIcon(aVar.e());
        setTitle(aVar.g());
        setGroupId(aVar.d());
        setContentDescription(aVar.c());
        setShowRedDot(aVar.j());
        setEnabled(aVar.i());
    }

    public final boolean b() {
        return this.i.getDrawable() != null;
    }

    public final void c() {
        this.k.setVisibility(this.q ? 0 : 8);
        if (this.q) {
            if (ViewCompat.getLayoutDirection(this) == 1) {
                this.f1557l.set((-this.k.getMeasuredWidth()) / 2, (-this.k.getMeasuredHeight()) / 2, this.k.getMeasuredWidth() / 2, this.k.getMeasuredHeight() / 2);
                Rect rect = this.f1557l;
                int i = this.f1558n;
                rect.offset(i, i);
            } else {
                this.f1557l.set(getWidth() - (this.k.getMeasuredWidth() / 2), (-this.k.getMeasuredHeight()) / 2, getWidth() + (this.k.getMeasuredWidth() / 2), this.k.getMeasuredHeight() / 2);
                Rect rect2 = this.f1557l;
                int i2 = this.f1558n;
                rect2.offset(-i2, i2);
            }
            COUIHintRedDot cOUIHintRedDot = this.k;
            Rect rect3 = this.f1557l;
            cOUIHintRedDot.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
    }

    public final void d() {
        if (b()) {
            this.f1556j.setVisibility(8);
            this.i.setVisibility(0);
            this.m.u(getResources().getDimensionPixelSize(R$dimen.coui_floating_toolbar_mask_view_icon_radius));
        } else {
            this.i.setVisibility(8);
            this.f1556j.setVisibility(0);
            this.m.v();
        }
    }

    public int getGroupId() {
        return this.p;
    }

    public Drawable getIcon() {
        return this.i.getDrawable();
    }

    public boolean getShowRedDot() {
        return this.q;
    }

    public CharSequence getTitle() {
        return this.f1556j.getText();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getContentDescription() == null || getContentDescription().length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.f1556j.getText());
            if (this.q) {
                str = "," + this.o;
            } else {
                str = "";
            }
            sb.append(str);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        d();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.i.setEnabled(z);
        this.f1556j.setEnabled(z);
        if (z) {
            return;
        }
        setShowRedDot(false);
    }

    public void setGroupId(int i) {
        this.p = i;
    }

    public void setIcon(Drawable drawable) {
        this.i.setImageDrawable(drawable);
    }

    public void setShowRedDot(boolean z) {
        this.q = z;
        this.k.setVisibility(z ? 0 : 8);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1556j.setText(charSequence);
    }

    public COUIBottomFloatingToolbarItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiFloatingToolbarStyle);
    }

    public COUIBottomFloatingToolbarItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIBottomFloatingToolbarItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1558n = getResources().getDimensionPixelSize(R$dimen.coui_floating_toolbar_red_dot_offset);
        this.o = getResources().getString(R$string.red_dot_description);
        this.q = false;
        LayoutInflater.from(context).inflate(R$layout.coui_floating_toolbar_item, (ViewGroup) this, true);
        this.i = (ImageView) findViewById(R$id.floating_tool_bar_item_icon_view);
        this.f1556j = (TextView) findViewById(R$id.floating_tool_bar_item_text_view);
        this.k = (COUIHintRedDot) findViewById(R$id.red_dot);
        this.f1557l = new Rect();
        setClickable(true);
        setFocusable(true);
        fj2 fj2Var = new fj2(context);
        this.m = fj2Var;
        fj2Var.v();
        fj2Var.q(true);
        setBackground(fj2Var);
        setLayoutDirection(3);
        Resources resources = getResources();
        int i3 = R$dimen.coui_floating_toolbar_item_height;
        setMinimumWidth(resources.getDimensionPixelSize(i3));
        setMinimumHeight(getResources().getDimensionPixelSize(i3));
    }
}
