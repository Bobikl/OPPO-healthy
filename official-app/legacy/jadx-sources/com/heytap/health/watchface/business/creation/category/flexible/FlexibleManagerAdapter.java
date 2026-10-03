package com.heytap.health.watchface.business.creation.category.flexible;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.ui.widget.CircleImageView;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$ScreenType;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.oplus.aiunit.vision.a78;
import com.oplus.aiunit.vision.vd4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class FlexibleManagerAdapter extends RecyclerView.Adapter<a> {
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<vd4> f6725j = new ArrayList();
    public final Proto$DeviceInfo k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f6726l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6727n;
    public boolean o;

    public class a extends RecyclerView.ViewHolder {
        public CircleImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CheckBox f6728j;

        public a(View view) {
            super(view);
            this.i = (CircleImageView) view.findViewById(R$id.iv_preview);
            this.f6728j = (CheckBox) view.findViewById(R$id.select);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.gs7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.i.b(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            int adapterPosition = getAdapterPosition();
            vd4 vd4Var = (vd4) FlexibleManagerAdapter.this.f6725j.get(adapterPosition);
            if (!FlexibleManagerAdapter.this.o) {
                if (FlexibleManagerAdapter.this.f6726l != null) {
                    FlexibleManagerAdapter.this.f6726l.G3(adapterPosition, vd4Var);
                    return;
                }
                return;
            }
            boolean z = ((vd4) FlexibleManagerAdapter.this.f6725j.get(adapterPosition)).m;
            if (z) {
                FlexibleManagerAdapter.this.f6727n--;
            } else {
                FlexibleManagerAdapter.this.f6727n++;
            }
            if (FlexibleManagerAdapter.this.f6726l != null ? FlexibleManagerAdapter.this.f6726l.N0(FlexibleManagerAdapter.this.f6727n, vd4Var) : true) {
                vd4Var.m = !z;
                FlexibleManagerAdapter.this.notifyItemChanged(adapterPosition);
            }
            if (FlexibleManagerAdapter.this.f6726l != null) {
                FlexibleManagerAdapter.this.f6726l.G5(FlexibleManagerAdapter.this.f6727n);
            }
        }
    }

    public interface b {
        boolean G3(int i, vd4 vd4Var);

        boolean G5(int i);

        boolean N0(int i, vd4 vd4Var);
    }

    public FlexibleManagerAdapter(Context context, Proto$DeviceInfo proto$DeviceInfo) {
        this.i = context;
        this.k = proto$DeviceInfo;
        this.m = proto$DeviceInfo.getScreenType() == Proto$ScreenType.SCREEN_TYPE_OVAL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<vd4> list = this.f6725j;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void i() {
        this.f6727n = 0;
    }

    public List<vd4> j() {
        return this.f6725j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        vd4 vd4Var = this.f6725j.get(aVar.getAdapterPosition());
        aVar.i.setType(!this.m ? 1 : 0);
        a78.c(aVar.itemView.getContext(), vd4Var.d, aVar.i);
        aVar.f6728j.setVisibility(this.o ? 0 : 8);
        aVar.f6728j.setChecked(vd4Var.m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_face_flexible_item_manage, viewGroup, false));
    }

    public void m(boolean z) {
        this.o = z;
        notifyDataSetChanged();
    }

    public void n(List<vd4> list) {
        this.f6725j.clear();
        this.f6725j.addAll(list);
        notifyDataSetChanged();
    }

    public void setListener(b bVar) {
        this.f6726l = bVar;
    }
}
