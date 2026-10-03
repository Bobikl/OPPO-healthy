package com.nearme.instant.xcard;

import android.content.Context;
import android.view.View;
import com.nearme.instant.xcard.statitics.StatFieldConfig;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.Map;
import org.hapjs.card.api.Card;
import org.hapjs.card.api.CardCallback;
import org.hapjs.card.api.CardLifecycleCallback;
import org.hapjs.card.api.CardMessageCallback;
import org.hapjs.card.api.PackageListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0085\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"card", "Lorg/hapjs/card/api/Card;", "context", "Landroid/content/Context;", "autoDestroy", "", "visible", "fold", "isChangeVisibilityManually", "refreshable", "loadingPageView", "Landroid/view/View;", "loadingPageStyleId", "", "errorPageView", "errorPageStyleId", BridgeConstant.KEY_EXTRAS, "", "", "", "statFieldConfig", "Lcom/nearme/instant/xcard/statitics/StatFieldConfig;", "blurInterface", "Lcom/nearme/instant/xcard/BlurInterface;", "scrollState", "cardCallback", "Lorg/hapjs/card/api/CardCallback;", "cardMessageCallback", "Lorg/hapjs/card/api/CardMessageCallback;", "cardLifecycleCallback", "Lorg/hapjs/card/api/CardLifecycleCallback;", "renderListener", "Lcom/nearme/instant/xcard/IRenderListener;", "renderListenerV1", "Lcom/nearme/instant/xcard/IRenderListenerV1;", "packageListener", "Lorg/hapjs/card/api/PackageListener;", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/view/View;Ljava/lang/Integer;Landroid/view/View;Ljava/lang/Integer;Ljava/util/Map;Lcom/nearme/instant/xcard/statitics/StatFieldConfig;Lcom/nearme/instant/xcard/BlurInterface;Ljava/lang/Integer;Lorg/hapjs/card/api/CardCallback;Lorg/hapjs/card/api/CardMessageCallback;Lorg/hapjs/card/api/CardLifecycleCallback;Lcom/nearme/instant/xcard/IRenderListener;Lcom/nearme/instant/xcard/IRenderListenerV1;Lorg/hapjs/card/api/PackageListener;)Lorg/hapjs/card/api/Card;", "card-sdk_liteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\ncom/nearme/instant/xcard/CardKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class CardKt {
    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048574, null);
    }

    public static /* synthetic */ Card card$default(Context context, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, View view, Integer num, View view2, Integer num2, Map map, StatFieldConfig statFieldConfig, BlurInterface blurInterface, Integer num3, CardCallback cardCallback, CardMessageCallback cardMessageCallback, CardLifecycleCallback cardLifecycleCallback, IRenderListener iRenderListener, IRenderListenerV1 iRenderListenerV1, PackageListener packageListener, int i, Object obj) {
        return card(context, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : view, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : view2, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : map, (i & 2048) != 0 ? null : statFieldConfig, (i & 4096) != 0 ? null : blurInterface, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : cardCallback, (i & 32768) != 0 ? null : cardMessageCallback, (i & 65536) != 0 ? null : cardLifecycleCallback, (i & 131072) != 0 ? null : iRenderListener, (i & 262144) != 0 ? null : iRenderListenerV1, (i & 524288) == 0 ? packageListener : null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048572, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048568, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048560, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048544, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048512, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048448, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, null, null, null, null, null, null, null, null, null, null, null, null, 1048320, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, null, null, null, null, null, null, null, null, null, null, null, 1048064, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, null, null, null, null, null, null, null, null, null, null, 1047552, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, map, null, null, null, null, null, null, null, null, null, 1046528, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map, @Nullable StatFieldConfig statFieldConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, map, statFieldConfig, null, null, null, null, null, null, null, null, 1044480, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map, @Nullable StatFieldConfig statFieldConfig, @Nullable BlurInterface blurInterface) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, map, statFieldConfig, blurInterface, null, null, null, null, null, null, null, 1040384, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map, @Nullable StatFieldConfig statFieldConfig, @Nullable BlurInterface blurInterface, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, map, statFieldConfig, blurInterface, num3, null, null, null, null, null, null, 1032192, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map, @Nullable StatFieldConfig statFieldConfig, @Nullable BlurInterface blurInterface, @Nullable Integer num3, @Nullable CardCallback cardCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, map, statFieldConfig, blurInterface, num3, cardCallback, null, null, null, null, null, 1015808, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map, @Nullable StatFieldConfig statFieldConfig, @Nullable BlurInterface blurInterface, @Nullable Integer num3, @Nullable CardCallback cardCallback, @Nullable CardMessageCallback cardMessageCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, map, statFieldConfig, blurInterface, num3, cardCallback, cardMessageCallback, null, null, null, null, 983040, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map, @Nullable StatFieldConfig statFieldConfig, @Nullable BlurInterface blurInterface, @Nullable Integer num3, @Nullable CardCallback cardCallback, @Nullable CardMessageCallback cardMessageCallback, @Nullable CardLifecycleCallback cardLifecycleCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, map, statFieldConfig, blurInterface, num3, cardCallback, cardMessageCallback, cardLifecycleCallback, null, null, null, 917504, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map, @Nullable StatFieldConfig statFieldConfig, @Nullable BlurInterface blurInterface, @Nullable Integer num3, @Nullable CardCallback cardCallback, @Nullable CardMessageCallback cardMessageCallback, @Nullable CardLifecycleCallback cardLifecycleCallback, @Nullable IRenderListener iRenderListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, map, statFieldConfig, blurInterface, num3, cardCallback, cardMessageCallback, cardLifecycleCallback, iRenderListener, null, null, 786432, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map, @Nullable StatFieldConfig statFieldConfig, @Nullable BlurInterface blurInterface, @Nullable Integer num3, @Nullable CardCallback cardCallback, @Nullable CardMessageCallback cardMessageCallback, @Nullable CardLifecycleCallback cardLifecycleCallback, @Nullable IRenderListener iRenderListener, @Nullable IRenderListenerV1 iRenderListenerV1) {
        Intrinsics.checkNotNullParameter(context, "context");
        return card$default(context, bool, bool2, bool3, bool4, bool5, view, num, view2, num2, map, statFieldConfig, blurInterface, num3, cardCallback, cardMessageCallback, cardLifecycleCallback, iRenderListener, iRenderListenerV1, null, 524288, null);
    }

    @JvmOverloads
    @NotNull
    public static final Card card(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable View view, @Nullable Integer num, @Nullable View view2, @Nullable Integer num2, @Nullable Map<String, ? extends Object> map, @Nullable StatFieldConfig statFieldConfig, @Nullable BlurInterface blurInterface, @Nullable Integer num3, @Nullable CardCallback cardCallback, @Nullable CardMessageCallback cardMessageCallback, @Nullable CardLifecycleCallback cardLifecycleCallback, @Nullable IRenderListener iRenderListener, @Nullable IRenderListenerV1 iRenderListenerV1, @Nullable PackageListener packageListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        CardBuilder cardBuilder = new CardBuilder(context);
        if (bool != null) {
            cardBuilder.setAutoDestroy(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            cardBuilder.setVisible(Boolean.valueOf(bool2.booleanValue()));
        }
        if (cardMessageCallback != null) {
            cardBuilder.setMessageCallback(cardMessageCallback);
        }
        if (bool3 != null) {
            cardBuilder.fold(Boolean.valueOf(bool3.booleanValue()));
        }
        if (cardLifecycleCallback != null) {
            cardBuilder.setLifecycleCallback(cardLifecycleCallback);
        }
        if (iRenderListener != null) {
            cardBuilder.setRenderListener(iRenderListener);
        }
        if (bool4 != null) {
            cardBuilder.changeVisibilityManually(Boolean.valueOf(bool4.booleanValue()));
        }
        if (packageListener != null) {
            cardBuilder.setPackageListener(packageListener);
        }
        if (bool5 != null) {
            cardBuilder.setRefreshable(Boolean.valueOf(bool5.booleanValue()));
        }
        if (view != null) {
            cardBuilder.setLoadingPlaceHolder(view);
        }
        if (num != null) {
            cardBuilder.setLoadingPlaceHolder(Integer.valueOf(num.intValue()));
        }
        if (view2 != null) {
            cardBuilder.setErrorPlaceHolder(view2);
        }
        if (num2 != null) {
            cardBuilder.setErrorPlaceHolder(num2.intValue());
        }
        if (statFieldConfig != null) {
            cardBuilder.setStatFieldConfig(statFieldConfig);
        }
        if (blurInterface != null) {
            cardBuilder.setBlurInterface(blurInterface);
        }
        if (num3 != null) {
            cardBuilder.setScrollState(Integer.valueOf(num3.intValue()));
        }
        if (cardCallback != null) {
            cardBuilder.setCardCallback(cardCallback);
        }
        if (map != null) {
            cardBuilder.setExtras(map);
        }
        if (iRenderListenerV1 != null) {
            cardBuilder.setRenderListenerV1(iRenderListenerV1);
        }
        return cardBuilder.build();
    }
}
