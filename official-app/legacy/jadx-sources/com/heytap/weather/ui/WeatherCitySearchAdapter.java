package com.heytap.weather.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allawn.weather.common.vo.CityVO;
import com.amap.api.services.district.DistrictSearchQuery;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.wearable.watch.R$color;
import com.heytap.wearable.watch.R$id;
import com.heytap.wearable.watch.R$layout;
import com.heytap.weather.ui.WeatherCitySearchAdapter;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0002R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/heytap/weather/ui/WeatherCitySearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/weather/ui/WeatherCitySearchAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, b2n.g, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "f", "", "Lcom/allawn/weather/common/vo/CityVO;", "newItems", "i", "getItemCount", "Landroid/content/Context;", "context", "cityVO", "Landroid/text/SpannableString;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/weather/ui/WeatherCitySearchAdapter$a;", "Lcom/heytap/weather/ui/WeatherCitySearchAdapter$a;", "getOnItemClickListener", "()Lcom/heytap/weather/ui/WeatherCitySearchAdapter$a;", "setOnItemClickListener", "(Lcom/heytap/weather/ui/WeatherCitySearchAdapter$a;)V", "onItemClickListener", "", "j", "Ljava/util/List;", "items", "<init>", "()V", "a", "ViewHolder", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WeatherCitySearchAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public a onItemClickListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<CityVO> items = new ArrayList();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/heytap/weather/ui/WeatherCitySearchAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "a", "()Landroid/widget/TextView;", "tvCity", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final TextView tvCity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tv_city);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tv_city)");
            this.tvCity = (TextView) viewFindViewById;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getTvCity() {
            return this.tvCity;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/weather/ui/WeatherCitySearchAdapter$a;", "", "Lcom/allawn/weather/common/vo/CityVO;", DistrictSearchQuery.KEYWORDS_CITY, "", "a", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@NotNull CityVO city);
    }

    @SensorsDataInstrumented
    public static final void g(WeatherCitySearchAdapter this$0, CityVO cityVO, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cityVO, "$cityVO");
        a aVar = this$0.onItemClickListener;
        if (aVar != null) {
            aVar.a(cityVO);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public final SpannableString e(Context context, CityVO cityVO) {
        String content;
        String cityName = cityVO.getCityName();
        if (TextUtils.isEmpty(cityVO.getTertiaryName())) {
            content = cityName;
        } else {
            content = cityName + "，" + cityVO.getTertiaryName();
        }
        if (!TextUtils.isEmpty(cityVO.getSecondaryName())) {
            content = content + "，" + cityVO.getSecondaryName();
        }
        if (!TextUtils.isEmpty(cityVO.getCountryName())) {
            content = content + "，" + cityVO.getCountryName();
        }
        SpannableString spannableString = new SpannableString(content);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(R$color.positive_green));
        Intrinsics.checkNotNullExpressionValue(content, "content");
        Intrinsics.checkNotNullExpressionValue(cityName, "cityName");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) content, cityName, 0, false, 6, (Object) null);
        spannableString.setSpan(foregroundColorSpan, iIndexOf$default, cityName.length() + iIndexOf$default, 33);
        return spannableString;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final CityVO cityVO = this.items.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.lkl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeatherCitySearchAdapter.g(this.i, cityVO, view);
            }
        });
        TextView tvCity = holder.getTvCity();
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "holder.itemView.context");
        tvCity.setText(e(context, cityVO));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_search_weather_city, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inf…ther_city, parent, false)");
        return new ViewHolder(viewInflate);
    }

    public final void i(@NotNull List<? extends CityVO> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.items.clear();
        this.items.addAll(newItems);
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(@Nullable a aVar) {
        this.onItemClickListener = aVar;
    }
}
