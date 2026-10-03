package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ActivityComponentInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "()V", "sDebugMatchers", "", "sMatchersTag", "", "areComponentsMatching", "activityComponent", "Landroidx/window/core/ActivityComponentInfo;", "ruleComponent", "areComponentsMatching$window_release", "isActivityMatching", "activity", "Landroid/app/Activity;", "isActivityMatching$window_release", "isIntentMatching", "intent", "Landroid/content/Intent;", "isIntentMatching$window_release", "validateComponentName", "", "packageName", "className", "validateComponentName$window_release", "wildcardMatch", "name", "pattern", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMatcherUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatcherUtils.kt\nandroidx/window/embedding/MatcherUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class MatcherUtils {

    @NotNull
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;

    @NotNull
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String name, String pattern) {
        if (!StringsKt__StringsKt.contains$default((CharSequence) pattern, (CharSequence) "*", false, 2, (Object) null)) {
            return false;
        }
        if (Intrinsics.areEqual(pattern, "*")) {
            return true;
        }
        if (!(StringsKt__StringsKt.indexOf$default((CharSequence) pattern, "*", 0, false, 6, (Object) null) == StringsKt__StringsKt.lastIndexOf$default((CharSequence) pattern, "*", 0, false, 6, (Object) null) && StringsKt__StringsJVMKt.endsWith$default(pattern, "*", false, 2, null))) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        String strSubstring = pattern.substring(0, pattern.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringsKt__StringsJVMKt.startsWith$default(name, strSubstring, false, 2, null);
    }

    public final boolean areComponentsMatching$window_release(@Nullable ActivityComponentInfo activityComponent, @NotNull ActivityComponentInfo ruleComponent) {
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        if (activityComponent == null) {
            return Intrinsics.areEqual(ruleComponent.getPackageName(), "*") && Intrinsics.areEqual(ruleComponent.getClassName(), "*");
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) activityComponent.toString(), (CharSequence) "*", false, 2, (Object) null)) {
            return (Intrinsics.areEqual(activityComponent.getPackageName(), ruleComponent.getPackageName()) || wildcardMatch(activityComponent.getPackageName(), ruleComponent.getPackageName())) && (Intrinsics.areEqual(activityComponent.getClassName(), ruleComponent.getClassName()) || wildcardMatch(activityComponent.getClassName(), ruleComponent.getClassName()));
        }
        throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
    }

    public final boolean isActivityMatching$window_release(@NotNull Activity activity, @NotNull ActivityComponentInfo ruleComponent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        ComponentName componentName = activity.getComponentName();
        Intrinsics.checkNotNullExpressionValue(componentName, "activity.componentName");
        if (areComponentsMatching$window_release(new ActivityComponentInfo(componentName), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            return INSTANCE.isIntentMatching$window_release(intent, ruleComponent);
        }
        return false;
    }

    public final boolean isIntentMatching$window_release(@NotNull Intent intent, @NotNull ActivityComponentInfo ruleComponent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        ComponentName component = intent.getComponent();
        if (areComponentsMatching$window_release(component != null ? new ActivityComponentInfo(component) : null, ruleComponent)) {
            return true;
        }
        if (intent.getComponent() == null && (str = intent.getPackage()) != null) {
            return (Intrinsics.areEqual(str, ruleComponent.getPackageName()) || wildcardMatch(str, ruleComponent.getPackageName())) && Intrinsics.areEqual(ruleComponent.getClassName(), "*");
        }
        return false;
    }

    public final void validateComponentName$window_release(@NotNull String packageName, @NotNull String className) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(className, "className");
        boolean z = true;
        if (!(packageName.length() > 0)) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (!(className.length() > 0)) {
            throw new IllegalArgumentException("Activity class name must not be empty".toString());
        }
        if (!(!StringsKt__StringsKt.contains$default((CharSequence) packageName, (CharSequence) "*", false, 2, (Object) null) || StringsKt__StringsKt.indexOf$default((CharSequence) packageName, "*", 0, false, 6, (Object) null) == packageName.length() - 1)) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "*", false, 2, (Object) null) && StringsKt__StringsKt.indexOf$default((CharSequence) className, "*", 0, false, 6, (Object) null) != className.length() - 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }
}
