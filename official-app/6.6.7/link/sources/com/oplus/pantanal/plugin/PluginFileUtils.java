package com.oplus.pantanal.plugin;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.erl;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.qt5;
import com.oplus.aiunit.vision.s8e;
import com.oplus.aiunit.vision.v5d;
import com.oplus.pantanal.plugin.PluginFileUtils;
import com.oplus.pantanal.plugin.bean.ConfigBean;
import com.oplus.pantanal.plugin.bean.HashEntity;
import com.oplus.pantanal.plugin.bean.PluginUpdateBean;
import com.oplus.pantanal.plugin.bean.SoHashEntity;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b=\u0010>J>\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J:\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007J(\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0003J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003J8\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0007J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0005H\u0003J \u0010\u001c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0007J2\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0007JD\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\fH\u0007J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0005H\u0007J\u0018\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0007J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0005H\u0007J\u001a\u0010-\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010,\u001a\u00020+H\u0007J*\u0010.\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\nH\u0007J \u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\nH\u0003J#\u00106\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0004\b6\u00107J\u001c\u0010:\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u00010\u00052\b\u00109\u001a\u0004\u0018\u00010\u0005H\u0007R\u0014\u0010;\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/oplus/pantanal/plugin/PluginFileUtils;", "", "Lcom/oplus/pantanal/plugin/bean/PluginUpdateBean;", "pluginUpdateBean", "Lkotlin/Function1;", "", "", "reportPluginFileInitExecution", "Landroid/content/Context;", "context", "", "entranceType", "", "d", "", "Lkotlin/Pair;", "h", "g", "r", "Lcom/oplus/pantanal/plugin/bean/HashEntity;", "hashEntity", "parent", ParserTag.TAG_CHILD, "soFile", "b", "f", "pluginFilePath", "fileName", "k", "remotePlugin", "l", "path", "remoteSoPath", "encryptedSeedlingVersion", "isEngineLite", "m", "o", "cachePath", "resultPath", "p", "folderName", "n", "originalHash", "Ljava/io/File;", "file", "s", "t", "Lcom/oplus/pantanal/plugin/bean/SoHashEntity;", "soHash", "u", "", "remoteRestartVersion", "Lcom/oplus/pantanal/plugin/bean/ConfigBean;", "localConfig", "c", "(Ljava/lang/Long;Lcom/oplus/pantanal/plugin/bean/ConfigBean;)Z", "liteHash", "standardHash", "q", "TAG", "Ljava/lang/String;", "<init>", "()V", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPluginFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginFileUtils.kt\ncom/oplus/pantanal/plugin/PluginFileUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,579:1\n1855#2,2:580\n*S KotlinDebug\n*F\n+ 1 PluginFileUtils.kt\ncom/oplus/pantanal/plugin/PluginFileUtils\n*L\n214#1:580,2\n*E\n"})
public final class PluginFileUtils {

    @NotNull
    public static final PluginFileUtils INSTANCE = new PluginFileUtils();

    @NotNull
    public static final String TAG = "PluginFileUtils";

    @JvmStatic
    @NotNull
    public static final Pair<Boolean, Boolean> b(@Nullable HashEntity hashEntity, @NotNull String parent, @NotNull String child, @NotNull String soFile) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, ParserTag.TAG_CHILD);
        Intrinsics.checkNotNullParameter(soFile, "soFile");
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start checkFileIntegrity", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (hashEntity == null) {
            ht9.a.b(s8eVar, TAG, "checkFileIntegrity hashEntity null", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        boolean zS = s(hashEntity.getHash(), new File(parent, child));
        boolean zF = f(hashEntity, soFile);
        ht9.a.c(s8eVar, TAG, "checkFileIntegrity,apkFileIntegrity:" + zS + ",soFileIntegrity:" + zF, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return new Pair<>(Boolean.valueOf(zS), Boolean.valueOf(zF));
    }

    @JvmStatic
    public static final boolean c(@Nullable Long remoteRestartVersion, @Nullable ConfigBean localConfig) {
        ht9.a.c(s8e.INSTANCE, TAG, "checkIfNeedRestart,remoteRestartVersion= " + remoteRestartVersion + ", localRestartVersion= " + (localConfig != null ? localConfig.getRestartVersion() : null), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (remoteRestartVersion == null || remoteRestartVersion.longValue() == 0 || localConfig == null) {
            return false;
        }
        Long restartVersion = localConfig.getRestartVersion();
        if (restartVersion == null) {
            return remoteRestartVersion.longValue() > 0;
        }
        return remoteRestartVersion.longValue() > restartVersion.longValue();
    }

    @JvmStatic
    public static final boolean d(@NotNull PluginUpdateBean pluginUpdateBean, @Nullable Function1<? super String, Unit> reportPluginFileInitExecution, @Nullable Context context, int entranceType) {
        Intrinsics.checkNotNullParameter(pluginUpdateBean, "pluginUpdateBean");
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start check update,entranceType = " + entranceType + ",pluginUpdateBean = " + pluginUpdateBean + d14.COMMA_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (pluginUpdateBean.getRemoteConfig() == null) {
            ht9.a.e(s8eVar, TAG, "remoteConfig config is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return false;
        }
        if (pluginUpdateBean.getLocalConfig() == null) {
            ht9.a.e(s8eVar, TAG, "Local config is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return true;
        }
        ht9.a.c(s8eVar, TAG, "checkIfUpdate, Local version = " + pluginUpdateBean.getLocalConfig().getVersion() + " , Remote version is " + pluginUpdateBean.getRemoteConfig().getVersion() + ",checkForceCopySwitch = " + pluginUpdateBean.getCheckForceCopySwitch(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (pluginUpdateBean.getCheckForceCopySwitch() && r(context, entranceType)) {
            ht9.a.c(s8eVar, TAG, "checkIfNeedUpdate return true,because force copy plugin is on.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return true;
        }
        if (pluginUpdateBean.getLocalConfig().getVersion() < pluginUpdateBean.getRemoteConfig().getVersion()) {
            return true;
        }
        if (pluginUpdateBean.getLocalConfig().getVersion() == pluginUpdateBean.getRemoteConfig().getVersion()) {
            return g(pluginUpdateBean, reportPluginFileInitExecution);
        }
        if (reportPluginFileInitExecution == null) {
            return false;
        }
        reportPluginFileInitExecution.invoke("the plugin version of the entrance is greater than ums");
        return false;
    }

    public static /* synthetic */ boolean e(PluginUpdateBean pluginUpdateBean, Function1 function1, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            context = null;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        return d(pluginUpdateBean, function1, context, i);
    }

    @JvmStatic
    public static final boolean f(HashEntity hashEntity, String soFile) {
        List<SoHashEntity> soHash = hashEntity.getSoHash();
        if (soHash == null) {
            return true;
        }
        for (SoHashEntity soHashEntity : soHash) {
            if (!s(soHashEntity.getHash(), new File(soFile + File.separator + soHashEntity.getSoName()))) {
                ht9.a.b(s8e.INSTANCE, TAG, "checkFileIntegrity " + soHashEntity.getSoName() + " fail", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean g(PluginUpdateBean pluginUpdateBean, Function1<? super String, Unit> reportPluginFileInitExecution) throws NoSuchAlgorithmException {
        Pair<Boolean, Boolean> pairB = b(pluginUpdateBean.getHashEntity(), pluginUpdateBean.getParent(), pluginUpdateBean.getChild(), pluginUpdateBean.getSoFile());
        boolean z = !((Boolean) pairB.getFirst()).booleanValue();
        boolean z2 = !((Boolean) pairB.getSecond()).booleanValue();
        ht9.a.c(s8e.INSTANCE, TAG, "checkWhenVersionEqual,localConfig.version == remoteConfig.version,isApkFileDamage = " + z + ",isSoFileDamage = " + z2, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (z || z2) {
            String str = "plugin file damage. isApkFileDamage:" + z + " isSoFileDamage:" + z2;
            if (reportPluginFileInitExecution != null) {
                reportPluginFileInitExecution.invoke(str);
            }
        }
        return z || z2;
    }

    @JvmStatic
    @NotNull
    public static final List<Pair<String, Integer>> h(@NotNull PluginUpdateBean pluginUpdateBean, @Nullable Function1<? super String, Unit> reportPluginFileInitExecution) {
        Intrinsics.checkNotNullParameter(pluginUpdateBean, "pluginUpdateBean");
        ConfigBean localConfig = pluginUpdateBean.getLocalConfig();
        Integer numValueOf = localConfig != null ? Integer.valueOf(localConfig.getVersion()) : null;
        ConfigBean remoteConfig = pluginUpdateBean.getRemoteConfig();
        Integer numValueOf2 = remoteConfig != null ? Integer.valueOf(remoteConfig.getVersion()) : null;
        ConfigBean builtInConfig = pluginUpdateBean.getBuiltInConfig();
        String str = "checkIfUpdate, Local version = " + numValueOf + " , Remote version is " + numValueOf2 + " , built-in version is " + (builtInConfig != null ? Integer.valueOf(builtInConfig.getVersion()) : null);
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, str, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        ArrayList arrayList = new ArrayList();
        if (pluginUpdateBean.getLocalConfig() != null) {
            arrayList.add(new Pair("localPluginVersion", Integer.valueOf(pluginUpdateBean.getLocalConfig().getVersion())));
        }
        if (pluginUpdateBean.getRemoteConfig() != null) {
            arrayList.add(new Pair("remotePluginVersion", Integer.valueOf(pluginUpdateBean.getRemoteConfig().getVersion())));
        }
        if (pluginUpdateBean.getBuiltInConfig() != null) {
            arrayList.add(new Pair("builtInPluginVersion", Integer.valueOf(pluginUpdateBean.getBuiltInConfig().getVersion())));
        }
        if (arrayList.size() >= 2) {
            final PluginFileUtils$choiceMaxVersion$1 pluginFileUtils$choiceMaxVersion$1 = new Function2<Pair<? extends String, ? extends Integer>, Pair<? extends String, ? extends Integer>, Integer>() { // from class: com.oplus.pantanal.plugin.PluginFileUtils$choiceMaxVersion$1
                @NotNull
                public final Integer invoke(Pair<String, Integer> pair, Pair<String, Integer> pair2) {
                    return Integer.valueOf(Intrinsics.compare(((Number) pair2.getSecond()).intValue(), ((Number) pair.getSecond()).intValue()));
                }
            };
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.yoe
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return PluginFileUtils.j(pluginFileUtils$choiceMaxVersion$1, obj, obj2);
                }
            });
            if (((Number) ((Pair) arrayList.get(0)).getSecond()).intValue() == ((Number) ((Pair) arrayList.get(1)).getSecond()).intValue() && Intrinsics.areEqual(((Pair) arrayList.get(0)).getFirst(), "localPluginVersion") && g(pluginUpdateBean, reportPluginFileInitExecution)) {
                arrayList.remove(0);
            }
        }
        ht9.a.c(s8eVar, TAG, "versionList = " + arrayList, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return arrayList;
    }

    public static /* synthetic */ List i(PluginUpdateBean pluginUpdateBean, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return h(pluginUpdateBean, function1);
    }

    public static final int j(Function2 function2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @JvmStatic
    public static final void k(@NotNull Context context, @NotNull String pluginFilePath, @NotNull String fileName) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pluginFilePath, "pluginFilePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start copy plugin files.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        File file = new File(pluginFilePath);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        InputStream inputStreamOpen = context.getResources().getAssets().open(fileName);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "inputStream");
                ByteStreamsKt.copyTo$default(inputStreamOpen, fileOutputStream, 0, 2, (Object) null);
                ht9.a.c(s8eVar, TAG, "Success copy config file.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(inputStreamOpen, th3);
                throw th4;
            }
        }
    }

    @JvmStatic
    public static final int l(@NotNull Context context, @Nullable HashEntity hashEntity, @NotNull String remotePlugin, @NotNull String parent, @NotNull String child) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remotePlugin, "remotePlugin");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, ParserTag.TAG_CHILD);
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start copy plugin files.remotePlugin=" + remotePlugin, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        File file = new File(parent, child);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        InputStream inputStreamOpen = context.getResources().getAssets().open(remotePlugin);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (v5d.b(false, 1, (Object) null)) {
                    try {
                        file.setReadOnly();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "inputStream");
                ByteStreamsKt.copyTo$default(inputStreamOpen, fileOutputStream2, 0, 2, (Object) null);
                fileOutputStream = fileOutputStream2;
                try {
                    ht9.a.c(s8eVar, TAG, "Success copy " + remotePlugin + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                    CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                    if (s(hashEntity != null ? hashEntity.getHash() : null, file)) {
                        return 1012;
                    }
                    ht9.a.b(s8eVar, TAG, "copyPluginFiles error, because verify failed for " + child, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    return 1001;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                CloseableKt.closeFinally(inputStreamOpen, th6);
                throw th7;
            }
        }
    }

    @JvmStatic
    public static final int m(@NotNull Context context, @Nullable HashEntity hashEntity, @NotNull String path, @NotNull String remoteSoPath, @NotNull PluginUpdateBean pluginUpdateBean, int encryptedSeedlingVersion, boolean isEngineLite) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(remoteSoPath, "remoteSoPath");
        Intrinsics.checkNotNullParameter(pluginUpdateBean, "pluginUpdateBean");
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start copy so files,isEngineLite=" + isEngineLite + ", remoteSoPath=" + remoteSoPath, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (isEngineLite) {
            ht9.a.e(s8eVar, TAG, "lite engines do not need to copy So!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return 1012;
        }
        String[] list = context.getResources().getAssets().list(remoteSoPath);
        boolean z = true;
        if (list != null) {
            if (!(list.length == 0)) {
                z = false;
            }
        }
        if (z) {
            ht9.a.e(s8eVar, TAG, "Abandon copy so via list is empty.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return 1012;
        }
        n(path);
        Iterator it = ArrayIteratorKt.iterator(list);
        while (it.hasNext()) {
            String str = (String) it.next();
            s8e s8eVar2 = s8e.INSTANCE;
            ht9.a.c(s8eVar2, TAG, "Start copy " + str, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            String str2 = File.separator;
            File file = new File(path + str2 + str);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            InputStream inputStreamOpen = context.getResources().getAssets().open(remoteSoPath + str2 + str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "inputStream");
                    ByteStreamsKt.copyTo$default(inputStreamOpen, fileOutputStream, 0, 2, (Object) null);
                    ht9.a.c(s8eVar2, TAG, "Success copy " + str + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                    CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                    if (!t(hashEntity, file, pluginUpdateBean, encryptedSeedlingVersion)) {
                        ht9.a.b(s8eVar2, TAG, "copySoFiles error, because verify failed for " + file.getName() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        return 1001;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(inputStreamOpen, th3);
                    throw th4;
                }
            }
        }
        return 1012;
    }

    @JvmStatic
    public static final void n(@NotNull String folderName) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        ht9.a.c(s8e.INSTANCE, TAG, "Start create new folder : " + folderName + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        File file = new File(folderName);
        if (file.exists()) {
            FilesKt.deleteRecursively(file);
        }
        file.mkdir();
    }

    @JvmStatic
    public static final void o(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        if (!file.exists()) {
            ht9.a.c(s8e.INSTANCE, TAG, "deleteInvalidCacheFiles,cache folder is not exists,no need to delete!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return;
        }
        boolean zDeleteRecursively = FilesKt.deleteRecursively(file);
        ht9.a.c(s8e.INSTANCE, TAG, "deleteInvalidCacheFiles,Start delete cache folder,Delete result is " + zDeleteRecursively + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    @JvmStatic
    public static final void p(@NotNull String cachePath, @NotNull String resultPath) {
        Intrinsics.checkNotNullParameter(cachePath, "cachePath");
        Intrinsics.checkNotNullParameter(resultPath, "resultPath");
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "deleteInvalidFiles,start delete invalid files.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        File file = new File(cachePath);
        if (file.exists()) {
            File file2 = new File(resultPath);
            if (file2.exists()) {
                ht9.a.c(s8eVar, TAG, "Start delete old folder.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                ht9.a.c(s8eVar, TAG, "Delete result is " + FilesKt.deleteRecursively(file2) + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            }
            ht9.a.c(s8eVar, TAG, "Rename result is " + file.renameTo(file2) + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    @JvmStatic
    public static final boolean q(@Nullable String liteHash, @Nullable String standardHash) {
        if (liteHash == null) {
            return true;
        }
        return Intrinsics.areEqual(liteHash, standardHash);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0072, please report this as an issue */
    @JvmStatic
    public static final boolean r(Context context, int entranceType) {
        Object obj;
        Throwable th;
        Boolean bool;
        ContentResolver contentResolver;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        try {
            Result.Companion companion = Result.Companion;
            Uri uri = Uri.parse("content://com.oplus.seedlingsdk.developer/query_force_copy_switch");
            if (context == null || (contentResolver = context.getContentResolver()) == null || (contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri)) == null) {
                return false;
            }
            try {
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("query_force_copy_switch", String.valueOf(entranceType), null);
                if (bundleCall == null) {
                    AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, (Throwable) null);
                    return false;
                }
                String string = bundleCall.getString("force_copy_status");
                ht9.a.c(s8e.INSTANCE, TAG, "queryForceCopySwitchStatus result = " + string, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                boolean zAreEqual = Intrinsics.areEqual(string, erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE);
                AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, (Throwable) null);
                return zAreEqual;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, th2);
                    throw th3;
                }
            }
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
            th = Result.exceptionOrNull-impl(obj);
            if (th != null) {
                ht9.a.c(s8e.INSTANCE, TAG, "queryForceCopySwitchStatus onFailure,msg = " + th, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            }
            bool = Boolean.FALSE;
            if (Result.isFailure-impl(obj)) {
                obj = bool;
            }
            return ((Boolean) obj).booleanValue();
        } catch (Throwable th4) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th4));
            th = Result.exceptionOrNull-impl(obj);
            if (th != null) {
                ht9.a.c(s8e.INSTANCE, TAG, "queryForceCopySwitchStatus onFailure,msg = " + th, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            }
            bool = Boolean.FALSE;
            if (Result.isFailure-impl(obj)) {
                obj = bool;
            }
            return ((Boolean) obj).booleanValue();
        }
    }

    @JvmStatic
    public static final boolean s(@Nullable String originalHash, @NotNull File file) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(file, "file");
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start verify " + file.getName() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (originalHash == null) {
            ht9.a.b(s8eVar, TAG, "original hash is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = qt5.d(file);
        ht9.a.c(s8eVar, TAG, "verify: hash:" + strD + ", originalHash:" + originalHash, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        boolean zAreEqual = Intrinsics.areEqual(strD, originalHash);
        ht9.a.c(s8eVar, TAG, "Verify result is " + zAreEqual + ",cost time:" + (System.currentTimeMillis() - jCurrentTimeMillis), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return zAreEqual;
    }

    @JvmStatic
    public static final boolean t(@Nullable HashEntity hashEntity, @NotNull File file, @NotNull PluginUpdateBean pluginUpdateBean, int encryptedSeedlingVersion) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(pluginUpdateBean, "pluginUpdateBean");
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start verify so for " + file.getName(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        List<SoHashEntity> soHash = hashEntity != null ? hashEntity.getSoHash() : null;
        List<SoHashEntity> list = soHash;
        if (list == null || list.isEmpty()) {
            ht9.a.b(s8eVar, TAG, "Original so hash list is empty.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return false;
        }
        for (SoHashEntity soHashEntity : soHash) {
            if (Intrinsics.areEqual(soHashEntity.getSoName(), file.getName())) {
                if (u(soHashEntity, pluginUpdateBean, encryptedSeedlingVersion)) {
                    return s(soHashEntity.getHash(), file);
                }
                ht9.a.c(s8e.INSTANCE, TAG, "verify so hash failed, do not update.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    @JvmStatic
    public static final boolean u(SoHashEntity soHash, PluginUpdateBean pluginUpdateBean, int encryptedSeedlingVersion) {
        boolean z;
        if (pluginUpdateBean.getRemoteConfig() == null) {
            ht9.a.c(s8e.INSTANCE, TAG, "verifySoHash, remoteConfig is null", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return false;
        }
        if (pluginUpdateBean.getRemoteConfig().getVersion() < encryptedSeedlingVersion) {
            ht9.a.c(s8e.INSTANCE, TAG, "verifySoHash, not needn't verify so hash.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return true;
        }
        String oaepHash = soHash.getOaepHash();
        if (oaepHash == null) {
            z = false;
        } else {
            if (oaepHash.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        String oaepHash2 = z ? soHash.getOaepHash() : soHash.getEncryptedHash();
        if (oaepHash2 == null || oaepHash2.length() == 0) {
            ht9.a.b(s8e.INSTANCE, TAG, "verifySoHash, remote encryptedHash is empty, verify so failed!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return false;
        }
        if (Intrinsics.areEqual(soHash.getHash(), qt5.a(oaepHash2, z))) {
            ht9.a.c(s8e.INSTANCE, TAG, "verifySoHash, success!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return true;
        }
        ht9.a.c(s8e.INSTANCE, TAG, "verifySoHash, failed!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return false;
    }
}
