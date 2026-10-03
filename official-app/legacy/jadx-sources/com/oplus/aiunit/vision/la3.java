package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.dialog.R$id;

/* JADX INFO: loaded from: classes13.dex */
public class la3 extends BaseAdapter {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence[] f13601j;
    public CharSequence[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f13602l;
    public Drawable[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13603n;
    public boolean o;
    public boolean[] p;
    public boolean[] q;
    public int r;
    public boolean s;
    public boolean t;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class b implements View.OnClickListener {
        public final /* synthetic */ int i;

        public b(int i) {
            this.i = i;
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            View viewFindViewById = view.findViewById(R$id.checkbox);
            if (viewFindViewById instanceof COUICheckBox) {
                COUICheckBox cOUICheckBox = (COUICheckBox) viewFindViewById;
                if (cOUICheckBox.getState() == 2) {
                    cOUICheckBox.setState(0);
                    la3.this.p[this.i] = false;
                } else if (la3.this.r <= 0 || la3.this.r > la3.this.g()) {
                    cOUICheckBox.setState(2);
                    la3.this.p[this.i] = true;
                } else {
                    la3.d(la3.this);
                }
                la3.e(la3.this);
            } else if (viewFindViewById instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) viewFindViewById;
                checkBox.setChecked(!checkBox.isChecked());
                la3.e(la3.this);
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public interface c {
    }

    public interface d {
    }

    public static class e {
        public ImageView a;
        public LinearLayout b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f13605c;
        public TextView d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public COUICheckBox f13606e;
        public FrameLayout f;
        public RadioButton g;
        public ImageView h;
    }

    public la3(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, boolean[] zArr, boolean z) {
        this(context, i, charSequenceArr, charSequenceArr2, zArr, null, z);
    }

    public static /* synthetic */ c d(la3 la3Var) {
        la3Var.getClass();
        return null;
    }

    public static /* synthetic */ d e(la3 la3Var) {
        la3Var.getClass();
        return null;
    }

    public boolean[] f() {
        return this.p;
    }

    public final int g() {
        int i = 0;
        for (boolean z : this.p) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        CharSequence[] charSequenceArr = this.f13601j;
        if (charSequenceArr == null) {
            return 0;
        }
        return charSequenceArr.length;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        e eVar;
        Drawable drawable;
        if (view == null) {
            eVar = new e();
            viewInflate = LayoutInflater.from(this.i).inflate(this.f13603n, viewGroup, false);
            eVar.a = (ImageView) viewInflate.findViewById(R$id.alertdialog_choice_icon);
            eVar.b = (LinearLayout) viewInflate.findViewById(R$id.text_layout);
            eVar.d = (TextView) viewInflate.findViewById(R.id.text1);
            eVar.f13605c = (TextView) viewInflate.findViewById(R$id.summary_text2);
            eVar.h = (ImageView) viewInflate.findViewById(R$id.item_divider);
            if (this.o) {
                eVar.f13606e = (COUICheckBox) viewInflate.findViewById(R$id.checkbox);
            } else {
                eVar.f = (FrameLayout) viewInflate.findViewById(R$id.radio_layout);
                eVar.g = (RadioButton) viewInflate.findViewById(R$id.radio_button);
            }
            viewInflate.setTag(eVar);
        } else {
            viewInflate = view;
            eVar = (e) view.getTag();
        }
        boolean z = this.q[i];
        eVar.d.setEnabled(!z);
        eVar.f13605c.setEnabled(!z);
        if (this.o) {
            eVar.f13606e.setEnabled(!z);
        } else {
            eVar.g.setEnabled(!z);
        }
        if (z) {
            viewInflate.setOnTouchListener(new a());
        } else {
            viewInflate.setOnTouchListener(null);
        }
        if (this.o) {
            eVar.f13606e.setState(this.p[i] ? 2 : 0);
            viewInflate.setOnClickListener(new b(i));
        } else {
            eVar.g.setChecked(this.p[i]);
        }
        CharSequence item = getItem(i);
        CharSequence charSequenceI = i(i);
        eVar.d.setText(item);
        if (TextUtils.isEmpty(charSequenceI)) {
            eVar.f13605c.setVisibility(8);
        } else {
            eVar.f13605c.setVisibility(0);
            eVar.f13605c.setText(charSequenceI);
        }
        if (eVar.h != null) {
            if (getCount() == 1 || i == getCount() - 1) {
                eVar.h.setVisibility(8);
            } else {
                eVar.h.setVisibility(0);
            }
        }
        int[] iArr = this.f13602l;
        if (iArr == null || i >= iArr.length) {
            Drawable[] drawableArr = this.m;
            if (drawableArr == null || i >= drawableArr.length || (drawable = drawableArr[i]) == null) {
                eVar.a.setVisibility(8);
            } else {
                eVar.a.setVisibility(0);
                eVar.a.setImageDrawable(drawable);
            }
        } else {
            Drawable drawable2 = AppCompatResources.getDrawable(this.i, iArr[i]);
            if (drawable2 != null) {
                eVar.a.setVisibility(0);
                eVar.a.setImageDrawable(drawable2);
            } else {
                eVar.a.setVisibility(8);
            }
        }
        return viewInflate;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public CharSequence getItem(int i) {
        CharSequence[] charSequenceArr = this.f13601j;
        if (charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[i];
    }

    public CharSequence i(int i) {
        CharSequence[] charSequenceArr = this.k;
        if (charSequenceArr != null && i < charSequenceArr.length) {
            return charSequenceArr[i];
        }
        return null;
    }

    public final void j(boolean[] zArr) {
        for (int i = 0; i < zArr.length; i++) {
            boolean[] zArr2 = this.p;
            if (i >= zArr2.length) {
                return;
            }
            zArr2[i] = zArr[i];
        }
    }

    public final void k(boolean[] zArr) {
        for (int i = 0; i < zArr.length; i++) {
            boolean[] zArr2 = this.q;
            if (i >= zArr2.length) {
                return;
            }
            zArr2[i] = zArr[i];
        }
    }

    public void l(int[] iArr) {
        this.f13602l = iArr;
    }

    public void m(boolean z) {
        this.t = z;
    }

    public void n(boolean z) {
        this.s = z;
    }

    public la3(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, boolean[] zArr, boolean[] zArr2, boolean z) {
        this(context, i, charSequenceArr, charSequenceArr2, zArr, zArr2, z, 0);
    }

    public la3(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, boolean[] zArr, boolean[] zArr2, boolean z, int i2) {
        this.s = false;
        this.t = false;
        this.i = context;
        this.f13603n = i;
        this.f13601j = charSequenceArr;
        this.k = charSequenceArr2;
        this.o = z;
        this.p = new boolean[charSequenceArr.length];
        if (zArr != null) {
            j(zArr);
        }
        this.q = new boolean[this.f13601j.length];
        if (zArr2 != null) {
            k(zArr2);
        }
        this.r = i2;
    }

    public la3(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this(context, i, charSequenceArr, charSequenceArr2, null, false);
    }
}
