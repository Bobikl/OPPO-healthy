package com.oplus.nearx.track.internal.storage.sp;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.heytap.health.watch.notification.impl.flashback.FlashbackProvider;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.k6k;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.nearx.track.internal.utils.Logger;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import io.protostuff.MapSchema;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 92\u00020\u0001:\u0002#&B\u001f\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u000b¢\u0006\u0004\b7\u00108J\u0012\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0011H\u0016J\u0011\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J&\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u001fH\u0002J\u0012\u0010\"\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0003H\u0002R\u0016\u0010%\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R'\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001f0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/sp/MultiProcessSharedPreferences;", "Landroid/content/SharedPreferences;", "", "", "getAll", "key", "defValue", "getString", "", "defValues", "getStringSet", "", "getInt", "", "getLong", "", "getFloat", "", "getBoolean", "contains", "Landroid/content/SharedPreferences$Editor;", "edit", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "listener", "", "registerOnSharedPreferenceChangeListener", "unregisterOnSharedPreferenceChangeListener", "Landroid/content/Context;", "context", b2n.f, "pathSegment", "", "i", "name", "j", "a", "Landroid/content/Context;", "mContext", "b", "Ljava/lang/String;", "mName", "c", "I", "mMode", "Ljava/util/WeakHashMap;", "d", "Lkotlin/Lazy;", b2n.g, "()Ljava/util/WeakHashMap;", "mListeners", "Landroid/content/BroadcastReceiver;", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/BroadcastReceiver;", "mReceiver", "mode", "<init>", "(Landroid/content/Context;Ljava/lang/String;I)V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class MultiProcessSharedPreferences implements SharedPreferences {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Object f = new Object();

    @Nullable
    public static String g;

    @Nullable
    public static Uri h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String mName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int mMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy mListeners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public BroadcastReceiver mReceiver;

    /* JADX INFO: renamed from: com.oplus.nearx.track.internal.storage.sp.MultiProcessSharedPreferences$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/sp/MultiProcessSharedPreferences$a;", "", "Landroid/content/Context;", "context", "", "name", "", "mode", "Landroid/content/SharedPreferences;", "b", "Landroid/net/Uri;", "AUTHORITY_URI", "Landroid/net/Uri;", "a", "()Landroid/net/Uri;", "setAUTHORITY_URI", "(Landroid/net/Uri;)V", "CONTENT", "Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Uri a() {
            return MultiProcessSharedPreferences.h;
        }

        @NotNull
        public final SharedPreferences b(@NotNull Context context, @NotNull String name, int mode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return new MultiProcessSharedPreferences(context, name, mode);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J \u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0001H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002R\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/sp/MultiProcessSharedPreferences$b;", "Landroid/content/SharedPreferences$Editor;", "", "key", "value", "putString", "", "values", "putStringSet", "", "putInt", "", "putLong", "", "putFloat", "", "putBoolean", EventType.STATE_PACKAGE_CHANGED_REMOVE, "clear", "", "apply", FlashbackProvider.PATH_COMMIT, "pathSegment", "a", "", "", "Ljava/util/Map;", "mModified", "b", "Z", "mClear", "<init>", "(Lcom/oplus/nearx/track/internal/storage/sp/MultiProcessSharedPreferences;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public final class b implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Object> mModified = new HashMap();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean mClear;

        public b() {
        }

        public final boolean a(String pathSegment) {
            Logger.b(k6k.e(), "MultiProcessSP", "setValue pathSegment=" + pathSegment, null, null, 12, null);
            MultiProcessSharedPreferences multiProcessSharedPreferences = MultiProcessSharedPreferences.this;
            boolean z = false;
            if (multiProcessSharedPreferences.g(multiProcessSharedPreferences.mContext)) {
                String[] strArr = {String.valueOf(MultiProcessSharedPreferences.this.mMode), String.valueOf(this.mClear)};
                MultiProcessSharedPreferences multiProcessSharedPreferences2 = MultiProcessSharedPreferences.this;
                synchronized (this) {
                    Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.withAppendedPath(MultiProcessSharedPreferences.INSTANCE.a(), multiProcessSharedPreferences2.mName), pathSegment);
                    Logger.b(k6k.e(), "MultiProcessSP", "setValue uri=" + uriWithAppendedPath, null, null, 12, null);
                    ContentValues contentValues = new ContentValues();
                    for (Map.Entry<String, Object> entry : this.mModified.entrySet()) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            String key = entry.getKey();
                            Object value2 = entry.getValue();
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.String");
                            contentValues.put(key, (String) value2);
                        } else if (value instanceof Integer) {
                            String key2 = entry.getKey();
                            Object value3 = entry.getValue();
                            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Int");
                            contentValues.put(key2, (Integer) value3);
                        } else if (value instanceof Long) {
                            String key3 = entry.getKey();
                            Object value4 = entry.getValue();
                            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Long");
                            contentValues.put(key3, (Long) value4);
                        } else if (value instanceof Float) {
                            String key4 = entry.getKey();
                            Object value5 = entry.getValue();
                            Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type kotlin.Float");
                            contentValues.put(key4, (Float) value5);
                        } else if (value instanceof Boolean) {
                            String key5 = entry.getKey();
                            Object value6 = entry.getValue();
                            Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type kotlin.Boolean");
                            contentValues.put(key5, (Boolean) value6);
                        } else if (value != null) {
                            contentValues.put(entry.getKey(), (Integer) null);
                        }
                    }
                    try {
                        if (multiProcessSharedPreferences2.mContext.getContentResolver().update(uriWithAppendedPath, contentValues, null, strArr) > 0) {
                            z = true;
                        }
                    } catch (IllegalArgumentException | RuntimeException unused) {
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            Logger.b(k6k.e(), "MultiProcessSP", "setValue.mName = " + MultiProcessSharedPreferences.this.mName + ", pathSegment = " + pathSegment + ", mModified.size() = " + this.mModified.size(), null, null, 12, null);
            Logger loggerE = k6k.e();
            StringBuilder sb = new StringBuilder();
            sb.append("setValue result=");
            sb.append(z);
            Logger.b(loggerE, "MultiProcessSP", sb.toString(), null, null, 12, null);
            return z;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a("apply");
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor clear() {
            synchronized (this) {
                this.mClear = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return a(FlashbackProvider.PATH_COMMIT);
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
            synchronized (this) {
            }
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

    public MultiProcessSharedPreferences(@NotNull Context context, @NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.mContext = context;
        this.mName = name;
        this.mMode = i;
        this.mListeners = LazyKt__LazyJVMKt.lazy(new Function0<WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object>>() { // from class: com.oplus.nearx.track.internal.storage.sp.MultiProcessSharedPreferences$mListeners$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> invoke() {
                return new WeakHashMap<>();
            }
        });
    }

    @Override // android.content.SharedPreferences
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objI = i("contains", key, Boolean.FALSE);
        Intrinsics.checkNotNull(objI, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objI).booleanValue();
    }

    @Override // android.content.SharedPreferences
    @NotNull
    public SharedPreferences.Editor edit() {
        return new b();
    }

    public final boolean g(Context context) {
        if (h == null) {
            synchronized (this) {
                if (h == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context != null ? context.getPackageName() : null);
                    sb.append(".Track.MultiProcessSharedPreferencesProvider");
                    g = sb.toString();
                    h = Uri.parse(NotificationApiService.CONTENT + g);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        Logger.b(k6k.e(), "MultiProcessSP", "AUTHORITY:" + g, null, null, 12, null);
        Logger.b(k6k.e(), "MultiProcessSP", "AUTHORITY_URI:" + h, null, null, 12, null);
        return h != null;
    }

    @Override // android.content.SharedPreferences
    @NotNull
    public Map<String, ?> getAll() {
        Object objI = i("getAll", null, null);
        Intrinsics.checkNotNull(objI, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, *>");
        return TypeIntrinsics.asMutableMap(objI);
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(@NotNull String key, boolean defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objI = i("getBoolean", key, Boolean.valueOf(defValue));
        Intrinsics.checkNotNull(objI, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objI).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(@NotNull String key, float defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objI = i("getFloat", key, Float.valueOf(defValue));
        Intrinsics.checkNotNull(objI, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objI).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(@NotNull String key, int defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objI = i("getInt", key, Integer.valueOf(defValue));
        Intrinsics.checkNotNull(objI, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objI).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(@NotNull String key, long defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objI = i("getLong", key, Long.valueOf(defValue));
        Intrinsics.checkNotNull(objI, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objI).longValue();
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(@Nullable String key, @Nullable String defValue) {
        Object objI = i("getString", key, defValue);
        if (objI instanceof String) {
            return (String) objI;
        }
        return null;
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(@NotNull String key, @Nullable Set<String> defValues) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> h() {
        return (WeakHashMap) this.mListeners.getValue();
    }

    public final Object i(String pathSegment, String key, Object defValue) {
        Cursor cursorQuery;
        Bundle extras;
        Logger.b(k6k.e(), "MultiProcessSP", "getValue pathSegment=" + pathSegment, null, null, 12, null);
        Object obj = null;
        if (g(this.mContext)) {
            Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.withAppendedPath(h, this.mName), pathSegment);
            Logger.b(k6k.e(), "MultiProcessSP", "getValue uri=" + uriWithAppendedPath, null, null, 12, null);
            String[] strArr = new String[3];
            strArr[0] = String.valueOf(this.mMode);
            strArr[1] = key;
            strArr[2] = defValue != null ? defValue.toString() : null;
            try {
                cursorQuery = this.mContext.getContentResolver().query(uriWithAppendedPath, null, null, strArr, null);
            } catch (SecurityException | RuntimeException unused) {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                try {
                    extras = cursorQuery.getExtras();
                } catch (RuntimeException unused2) {
                    extras = null;
                }
                if (extras != null) {
                    obj = extras.get("value");
                    extras.clear();
                }
                cursorQuery.close();
            }
        }
        Logger.b(k6k.e(), "MultiProcessSP", "getValue.mName = " + this.mName + ", pathSegment = " + pathSegment + ", key = " + key + ", defValue = " + defValue, null, null, 12, null);
        return obj == null ? defValue : obj;
    }

    public final String j(String name) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%1$s_%2$s", Arrays.copyOf(new Object[]{MultiProcessSharedPreferences.class.getName(), name}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(@NotNull SharedPreferences.OnSharedPreferenceChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this) {
            Object objI = i("registerOnSharedPreferenceChangeListener", null, Boolean.FALSE);
            Intrinsics.checkNotNull(objI, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) objI).booleanValue()) {
                h().put(listener, f);
                if (this.mReceiver == null) {
                    this.mReceiver = new BroadcastReceiver() { // from class: com.oplus.nearx.track.internal.storage.sp.MultiProcessSharedPreferences$registerOnSharedPreferenceChangeListener$1$1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(intent, "intent");
                            String stringExtra = intent.getStringExtra("name");
                            Serializable serializableExtra = intent.getSerializableExtra("value");
                            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list = (List) serializableExtra;
                            if (!Intrinsics.areEqual(this.a.mName, stringExtra)) {
                                return;
                            }
                            HashSet hashSet = new HashSet(this.a.h().keySet());
                            int size = list.size() - 1;
                            if (size < 0) {
                                return;
                            }
                            while (true) {
                                int i = size - 1;
                                String str = (String) list.get(size);
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    ((SharedPreferences.OnSharedPreferenceChangeListener) it.next()).onSharedPreferenceChanged(this.a, str);
                                }
                                if (i < 0) {
                                    return;
                                } else {
                                    size = i;
                                }
                            }
                        }
                    };
                    Logger loggerE = k6k.e();
                    StringBuilder sb = new StringBuilder();
                    sb.append("registerReceiver, SDK_INT=");
                    int i = Build.VERSION.SDK_INT;
                    sb.append(i);
                    Logger.b(loggerE, "MultiProcessSP", sb.toString(), null, null, 12, null);
                    if (i >= 33) {
                        this.mContext.registerReceiver(this.mReceiver, new IntentFilter(j(this.mName)), 2);
                    } else {
                        this.mContext.registerReceiver(this.mReceiver, new IntentFilter(j(this.mName)));
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(@NotNull SharedPreferences.OnSharedPreferenceChangeListener listener) {
        BroadcastReceiver broadcastReceiver;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this) {
            i("unregisterOnSharedPreferenceChangeListener", null, Boolean.FALSE);
            h().remove(listener);
            if (h().isEmpty() && (broadcastReceiver = this.mReceiver) != null) {
                this.mContext.unregisterReceiver(broadcastReceiver);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
