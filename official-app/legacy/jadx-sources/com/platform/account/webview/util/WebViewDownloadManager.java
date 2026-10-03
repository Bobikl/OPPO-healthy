package com.platform.account.webview.util;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.NonNull;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.bn;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewDownloadManager {
    public static final Map<Long, a> a = new HashMap();
    public static DownloadReceiver b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f20259c;

    public static class DownloadReceiver extends BroadcastReceiver {
        /* JADX WARN: Code duplicated, block: B:43:0x0115 A[Catch: all -> 0x0123, Exception -> 0x0126, TRY_LEAVE, TryCatch #4 {Exception -> 0x0126, all -> 0x0123, blocks: (B:22:0x0075, B:24:0x007b, B:26:0x0090, B:29:0x009c, B:32:0x00ba, B:36:0x00c3, B:35:0x00c1, B:40:0x00e1, B:41:0x00e5, B:42:0x00fd, B:43:0x0115), top: B:66:0x0075 }] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            if (intent == null || !"android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                return;
            }
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            bn.b("WebViewDownloadManager", "Download completed, id: " + longExtra);
            a aVar = (a) WebViewDownloadManager.a.remove(Long.valueOf(longExtra));
            if (aVar == null) {
                WebViewDownloadManager.e();
                return;
            }
            b bVar = aVar.a;
            if (bVar == null) {
                WebViewDownloadManager.e();
                return;
            }
            DownloadManager downloadManager = (DownloadManager) context.getSystemService(a8i.DOWNLOAD);
            if (downloadManager == null) {
                bVar.a(false, "DownloadManager service not available");
                WebViewDownloadManager.e();
                return;
            }
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(longExtra);
            Cursor cursor = null;
            cursor = null;
            try {
                try {
                    Cursor cursorQuery = downloadManager.query(query);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("status");
                                int columnIndex2 = cursorQuery.getColumnIndex(EngineConstant.REASON);
                                int columnIndex3 = cursorQuery.getColumnIndex("local_uri");
                                if (columnIndex == -1) {
                                    bVar.a(false, "Cannot get download status");
                                    cursorQuery.close();
                                    WebViewDownloadManager.e();
                                    return;
                                }
                                int i = cursorQuery.getInt(columnIndex);
                                bn.b("WebViewDownloadManager", "Download status: " + i);
                                if (i == 8) {
                                    String string = columnIndex3 != -1 ? cursorQuery.getString(columnIndex3) : null;
                                    if (string == null) {
                                        string = aVar.b;
                                    }
                                    bn.b("WebViewDownloadManager", "Download successful, path: " + string);
                                    bVar.a(true, string);
                                } else if (i == 16) {
                                    String str = "Download failed, reason code: " + (columnIndex2 != -1 ? cursorQuery.getInt(columnIndex2) : -1);
                                    bn.c("WebViewDownloadManager", str);
                                    bVar.a(false, str);
                                } else {
                                    String str2 = "Download in unexpected status: " + i;
                                    bn.b("WebViewDownloadManager", str2);
                                    bVar.a(false, str2);
                                }
                            } else {
                                bVar.a(false, "Download record not found");
                            }
                        } catch (Exception e2) {
                            e = e2;
                            cursor = cursorQuery;
                            String str3 = "Query download status error: " + e.getMessage();
                            bn.c("WebViewDownloadManager", str3);
                            bVar.a(false, str3);
                            if (cursor != null) {
                                cursor.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            WebViewDownloadManager.e();
                            throw th;
                        }
                    } else {
                        bVar.a(false, "Download record not found");
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                WebViewDownloadManager.e();
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static class a {
        public b a;
        public String b;

        public a(b bVar, String str) {
            this.a = bVar;
            this.b = str;
        }
    }

    public interface b {
        void a(boolean z, String str);
    }

    public static void c(@NonNull Activity activity, String str, b bVar) {
        String lastPathSegment;
        bn.b("WebViewDownloadManager", "download url: " + str);
        try {
            Uri uri = Uri.parse(str);
            try {
                lastPathSegment = uri.getLastPathSegment();
            } catch (Exception e2) {
                bn.c("WebViewDownloadManager", "startDownload. getLastPathSegment fail:" + e2.getMessage());
                lastPathSegment = "unKnow";
            }
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, lastPathSegment);
            DownloadManager downloadManager = (DownloadManager) activity.getSystemService(a8i.DOWNLOAD);
            if (downloadManager == null) {
                bn.c("WebViewDownloadManager", "DownloadManager service not available");
                if (bVar != null) {
                    bVar.a(false, "DownloadManager service not available");
                    return;
                }
                return;
            }
            d(activity.getApplicationContext());
            long jEnqueue = downloadManager.enqueue(request);
            bn.b("WebViewDownloadManager", "download enqueued with id: " + jEnqueue);
            a.put(Long.valueOf(jEnqueue), new a(bVar, Environment.DIRECTORY_DOWNLOADS + File.separator + lastPathSegment));
        } catch (Exception e3) {
            String str2 = "startDownload fail:" + e3.getMessage();
            bn.c("WebViewDownloadManager", str2);
            if (bVar != null) {
                bVar.a(false, str2);
            }
        }
    }

    public static void d(Context context) {
        if (b == null) {
            f20259c = context.getApplicationContext();
            b = new DownloadReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    f20259c.registerReceiver(b, intentFilter, 2);
                } else {
                    f20259c.registerReceiver(b, intentFilter);
                }
                bn.b("WebViewDownloadManager", "DownloadReceiver registered");
            } catch (Exception e2) {
                bn.c("WebViewDownloadManager", "Failed to register receiver: " + e2.getMessage());
                b = null;
            }
        }
    }

    public static void e() {
        DownloadReceiver downloadReceiver;
        Context context;
        if (!a.isEmpty() || (downloadReceiver = b) == null || (context = f20259c) == null) {
            return;
        }
        try {
            context.unregisterReceiver(downloadReceiver);
            b = null;
            f20259c = null;
            bn.b("WebViewDownloadManager", "DownloadReceiver unregistered (no pending downloads)");
        } catch (Exception e2) {
            bn.c("WebViewDownloadManager", "unregisterReceiver error: " + e2.getMessage());
        }
    }
}
