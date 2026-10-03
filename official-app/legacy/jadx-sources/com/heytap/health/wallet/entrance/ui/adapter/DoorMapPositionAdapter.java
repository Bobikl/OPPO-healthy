package com.heytap.health.wallet.entrance.ui.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.services.help.Tip;
import com.heytap.health.wallet.entrance.R$color;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.n28;
import com.oplus.aiunit.vision.xsc;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\"\u0010\u0012\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/heytap/health/wallet/entrance/ui/adapter/DoorMapPositionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/wallet/entrance/ui/adapter/DoorMapPositionAdapter$PositionViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, b2n.f, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "f", "getItemCount", "", "Lcom/amap/api/services/help/Tip;", "list", "", "inputText", b2n.g, "Lcom/heytap/health/wallet/entrance/ui/adapter/DoorMapPositionAdapter$a;", "onSelectListener", "setOnSelectListener", "color", "text", n28.KEYWORD, "Landroid/text/SpannableString;", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "i", "Landroid/content/Context;", "mContext", "", "j", "Ljava/util/List;", "mList", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "mInputText", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/wallet/entrance/ui/adapter/DoorMapPositionAdapter$a;", "<init>", "(Landroid/content/Context;)V", "a", "PositionViewHolder", "entrance_release"}, k = 1, mv = {1, 8, 0})
public final class DoorMapPositionAdapter extends RecyclerView.Adapter<PositionViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Context mContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Tip> mList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public String mInputText;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public a onSelectListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/wallet/entrance/ui/adapter/DoorMapPositionAdapter$PositionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "setTvName", "(Landroid/widget/TextView;)V", "tvName", "j", "b", "setTvAddress", "tvAddress", "Landroid/widget/Button;", MapSchema.FIELD_NAME_KEY, "Landroid/widget/Button;", "a", "()Landroid/widget/Button;", "setBtnSelect", "(Landroid/widget/Button;)V", "btnSelect", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public static final class PositionViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public TextView tvName;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public TextView tvAddress;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public Button btnSelect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PositionViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tvName);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tvName)");
            this.tvName = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tvAddress);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.tvAddress)");
            this.tvAddress = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.btnSelect);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.btnSelect)");
            this.btnSelect = (Button) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Button getBtnSelect() {
            return this.btnSelect;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getTvAddress() {
            return this.tvAddress;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getTvName() {
            return this.tvName;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/wallet/entrance/ui/adapter/DoorMapPositionAdapter$a;", "", "Lcom/amap/api/services/help/Tip;", "poiInfo", "", "a", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@Nullable Tip poiInfo);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/wallet/entrance/ui/adapter/DoorMapPositionAdapter$b", "Lcom/oplus/aiunit/vision/xsc;", "Landroid/view/View;", "v", "", "a", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends xsc {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Tip f6256l;

        public b(Tip tip) {
            this.f6256l = tip;
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(@Nullable View v) {
            if (DoorMapPositionAdapter.this.onSelectListener != null) {
                a aVar = DoorMapPositionAdapter.this.onSelectListener;
                Intrinsics.checkNotNull(aVar);
                aVar.a(this.f6256l);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/wallet/entrance/ui/adapter/DoorMapPositionAdapter$c", "Lcom/oplus/aiunit/vision/xsc;", "Landroid/view/View;", "v", "", "a", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends xsc {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Tip f6257l;

        public c(Tip tip) {
            this.f6257l = tip;
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(@Nullable View v) {
            if (DoorMapPositionAdapter.this.onSelectListener != null) {
                a aVar = DoorMapPositionAdapter.this.onSelectListener;
                Intrinsics.checkNotNull(aVar);
                aVar.a(this.f6257l);
            }
        }
    }

    public DoorMapPositionAdapter(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mList = new ArrayList();
    }

    public final SpannableString e(int color, String text, String keyword) {
        SpannableString spannableString = new SpannableString(text);
        Pattern patternCompile = Pattern.compile(Pattern.quote(keyword));
        String lowerCase = text.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Matcher matcher = patternCompile.matcher(new SpannableString(lowerCase));
        while (matcher.find()) {
            spannableString.setSpan(new ForegroundColorSpan(color), matcher.start(), matcher.end(), 33);
        }
        return spannableString;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull PositionViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (lza.a(this.mList) || this.mList.get(position) == null) {
            return;
        }
        Tip tip = this.mList.get(position);
        int color = ContextCompat.getColor(this.mContext, R$color.color_007AFF);
        Intrinsics.checkNotNull(tip);
        String name = tip.getName();
        Intrinsics.checkNotNullExpressionValue(name, "poiInfo!!.getName()");
        holder.getTvName().setText(e(color, name, this.mInputText));
        if (TextUtils.isEmpty(tip.getAddress())) {
            holder.getTvAddress().setVisibility(8);
        } else {
            holder.getTvAddress().setText(tip.getAddress());
            holder.getTvAddress().setVisibility(0);
        }
        holder.itemView.setOnClickListener(new b(tip));
        holder.getBtnSelect().setOnClickListener(new c(tip));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public PositionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R$layout.item_door_map_position, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(mContext).inflate(R…_position, parent, false)");
        return new PositionViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Tip> list = this.mList;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.mList.size();
    }

    public final void h(@Nullable List<? extends Tip> list, @Nullable String inputText) {
        this.mList.clear();
        List<? extends Tip> list2 = list;
        if (!(list2 == null || list2.isEmpty())) {
            this.mList.addAll(list2);
        }
        this.mInputText = inputText;
        notifyDataSetChanged();
    }

    public final void setOnSelectListener(@Nullable a onSelectListener) {
        this.onSelectListener = onSelectListener;
    }
}
