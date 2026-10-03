package com.oplus.aiunit.vision;

import android.content.SharedPreferences;
import com.heytap.health.watch.notification.impl.flashback.FlashbackProvider;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0012H\u0016J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016H\u0016J\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\u001e\u001a\u00060\u001bR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/cm6;", "Landroid/content/SharedPreferences;", "", "key", "", "contains", "defValue", "getBoolean", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "listener", "", "unregisterOnSharedPreferenceChangeListener", "", "getInt", "", "getAll", "Landroid/content/SharedPreferences$Editor;", "edit", "", "getLong", "", "getFloat", "", "defValues", "getStringSet", "registerOnSharedPreferenceChangeListener", "getString", "Lcom/oplus/aiunit/vision/cm6$a;", "a", "Lcom/oplus/aiunit/vision/cm6$a;", "emptyEditor", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class cm6 implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final a emptyEditor = new a();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J \u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0001H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/cm6$a;", "Landroid/content/SharedPreferences$Editor;", "", "key", "value", "putString", "", "values", "putStringSet", "", "putInt", "", "putLong", "", "putFloat", "", "putBoolean", EventType.STATE_PACKAGE_CHANGED_REMOVE, "clear", "", "apply", FlashbackProvider.PATH_COMMIT, "", "", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "mModified", "<init>", "(Lcom/oplus/aiunit/vision/cm6;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public final class a implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Object> mModified = new HashMap();

        public a() {
        }

        @NotNull
        public final Map<String, Object> a() {
            return this.mModified;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor clear() {
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return false;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putBoolean(@NotNull String key, boolean value) {
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (this) {
                this.mModified.put(key, Boolean.valueOf(value));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putFloat(@NotNull String key, float value) {
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (this) {
                this.mModified.put(key, Float.valueOf(value));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putInt(@NotNull String key, int value) {
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (this) {
                this.mModified.put(key, Integer.valueOf(value));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putLong(@NotNull String key, long value) {
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (this) {
                this.mModified.put(key, Long.valueOf(value));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putString(@NotNull String key, @Nullable String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (this) {
                this.mModified.put(key, value);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putStringSet(@NotNull String key, @Nullable Set<String> values) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor remove(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (this) {
                this.mModified.put(key, new Object());
            }
            return this;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(@Nullable String key) {
        return this.emptyEditor.a().containsKey(key);
    }

    @Override // android.content.SharedPreferences
    @NotNull
    public SharedPreferences.Editor edit() {
        return this.emptyEditor;
    }

    @Override // android.content.SharedPreferences
    @NotNull
    public Map<String, ?> getAll() {
        return this.emptyEditor.a();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(@Nullable String key, boolean defValue) {
        try {
            Object obj = this.emptyEditor.a().get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            return defValue;
        }
    }

    @Override // android.content.SharedPreferences
    public float getFloat(@Nullable String key, float defValue) {
        try {
            Object obj = this.emptyEditor.a().get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            return ((Float) obj).floatValue();
        } catch (Exception unused) {
            return defValue;
        }
    }

    @Override // android.content.SharedPreferences
    public int getInt(@Nullable String key, int defValue) {
        try {
            Object obj = this.emptyEditor.a().get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        } catch (Exception unused) {
            return defValue;
        }
    }

    @Override // android.content.SharedPreferences
    public long getLong(@Nullable String key, long defValue) {
        try {
            Object obj = this.emptyEditor.a().get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            return ((Long) obj).longValue();
        } catch (Exception unused) {
            return defValue;
        }
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(@Nullable String key, @Nullable String defValue) {
        try {
            Object obj = this.emptyEditor.a().get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        } catch (Exception unused) {
            return defValue;
        }
    }

    @Override // android.content.SharedPreferences
    @NotNull
    public Set<String> getStringSet(@Nullable String key, @Nullable Set<String> defValues) {
        return new LinkedHashSet();
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(@Nullable SharedPreferences.OnSharedPreferenceChangeListener listener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(@Nullable SharedPreferences.OnSharedPreferenceChangeListener listener) {
    }
}
