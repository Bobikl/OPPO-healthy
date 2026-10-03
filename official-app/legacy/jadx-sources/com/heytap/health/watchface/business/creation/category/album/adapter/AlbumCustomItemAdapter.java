package com.heytap.health.watchface.business.creation.category.album.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.view.RoundedImageView;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.oplus.aiunit.vision.a78;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AlbumCustomItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int POS_ADD = 0;
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<ImageItem> f6678j;
    public a k;

    public static class AlbumItemViewHolder extends RecyclerView.ViewHolder {
        public View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f6679j;
        public View k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RoundedImageView f6680l;

        public AlbumItemViewHolder(View view) {
            super(view);
            this.i = view.findViewById(R$id.cl_item_root);
            this.f6679j = (TextView) view.findViewById(R$id.tv_name);
            this.k = view.findViewById(R$id.view_selected_bg);
            this.f6680l = (RoundedImageView) view.findViewById(R$id.iv_icon);
        }
    }

    public interface a {
        void T(int i);
    }

    public AlbumCustomItemAdapter(Context context, List<ImageItem> list) {
        this.i = context;
        this.f6678j = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.T(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ImageItem> list = this.f6678j;
        if (list == null) {
            return 1;
        }
        return 1 + list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        AlbumItemViewHolder albumItemViewHolder = (AlbumItemViewHolder) viewHolder;
        if (i == 0) {
            albumItemViewHolder.f6680l.setImageResource(R$drawable.watch_face_album_v2_add);
        } else {
            a78.d(this.i, this.f6678j.get(i - 1).mUriPath, albumItemViewHolder.f6680l, 300);
        }
        albumItemViewHolder.f6680l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.nt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$onBindViewHolder$0(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new AlbumItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_face_custom_item_square, viewGroup, false));
    }

    public void setOnItemClickListener(a aVar) {
        this.k = aVar;
    }
}
