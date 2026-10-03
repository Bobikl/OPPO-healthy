package com.heytap.sporthealth.blib.weiget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ZFlowLayout extends ViewGroup implements View.OnClickListener {
    public static final int DEFAULT_SPACING = 20;
    public boolean A;
    public ColorStateList B;
    public List<String> C;
    public String[] D;
    public String[] E;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7754j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f7755l;
    public final List<c> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f7756n;
    public int o;
    public boolean p;
    public boolean q;
    public Checkable r;
    public d s;
    public int t;
    public boolean u;
    public int v;
    public ViewGroup.LayoutParams w;
    public float x;
    public int y;
    public int z;

    public class a extends DiffUtil.Callback {
        public a() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            ZFlowLayout zFlowLayout = ZFlowLayout.this;
            return Objects.equals(zFlowLayout.D[i], zFlowLayout.E[i2]);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            ZFlowLayout zFlowLayout = ZFlowLayout.this;
            return Objects.equals(zFlowLayout.D[i], zFlowLayout.E[i2]);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        @Nullable
        public Object getChangePayload(int i, int i2) {
            return ZFlowLayout.this.E[i2];
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return ZFlowLayout.this.E.length;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return ZFlowLayout.this.D.length;
        }
    }

    public class b implements ListUpdateCallback {
        public final /* synthetic */ List i;

        public b(List list) {
            this.i = list;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i, int i2, @Nullable Object obj) {
            ((TextView) ZFlowLayout.this.getChildAt(i)).setText(obj.toString());
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i, int i2) {
            int size = this.i.size() - i2;
            if (size < 0) {
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                i += i3;
                if (i >= ZFlowLayout.this.getChildCount()) {
                    ZFlowLayout.this.f((String) this.i.get(size));
                } else {
                    ZFlowLayout.this.e(i, (String) this.i.get(size));
                }
                this.i.remove(size);
            }
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                ZFlowLayout.this.removeViewAt(i);
            }
        }
    }

    public class c {
        public int a = 0;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<View> f7758c = new ArrayList();

        public c() {
        }

        public void a(View view) {
            this.f7758c.add(view);
            this.a += view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i = this.b;
            if (i >= measuredHeight) {
                measuredHeight = i;
            }
            this.b = measuredHeight;
        }

        public int b() {
            return this.f7758c.size();
        }

        public void c(int i, int i2) {
            int i3 = i;
            int iB = b();
            int measuredWidth = (ZFlowLayout.this.getMeasuredWidth() - ZFlowLayout.this.getPaddingLeft()) - ZFlowLayout.this.getPaddingRight();
            float f = (measuredWidth - this.a) - (ZFlowLayout.this.i * (iB - 1));
            if (f < 0.0f) {
                if (iB == 1) {
                    View view = this.f7758c.get(0);
                    view.layout(i3, i2, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + i2);
                    return;
                }
                return;
            }
            double d = 0.5d;
            int i4 = (int) (((double) (f / iB)) + 0.5d);
            int i5 = 0;
            while (i5 < iB) {
                View view2 = this.f7758c.get(i5);
                int measuredWidth2 = view2.getMeasuredWidth();
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = ZFlowLayout.this.q ? 0 : (int) ((((double) (this.b - measuredHeight)) / 2.0d) + d);
                if (i6 < 0) {
                    i6 = 0;
                }
                if (ZFlowLayout.this.u) {
                    measuredWidth2 = (int) ((measuredWidth - (ZFlowLayout.this.i * (ZFlowLayout.this.t - 1))) / ZFlowLayout.this.t);
                    view2.getLayoutParams().width = measuredWidth2;
                    if (i4 > 0) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                    }
                }
                int i7 = i2 + i6;
                view2.layout(i3, i7, i3 + measuredWidth2, measuredHeight + i7);
                i3 = (int) (i3 + measuredWidth2 + ZFlowLayout.this.i);
                i5++;
                d = 0.5d;
            }
        }
    }

    public interface d {
        void a(View view, int i);
    }

    public ZFlowLayout(Context context) {
        super(context);
        this.i = 0.0f;
        this.f7754j = 20.0f;
        this.k = true;
        this.f7755l = 0.0f;
        this.m = new ArrayList();
        this.f7756n = null;
        this.o = Integer.MAX_VALUE;
        this.q = false;
        this.t = 3;
        this.u = true;
        this.v = -16777216;
        this.w = new ViewGroup.LayoutParams(-2, h(28.0f));
        this.x = 13.0f;
        this.y = -1;
        this.z = 17;
        this.A = true;
        this.C = Collections.EMPTY_LIST;
        this.D = new String[0];
        this.E = new String[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        if (this.A && (view instanceof TextView)) {
            ((TextView) view).setOnClickListener(this);
        }
    }

    public CheckedTextView e(int i, String str) {
        CheckedTextView checkedTextViewI = i(str);
        addView(checkedTextViewI, i);
        return checkedTextViewI;
    }

    public CheckedTextView f(String str) {
        CheckedTextView checkedTextViewI = i(str);
        addView(checkedTextViewI);
        return checkedTextViewI;
    }

    public ZFlowLayout g(String... strArr) {
        for (String str : strArr) {
            addView(i(str));
        }
        return this;
    }

    public ArrayList<Integer> getSelectedIndexs() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            if (((Checkable) getChildAt(i)).isChecked()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public int h(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public CheckedTextView i(String str) {
        CheckedTextView checkedTextView = new CheckedTextView(getContext());
        if (this.C.contains(str)) {
            checkedTextView.setChecked(true);
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList == null) {
            checkedTextView.setTextColor(this.v);
        } else {
            checkedTextView.setTextColor(colorStateList);
        }
        checkedTextView.setLayoutParams(this.w);
        int i = this.y;
        if (i != -1) {
            checkedTextView.setBackgroundResource(i);
        }
        checkedTextView.setTextSize(this.x);
        checkedTextView.setText(str);
        checkedTextView.setTextAlignment(1);
        checkedTextView.setGravity(this.z);
        return checkedTextView;
    }

    public final boolean j() {
        this.m.add(this.f7756n);
        if (this.m.size() >= this.o) {
            return false;
        }
        this.f7756n = new c();
        this.f7755l = 0.0f;
        return true;
    }

    public void k(String[] strArr) {
        this.E = strArr;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new a(), true);
        ArrayList arrayList = new ArrayList(Arrays.asList(this.E));
        arrayList.removeAll(Arrays.asList(this.D));
        diffResultCalculateDiff.dispatchUpdatesTo(new b(arrayList));
        this.D = this.E;
    }

    public final void l() {
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    public final void m() {
        this.m.clear();
        this.f7756n = new c();
        this.f7755l = 0.0f;
    }

    public ZFlowLayout n(boolean z) {
        this.A = z;
        return this;
    }

    public ZFlowLayout o(float f) {
        if (this.i != f) {
            this.i = f;
            l();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof Checkable) {
            Checkable checkable = (Checkable) view;
            checkable.setChecked(!checkable.isChecked());
            if (this.p && checkable.isChecked()) {
                Checkable checkable2 = this.r;
                if (checkable2 != null) {
                    checkable2.setChecked(false);
                }
                this.r = checkable;
            } else {
                this.r = null;
            }
            d dVar = this.s;
            if (dVar != null) {
                dVar.a(view, indexOfChild(view));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.k || z) {
            this.k = false;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int size = this.m.size();
            for (int i5 = 0; i5 < size; i5++) {
                c cVar = this.m.get(i5);
                cVar.c(paddingLeft, paddingTop);
                paddingTop = (int) (paddingTop + cVar.b + this.f7754j);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            setMeasuredDimension(getWidth(), getMinimumHeight());
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - getPaddingRight()) - getPaddingLeft();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        m();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, mode == 1073741824 ? Integer.MIN_VALUE : mode), View.MeasureSpec.makeMeasureSpec(size2, mode2 != 1073741824 ? mode2 : Integer.MIN_VALUE));
                if (this.f7756n == null) {
                    this.f7756n = new c();
                }
                float measuredWidth = childAt.getMeasuredWidth();
                float f = this.f7755l + measuredWidth;
                this.f7755l = f;
                float f2 = size;
                if (f <= f2 && this.f7756n.b() < this.t) {
                    this.f7756n.a(childAt);
                    float f3 = this.f7755l + this.i;
                    this.f7755l = f3;
                    if (f3 >= f2 && !j()) {
                        break;
                    }
                } else if (this.f7756n.b() == 0) {
                    this.f7756n.a(childAt);
                    if (!j()) {
                        break;
                    }
                } else {
                    if (!j()) {
                        break;
                    }
                    this.f7756n.a(childAt);
                    this.f7755l += measuredWidth + this.i;
                }
            }
        }
        c cVar = this.f7756n;
        if (cVar != null && cVar.b() > 0 && !this.m.contains(this.f7756n)) {
            this.m.add(this.f7756n);
        }
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = this.m.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size4; i5++) {
            i4 += this.m.get(i5).b;
        }
        setMeasuredDimension(size3, View.resolveSize(((int) (i4 + (this.f7754j * (size4 - 1)))) + getPaddingTop() + getPaddingBottom(), i2));
    }

    public ZFlowLayout p(int i) {
        this.y = i;
        return this;
    }

    public ZFlowLayout q(@ColorRes int i) {
        this.B = ContextCompat.getColorStateList(getContext(), i);
        return this;
    }

    public ZFlowLayout r(int i) {
        this.t = i;
        return this;
    }

    public ZFlowLayout s(boolean z) {
        this.u = z;
        return this;
    }

    public void setIfAccordantTop(Boolean bool) {
        this.q = bool.booleanValue();
    }

    public void setOrigin(String[] strArr) {
        if (strArr != null) {
            this.C = Arrays.asList(strArr);
        }
    }

    public ZFlowLayout t(d dVar) {
        this.s = dVar;
        return this;
    }

    public ZFlowLayout u(float f) {
        this.x = f;
        return this;
    }

    public ZFlowLayout v(float f) {
        if (this.f7754j != f) {
            this.f7754j = f;
            l();
        }
        return this;
    }

    public ZFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0.0f;
        this.f7754j = 20.0f;
        this.k = true;
        this.f7755l = 0.0f;
        this.m = new ArrayList();
        this.f7756n = null;
        this.o = Integer.MAX_VALUE;
        this.q = false;
        this.t = 3;
        this.u = true;
        this.v = -16777216;
        this.w = new ViewGroup.LayoutParams(-2, h(28.0f));
        this.x = 13.0f;
        this.y = -1;
        this.z = 17;
        this.A = true;
        this.C = Collections.EMPTY_LIST;
        this.D = new String[0];
        this.E = new String[0];
    }
}
