package com.heytap.health;

import com.google.devtools.ksp.UtilsKt;
import com.google.devtools.ksp.processing.CodeGenerator;
import com.google.devtools.ksp.processing.Dependencies;
import com.google.devtools.ksp.processing.KSPLogger;
import com.google.devtools.ksp.processing.Resolver;
import com.google.devtools.ksp.processing.SymbolProcessor;
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment;
import com.google.devtools.ksp.symbol.KSAnnotated;
import com.google.devtools.ksp.symbol.KSAnnotation;
import com.google.devtools.ksp.symbol.KSClassDeclaration;
import com.google.devtools.ksp.symbol.KSFile;
import com.google.devtools.ksp.symbol.KSName;
import com.google.devtools.ksp.symbol.KSValueArgument;
import com.oplus.aiunit.vision.cdb;
import com.oplus.aiunit.vision.hk4;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.sequences.Sequence;
import p010kotlin.sequences.SequencesKt___SequencesKt;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016JT\u0010\u000e\u001a\u00020\r2J\u0010\f\u001aF\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00070\u0007j*\u0012\u0004\u0012\u00020\b\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000b`\u000bH\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006\""}, d2 = {"Lcom/heytap/health/DeviceAbilityProcessor;", "Lcom/google/devtools/ksp/processing/SymbolProcessor;", "Lcom/google/devtools/ksp/processing/Resolver;", "resolver", "", "Lcom/google/devtools/ksp/symbol/KSAnnotated;", "process", "Ljava/util/LinkedHashMap;", "Lcom/heytap/health/a$b;", "", "Lcom/google/devtools/ksp/symbol/KSClassDeclaration;", "Lkotlin/collections/LinkedHashMap;", "linkedMap", "", "a", "Lcom/google/devtools/ksp/processing/SymbolProcessorEnvironment;", "Lcom/google/devtools/ksp/processing/SymbolProcessorEnvironment;", "environment", "Lcom/google/devtools/ksp/processing/KSPLogger;", "b", "Lcom/google/devtools/ksp/processing/KSPLogger;", "getLogger", "()Lcom/google/devtools/ksp/processing/KSPLogger;", "logger", "c", "Ljava/lang/String;", "getPackageStr", "()Ljava/lang/String;", "packageStr", "d", "getTemp", "temp", "<init>", "(Lcom/google/devtools/ksp/processing/SymbolProcessorEnvironment;)V", "device_ability_processor"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceAbilityProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceAbilityProcessor.kt\ncom/heytap/health/DeviceAbilityProcessor\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n473#2:142\n1855#3,2:143\n1#4:145\n*S KotlinDebug\n*F\n+ 1 DeviceAbilityProcessor.kt\ncom/heytap/health/DeviceAbilityProcessor\n*L\n49#1:142\n49#1:143,2\n*E\n"})
public final class DeviceAbilityProcessor implements SymbolProcessor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SymbolProcessorEnvironment environment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final KSPLogger logger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String packageStr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String temp;

    public DeviceAbilityProcessor(@NotNull SymbolProcessorEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.environment = environment;
        this.logger = environment.getLogger();
        this.packageStr = "com.heytap.health.deviceability";
        this.temp = "package com.heytap.health.behavior.ability\n\nimport com.heytap.health.devicemanager.deviceability.DeviceModel\nimport com.heytap.health.devicemanager.deviceability.DeviceInfo\nimport com.heytap.health.devicemanager.devicetype.DeviceTypeUtil\nimport com.heytap.health.devicemanager.processor.bean.UserDeviceInfo\nprivate class %sMode(mode: String?) : DeviceModel(mode), %s\nprivate class %sDevice(deviceInfo: UserDeviceInfo?) : DeviceInfo(deviceInfo), %s\nobject %sTool {\n    fun buildeModel(mode: String?): %s = %sMode(mode)\n    fun buildeMac(mac: String?): %s = %sDevice(DeviceTypeUtil.getBoundDeviceByMac(mac))\n    fun buildeInfo(mac: String?): %s = %sDevice(DeviceTypeUtil.getBoundDeviceByMac(mac))\n}\n";
    }

    public final void a(LinkedHashMap<a.ProcessorBean, LinkedHashMap<String, KSClassDeclaration>> linkedMap) throws IOException {
        KSAnnotation next;
        Object next2;
        Object next3;
        KSName name;
        KSName name2;
        KSName qualifiedName;
        for (Map.Entry<a.ProcessorBean, LinkedHashMap<String, KSClassDeclaration>> entry : linkedMap.entrySet()) {
            LinkedHashMap<String, KSClassDeclaration> value = entry.getValue();
            a.ProcessorBean key = entry.getKey();
            String packageName = key.getPackageName();
            String exteriorName = key.getExteriorName();
            a.Companion companion = a.INSTANCE;
            String strB = companion.b(value.get(cdb.class.getSimpleName()));
            String strB2 = companion.b(value.get(hk4.class.getSimpleName()));
            KSPLogger.info$default(this.logger, "packageName:" + packageName + ", exteriorName:" + exteriorName + ", InnerName:" + strB + ", InnerName:" + strB2, null, 2, null);
            String str = this.packageStr;
            StringBuilder sb = new StringBuilder();
            sb.append("package ");
            sb.append(str);
            sb.append("\n\n");
            StringBuilder sb2 = new StringBuilder(sb.toString());
            sb2.append("import com.heytap.health.devicemanager.devicetype.DeviceTypeUtil\n");
            sb2.append("import " + packageName + "." + exteriorName + Weather.SEPARATOR);
            if (strB != null) {
                sb2.append("import com.heytap.health.devicemanager.deviceability.DeviceModel\n");
            }
            if (strB2 != null) {
                sb2.append("import com.heytap.health.devicemanager.deviceability.DeviceInfo\nimport com.heytap.health.devicemanager.processor.bean.UserDeviceInfo\n");
            }
            if (strB != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format("private class %sModel(model: String?) : DeviceModel(model), %s\n", Arrays.copyOf(new Object[]{exteriorName, strB}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                sb2.append(str2);
            }
            if (strB2 != null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str3 = String.format("private class %sDevice(deviceInfo: UserDeviceInfo?) : DeviceInfo(deviceInfo), %s\n", Arrays.copyOf(new Object[]{exteriorName, strB2}, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
                sb2.append(str3);
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str4 = String.format("object %sTool {\n", Arrays.copyOf(new Object[]{exteriorName}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(format, *args)");
            sb2.append(str4);
            if (strB != null) {
                String str5 = String.format("    @JvmStatic\n    fun buildByModel(model: String?): %s = %sModel(model)\n", Arrays.copyOf(new Object[]{strB, exteriorName}, 2));
                Intrinsics.checkNotNullExpressionValue(str5, "format(format, *args)");
                sb2.append(str5);
                if (strB2 == null) {
                    String str6 = String.format("    @JvmStatic\n    fun buildByMac(mac: String?): %s = %sModel(DeviceTypeUtil.getBoundDeviceModelByMac(mac))\n", Arrays.copyOf(new Object[]{strB, exteriorName}, 2));
                    Intrinsics.checkNotNullExpressionValue(str6, "format(format, *args)");
                    sb2.append(str6);
                }
            }
            if (strB2 != null) {
                String str7 = String.format("    @JvmStatic\n    fun buildByMac(mac: String?): %s = %sDevice(DeviceTypeUtil.getBoundDeviceByMac(mac))\n", Arrays.copyOf(new Object[]{strB2, exteriorName}, 2));
                Intrinsics.checkNotNullExpressionValue(str7, "format(format, *args)");
                sb2.append(str7);
                KSClassDeclaration kSClassDeclaration = value.get(hk4.class.getSimpleName());
                Intrinsics.checkNotNull(kSClassDeclaration);
                Iterator<KSAnnotation> it = kSClassDeclaration.getAnnotations().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        qualifiedName = next.getAnnotationType().resolve().getDeclaration().getQualifiedName();
                    }
                } while (!Intrinsics.areEqual(qualifiedName != null ? qualifiedName.asString() : null, hk4.class.getCanonicalName()));
                KSAnnotation kSAnnotation = next;
                if (kSAnnotation != null) {
                    KSPLogger kSPLogger = this.logger;
                    Iterator<T> it2 = kSAnnotation.getArguments().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it2.next();
                            name2 = ((KSValueArgument) next2).getName();
                        }
                    } while (!Intrinsics.areEqual(name2 != null ? name2.asString() : null, "buildDeviceInfo"));
                    KSValueArgument kSValueArgument = (KSValueArgument) next2;
                    KSPLogger.warn$default(kSPLogger, "buildDeviceInfo: " + (kSValueArgument != null ? kSValueArgument.getValue() : null), null, 2, null);
                    Iterator<T> it3 = kSAnnotation.getArguments().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        } else {
                            next3 = it3.next();
                            name = ((KSValueArgument) next3).getName();
                        }
                    } while (!Intrinsics.areEqual(name != null ? name.asString() : null, "buildDeviceInfo"));
                    KSValueArgument kSValueArgument2 = (KSValueArgument) next3;
                    if (Intrinsics.areEqual(kSValueArgument2 != null ? kSValueArgument2.getValue() : null, Boolean.TRUE)) {
                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                        String str8 = String.format("    @JvmStatic\n    fun buildByDeviceInfo(deviceInfo: UserDeviceInfo?): %s = %sDevice(deviceInfo)\n", Arrays.copyOf(new Object[]{strB2, exteriorName}, 2));
                        Intrinsics.checkNotNullExpressionValue(str8, "format(format, *args)");
                        sb2.append(str8);
                    }
                }
            }
            sb2.append("}");
            Collection<KSClassDeclaration> collectionValues = value.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "value.values");
            Object objElementAt = CollectionsKt___CollectionsKt.elementAt(collectionValues, 0);
            Intrinsics.checkNotNullExpressionValue(objElementAt, "value.values.elementAt(0)");
            KSClassDeclaration kSClassDeclaration2 = (KSClassDeclaration) objElementAt;
            CodeGenerator codeGenerator = this.environment.getCodeGenerator();
            KSFile containingFile = kSClassDeclaration2.getContainingFile();
            Intrinsics.checkNotNull(containingFile);
            OutputStream outputStreamCreateNewFile$default = CodeGenerator.createNewFile$default(codeGenerator, new Dependencies(false, containingFile), this.packageStr, exteriorName + "Tool", null, 8, null);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "tempFile.toString()");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            outputStreamCreateNewFile$default.write(bytes);
            KSPLogger kSPLogger2 = this.logger;
            KSFile containingFile2 = kSClassDeclaration2.getContainingFile();
            Intrinsics.checkNotNull(containingFile2);
            KSPLogger.warn$default(kSPLogger2, "DeviceAbilityProcessor----write done " + containingFile2, null, 2, null);
            outputStreamCreateNewFile$default.flush();
            outputStreamCreateNewFile$default.close();
        }
    }

    @Override // com.google.devtools.ksp.processing.SymbolProcessor
    @NotNull
    public List<KSAnnotated> process(@NotNull Resolver resolver) throws IOException {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        KSPLogger.warn$default(this.logger, "DeviceAbilityProcessor----process", null, 2, null);
        LinkedHashMap<a.ProcessorBean, LinkedHashMap<String, KSClassDeclaration>> linkedHashMap = new LinkedHashMap<>();
        String qualifiedName = Reflection.getOrCreateKotlinClass(cdb.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        Sequence symbolsWithAnnotation$default = Resolver.getSymbolsWithAnnotation$default(resolver, qualifiedName, false, 2, null);
        String qualifiedName2 = Reflection.getOrCreateKotlinClass(hk4.class).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName2);
        Sequence sequencePlus = SequencesKt___SequencesKt.plus(symbolsWithAnnotation$default, Resolver.getSymbolsWithAnnotation$default(resolver, qualifiedName2, false, 2, null));
        ArrayList arrayList = new ArrayList();
        Sequence sequenceFilter = SequencesKt___SequencesKt.filter(sequencePlus, new Function1<Object, Boolean>() { // from class: com.heytap.health.DeviceAbilityProcessor$process$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@Nullable Object obj) {
                return Boolean.valueOf(obj instanceof KSClassDeclaration);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        for (KSClassDeclaration kSClassDeclaration : SequencesKt___SequencesKt.toList(sequenceFilter)) {
            if (UtilsKt.validate$default(kSClassDeclaration, null, 1, null)) {
                kSClassDeclaration.accept(new a(linkedHashMap), Unit.INSTANCE);
            } else {
                arrayList.add(kSClassDeclaration);
            }
        }
        a(linkedHashMap);
        return arrayList;
    }
}
