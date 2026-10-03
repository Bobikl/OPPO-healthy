package com.oplus.pantanal.seedling.event;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.oplus.pantanal.seedling.bean.SeedlingCardEvent;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.convertor.ConvertorFactory;
import com.oplus.pantanal.seedling.convertor.JsonToBundleConvertor;
import com.oplus.pantanal.seedling.convertor.WidgetCodeToSeedlingCardConvertor;
import com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle;
import com.oplus.pantanal.seedling.lifecycle.SeedlingLifecycleEnum;
import com.oplus.pantanal.seedling.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000626\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\bH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0019"}, d2 = {"Lcom/oplus/pantanal/seedling/event/SeedlingLifecycleProcessor;", "Lcom/oplus/pantanal/seedling/event/BaseEventProcessor;", "()V", "dispatchLifecycle", "", "event", "Lcom/oplus/pantanal/seedling/bean/SeedlingCardEvent;", "call", "Lkotlin/Function2;", "Lcom/oplus/pantanal/seedling/lifecycle/SeedlingLifecycleEnum;", "Lkotlin/ParameterName;", "name", "lifecycleEnum", "Lcom/oplus/pantanal/seedling/lifecycle/ISeedlingCardLifecycle;", "lifecycle", "getSizeChangeParams", "", "", "jsonObject", "Lorg/json/JSONObject;", "getUpdateDataParams", "handleEvent", "context", "Landroid/content/Context;", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSeedlingLifecycleProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeedlingLifecycleProcessor.kt\ncom/oplus/pantanal/seedling/event/SeedlingLifecycleProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1549#2:141\n1620#2,3:142\n1855#2,2:145\n*S KotlinDebug\n*F\n+ 1 SeedlingLifecycleProcessor.kt\ncom/oplus/pantanal/seedling/event/SeedlingLifecycleProcessor\n*L\n101#1:141\n101#1:142,3\n132#1:145,2\n*E\n"})
public final class SeedlingLifecycleProcessor extends BaseEventProcessor {
    public static final int ACTION_LIFE_CIRCLE = 2;

    @NotNull
    public static final String KEY_BUSINESS_DATA = "business_data";

    @NotNull
    public static final String KEY_LIFE_CIRCLE = "life_circle";
    public static final int SIZE_CHANGE_PARAM_SIZE = 2;

