package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.content.res.Resources;
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
import com.support.dialog.R$style;

/* JADX INFO: loaded from: classes13.dex */
public class wi2 extends BaseAdapter {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f18271j;
    public CharSequence[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f18272l;
    public final int i = R$layout.coui_list_dialog_item;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18273n = false;

    public class a {
        public TextView a;
        public ImageView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f18274c;

        public a() {
        }
    }

    public wi2(Context context, CharSequence[] charSequenceArr, int[] iArr) {
        this.f18271j = context;
        this.k = charSequenceArr;
        this.f18272l = iArr;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CharSequence getItem(int i) {
        CharSequence[] charSequenceArr = this.k;
        if (charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[i];
    }

    public final View b(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f18271j).inflate(this.i, viewGroup, false);
            aVar = new a();
            aVar.a = (TextView) view.findViewById(R.id.text1);
            aVar.b = (ImageView) view.findViewById(R$id.item_divider);
            aVar.f18274c = (LinearLayout) view.findViewById(R$id.main_layout);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a.setText(getItem(i));
        int[] iArr = this.f18272l;
        if (iArr != null) {
            int i2 = iArr[i];
            if (i2 > 0) {
                aVar.a.setTextAppearance(this.f18271j, i2);
            } else {
                aVar.a.setTextAppearance(this.f18271j, R$style.DefaultDialogItemTextStyle);
            }
        }
        if (aVar.b != null) {
            if (getCount() <= 1 || i == getCount() - 1) {
                aVar.b.setVisibility(8);
            } else {
                aVar.b.setVisibility(0);
            }
        }
        return view;
    }

    public final void c(int i, View view) {
        int dimensionPixelSize = this.f18271j.getResources().getDimensionPixelSize(R$dimen.coui_bottom_alert_dialog_vertical_button_padding_bottom_extra_new);
        Resources resources = this.f18271j.getResources();
        int i2 = R$dimen.coui_bottom_alert_dialog_vertical_button_padding_vertical_new;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        int dimensionPixelSize3 = this.f18271j.getResources().getDimensionPixelSize(R$dimen.alert_dialog_list_item_padding_left);
        int dimensionPixelSize4 = this.f18271j.getResources().getDimensionPixelSize(i2);
        int dimensionPixelSize5 = this.f18271j.getResources().getDimensionPixelSize(R$dimen.alert_dialog_list_item_padding_right);
        this.f18271j.getResources().getDimensionPixelSize(R$dimen.alert_dialog_list_item_min_height);
        if (i == getCount() - 1 && this.f18273n) {
            view.setPadding(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize5, dimensionPixelSize4 + dimensionPixelSize);
        } else if (i == 0 && this.m) {
            view.setPadding(dimensionPixelSize3, dimensionPixelSize2 + dimensionPixelSize, dimensionPixelSize5, dimensionPixelSize4);
        } else {
            view.setPadding(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize5, dimensionPixelSize4);
        }
    }

    public void d(boolean z) {
        this.f18273n = z;
    }

    public void e(boolean z) {
        this.m = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        CharSequence[] charSequenceArr = this.k;
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
        View viewB = b(i, view, viewGroup);
        c(i, viewB.findViewById(R$id.main_layout));
        return viewB;
    }
}
