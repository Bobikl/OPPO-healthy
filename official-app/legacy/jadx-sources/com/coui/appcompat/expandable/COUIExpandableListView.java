package com.coui.appcompat.expandable;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.HeterogeneousExpandableList;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.ph2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class COUIExpandableListView extends ExpandableListView {
    public ExpandableListView.OnGroupClickListener i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f1737j;

    public static class DummyView extends View {
        public List<View> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f1738j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1739l;

        public DummyView(Context context) {
            super(context);
            this.i = new ArrayList();
            ph2.c(this, false);
        }

        public void a(View view) {
            this.i.add(view);
        }

        public void b() {
            this.i.clear();
        }

        public void c(Drawable drawable, int i, int i2) {
            if (drawable != null) {
                this.f1738j = drawable;
                this.k = i;
                this.f1739l = i2;
                drawable.setBounds(0, 0, i, i2);
            }
        }

        @Override // android.view.View
        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            Drawable drawable = this.f1738j;
            if (drawable != null) {
                drawable.setBounds(0, 0, this.k, this.f1739l);
            }
            int size = this.i.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.i.get(i2);
                canvas.save();
                int measuredHeight = view.getMeasuredHeight();
                i += measuredHeight;
                canvas.clipRect(0, 0, getWidth(), measuredHeight);
                view.draw(canvas);
                canvas.restore();
                Drawable drawable2 = this.f1738j;
                if (drawable2 != null) {
                    i += this.f1739l;
                    drawable2.draw(canvas);
                    canvas.translate(0.0f, this.f1739l);
                }
                canvas.translate(0.0f, measuredHeight);
                if (i > canvas.getHeight()) {
                    break;
                }
            }
            canvas.restore();
        }

        @Override // android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int i5 = i4 - i2;
            int size = this.i.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                View view = this.i.get(i7);
                int measuredHeight = view.getMeasuredHeight();
                view.layout(i, i2, view.getMeasuredWidth() + i, measuredHeight + i2);
                i6 = i6 + measuredHeight + this.f1739l;
                if (i6 > i5) {
                    return;
                }
            }
        }
    }

    public class a implements ExpandableListView.OnGroupClickListener {
        public a() {
        }

        @Override // android.widget.ExpandableListView.OnGroupClickListener
        @SensorsDataInstrumented
        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j2) {
            if (COUIExpandableListView.this.i == null || !COUIExpandableListView.this.i.onGroupClick(expandableListView, view, i, j2)) {
                COUIExpandableListView cOUIExpandableListView = COUIExpandableListView.this;
                if (ExpandableListView.getPackedPositionGroup(cOUIExpandableListView.getExpandableListPosition(cOUIExpandableListView.getLastVisiblePosition())) == i) {
                    COUIExpandableListView cOUIExpandableListView2 = COUIExpandableListView.this;
                    if (cOUIExpandableListView2.getChildAt(cOUIExpandableListView2.getChildCount() - 1).getBottom() >= COUIExpandableListView.this.getHeight() - COUIExpandableListView.this.getListPaddingBottom() && !expandableListView.isGroupExpanded(i)) {
                        SensorsDataAutoTrackHelper.trackExpandableListViewOnGroupClick(expandableListView, view, i);
                        return false;
                    }
                }
                COUIExpandableListView.this.playSoundEffect(0);
                if (expandableListView.isGroupExpanded(i)) {
                    COUIExpandableListView.this.collapseGroup(i);
                } else {
                    COUIExpandableListView.this.expandGroup(i);
                }
            }
            SensorsDataAutoTrackHelper.trackExpandableListViewOnGroupClick(expandableListView, view, i);
            return true;
        }
    }

    public static abstract class b implements Animator.AnimatorListener {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class c extends ValueAnimator {
        public WeakReference<COUIExpandableListView> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f1740j;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ boolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f1741j;
            public final /* synthetic */ boolean k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ View f1742l;
            public final /* synthetic */ d m;

            public a(boolean z, int i, boolean z2, View view, d dVar) {
                this.i = z;
                this.f1741j = i;
                this.k = z2;
                this.f1742l = view;
                this.m = dVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                COUIExpandableListView cOUIExpandableListView = (COUIExpandableListView) c.this.i.get();
                if (cOUIExpandableListView == null) {
                    Log.e("COUIExpandableListView", "onAnimationUpdate: expandable list is null");
                    c.this.e();
                    return;
                }
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(cOUIExpandableListView.getExpandableListPosition(cOUIExpandableListView.getFirstVisiblePosition()));
                long expandableListPosition = cOUIExpandableListView.getExpandableListPosition(cOUIExpandableListView.getLastVisiblePosition());
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                if (!c.this.f1740j && !this.i && (packedPositionGroup > (i = this.f1741j) || packedPositionGroup2 < i)) {
                    Log.d("COUIExpandableListView", "onAnimationUpdate: all is screen out, first:" + packedPositionGroup + ",groupPos:" + this.f1741j + ",last:" + packedPositionGroup2);
                    c.this.e();
                    return;
                }
                if (!c.this.f1740j && !this.i && this.k && packedPositionGroup2 == this.f1741j && packedPositionChild == 0) {
                    Log.d("COUIExpandableListView", "onAnimationUpdate: expand is screen over, last:" + packedPositionGroup2);
                    c.this.e();
                    return;
                }
                if (c.this.f1740j || !this.i || !this.k || this.f1742l.getBottom() <= cOUIExpandableListView.getBottom()) {
                    c.this.f1740j = false;
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    this.m.f = iIntValue;
                    this.f1742l.getLayoutParams().height = iIntValue;
                    this.f1742l.requestLayout();
                    return;
                }
                Log.d("COUIExpandableListView", "onAnimationUpdate3: " + this.f1742l.getBottom() + "," + cOUIExpandableListView.getBottom());
                c.this.e();
            }
        }

        public c(COUIExpandableListView cOUIExpandableListView, long j2, TimeInterpolator timeInterpolator) {
            this.i = new WeakReference<>(cOUIExpandableListView);
            setDuration(j2);
            setInterpolator(timeInterpolator);
        }

        public final void e() {
            removeAllUpdateListeners();
            end();
        }

        public void f(boolean z, boolean z2, int i, View view, d dVar, int i2, int i3) {
            this.f1740j = true;
            setIntValues(i2, i3);
            removeAllUpdateListeners();
            addUpdateListener(new a(z2, i, z, view, dVar));
        }
    }

    public static class e extends BaseExpandableListAdapter {
        public COUIExpandableListView b;
        public ExpandableListAdapter f;
        public final DataSetObserver g;
        public SparseArray<d> a = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SparseArray<c> f1746c = new SparseArray<>();
        public SparseArray<List<View>> d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SparseArray<List<View>> f1747e = new SparseArray<>();

        public class a extends b {
            public final /* synthetic */ DummyView i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f1748j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DummyView dummyView, int i) {
                super(null);
                this.i = dummyView;
                this.f1748j = i;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.i.b();
                e.this.q(this.f1748j);
                e.this.notifyDataSetChanged();
                this.i.setTag(0);
            }
        }

        public class b extends b {
            public final /* synthetic */ DummyView i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f1749j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(DummyView dummyView, int i) {
                super(null);
                this.i = dummyView;
                this.f1749j = i;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.i.b();
                e.this.q(this.f1749j);
                e.this.b.d(this.f1749j);
                this.i.setTag(0);
            }
        }

        public class c extends DataSetObserver {
            public c() {
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                e.this.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                e.this.notifyDataSetInvalidated();
            }
        }

        public e(ExpandableListAdapter expandableListAdapter, COUIExpandableListView cOUIExpandableListView) {
            c cVar = new c();
            this.g = cVar;
            this.b = cOUIExpandableListView;
            ExpandableListAdapter expandableListAdapter2 = this.f;
            if (expandableListAdapter2 != null) {
                expandableListAdapter2.unregisterDataSetObserver(cVar);
            }
            this.f = expandableListAdapter;
            expandableListAdapter.registerDataSetObserver(cVar);
        }

        public final void e(View view, int i, int i2) {
            int iM = m(i, i2);
            List<View> arrayList = this.f1747e.get(iM);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(view);
            this.f1747e.put(iM, arrayList);
        }

        public final void f(DummyView dummyView, int i, boolean z, int i2) {
            d dVarL = l(i);
            c cVar = this.f1746c.get(i);
            if (cVar == null) {
                cVar = new c(this.b, 400L, new hj2());
                this.f1746c.put(i, cVar);
            } else {
                cVar.removeAllListeners();
                cVar.cancel();
            }
            c cVar2 = cVar;
            int i3 = dVarL.f;
            cVar2.f(false, z, i, dummyView, dVarL, i3 == -1 ? i2 : i3, 0);
            cVar2.addListener(new b(dummyView, i));
            cVar2.start();
            dummyView.setTag(2);
        }

        public final void g(DummyView dummyView, int i, boolean z, int i2) {
            d dVarL = l(i);
            c cVar = this.f1746c.get(i);
            if (cVar == null) {
                cVar = new c(this.b, 400L, new hj2());
                this.f1746c.put(i, cVar);
            } else {
                cVar.removeAllListeners();
                cVar.cancel();
            }
            c cVar2 = cVar;
            int i3 = dVarL.f;
            if (i3 == -1) {
                i3 = 0;
            }
            cVar2.f(true, z, i, dummyView, dVarL, i3, i2);
            cVar2.addListener(new a(dummyView, i));
            cVar2.start();
            dummyView.setTag(1);
        }

        @Override // android.widget.ExpandableListAdapter
        public Object getChild(int i, int i2) {
            return this.f.getChild(i, i);
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i, int i2) {
            return this.f.getChildId(i, i2);
        }

        @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
        public final int getChildType(int i, int i2) {
            if (l(i).a) {
                return Integer.MIN_VALUE;
            }
            return m(i, i2);
        }

        @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
        public final int getChildTypeCount() {
            ExpandableListAdapter expandableListAdapter = this.f;
            if (expandableListAdapter instanceof HeterogeneousExpandableList) {
                return ((HeterogeneousExpandableList) expandableListAdapter).getChildTypeCount() + 1;
            }
            return 2;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0015  */
        @Override // android.widget.ExpandableListAdapter
        public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            boolean z2;
            d dVarL = l(i);
            dVarL.f1744c = z;
            if (!dVarL.a) {
                return this.f.getChildView(i, i2, z, view, viewGroup);
            }
            if (z) {
                z2 = i == getGroupCount() - 1;
            }
            return i(i, z2, view);
        }

        @Override // android.widget.ExpandableListAdapter
        public final int getChildrenCount(int i) {
            if (l(i).a) {
                return 1;
            }
            return this.f.getChildrenCount(i);
        }

        @Override // android.widget.ExpandableListAdapter
        public Object getGroup(int i) {
            return this.f.getGroup(i);
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            return this.f.getGroupCount();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i) {
            return this.f.getGroupId(i);
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            return this.f.getGroupView(i, z, view, viewGroup);
        }

        public ViewGroup.LayoutParams h() {
            return new AbsListView.LayoutParams(-1, -2, 0);
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return this.f.hasStableIds();
        }

        public final View i(int i, boolean z, View view) {
            d dVarL = l(i);
            if (!(view instanceof DummyView)) {
                view = new DummyView(this.b.getContext());
                view.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
            }
            DummyView dummyView = (DummyView) view;
            dummyView.b();
            dummyView.c(this.b.getDivider(), this.b.getMeasuredWidth(), this.b.getDividerHeight());
            int iK = k(dVarL.b, i, dummyView);
            dVarL.d = dummyView;
            dVarL.f1745e = iK;
            Object tag = dummyView.getTag();
            int iIntValue = tag != null ? ((Integer) tag).intValue() : 0;
            boolean z2 = dVarL.b;
            if (z2 && iIntValue != 1) {
                g(dummyView, i, z, iK);
            } else if (z2 || iIntValue == 2) {
                Log.e("COUIExpandableListView", "getAnimationView: state is no match:" + iIntValue);
            } else {
                f(dummyView, i, z, iK);
            }
            return view;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i, int i2) {
            if (l(i).a) {
                return false;
            }
            return this.f.isChildSelectable(i, i2);
        }

        public final View j(int i, int i2) {
            List<View> list = this.d.get(m(i, i2));
            if (list == null || list.isEmpty()) {
                return null;
            }
            return list.remove(0);
        }

        public final int k(boolean z, int i, DummyView dummyView) {
            this.b.getChildCount();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.b.getWidth(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int bottom = (z && this.b.getLayoutParams().height == -2) ? this.b.getContext().getResources().getDisplayMetrics().heightPixels : this.b.getBottom();
            int childrenCount = this.f.getChildrenCount(i);
            int i2 = 0;
            int measuredHeight = 0;
            while (i2 < childrenCount) {
                View childView = this.f.getChildView(i, i2, i2 == childrenCount + (-1), j(i, i2), this.b);
                e(childView, i, i2);
                AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) childView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = (AbsListView.LayoutParams) h();
                    childView.setLayoutParams(layoutParams);
                }
                int i3 = layoutParams.height;
                int iMakeMeasureSpec3 = i3 > 0 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : iMakeMeasureSpec2;
                childView.setLayoutDirection(this.b.getLayoutDirection());
                childView.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                measuredHeight += childView.getMeasuredHeight();
                dummyView.a(childView);
                if ((!z && measuredHeight + 0 > bottom) || (z && measuredHeight > (bottom + 0) * 2)) {
                    break;
                }
                i2++;
            }
            return measuredHeight;
        }

        public final d l(int i) {
            d dVar = this.a.get(i);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d(null);
            this.a.put(i, dVar2);
            return dVar2;
        }

        public final int m(int i, int i2) {
            ExpandableListAdapter expandableListAdapter = this.f;
            if (!(expandableListAdapter instanceof HeterogeneousExpandableList)) {
                return 1;
            }
            int childType = ((HeterogeneousExpandableList) expandableListAdapter).getChildType(i, i2) + 1;
            if (childType >= 0) {
                return childType;
            }
            throw new RuntimeException("getChildType must is greater than 0");
        }

        public final void n() {
            for (int i = 0; i < this.f1747e.size(); i++) {
                List<View> listValueAt = this.f1747e.valueAt(i);
                int iKeyAt = this.f1747e.keyAt(i);
                List<View> arrayList = this.d.get(iKeyAt);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.d.put(iKeyAt, arrayList);
                }
                arrayList.addAll(listValueAt);
            }
            this.f1747e.clear();
        }

        public final boolean o(int i) {
            DummyView dummyView;
            DummyView dummyView2;
            d dVarL = l(i);
            boolean z = dVarL.a;
            if (z && dVarL.b && (dummyView2 = dVarL.d) != null) {
                dVarL.b = false;
                f(dummyView2, i, dVarL.f1744c, dVarL.f);
                return false;
            }
            if (!z || dVarL.b || (dummyView = dVarL.d) == null) {
                dVarL.a = true;
                dVarL.b = false;
                return true;
            }
            g(dummyView, i, dVarL.f1744c, dVarL.f1745e);
            dVarL.b = true;
            return false;
        }

        public final boolean p(int i) {
            d dVarL = l(i);
            if (dVarL.a && dVarL.b) {
                return false;
            }
            dVarL.a = true;
            dVarL.b = true;
            return true;
        }

        public final void q(int i) {
            d dVarL = l(i);
            dVarL.f = -1;
            dVarL.a = false;
            n();
        }
    }

    public COUIExpandableListView(Context context) {
        this(context, null);
    }

    public final void c() {
        setDivider(null);
        setChildDivider(null);
        setGroupIndicator(null);
        super.setOnGroupClickListener(new a());
    }

    @Override // android.widget.ExpandableListView
    public boolean collapseGroup(int i) {
        boolean zO = this.f1737j.o(i);
        if (zO) {
            this.f1737j.notifyDataSetChanged();
        }
        return zO;
    }

    public final void d(int i) {
        super.collapseGroup(i);
    }

    @Override // android.widget.ExpandableListView
    public boolean expandGroup(int i) {
        if (!this.f1737j.p(i)) {
            return false;
        }
        boolean zExpandGroup = super.expandGroup(i);
        if (zExpandGroup) {
            return zExpandGroup;
        }
        this.f1737j.q(i);
        return zExpandGroup;
    }

    @Override // android.widget.ExpandableListView
    public void setAdapter(ExpandableListAdapter expandableListAdapter) {
        e eVar = new e(expandableListAdapter, this);
        this.f1737j = eVar;
        super.setAdapter(eVar);
    }

    @Override // android.widget.ExpandableListView
    public void setChildDivider(Drawable drawable) {
        if (drawable != null) {
            throw new RuntimeException("cannot set childDivider.");
        }
        super.setChildDivider(null);
    }

    @Override // android.widget.ListView
    public void setDivider(Drawable drawable) {
        if (drawable != null) {
            throw new RuntimeException("cannot set divider");
        }
        super.setDivider(null);
    }

    @Override // android.widget.ExpandableListView
    public void setGroupIndicator(Drawable drawable) {
        if (drawable != null) {
            throw new RuntimeException("cannot set groupIndicator.");
        }
        super.setGroupIndicator(null);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams.height == -2) {
            throw new RuntimeException("cannot set wrap_content");
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.widget.ExpandableListView
    public void setOnGroupClickListener(ExpandableListView.OnGroupClickListener onGroupClickListener) {
        this.i = onGroupClickListener;
    }

    public COUIExpandableListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public COUIExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public static class d {
        public boolean a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1744c;
        public DummyView d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1745e;
        public int f;

        public d() {
            this.a = false;
            this.b = false;
            this.f1744c = false;
            this.f = -1;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
