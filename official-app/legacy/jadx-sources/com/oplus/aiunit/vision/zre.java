package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.store.base.core.util.download.DownLoadTask;
import com.heytap.store.platform.download.DownloadManagerImpl;
import com.heytap.store.platform.tools.LogUtils;
import io.protostuff.MapSchema;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/zre;", "", "", "rawUrl", "Lcom/oplus/aiunit/vision/jv9;", "cacheListener", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "d", "url", "b", "listener", "f", "content", "c", "a", "Ljava/lang/String;", "basePath", "", "Ljava/util/Map;", "listenerMap", "<init>", "()V", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
public final class zre {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String basePath;

    @NotNull
    public static final zre INSTANCE = new zre();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, jv9> listenerMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\"\u0010\u000f\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"com/oplus/aiunit/vision/zre$a", "Lcom/heytap/store/base/core/util/download/DownLoadTask$DownLoadListener;", "", "", "onDownLoadStart", "t", "", MapSchema.FIELD_NAME_ENTRY, "onFailure", "", "pisiton", "onSuccess", "", Element.ELEMENT_NAME_TOTAL, "current", "updateProgress", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
    public static final class a implements DownLoadTask.DownLoadListener<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f19532c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.f19532c = str3;
        }

        public static final void c(String str, Throwable th) {
            zre zreVar = zre.INSTANCE;
            jv9 jv9VarB = zreVar.b(str);
            if (jv9VarB != null) {
                jv9VarB.a(String.valueOf(th));
            }
            zreVar.f(str, null);
        }

        public static final void d(String str, String finalFile) {
            Intrinsics.checkNotNullParameter(finalFile, "$finalFile");
            zre zreVar = zre.INSTANCE;
            jv9 jv9VarB = zreVar.b(str);
            if (jv9VarB != null) {
                jv9VarB.b(finalFile);
            }
            zreVar.f(str, null);
        }

        @Override // com.heytap.store.base.core.util.download.DownLoadTask.DownLoadListener
        public void onDownLoadStart() {
        }

        @Override // com.heytap.store.base.core.util.download.DownLoadTask.DownLoadListener
        public void onFailure(@Nullable Object t, @Nullable final Throwable e2) {
            Handler handler = new Handler(Looper.getMainLooper());
            final String str = this.a;
            handler.post(new Runnable() { // from class: com.oplus.aiunit.vision.xre
                @Override // java.lang.Runnable
                public final void run() {
                    zre.a.c(str, e2);
                }
            });
        }

        @Override // com.heytap.store.base.core.util.download.DownLoadTask.DownLoadListener
        public void onSuccess(@Nullable Object t, int pisiton) {
            new File(zre.basePath, this.b).renameTo(new File(this.f19532c));
            Handler handler = new Handler(Looper.getMainLooper());
            final String str = this.a;
            final String str2 = this.f19532c;
            handler.post(new Runnable() { // from class: com.oplus.aiunit.vision.yre
                @Override // java.lang.Runnable
                public final void run() {
                    zre.a.d(str, str2);
                }
            });
        }

        @Override // com.heytap.store.base.core.util.download.DownLoadTask.DownLoadListener
        public void updateProgress(@Nullable Object t, long total, long current) {
            jv9 jv9VarB = zre.INSTANCE.b(this.a);
            if (jv9VarB != null) {
                jv9VarB.c((int) ((current / total) * 100));
            }
        }
    }

    @JvmStatic
    public static final void e(@Nullable String rawUrl, @NotNull jv9 cacheListener) {
        Intrinsics.checkNotNullParameter(cacheListener, "cacheListener");
        if (rawUrl == null || rawUrl.length() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        zre zreVar = INSTANCE;
        sb.append(zreVar.c(rawUrl));
        sb.append(".mp4");
        String string = sb.toString();
        String str = string + "Temp";
        String str2 = basePath + mla.SEPARATOR + string;
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.i("jarvanTest the file is " + str2);
        if (new File(str2).exists()) {
            logUtils.i("jarvanTest the file : " + str2 + "  , exist ");
            cacheListener.b(str2);
            return;
        }
        logUtils.i("jarvanTest the file : " + str2 + "  need to download  ");
        boolean z = zreVar.b(rawUrl) != null;
        zreVar.f(rawUrl, cacheListener);
        if (z) {
            return;
        }
        DownloadManagerImpl.getInstance().download(rawUrl, new a(rawUrl, str, str2), basePath, str, false, true, true);
    }

    @Nullable
    public final synchronized jv9 b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return listenerMap.get(url);
    }

    public final String c(String content) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] hash = messageDigest.digest(bytes);
        StringBuilder sb = new StringBuilder(hash.length * 2);
        Intrinsics.checkNotNullExpressionValue(hash, "hash");
        for (byte b : hash) {
            String str = Integer.toHexString(b);
            if (b < 16) {
                str = '0' + str;
            }
            Intrinsics.checkNotNullExpressionValue(str, "str");
            String strSubstring = str.substring(str.length() - 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb.append(strSubstring);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "hex.toString()");
        return string;
    }

    public final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS));
        sb.append(mla.SEPARATOR);
        basePath = sb.toString();
    }

    public final synchronized void f(@NotNull String url, @Nullable jv9 listener) {
        Intrinsics.checkNotNullParameter(url, "url");
        listenerMap.put(url, listener);
    }
}
