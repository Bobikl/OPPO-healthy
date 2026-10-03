package com.heytap.webview.extension.cache;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.mla;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.io.ByteStreamsKt;
import p010kotlin.io.FilesKt__UtilsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/heytap/webview/extension/cache/WebExtCacheManager;", "", "()V", "cacheFilePath", "", "getCacheFilePath", "()Ljava/lang/String;", "setCacheFilePath", "(Ljava/lang/String;)V", "cleanOldCache", "", "cacheBean", "Lcom/heytap/webview/extension/cache/CacheBean;", "initManager", "context", "Landroid/content/Context;", "interceptRequest", "Landroid/webkit/WebResourceResponse;", "url", "saveCacheFileToLocal", "", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebExtCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebExtCacheManager.kt\ncom/heytap/webview/extension/cache/WebExtCacheManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,217:1\n13579#2,2:218\n13579#2,2:220\n13579#2,2:222\n13579#2,2:224\n*S KotlinDebug\n*F\n+ 1 WebExtCacheManager.kt\ncom/heytap/webview/extension/cache/WebExtCacheManager\n*L\n129#1:218,2\n172#1:220,2\n36#1:222,2\n121#1:224,2\n*E\n"})
public final class WebExtCacheManager {

    @NotNull
    public static final WebExtCacheManager INSTANCE = new WebExtCacheManager();
    public static String cacheFilePath;

    private WebExtCacheManager() {
    }

