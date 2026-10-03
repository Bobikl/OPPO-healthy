package com.oplus.aiunit.vision;

import com.google.devtools.ksp.processing.SymbolProcessor;
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment;
import com.google.devtools.ksp.processing.SymbolProcessorProvider;
import com.heytap.health.DeviceAbilityProcessor;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/z95;", "Lcom/google/devtools/ksp/processing/SymbolProcessorProvider;", "Lcom/google/devtools/ksp/processing/SymbolProcessorEnvironment;", "environment", "Lcom/google/devtools/ksp/processing/SymbolProcessor;", "create", "<init>", "()V", "device_ability_processor"}, k = 1, mv = {1, 8, 0})
public final class z95 implements SymbolProcessorProvider {
    @Override // com.google.devtools.ksp.processing.SymbolProcessorProvider
    @NotNull
    public SymbolProcessor create(@NotNull SymbolProcessorEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        return new DeviceAbilityProcessor(environment);
    }
}
