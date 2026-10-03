package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\r\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u001aJ\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0014H\u0002J\b\u0010'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Landroidx/window/embedding/SafeActivityEmbeddingComponentProvider;", "", "loader", "Ljava/lang/ClassLoader;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "windowExtensions", "Landroidx/window/extensions/WindowExtensions;", "(Ljava/lang/ClassLoader;Landroidx/window/core/ConsumerAdapter;Landroidx/window/extensions/WindowExtensions;)V", "activityEmbeddingComponent", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "getActivityEmbeddingComponent", "()Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "activityEmbeddingComponentClass", "Ljava/lang/Class;", "getActivityEmbeddingComponentClass", "()Ljava/lang/Class;", "safeWindowExtensionsProvider", "Landroidx/window/SafeWindowExtensionsProvider;", "canUseActivityEmbeddingComponent", "", "hasValidVendorApiLevel1", "hasValidVendorApiLevel1$window_release", "hasValidVendorApiLevel2", "hasValidVendorApiLevel2$window_release", "isActivityEmbeddingComponentAccessible", "isActivityEmbeddingComponentAccessible$window_release", "isActivityEmbeddingComponentValid", "isClassActivityRuleValid", "isClassSplitAttributesValid", "isClassSplitInfoValid", "isClassSplitPairRuleValid", "isClassSplitPlaceholderRuleValid", "isClassSplitTypeValid", "isMethodClearSplitInfoCallbackValid", "isMethodGetSplitAttributesValid", "isMethodIsActivityEmbeddedValid", "isMethodSetEmbeddingRulesValid", "isMethodSetSplitInfoCallbackJavaConsumerValid", "isMethodSetSplitInfoCallbackWindowConsumerValid", "isMethodSplitAttributesCalculatorValid", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SafeActivityEmbeddingComponentProvider {

    @NotNull
    private final ConsumerAdapter consumerAdapter;

    @NotNull
    private final ClassLoader loader;

    @NotNull
    private final SafeWindowExtensionsProvider safeWindowExtensionsProvider;

    @NotNull
    private final WindowExtensions windowExtensions;

    public SafeActivityEmbeddingComponentProvider(@NotNull ClassLoader loader, @NotNull ConsumerAdapter consumerAdapter, @NotNull WindowExtensions windowExtensions) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        Intrinsics.checkNotNullParameter(windowExtensions, "windowExtensions");
        this.loader = loader;
        this.consumerAdapter = consumerAdapter;
        this.windowExtensions = windowExtensions;
        this.safeWindowExtensionsProvider = new SafeWindowExtensionsProvider(loader);
    }

    private final boolean canUseActivityEmbeddingComponent() {
        if (!isActivityEmbeddingComponentAccessible$window_release()) {
            return false;
        }
        int safeVendorApiLevel = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
        if (safeVendorApiLevel == 1) {
            return hasValidVendorApiLevel1$window_release();
        }
        if (2 <= safeVendorApiLevel && safeVendorApiLevel <= Integer.MAX_VALUE) {
            return hasValidVendorApiLevel2$window_release();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getActivityEmbeddingComponentClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        Intrinsics.checkNotNullExpressionValue(clsLoadClass, "loader.loadClass(ACTIVIT…MBEDDING_COMPONENT_CLASS)");
        return clsLoadClass;
    }

    private final boolean isActivityEmbeddingComponentValid() {
        return ReflectionUtils.validateReflection$window_release("WindowExtensions#getActivityEmbeddingComponent is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isActivityEmbeddingComponentValid.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
                boolean z = false;
                Method getActivityEmbeddingComponentMethod = SafeActivityEmbeddingComponentProvider.this.safeWindowExtensionsProvider.getWindowExtensionsClass$window_release().getMethod("getActivityEmbeddingComponent", new Class[0]);
                Class<?> activityEmbeddingComponentClass = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass();
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(getActivityEmbeddingComponentMethod, "getActivityEmbeddingComponentMethod");
                if (reflectionUtils.isPublic$window_release(getActivityEmbeddingComponentMethod) && reflectionUtils.doesReturn$window_release(getActivityEmbeddingComponentMethod, activityEmbeddingComponentClass)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isClassActivityRuleValid() {
        return ReflectionUtils.validateReflection$window_release("Class ActivityRule is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isClassActivityRuleValid.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                boolean z = false;
                Method shouldAlwaysExpandMethod = androidx.window.extensions.embedding.ActivityRule.class.getMethod("shouldAlwaysExpand", new Class[0]);
                Class<?> cls = Boolean.TYPE;
                Method setShouldAlwaysExpandMethod = androidx.window.extensions.embedding.ActivityRule.Builder.class.getMethod("setShouldAlwaysExpand", cls);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(shouldAlwaysExpandMethod, "shouldAlwaysExpandMethod");
                if (reflectionUtils.isPublic$window_release(shouldAlwaysExpandMethod) && reflectionUtils.doesReturn$window_release(shouldAlwaysExpandMethod, cls)) {
                    Intrinsics.checkNotNullExpressionValue(setShouldAlwaysExpandMethod, "setShouldAlwaysExpandMethod");
                    if (reflectionUtils.isPublic$window_release(setShouldAlwaysExpandMethod)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isClassSplitAttributesValid() {
        return ReflectionUtils.validateReflection$window_release("Class SplitAttributes is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isClassSplitAttributesValid.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                boolean z = false;
                Method getLayoutDirectionMethod = androidx.window.extensions.embedding.SplitAttributes.class.getMethod("getLayoutDirection", new Class[0]);
                Method getSplitTypeMethod = androidx.window.extensions.embedding.SplitAttributes.class.getMethod("getSplitType", new Class[0]);
                Method setSplitTypeMethod = androidx.window.extensions.embedding.SplitAttributes.Builder.class.getMethod("setSplitType", androidx.window.extensions.embedding.SplitAttributes.SplitType.class);
                Class<?> cls = Integer.TYPE;
                Method setLayoutDirectionMethod = androidx.window.extensions.embedding.SplitAttributes.Builder.class.getMethod("setLayoutDirection", cls);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(getLayoutDirectionMethod, "getLayoutDirectionMethod");
                if (reflectionUtils.isPublic$window_release(getLayoutDirectionMethod) && reflectionUtils.doesReturn$window_release(getLayoutDirectionMethod, cls)) {
                    Intrinsics.checkNotNullExpressionValue(getSplitTypeMethod, "getSplitTypeMethod");
                    if (reflectionUtils.isPublic$window_release(getSplitTypeMethod) && reflectionUtils.doesReturn$window_release(getSplitTypeMethod, androidx.window.extensions.embedding.SplitAttributes.SplitType.class)) {
                        Intrinsics.checkNotNullExpressionValue(setSplitTypeMethod, "setSplitTypeMethod");
                        if (reflectionUtils.isPublic$window_release(setSplitTypeMethod)) {
                            Intrinsics.checkNotNullExpressionValue(setLayoutDirectionMethod, "setLayoutDirectionMethod");
                            if (reflectionUtils.isPublic$window_release(setLayoutDirectionMethod)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isClassSplitInfoValid() {
        return ReflectionUtils.validateReflection$window_release("Class SplitInfo is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isClassSplitInfoValid.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                boolean z = false;
                Method getPrimaryActivityStackMethod = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getPrimaryActivityStack", new Class[0]);
                Method getSecondaryActivityStackMethod = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getSecondaryActivityStack", new Class[0]);
                Method getSplitRatioMethod = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getSplitRatio", new Class[0]);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(getPrimaryActivityStackMethod, "getPrimaryActivityStackMethod");
                if (reflectionUtils.isPublic$window_release(getPrimaryActivityStackMethod) && reflectionUtils.doesReturn$window_release(getPrimaryActivityStackMethod, androidx.window.extensions.embedding.ActivityStack.class)) {
                    Intrinsics.checkNotNullExpressionValue(getSecondaryActivityStackMethod, "getSecondaryActivityStackMethod");
                    if (reflectionUtils.isPublic$window_release(getSecondaryActivityStackMethod) && reflectionUtils.doesReturn$window_release(getSecondaryActivityStackMethod, androidx.window.extensions.embedding.ActivityStack.class)) {
                        Intrinsics.checkNotNullExpressionValue(getSplitRatioMethod, "getSplitRatioMethod");
                        if (reflectionUtils.isPublic$window_release(getSplitRatioMethod) && reflectionUtils.doesReturn$window_release(getSplitRatioMethod, Float.TYPE)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isClassSplitPairRuleValid() {
        return ReflectionUtils.validateReflection$window_release("Class SplitPairRule is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleValid.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                boolean z = false;
                Method getFinishPrimaryWithSecondaryMethod = androidx.window.extensions.embedding.SplitPairRule.class.getMethod("getFinishPrimaryWithSecondary", new Class[0]);
                Method getFinishSecondaryWithPrimaryMethod = androidx.window.extensions.embedding.SplitPairRule.class.getMethod("getFinishSecondaryWithPrimary", new Class[0]);
                Method shouldClearTopMethod = androidx.window.extensions.embedding.SplitPairRule.class.getMethod("shouldClearTop", new Class[0]);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(getFinishPrimaryWithSecondaryMethod, "getFinishPrimaryWithSecondaryMethod");
                if (reflectionUtils.isPublic$window_release(getFinishPrimaryWithSecondaryMethod)) {
                    Class<?> cls = Integer.TYPE;
                    if (reflectionUtils.doesReturn$window_release(getFinishPrimaryWithSecondaryMethod, cls)) {
                        Intrinsics.checkNotNullExpressionValue(getFinishSecondaryWithPrimaryMethod, "getFinishSecondaryWithPrimaryMethod");
                        if (reflectionUtils.isPublic$window_release(getFinishSecondaryWithPrimaryMethod) && reflectionUtils.doesReturn$window_release(getFinishSecondaryWithPrimaryMethod, cls)) {
                            Intrinsics.checkNotNullExpressionValue(shouldClearTopMethod, "shouldClearTopMethod");
                            if (reflectionUtils.isPublic$window_release(shouldClearTopMethod) && reflectionUtils.doesReturn$window_release(shouldClearTopMethod, Boolean.TYPE)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isClassSplitPlaceholderRuleValid() {
        return ReflectionUtils.validateReflection$window_release("Class SplitPlaceholderRule is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isClassSplitPlaceholderRuleValid.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                boolean z = false;
                Method getPlaceholderIntentMethod = androidx.window.extensions.embedding.SplitPlaceholderRule.class.getMethod("getPlaceholderIntent", new Class[0]);
                Method isStickyMethod = androidx.window.extensions.embedding.SplitPlaceholderRule.class.getMethod("isSticky", new Class[0]);
                Method getFinishPrimaryWithSecondaryMethod = androidx.window.extensions.embedding.SplitPlaceholderRule.class.getMethod("getFinishPrimaryWithSecondary", new Class[0]);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(getPlaceholderIntentMethod, "getPlaceholderIntentMethod");
                if (reflectionUtils.isPublic$window_release(getPlaceholderIntentMethod) && reflectionUtils.doesReturn$window_release(getPlaceholderIntentMethod, Intent.class)) {
                    Intrinsics.checkNotNullExpressionValue(isStickyMethod, "isStickyMethod");
                    if (reflectionUtils.isPublic$window_release(isStickyMethod)) {
                        reflectionUtils.doesReturn$window_release(isStickyMethod, Boolean.TYPE);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(getFinishPrimaryWithSecondaryMethod, "getFinishPrimaryWithSecondaryMethod");
                if (reflectionUtils.isPublic$window_release(getFinishPrimaryWithSecondaryMethod) && reflectionUtils.doesReturn$window_release(getFinishPrimaryWithSecondaryMethod, Integer.TYPE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isClassSplitTypeValid() {
        return ReflectionUtils.validateReflection$window_release("Class SplitAttributes.SplitType is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isClassSplitTypeValid.1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code duplicated, block: B:21:0x0095  */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                boolean z;
                Class<?> cls = Float.TYPE;
                Constructor<?> ratioSplitTypeConstructor = androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType.class.getDeclaredConstructor(cls);
                Method getRatioMethod = androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType.class.getMethod("getRatio", new Class[0]);
                Method splitEquallyMethod = androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType.class.getMethod("splitEqually", new Class[0]);
                Constructor<?> hingeSplitTypeConstructor = androidx.window.extensions.embedding.SplitAttributes.SplitType.HingeSplitType.class.getDeclaredConstructor(androidx.window.extensions.embedding.SplitAttributes.SplitType.class);
                Method getFallbackSplitTypeMethod = androidx.window.extensions.embedding.SplitAttributes.SplitType.HingeSplitType.class.getMethod("getFallbackSplitType", new Class[0]);
                Constructor<?> expandContainersSplitTypeConstructor = androidx.window.extensions.embedding.SplitAttributes.SplitType.ExpandContainersSplitType.class.getDeclaredConstructor(new Class[0]);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(ratioSplitTypeConstructor, "ratioSplitTypeConstructor");
                if (reflectionUtils.isPublic$window_release(ratioSplitTypeConstructor)) {
                    Intrinsics.checkNotNullExpressionValue(getRatioMethod, "getRatioMethod");
                    if (reflectionUtils.isPublic$window_release(getRatioMethod) && reflectionUtils.doesReturn$window_release(getRatioMethod, cls)) {
                        Intrinsics.checkNotNullExpressionValue(hingeSplitTypeConstructor, "hingeSplitTypeConstructor");
                        if (reflectionUtils.isPublic$window_release(hingeSplitTypeConstructor)) {
                            Intrinsics.checkNotNullExpressionValue(splitEquallyMethod, "splitEquallyMethod");
                            if (reflectionUtils.isPublic$window_release(splitEquallyMethod) && reflectionUtils.doesReturn$window_release(splitEquallyMethod, androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType.class)) {
                                Intrinsics.checkNotNullExpressionValue(getFallbackSplitTypeMethod, "getFallbackSplitTypeMethod");
                                if (reflectionUtils.isPublic$window_release(getFallbackSplitTypeMethod) && reflectionUtils.doesReturn$window_release(getFallbackSplitTypeMethod, androidx.window.extensions.embedding.SplitAttributes.SplitType.class)) {
                                    Intrinsics.checkNotNullExpressionValue(expandContainersSplitTypeConstructor, "expandContainersSplitTypeConstructor");
                                    z = reflectionUtils.isPublic$window_release(expandContainersSplitTypeConstructor);
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isMethodClearSplitInfoCallbackValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#clearSplitInfoCallback is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isMethodClearSplitInfoCallbackValid.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                Method clearSplitInfoCallbackMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("clearSplitInfoCallback", new Class[0]);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(clearSplitInfoCallbackMethod, "clearSplitInfoCallbackMethod");
                return Boolean.valueOf(reflectionUtils.isPublic$window_release(clearSplitInfoCallbackMethod));
            }
        });
    }

    private final boolean isMethodGetSplitAttributesValid() {
        return ReflectionUtils.validateReflection$window_release("SplitInfo#getSplitAttributes is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isMethodGetSplitAttributesValid.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                boolean z = false;
                Method getSplitAttributesMethod = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getSplitAttributes", new Class[0]);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(getSplitAttributesMethod, "getSplitAttributesMethod");
                if (reflectionUtils.isPublic$window_release(getSplitAttributesMethod) && reflectionUtils.doesReturn$window_release(getSplitAttributesMethod, androidx.window.extensions.embedding.SplitAttributes.class)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private final boolean isMethodIsActivityEmbeddedValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isMethodIsActivityEmbeddedValid.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                Method isActivityEmbeddedMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("isActivityEmbedded", Activity.class);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(isActivityEmbeddedMethod, "isActivityEmbeddedMethod");
                return Boolean.valueOf(reflectionUtils.isPublic$window_release(isActivityEmbeddedMethod) && reflectionUtils.doesReturn$window_release(isActivityEmbeddedMethod, Boolean.TYPE));
            }
        });
    }

    private final boolean isMethodSetEmbeddingRulesValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isMethodSetEmbeddingRulesValid.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                Method setEmbeddingRulesMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setEmbeddingRules", Set.class);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(setEmbeddingRulesMethod, "setEmbeddingRulesMethod");
                return Boolean.valueOf(reflectionUtils.isPublic$window_release(setEmbeddingRulesMethod));
            }
        });
    }

    private final boolean isMethodSetSplitInfoCallbackJavaConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isMethodSetSplitInfoCallbackJavaConsumerValid.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                Class<?> clsConsumerClassOrNull$window_release = SafeActivityEmbeddingComponentProvider.this.consumerAdapter.consumerClassOrNull$window_release();
                if (clsConsumerClassOrNull$window_release == null) {
                    return Boolean.FALSE;
                }
                Method setSplitInfoCallbackMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setSplitInfoCallback", clsConsumerClassOrNull$window_release);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(setSplitInfoCallbackMethod, "setSplitInfoCallbackMethod");
                return Boolean.valueOf(reflectionUtils.isPublic$window_release(setSplitInfoCallbackMethod));
            }
        });
    }

    private final boolean isMethodSetSplitInfoCallbackWindowConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isMethodSetSplitInfoCallbackWindowConsumerValid.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                Method setSplitInfoCallbackMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setSplitInfoCallback", Consumer.class);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(setSplitInfoCallbackMethod, "setSplitInfoCallbackMethod");
                return Boolean.valueOf(reflectionUtils.isPublic$window_release(setSplitInfoCallbackMethod));
            }
        });
    }

    private final boolean isMethodSplitAttributesCalculatorValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new Function0<Boolean>() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.isMethodSplitAttributesCalculatorValid.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code duplicated, block: B:7:0x003b  */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException {
                boolean z;
                Method setSplitAttributesCalculatorMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setSplitAttributesCalculator", Function.class);
                Method clearSplitAttributesCalculatorMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("clearSplitAttributesCalculator", new Class[0]);
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(setSplitAttributesCalculatorMethod, "setSplitAttributesCalculatorMethod");
                if (reflectionUtils.isPublic$window_release(setSplitAttributesCalculatorMethod)) {
                    Intrinsics.checkNotNullExpressionValue(clearSplitAttributesCalculatorMethod, "clearSplitAttributesCalculatorMethod");
                    z = reflectionUtils.isPublic$window_release(clearSplitAttributesCalculatorMethod);
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Nullable
    public final ActivityEmbeddingComponent getActivityEmbeddingComponent() {
        if (!canUseActivityEmbeddingComponent()) {
            return null;
        }
        try {
            return this.windowExtensions.getActivityEmbeddingComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @VisibleForTesting
    public final boolean hasValidVendorApiLevel1$window_release() {
        return isMethodSetEmbeddingRulesValid() && isMethodIsActivityEmbeddedValid() && isMethodSetSplitInfoCallbackJavaConsumerValid() && isClassActivityRuleValid() && isClassSplitInfoValid() && isClassSplitPairRuleValid() && isClassSplitPlaceholderRuleValid();
    }

    @VisibleForTesting
    public final boolean hasValidVendorApiLevel2$window_release() {
        return hasValidVendorApiLevel1$window_release() && isMethodSetSplitInfoCallbackWindowConsumerValid() && isMethodClearSplitInfoCallbackValid() && isMethodSplitAttributesCalculatorValid() && isMethodGetSplitAttributesValid() && isClassSplitAttributesValid() && isClassSplitTypeValid();
    }

    @VisibleForTesting
    public final boolean isActivityEmbeddingComponentAccessible$window_release() {
        return this.safeWindowExtensionsProvider.isWindowExtensionsValid$window_release() && isActivityEmbeddingComponentValid();
    }
}
