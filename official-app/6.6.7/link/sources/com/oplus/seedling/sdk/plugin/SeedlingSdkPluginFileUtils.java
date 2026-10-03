package com.oplus.seedling.sdk.plugin;

import android.content.Context;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.qt5;
import com.oplus.aiunit.vision.s8e;
import com.oplus.pantanal.plugin.PluginFileUtils;
import com.oplus.pantanal.plugin.bean.HashEntity;
import com.oplus.pantanal.plugin.bean.PluginUpdateBean;
import com.oplus.seedling.sdk.SeedlingInitConfig;
import com.oplus.seedling.sdk.SeedlingSdk;
import com.oplus.seedling.sdk.entity.EngineType;
import com.oplus.seedling.sdk.plugin.bean.SeedlingSdkConfigBean;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0003J,\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0003J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/oplus/seedling/sdk/plugin/SeedlingSdkPluginFileUtils;", "", "()V", "ENCRYPTED_SEEDLING_VERSION", "", "TAG", "", "gainHashConfig", "Lcom/oplus/pantanal/plugin/bean/HashEntity;", "remoteConfig", "Lcom/oplus/seedling/sdk/plugin/bean/SeedlingSdkConfigBean;", "gainHashConfig$pantanal_client_release", "gainRemotePluginName", "isSameHash", "", "gainRemoteSoFolderName", "initPluginFiles", "initConfig", "Lcom/oplus/seedling/sdk/SeedlingInitConfig;", "initSeedlingSdkPluginFiles", "context", "Landroid/content/Context;", "startUpdatePluginFiles", "localConfig", "updateFiles", "pluginUpdateBean", "Lcom/oplus/pantanal/plugin/bean/PluginUpdateBean;", "verifySeedlingHash", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSeedlingSdkPluginFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeedlingSdkPluginFileUtils.kt\ncom/oplus/seedling/sdk/plugin/SeedlingSdkPluginFileUtils\n+ 2 PluginFileUtils.kt\ncom/oplus/pantanal/plugin/PluginFileUtils\n*L\n1#1,277:1\n281#2,18:278\n256#2,20:296\n*S KotlinDebug\n*F\n+ 1 SeedlingSdkPluginFileUtils.kt\ncom/oplus/seedling/sdk/plugin/SeedlingSdkPluginFileUtils\n*L\n63#1:278,18\n72#1:296,20\n*E\n"})
public final class SeedlingSdkPluginFileUtils {
    private static final int ENCRYPTED_SEEDLING_VERSION = 15000022;

    @NotNull
    public static final SeedlingSdkPluginFileUtils INSTANCE = new SeedlingSdkPluginFileUtils();

    @NotNull
    private static final String TAG = "SeedlingSdkPluginFileUtils";

    private SeedlingSdkPluginFileUtils() {
    }

