package com.heytap.health.device.flexadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.device.flexadapter.a;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.qe0;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0017\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u0010\u0012\f\u0012\n0\u0004R\u0006\u0012\u0002\b\u00030\u00000\u0003:\u0001\u001cB\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\t\u001a\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J \u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n0\u0004R\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/device/flexadapter/FlexAdapter;", "Lcom/heytap/health/device/flexadapter/a;", "D", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/device/flexadapter/FlexAdapter$FlexHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, MapSchema.FIELD_NAME_ENTRY, "getItemCount", "position", "getItemViewType", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "d", "", "i", "Ljava/lang/String;", "tag", "", "j", "Ljava/util/List;", "dataList", MapSchema.FIELD_NAME_KEY, "TAG", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "FlexHolder", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlexAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexAdapter.kt\ncom/heytap/health/device/flexadapter/FlexAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public class FlexAdapter<D extends a<?, ?>> extends RecyclerView.Adapter<FlexAdapter<?>.FlexHolder> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<D> dataList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/device/flexadapter/FlexAdapter$FlexHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/heytap/health/device/flexadapter/FlexAdapter;Landroid/view/View;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FlexHolder extends RecyclerView.ViewHolder {
        public final /* synthetic */ FlexAdapter<D> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlexHolder(@NotNull FlexAdapter flexAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.i = flexAdapter;
        }
    }

    public FlexAdapter(@NotNull String tag, @NotNull List<D> dataList) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.tag = tag;
        this.dataList = dataList;
        this.TAG = "FlexAdapter";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull FlexAdapter<?>.FlexHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        D d = this.dataList.get(position);
        a7b.f(this.TAG, this.tag + " onBindViewHolder: position:" + position + " absItemView:" + d + " holder:" + holder);
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        d.V(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public FlexAdapter<D>.FlexHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Object next;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Iterator<T> it = this.dataList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((a) next).G() == viewType));
        a aVar = (a) next;
        if (aVar != null) {
            if (!aVar.getActivate()) {
                aVar.i();
            }
            View view = LayoutInflater.from(parent.getContext()).inflate(aVar.R(), parent, false);
            qe0.G(view, false);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            aVar.Y(view);
            FlexAdapter<D>.FlexHolder flexHolder = new FlexHolder(this, view);
            String str = this.tag;
            String mTag = aVar.getMTag();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" onCreateViewHolder: ");
            sb.append(mTag);
            sb.append(" holder:");
            sb.append(flexHolder);
            return flexHolder;
        }
        a7b.b(this.TAG, this.tag + " onCreateViewHolder not find " + viewType + " find:" + aVar + " dataList:" + this.dataList);
        ImageView imageView = new ImageView(parent.getContext());
        imageView.setId(R$id.device_settings_flex_empty_id);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new FlexHolder(this, imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.dataList.get(position).G();
    }
}
