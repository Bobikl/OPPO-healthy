package com.heytap.health.base.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.dz0;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.vc;
import com.oplus.aiunit.vision.xu5;
import com.oplus.animation.OplusViewSeamless;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.wrapper.os.SystemProperties;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/base/ui/ActivityTransitionUtil;", "", "Companion", "ColorOsRemoteTransitionState", "a", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ObsoleteSdkInt"})
public final class ActivityTransitionUtil {

    @NotNull
    public static final String KEY_ACTIVITY_TRANSITION_TARGET_NAME = "CUS_TRANSITION_NAME";
    public static final int LOWEST_SDK_VERSION = 29;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static volatile ColorOsRemoteTransitionState a = ColorOsRemoteTransitionState.UNKNOWN;

    @NotNull
    public static final Lazy<Boolean> b = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.base.ui.ActivityTransitionUtil$Companion$canUseColorOSTransition$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            boolean z = false;
            try {
                int i = SystemProperties.getInt("persist.sys.oplus.anim_level", -1);
                boolean z2 = Build.VERSION.SDK_INT >= 36 && i > -1 && i <= 3;
                StringBuilder sb = new StringBuilder();
                sb.append("canUseColorOSTransition() ColorOS animLevel=");
                sb.append(i);
                sb.append(" canUse=");
                sb.append(z2);
                z = z2;
            } catch (Error unused) {
                a7b.b(dz0.BASE_TAG, "canUseColorOSTransition() error");
            }
            return Boolean.valueOf(z);
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/base/ui/ActivityTransitionUtil$ColorOsRemoteTransitionState;", "", "(Ljava/lang/String;I)V", LanConstants.OPERATOR_UNKNOWN, "VERIFIED", "DISABLED", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ColorOsRemoteTransitionState {
        UNKNOWN,
        VERIFIED,
        DISABLED
    }

    /* JADX INFO: renamed from: com.heytap.health.base.ui.ActivityTransitionUtil$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J(\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u001b\u0010!\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/heytap/health/base/ui/ActivityTransitionUtil$a;", "", "Landroid/app/Activity;", "activity", "", "f", "Landroid/view/View;", "transitionView", "Landroid/support/v4/app/ActivityOptionsCompat;", "a", "Landroid/content/Intent;", "intent", "n", "", vc.KEY_REQUEST_CODE, LogFieldKey.LEVEL_KEY, "", "i", "o", "j", "Landroid/os/Bundle;", "targetBundle", "c", MapSchema.FIELD_NAME_ENTRY, "b", b2n.g, b2n.f, LogFieldKey.MESSAGE_KEY, MapSchema.FIELD_NAME_KEY, "canUseColorOSTransition$delegate", "Lkotlin/Lazy;", "d", "()Z", "canUseColorOSTransition", "", "KEY_ACTIVITY_TRANSITION_TARGET_NAME", "Ljava/lang/String;", "LOWEST_SDK_VERSION", "I", "PERMISSION_CONTROL_REMOTE_APP_TRANSITION_ANIMATIONS", "TAG", "Lcom/heytap/health/base/ui/ActivityTransitionUtil$ColorOsRemoteTransitionState;", "colorOsRemoteTransitionState", "Lcom/heytap/health/base/ui/ActivityTransitionUtil$ColorOsRemoteTransitionState;", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final ActivityOptionsCompat a(@NotNull Activity activity, @NotNull View transitionView) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(transitionView, "transitionView");
            Activity activityS = op.n().s();
            if (!Intrinsics.areEqual(activityS, activity)) {
                StringBuilder sb = new StringBuilder();
                sb.append("buildActivityTransitionOptions() error topAc=");
                sb.append(activityS);
                sb.append("; curAc=");
                sb.append(activity);
                return null;
            }
            boolean zI = i();
            Bundle bundleE = zI ? e(activity, transitionView) : null;
            if (bundleE != null) {
                return c(bundleE);
            }
            boolean zD = d();
            ColorOsRemoteTransitionState colorOsRemoteTransitionState = ActivityTransitionUtil.a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("buildActivityTransitionOptions() canUseColorOSTransition=");
            sb2.append(zD);
            sb2.append(", canUseColorOsBundle=");
            sb2.append(zI);
            sb2.append(", state=");
            sb2.append(colorOsRemoteTransitionState);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("buildActivityTransitionOptions() activity=");
            sb3.append(activity);
            sb3.append("; tranViewName=");
            sb3.append(transitionView);
            String str = ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME + transitionView.getId();
            transitionView.setTransitionName(str);
            return ActivityOptionsCompat.makeSceneTransitionAnimation(activity, transitionView, str);
        }

        public final boolean b() {
            return d() && ActivityTransitionUtil.a != ColorOsRemoteTransitionState.DISABLED;
        }

        public final ActivityOptionsCompat c(Bundle targetBundle) {
            ActivityOptionsCompat activityOptionsCompatFromBundle = ActivityOptionsCompat.fromBundle(targetBundle);
            Intrinsics.checkNotNullExpressionValue(activityOptionsCompatFromBundle, "fromBundle(targetBundle)");
            return activityOptionsCompatFromBundle;
        }

        public final boolean d() {
            return ((Boolean) ActivityTransitionUtil.b.getValue()).booleanValue();
        }

        public final Bundle e(Activity activity, View transitionView) {
            if (!d()) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("view_seamless_open", true);
            bundle.putFloat("view_seamless_radius", xu5.a(activity, 20.0f));
            OplusViewSeamless.setSeamlessView(transitionView, activity, bundle, (OplusViewSeamless.AnimationCallback) null);
            int i = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder();
            sb.append("getColorOSTransitionBundle() use ColorOS anim, os version=");
            sb.append(i);
            return bundle;
        }

        public final void f(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.getWindow().requestFeature(13);
            activity.setExitSharedElementCallback(new MaterialContainerTransformSharedElementCallback());
            activity.getWindow().setSharedElementsUseOverlay(true);
            activity.getWindow().setAllowEnterTransitionOverlap(true);
        }

        public final void g() {
            ColorOsRemoteTransitionState colorOsRemoteTransitionState = ActivityTransitionUtil.a;
            ColorOsRemoteTransitionState colorOsRemoteTransitionState2 = ColorOsRemoteTransitionState.DISABLED;
            if (colorOsRemoteTransitionState != colorOsRemoteTransitionState2) {
                ActivityTransitionUtil.a = colorOsRemoteTransitionState2;
                a7b.m("ActivityTransitionUtil", "markColorOsTransitionDisabled() disable ColorOS remoteTransition in process");
            }
        }

        public final void h() {
            ColorOsRemoteTransitionState colorOsRemoteTransitionState = ActivityTransitionUtil.a;
            ColorOsRemoteTransitionState colorOsRemoteTransitionState2 = ColorOsRemoteTransitionState.VERIFIED;
            if (colorOsRemoteTransitionState != colorOsRemoteTransitionState2) {
                ActivityTransitionUtil.a = colorOsRemoteTransitionState2;
            }
        }

        @JvmStatic
        public final boolean i() {
            return d() && ActivityTransitionUtil.a == ColorOsRemoteTransitionState.VERIFIED;
        }

        @JvmStatic
        public final void j(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (d()) {
                OplusViewSeamless.skipBackAnim(activity);
            }
        }

        public final void k(Activity activity, Intent intent, int requestCode, View transitionView) {
            String str = ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME + transitionView.getId();
            transitionView.setTransitionName(str);
            intent.putExtra(ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME, str);
            activity.startActivityForResult(intent, requestCode, ActivityOptions.makeSceneTransitionAnimation(activity, transitionView, str).toBundle());
        }

        @JvmStatic
        public final void l(@NotNull Activity activity, @NotNull Intent intent, int requestCode, @NotNull View transitionView) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(transitionView, "transitionView");
            Activity activityS = op.n().s();
            if (!Intrinsics.areEqual(activityS, activity)) {
                StringBuilder sb = new StringBuilder();
                sb.append("startActivityForResultWithTransition() error topAc=");
                sb.append(activityS);
                sb.append("; curAc=");
                sb.append(activity);
                return;
            }
            Bundle bundleE = b() ? e(activity, transitionView) : null;
            if (bundleE != null) {
                try {
                    activity.startActivityForResult(intent, requestCode, bundleE);
                    h();
                    int i = Build.VERSION.SDK_INT;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("startActivityForResultWithTransition() use ColorOS anim, os version=");
                    sb2.append(i);
                    return;
                } catch (SecurityException e2) {
                    g();
                    a7b.c("ActivityTransitionUtil", "startActivityForResultWithTransition() SecurityException, fallback to default transition and disable remoteTransition in process", e2);
                }
            }
            k(activity, intent, requestCode, transitionView);
        }

        public final void m(Activity activity, Intent intent, View transitionView) {
            String str = ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME + transitionView.getId();
            transitionView.setTransitionName(str);
            StringBuilder sb = new StringBuilder();
            sb.append("startActivityWithDefaultTransition() activity=");
            sb.append(activity);
            sb.append("; tranViewName=");
            sb.append(str);
            intent.putExtra(ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME, str);
            activity.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity, transitionView, str).toBundle());
        }

        @JvmStatic
        public final void n(@NotNull Activity activity, @NotNull Intent intent, @NotNull View transitionView) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(transitionView, "transitionView");
            Activity activityS = op.n().s();
            if (!Intrinsics.areEqual(activityS, activity)) {
                StringBuilder sb = new StringBuilder();
                sb.append("startActivityWithTransition() error topAc=");
                sb.append(activityS);
                sb.append("; curAc=");
                sb.append(activity);
                return;
            }
            Bundle bundleE = b() ? e(activity, transitionView) : null;
            if (bundleE != null) {
                try {
                    activity.startActivity(intent, bundleE);
                    h();
                    int i = Build.VERSION.SDK_INT;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("startActivityWithTransition() use ColorOS anim, os version=");
                    sb2.append(i);
                    return;
                } catch (SecurityException e2) {
                    g();
                    a7b.c("ActivityTransitionUtil", "startActivityWithTransition() SecurityException, fallback to default transition and disable remoteTransition in process", e2);
                }
            }
            m(activity, intent, transitionView);
        }

        @JvmStatic
        public final void o() {
            if (d()) {
                OplusViewSeamless.finishCurrentAnimation();
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final ActivityOptionsCompat d(@NotNull Activity activity, @NotNull View view) {
        return INSTANCE.a(activity, view);
    }

    @JvmStatic
    public static final boolean e() {
        return INSTANCE.i();
    }

    @JvmStatic
    public static final void f(@NotNull Activity activity) {
        INSTANCE.j(activity);
    }

    @JvmStatic
    public static final void g(@NotNull Activity activity, @NotNull Intent intent, @NotNull View view) {
        INSTANCE.n(activity, intent, view);
    }

    @JvmStatic
    public static final void h() {
        INSTANCE.o();
    }
}