    @JvmStatic
    @Nullable
    public static final HashEntity gainHashConfig$pantanal_client_release(@NotNull SeedlingSdkConfigBean remoteConfig) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        HashEntity hashLite = remoteConfig.getHashLite();
        String hash = hashLite != null ? hashLite.getHash() : null;
        HashEntity hashStandard = remoteConfig.getHashStandard();
        boolean zQ = PluginFileUtils.q(hash, hashStandard != null ? hashStandard.getHash() : null);
        s8e s8eVar = s8e.INSTANCE;
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start gain hash config for " + seedlingSdk.getSEngineType$pantanal_client_release() + ", isSameHash=" + zQ + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (!zQ && seedlingSdk.getSEngineType$pantanal_client_release() == EngineType.LITE) {
            return remoteConfig.getHashLite();
        }
        return remoteConfig.getHashStandard();
    }

    @JvmStatic
    private static final String gainRemotePluginName(boolean isSameHash) {
        s8e s8eVar = s8e.INSTANCE;
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start gain remote plugin name for " + seedlingSdk.getSEngineType$pantanal_client_release() + ",isSameHash=" + isSameHash + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (!isSameHash && seedlingSdk.getSEngineType$pantanal_client_release() == EngineType.LITE) {
            return SeedlingConstants.PluginFilePath.INSTANCE.getPATH_REMOTE_SDK_LITE();
        }
        return SeedlingConstants.PluginFilePath.INSTANCE.getPATH_REMOTE_SDK_STANDARD();
    }

    @JvmStatic
    private static final String gainRemoteSoFolderName(boolean isSameHash) {
        s8e s8eVar = s8e.INSTANCE;
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start gain remote so folder name for " + seedlingSdk.getSEngineType$pantanal_client_release() + ",isSameHash=" + isSameHash + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (!isSameHash && seedlingSdk.getSEngineType$pantanal_client_release() == EngineType.LITE) {
            return SeedlingConstants.PluginFilePath.INSTANCE.getPATH_REMOTE_SO_FOLDER_LITE();
        }
        return SeedlingConstants.PluginFilePath.INSTANCE.getPATH_REMOTE_SO_FOLDER_STANDARD();
    }

    @JvmStatic
    public static final int initPluginFiles(@Nullable SeedlingInitConfig initConfig) {
        ht9.a.c(s8e.INSTANCE, TAG, "initPluginFiles", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        try {
            Result.Companion companion = Result.Companion;
            Context contextCreatePackageContext = SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release().createPackageContext("com.oplus.pantanal.ums", 2);
            Intrinsics.checkNotNullExpressionValue(contextCreatePackageContext, "urtContext");
            return initSeedlingSdkPluginFiles(contextCreatePackageContext, initConfig);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return 1002;
            }
            ht9.a.b(s8e.INSTANCE, TAG, "Exception while init plugin files : " + th2.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return 1002;
        }
    }

    @JvmStatic
    private static final int initSeedlingSdkPluginFiles(Context context, SeedlingInitConfig initConfig) {
        Object objFromJson;
        String path_remote_config = SeedlingConstants.PluginFilePath.INSTANCE.getPATH_REMOTE_CONFIG();
        ht9.a.c(s8e.INSTANCE, PluginFileUtils.TAG, "Start load remote config for " + path_remote_config + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        Object obj = null;
        try {
            InputStream inputStreamOpen = context.getResources().getAssets().open(path_remote_config);
            try {
                objFromJson = new Gson().fromJson(new InputStreamReader(inputStreamOpen), SeedlingSdkConfigBean.class);
                try {
                    CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                } catch (Exception e) {
                    e = e;
                    ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(inputStreamOpen, th);
                    throw th2;
                }
            }
        } catch (Exception e2) {
            e = e2;
            objFromJson = null;
        }
        SeedlingSdkConfigBean seedlingSdkConfigBean = (SeedlingSdkConfigBean) objFromJson;
        if (seedlingSdkConfigBean == null) {
            ht9.a.b(s8e.INSTANCE, TAG, "Remote config is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return 1000;
        }
        String pathLocalConfig = SeedlingConstants.PluginFilePath.getPathLocalConfig(SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release());
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, PluginFileUtils.TAG, "Start load local config for " + pathLocalConfig + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        File file = new File(pathLocalConfig);
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                try {
                    Object objFromJson2 = new Gson().fromJson(fileReader, SeedlingSdkConfigBean.class);
                    try {
                        CloseableKt.closeFinally(fileReader, (Throwable) null);
                        obj = objFromJson2;
                    } catch (Exception e3) {
                        e = e3;
                        obj = objFromJson2;
                        ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(fileReader, th3);
                        throw th4;
                    }
                }
            } catch (Exception e4) {
                e = e4;
            }
        } else {
            ht9.a.e(s8eVar, PluginFileUtils.TAG, "File is not exist.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        return startUpdatePluginFiles(context, seedlingSdkConfigBean, (SeedlingSdkConfigBean) obj, initConfig);
    }

    @JvmStatic
    private static final int startUpdatePluginFiles(Context context, SeedlingSdkConfigBean remoteConfig, SeedlingSdkConfigBean localConfig, SeedlingInitConfig initConfig) throws IOException {
        SeedlingSdkPluginFileUtils$startUpdatePluginFiles$reportPluginFileInitExecution$1 seedlingSdkPluginFileUtils$startUpdatePluginFiles$reportPluginFileInitExecution$1 = new Function1<String, Unit>() { // from class: com.oplus.seedling.sdk.plugin.SeedlingSdkPluginFileUtils$startUpdatePluginFiles$reportPluginFileInitExecution$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "errorMessage");
                PluginManager.INSTANCE.getSInstance().reportPluginFileInitExecution(str);
            }
        };
        HashEntity hashEntityGainHashConfig$pantanal_client_release = gainHashConfig$pantanal_client_release(remoteConfig);
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        PluginUpdateBean pluginUpdateBean = new PluginUpdateBean(hashEntityGainHashConfig$pantanal_client_release, remoteConfig, localConfig, SeedlingConstants.PluginFilePath.getPathFolderSdk(seedlingSdk.getSAppContext$pantanal_client_release()), SeedlingConstants.PluginFilePath.FILE_PLUGIN, SeedlingConstants.PluginFilePath.getPathFolderSo(seedlingSdk.getSAppContext$pantanal_client_release()), initConfig != null ? initConfig.getCheckForceCopySwitch() : false, null, 128, null);
        if (!PluginFileUtils.d(pluginUpdateBean, seedlingSdkPluginFileUtils$startUpdatePluginFiles$reportPluginFileInitExecution$1, context, initConfig != null ? initConfig.getEntranceType() : -1)) {
            ht9.a.c(s8e.INSTANCE, TAG, "Do not need to update.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return 1010;
        }
        if (!verifySeedlingHash(remoteConfig)) {
            ht9.a.c(s8e.INSTANCE, TAG, "verify seedling hash failed, do not update.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return 1001;
        }
        int iUpdateFiles = updateFiles(context, remoteConfig, pluginUpdateBean);
        if (!SetsKt.setOf(new Integer[]{1000, 1001}).contains(Integer.valueOf(iUpdateFiles))) {
            return iUpdateFiles;
        }
        ht9.a.b(s8e.INSTANCE, TAG, "initPluginFiles, updateFiles fail first, try again internal", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return updateFiles(context, remoteConfig, pluginUpdateBean);
    }

    @JvmStatic
    private static final int updateFiles(Context context, SeedlingSdkConfigBean remoteConfig, PluginUpdateBean pluginUpdateBean) throws IOException {
        Object obj;
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start update files.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        String pathFolderSdkCache = SeedlingConstants.PluginFilePath.getPathFolderSdkCache(seedlingSdk.getSAppContext$pantanal_client_release());
        PluginFileUtils.n(pathFolderSdkCache);
        String str = File.separator;
        PluginFileUtils.k(context, pathFolderSdkCache + str + "config.json", SeedlingConstants.PluginFilePath.FOLDER_SDK + str + "config.json");
        HashEntity hashEntityGainHashConfig$pantanal_client_release = gainHashConfig$pantanal_client_release(remoteConfig);
        if (hashEntityGainHashConfig$pantanal_client_release == null) {
            ht9.a.b(s8eVar, TAG, "remote hash config is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            PluginFileUtils.o(pathFolderSdkCache);
            return 1000;
        }
        HashEntity hashLite = remoteConfig.getHashLite();
        String hash = hashLite != null ? hashLite.getHash() : null;
        HashEntity hashStandard = remoteConfig.getHashStandard();
        boolean zQ = PluginFileUtils.q(hash, hashStandard != null ? hashStandard.getHash() : null);
        int iL = PluginFileUtils.l(context, hashEntityGainHashConfig$pantanal_client_release, gainRemotePluginName(zQ), pathFolderSdkCache, SeedlingConstants.PluginFilePath.FILE_PLUGIN);
        if (iL != 1012) {
            ht9.a.b(s8eVar, TAG, "Copy plugin file failed.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            PluginFileUtils.o(pathFolderSdkCache);
            return iL;
        }
        int iM = PluginFileUtils.m(context, hashEntityGainHashConfig$pantanal_client_release, SeedlingConstants.PluginFilePath.getPathFolderSoCache(seedlingSdk.getSAppContext$pantanal_client_release()), gainRemoteSoFolderName(zQ), pluginUpdateBean, ENCRYPTED_SEEDLING_VERSION, seedlingSdk.getSEngineType$pantanal_client_release() == EngineType.LITE);
        if (iM != 1012) {
            ht9.a.b(s8eVar, TAG, "Copy so file failed.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            PluginFileUtils.o(pathFolderSdkCache);
            return iM;
        }
        try {
            Result.Companion companion = Result.Companion;
            File file = new File(SeedlingConstants.PluginFilePath.getPathFolderSo(seedlingSdk.getSAppContext$pantanal_client_release()));
            if (file.exists() && !file.canWrite()) {
                file.setWritable(true);
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "setWritable Failure", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        PluginFileUtils.p(pathFolderSdkCache, SeedlingConstants.PluginFilePath.getPathFolderSdk(SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release()));
        return 1011;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    @JvmStatic
    private static final boolean verifySeedlingHash(SeedlingSdkConfigBean remoteConfig) {
        boolean z;
        if (remoteConfig.getVersion() < ENCRYPTED_SEEDLING_VERSION) {
            ht9.a.c(s8e.INSTANCE, TAG, "verifySeedlingHash, not needn't verify hash.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return true;
        }
        HashEntity hashEntityGainHashConfig$pantanal_client_release = gainHashConfig$pantanal_client_release(remoteConfig);
        if (hashEntityGainHashConfig$pantanal_client_release == null) {
            ht9.a.b(s8e.INSTANCE, TAG, "verifySeedlingHash, remote hash config is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            PluginFileUtils.o(SeedlingConstants.PluginFilePath.getPathFolderSdkCache(SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release()));
            return false;
        }
        String oaepHash = hashEntityGainHashConfig$pantanal_client_release.getOaepHash();
        if (oaepHash == null) {
            z = false;
        } else {
            if (oaepHash.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        String oaepHash2 = z ? hashEntityGainHashConfig$pantanal_client_release.getOaepHash() : hashEntityGainHashConfig$pantanal_client_release.getEncryptedHash();
        if (oaepHash2 == null || oaepHash2.length() == 0) {
            ht9.a.b(s8e.INSTANCE, TAG, "verifySeedlingHash, remote encryptedHash is empty.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return false;
        }
        if (Intrinsics.areEqual(hashEntityGainHashConfig$pantanal_client_release.getHash(), qt5.a(oaepHash2, z))) {
            ht9.a.c(s8e.INSTANCE, TAG, "verifySeedlingHash, success!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return true;
        }
        ht9.a.c(s8e.INSTANCE, TAG, "verifySeedlingHash, failed!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return false;
    }
}
