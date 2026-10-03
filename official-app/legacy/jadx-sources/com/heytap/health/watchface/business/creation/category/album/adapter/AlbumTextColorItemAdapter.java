package com.heytap.health.watchface.business.creation.category.album.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.view.RoundedImageView;
import com.heytap.health.watchface.R$array;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AlbumTextColorItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final String TAG = "AlbumTextColorItemAdapter";
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f6704j;
    public List<Integer> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f6705l;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6706n = true;

    public static class AlbumItemViewHolder extends RecyclerView.ViewHolder {
        public RoundedImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ImageView f6707j;

        public AlbumItemViewHolder(View view) {
            super(view);
            this.i = (RoundedImageView) view.findViewById(R$id.riv_image);
            this.f6707j = (ImageView) view.findViewById(R$id.iv_select);
        }
    }

    public interface a {
        void a(boolean z, int i);
    }

    public AlbumTextColorItemAdapter(Context context, int i) {
        this.f6704j = context;
        this.i = i;
        this.k = h(context);
        this.f6705l = context.getResources().getStringArray(R$array.watch_face_album_time_text_border_colors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        a aVar = this.m;
        if (aVar == null || !this.f6706n) {
            return;
        }
        aVar.a(true, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i, View view) {
        a aVar = this.m;
        if (aVar == null || !this.f6706n) {
            return;
        }
        aVar.a(false, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Integer> list = this.k;
        if (list == null) {
            return 1;
        }
        return 1 + list.size();
    }

    public final List<Integer> h(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getResources().getStringArray(R$array.watch_face_album_time_text_colors)) {
            arrayList.add(Integer.valueOf(Color.parseColor(str)));
        }
        return arrayList;
    }

    public void i(boolean z) {
        this.f6706n = z;
    }

    public void j(int i) {
        this.i = i;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        AlbumItemViewHolder albumItemViewHolder = (AlbumItemViewHolder) viewHolder;
        if (i == getItemCount() - 1) {
            albumItemViewHolder.i.setImageDrawable(this.f6704j.getDrawable(R$drawable.watch_face_album_text_color_more));
            albumItemViewHolder.f6707j.setVisibility(this.k.contains(Integer.valueOf(this.i)) ? 4 : 0);
            albumItemViewHolder.i.setBorderWidth(0.0f);
            albumItemViewHolder.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.wy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.f(view);
                }
            });
            return;
        }
        final int iIntValue = this.k.get(i).intValue();
        int color = Color.parseColor(this.f6705l[i]);
        albumItemViewHolder.i.setImageDrawable(new ColorDrawable(iIntValue));
        albumItemViewHolder.i.setBorderColor(color);
        albumItemViewHolder.i.setBorderWidth(R$dimen.watch_face_width_1_33);
        albumItemViewHolder.f6707j.setVisibility(iIntValue != this.i ? 4 : 0);
        albumItemViewHolder.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.xy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.g(iIntValue, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new AlbumItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_face_custom_color_item, viewGroup, false));
    }

    public void setOnItemClickListener(a aVar) {
        this.m = aVar;
    }
}
