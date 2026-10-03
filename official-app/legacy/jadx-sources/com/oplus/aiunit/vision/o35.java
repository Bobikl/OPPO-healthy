package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.coui.appcompat.poplist.COUITouchListView;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$style;
import com.support.listview.R$drawable;
import com.support.poplist.R$color;
import com.support.poplist.R$dimen;
import com.support.poplist.R$id;
import com.support.poplist.R$layout;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class o35 extends BaseAdapter {
    public static final int[] D = {16842910, 16842913};
    public static final int[] E = {-16842910};
    public static final Drawable F = new ColorDrawable(0);
    public static final Typeface G = Typeface.create("sans-serif-medium", 0);
    public static final int TYPE_DIVIDER_DEFAULT = 1;
    public static final int TYPE_DIVIDER_GROUP = 2;
    public static final int TYPE_DIVIDER_HEADER = 5;
    public static final int TYPE_ITEM_CUSTOM = 3;
    public static final int TYPE_ITEM_DEFAULT = 0;
    public static final int TYPE_ITEM_HEADER = 4;
    public ColorStateList A;
    public ColorStateList B;
    public gza C;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f14751j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14752l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14753n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean x;
    public List<qne> y;
    public final View.AccessibilityDelegate i = new a();
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public Set<Integer> z = null;

    public class a extends View.AccessibilityDelegate {
        public a() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("");
        }
    }

    public class b extends View.AccessibilityDelegate {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            super.performAccessibilityAction(view, i, bundle);
            if (i != 16) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof COUITouchListView)) {
                return true;
            }
            COUITouchListView cOUITouchListView = (COUITouchListView) parent;
            int firstVisiblePosition = this.a - cOUITouchListView.getFirstVisiblePosition();
            cOUITouchListView.performItemClick(cOUITouchListView.getChildAt(firstVisiblePosition), firstVisiblePosition, cOUITouchListView.getItemIdAtPosition(firstVisiblePosition));
            return true;
        }
    }

    public static class c {
        public TextView a;

        public final void b(View view) {
            this.a = (TextView) view.findViewById(R$id.popup_list_window_header_item_title);
        }
    }

    public static class d {
        public ImageView a;
        public TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f14754c;
        public Space d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f14755e;
        public Space f;
        public CheckBox g;

        public final void b(View view) {
            this.a = (ImageView) view.findViewById(R$id.popup_list_window_item_icon);
            this.b = (TextView) view.findViewById(R$id.popup_list_window_item_title);
            this.f14754c = (TextView) view.findViewById(R$id.popup_list_window_item_description);
            this.d = (Space) view.findViewById(R$id.popup_list_window_item_title_end_gap);
            this.f14755e = (LinearLayout) view.findViewById(R$id.popup_list_window_item_hint_layout);
            this.f = (Space) view.findViewById(R$id.popup_list_window_item_hint_end_gap);
            this.g = (CheckBox) view.findViewById(R$id.popup_list_window_item_state_icon);
        }
    }

    public o35(Context context, List<qne> list) {
        this.f14751j = context;
        J(list);
        Resources resources = context.getResources();
        this.k = resources.getDimensionPixelSize(R$dimen.coui_popup_list_divider_height);
        this.f14752l = resources.getDimensionPixelSize(R$dimen.coui_popup_list_group_divider_height);
        this.m = resources.getDimensionPixelSize(R$dimen.coui_popup_list_padding_vertical);
        this.f14753n = resources.getDimensionPixelSize(R$dimen.coui_popup_list_window_item_padding_top_and_bottom);
        this.o = resources.getDimensionPixelSize(R$dimen.coui_popup_list_window_header_item_min_height);
        this.p = resources.getDimensionPixelSize(R$dimen.coui_popup_list_window_item_min_height);
        this.q = resources.getDimensionPixelSize(R$dimen.coui_popup_list_default_divider_margin_start_with_icon);
        this.r = resources.getDimensionPixelSize(R$dimen.coui_popup_list_default_divider_margin_horizontal);
        this.A = ifk.h(context, R$color.coui_popup_list_window_item_tint_selector);
        this.B = ifk.h(context, R$color.coui_popup_list_window_item_status_icon_tint_selector);
        this.t = lh2.b(context, R$attr.couiColorError, com.support.appcompat.R$color.coui_color_error);
        this.s = lh2.b(context, R$attr.couiColorLabelSecondary, com.support.appcompat.R$color.coui_color_secondary_neutral);
    }

    public static int d(int i) {
        return i * 2;
    }

    @NonNull
    public static View.AccessibilityDelegate e(int i) {
        return new b(i);
    }

    public static boolean t(int i) {
        return i % 2 == 0;
    }

    public static /* synthetic */ boolean x(View view, MotionEvent motionEvent) {
        if (view == null) {
            return false;
        }
        Drawable background = view.getBackground();
        if (motionEvent.getActionMasked() == 0 && (background instanceof ej2)) {
            ((ej2) background).a();
        }
        if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (background instanceof ej2)) {
            ((ej2) background).f();
        }
        return false;
    }

    public static int z(int i) {
        return i / 2;
    }

    public void A(boolean z) {
        this.v = z;
    }

    public final void B(TextView textView, qne qneVar) {
        if (!(!TextUtils.isEmpty(qneVar.e()))) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setTextAppearance(R$style.couiTextBodyXS);
        textView.setText(qneVar.e());
        if (this.w) {
            textView.setTextSize(1, 12.0f);
        } else if (this.v) {
            gg2.c(textView, 4);
        }
        textView.setTextColor(this.s);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (TextUtils.isEmpty(qneVar.f())) {
            return;
        }
        textView.setContentDescription(qneVar.f());
    }

    public final void C(d dVar, qne qneVar) {
        boolean z = true;
        boolean z2 = qneVar.j() != -1;
        boolean z3 = qneVar.p() == null && qneVar.q() == 0 && qneVar.x();
        if (qneVar.p() == null && qneVar.q() == 0 && !qneVar.w() && !z3) {
            z = false;
        }
        if (!z2 && !z) {
            dVar.d.setVisibility(8);
            return;
        }
        dVar.d.setVisibility(4);
        if (z2 && z) {
            dVar.f.setVisibility(4);
        } else {
            dVar.f.setVisibility(8);
        }
    }

    public void D(Set<Integer> set) {
        this.z = set;
    }

    public final void E(ViewGroup viewGroup, qne qneVar) {
        if (qneVar.y()) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        viewGroup.removeAllViews();
        if (qneVar.j() == 0) {
            viewGroup.addView(o(qneVar), new ViewGroup.LayoutParams(-2, -2));
            return;
        }
        if (qneVar.j() != 1 || qneVar.c() == null) {
            return;
        }
        ViewParent parent = qneVar.c().getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(qneVar.c());
        }
        viewGroup.addView(qneVar.c());
    }

    public final void F(ImageView imageView, qne qneVar) {
        Drawable drawable;
        if ((this.u & 1) != 0) {
            imageView.setVisibility(0);
            if (qneVar.k() != null) {
                drawable = qneVar.k();
            } else {
                drawable = qneVar.l() != 0 ? ResourcesCompat.getDrawable(this.f14751j.getResources(), qneVar.l(), this.f14751j.getTheme()) : null;
            }
            if ((qneVar.g() & 1) != 0) {
                G(drawable, this.A, qneVar);
            }
            imageView.setSelected(qneVar.x());
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setVisibility(8);
        }
        imageView.setEnabled(qneVar.y());
    }

    public final void G(Drawable drawable, ColorStateList colorStateList, qne qneVar) {
        H(drawable, colorStateList, qneVar, false);
    }

    public final void H(Drawable drawable, ColorStateList colorStateList, qne qneVar, boolean z) {
        if (drawable == null) {
            return;
        }
        drawable.setTint(q(colorStateList, qneVar, z));
    }

    public void I(boolean z) {
        this.w = z;
    }

    public void J(List<qne> list) {
        this.y = list;
        if (list == null) {
            return;
        }
        qne qneVar = list.get(0);
        this.x = (qneVar == null || qneVar.i() == 0) ? false : true;
        this.u = 0;
        for (qne qneVar2 : this.y) {
            if (qneVar2 != null) {
                if (qneVar2.l() != 0 || qneVar2.k() != null) {
                    this.u |= 1;
                }
                if (!TextUtils.isEmpty(qneVar2.e())) {
                    this.u |= 2;
                }
                if (qneVar2.j() != -1) {
                    this.u |= 4;
                }
                if (qneVar2.q() != 0 || qneVar2.p() != null) {
                    this.u |= 8;
                }
                if (qneVar2.w()) {
                    this.u |= 16;
                }
            }
        }
    }

    public void K(gza gzaVar) {
        this.C = gzaVar;
    }

    public final void L(CheckBox checkBox, qne qneVar) {
        if (qneVar.p() != null || qneVar.q() != 0 || qneVar.w() || qneVar.x()) {
            checkBox.setVisibility(0);
            Drawable drawable = F;
            if (qneVar.w()) {
                drawable = ResourcesCompat.getDrawable(this.f14751j.getResources(), R$drawable.coui_list_expandable_indicator, this.f14751j.getTheme());
                H(drawable, this.B, qneVar, true);
            } else {
                if (qneVar.p() != null) {
                    drawable = qneVar.p();
                } else if (qneVar.q() != 0) {
                    drawable = ResourcesCompat.getDrawable(this.f14751j.getResources(), qneVar.q(), this.f14751j.getTheme());
                } else if (qneVar.x()) {
                    drawable = ResourcesCompat.getDrawable(this.f14751j.getResources(), com.support.poplist.R$drawable.coui_menu_ic_checkbox, this.f14751j.getTheme());
                }
                if ((qneVar.g() & 4) != 0) {
                    H(drawable, this.B, qneVar, true);
                }
            }
            checkBox.setButtonDrawable(drawable);
            checkBox.setChecked(qneVar.x());
        } else {
            checkBox.setVisibility(8);
        }
        checkBox.setEnabled(qneVar.y());
    }

    public final void M(TextView textView, ColorStateList colorStateList, qne qneVar) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(p(colorStateList, qneVar));
    }

    public final void N(TextView textView, qne qneVar, int i) {
        boolean z = !TextUtils.isEmpty(qneVar.e());
        textView.setTextAppearance(R$style.couiTextBodyL);
        if (qneVar.i() == 2 && i == 0) {
            textView.setTypeface(G);
        } else {
            textView.setTypeface(null);
        }
        textView.setText(qneVar.s());
        if (!TextUtils.isEmpty(qneVar.u())) {
            textView.setContentDescription(qneVar.u());
        }
        if (this.w) {
            textView.setTextSize(1, 16.0f);
        } else if (this.v) {
            gg2.c(textView, 4);
        } else {
            gg2.c(textView, 5);
        }
        if (z) {
            textView.setMaxLines(2);
        } else {
            textView.setMaxLines(3);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if ((qneVar.g() & 2) != 0) {
            M(textView, this.A, qneVar);
        } else if (qneVar.t() != null) {
            textView.setTextColor(qneVar.t());
        }
        textView.setSelected(qneVar.x());
        textView.setEnabled(qneVar.y());
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public final void b(View view, int i) {
        if (this.y.size() == 1) {
            view.setMinimumHeight(this.p + (this.m * 2));
            view.setPadding(view.getPaddingStart(), this.f14753n + this.m, view.getPaddingEnd(), this.f14753n + this.m);
        } else if (i == 0) {
            view.setMinimumHeight(this.p + this.m);
            view.setPadding(view.getPaddingStart(), this.f14753n + this.m, view.getPaddingEnd(), this.f14753n);
        } else if (i == this.y.size() - 1) {
            view.setMinimumHeight(this.p + this.m);
            view.setPadding(view.getPaddingStart(), this.f14753n, view.getPaddingEnd(), this.f14753n + this.m);
        } else {
            view.setMinimumHeight(this.p);
            view.setPadding(view.getPaddingStart(), this.f14753n, view.getPaddingEnd(), this.f14753n);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void c(View view, qne qneVar) {
        boolean z;
        gza gzaVar;
        if (qneVar == null || !qneVar.w() || qneVar.i() == 2 || (view.getBackground() instanceof gza)) {
            if (qneVar == null || !qneVar.w() || qneVar.i() != 2 || (gzaVar = this.C) == null) {
                z = true;
            } else {
                view.setBackground(gzaVar.J());
            }
            if (z && !(view.getBackground() instanceof ej2)) {
                ej2 ej2Var = new ej2(this.f14751j, 1);
                ej2Var.y(false);
                ej2Var.C(false);
                ej2Var.f();
                view.setBackground(ej2Var);
            }
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.n35
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return o35.x(view2, motionEvent);
                }
            });
        }
        view.setBackground(new gza(this.f14751j, 1, null));
        z = false;
        if (z) {
            ej2 ej2Var2 = new ej2(this.f14751j, 1);
            ej2Var2.y(false);
            ej2Var2.C(false);
            ej2Var2.f();
            view.setBackground(ej2Var2);
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.n35
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return o35.x(view2, motionEvent);
            }
        });
    }

    public final View f(int i, View view, ViewGroup viewGroup) {
        qne qneVar = this.y.get(z(i));
        View viewD = qneVar.d();
        if (viewD == null) {
            Log.e("DefaultAdapter", "Popup list item custom view is null! Return an empty view.");
            viewD = new View(viewGroup.getContext());
        }
        if (view == null) {
            viewD.setClickable(true);
            view = viewD;
        }
        view.setAccessibilityDelegate(e(i));
        c(view, qneVar);
        view.setEnabled(qneVar.y());
        return viewD;
    }

    public final InsetDrawable g(boolean z) {
        boolean zW = w();
        int i = (zW || z || !r()) ? this.r : this.q;
        int i2 = i;
        int i3 = (zW && !z && r()) ? this.q : this.r;
        return new InsetDrawable((Drawable) new ColorDrawable(lh2.a(this.f14751j, R$attr.couiColorDivider)), i2, 0, i3, 0);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (y(this.y)) {
            return d(this.y.size()) - 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (z(i) >= this.y.size()) {
            return null;
        }
        return this.y.get(z(i));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (!t(i)) {
            if (v(i)) {
                return 5;
            }
            return u(i) ? 2 : 1;
        }
        int iZ = z(i);
        if (!y(this.y) || iZ >= this.y.size()) {
            return 0;
        }
        int iM = this.y.get(iZ).m();
        if (iM != 2) {
            return iM != 3 ? 0 : 4;
        }
        return 3;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1 && itemViewType != 2) {
                if (itemViewType != 3 && itemViewType != 4) {
                    if (itemViewType != 5) {
                        Log.e("DefaultAdapter", "View type error!");
                        return null;
                    }
                }
            }
            return k(i, view, itemViewType);
        }
        return n(i, view, viewGroup, itemViewType);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 6;
    }

    public final View h(View view, boolean z) {
        if (view != null) {
            return view;
        }
        View view2 = new View(this.f14751j);
        ViewCompat.setImportantForAccessibility(view2, 2);
        ph2.c(view2, false);
        view2.setBackground(g(z));
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, this.k));
        view2.setFocusable(false);
        return view2;
    }

    public final View i(int i, View view, ViewGroup viewGroup) {
        d dVar;
        int iZ = z(i);
        if (view == null || !(view.getTag() instanceof d)) {
            d dVar2 = new d();
            View viewInflate = LayoutInflater.from(this.f14751j).inflate(R$layout.coui_popup_list_window_item, viewGroup, false);
            dVar2.b(viewInflate);
            viewInflate.setClickable(true);
            CheckBox checkBox = dVar2.g;
            if (checkBox != null) {
                checkBox.setAccessibilityDelegate(this.i);
                dVar2.g.setBackground(null);
            }
            viewInflate.setTag(dVar2);
            dVar = dVar2;
            view = viewInflate;
        } else {
            dVar = (d) view.getTag();
        }
        view.setAccessibilityDelegate(e(i));
        b(view, iZ);
        qne qneVar = this.y.get(iZ);
        F(dVar.a, qneVar);
        N(dVar.b, qneVar, i);
        B(dVar.f14754c, qneVar);
        C(dVar, qneVar);
        E(dVar.f14755e, qneVar);
        L(dVar.g, qneVar);
        view.setEnabled(qneVar.y());
        c(view, qneVar);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return t(i);
    }

    public int j(int i) {
        if (i == 1) {
            return this.k;
        }
        if (i == 2) {
            return this.f14752l;
        }
        return 0;
    }

    public final View k(int i, View view, int i2) {
        View viewH;
        if (i2 != 2) {
            viewH = i2 != 5 ? h(view, false) : h(view, true);
        } else {
            viewH = (this.x && i == 1) ? h(view, false) : l(view);
        }
        viewH.setFocusable(false);
        return viewH;
    }

    public final View l(View view) {
        if (view != null) {
            return view;
        }
        View view2 = new View(this.f14751j);
        ViewCompat.setImportantForAccessibility(view2, 2);
        ph2.c(view2, false);
        view2.setBackgroundColor(ResourcesCompat.getColor(this.f14751j.getResources(), R$color.coui_popup_list_group_divider_color, this.f14751j.getTheme()));
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, this.f14752l));
        return view2;
    }

    public final View m(int i, View view, ViewGroup viewGroup) {
        c cVar;
        int iZ = z(i);
        if (view == null || !(view.getTag() instanceof c)) {
            c cVar2 = new c();
            View viewInflate = LayoutInflater.from(this.f14751j).inflate(R$layout.coui_popup_list_window_header_item, viewGroup, false);
            cVar2.b(viewInflate);
            viewInflate.setClickable(false);
            viewInflate.setTag(cVar2);
            cVar = cVar2;
            view = viewInflate;
        } else {
            cVar = (c) view.getTag();
        }
        view.setAccessibilityDelegate(e(i));
        b(view, iZ);
        view.setMinimumHeight(this.o);
        qne qneVar = this.y.get(iZ);
        cVar.a.setText(qneVar.s());
        if (!TextUtils.isEmpty(qneVar.u())) {
            cVar.a.setContentDescription(qneVar.u());
        }
        if (this.w) {
            cVar.a.setTextSize(1, 12.0f);
        } else if (this.v) {
            gg2.c(cVar.a, 4);
        } else {
            gg2.c(cVar.a, 5);
        }
        return view;
    }

    public final View n(int i, View view, ViewGroup viewGroup, int i2) {
        if (i2 != 3) {
            return i2 != 4 ? i(i, view, viewGroup) : m(i, view, viewGroup);
        }
        return f(i, view, viewGroup);
    }

    public final View o(qne qneVar) {
        COUIHintRedDot cOUIHintRedDot = new COUIHintRedDot(new ContextThemeWrapper(this.f14751j, com.support.reddot.R$style.Widget_COUI_COUIHintRedDot_Small));
        if (TextUtils.isEmpty(qneVar.o())) {
            cOUIHintRedDot.setPointNumber(qneVar.n());
            int iN = qneVar.n();
            if (iN == -1) {
                cOUIHintRedDot.setPointMode(0);
            } else if (iN != 0) {
                cOUIHintRedDot.setPointMode(2);
            } else {
                cOUIHintRedDot.setPointMode(1);
            }
        } else {
            cOUIHintRedDot.setPointMode(2);
            cOUIHintRedDot.setPointText(qneVar.o());
        }
        return cOUIHintRedDot;
    }

    public final int p(ColorStateList colorStateList, qne qneVar) {
        return q(colorStateList, qneVar, false);
    }

    public final int q(ColorStateList colorStateList, qne qneVar, boolean z) {
        if (!qneVar.y()) {
            return colorStateList.getColorForState(E, com.support.appcompat.R$color.coui_color_error);
        }
        if (qneVar.m() != 0) {
            return qneVar.m() == 1 ? this.t : colorStateList.getDefaultColor();
        }
        if ((!z || qneVar.i() == 0) && !qneVar.x()) {
            return colorStateList.getDefaultColor();
        }
        return colorStateList.getColorForState(D, com.support.appcompat.R$color.coui_color_error);
    }

    public boolean r() {
        return (this.u & 1) != 0;
    }

    public boolean s() {
        return (this.u & 16) != 0;
    }

    public boolean u(int i) {
        Set<Integer> set = this.z;
        return (set == null || !set.contains(Integer.valueOf((i + 1) / 2)) || v(i)) ? false : true;
    }

    public boolean v(int i) {
        if (i <= 0) {
            return false;
        }
        return y(this.y) && this.y.get(z(i - 1)).m() == 3;
    }

    public final boolean w() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public final boolean y(List<?> list) {
        return (list == null || list.isEmpty()) ? false : true;
    }
}
