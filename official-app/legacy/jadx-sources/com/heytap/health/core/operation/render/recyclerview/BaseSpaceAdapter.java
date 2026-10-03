package com.heytap.health.core.operation.render.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.databaseengine.model.SpaceCardMetaData;
import com.heytap.databaseengine.model.SpaceInfo;
import com.oplus.aiunit.vision.e4i;
import com.oplus.aiunit.vision.f4i;
import com.oplus.aiunit.vision.lza;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseSpaceAdapter<T> extends RecyclerView.Adapter<SpaceViewHolder> {
    public List<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3696j;

    public BaseSpaceAdapter(List<T> list, int i) {
        this.i = list;
        this.f3696j = i;
    }

    public abstract void d(@NonNull SpaceViewHolder spaceViewHolder, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull SpaceViewHolder spaceViewHolder, int i) {
        d(spaceViewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public SpaceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int layoutId = getLayoutId(i);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(layoutId, viewGroup, false);
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateViewHolder: cost time=");
        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb.append("ms, layoutId=");
        sb.append(layoutId);
        return new SpaceViewHolder(viewInflate);
    }

    public void g(int i, SpaceInfo spaceInfo, SpaceCardMetaData spaceCardMetaData) {
        e4i e4iVar = new e4i();
        e4iVar.k(this.f3696j + 1);
        e4iVar.i(i + 1);
        e4iVar.l(spaceInfo);
        e4iVar.j(spaceCardMetaData);
        f4i.a(e4iVar);
    }

    public List<T> getData() {
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (lza.a(this.i)) {
            return 0;
        }
        return this.i.size();
    }

    public abstract int getLayoutId(int i);

    public void h(int i, SpaceInfo spaceInfo, SpaceCardMetaData spaceCardMetaData) {
        e4i e4iVar = new e4i();
        e4iVar.k(this.f3696j + 1);
        e4iVar.i(i + 1);
        e4iVar.l(spaceInfo);
        e4iVar.j(spaceCardMetaData);
        f4i.c(e4iVar);
    }

    public void setData(List<T> list) {
        this.i.clear();
        this.i.addAll(list);
        notifyDataSetChanged();
    }

    public BaseSpaceAdapter(List<T> list) {
        this.i = list;
    }
}
