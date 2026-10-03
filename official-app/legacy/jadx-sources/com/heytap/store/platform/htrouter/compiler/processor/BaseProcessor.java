package com.heytap.store.platform.htrouter.compiler.processor;

import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.heytap.store.platform.htrouter.compiler.utils.Logger;
import com.heytap.store.platform.htrouter.compiler.utils.TypeUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0-H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/heytap/store/platform/htrouter/compiler/processor/BaseProcessor;", "Ljavax/annotation/processing/AbstractProcessor;", "()V", "elementsUtils", "Ljavax/lang/model/util/Elements;", "getElementsUtils", "()Ljavax/lang/model/util/Elements;", "setElementsUtils", "(Ljavax/lang/model/util/Elements;)V", "filer", "Ljavax/annotation/processing/Filer;", "getFiler", "()Ljavax/annotation/processing/Filer;", "setFiler", "(Ljavax/annotation/processing/Filer;)V", "isNeedGenerateDoc", "", "()Z", "setNeedGenerateDoc", "(Z)V", "logger", "Lcom/heytap/store/platform/htrouter/compiler/utils/Logger;", "getLogger", "()Lcom/heytap/store/platform/htrouter/compiler/utils/Logger;", "setLogger", "(Lcom/heytap/store/platform/htrouter/compiler/utils/Logger;)V", "moduleName", "", "getModuleName", "()Ljava/lang/String;", "setModuleName", "(Ljava/lang/String;)V", "typeUtils", "Lcom/heytap/store/platform/htrouter/compiler/utils/TypeUtils;", "getTypeUtils", "()Lcom/heytap/store/platform/htrouter/compiler/utils/TypeUtils;", "setTypeUtils", "(Lcom/heytap/store/platform/htrouter/compiler/utils/TypeUtils;)V", "types", "Ljavax/lang/model/util/Types;", "getTypes", "()Ljavax/lang/model/util/Types;", "setTypes", "(Ljavax/lang/model/util/Types;)V", "getSupportedOptions", "", "getSupportedSourceVersion", "Ljavax/lang/model/SourceVersion;", "init", "", "processingEnvironment", "Ljavax/annotation/processing/ProcessingEnvironment;", "htrouter-compiler"}, k = 1, mv = {1, 1, 15})
public abstract class BaseProcessor extends AbstractProcessor {

    @NotNull
    public Elements elementsUtils;

    @NotNull
    public Filer filer;
    private boolean isNeedGenerateDoc;

    @NotNull
    public Logger logger;

    @Nullable
    private String moduleName;

    @NotNull
    public TypeUtils typeUtils;

    @NotNull
    public Types types;

    @NotNull
    public final Elements getElementsUtils() {
        Elements elements = this.elementsUtils;
        if (elements == null) {
            Intrinsics.throwUninitializedPropertyAccessException("elementsUtils");
        }
        return elements;
    }

    @NotNull
    public final Filer getFiler() {
        Filer filer = this.filer;
        if (filer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filer");
        }
        return filer;
    }

    @NotNull
    public final Logger getLogger() {
        Logger logger = this.logger;
        if (logger == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logger");
        }
        return logger;
    }

    @Nullable
    public final String getModuleName() {
        return this.moduleName;
    }

