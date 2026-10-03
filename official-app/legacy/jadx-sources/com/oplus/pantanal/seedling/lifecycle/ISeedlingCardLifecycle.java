package com.oplus.pantanal.seedling.lifecycle;

import android.content.Context;
import android.os.Bundle;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.util.Logger;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0015H&¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/lifecycle/ISeedlingCardLifecycle;", "", "onCardCreate", "", "context", "Landroid/content/Context;", "card", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "onDestroy", "onHide", "onHostChange", "data", "Lorg/json/JSONObject;", "onShow", "onSizeChanged", "oldSize", "", "newSize", "onSubscribed", "onUnSubscribed", "onUpdateData", "Landroid/os/Bundle;", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ISeedlingCardLifecycle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/oplus/pantanal/seedling/lifecycle/ISeedlingCardLifecycle$Companion;", "", "()V", "TAG", "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String TAG = "ISeedlingCardLifecycle";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onHostChange(@NotNull ISeedlingCardLifecycle iSeedlingCardLifecycle, @NotNull Context context, @NotNull SeedlingCard card, @NotNull JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(data, "data");
            ISeedlingCardLifecycle.super.onHostChange(context, card, data);
        }

        @Deprecated
        public static void onSizeChanged(@NotNull ISeedlingCardLifecycle iSeedlingCardLifecycle, @NotNull Context context, @NotNull SeedlingCard card, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(card, "card");
            ISeedlingCardLifecycle.super.onSizeChanged(context, card, i, i2);
        }
    }

    void onCardCreate(@NotNull Context context, @NotNull SeedlingCard card);

    void onDestroy(@NotNull Context context, @NotNull SeedlingCard card);

    void onHide(@NotNull Context context, @NotNull SeedlingCard card);

    default void onHostChange(@NotNull Context context, @NotNull SeedlingCard card, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.INSTANCE.d("ISeedlingCardLifecycle", "onHostChange card:" + card);
    }

    void onShow(@NotNull Context context, @NotNull SeedlingCard card);

    default void onSizeChanged(@NotNull Context context, @NotNull SeedlingCard card, int oldSize, int newSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Logger.INSTANCE.d("ISeedlingCardLifecycle", "onSizeChanged oldSize:" + oldSize + ", newSize:" + newSize + ".");
    }

    void onSubscribed(@NotNull Context context, @NotNull SeedlingCard card);

    void onUnSubscribed(@NotNull Context context, @NotNull SeedlingCard card);

    void onUpdateData(@NotNull Context context, @NotNull SeedlingCard card, @NotNull Bundle data);
}
