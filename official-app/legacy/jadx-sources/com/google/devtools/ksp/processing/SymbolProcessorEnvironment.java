package com.google.devtools.ksp.processing;

import com.oplus.aiunit.vision.oea;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.KotlinVersion;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B3\b\u0016\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bBO\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/devtools/ksp/processing/SymbolProcessorEnvironment;", "", "options", "", "", "kotlinVersion", "Lkotlin/KotlinVersion;", "codeGenerator", "Lcom/google/devtools/ksp/processing/CodeGenerator;", "logger", "Lcom/google/devtools/ksp/processing/KSPLogger;", "(Ljava/util/Map;Lkotlin/KotlinVersion;Lcom/google/devtools/ksp/processing/CodeGenerator;Lcom/google/devtools/ksp/processing/KSPLogger;)V", "apiVersion", "compilerVersion", "platforms", "", "Lcom/google/devtools/ksp/processing/PlatformInfo;", "(Ljava/util/Map;Lkotlin/KotlinVersion;Lcom/google/devtools/ksp/processing/CodeGenerator;Lcom/google/devtools/ksp/processing/KSPLogger;Lkotlin/KotlinVersion;Lkotlin/KotlinVersion;Ljava/util/List;)V", "getApiVersion", "()Lkotlin/KotlinVersion;", "getCodeGenerator", "()Lcom/google/devtools/ksp/processing/CodeGenerator;", "getCompilerVersion", "getKotlinVersion", "getLogger", "()Lcom/google/devtools/ksp/processing/KSPLogger;", "getOptions", "()Ljava/util/Map;", "getPlatforms", "()Ljava/util/List;", oea.FEATURE_API_REQUEST}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SymbolProcessorEnvironment {

    @NotNull
    private final KotlinVersion apiVersion;

    @NotNull
    private final CodeGenerator codeGenerator;

    @NotNull
    private final KotlinVersion compilerVersion;

    @NotNull
    private final KotlinVersion kotlinVersion;

    @NotNull
    private final KSPLogger logger;

    @NotNull
    private final Map<String, String> options;

    @NotNull
    private final List<PlatformInfo> platforms;

    /* JADX WARN: Multi-variable type inference failed */
    public SymbolProcessorEnvironment(@NotNull Map<String, String> options, @NotNull KotlinVersion kotlinVersion, @NotNull CodeGenerator codeGenerator, @NotNull KSPLogger logger, @NotNull KotlinVersion apiVersion, @NotNull KotlinVersion compilerVersion, @NotNull List<? extends PlatformInfo> platforms) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(kotlinVersion, "kotlinVersion");
        Intrinsics.checkNotNullParameter(codeGenerator, "codeGenerator");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(compilerVersion, "compilerVersion");
        Intrinsics.checkNotNullParameter(platforms, "platforms");
        this.options = options;
        this.kotlinVersion = kotlinVersion;
        this.codeGenerator = codeGenerator;
        this.logger = logger;
        this.apiVersion = apiVersion;
        this.compilerVersion = compilerVersion;
        this.platforms = platforms;
    }

    @NotNull
    public final KotlinVersion getApiVersion() {
        return this.apiVersion;
    }

    @NotNull
    public final CodeGenerator getCodeGenerator() {
        return this.codeGenerator;
    }

    @NotNull
    public final KotlinVersion getCompilerVersion() {
        return this.compilerVersion;
    }

    @NotNull
    public final KotlinVersion getKotlinVersion() {
        return this.kotlinVersion;
    }

    @NotNull
    public final KSPLogger getLogger() {
        return this.logger;
    }

    @NotNull
    public final Map<String, String> getOptions() {
        return this.options;
    }

    @NotNull
    public final List<PlatformInfo> getPlatforms() {
        return this.platforms;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SymbolProcessorEnvironment(@NotNull Map<String, String> options, @NotNull KotlinVersion kotlinVersion, @NotNull CodeGenerator codeGenerator, @NotNull KSPLogger logger) {
        this(options, kotlinVersion, codeGenerator, logger, kotlinVersion, kotlinVersion, CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(kotlinVersion, "kotlinVersion");
        Intrinsics.checkNotNullParameter(codeGenerator, "codeGenerator");
        Intrinsics.checkNotNullParameter(logger, "logger");
    }
}
