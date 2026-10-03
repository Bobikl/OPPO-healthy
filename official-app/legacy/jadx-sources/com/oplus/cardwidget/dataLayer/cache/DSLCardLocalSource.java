package com.oplus.cardwidget.dataLayer.cache;

import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.k9m;
import com.oplus.cardwidget.interfaceLayer.DataConvertHelperKt;
import com.oplus.cardwidget.util.Logger;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/oplus/cardwidget/dataLayer/cache/DSLCardLocalSource;", "Lcom/oplus/aiunit/vision/k9m;", "", "cardId", "", "value", "", a8i.UPDATE, ParserTag.TAG_GET, "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "()V", "Companion", "a", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final class DSLCardLocalSource extends k9m {

    @NotNull
    private static final String TAG = "DSLCardLocalSource";

    @NotNull
    private SharedPreferences sharedPreferences;

    public DSLCardLocalSource() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(context)");
        this.sharedPreferences = defaultSharedPreferences;
    }

    @Override // com.oplus.aiunit.vision.k9m
    @Nullable
    public byte[] get(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Logger.INSTANCE.d(TAG, "get cardId: " + cardId);
        String string = this.sharedPreferences.getString(cardId, "");
        if (string != null) {
            return DataConvertHelperKt.convertToByteArray(string);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.k9m
    public void update(@NotNull String cardId, @Nullable byte[] value) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Logger.INSTANCE.d(TAG, "update cardId: " + cardId + " value size is: " + (value != null ? Integer.valueOf(value.length) : null));
        if (value != null) {
            this.sharedPreferences.edit().putString(cardId, DataConvertHelperKt.convertToString(value)).apply();
        }
    }
}