    private static final void cleanOldCache$deleteDir(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "file.listFiles()");
            for (File it : fileArrListFiles) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                cleanOldCache$deleteDir(it);
            }
        }
        file.delete();
    }

    private static final WebResourceResponse interceptRequest$loadDir(String str, CacheBean cacheBean, File file) {
        File it;
        CacheUtils cacheUtils;
        File[] fileArrListFiles = file.listFiles();
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "file.listFiles()");
        if (fileArrListFiles.length == 0) {
            LogUtil.d(CacheConstants.Debug.MODEL_TAG, "本地未找到资源包");
            return null;
        }
        File[] fileArrListFiles2 = file.listFiles();
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "file.listFiles()");
        int length = fileArrListFiles2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                LogUtil.d(CacheConstants.Debug.MODEL_TAG, "load fail ");
                return null;
            }
            it = fileArrListFiles2[i];
            if (it.isFile()) {
                cacheUtils = CacheUtils.INSTANCE;
                String ulrRequestFile = cacheUtils.getUlrRequestFile(str);
                String name = it.getName();
                Intrinsics.checkNotNullExpressionValue(name, "it.name");
                if (!StringsKt__StringsJVMKt.startsWith$default(ulrRequestFile, name, false, 2, null)) {
                    if (str.equals(cacheBean.getUri().toString())) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        if (FilesKt__UtilsKt.endsWith(it, ".html")) {
                            String name2 = it.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "it.name");
                            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) StringsKt__StringsJVMKt.replace$default(name2, ".html", "", false, 4, (Object) null), false, 2, (Object) null)) {
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                WebResourceResponse webResourceResponseInterceptRequest$loadDir = interceptRequest$loadDir(str, cacheBean, it);
                if (webResourceResponseInterceptRequest$loadDir != null) {
                    LogUtil.d(CacheConstants.Debug.MODEL_TAG, "load success ");
                    return webResourceResponseInterceptRequest$loadDir;
                }
            }
            i++;
        }
        String name3 = it.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "it.name");
        String mime = cacheUtils.getMime(name3);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(CacheConstants.Word.CACHE_CONTROL, "max-age=3600");
            WebResourceResponse webResourceResponse = new WebResourceResponse(mime, "utf-8", new FileInputStream(it));
            webResourceResponse.setStatusCodeAndReasonPhrase(250, "OK");
            webResourceResponse.setResponseHeaders(linkedHashMap);
            return webResourceResponse;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            LogUtil.d(CacheConstants.Debug.MODEL_TAG, "加载资源出错 FileNotFoundException");
            return null;
        } catch (Exception e3) {
            LogUtil.d(CacheConstants.Debug.MODEL_TAG, "加载资源出错 " + e3);
            return null;
        }
    }

    public final void cleanOldCache(@Nullable CacheBean cacheBean) {
        File file = new File(String.valueOf(getCacheFilePath()));
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "it.listFiles()");
            if (!(fileArrListFiles.length == 0)) {
                File[] fileArrListFiles2 = file.listFiles();
                Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "it.listFiles()");
                for (File it : fileArrListFiles2) {
                    String name = it.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    if (StringsKt__StringsJVMKt.endsWith$default(name, CacheConstants.Character.OLD, false, 2, null)) {
                        LogUtil.d(CacheConstants.Debug.MODEL_TAG, "清理旧资源包 " + it.getName());
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        cleanOldCache$deleteDir(it);
                    }
                    if (cacheBean != null) {
                        LogUtil.d(CacheConstants.Debug.MODEL_TAG, "删除未配置的资源包 " + it.getName());
                        if (it.getName().equals(cacheBean.getConfigId() + '_' + cacheBean.getVersionId())) {
                            Intrinsics.checkNotNullExpressionValue(it, "it");
                            cleanOldCache$deleteDir(it);
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public final String getCacheFilePath() {
        String str = cacheFilePath;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cacheFilePath");
        return null;
    }

    public final void initManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String path = context.getFilesDir().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "context.filesDir.path");
        setCacheFilePath(path);
    }

    @Nullable
    public final WebResourceResponse interceptRequest(@NotNull CacheBean cacheBean, @NotNull String url) {
        Intrinsics.checkNotNullParameter(cacheBean, "cacheBean");
        Intrinsics.checkNotNullParameter(url, "url");
        File file = new File(getCacheFilePath() + mla.SEPARATOR + cacheBean.getConfigId() + '_' + cacheBean.getVersionId());
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "it.listFiles()");
            if (!(fileArrListFiles.length == 0)) {
                return interceptRequest$loadDir(url, cacheBean, file);
            }
        }
        LogUtil.d(CacheConstants.Debug.MODEL_TAG, "本地未找到请求资源");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean saveCacheFileToLocal(@NotNull CacheBean cacheBean, @NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(cacheBean, "cacheBean");
        Intrinsics.checkNotNullParameter(file, "file");
        LogUtil.d(CacheConstants.Debug.MODEL_TAG, "保存资源文件到本地");
        if (!StringsKt__StringsJVMKt.equals(MD5.getFileMD5(file), cacheBean.getUriMD5(), true)) {
            LogUtil.d(CacheConstants.Debug.MODEL_TAG, "MD5校验失败");
        }
        File file2 = new File(getCacheFilePath() + mla.SEPARATOR + cacheBean.getConfigId() + '_' + cacheBean.getVersionId());
        File file3 = new File(file2.getParent());
        if (!file3.exists() || file3.listFiles().length <= 0) {
            file3.mkdir();
        } else {
            File[] fileArrListFiles = file3.listFiles();
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "parent.listFiles()");
            for (File file4 : fileArrListFiles) {
                file4.renameTo(new File(file4.getName() + CacheConstants.Character.OLD));
            }
        }
        file2.mkdir();
        FilesKt__UtilsKt.copyTo$default(file, new File(file2.getParent() + mla.SEPARATOR + file.getName()), false, 0, 6, null);
        File file5 = new File(file2.getParent() + mla.SEPARATOR + file.getName());
        StringBuilder sb = new StringBuilder();
        sb.append("解压文件");
        sb.append(file.getName());
        LogUtil.d(CacheConstants.Debug.MODEL_TAG, sb.toString());
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file5), Charset.forName("GBK"));
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        while (nextEntry != null) {
            File file6 = new File(file2 + mla.SEPARATOR + nextEntry.getName());
            String canonicalPath = file6.getCanonicalPath();
            Intrinsics.checkNotNullExpressionValue(canonicalPath, "current.canonicalPath");
            String string = file2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "fileRoot.toString()");
            if (StringsKt__StringsJVMKt.startsWith$default(canonicalPath, string, false, 2, null)) {
                if (nextEntry.isDirectory()) {
                    file6.mkdirs();
                } else {
                    File parentFile = file6.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    file6.createNewFile();
                    ByteStreamsKt.copyTo$default(zipInputStream instanceof BufferedInputStream ? (BufferedInputStream) zipInputStream : new BufferedInputStream(zipInputStream, 8192), new FileOutputStream(file6), 0, 2, null);
                }
                nextEntry = zipInputStream.getNextEntry();
            }
        }
        zipInputStream.closeEntry();
        zipInputStream.close();
        new FileInputStream(file5).close();
        file5.delete();
        LogUtil.d(CacheConstants.Debug.MODEL_TAG, "解压完成");
        cleanOldCache(null);
        return true;
    }

    public final void setCacheFilePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        cacheFilePath = str;
    }
}
