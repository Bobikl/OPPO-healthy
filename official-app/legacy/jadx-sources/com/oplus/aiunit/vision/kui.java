package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.heytap.databaseengine.model.Commodity;
import com.heytap.databaseengine.model.Price;
import com.heytap.databaseengine.model.SpaceCardMetaData;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.core.operation.render.recyclerview.StoreBannerAdapter;
import com.heytap.health.core.operation.render.recyclerview.StoreCardAdapter;
import com.heytap.health.core.operation.render.recyclerview.StoreListAdapter;
import com.heytap.health.operations.R$id;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tJ$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002J$\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002R\u001a\u0010\u001c\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/kui;", "", "Landroid/content/Context;", "context", "Lcom/heytap/databaseengine/model/SpaceInfo;", "spaceInfo", "", "Lcom/heytap/databaseengine/model/SpaceCardMetaData;", "mData", "", "parentPosition", "", "isUnFoldScreen", "Lcom/heytap/health/core/operation/render/recyclerview/StoreCardAdapter;", "b", "Landroid/view/View;", "view", "metaData", "position", "", MapSchema.FIELD_NAME_ENTRY, "d", "c", "", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class kui {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "StoreCardAdapterUtil";

    public static final void f(kui this$0, int i, SpaceInfo spaceInfo, SpaceCardMetaData metaData, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(spaceInfo, "$spaceInfo");
        Intrinsics.checkNotNullParameter(metaData, "$metaData");
        this$0.c(i, spaceInfo, metaData);
        mmd.c().a(Uri.parse(metaData.getJumpUrl()), metaData.getBackupJumpUrl());
    }

    @NotNull
    public final StoreCardAdapter b(@NotNull Context context, @NotNull SpaceInfo spaceInfo, @NotNull List<? extends SpaceCardMetaData> mData, int parentPosition, boolean isUnFoldScreen) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(spaceInfo, "spaceInfo");
        Intrinsics.checkNotNullParameter(mData, "mData");
        StoreCardAdapter storeBannerAdapter = !isUnFoldScreen ? new StoreBannerAdapter(context, spaceInfo, TypeIntrinsics.asMutableList(mData), parentPosition) : new StoreListAdapter(context, spaceInfo, TypeIntrinsics.asMutableList(mData), parentPosition);
        int size = mData.size();
        for (int i = 0; i < size; i++) {
            storeBannerAdapter.h(i, spaceInfo, spaceInfo.getMaterielList().get(i));
        }
        return storeBannerAdapter;
    }

    public final void c(int position, SpaceInfo spaceInfo, SpaceCardMetaData metaData) {
        e4i e4iVar = new e4i();
        e4iVar.k(1);
        e4iVar.i(position + 1);
        e4iVar.l(spaceInfo);
        e4iVar.j(metaData);
        f4i.a(e4iVar);
    }

    public final void d(int position, SpaceInfo spaceInfo, SpaceCardMetaData metaData) {
        e4i e4iVar = new e4i();
        e4iVar.k(1);
        e4iVar.i(position + 1);
        e4iVar.l(spaceInfo);
        e4iVar.j(metaData);
        f4i.c(e4iVar);
    }

    public final void e(@NotNull View view, @NotNull final SpaceInfo spaceInfo, @NotNull final SpaceCardMetaData metaData, final int position) {
        View view2;
        String str;
        Price price;
        Price price2;
        Price price3;
        Price price4;
        Price price5;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(spaceInfo, "spaceInfo");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        View viewFindViewById = view.findViewById(R$id.iv_store);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.iv_store)");
        COUIRoundImageView cOUIRoundImageView = (COUIRoundImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.parent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.parent)");
        View viewFindViewById3 = viewFindViewById2.findViewById(R$id.name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.name)");
        View viewFindViewById4 = viewFindViewById2.findViewById(R$id.sell_point);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.sell_point)");
        View viewFindViewById5 = viewFindViewById2.findViewById(R$id.discount_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.discount_price)");
        TextView textView = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewFindViewById2.findViewById(R$id.original_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.original_price)");
        TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewFindViewById2.findViewById(R$id.interest_point);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.interest_point)");
        ((TextView) viewFindViewById3).setText(metaData.getMaterielTitle());
        ((TextView) viewFindViewById4).setText(metaData.getMaterielSubTitle());
        ((TextView) viewFindViewById7).setText(metaData.getMaterielDesc());
        try {
            textView2.setPaintFlags(textView2.getPaintFlags() | 16);
            Commodity commodity = metaData.getCommodity();
            String originalPrice = null;
            String currencyTag = (commodity == null || (price5 = commodity.getPrice()) == null) ? null : price5.getCurrencyTag();
            Commodity commodity2 = metaData.getCommodity();
            String buyPrice = (commodity2 == null || (price4 = commodity2.getPrice()) == null) ? null : price4.getBuyPrice();
            Commodity commodity3 = metaData.getCommodity();
            String price6 = (commodity3 == null || (price3 = commodity3.getPrice()) == null) ? null : price3.getPrice();
            Commodity commodity4 = metaData.getCommodity();
            String marketPrice = (commodity4 == null || (price2 = commodity4.getPrice()) == null) ? null : price2.getMarketPrice();
            Commodity commodity5 = metaData.getCommodity();
            if (commodity5 != null && (price = commodity5.getPrice()) != null) {
                originalPrice = price.getOriginalPrice();
            }
            view2 = viewFindViewById2;
            try {
                if (TextUtils.isEmpty(marketPrice)) {
                    if (!TextUtils.isEmpty(originalPrice)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str2 = String.format("%s%s", Arrays.copyOf(new Object[]{currencyTag, price6}, 2));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        textView.setText(str2);
                        String str3 = String.format("%s%s", Arrays.copyOf(new Object[]{currencyTag, originalPrice}, 2));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        textView2.setText(str3);
                    }
                    if (!TextUtils.isEmpty(buyPrice)) {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        String str4 = String.format("%s%s", Arrays.copyOf(new Object[]{currencyTag, buyPrice}, 2));
                        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                        textView.setText(str4);
                        if (TextUtils.isEmpty(price6)) {
                            str = "";
                        } else {
                            str = String.format("%s%s", Arrays.copyOf(new Object[]{currencyTag, price6}, 2));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        }
                        textView2.setText(str);
                    } else if (!TextUtils.isEmpty(price6)) {
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        String str5 = String.format("%s%s", Arrays.copyOf(new Object[]{currencyTag, price6}, 2));
                        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                        textView.setText(str5);
                    }
                } else {
                    StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                    String str6 = String.format("%s%s", Arrays.copyOf(new Object[]{currencyTag, marketPrice}, 2));
                    Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                    textView.setText(str6);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("currencyTag = ");
                sb.append(currencyTag);
                sb.append(" ,buyPrice = ");
                sb.append(buyPrice);
                sb.append(" ,  price = ");
                sb.append(price6);
                sb.append(" , marketPrice = ");
                sb.append(marketPrice);
                sb.append(" , originalPrice = ");
                sb.append(originalPrice);
            } catch (Exception e2) {
                e = e2;
                a7b.b(this.TAG, "Error is " + e);
                textView2.setText("");
                textView.setText("");
            }
        } catch (Exception e3) {
            e = e3;
            view2 = viewFindViewById2;
        }
        r4a.e(cOUIRoundImageView.getContext(), c5i.b(metaData), cOUIRoundImageView);
        d(position, spaceInfo, metaData);
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.jui
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                kui.f(this.i, position, spaceInfo, metaData, view3);
            }
        });
    }
}
