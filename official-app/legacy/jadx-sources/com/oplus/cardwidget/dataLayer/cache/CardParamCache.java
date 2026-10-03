package com.oplus.cardwidget.dataLayer.cache;

import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.igm;
import com.oplus.cardwidget.util.Logger;
import com.oplus.smartenginehelper.ParserTag;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/oplus/cardwidget/dataLayer/cache/CardParamCache;", "Lcom/oplus/aiunit/vision/igm;", "", "key", "value", "", a8i.UPDATE, ParserTag.TAG_GET, "", "layoutParams", "Ljava/util/Map;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "()V", "Companion", "a", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final class CardParamCache extends igm {

    @NotNull
    private static final String TAG = "CardParamCache";

    @NotNull
    private final Map<String, String> layoutParams = new LinkedHashMap();

    @NotNull
    private SharedPreferences sharedPreferences;

    public CardParamCache() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(context)");
        this.sharedPreferences = defaultSharedPreferences;
    }

    @Override // com.oplus.aiunit.vision.igm
    @Nullable
    public String get(@NotNull String key) {
        String string;
        Intrinsics.checkNotNullParameter(key, "key");
        Logger.INSTANCE.d(TAG, "get card param key: " + key + " ");
        synchronized (this.layoutParams) {
            string = this.layoutParams.get(key);
            if (string == null) {
                string = this.sharedPreferences.getString(key, null);
                if (string != null) {
                    this.layoutParams.put(key, string);
                } else {
                    string = null;
                }
            }
        }
        return string;
    }

    @Override // com.oplus.aiunit.vision.igm
    public boolean update(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Logger.INSTANCE.d(TAG, "update key: " + key + " value size is null : " + (value == null));
        synchronized (this.layoutParams) {
            this.layoutParams.put(key, value);
            this.sharedPreferences.edit().putString(key, value).apply();
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }
}
