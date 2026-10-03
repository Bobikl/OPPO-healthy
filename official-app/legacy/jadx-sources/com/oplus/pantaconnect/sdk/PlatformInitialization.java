package com.oplus.pantaconnect.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import com.oplus.pantaconnect.sdk.exception.InitializationException;
import com.oplus.pantaconnect.sdk.logger.AndroidLogger;
import com.oplus.pantaconnect.sdk.logger.DefaultLogger;
import com.oplus.pantaconnect.sdk.logger.Logger;
import com.oplus.pantaconnect.sdk.logger.SdkLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u0007J\r\u0010!\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0002J\u001c\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010'\u001a\u00020(H\u0007J\u0006\u0010\u001a\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/oplus/pantaconnect/sdk/PlatformInitialization;", "", "()V", "PTC_PACKAGE_NAME", "", "PTC_VERSION_METADATA_KEY", "applicationContext", "Landroid/content/Context;", "frameworkVersionName", "initSdkExtension", "Lkotlin/Function0;", "Lcom/oplus/pantaconnect/sdk/SdkExtension;", "Lcom/oplus/pantaconnect/sdk/GetSdkExtension;", "getInitSdkExtension", "()Lkotlin/jvm/functions/Function0;", "setInitSdkExtension", "(Lkotlin/jvm/functions/Function0;)V", "platformLogger", "Lcom/oplus/pantaconnect/sdk/logger/Logger;", "getPlatformLogger", "()Lcom/oplus/pantaconnect/sdk/logger/Logger;", "setPlatformLogger", "(Lcom/oplus/pantaconnect/sdk/logger/Logger;)V", "sdkExtension", "getSdkExtension", "()Lcom/oplus/pantaconnect/sdk/SdkExtension;", "setSdkExtension", "(Lcom/oplus/pantaconnect/sdk/SdkExtension;)V", "clearFrameworkVersionName", "", "clearFrameworkVersionName$core_release", "clearSdkExtension", "getContext", "getFrameworkVersionName", "getFrameworkVersionName$core_release", "getSdkLogger", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "init", "context", "isSupportPTC", "", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlatformInitialization {

    @NotNull
    private static final String PTC_PACKAGE_NAME = "com.heytap.accessory";

    @NotNull
    private static final String PTC_VERSION_METADATA_KEY = "com.oplus.pantaconnect.support";

    @Nullable
    private static Context applicationContext;

    @Nullable
    private static volatile String frameworkVersionName;

    @Nullable
    private static Function0<? extends SdkExtension> initSdkExtension;

    @Nullable
    private static SdkExtension sdkExtension;

    @NotNull
    public static final PlatformInitialization INSTANCE = new PlatformInitialization();

    @NotNull
    private static Logger platformLogger = new DefaultLogger();

    private PlatformInitialization() {
    }

    private final SdkLogger getSdkLogger() {
        return SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "PlatformInitialization", null, 2, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(@Nullable Context context) {
        init$default(context, null, 2, null);
    }

    public static /* synthetic */ void init$default(Context context, Logger logger, int i, Object obj) {
        if ((i & 2) != 0) {
            logger = new AndroidLogger();
        }
        init(context, logger);
    }

    @JvmStatic
    public static final boolean isSupportPTC() {
        try {
            int i = INSTANCE.getContext().getPackageManager().getApplicationInfo("com.heytap.accessory", 128).metaData.getInt(PTC_VERSION_METADATA_KEY);
            SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "isSupportPTC", null, 2, null).error("isSupportPTC, packageName=com.heytap.accessory, ptcVersion=" + i);
            return i > 0;
        } catch (PackageManager.NameNotFoundException e2) {
            SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "isSupportPTC", null, 2, null).error("Package not found: com.heytap.accessory", e2);
            return false;
        }
    }

    public final void clearFrameworkVersionName$core_release() {
        frameworkVersionName = null;
    }

    public final void clearSdkExtension() {
        sdkExtension = null;
    }

    @NotNull
    public final Context getContext() throws InitializationException {
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        getSdkLogger().error("context null, check initialization maybe be error!");
        throw new InitializationException(0, null, 3, null);
    }

    @NotNull
    public final String getFrameworkVersionName$core_release() {
        String str = frameworkVersionName;
        if (str != null) {
            return str;
        }
        try {
            String str2 = getContext().getPackageManager().getPackageInfo("com.heytap.accessory", 0).versionName;
            frameworkVersionName = str2;
            return str2 == null ? "versionName is null" : str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return "Not installed.";
        } catch (InitializationException e2) {
            return "getFrameworkVersionName error, " + e2.getMessage();
        }
    }

    @Nullable
    public final Function0<SdkExtension> getInitSdkExtension() {
        return initSdkExtension;
    }

    @NotNull
    public final Logger getPlatformLogger() {
        return platformLogger;
    }

    @Nullable
    public final SdkExtension getSdkExtension() {
        return sdkExtension;
    }

    public final void setInitSdkExtension(@Nullable Function0<? extends SdkExtension> function0) {
        initSdkExtension = function0;
    }

    public final void setPlatformLogger(@NotNull Logger logger) {
        platformLogger = logger;
    }

    public final void setSdkExtension(@Nullable SdkExtension sdkExtension2) {
        sdkExtension = sdkExtension2;
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(@Nullable Context context, @NotNull Logger platformLogger2) {
        platformLogger = platformLogger2;
        if (context != null) {
            applicationContext = context;
            INSTANCE.getSdkLogger().info("sdk init");
        } else {
            INSTANCE.getSdkLogger().error("sdk init context null!");
        }
        INSTANCE.setSdkExtension();
    }

    public final void setSdkExtension() {
        Function0<? extends SdkExtension> function0 = initSdkExtension;
        sdkExtension = function0 != null ? function0.invoke() : null;
    }
}
