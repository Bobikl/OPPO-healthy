package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.nearx.track.internal.storage.sp.MultiProcessSharedPreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\tH\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/dxe;", "Lcom/oplus/aiunit/vision/tx9;", "", "key", "value", "", "d", "", "b", "", "a", "def", "getString", "", "getInt", "getLong", "getBoolean", "c", "Lcom/oplus/nearx/track/internal/storage/sp/MultiProcessSharedPreferences;", "Lcom/oplus/nearx/track/internal/storage/sp/MultiProcessSharedPreferences;", "sharedPreference", "Landroid/content/SharedPreferences$Editor;", "Landroid/content/SharedPreferences$Editor;", "editor", "Landroid/content/Context;", "context", LogSenderConst.FILENAME, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class dxe implements tx9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MultiProcessSharedPreferences sharedPreference;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences.Editor editor;

    public dxe(@NotNull Context context, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        SharedPreferences sharedPreferencesB = MultiProcessSharedPreferences.INSTANCE.b(context, fileName, 0);
        Intrinsics.checkNotNull(sharedPreferencesB, "null cannot be cast to non-null type com.oplus.nearx.track.internal.storage.sp.MultiProcessSharedPreferences");
        MultiProcessSharedPreferences multiProcessSharedPreferences = (MultiProcessSharedPreferences) sharedPreferencesB;
        this.sharedPreference = multiProcessSharedPreferences;
        this.editor = multiProcessSharedPreferences.edit();
    }

    @Override // com.oplus.aiunit.vision.tx9
    public void a(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.editor.putBoolean(key, value).apply();
    }

    @Override // com.oplus.aiunit.vision.tx9
    public void b(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.editor.putLong(key, value).apply();
    }

    @Override // com.oplus.aiunit.vision.tx9
    public void c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.editor.remove(key);
        this.editor.apply();
    }

    @Override // com.oplus.aiunit.vision.tx9
    public void d(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.editor.putString(key, value).apply();
    }

    @Override // com.oplus.aiunit.vision.tx9
    public boolean getBoolean(@NotNull String key, boolean def) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreference.getBoolean(key, def);
    }

    @Override // com.oplus.aiunit.vision.tx9
    public int getInt(@NotNull String key, int def) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreference.getInt(key, def);
    }

    @Override // com.oplus.aiunit.vision.tx9
    public long getLong(@NotNull String key, long def) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreference.getLong(key, def);
    }

    @Override // com.oplus.aiunit.vision.tx9
    @Nullable
    public String getString(@NotNull String key, @Nullable String def) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreference.getString(key, def);
    }
}
