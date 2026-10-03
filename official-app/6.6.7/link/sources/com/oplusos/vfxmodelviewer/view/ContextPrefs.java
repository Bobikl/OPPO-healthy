package com.oplusos.vfxmodelviewer.view;

import android.content.Context;
import android.content.SharedPreferences;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0005J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ContextPrefs;", "Lcom/oplusos/vfxmodelviewer/view/BasePrefs;", "context", "Landroid/content/Context;", "prefsName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "mPreference", "Landroid/content/SharedPreferences;", "mPrefsName", "getBoolean", "", Node.I_KEY, "defaultValue", "getFloat", "", "getInt", "", "getLong", "", "getName", "getString", "setBoolean", "", "value", "setFloat", "setInt", "setLong", "setString", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ContextPrefs extends BasePrefs {

    @NotNull
    private SharedPreferences mPreference;

    @NotNull
    private String mPrefsName;

    public ContextPrefs(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "prefsName");
        this.mPrefsName = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(mPrefsName,0)");
        this.mPreference = sharedPreferences;
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    public boolean getBoolean(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        return this.mPreference.getBoolean(key, defaultValue);
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    public float getFloat(@NotNull String key, float defaultValue) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        return this.mPreference.getFloat(key, defaultValue);
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    public int getInt(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        return this.mPreference.getInt(key, defaultValue);
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    public long getLong(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        return this.mPreference.getLong(key, defaultValue);
    }

    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getMPrefsName() {
        return this.mPrefsName;
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    @Nullable
    public String getString(@NotNull String key, @Nullable String defaultValue) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        return this.mPreference.getString(key, defaultValue);
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    public void setBoolean(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        this.mPreference.edit().putBoolean(key, value).apply();
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    public void setFloat(@NotNull String key, float value) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        this.mPreference.edit().putFloat(key, value).apply();
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    public void setInt(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        this.mPreference.edit().putInt(key, value).apply();
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    public void setLong(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        this.mPreference.edit().putLong(key, value).apply();
    }

    @Override // com.oplusos.vfxmodelviewer.view.BasePrefs
    public void setString(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        Intrinsics.checkNotNullParameter(value, "value");
        this.mPreference.edit().putString(key, value).apply();
    }
}
