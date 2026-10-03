package com.heytap.health.watchface.business.creation.category.outfits;

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
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitAlternativeBean;
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitAlternativeImgBean;
import com.oplus.aiunit.vision.ggl;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class OutfitsGridViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f6788j;
    public List<OutfitAlternativeImgBean> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f6789l;
    public GradientDrawable m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6790n;
    public int o;
    public Proto$DeviceInfo q;
    public int i = 0;
    public int p = 74;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public RoundedImageView f6791j;
        public View k;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.i = view;
            this.f6791j = (RoundedImageView) view.findViewById(R$id.ccv_card);
            this.k = view.findViewById(R$id.fl_item);
        }
    }

    public interface a {
        void n3(int i);
    }

    public OutfitsGridViewAdapter(Context context) {
        this.f6788j = context;
        Resources resources = context.getResources();
        this.f6790n = resources.getDimensionPixelOffset(R$dimen.watch_face_outfits_select_list_margin);
        this.o = resources.getDimensionPixelOffset(R$dimen.watch_face_margin_3);
        this.m = (GradientDrawable) context.getDrawable(R$drawable.watch_face_album_item_select_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        a aVar = this.f6789l;
        if (aVar != null) {
            aVar.n3(i);
        }
    }

    public void e(OutfitAlternativeBean outfitAlternativeBean) {
        this.k = outfitAlternativeBean.imgs;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        OutfitAlternativeImgBean outfitAlternativeImgBean = this.k.get(i);
        ggl.a(this.f6788j, viewHolder.f6791j, viewHolder.k, this.q, false);
        this.m.setCornerRadius(ggl.j(this.f6788j, this.q, false));
        viewHolder.f6791j.setImageBitmap(outfitAlternativeImgBean.previewBitmap);
        viewHolder.k.setBackground(((long) this.i) == getItemId(i) ? this.m : null);
        h(viewHolder.i, i == 0 ? this.f6790n : this.o, i == getItemCount() + (-1) ? this.f6790n : this.o);
        viewHolder.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.xud
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
        return new ViewHolder(LayoutInflater.from(this.f6788j).inflate(R$layout.watch_face_item_outfits_select, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<OutfitAlternativeImgBean> list = this.k;
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
        this.q = proto$DeviceInfo;
        this.m = ggl.g(this.f6788j, proto$DeviceInfo, false);
        this.p = this.q.getScreenRadius();
    }

    public void j(int i) {
        this.i = i;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(a aVar) {
        this.f6789l = aVar;
    }
}
