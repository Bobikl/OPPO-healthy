package com.oplus.aiunit.vision;

import android.content.Context;
import com.google.gson.Gson;
import com.oplus.pantanal.plugin.CardGroupConfigBean;
import com.oplus.pantanal.plugin.PluginFileUtils;
import com.oplus.pantanal.plugin.SeedlingSdkConfigBean;
import com.oplus.pantanal.plugin.bean.HashEntity;
import com.oplus.pantanal.plugin.bean.PluginUpdateBean;
import com.oplus.seedling.sdk.plugin.SeedlingConstants;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007JD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0003J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/hkk;", "", "Landroid/content/Context;", "umsContext", "appContext", "Lkotlin/Function1;", "", "", "reportPluginFileInitException", "Lcom/oplus/aiunit/vision/zoe;", "pluginUpdateCallback", "", "isEngineLite", "b", "", "c", "a", "Lcom/oplus/pantanal/plugin/SeedlingSdkConfigBean;", "remoteConfig", "Lcom/oplus/pantanal/plugin/bean/HashEntity;", "d", "context", "path", "", "e", "<init>", "()V", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUmsUpdateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UmsUpdateHelper.kt\ncom/oplus/pantanal/plugin/UmsUpdateHelper\n+ 2 PluginFileUtils.kt\ncom/oplus/pantanal/plugin/PluginFileUtils\n*L\n1#1,236:1\n281#2,18:237\n256#2,20:255\n281#2,18:275\n256#2,20:293\n*S KotlinDebug\n*F\n+ 1 UmsUpdateHelper.kt\ncom/oplus/pantanal/plugin/UmsUpdateHelper\n*L\n106#1:237,18\n110#1:255,20\n162#1:275,18\n169#1:293,20\n*E\n"})
public final class hkk {

    @NotNull
    public static final hkk INSTANCE = new hkk();

