package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.support.dialog.R$dimen;
import com.support.dialog.R$id;
import com.support.dialog.R$layout;

/* JADX INFO: loaded from: classes13.dex */
public class k3j extends BaseAdapter {
    public static final int o = R$layout.coui_alert_dialog_summary_item;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13140j;
    public Context k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence[] f13141l;
    public CharSequence[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f13142n;

    public class b {
        public TextView a;
        public TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f13143c;
        public LinearLayout d;

        public b() {
        }
    }

    public k3j(Context context, boolean z, boolean z2, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, int[] iArr) {
        this.i = z;
        this.f13140j = z2;
        this.k = context;
        this.f13141l = charSequenceArr;
        this.m = charSequenceArr2;
        this.f13142n = iArr;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CharSequence getItem(int i) {
        CharSequence[] charSequenceArr = this.f13141l;
        if (charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[i];
    }

    public CharSequence b(int i) {
        CharSequence[] charSequenceArr = this.m;
        if (charSequenceArr != null && i < charSequenceArr.length) {
            return charSequenceArr[i];
        }
        return null;
    }

    public final void c(int i, View view) {
        int dimensionPixelSize = this.k.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_vertical_button_padding_bottom_extra_new);
        int dimensionPixelSize2 = this.k.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_vertical_button_padding_vertical_new);
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (i == getCount() - 1 && this.f13140j) {
            view.setPadding(paddingLeft, dimensionPixelSize2, paddingRight, dimensionPixelSize + dimensionPixelSize2);
        } else if (i == 0 && this.i) {
            view.setPadding(paddingLeft, dimensionPixelSize + dimensionPixelSize2, paddingRight, dimensionPixelSize2);
        } else {
            view.setPadding(paddingLeft, dimensionPixelSize2, paddingRight, dimensionPixelSize2);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        CharSequence[] charSequenceArr = this.f13141l;
        if (charSequenceArr == null) {
            return 0;
        }
        return charSequenceArr.length;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.k).inflate(o, viewGroup, false);
            bVar = new b();
            bVar.a = (TextView) view.findViewById(R.id.text1);
            bVar.b = (TextView) view.findViewById(R$id.summary_text2);
            bVar.f13143c = (ImageView) view.findViewById(R$id.item_divider);
            bVar.d = (LinearLayout) view.findViewById(R$id.main_layout);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        CharSequence item = getItem(i);
        CharSequence charSequenceB = b(i);
        bVar.a.setText(item);
        if (TextUtils.isEmpty(charSequenceB)) {
            bVar.b.setVisibility(8);
        } else {
            bVar.b.setVisibility(0);
            bVar.b.setText(charSequenceB);
        }
        c(i, bVar.d);
        int[] iArr = this.f13142n;
        if (iArr != null && i >= 0 && i < iArr.length) {
            bVar.a.setTextColor(iArr[i]);
        }
        if (bVar.f13143c != null) {
            if (getCount() <= 1 || i == getCount() - 1) {
                bVar.f13143c.setVisibility(8);
            } else {
                bVar.f13143c.setVisibility(0);
            }
        }
        view.requestLayout();
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
