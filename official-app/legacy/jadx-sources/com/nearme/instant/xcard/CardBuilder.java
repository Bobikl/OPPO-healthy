package com.nearme.instant.xcard;

import android.content.Context;
import android.view.View;
import com.nearme.instant.xcard.statitics.StatFieldConfig;
import com.oplus.aiunit.vision.jla;
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
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010'\u001a\u00020(J\u0015\u0010)\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010+J\u0015\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020\u0003J\u0015\u0010-\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010+J\u0010\u0010.\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u00100\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0014J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u00102\u001a\u00020\u00002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016J\u0010\u00103\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\rJ\u0010\u00105\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0014J\u0015\u00105\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u000fJ\u0010\u00109\u001a\u00020\u00002\b\u0010:\u001a\u0004\u0018\u00010\u001dJ\u0015\u0010;\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010+J\u0010\u0010<\u001a\u00020\u00002\b\u0010:\u001a\u0004\u0018\u00010 J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"J\u0015\u0010>\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u00107J\u0010\u0010?\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%J\u0015\u0010@\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010+R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006A"}, d2 = {"Lcom/nearme/instant/xcard/CardBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "autoDestroy", "", "Ljava/lang/Boolean;", "blurInterface", "Lcom/nearme/instant/xcard/BlurInterface;", "cardCallback", "Lorg/hapjs/card/api/CardCallback;", "cardLifecycleCallback", "Lorg/hapjs/card/api/CardLifecycleCallback;", "cardMessageCallback", "Lorg/hapjs/card/api/CardMessageCallback;", "errorPageStyle", "", "Ljava/lang/Integer;", "errorPageView", "Landroid/view/View;", BridgeConstant.KEY_EXTRAS, "", "", "fold", "isChangeVisibilityManually", "loadingPageStyle", "loadingPageView", "packageListener", "Lorg/hapjs/card/api/PackageListener;", "refreshable", "renderListener", "Lcom/nearme/instant/xcard/IRenderListener;", "renderListenerV1", "Lcom/nearme/instant/xcard/IRenderListenerV1;", "scrollState", "statFieldConfig", "Lcom/nearme/instant/xcard/statitics/StatFieldConfig;", "visible", jla.DEFAULT_BUILD_METHOD, "Lorg/hapjs/card/api/Card;", "changeVisibilityManually", "enable", "(Ljava/lang/Boolean;)Lcom/nearme/instant/xcard/CardBuilder;", "getContext", "setAutoDestroy", "setBlurInterface", "setCardCallback", "setErrorPlaceHolder", "view", "setExtras", "setLifecycleCallback", "callback", "setLoadingPlaceHolder", "loadPageStyle", "(Ljava/lang/Integer;)Lcom/nearme/instant/xcard/CardBuilder;", "setMessageCallback", "setPackageListener", "listener", "setRefreshable", "setRenderListener", "setRenderListenerV1", "setScrollState", "setStatFieldConfig", "setVisible", "card-sdk_liteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardBuilder.kt\ncom/nearme/instant/xcard/CardBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
public final class CardBuilder {

    @Nullable
    private Boolean autoDestroy;

    @Nullable
    private BlurInterface blurInterface;

    @Nullable
    private CardCallback cardCallback;

    @Nullable
    private CardLifecycleCallback cardLifecycleCallback;

    @Nullable
    private CardMessageCallback cardMessageCallback;

    @NotNull
    private Context context;

    @Nullable
    private Integer errorPageStyle;

    @Nullable
    private View errorPageView;

    @Nullable
    private Map<String, ? extends Object> extras;

    @Nullable
    private Boolean fold;

    @Nullable
    private Boolean isChangeVisibilityManually;

    @Nullable
    private Integer loadingPageStyle;

    @Nullable
    private View loadingPageView;

    @Nullable
    private PackageListener packageListener;

    @Nullable
    private Boolean refreshable;

    @Nullable
    private IRenderListener renderListener;

    @Nullable
    private IRenderListenerV1 renderListenerV1;

    @Nullable
    private Integer scrollState;

    @Nullable
    private StatFieldConfig statFieldConfig;

    @Nullable
    private Boolean visible;