    @NotNull
    public Set<String> getSupportedOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(Consts.KEY_MODULE_NAME);
        hashSet.add(Consts.KEY_GENERATE_DOC_NAME);
        return hashSet;
    }

    @NotNull
    public SourceVersion getSupportedSourceVersion() {
        SourceVersion sourceVersionLatestSupported = SourceVersion.latestSupported();
        Intrinsics.checkExpressionValueIsNotNull(sourceVersionLatestSupported, "SourceVersion.latestSupported()");
        return sourceVersionLatestSupported;
    }

    @NotNull
    public final TypeUtils getTypeUtils() {
        TypeUtils typeUtils = this.typeUtils;
        if (typeUtils == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeUtils");
        }
        return typeUtils;
    }

    @NotNull
    public final Types getTypes() {
        Types types = this.types;
        if (types == null) {
            Intrinsics.throwUninitializedPropertyAccessException("types");
        }
        return types;
    }

    public void init(@Nullable ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        if (processingEnvironment != null) {
            Filer filer = processingEnvironment.getFiler();
            Intrinsics.checkExpressionValueIsNotNull(filer, "pE.filer");
            this.filer = filer;
            Types typeUtils = processingEnvironment.getTypeUtils();
            Intrinsics.checkExpressionValueIsNotNull(typeUtils, "pE.typeUtils");
            this.types = typeUtils;
            Elements elementUtils = processingEnvironment.getElementUtils();
            Intrinsics.checkExpressionValueIsNotNull(elementUtils, "pE.elementUtils");
            this.elementsUtils = elementUtils;
            Types types = this.types;
            if (types == null) {
                Intrinsics.throwUninitializedPropertyAccessException("types");
            }
            Elements elements = this.elementsUtils;
            if (elements == null) {
                Intrinsics.throwUninitializedPropertyAccessException("elementsUtils");
            }
            this.typeUtils = new TypeUtils(types, elements);
            Messager messager = processingEnvironment.getMessager();
            Intrinsics.checkExpressionValueIsNotNull(messager, "pE.messager");
            this.logger = new Logger(messager);
        }
        Map options = processingEnvironment != null ? processingEnvironment.getOptions() : null;
        if (!(options == null || options.isEmpty())) {
            this.moduleName = (String) options.get(Consts.KEY_MODULE_NAME);
            this.isNeedGenerateDoc = Intrinsics.areEqual("enable", (String) options.get(Consts.KEY_GENERATE_DOC_NAME));
        }
        String str = this.moduleName;
        if (str == null || str.length() == 0) {
            Logger logger = this.logger;
            if (logger == null) {
                Intrinsics.throwUninitializedPropertyAccessException("logger");
            }
            logger.error(Consts.NO_MODULE_NAME_TIPS);
            throw new RuntimeException("HTRouter::Compiler >>> no module name, for more information, look at gradle log");
        }
        String str2 = this.moduleName;
        if (str2 == null) {
            Intrinsics.throwNpe();
        }
        this.moduleName = Regex.INSTANCE.fromLiteral("[^0-9a-zA-Z_]+").replace(str2, "");
        Logger logger2 = this.logger;
        if (logger2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logger");
        }
        logger2.info("The user has configuration the module name, it was [" + this.moduleName + ']');
    }

    /* JADX INFO: renamed from: isNeedGenerateDoc, reason: from getter */
    public final boolean getIsNeedGenerateDoc() {
        return this.isNeedGenerateDoc;
    }

    public final void setElementsUtils(@NotNull Elements elements) {
        Intrinsics.checkParameterIsNotNull(elements, "<set-?>");
        this.elementsUtils = elements;
    }

    public final void setFiler(@NotNull Filer filer) {
        Intrinsics.checkParameterIsNotNull(filer, "<set-?>");
        this.filer = filer;
    }

    public final void setLogger(@NotNull Logger logger) {
        Intrinsics.checkParameterIsNotNull(logger, "<set-?>");
        this.logger = logger;
    }

    public final void setModuleName(@Nullable String str) {
        this.moduleName = str;
    }

    public final void setNeedGenerateDoc(boolean z) {
        this.isNeedGenerateDoc = z;
    }

    public final void setTypeUtils(@NotNull TypeUtils typeUtils) {
        Intrinsics.checkParameterIsNotNull(typeUtils, "<set-?>");
        this.typeUtils = typeUtils;
    }

    public final void setTypes(@NotNull Types types) {
        Intrinsics.checkParameterIsNotNull(types, "<set-?>");
        this.types = types;
    }
}
