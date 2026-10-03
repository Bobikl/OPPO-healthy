package com.heytap.health.watchface.business.legacy.main.adapter;

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
import com.heytap.nearx.taphttp.statitics.StatRateHelper;
import com.oplus.aiunit.vision.jp6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f6931j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f6932l;
    public View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f6933n;
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
            if (BaseAdapter.this.C(i) || BaseAdapter.this.D(i)) {
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
            if (i == 0 && BaseAdapter.this.r && BaseAdapter.this.u(this.a) + 1 == BaseAdapter.this.getItemCount()) {
                BaseAdapter.this.G();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (BaseAdapter.this.u(this.a) + 1 != BaseAdapter.this.getItemCount()) {
                BaseAdapter.this.r = true;
                return;
            }
            if (BaseAdapter.this.m == null && BaseAdapter.this.f6933n == null) {
                if (BaseAdapter.this.y.size() > 0 && BaseAdapter.this.v && BaseAdapter.this.x.isEmpty()) {
                    return;
                }
                if (BaseAdapter.this.q && !BaseAdapter.this.r) {
                    BaseAdapter.this.G();
                } else {
                    if (BaseAdapter.this.r) {
                        return;
                    }
                    if (BaseAdapter.this.w) {
                        BaseAdapter.this.t();
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

    public View A(Context context, int i) {
        if (i <= 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    public void B(List<T> list, int i) {
        if (i > this.x.size() || i < 0) {
            return;
        }
        this.x.addAll(i, list);
        notifyDataSetChanged();
    }

    public final boolean C(int i) {
        return this.p && i >= getItemCount() - 1;
    }

    public final boolean D(int i) {
        return i < y();
    }

    public void E() {
        View view = this.f6932l;
        if (view == null) {
            q(new View(this.i));
        } else {
            this.s = true;
            q(view);
        }
    }

    public void F() {
        this.o.removeAllViews();
    }

    public final void G() {
        c cVar;
        if (this.t || this.s) {
            return;
        }
        if (!this.u && this.r) {
            q(this.k);
        }
        if (this.o.getChildAt(0) != this.k || this.u || (cVar = this.f6931j) == null) {
            return;
        }
        this.u = true;
        cVar.D(false);
    }

    public void H(int i) {
        I(A(this.i, i));
    }

    public void I(View view) {
        this.f6932l = view;
    }

    public void J(List<T> list) {
        this.u = false;
        B(list, this.x.size());
    }

    public void K(int i) {
        L(A(this.i, i));
    }

    public void L(View view) {
        this.k = view;
        q(view);
    }

    public void M(boolean z) {
        this.w = z;
    }

    public void N(boolean z) {
        this.v = z;
    }

    public final void O(RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {
        if (!this.p || this.f6931j == null) {
            return;
        }
        recyclerView.addOnScrollListener(new b(layoutManager));
    }

    public T getData(int i) {
        if (this.x.isEmpty()) {
            return null;
        }
        return this.x.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (!this.x.isEmpty() || (this.m == null && this.f6933n == null)) {
            return this.x.size() + x() + y();
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.x.isEmpty()) {
            if (this.m != null) {
                return jp6.ERR_BINDER_EXCEPTION;
            }
            if (this.f6933n != null) {
                return 100005;
            }
            return (this.v && D(i)) ? this.y.keyAt(i) : jp6.ERR_LOGIN_STATUS;
        }
        if (this.v && D(i)) {
            return this.y.keyAt(i);
        }
        if (C(i)) {
            return 100002;
        }
        return z(i - y(), this.x.get(i - y()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
        }
        O(recyclerView, layoutManager);
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
                return BaseViewHolder.a(this.f6933n);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        int layoutPosition = viewHolder.getLayoutPosition();
        if (C(layoutPosition) || D(layoutPosition)) {
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
        F();
        this.o.addView(view, new RelativeLayout.LayoutParams(-1, -2));
    }

    public void r(View view) {
        if (view == null) {
            return;
        }
        this.y.put(y() + StatRateHelper.MAX_RECORDS_NUM, view);
    }

    public void s() {
        this.s = false;
    }

    public void setNewData(List<T> list) {
        if (this.p) {
            if (this.t) {
                this.t = false;
            }
            this.u = false;
            this.m = null;
            this.f6933n = null;
        }
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.clear();
        this.x.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnLoadMoreListener(c cVar) {
        this.f6931j = cVar;
    }

    public void t() {
        q(new View(this.i));
    }

    public final int u(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return v(((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null));
        }
        return -1;
    }

    public int v(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public List<T> w() {
        return this.x;
    }

    public final int x() {
        return (!this.p || this.x.isEmpty()) ? 0 : 1;
    }

    public int y() {
        if (this.v) {
            return this.y.size();
        }
        return 0;
    }

    public abstract int z(int i, T t);
}
