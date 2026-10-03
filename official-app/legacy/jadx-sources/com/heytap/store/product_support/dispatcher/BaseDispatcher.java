package com.heytap.store.product_support.dispatcher;

import android.content.Context;
import android.content.DialogInterface;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.google.gson.JsonArray;
import com.heytap.nearx.uikit.widget.dialog.NearAlertDialog;
import com.heytap.store.product_support.data.OrderParamsData;
import com.heytap.store.product_support.data.OrderParamsDataKt;
import com.heytap.store.product_support.data.OrderParamsGifts;
import com.heytap.store.product_support.data.OrderParamsInsurance;
import com.heytap.store.product_support.data.OrderResponseData;
import com.heytap.store.product_support.dispatcher.BaseDispatcher;
import com.heytap.store.product_support.util.ProductSupportUserCenterProxyKt;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J$\u0010\u001a\u001a\u00020\u00072\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0016\u0010\u001c\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0016\u0010 \u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001eH\u0002R4\u0010\u0003\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/BaseDispatcher;", "", "()V", "parameterCallback", "Lkotlin/Function1;", "", "", "", "getParameterCallback", "()Lkotlin/jvm/functions/Function1;", "setParameterCallback", "(Lkotlin/jvm/functions/Function1;)V", "resultCallback", "Lcom/heytap/store/product_support/data/OrderResponseData;", "getResultCallback", "setResultCallback", "checkRepelGifts", "orderParams", "Lcom/heytap/store/product_support/data/OrderParamsData;", "context", "Landroid/content/Context;", "checkRepelType", "doAction", "laserAgainBuy", "", "doActionAfterCheckRepel", "finallyAction", "orderList", "getGiftString", OrderParamsDataKt.ORDER_PARAMS_KEY_GIFTS, "", "Lcom/heytap/store/product_support/data/OrderParamsGifts;", "getServicesString", "services", "Lcom/heytap/store/product_support/data/OrderParamsInsurance;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class BaseDispatcher {

    @Nullable
    private Function1<? super Map<String, String>, Unit> parameterCallback;

    @Nullable
    private Function1<? super OrderResponseData, Unit> resultCallback;

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkRepelGifts(final OrderParamsData orderParams, Context context) {
        String strCheckRepelType = checkRepelType(orderParams);
        if (strCheckRepelType.length() == 0) {
            doActionAfterCheckRepel(orderParams);
        } else {
            new NearAlertDialog.Builder(context).setTitle(strCheckRepelType).setPositiveButton("继续下单", new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.t11
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BaseDispatcher.m5078checkRepelGifts$lambda0(this.i, orderParams, dialogInterface, i);
                }
            }).setNegativeButton(LanUtils.CN.CANCEL, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.u11
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BaseDispatcher.m5079checkRepelGifts$lambda1(dialogInterface, i);
                }
            }).create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: checkRepelGifts$lambda-0, reason: not valid java name */
    public static final void m5078checkRepelGifts$lambda0(BaseDispatcher this$0, OrderParamsData orderParams, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(orderParams, "$orderParams");
        this$0.doActionAfterCheckRepel(orderParams);
        dialogInterface.dismiss();
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: checkRepelGifts$lambda-1, reason: not valid java name */
    public static final void m5079checkRepelGifts$lambda1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    private final String checkRepelType(OrderParamsData orderParams) {
        List<OrderParamsGifts> gifts;
        List<OrderParamsInsurance> services = orderParams.getServices();
        if (services == null || (gifts = orderParams.getGifts()) == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (OrderParamsGifts orderParamsGifts : gifts) {
            for (OrderParamsInsurance orderParamsInsurance : services) {
                if (Intrinsics.areEqual(orderParamsInsurance.getSkuId(), orderParamsGifts.getGoodsSkuId()) || Intrinsics.areEqual(orderParamsInsurance.getType(), orderParamsGifts.getErpCode()) || StringsKt__StringsKt.split$default((CharSequence) orderParamsInsurance.getRepelType(), new String[]{","}, false, 0, 6, (Object) null).contains(orderParamsGifts.getErpCode())) {
                    if (!arrayList.contains(orderParamsGifts)) {
                        arrayList.add(orderParamsGifts);
                    }
                    if (!arrayList2.contains(orderParamsInsurance)) {
                        arrayList2.add(orderParamsInsurance);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("赠品");
        sb.append(((OrderParamsGifts) arrayList.get(0)).getName());
        if (arrayList.size() > 1) {
            sb.append(Intrinsics.stringPlus("&", ((OrderParamsGifts) arrayList.get(1)).getName()));
        }
        if (arrayList.size() > 2) {
            sb.append("等商品");
        }
        sb.append("无法与您要购买的");
        sb.append(((OrderParamsInsurance) arrayList2.get(0)).getName());
        if (arrayList2.size() > 1) {
            sb.append(Intrinsics.stringPlus("&", ((OrderParamsInsurance) arrayList2.get(1)).getName()));
        }
        if (arrayList2.size() > 2) {
            sb.append("等商品");
        }
        sb.append("同时生效，移除赠品继续下单？");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ void doAction$default(BaseDispatcher baseDispatcher, OrderParamsData orderParamsData, Context context, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doAction");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        baseDispatcher.doAction(orderParamsData, context, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doActionAfterCheckRepel(OrderParamsData orderParams) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("quantity", orderParams.getQuantity());
        String addBuyPackages = orderParams.getAddBuyPackages();
        if (!(addBuyPackages == null || addBuyPackages.length() == 0)) {
            String addBuyPackages2 = orderParams.getAddBuyPackages();
            if (addBuyPackages2 == null) {
                addBuyPackages2 = "";
            }
            linkedHashMap.put(OrderParamsDataKt.ORDER_PARAMS_KEY_PACKAGES, addBuyPackages2);
        }
        List<OrderParamsInsurance> services = orderParams.getServices();
        if (!(services == null || services.isEmpty())) {
            List<OrderParamsInsurance> services2 = orderParams.getServices();
            if (services2 == null) {
                services2 = CollectionsKt__CollectionsKt.emptyList();
            }
            linkedHashMap.put("services", getServicesString(services2));
        }
        String suits = orderParams.getSuits();
        if (suits != null) {
            linkedHashMap.put("suits", suits);
        }
        List<OrderParamsGifts> gifts = orderParams.getGifts();
        if (!(gifts == null || gifts.isEmpty())) {
            List<OrderParamsGifts> gifts2 = orderParams.getGifts();
            if (gifts2 == null) {
                gifts2 = CollectionsKt__CollectionsKt.emptyList();
            }
            linkedHashMap.put(OrderParamsDataKt.ORDER_PARAMS_KEY_GIFTS, getGiftString(gifts2));
        }
        if (orderParams.getSourceSort().length() > 0) {
            linkedHashMap.put(OrderParamsDataKt.ORDER_PARAMS_KEY_MODEL_SOURCE_SORT, orderParams.getSourceSort());
        }
        if (orderParams.getActivityId().length() > 0) {
            linkedHashMap.put(OrderParamsDataKt.ORDER_PARAMS_KEY_LD, orderParams.getActivityId());
        }
        if (orderParams.getReferId().length() > 0) {
            linkedHashMap.put(OrderParamsDataKt.ORDER_PARAMS_KEY_REFERID, orderParams.getReferId());
        }
        finallyAction(linkedHashMap, orderParams);
    }

    private final String getGiftString(List<OrderParamsGifts> gifts) {
        JsonArray jsonArray = new JsonArray();
        Iterator<T> it = gifts.iterator();
        while (it.hasNext()) {
            jsonArray.add(((OrderParamsGifts) it.next()).getJsonObject());
        }
        String string = jsonArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JsonArray().apply {\n    …   }\n        }.toString()");
        return string;
    }

    private final String getServicesString(List<OrderParamsInsurance> services) {
        JsonArray jsonArray = new JsonArray();
        Iterator<T> it = services.iterator();
        while (it.hasNext()) {
            jsonArray.add(((OrderParamsInsurance) it.next()).getJsonObject());
        }
        String string = jsonArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JsonArray().apply {\n    …   }\n        }.toString()");
        return string;
    }

    public final void doAction(@NotNull final OrderParamsData orderParams, @NotNull final Context context, final boolean laserAgainBuy) {
        Intrinsics.checkNotNullParameter(orderParams, "orderParams");
        Intrinsics.checkNotNullParameter(context, "context");
        ProductSupportUserCenterProxyKt.isLoginAsync$default(true, new Function0<Unit>() { // from class: com.heytap.store.product_support.dispatcher.BaseDispatcher.doAction.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (laserAgainBuy) {
                    this.doActionAfterCheckRepel(orderParams);
                } else {
                    this.checkRepelGifts(orderParams, context);
                }
            }
        }, null, 4, null);
    }

    public abstract void finallyAction(@NotNull Map<String, String> orderList, @NotNull OrderParamsData orderParams);

    @Nullable
    public final Function1<Map<String, String>, Unit> getParameterCallback() {
        return this.parameterCallback;
    }

    @Nullable
    public final Function1<OrderResponseData, Unit> getResultCallback() {
        return this.resultCallback;
    }

    public final void setParameterCallback(@Nullable Function1<? super Map<String, String>, Unit> function1) {
        this.parameterCallback = function1;
    }

    public final void setResultCallback(@Nullable Function1<? super OrderResponseData, Unit> function1) {
        this.resultCallback = function1;
    }
}
