package com.heytap.health.watch.records.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.oplus.aiunit.vision.jp6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f6631j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f6632l;
    public View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f6633n;
    public RelativeLayout o;
    public final boolean p;
    public final boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public List<T> x;
    public boolean v = false;
    public boolean w = true;
    public final SparseArrayCompat<View> y = new SparseArrayCompat<>();

    public class a extends GridLayoutManager.SpanSizeLookup {
        public final /* synthetic */ GridLayoutManager a;

        public a(GridLayoutManager gridLayoutManager) {
            this.a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            if (BaseAdapter.this.A(i) || BaseAdapter.this.B(i)) {
                return this.a.getSpanCount();
            }
            return 1;
        }
    }

    public class b extends RecyclerView.OnScrollListener {
        public final /* synthetic */ RecyclerView.LayoutManager a;

        public b(RecyclerView.LayoutManager layoutManager) {
            this.a = layoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && BaseAdapter.this.r && BaseAdapter.this.s(this.a) + 1 == BaseAdapter.this.getItemCount()) {
                BaseAdapter.this.E();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (BaseAdapter.this.s(this.a) + 1 != BaseAdapter.this.getItemCount()) {
                BaseAdapter.this.r = true;
                return;
            }
            if (BaseAdapter.this.m == null && BaseAdapter.this.f6633n == null) {
                if (BaseAdapter.this.y.size() > 0 && BaseAdapter.this.v && BaseAdapter.this.x.isEmpty()) {
                    return;
                }
                if (BaseAdapter.this.q && !BaseAdapter.this.r) {
                    BaseAdapter.this.E();
                } else {
                    if (BaseAdapter.this.r) {
                        return;
                    }
                    if (BaseAdapter.this.w) {
                        BaseAdapter.this.r();
                    }
                    BaseAdapter.this.r = true;
                }
            }
        }
    }

    public interface c {
        void D(boolean z);
    }

    public BaseAdapter(Context context, List<T> list, boolean z, boolean z2) {
        this.i = context;
        this.x = list == null ? new ArrayList<>() : list;
        this.p = z;
        this.q = z2;
    }

    public final boolean A(int i) {
        return this.p && i >= getItemCount() - 1;
    }

    public final boolean B(int i) {
        return i < w();
    }

    public void C() {
        View view = this.f6632l;
        if (view == null) {
            q(new View(this.i));
        } else {
            this.s = true;
            q(view);
        }
    }

    public void D() {
        this.o.removeAllViews();
    }

    public final void E() {
        c cVar;
        if (this.t || this.s) {
            return;
        }
        if (!this.u && this.r) {
            q(this.k);
        }
        if (this.o.getChildAt(0) != this.k || this.u || (cVar = this.f6631j) == null) {
            return;
        }
        this.u = true;
        cVar.D(false);
    }

    public void F(List<T> list) {
        this.u = false;
        z(list, this.x.size());
    }

    public void G(int i) {
        H(y(this.i, i));
    }

    public void H(View view) {
        this.k = view;
        q(view);
    }

    public final void I(RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {
        if (!this.p || this.f6631j == null) {
            return;
        }
        recyclerView.addOnScrollListener(new b(layoutManager));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (!this.x.isEmpty() || (this.m == null && this.f6633n == null)) {
            return this.x.size() + v() + w();
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.x.isEmpty()) {
            if (this.m != null) {
                return jp6.ERR_BINDER_EXCEPTION;
            }
            if (this.f6633n != null) {
                return 100005;
            }
            return (this.v && B(i)) ? this.y.keyAt(i) : jp6.ERR_LOGIN_STATUS;
        }
        if (this.v && B(i)) {
            return this.y.keyAt(i);
        }
        if (A(i)) {
            return 100002;
        }
        return x(i - w(), this.x.get(i - w()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
        }
        I(recyclerView, layoutManager);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (this.v && this.y.get(i) != null) {
            return BaseViewHolder.a(this.y.get(i));
        }
        switch (i) {
            case 100002:
                if (this.o == null) {
                    this.o = new RelativeLayout(this.i);
                }
                return BaseViewHolder.a(this.o);
            case jp6.ERR_BINDER_EXCEPTION /* 100003 */:
                return BaseViewHolder.a(this.m);
            case jp6.ERR_LOGIN_STATUS /* 100004 */:
                return BaseViewHolder.a(new View(this.i));
            default:
                return BaseViewHolder.a(this.f6633n);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        int layoutPosition = viewHolder.getLayoutPosition();
        if (A(layoutPosition) || B(layoutPosition)) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        }
    }

    public void q(View view) {
        if (view == null) {
            return;
        }
        if (this.o == null) {
            this.o = new RelativeLayout(this.i);
        }
        D();
        this.o.addView(view, new RelativeLayout.LayoutParams(-1, -2));
    }

    public void r() {
        q(new View(this.i));
    }

    public final int s(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return t(((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null));
        }
        return -1;
    }

    public void setNewData(List<T> list) {
        if (this.p) {
            if (this.t) {
                this.t = false;
            }
            this.u = false;
            this.m = null;
            this.f6633n = null;
        }
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.clear();
        this.x.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnLoadMoreListener(c cVar) {
        this.f6631j = cVar;
    }

    public int t(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public List<T> u() {
        return this.x;
    }

    public final int v() {
        return (!this.p || this.x.isEmpty()) ? 0 : 1;
    }

    public int w() {
        if (this.v) {
            return this.y.size();
        }
        return 0;
    }

    public abstract int x(int i, T t);

    public View y(Context context, int i) {
        if (i <= 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    public void z(List<T> list, int i) {
        if (i > this.x.size() || i < 0) {
            return;
        }
        this.x.addAll(i, list);
        notifyDataSetChanged();
    }
}
