package com.heytap.health.watchface.business.legacy.creation.outfits.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.view.RoundedImageView;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.legacy.creation.outfits.bean.OutfitsStyleBean;
import com.oplus.aiunit.vision.ggl;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class OutfitsWatchFaceGridViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f6887j;
    public List<OutfitsStyleBean> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f6888l;
    public GradientDrawable m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6889n;
    public final int o;
    public Proto$DeviceInfo p;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final RoundedImageView f6890j;
        public final View k;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.i = view;
            this.f6890j = (RoundedImageView) view.findViewById(R$id.ccv_card);
            this.k = view.findViewById(R$id.fl_item);
        }
    }

    public interface a {
        void onItemClick(int i);
    }

    public OutfitsWatchFaceGridViewAdapter(Context context) {
        this.f6887j = context;
        Resources resources = context.getResources();
        this.f6889n = resources.getDimensionPixelOffset(R$dimen.watch_face_outfits_select_list_margin);
        this.o = resources.getDimensionPixelOffset(R$dimen.watch_face_margin_3);
        this.m = (GradientDrawable) context.getDrawable(R$drawable.watch_face_album_item_select_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        a aVar = this.f6888l;
        if (aVar != null) {
            aVar.onItemClick(i);
        }
    }

    public void e(List<OutfitsStyleBean> list) {
        this.k = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        OutfitsStyleBean outfitsStyleBean = this.k.get(i);
        ggl.a(this.f6887j, viewHolder.f6890j, viewHolder.k, this.p, false);
        this.m.setCornerRadius(ggl.j(this.f6887j, this.p, false));
        viewHolder.f6890j.setImageBitmap(outfitsStyleBean.getBitmap());
        viewHolder.k.setBackground(((long) this.i) == getItemId(i) ? this.m : null);
        h(viewHolder.i, i == 0 ? this.f6889n : this.o, i == getItemCount() + (-1) ? this.f6889n : this.o);
        viewHolder.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.wwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$onBindViewHolder$0(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f6887j).inflate(R$layout.watch_face_item_outfits_select, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<OutfitsStyleBean> list = this.k;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return this.k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public final void h(View view, int i, int i2) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i2;
        view.setLayoutParams(layoutParams);
    }

    public void i(Proto$DeviceInfo proto$DeviceInfo) {
        this.p = proto$DeviceInfo;
        this.m = ggl.g(this.f6887j, proto$DeviceInfo, false);
    }

    public void j(int i) {
        this.i = i;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(a aVar) {
        this.f6888l = aVar;
    }
}