    private final void dispatchLifecycle(SeedlingCardEvent event, Function2<? super SeedlingLifecycleEnum, ? super ISeedlingCardLifecycle, Unit> call) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Unit unit = null;
            if ((event.getAction() == 2 ? event : null) != null) {
                String strOptString = event.getParams().optString("life_circle");
                Logger.INSTANCE.i(Constants.TAG, event.getCard().getPrintKey$seedling_support_manualRelease(true) + " dispatchLifecycle=" + strOptString + ",host=" + event.getCard().getHost() + " instance=" + event.getCard().getServiceInstanceId());
                SeedlingLifecycleEnum.Companion companion2 = SeedlingLifecycleEnum.INSTANCE;
                Intrinsics.checkNotNull(strOptString);
                SeedlingLifecycleEnum seedlingLifecycleEnumByName = companion2.byName(strOptString);
                if (seedlingLifecycleEnumByName != null) {
                    Iterator<T> it = getMLifecycleList().iterator();
                    while (it.hasNext()) {
                        call.invoke(seedlingLifecycleEnumByName, (ISeedlingCardLifecycle) it.next());
                    }
                    unit = Unit.INSTANCE;
                }
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, " " + event.getCard().getPrintKey$seedling_support_manualRelease(true) + " dispatchLifecycle error:" + th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject getUpdateDataParams(JSONObject jsonObject) {
        Object obj;
        String strOptString;
        try {
            Result.Companion companion = Result.Companion;
            if (jsonObject.has(KEY_BUSINESS_DATA) && (strOptString = jsonObject.optString(KEY_BUSINESS_DATA)) != null && strOptString.length() != 0) {
                return new JSONObject(jsonObject.optString(KEY_BUSINESS_DATA));
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "getUpdateDataParams : " + th2.getMessage());
        }
        return new JSONObject();
    }

    @VisibleForTesting
    @NotNull
    public final List<Integer> getSizeChangeParams(@NotNull JSONObject jsonObject) {
        Object obj;
        String strOptString;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Logger.INSTANCE.i(Constants.TAG, "getSizeChangeParams. " + jsonObject);
        try {
            Result.Companion companion = Result.Companion;
            if (jsonObject.has(KEY_BUSINESS_DATA) && (strOptString = jsonObject.optString(KEY_BUSINESS_DATA)) != null && strOptString.length() != 0) {
                String strOptString2 = jsonObject.optString(KEY_BUSINESS_DATA);
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                List listSplit$default = StringsKt.split$default(strOptString2, new String[]{WidgetCodeToSeedlingCardConvertor.CARD_SPLIT}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                }
                return arrayList;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "getSizeChangeParams error: " + th2.getMessage());
        }
        return CollectionsKt.listOf(new Integer[]{-1, -1});
    }

    @Override // com.oplus.pantanal.seedling.event.ISeedlingEventProcessor
    public void handleEvent(@NotNull final Context context, @NotNull final SeedlingCardEvent event) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(event, "event");
        dispatchLifecycle(event, new Function2<SeedlingLifecycleEnum, ISeedlingCardLifecycle, Unit>() { // from class: com.oplus.pantanal.seedling.event.SeedlingLifecycleProcessor.handleEvent.1

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SeedlingLifecycleEnum.values().length];
                    try {
                        iArr[SeedlingLifecycleEnum.ON_CARD_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SeedlingLifecycleEnum.ON_SHOW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SeedlingLifecycleEnum.ON_HIDE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SeedlingLifecycleEnum.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[SeedlingLifecycleEnum.ON_UPDATE_DATA.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[SeedlingLifecycleEnum.ON_SUBSCRIBED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[SeedlingLifecycleEnum.ON_UNSUBSCRIBED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[SeedlingLifecycleEnum.ON_SIZE_CHANGED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[SeedlingLifecycleEnum.ON_HOST_CHANGED.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((SeedlingLifecycleEnum) obj, (ISeedlingCardLifecycle) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SeedlingLifecycleEnum seedlingLifecycleEnum, @NotNull ISeedlingCardLifecycle iSeedlingCardLifecycle) {
                Intrinsics.checkNotNullParameter(seedlingLifecycleEnum, "lifecycleEnum");
                Intrinsics.checkNotNullParameter(iSeedlingCardLifecycle, "lifecycle");
                switch (WhenMappings.$EnumSwitchMapping$0[seedlingLifecycleEnum.ordinal()]) {
                    case 1:
                        iSeedlingCardLifecycle.onCardCreate(context, event.getCard());
                        break;
                    case 2:
                        iSeedlingCardLifecycle.onShow(context, event.getCard());
                        break;
                    case 3:
                        iSeedlingCardLifecycle.onHide(context, event.getCard());
                        break;
                    case 4:
                        iSeedlingCardLifecycle.onDestroy(context, event.getCard());
                        break;
                    case 5:
                        iSeedlingCardLifecycle.onUpdateData(context, event.getCard(), (Bundle) ConvertorFactory.INSTANCE.get(JsonToBundleConvertor.class).to(this.getUpdateDataParams(event.getParams())));
                        break;
                    case 6:
                        iSeedlingCardLifecycle.onSubscribed(context, event.getCard());
                        break;
                    case 7:
                        iSeedlingCardLifecycle.onUnSubscribed(context, event.getCard());
                        break;
                    case 8:
                        List<Integer> sizeChangeParams = this.getSizeChangeParams(event.getParams());
                        if (sizeChangeParams.size() != 2) {
                            Logger.INSTANCE.d(Constants.TAG, "The number of parameters of onSizeChanged is wrong");
                        } else {
                            iSeedlingCardLifecycle.onSizeChanged(context, event.getCard(), sizeChangeParams.get(0).intValue(), sizeChangeParams.get(1).intValue());
                        }
                        break;
                    case 9:
                        iSeedlingCardLifecycle.onHostChange(context, event.getCard(), this.getUpdateDataParams(event.getParams()));
                        break;
                }
            }
        });
    }
}
