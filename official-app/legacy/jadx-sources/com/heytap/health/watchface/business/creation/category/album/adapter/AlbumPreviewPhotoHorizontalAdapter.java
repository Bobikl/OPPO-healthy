package com.heytap.health.watchface.business.creation.category.album.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.oplus.aiunit.vision.d5a;
import com.oplus.aiunit.vision.kvi;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AlbumPreviewPhotoHorizontalAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final String TAG = "AlbumWatchFacePreviewPhotoHorizontal2Adapter";
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<ImageItem> f6694j;
    public a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageItem f6695l;
    public kvi m;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ImageView f6696j;
        public View k;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.i = (ImageView) view.findViewById(R$id.iv_select_bg);
            this.f6696j = (ImageView) view.findViewById(R$id.iv_photo);
            this.k = view.findViewById(R$id.v_mask);
        }
    }

    public interface a {
        void onItemClick(int i);
    }

    public AlbumPreviewPhotoHorizontalAdapter(Context context, List<ImageItem> list, kvi kviVar) {
        this.i = context;
        this.f6694j = list;
        this.m = kviVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.onItemClick(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        ImageItem imageItem = this.f6694j.get(i);
        if (imageItem == null || imageItem.mUriPath == null) {
            return;
        }
        viewHolder.i.setVisibility(imageItem.equals(this.f6695l) ? 0 : 4);
        viewHolder.k.setVisibility(imageItem.mIsGray ? 0 : 8);
        d5a.k(this.i, imageItem.mUriPath, viewHolder.f6696j, this.m);
        viewHolder.f6696j.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ly
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$onBindViewHolder$0(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.i).inflate(R$layout.watch_face_item_preview_horizontal_photo, viewGroup, false));
    }

    public void g(ImageItem imageItem) {
        this.f6695l = imageItem;
    }

    public List<ImageItem> getData() {
        return this.f6694j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ImageItem> list = this.f6694j;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public void setOnItemClickListener(a aVar) {
        this.k = aVar;
    }
}
