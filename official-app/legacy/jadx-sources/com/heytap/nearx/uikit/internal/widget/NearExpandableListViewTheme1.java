package com.heytap.nearx.uikit.internal.widget;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.HeterogeneousExpandableList;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.uikit.widget.NearExpandableListView;
import com.oplus.aiunit.vision.fjc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class NearExpandableListViewTheme1 implements com.heytap.nearx.uikit.internal.widget.a {

    public static class DummyView extends View {
        public List<View> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f7477j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7478l;

        public DummyView(Context context) {
            super(context);
            this.i = new ArrayList();
        }

        public void a(View view) {
            this.i.add(view);
        }

        public void b() {
            this.i.clear();
        }

        public void c(Drawable drawable, int i, int i2) {
            if (drawable != null) {
                this.f7477j = drawable;
                this.k = i;
                this.f7478l = i2;
                drawable.setBounds(0, 0, i, i2);
            }
        }

        @Override // android.view.View
        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            Drawable drawable = this.f7477j;
            if (drawable != null) {
                drawable.setBounds(0, 0, this.k, this.f7478l);
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
                Drawable drawable2 = this.f7477j;
                if (drawable2 != null) {
                    i += this.f7478l;
                    drawable2.draw(canvas);
                    canvas.translate(0.0f, this.f7478l);
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
                i6 = i6 + measuredHeight + this.f7478l;
                if (i6 > i5) {
                    return;
                }
            }
        }
    }

    public static abstract class b implements Animator.AnimatorListener {
        public b() {
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
        public WeakReference<NearExpandableListView> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f7479j;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ boolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f7480j;
            public final /* synthetic */ boolean k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ View f7481l;
            public final /* synthetic */ d m;

            public a(boolean z, int i, boolean z2, View view, d dVar) {
                this.i = z;
                this.f7480j = i;
                this.k = z2;
                this.f7481l = view;
                this.m = dVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                NearExpandableListView nearExpandableListView = (NearExpandableListView) c.this.i.get();
                if (nearExpandableListView == null) {
                    fjc.b("NearExpandableListView", "onAnimationUpdate: expandable list is null");
                    c.this.e();
                    return;
                }
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(nearExpandableListView.getExpandableListPosition(nearExpandableListView.getFirstVisiblePosition()));
                long expandableListPosition = nearExpandableListView.getExpandableListPosition(nearExpandableListView.getLastVisiblePosition());
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                if (!c.this.f7479j && !this.i && (packedPositionGroup > (i = this.f7480j) || packedPositionGroup2 < i)) {
                    fjc.a("NearExpandableListView", "onAnimationUpdate: all is screen out, first:" + packedPositionGroup + ",groupPos:" + this.f7480j + ",last:" + packedPositionGroup2);
                    c.this.e();
                    return;
                }
                if (!c.this.f7479j && !this.i && this.k && packedPositionGroup2 == this.f7480j && packedPositionChild == 0) {
                    fjc.a("NearExpandableListView", "onAnimationUpdate: expand is screen over, last:" + packedPositionGroup2);
                    c.this.e();
                    return;
                }
                if (c.this.f7479j || !this.i || !this.k || this.f7481l.getBottom() <= nearExpandableListView.getBottom()) {
                    c.this.f7479j = false;
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    this.m.f7483c = iIntValue;
                    this.f7481l.getLayoutParams().height = iIntValue;
                    this.f7481l.requestLayout();
                    return;
                }
                fjc.a("NearExpandableListView", "onAnimationUpdate3: " + this.f7481l.getBottom() + "," + nearExpandableListView.getBottom());
                c.this.e();
            }
        }

        public c(NearExpandableListView nearExpandableListView, long j2, TimeInterpolator timeInterpolator) {
            this.i = new WeakReference<>(nearExpandableListView);
            setDuration(j2);
            setInterpolator(timeInterpolator);
        }

        public final void e() {
            removeAllUpdateListeners();
            end();
        }

        public void f(boolean z, boolean z2, int i, View view, d dVar, int i2, int i3) {
            this.f7479j = true;
            setIntValues(i2, i3);
            removeAllUpdateListeners();
            addUpdateListener(new a(z2, i, z, view, dVar));
        }
    }

    public static class d {
        public boolean a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7483c;

        public d() {
            this.a = false;
            this.b = false;
            this.f7483c = -1;
        }
    }

    public static class e extends com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a {
        public NearExpandableListView b;
        public ExpandableListAdapter f;
        public final DataSetObserver g;
        public SparseArray<d> a = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SparseArray<c> f7484c = new SparseArray<>();
        public SparseArray<List<View>> d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SparseArray<List<View>> f7485e = new SparseArray<>();

        public class a extends b {
            public final /* synthetic */ DummyView i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f7486j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DummyView dummyView, int i) {
                super();
                this.i = dummyView;
                this.f7486j = i;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.i.b();
                e.this.c(this.f7486j);
                e.this.notifyDataSetChanged();
                this.i.setTag(0);
            }
        }

        public class b extends b {
            public final /* synthetic */ DummyView i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f7487j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(DummyView dummyView, int i) {
                super();
                this.i = dummyView;
                this.f7487j = i;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.i.b();
                e.this.c(this.f7487j);
                e.this.b.originCollapseGroup(this.f7487j);
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

        public e(ExpandableListAdapter expandableListAdapter, NearExpandableListView nearExpandableListView) {
            c cVar = new c();
            this.g = cVar;
            this.b = nearExpandableListView;
            ExpandableListAdapter expandableListAdapter2 = this.f;
            if (expandableListAdapter2 != null) {
                expandableListAdapter2.unregisterDataSetObserver(cVar);
            }
            this.f = expandableListAdapter;
            expandableListAdapter.registerDataSetObserver(cVar);
        }

        @Override // com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a
        public boolean a(int i) {
            d dVarL = l(i);
            if (dVarL.a && !dVarL.b) {
                return false;
            }
            dVarL.a = true;
            dVarL.b = false;
            return true;
        }

        @Override // com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a
        public boolean b(int i) {
            d dVarL = l(i);
            if (dVarL.a && dVarL.b) {
                return false;
            }
            dVarL.a = true;
            dVarL.b = true;
            return true;
        }

        @Override // com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a
        public void c(int i) {
            d dVarL = l(i);
            dVarL.f7483c = -1;
            dVarL.a = false;
            n();
        }

        public final void e(View view, int i, int i2) {
            int iM = m(i, i2);
            List<View> arrayList = this.f7485e.get(iM);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(view);
            this.f7485e.put(iM, arrayList);
        }

        public final void f(DummyView dummyView, int i, boolean z, int i2) {
            d dVarL = l(i);
            c cVar = this.f7484c.get(i);
            if (cVar == null) {
                cVar = new c(this.b, 400L, PathInterpolatorCompat.create(0.3f, 0.0f, 0.0f, 1.0f));
                this.f7484c.put(i, cVar);
            } else {
                cVar.removeAllListeners();
                cVar.cancel();
            }
            c cVar2 = cVar;
            int i3 = dVarL.f7483c;
            cVar2.f(false, z, i, dummyView, dVarL, i3 == -1 ? i2 : i3, 0);
            cVar2.addListener(new b(dummyView, i));
            cVar2.start();
            dummyView.setTag(2);
        }

        public final void g(DummyView dummyView, int i, boolean z, int i2) {
            d dVarL = l(i);
            c cVar = this.f7484c.get(i);
            if (cVar == null) {
                cVar = new c(this.b, 400L, PathInterpolatorCompat.create(0.3f, 0.0f, 0.0f, 1.0f));
                this.f7484c.put(i, cVar);
            } else {
                cVar.removeAllListeners();
                cVar.cancel();
            }
            c cVar2 = cVar;
            int i3 = dVarL.f7483c;
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

        /* JADX WARN: Code duplicated, block: B:8:0x0013  */
        @Override // android.widget.ExpandableListAdapter
        public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            boolean z2;
            if (!l(i).a) {
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
            Object tag = dummyView.getTag();
            int iIntValue = tag != null ? ((Integer) tag).intValue() : 0;
            boolean z2 = dVarL.b;
            if (z2 && iIntValue != 1) {
                g(dummyView, i, z, iK);
            } else if (z2 || iIntValue == 2) {
                fjc.b("NearExpandableListView", "getAnimationView: state is no match:" + iIntValue);
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
            if (this.b.getChildCount() > 0) {
                NearExpandableListView nearExpandableListView = this.b;
                nearExpandableListView.getChildAt(nearExpandableListView.getChildCount() - 1).getBottom();
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.b.getWidth(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int bottom = (z && this.b.getLayoutParams().height == -2) ? this.b.getContext().getResources().getDisplayMetrics().heightPixels : this.b.getBottom();
            int childrenCount = this.f.getChildrenCount(i);
            int i2 = 0;
            int i3 = 0;
            while (i2 < childrenCount) {
                View childView = this.f.getChildView(i, i2, i2 == childrenCount + (-1), j(i, i2), this.b);
                e(childView, i, i2);
                AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) childView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = (AbsListView.LayoutParams) h();
                    childView.setLayoutParams(layoutParams);
                }
                int i4 = layoutParams.height;
                int iMakeMeasureSpec3 = i4 > 0 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : iMakeMeasureSpec2;
                childView.setLayoutDirection(this.b.getLayoutDirection());
                childView.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                int measuredHeight = i3 + childView.getMeasuredHeight();
                dummyView.a(childView);
                if ((!z && measuredHeight + 0 > bottom) || (z && measuredHeight > (bottom + 0) * 2)) {
                    return measuredHeight;
                }
                i2++;
                i3 = measuredHeight;
            }
            return i3;
        }

        public final d l(int i) {
            d dVar = this.a.get(i);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d();
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
            for (int i = 0; i < this.f7485e.size(); i++) {
                List<View> listValueAt = this.f7485e.valueAt(i);
                int iKeyAt = this.f7485e.keyAt(i);
                List<View> arrayList = this.d.get(iKeyAt);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.d.put(iKeyAt, arrayList);
                }
                arrayList.addAll(listValueAt);
            }
            this.f7485e.clear();
        }
    }

    @Override // com.heytap.nearx.uikit.internal.widget.a
    @NotNull
    public com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a a(@NotNull ExpandableListAdapter expandableListAdapter, @NotNull NearExpandableListView nearExpandableListView) {
        return new e(expandableListAdapter, nearExpandableListView);
    }
}
