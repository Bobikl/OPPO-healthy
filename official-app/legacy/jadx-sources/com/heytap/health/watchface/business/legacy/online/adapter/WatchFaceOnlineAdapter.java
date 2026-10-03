package com.heytap.health.watchface.business.legacy.online.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.adaptation.device.rswatch.bean.DialOnlineBean;
import com.heytap.health.watchface.business.view.FlexWfPreviewView;
import com.oplus.aiunit.vision.ial;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.r4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class WatchFaceOnlineAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int STATE_ERROR = 4;
    public static final int STATE_LOAD = 2;
    public static final int STATE_NO_MORE = 3;
    public static final int STATE_START = 1;
    public static final String TAG = "WatchFaceOnlineAdapter";
    public final Context k;
    public b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f6953n;
    public int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6951j = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<DialOnlineBean> f6952l = new ArrayList();

    public class WatchFaceHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public FlexWfPreviewView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f6954j;
        public TextView k;

        public WatchFaceHolder(View view) {
            super(view);
            this.i = (FlexWfPreviewView) view.findViewById(R$id.iv_watch_face);
            this.f6954j = (TextView) view.findViewById(R$id.tv_small_tag);
            this.k = (TextView) view.findViewById(R$id.tv_watch_face_name);
            this.i.setHWScale(1.0f);
            this.i.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int adapterPosition;
            if (WatchFaceOnlineAdapter.this.m == null || (adapterPosition = getAdapterPosition()) < 0) {
                return;
            }
            DialOnlineBean dialOnlineBean = (DialOnlineBean) WatchFaceOnlineAdapter.this.f6952l.get(adapterPosition);
            if (view instanceof ImageView) {
                WatchFaceOnlineAdapter.this.m.I(adapterPosition, dialOnlineBean, ((ImageView) view).getDrawable());
            } else {
                WatchFaceOnlineAdapter.this.m.I(adapterPosition, dialOnlineBean, null);
            }
        }
    }

    public static class a extends RecyclerView.ViewHolder {
        public View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public View f6956j;

        public a(View view) {
            super(view);
            this.i = view.findViewById(R$id.rl_nomore);
            this.f6956j = view.findViewById(R$id.pb_load);
        }
    }

    public interface b {
        void I(int i, DialOnlineBean dialOnlineBean, Drawable drawable);
    }

    public WatchFaceOnlineAdapter(Context context) {
        this.k = context;
    }

    public final void f(List<DialOnlineBean> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f6952l.addAll(list);
    }

    public int g() {
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f6952l.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i >= this.f6952l.size() ? 1 : 0;
    }

    public boolean h(int i) {
        return getItemViewType(i) == 1;
    }

    public boolean i() {
        return this.f6951j;
    }

    public void j(boolean z, boolean z2, List<DialOnlineBean> list) {
        ltl.a(TAG, "[loadMore] isError " + z + " allLoaded " + z2 + " dialOnlineBeans " + list);
        if (z) {
            this.i = 4;
            notifyItemChanged(this.f6952l.size());
            return;
        }
        if (z2) {
            this.i = 3;
            f(list);
            notifyDataSetChanged();
            return;
        }
        this.i = 2;
        if (list == null || list.isEmpty()) {
            notifyItemChanged(this.f6952l.size());
        } else {
            f(list);
            notifyDataSetChanged();
        }
    }

    public void k(boolean z) {
        this.f6951j = z;
    }

    public void l() {
        View view = this.f6953n;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ltl.a(TAG, "[onBindViewHolder]  mDialList " + this.f6952l + " mLoadState " + this.i);
        if (this.f6952l.size() == 0) {
            return;
        }
        if (!(viewHolder instanceof a)) {
            if (viewHolder instanceof WatchFaceHolder) {
                WatchFaceHolder watchFaceHolder = (WatchFaceHolder) viewHolder;
                DialOnlineBean dialOnlineBean = this.f6952l.get(i);
                r4a.e(this.k, dialOnlineBean.getPreviewImg(), watchFaceHolder.i);
                watchFaceHolder.k.setText(dialOnlineBean.getName());
                watchFaceHolder.f6954j.setVisibility(ial.c(dialOnlineBean) ? 0 : 8);
                return;
            }
            return;
        }
        int i2 = this.i;
        if (i2 == 1) {
            View view = this.f6953n;
            if (view != null) {
                view.setVisibility(8);
            }
            a aVar = (a) viewHolder;
            aVar.i.setVisibility(8);
            aVar.f6956j.setVisibility(0);
            return;
        }
        if (i2 == 2) {
            View view2 = this.f6953n;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            a aVar2 = (a) viewHolder;
            aVar2.i.setVisibility(8);
            aVar2.f6956j.setVisibility(0);
            return;
        }
        if (i2 == 3) {
            View view3 = this.f6953n;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            a aVar3 = (a) viewHolder;
            aVar3.i.setVisibility(0);
            aVar3.f6956j.setVisibility(8);
            return;
        }
        if (i2 != 4) {
            return;
        }
        View view4 = this.f6953n;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        a aVar4 = (a) viewHolder;
        aVar4.i.setVisibility(8);
        aVar4.f6956j.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new WatchFaceHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_face_online_adpter_item, viewGroup, false));
        }
        this.f6953n = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_face_online_adpter_foot_load_more, viewGroup, false);
        return new a(this.f6953n);
    }

    public void setOnItemClickListener(b bVar) {
        this.m = bVar;
    }
}
