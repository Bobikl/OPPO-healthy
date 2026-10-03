package com.heytap.store.platform.tools;

import android.content.Intent;
import android.net.Uri;
import androidx.autofill.HintConstants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/platform/tools/IntentUtils;", "", "()V", "getDialIntent", "Landroid/content/Intent;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "getIntent", "intent", "isNewTask", "", "getLaunchAppIntent", TraceConstants.KEY_PKG_NAME, "getShareTextIntent", "content", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class IntentUtils {
    public static final IntentUtils INSTANCE = new IntentUtils();

    private IntentUtils() {
    }

    private final Intent getIntent(Intent intent, boolean isNewTask) {
        if (!isNewTask) {
            return intent;
        }
        Intent intentAddFlags = intent.addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)");
        return intentAddFlags;
    }

    @NotNull
    public final Intent getDialIntent(@NotNull String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return getIntent(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + phoneNumber)), true);
    }

    @Nullable
    public final Intent getLaunchAppIntent(@NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        String launcherActivity = AppUtils.INSTANCE.getLauncherActivity(pkgName);
        if (StringsKt__StringsJVMKt.isBlank(launcherActivity)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setClassName(pkgName, launcherActivity);
        return intent.addFlags(268435456);
    }

    @NotNull
    public final Intent getShareTextIntent(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", content);
        return getIntent(intent, true);
    }
}
