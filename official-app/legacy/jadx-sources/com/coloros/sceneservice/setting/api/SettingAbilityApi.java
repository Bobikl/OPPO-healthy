package com.coloros.sceneservice.setting.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.coloros.sceneservice.l.a;
import com.coloros.sceneservice.l.b;
import com.coloros.sceneservice.l.c;
import com.coloros.sceneservice.setting.SettingConstant;
import com.oplus.aiunit.vision.vc;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\f0\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J&\u0010\u0019\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0006J\u0016\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J&\u0010\u001e\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0006J\u001e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006 "}, d2 = {"Lcom/coloros/sceneservice/setting/api/SettingAbilityApi;", "", "()V", "checkUpdate", "", "minVersion", "", "updateMode", "updateType", "context", "Landroid/content/Context;", "getLocationSelectorIntent", "Landroid/content/Intent;", "scene", "Lcom/coloros/sceneservice/setting/SettingConstant$Scene;", "getRequesStatementIntent", "kotlin.jvm.PlatformType", "activity", "Landroid/app/Activity;", "getStatementIntent", "getUserProfileSettingIntent", "getWlanSelectorIntent", "startLocationSelectorActivity", "", vc.KEY_REQUEST_CODE, "startLocationSelectorActivityWithTheme", "themeType", "startRequestStatementActivity", "startStatementActivity", "startUserProfileSettingActivity", "startWLanSelectorActivityWithTheme", "startWlanSelectorActivity", "com.coloros.sceneservice.sdk_release"}, k = 1, mv = {1, 1, 16})
public final class SettingAbilityApi {
    public static final SettingAbilityApi INSTANCE = new SettingAbilityApi();

    public final void checkUpdate(int minVersion, int updateMode, int updateType, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        a.INSTANCE.checkUpdate(minVersion, updateMode, updateType, context);
    }

    @NotNull
    public final Intent getLocationSelectorIntent(@NotNull SettingConstant.Scene scene, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent locationSelectorIntent = c.getLocationSelectorIntent(scene, context);
        Intrinsics.checkExpressionValueIsNotNull(locationSelectorIntent, "UserProfileHelper.getLoc…torIntent(scene, context)");
        return locationSelectorIntent;
    }

    public final Intent getRequesStatementIntent(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return b.a(activity);
    }

    @NotNull
    public final Intent getStatementIntent(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intent statementIntent = b.getStatementIntent(activity);
        Intrinsics.checkExpressionValueIsNotNull(statementIntent, "StatementHelper.getStatementIntent(activity)");
        return statementIntent;
    }

    @NotNull
    public final Intent getUserProfileSettingIntent(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent userProfileSettingIntent = c.getUserProfileSettingIntent(context);
        Intrinsics.checkExpressionValueIsNotNull(userProfileSettingIntent, "UserProfileHelper.getUse…ileSettingIntent(context)");
        return userProfileSettingIntent;
    }

    @NotNull
    public final Intent getWlanSelectorIntent(@NotNull SettingConstant.Scene scene, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent wlanSelectorIntent = c.getWlanSelectorIntent(scene, context);
        Intrinsics.checkExpressionValueIsNotNull(wlanSelectorIntent, "UserProfileHelper.getWla…torIntent(scene, context)");
        return wlanSelectorIntent;
    }

    public final boolean startLocationSelectorActivity(@NotNull SettingConstant.Scene scene, int requestCode, @NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return c.startLocationSelectorActivity(scene, requestCode, activity);
    }

    public final boolean startLocationSelectorActivityWithTheme(@NotNull SettingConstant.Scene scene, int requestCode, @NotNull Activity activity, int themeType) {
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return c.startLocationSelectorActivityWithTheme(scene, requestCode, activity, themeType);
    }

    public final boolean startRequestStatementActivity(@NotNull Activity activity, int requestCode) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return b.startRequestStatementActivity(activity, requestCode);
    }

    public final boolean startStatementActivity(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return b.startStatementActivity(activity);
    }

    public final boolean startUserProfileSettingActivity(int requestCode, @NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return c.startUserProfileSettingActivity(requestCode, activity);
    }

    public final boolean startWLanSelectorActivityWithTheme(@NotNull SettingConstant.Scene scene, int requestCode, @NotNull Activity activity, int themeType) {
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return c.startWLanSelectorActivityWithTheme(scene, requestCode, activity, themeType);
    }

    public final boolean startWlanSelectorActivity(@NotNull SettingConstant.Scene scene, int requestCode, @NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return c.startWlanSelectorActivity(scene, requestCode, activity);
    }
}
