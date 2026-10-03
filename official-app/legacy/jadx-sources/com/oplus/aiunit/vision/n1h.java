package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/n1h;", "Lcom/oplus/aiunit/vision/iv9;", "", "key", "value", "", "putString", "defaultValue", "getString", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroid/content/SharedPreferences;", "b", "Landroid/content/SharedPreferences;", "mPreferences", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "c", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "sLock", "<init>", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class n1h implements iv9 {

    @NotNull
    public static final String SHARED_PREF_NAME = "com.heytap.speech.pref";

    @NotNull
    public static final String TAG = "SharedPrefAdapter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public SharedPreferences mPreferences;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantReadWriteLock sLock;

    public n1h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.sLock = new ReentrantReadWriteLock();
        try {
            this.mPreferences = this.context.getApplicationContext().getSharedPreferences("", 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                Context contextCreateDeviceProtectedStorageContext = this.context.createDeviceProtectedStorageContext();
                Intrinsics.checkNotNullExpressionValue(contextCreateDeviceProtectedStorageContext, "context.createDeviceProtectedStorageContext()");
                if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(this.context, SHARED_PREF_NAME)) {
                    t7b.INSTANCE.b(TAG, "success to migrate shared preferences.");
                    this.mPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences(SHARED_PREF_NAME, 0);
                } else {
                    t7b.INSTANCE.k(TAG, "Failed to migrate shared preferences.");
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.iv9
    @NotNull
    public String getString(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        try {
            this.sLock.readLock().lock();
            SharedPreferences sharedPreferences = this.mPreferences;
            if (sharedPreferences == null) {
                return defaultValue;
            }
            Intrinsics.checkNotNull(sharedPreferences);
            String string = sharedPreferences.getString(key, defaultValue);
            if (string != null) {
                defaultValue = string;
            }
            return defaultValue;
        } finally {
            this.sLock.readLock().unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.iv9
    public void putString(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            this.sLock.writeLock().lock();
            SharedPreferences sharedPreferences = this.mPreferences;
            if (sharedPreferences != null) {
                Intrinsics.checkNotNull(sharedPreferences);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(key, value);
                editorEdit.apply();
            }
        } finally {
            this.sLock.writeLock().unlock();
        }
    }
}
