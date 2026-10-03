package com.coui.appcompat.recyclerview;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.recyclerview.COUIBaseViewHolder;
import com.oplus.aiunit.vision.ohd;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class COUIBaseAdapter<T, VH extends COUIBaseViewHolder<T>> extends RecyclerView.Adapter<VH> {
    public List<T> i;

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull VH vh, final int i) {
        vh.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.mf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$onBindViewHolder$0(i, view);
            }
        });
        vh.bind(this.i.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    public void setOnItemClickListener(ohd<T> ohdVar) {
    }
}
