package com.heytap.nearx.tangramconfig.datasource;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005J\u0016\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\bJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u0004\u0018\u00010\rJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\b!J\u0016\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\bJ\u0016\u0010$\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001eJ\u000e\u0010%\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0005R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Lcom/heytap/nearx/tangramconfig/datasource/DirConfigSp;", "", "context", "Landroid/content/Context;", "spkey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "isKv", "", "()Z", "setKv", "(Z)V", "sharedPreferenceDir", "Ljava/io/File;", "getSharedPreferenceDir", "()Ljava/io/File;", "sharedPreferenceDir$delegate", "Lkotlin/Lazy;", "spConfig", "Landroid/content/SharedPreferences;", "getSpConfig", "()Landroid/content/SharedPreferences;", "spConfig$delegate", "clearSharePreferenceCache", "", "name", "getBoolean", "key", "defaultValue", "getInt", "", "getSpDir", "isSupportMMKV", "isSupportMMKV$com_heytap_nearx_tangramconfig", "putBoolean", "value", "putInt", EventType.STATE_PACKAGE_CHANGED_REMOVE, BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DirConfigSp {
    private boolean isKv;

    /* JADX INFO: renamed from: sharedPreferenceDir$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sharedPreferenceDir;

    /* JADX INFO: renamed from: spConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy spConfig;

    public DirConfigSp(@NotNull final Context context, @NotNull final String spkey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(spkey, "spkey");
        this.spConfig = LazyKt__LazyJVMKt.lazy(new Function0<SharedPreferences>() { // from class: com.heytap.nearx.tangramconfig.datasource.DirConfigSp$spConfig$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return context.getSharedPreferences(spkey, 0);
            }
        });
        this.isKv = false;
        this.sharedPreferenceDir = LazyKt__LazyJVMKt.lazy(new Function0<File>() { // from class: com.heytap.nearx.tangramconfig.datasource.DirConfigSp$sharedPreferenceDir$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            private static final boolean invoke$lambda$0(File file) {
                return file.isDirectory() && Intrinsics.areEqual(file.getName(), DirConfig.SHARED_PREF);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final File invoke() {
                if (!this.this$0.getIsKv()) {
                    return new File(context.getDataDir(), DirConfig.SHARED_PREF);
                }
                return new File(context.getDataDir().getPath() + File.separator + "files", DirConfig.MMKV_PREF);
            }
        });
    }

    private final File getSharedPreferenceDir() {
        return (File) this.sharedPreferenceDir.getValue();
    }

    private final SharedPreferences getSpConfig() {
        Object value = this.spConfig.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-spConfig>(...)");
        return (SharedPreferences) value;
    }

    public final void clearSharePreferenceCache(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.isKv) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(name, 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public final boolean getBoolean(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.isKv) {
            return false;
        }
        return getSpConfig().getBoolean(key, defaultValue);
    }

    public final int getInt(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.isKv) {
            return 0;
        }
        return getSpConfig().getInt(key, defaultValue);
    }

    @Nullable
    public final File getSpDir() {
        return getSharedPreferenceDir();
    }

    /* JADX INFO: renamed from: isKv, reason: from getter */
    public final boolean getIsKv() {
        return this.isKv;
    }

    public final boolean isSupportMMKV$com_heytap_nearx_tangramconfig(@NotNull String spkey) {
        Intrinsics.checkNotNullParameter(spkey, "spkey");
        return true;
    }

    public final void putBoolean(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.isKv) {
            return;
        }
        getSpConfig().edit().putBoolean(key, value).apply();
    }

    public final void putInt(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.isKv) {
            return;
        }
        getSpConfig().edit().putInt(key, value).apply();
    }

    public final void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.isKv) {
            return;
        }
        getSpConfig().edit().remove(key).apply();
    }

    public final void setKv(boolean z) {
        this.isKv = z;
    }
}