    /* JADX WARN: Code duplicated, block: B:48:0x019f  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @JvmStatic
    public static final int a(Context umsContext, Context appContext) {
        ?? r5;
        CardGroupConfigBean cardGroupConfigBean;
        boolean zC;
        int i;
        Throwable th;
        String strC = v04.INSTANCE.c();
        s8e s8eVar = s8e.INSTANCE;
        ?? r6 = "Start load remote config for " + strC + d14.POINT_REGEX;
        ht9.a.c(s8eVar, PluginFileUtils.TAG, (String) r6, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        Object obj = null;
        try {
            try {
                InputStream inputStreamOpen = umsContext.getResources().getAssets().open(strC);
                try {
                    Object objFromJson = new Gson().fromJson(new InputStreamReader(inputStreamOpen), CardGroupConfigBean.class);
                    try {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                        r5 = objFromJson;
                        CardGroupConfigBean cardGroupConfigBean2 = (CardGroupConfigBean) r5;
                        if (cardGroupConfigBean2 == null) {
                            return 0;
                        }
                        String absolutePath = appContext.getFilesDir().getAbsolutePath();
                        String str = File.separator;
                        String str2 = (absolutePath + str) + "card_group_plugin";
                        String str3 = str2 + str + "config.json";
                        s8e s8eVar2 = s8e.INSTANCE;
                        ht9.a.c(s8eVar2, PluginFileUtils.TAG, "Start load local config for " + str3 + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        File file = new File(str3);
                        if (file.exists()) {
                            try {
                                FileReader fileReader = new FileReader(file);
                                try {
                                    Object objFromJson2 = new Gson().fromJson(fileReader, CardGroupConfigBean.class);
                                    try {
                                        Unit unit2 = Unit.INSTANCE;
                                        try {
                                            CloseableKt.closeFinally(fileReader, (Throwable) null);
                                            obj = objFromJson2;
                                        } catch (Exception e) {
                                            e = e;
                                            obj = objFromJson2;
                                            ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = objFromJson2;
                                        Throwable th3 = th;
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            CloseableKt.closeFinally(fileReader, th3);
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                                cardGroupConfigBean = (CardGroupConfigBean) obj;
                                if (PluginFileUtils.e(new PluginUpdateBean(cardGroupConfigBean2.getHashCardGroup(), cardGroupConfigBean2, cardGroupConfigBean, str2, "PantanalCardGroupSdk.apk", null, false, null, 224, null), null, null, 0, 14, null)) {
                                    ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "onUmsUpdated,checkCardGroupIfNeedUpdate checkIfNeedUpdate is false", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                                    return 0;
                                }
                                zC = PluginFileUtils.c(cardGroupConfigBean2.getRestartVersion(), cardGroupConfigBean);
                                if (zC) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                                int i2 = i;
                                ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "onUmsUpdated,checkCardGroupIfNeedUpdate pluginUpdateState= " + i2 + ", checkIfNeedRestart= " + zC, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                                return i2;
                            }
                        } else {
                            ht9.a.e(s8eVar2, PluginFileUtils.TAG, "File is not exist.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        }
                        cardGroupConfigBean = (CardGroupConfigBean) obj;
                        if (PluginFileUtils.e(new PluginUpdateBean(cardGroupConfigBean2.getHashCardGroup(), cardGroupConfigBean2, cardGroupConfigBean, str2, "PantanalCardGroupSdk.apk", null, false, null, 224, null), null, null, 0, 14, null)) {
                            ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "onUmsUpdated,checkCardGroupIfNeedUpdate checkIfNeedUpdate is false", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                            return 0;
                        }
                        zC = PluginFileUtils.c(cardGroupConfigBean2.getRestartVersion(), cardGroupConfigBean);
                        if (zC) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        int i3 = i;
                        ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "onUmsUpdated,checkCardGroupIfNeedUpdate pluginUpdateState= " + i3 + ", checkIfNeedRestart= " + zC, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        return i3;
                    } catch (Throwable th6) {
                        th = th6;
                        r6 = objFromJson;
                        try {
                            throw th;
                        } catch (Throwable th7) {
                            CloseableKt.closeFinally(inputStreamOpen, th);
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r6 = 0;
                }
            } catch (Exception e3) {
                e = e3;
                r6 = 0;
                ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                r5 = r6;
            }
        } catch (Exception e4) {
            e = e4;
            ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            r5 = r6;
        }
    }

    @JvmStatic
    public static final void b(@NotNull Context umsContext, @NotNull Context appContext, @Nullable Function1<? super String, Unit> reportPluginFileInitException, @Nullable zoe pluginUpdateCallback, boolean isEngineLite) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(umsContext, "umsContext");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        int iC = c(umsContext, appContext, reportPluginFileInitException, pluginUpdateCallback, isEngineLite);
        int iA = a(umsContext, appContext);
        if (iC == 0 && iA == 0) {
            ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "checkPluginIfNeedUpdate,both plugin is not need update", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            i2 = 0;
            i = -1;
        } else {
            i = 1;
            if (iC == 0 || iA != 0) {
                i2 = 2;
                if (iC != 0 || iA == 0) {
                    ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "checkPluginIfNeedUpdate, both plugins need update.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    if (iC != 2 && iA != 2) {
                        i2 = 1;
                    }
                    i = 3;
                } else {
                    ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "checkPluginIfNeedUpdate, card group plugin need update", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    i = 2;
                    i2 = iA;
                }
            } else {
                ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "checkPluginIfNeedUpdate, seed plugin need update", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                i2 = iC;
            }
        }
        ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "checkPluginIfNeedUpdate seedPluginUpdateState=" + iC + ",cardGroupUpdateState=" + iA + ", pluginUpdateState=" + i2 + ",pluginType=" + i, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (i2 == 0 || pluginUpdateCallback == null) {
            return;
        }
        pluginUpdateCallback.onPluginCheckUpdateResult(i2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @JvmStatic
    public static final int c(Context umsContext, Context appContext, Function1<? super String, Unit> reportPluginFileInitException, zoe pluginUpdateCallback, boolean isEngineLite) {
        ?? r6;
        long jE;
        Throwable th;
        String path_remote_config = SeedlingConstants.PluginFilePath.INSTANCE.getPATH_REMOTE_CONFIG();
        s8e s8eVar = s8e.INSTANCE;
        ?? r7 = "Start load remote config for " + path_remote_config + d14.POINT_REGEX;
        ht9.a.c(s8eVar, PluginFileUtils.TAG, (String) r7, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        Object obj = null;
        try {
            try {
                InputStream inputStreamOpen = umsContext.getResources().getAssets().open(path_remote_config);
                try {
                    Object objFromJson = new Gson().fromJson(new InputStreamReader(inputStreamOpen), SeedlingSdkConfigBean.class);
                    try {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                        r6 = objFromJson;
                    } catch (Throwable th2) {
                        th = th2;
                        r7 = objFromJson;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(inputStreamOpen, th);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r7 = 0;
                }
            } catch (Exception e) {
                e = e;
                ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                r6 = r7;
            }
        } catch (Exception e2) {
            e = e2;
            r7 = 0;
            ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            r6 = r7;
        }
        SeedlingSdkConfigBean seedlingSdkConfigBean = (SeedlingSdkConfigBean) r6;
        int i = 0;
        if (seedlingSdkConfigBean == null) {
            return 0;
        }
        String pathLocalConfig = SeedlingConstants.PluginFilePath.getPathLocalConfig(appContext);
        s8e s8eVar2 = s8e.INSTANCE;
        ht9.a.c(s8eVar2, PluginFileUtils.TAG, "Start load local config for " + pathLocalConfig + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        File file = new File(pathLocalConfig);
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                try {
                    Object objFromJson2 = new Gson().fromJson(fileReader, SeedlingSdkConfigBean.class);
                    try {
                        Unit unit2 = Unit.INSTANCE;
                        try {
                            CloseableKt.closeFinally(fileReader, (Throwable) null);
                            obj = objFromJson2;
                        } catch (Exception e3) {
                            e = e3;
                            obj = objFromJson2;
                            ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = objFromJson2;
                        Throwable th6 = th;
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            CloseableKt.closeFinally(fileReader, th6);
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Exception e4) {
                e = e4;
                ht9.a.b(s8e.INSTANCE, PluginFileUtils.TAG, "Exception while read config : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                SeedlingSdkConfigBean seedlingSdkConfigBean2 = (SeedlingSdkConfigBean) obj;
                hkk hkkVar = INSTANCE;
                SeedlingConstants.PluginFilePath pluginFilePath = SeedlingConstants.PluginFilePath.INSTANCE;
                jE = hkkVar.e(umsContext, pluginFilePath.getPATH_REMOTE_SDK_STANDARD());
                long jE2 = hkkVar.e(umsContext, pluginFilePath.getPATH_REMOTE_SO_STANDARD());
                if (jE >= 0) {
                }
                ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "onUmsUpdated. soSize or sdkSize is -1", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return 0;
            }
        } else {
            ht9.a.e(s8eVar2, PluginFileUtils.TAG, "File is not exist.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        SeedlingSdkConfigBean seedlingSdkConfigBean3 = (SeedlingSdkConfigBean) obj;
        hkk hkkVar2 = INSTANCE;
        SeedlingConstants.PluginFilePath pluginFilePath2 = SeedlingConstants.PluginFilePath.INSTANCE;
        jE = hkkVar2.e(umsContext, pluginFilePath2.getPATH_REMOTE_SDK_STANDARD());
        long jE3 = hkkVar2.e(umsContext, pluginFilePath2.getPATH_REMOTE_SO_STANDARD());
        if (jE >= 0 || jE3 < 0) {
            ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "onUmsUpdated. soSize or sdkSize is -1", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return 0;
        }
        if (PluginFileUtils.e(new PluginUpdateBean(d(seedlingSdkConfigBean, isEngineLite), seedlingSdkConfigBean, seedlingSdkConfigBean3, SeedlingConstants.PluginFilePath.getPathFolderSdk(appContext), SeedlingConstants.PluginFilePath.FILE_PLUGIN, SeedlingConstants.PluginFilePath.getPathFolderSo(appContext), false, null, 192, null), reportPluginFileInitException, null, 0, 12, null)) {
            boolean zC = PluginFileUtils.c(seedlingSdkConfigBean.getRestartVersion(), seedlingSdkConfigBean3);
            i = zC ? 2 : 1;
            ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "onUmsUpdated. sdkAvailable = " + jE + ", soAvailable = " + jE3 + ", pluginUpdateState = " + i + ", checkIfNeedRestart= " + zC, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            if (seedlingSdkConfigBean3 != null && pluginUpdateCallback != null) {
                pluginUpdateCallback.onPluginCheckUpdateResult(i, seedlingSdkConfigBean.getVersion(), seedlingSdkConfigBean3.getVersion(), jE + jE3);
            }
        } else {
            ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "onUmsUpdated. checkSeedlingSdkIfNeedUpdate, checkIfNeedUpdate is false", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        return i;
    }

    @JvmStatic
    public static final HashEntity d(SeedlingSdkConfigBean remoteConfig, boolean isEngineLite) {
        HashEntity hashLite = remoteConfig.getHashLite();
        String hash = hashLite != null ? hashLite.getHash() : null;
        HashEntity hashStandard = remoteConfig.getHashStandard();
        boolean zQ = PluginFileUtils.q(hash, hashStandard != null ? hashStandard.getHash() : null);
        ht9.a.c(s8e.INSTANCE, "UmsUpdateHelper", "start gain hash config isEngineLite= " + isEngineLite + ", isSameHash=" + zQ + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (!zQ && isEngineLite) {
            return remoteConfig.getHashLite();
        }
        return remoteConfig.getHashStandard();
    }

    public final long e(Context context, String path) {
        try {
            return context.getResources().getAssets().open(path).available();
        } catch (IOException e) {
            ht9.a.b(s8e.INSTANCE, "UmsUpdateHelper", "getAssetsFileSize fail: " + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return -1L;
        }
    }
}
