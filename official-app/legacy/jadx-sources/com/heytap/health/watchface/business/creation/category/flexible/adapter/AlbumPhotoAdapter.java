package com.heytap.health.watchface.business.creation.category.flexible.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.creation.category.flexible.adapter.AlbumPhotoAdapter;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.heytap.health.watchface.business.legacy.main.bean.WatchFaceBean;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a78;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,-B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b(\u0010)J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J&\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00040#j\b\u0012\u0004\u0012\u00020\u0004`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/AlbumPhotoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "Lcom/heytap/health/watchface/business/legacy/creation/album/bean/ImageItem;", "styleList", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "onCreateViewHolder", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "onBindViewHolder", "", "", "payloads", "getItemCount", "Landroid/content/Context;", "i", "Landroid/content/Context;", "mContext", "Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/AlbumPhotoAdapter$b;", "j", "Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/AlbumPhotoAdapter$b;", "mListener", "", MapSchema.FIELD_NAME_KEY, "Z", "mNeedFirstSelect", LogFieldKey.LEVEL_KEY, "I", WatchFaceBean.TAG_M_INDEX, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", LogFieldKey.MESSAGE_KEY, "Ljava/util/ArrayList;", "mPreviewList", "<init>", "(Landroid/content/Context;Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/AlbumPhotoAdapter$b;)V", "Companion", "a", "b", "ViewHolder", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AlbumPhotoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Context mContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b mListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mNeedFirstSelect;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int mIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<ImageItem> mPreviewList;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/AlbumPhotoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "i", "Landroid/widget/ImageView;", "a", "()Landroid/widget/ImageView;", "mPreviewIv", "j", "b", "mSelectorIv", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final ImageView mPreviewIv;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ImageView mSelectorIv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_style);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.iv_style)");
            this.mPreviewIv = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.iv_selector);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.iv_selector)");
            this.mSelectorIv = (ImageView) viewFindViewById2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageView getMPreviewIv() {
            return this.mPreviewIv;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getMSelectorIv() {
            return this.mSelectorIv;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/AlbumPhotoAdapter$b;", "", "", "b", "", "index", "Lcom/heytap/health/watchface/business/legacy/creation/album/bean/ImageItem;", "item", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(int index, @NotNull ImageItem item);

        void b();
    }

    public AlbumPhotoAdapter(@NotNull Context mContext, @NotNull b mListener) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mContext = mContext;
        this.mListener = mListener;
        this.mNeedFirstSelect = true;
        this.mIndex = 1;
        this.mPreviewList = new ArrayList<>();
    }

    public static final void f(int i, AlbumPhotoAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            this$0.mListener.b();
            return;
        }
        if (this$0.mIndex == i) {
            return;
        }
        b bVar = this$0.mListener;
        int i2 = i - 1;
        ImageItem imageItem = this$0.mPreviewList.get(i2);
        Intrinsics.checkNotNullExpressionValue(imageItem, "mPreviewList[adapterPosition - 1]");
        bVar.a(i2, imageItem);
        int i3 = this$0.mIndex;
        this$0.mIndex = i;
        this$0.notifyItemChanged(i3, 0);
        this$0.notifyItemChanged(this$0.mIndex, 0);
    }

    public final void e(@NotNull List<? extends ImageItem> styleList) {
        Intrinsics.checkNotNullParameter(styleList, "styleList");
        this.mPreviewList.clear();
        List<? extends ImageItem> list = styleList;
        this.mPreviewList.addAll(list);
        if (!list.isEmpty()) {
            this.mIndex = 1;
            b bVar = this.mListener;
            ImageItem imageItem = this.mPreviewList.get(0);
            Intrinsics.checkNotNullExpressionValue(imageItem, "mPreviewList[0]");
            bVar.a(0, imageItem);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mPreviewList.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewHolder viewHolder = (ViewHolder) holder;
        final int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            viewHolder.getMSelectorIv().setVisibility(4);
            viewHolder.getMPreviewIv().setImageResource(R$drawable.watch_face_flexible_add_photo);
        } else {
            int i = bindingAdapterPosition - 1;
            ImageItem imageItem = this.mPreviewList.get(i);
            Intrinsics.checkNotNullExpressionValue(imageItem, "mPreviewList[adapterPosition - 1]");
            a78.d(this.mContext, imageItem.getPreviewUrl(), viewHolder.getMPreviewIv(), 300);
            viewHolder.getMSelectorIv().setVisibility(bindingAdapterPosition == this.mIndex ? 0 : 4);
            if (this.mNeedFirstSelect && bindingAdapterPosition == 1) {
                this.mNeedFirstSelect = false;
                b bVar = this.mListener;
                ImageItem imageItem2 = this.mPreviewList.get(i);
                Intrinsics.checkNotNullExpressionValue(imageItem2, "mPreviewList[adapterPosition - 1]");
                bVar.a(i, imageItem2);
            }
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.iw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlbumPhotoAdapter.f(bindingAdapterPosition, this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R$layout.watch_face_flexible_item_time_style, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(mContext).inflate(\n…rent, false\n            )");
        return new ViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder(holder, position, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        ((ViewHolder) holder).getMSelectorIv().setVisibility(position == this.mIndex ? 0 : 4);
    }
}
