package com.google.devtools.ksp.processing;

import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B3\b\u0016\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bBO\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/devtools/ksp/processing/SymbolProcessorEnvironment;", "", "options", "", "", "kotlinVersion", "Lkotlin/KotlinVersion;", "codeGenerator", "Lcom/google/devtools/ksp/processing/CodeGenerator;", "logger", "Lcom/google/devtools/ksp/processing/KSPLogger;", "(Ljava/util/Map;Lkotlin/KotlinVersion;Lcom/google/devtools/ksp/processing/CodeGenerator;Lcom/google/devtools/ksp/processing/KSPLogger;)V", "apiVersion", "compilerVersion", "platforms", "", "Lcom/google/devtools/ksp/processing/PlatformInfo;", "(Ljava/util/Map;Lkotlin/KotlinVersion;Lcom/google/devtools/ksp/processing/CodeGenerator;Lcom/google/devtools/ksp/processing/KSPLogger;Lkotlin/KotlinVersion;Lkotlin/KotlinVersion;Ljava/util/List;)V", "getApiVersion", "()Lkotlin/KotlinVersion;", "getCodeGenerator", "()Lcom/google/devtools/ksp/processing/CodeGenerator;", "getCompilerVersion", "getKotlinVersion", "getLogger", "()Lcom/google/devtools/ksp/processing/KSPLogger;", "getOptions", "()Ljava/util/Map;", "getPlatforms", "()Ljava/util/List;", "api"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    public SymbolProcessorEnvironment(@NotNull Map<String, String> map, @NotNull KotlinVersion kotlinVersion, @NotNull CodeGenerator codeGenerator, @NotNull KSPLogger kSPLogger, @NotNull KotlinVersion kotlinVersion2, @NotNull KotlinVersion kotlinVersion3, @NotNull List<? extends PlatformInfo> list) {
        Intrinsics.checkNotNullParameter(map, "options");
        Intrinsics.checkNotNullParameter(kotlinVersion, "kotlinVersion");
        Intrinsics.checkNotNullParameter(codeGenerator, "codeGenerator");
        Intrinsics.checkNotNullParameter(kSPLogger, "logger");
        Intrinsics.checkNotNullParameter(kotlinVersion2, "apiVersion");
        Intrinsics.checkNotNullParameter(kotlinVersion3, "compilerVersion");
        Intrinsics.checkNotNullParameter(list, "platforms");
        this.options = map;
        this.kotlinVersion = kotlinVersion;
        this.codeGenerator = codeGenerator;
        this.logger = kSPLogger;
        this.apiVersion = kotlinVersion2;
        this.compilerVersion = kotlinVersion3;
        this.platforms = list;
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
    public SymbolProcessorEnvironment(@NotNull Map<String, String> map, @NotNull KotlinVersion kotlinVersion, @NotNull CodeGenerator codeGenerator, @NotNull KSPLogger kSPLogger) {
        this(map, kotlinVersion, codeGenerator, kSPLogger, kotlinVersion, kotlinVersion, CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(map, "options");
        Intrinsics.checkNotNullParameter(kotlinVersion, "kotlinVersion");
        Intrinsics.checkNotNullParameter(codeGenerator, "codeGenerator");
        Intrinsics.checkNotNullParameter(kSPLogger, "logger");
    }
}
