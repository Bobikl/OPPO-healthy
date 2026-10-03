package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/ucf;", "Lcom/oplus/aiunit/vision/ure;", "", "key", "", "value", "", "a", ExifInterface.GPS_DIRECTION_TRUE, ParserTag.TAG_GET, "(Ljava/lang/String;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "sharedPrefs", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "core"}, k = 1, mv = {1, 4, 0})
public final class ucf implements ure {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final SharedPreferences sharedPrefs;

    public ucf(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.sharedPrefs = context.getSharedPreferences("[com.afollestad.assent-prefs]", 0);
    }

    @Override // com.oplus.aiunit.vision.ure
    public void a(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Intrinsics.checkParameterIsNotNull(value, "value");
        SharedPreferences.Editor editorEdit = this.sharedPrefs.edit();
        if (value instanceof String) {
            editorEdit.putString(key, (String) value);
        } else if (value instanceof Boolean) {
            editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
        } else if (value instanceof Integer) {
            editorEdit.putInt(key, ((Number) value).intValue());
        } else if (value instanceof Long) {
            editorEdit.putLong(key, ((Number) value).longValue());
        } else {
            if (!(value instanceof Float)) {
                throw new IllegalStateException(("Cannot put value " + value + " in shared preferences.").toString());
            }
            editorEdit.putFloat(key, ((Number) value).floatValue());
        }
        editorEdit.apply();
    }

    @Override // com.oplus.aiunit.vision.ure
    @Nullable
    public <T> T get(@NotNull String key) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        Intrinsics.checkExpressionValueIsNotNull(sharedPrefs, "sharedPrefs");
        T t = (T) sharedPrefs.getAll().get(key);
        if (t instanceof Object) {
            return t;
        }
        return null;
    }
}
