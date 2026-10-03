package com.oplus.aiunit.vision;

import com.heytap.speech.engine.HeytapSpeechEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\b\u0010\r\u001a\u00020\u0004H\u0002R\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/upe;", "", "Lcom/oplus/aiunit/vision/iv9;", "prefHook", "", "c", "(Lcom/oplus/aiunit/vision/iv9;)V", "", "key", "value", "d", "defaultValue", "b", "a", "TAG", "Ljava/lang/String;", "Lcom/oplus/aiunit/vision/iv9;", "instance", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class upe {

    @NotNull
    public static final upe INSTANCE = new upe();

    @NotNull
    public static final String TAG = "ConnectPrefUtil";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static iv9 instance;

    public final synchronized void a() {
        if (instance == null) {
            t7b.INSTANCE.b(TAG, "checkInit instance is null, use SharedPrefAdapter.");
            instance = new n1h(HeytapSpeechEngine.INSTANCE.getInstance().getContext());
        }
    }

    @NotNull
    public final String b(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        a();
        iv9 iv9Var = instance;
        Intrinsics.checkNotNull(iv9Var);
        return iv9Var.getString(key, defaultValue);
    }

    public final void c(@Nullable iv9 prefHook) {
        if (prefHook == null) {
            t7b.INSTANCE.k(TAG, "prefHook is null.");
        } else if (instance == null) {
            instance = prefHook;
        } else {
            t7b.INSTANCE.b(TAG, "ConnectPrefUtil has used default sp. ignore hook.");
        }
    }

    public final void d(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        a();
        iv9 iv9Var = instance;
        if (iv9Var == null) {
            return;
        }
        iv9Var.putString(key, value);
    }
}
