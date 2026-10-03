package com.oplusos.vfxmodelviewer.view;

import com.oplus.aiunit.vision.vr3;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\tH&J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u000bH&J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\rH&J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\tH&J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH&J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H&¨\u0006\u0016"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/BasePrefs;", "", "()V", "getBoolean", "", Node.I_KEY, "", "defaultValue", "getFloat", "", "getInt", "", "getLong", "", "getString", "setBoolean", "", "value", "setFloat", "setInt", "setLong", "setString", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BasePrefs {
    public static /* synthetic */ boolean getBoolean$default(BasePrefs basePrefs, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return basePrefs.getBoolean(str, z);
    }

    public static /* synthetic */ float getFloat$default(BasePrefs basePrefs, String str, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloat");
        }
        if ((i & 2) != 0) {
            f = vr3.UNSET;
        }
        return basePrefs.getFloat(str, f);
    }

    public static /* synthetic */ int getInt$default(BasePrefs basePrefs, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return basePrefs.getInt(str, i);
    }

    public static /* synthetic */ long getLong$default(BasePrefs basePrefs, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        return basePrefs.getLong(str, j);
    }

    public static /* synthetic */ String getString$default(BasePrefs basePrefs, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return basePrefs.getString(str, str2);
    }

    public abstract boolean getBoolean(@NotNull String key, boolean defaultValue);

    public abstract float getFloat(@NotNull String key, float defaultValue);

    public abstract int getInt(@NotNull String key, int defaultValue);

    public abstract long getLong(@NotNull String key, long defaultValue);

    @Nullable
    public abstract String getString(@NotNull String key, @Nullable String defaultValue);

    public abstract void setBoolean(@NotNull String key, boolean value);

    public abstract void setFloat(@NotNull String key, float value);

    public abstract void setInt(@NotNull String key, int value);

    public abstract void setLong(@NotNull String key, long value);

    public abstract void setString(@NotNull String key, @NotNull String value);
}
