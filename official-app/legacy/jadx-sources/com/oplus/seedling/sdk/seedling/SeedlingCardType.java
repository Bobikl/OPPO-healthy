package com.oplus.seedling.sdk.seedling;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.seedling.sdk.seedling.SeedlingCardEngineType, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/SeedlingCardEngineType;", "", "typeValue", "", "typeName", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "getTypeValue", "()I", "toString", "ENGINE_TYPE_UNKNOWN", "ENGINE_TYPE_STANDARD", "ENGINE_TYPE_LITE", "ENGINE_TYPE_REMOTE_VIEW", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SeedlingCardType {
    ENGINE_TYPE_UNKNOWN(0, "engine_type_unknown"),
    ENGINE_TYPE_STANDARD(1, "engine_type_standard"),
    ENGINE_TYPE_LITE(2, "engine_type_lite"),
    ENGINE_TYPE_REMOTE_VIEW(3, "engine_type_remote_view");


    @NotNull
    private final String typeName;
    private final int typeValue;

    SeedlingCardType(int i, String str) {
        this.typeValue = i;
        this.typeName = str;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    public final int getTypeValue() {
        return this.typeValue;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return "SeedlingCardType(typeValue=" + this.typeValue + ", typeName='" + this.typeName + "')";
    }
}
