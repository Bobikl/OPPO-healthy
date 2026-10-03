package p010kotlin.reflect.jvm.internal.impl.types.model;

import com.oplus.aiunit.vision.kvi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum TypeVariance {
    IN("in"),
    OUT(kvi.FLEXIBLE_OUT_RES_DIR_NAME),
    INV("");


    @NotNull
    private final String presentation;

    TypeVariance(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.presentation;
    }
}
