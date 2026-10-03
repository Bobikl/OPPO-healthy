package com.oplus.smartsdk.themecard;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import com.oplus.aiunit.vision.oea;
import com.oplus.smartsdk.ISmartViewApi;
import com.oplus.smartsdk.SmartApiInfo;
import com.oplus.smartsdk.SmartEngineManager;
import com.oplus.smartsdk.themecard.CardApiManager;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/oplus/smartsdk/themecard/CardApiManager;", "", "()V", "smartCardApiLoader", "Lcom/oplus/smartsdk/themecard/ApiLoader;", "themeCardApiLoader", "isThemeCard", "", "smartApiInfo", "Lcom/oplus/smartsdk/SmartApiInfo;", "loadCardApi", "", "hostContext", "Landroid/content/Context;", "callback", "Lcom/oplus/smartsdk/themecard/CardApiManager$Callback;", "updateDisplayContext", "cardContext", "Callback", "Companion", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CardApiManager {

    @NotNull
    public static final String TAG = "CardApiManager";

    @NotNull
    private final ApiLoader smartCardApiLoader = new SmartApiLoader();

    @NotNull
    private final ApiLoader themeCardApiLoader = new ThemeCardApiLoader();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/oplus/smartsdk/themecard/CardApiManager$Callback;", "", "onError", "", MapSchema.FIELD_NAME_ENTRY, "", "onLoad", oea.FEATURE_API_REQUEST, "Lcom/oplus/smartsdk/ISmartViewApi;", "cardContext", "Landroid/content/Context;", "isThemeCard", "", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void onError(@NotNull Throwable e2);

        void onLoad(@NotNull ISmartViewApi api, @NotNull Context cardContext, boolean isThemeCard);
    }

    private final boolean isThemeCard(SmartApiInfo smartApiInfo) {
        Bundle extras = smartApiInfo.getExtras();
        if (extras != null && extras.containsKey(Tags.CARD_ID) && extras.containsKey(Tags.CARD_ENTRY) && extras.containsKey("card_size") && extras.containsKey(Tags.CARD_URI)) {
            return true;
        }
        JSONObject jSONObject = new JSONObject(new String(smartApiInfo.getData(), Charsets.UTF_8));
        return jSONObject.has(Tags.CARD_ID) && jSONObject.has(Tags.CARD_ENTRY) && jSONObject.has("card_size") && jSONObject.has(Tags.CARD_URI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadCardApi$lambda-0, reason: not valid java name */
    public static final void m5209loadCardApi$lambda0(Context hostContext, CardApiManager this$0, SmartApiInfo smartApiInfo, Callback callback) {
        Intrinsics.checkNotNullParameter(hostContext, "$hostContext");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(smartApiInfo, "$smartApiInfo");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        try {
            boolean zIsSupportThemeCard = ThemeCardApiLoader.INSTANCE.isSupportThemeCard(hostContext);
            boolean zIsThemeCard = this$0.isThemeCard(smartApiInfo);
            Log.d(TAG, "loadCardApi isSupportedThemeCard=" + zIsSupportThemeCard + " isThemeCardInfo=" + zIsThemeCard);
            boolean z = zIsSupportThemeCard && zIsThemeCard;
            Pair<ISmartViewApi, Context> pairLoadApi = z ? this$0.themeCardApiLoader.loadApi(hostContext) : this$0.smartCardApiLoader.loadApi(hostContext);
            Context second = pairLoadApi.getSecond();
            if (!Intrinsics.areEqual(second, hostContext) && second.getResources().getConfiguration().densityDpi != hostContext.getResources().getConfiguration().densityDpi) {
                this$0.updateDisplayContext(second, hostContext);
            }
            callback.onLoad(pairLoadApi.getFirst(), second, z);
        } catch (Throwable th) {
            Log.e(TAG, Intrinsics.stringPlus("loadCardApi failed! e=", th.getMessage()));
            callback.onError(th);
        }
    }

    private final void updateDisplayContext(Context cardContext, Context hostContext) {
        Configuration configuration = cardContext.getResources().getConfiguration();
        configuration.densityDpi = hostContext.getResources().getConfiguration().densityDpi;
        cardContext.getResources().updateConfiguration(configuration, cardContext.getResources().getDisplayMetrics());
    }

    public final void loadCardApi(@NotNull final Context hostContext, @NotNull final SmartApiInfo smartApiInfo, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(hostContext, "hostContext");
        Intrinsics.checkNotNullParameter(smartApiInfo, "smartApiInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        SmartEngineManager.SINGLE_THREAD_POOL.execute(new Runnable() { // from class: com.oplus.aiunit.vision.az2
            @Override // java.lang.Runnable
            public final void run() {
                CardApiManager.m5209loadCardApi$lambda0(hostContext, this, smartApiInfo, callback);
            }
        });
    }
}