    public CardBuilder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final Card build() {
        Card cardCreateCard = CardClient.getInstance().createCard(this.context);
        if (cardCreateCard != null) {
            Boolean bool = this.autoDestroy;
            if (bool != null) {
                cardCreateCard.setAutoDestroy(bool.booleanValue());
            }
            Boolean bool2 = this.visible;
            if (bool2 != null) {
                cardCreateCard.setVisible(bool2.booleanValue());
            }
            CardMessageCallback cardMessageCallback = this.cardMessageCallback;
            if (cardMessageCallback != null) {
                cardCreateCard.setMessageCallback(cardMessageCallback);
            }
            Boolean bool3 = this.fold;
            if (bool3 != null) {
                cardCreateCard.fold(bool3.booleanValue());
            }
            CardLifecycleCallback cardLifecycleCallback = this.cardLifecycleCallback;
            if (cardLifecycleCallback != null) {
                cardCreateCard.setLifecycleCallback(cardLifecycleCallback);
            }
            IRenderListener iRenderListener = this.renderListener;
            if (iRenderListener != null) {
                cardCreateCard.setRenderListener(iRenderListener);
            }
            Boolean bool4 = this.isChangeVisibilityManually;
            if (bool4 != null) {
                cardCreateCard.changeVisibilityManually(bool4.booleanValue());
            }
            PackageListener packageListener = this.packageListener;
            if (packageListener != null) {
                cardCreateCard.setPackageListener(packageListener);
            }
            Boolean bool5 = this.refreshable;
            if (bool5 != null) {
                cardCreateCard.setRefreshable(bool5.booleanValue());
            }
            Integer num = this.loadingPageStyle;
            if (num != null) {
                cardCreateCard.setLoadingPlaceHolder(num.intValue());
            }
            View view = this.loadingPageView;
            if (view != null) {
                cardCreateCard.setLoadingPlaceHolder(view);
            }
            View view2 = this.errorPageView;
            if (view2 != null) {
                cardCreateCard.setErrorPlaceHolder(view2);
            }
            Integer num2 = this.errorPageStyle;
            if (num2 != null) {
                cardCreateCard.setErrorPlaceHolder(num2.intValue());
            }
            Map<String, ? extends Object> map = this.extras;
            if (map != null) {
                cardCreateCard.setExtras(map);
            }
            StatFieldConfig statFieldConfig = this.statFieldConfig;
            if (statFieldConfig != null) {
                cardCreateCard.setStatFieldConfig(statFieldConfig);
            }
            BlurInterface blurInterface = this.blurInterface;
            if (blurInterface != null) {
                cardCreateCard.setCardBlurHandler(blurInterface);
            }
            Integer num3 = this.scrollState;
            if (num3 != null) {
                cardCreateCard.setScrollState(num3.intValue());
            }
            CardCallback cardCallback = this.cardCallback;
            if (cardCallback != null) {
                cardCreateCard.registerMessageCallback(cardCallback);
            }
            IRenderListenerV1 iRenderListenerV1 = this.renderListenerV1;
            if (iRenderListenerV1 != null) {
                cardCreateCard.setRenderListenerV1(iRenderListenerV1);
            }
        }
        Intrinsics.checkNotNull(cardCreateCard);
        return cardCreateCard;
    }

    @NotNull
    public final CardBuilder changeVisibilityManually(@Nullable Boolean enable) {
        this.isChangeVisibilityManually = enable;
        return this;
    }

    @NotNull
    public final CardBuilder fold(@Nullable Boolean fold) {
        this.fold = fold;
        return this;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final CardBuilder setAutoDestroy(@Nullable Boolean autoDestroy) {
        this.autoDestroy = autoDestroy;
        return this;
    }

    @NotNull
    public final CardBuilder setBlurInterface(@Nullable BlurInterface blurInterface) {
        this.blurInterface = blurInterface;
        return this;
    }

    @NotNull
    public final CardBuilder setCardCallback(@Nullable CardCallback cardCallback) {
        this.cardCallback = cardCallback;
        return this;
    }

    @NotNull
    public final CardBuilder setErrorPlaceHolder(@Nullable View view) {
        this.errorPageView = view;
        return this;
    }

    @NotNull
    public final CardBuilder setExtras(@Nullable Map<String, ? extends Object> extras) {
        this.extras = extras;
        return this;
    }

    @NotNull
    public final CardBuilder setLifecycleCallback(@Nullable CardLifecycleCallback callback) {
        this.cardLifecycleCallback = callback;
        return this;
    }

    @NotNull
    public final CardBuilder setLoadingPlaceHolder(@Nullable View view) {
        this.loadingPageView = view;
        return this;
    }

    @NotNull
    public final CardBuilder setMessageCallback(@Nullable CardMessageCallback callback) {
        this.cardMessageCallback = callback;
        return this;
    }

    @NotNull
    public final CardBuilder setPackageListener(@Nullable PackageListener listener) {
        this.packageListener = listener;
        return this;
    }

    @NotNull
    public final CardBuilder setRefreshable(@Nullable Boolean refreshable) {
        this.refreshable = refreshable;
        return this;
    }

    @NotNull
    public final CardBuilder setRenderListener(@Nullable IRenderListener listener) {
        this.renderListener = listener;
        return this;
    }

    @NotNull
    public final CardBuilder setRenderListenerV1(@NotNull IRenderListenerV1 renderListenerV1) {
        Intrinsics.checkNotNullParameter(renderListenerV1, "renderListenerV1");
        this.renderListenerV1 = renderListenerV1;
        return this;
    }

    @NotNull
    public final CardBuilder setScrollState(@Nullable Integer scrollState) {
        this.scrollState = scrollState;
        return this;
    }

    @NotNull
    public final CardBuilder setStatFieldConfig(@Nullable StatFieldConfig statFieldConfig) {
        this.statFieldConfig = statFieldConfig;
        return this;
    }

    @NotNull
    public final CardBuilder setVisible(@Nullable Boolean visible) {
        this.visible = visible;
        return this;
    }

    @NotNull
    public final CardBuilder setErrorPlaceHolder(int errorPageStyle) {
        this.errorPageStyle = Integer.valueOf(errorPageStyle);
        return this;
    }

    @NotNull
    public final CardBuilder setLoadingPlaceHolder(@Nullable Integer loadPageStyle) {
        this.loadingPageStyle = loadPageStyle;
        return this;
    }
}
