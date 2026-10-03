package com.heytap.health.health_archives.autosync;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.pdf.PdfRenderer;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.base.R$mipmap;
import com.heytap.health.base.notification.NotificationConfig;
import com.heytap.health.health_archives.HealthArchivesActivity;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.bean.ArchiveSettingBean;
import com.heytap.health.health_archives.bean.HealthBusinessCode;
import com.heytap.health.health_archives.helper.ArchivesRetrofitHelper;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.hfg;
import com.oplus.aiunit.vision.km8;
import com.oplus.aiunit.vision.qg0;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.u61;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Result;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\"\u0010\t\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0014\u0010\n\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0001\u001a\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0001\u001a\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u0006\u0010\u0012\u001a\u00020\u0003\u001a\u0006\u0010\u0013\u001a\u00020\u0005\u001a\u0012\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u001a\u0018\u0010\u001a\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u0003\u001a'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000e\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0001\u001a\u000e\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0016\u001a$\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010#2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&\u001a\u001a\u0010+\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010*\u001a\u00020\u0016\"\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"", "", "owners", "", "autoSyncNameConfirm", "", "s", "oldOwners", "newEditOwners", "r", "n", "c", "ownerName", LogFieldKey.LEVEL_KEY, b2n.g, "content", LogFieldKey.PROCESS_NAME_KEY, "q", "a", "o", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "d", "Lkotlin/coroutines/Continuation;", "value", LogFieldKey.MESSAGE_KEY, "", "filePaths", "b", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pdfFilePath", "f", "classifyCode", "i", ExifInterface.GPS_DIRECTION_TRUE, "", "error", "Lcom/heytap/health/health_archives/bean/HealthBusinessCode;", "defaultError", "Lcom/heytap/health/network/core/BaseResponse;", b2n.f, "maxDepth", "j", "Ljava/util/List;", "IMAGE_ALLOW_UPLOAD_CLASSIFY_CODES", "health_archives_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "ArchiveUploadHelper")
@SourceDebugExtension({"SMAP\nArchiveUploadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveUploadHelper.kt\ncom/heytap/health/health_archives/autosync/ArchiveUploadHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,405:1\n1855#2:406\n1747#2,3:407\n1856#2:410\n1549#2:411\n1620#2,2:412\n1622#2:415\n1855#2:416\n1747#2,3:417\n1856#2:420\n1855#2:421\n1747#2,3:422\n1856#2:425\n1747#2,3:426\n766#2:429\n857#2,2:430\n1603#2,9:432\n1855#2:441\n1856#2:443\n1612#2:444\n1#3:414\n1#3:442\n*S KotlinDebug\n*F\n+ 1 ArchiveUploadHelper.kt\ncom/heytap/health/health_archives/autosync/ArchiveUploadHelper\n*L\n74#1:406\n78#1:407,3\n74#1:410\n93#1:411\n93#1:412,2\n93#1:415\n95#1:416\n99#1:417,3\n95#1:420\n115#1:421\n119#1:422,3\n115#1:425\n166#1:426,3\n311#1:429\n311#1:430,2\n316#1:432,9\n316#1:441\n316#1:443\n316#1:444\n316#1:442\n*E\n"})
public final class ArchiveUploadHelper {

    @NotNull
    public static final List<Integer> a = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(HealthBusinessCode.SUCCESS.getCode()), Integer.valueOf(HealthBusinessCode.FILE_IS_NOT_HEALTH_DOC.getCode()), Integer.valueOf(HealthBusinessCode.FILE_OCR_RESP_NULL.getCode()), Integer.valueOf(HealthBusinessCode.QUALITY_CTRL_MUTIL_BACKGROUND.getCode())});

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/health_archives/autosync/ArchiveUploadHelper$a", "Lcom/oplus/aiunit/vision/u61;", "", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "errMsg", "b", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends u61<String> {
        public final /* synthetic */ Map<String, Integer> i;

        public a(Map<String, Integer> map) {
            this.i = map;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(@Nullable Throwable e2, @Nullable String errMsg) {
            a7b.b("ArchiveUploadHelper", "setAutoSyncSwitchToCloud error : " + errMsg);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@Nullable String result) {
            qg0.m(sc8.g(this.i));
            String strB = qg0.b();
            StringBuilder sb = new StringBuilder();
            sb.append("setAutoSyncSwitchToCloud: ");
            sb.append(strB);
        }
    }

    public static final boolean a() {
        List listD;
        a7b.f("ArchiveUploadHelper", "syncTimeListStr = " + qg0.e().D(qg0.AUTO_SYNC_EXECUTE_TIME_LIST));
        String workerTimeListStr = qg0.e().D(qg0.SYNC_WORKER_TIME_LIST);
        Intrinsics.checkNotNullExpressionValue(workerTimeListStr, "workerTimeListStr");
        if ((workerTimeListStr.length() == 0) || (listD = sc8.d(workerTimeListStr, String.class)) == null) {
            listD = new ArrayList();
        }
        if (listD.isEmpty()) {
            return true;
        }
        a7b.f("ArchiveUploadHelper", "workerTimeList = " + workerTimeListStr);
        return System.currentTimeMillis() - Long.parseLong((String) CollectionsKt___CollectionsKt.last(listD)) < TimeUnit.DAYS.toMillis(1L);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009e -> B:30:0x00a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r8, @org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r9) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.health_archives.autosync.ArchiveUploadHelper.b(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final List<String> c() {
        List<String> listD = sc8.d(qg0.e().D(qg0.ARCHIVES_OWNERS_TO_CONFIRM), String.class);
        return listD == null ? new ArrayList() : listD;
    }

    public static final int d(@Nullable ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            Object systemService = b78.a().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return -1;
        }
        if (networkCapabilities.hasTransport(1)) {
            return 1;
        }
        return networkCapabilities.hasTransport(0) ? 2 : -1;
    }

    public static /* synthetic */ int e(ConnectivityManager connectivityManager, int i, Object obj) {
        if ((i & 1) != 0) {
            connectivityManager = null;
        }
        return d(connectivityManager);
    }

    public static final int f(@NotNull String pdfFilePath) throws IOException {
        Intrinsics.checkNotNullParameter(pdfFilePath, "pdfFilePath");
        ParcelFileDescriptor parcelFileDescriptorOpen = null;
        try {
            parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(pdfFilePath), 268435456);
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
            int pageCount = pdfRenderer.getPageCount();
            pdfRenderer.close();
            parcelFileDescriptorOpen.close();
            return pageCount;
        } catch (IOException e2) {
            a7b.b("ArchiveUploadHelper", "PdfRenderer IO failed : " + e2.getMessage());
            if (parcelFileDescriptorOpen != null) {
                parcelFileDescriptorOpen.close();
            }
            return 0;
        } catch (SecurityException e3) {
            a7b.b("ArchiveUploadHelper", "pdfDescriptor need password ，open failed : " + e3.getMessage());
            if (parcelFileDescriptorOpen != null) {
                parcelFileDescriptorOpen.close();
            }
            return 0;
        } catch (Exception e4) {
            a7b.b("ArchiveUploadHelper", "PdfRenderer other failed : " + e4.getMessage());
            if (parcelFileDescriptorOpen != null) {
                parcelFileDescriptorOpen.close();
            }
            return 0;
        }
    }

    @NotNull
    public static final <T> BaseResponse<T> g(@Nullable Throwable th, @NotNull HealthBusinessCode defaultError) {
        Intrinsics.checkNotNullParameter(defaultError, "defaultError");
        BaseResponse<T> baseResponse = new BaseResponse<>();
        if (!rpc.c() || k(th, 0, 2, null)) {
            HealthBusinessCode healthBusinessCode = HealthBusinessCode.NET_TIMEOUT_ERROR;
            baseResponse.setErrorCode(healthBusinessCode.getCode());
            baseResponse.setMessage(qtf.l(healthBusinessCode.getDescription()));
        } else {
            baseResponse.setErrorCode(defaultError.getCode());
            baseResponse.setMessage(qtf.l(defaultError.getDescription()));
        }
        return baseResponse;
    }

    public static final boolean h(@NotNull String ownerName) {
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        if (ownerName.length() == 0) {
            ownerName = qtf.l(R$string.health_archives_no_name);
        }
        String strD = qg0.e().D(qg0.NEW_ARCHIVES_OWNS);
        StringBuilder sb = new StringBuilder();
        sb.append("updateOwnerRedDot: ");
        sb.append(strD);
        Iterable iterableD = sc8.d(strD, String.class);
        if (iterableD == null) {
            iterableD = new ArrayList();
        }
        Iterable iterable = iterableD;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), ownerName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean i(int i) {
        return a.contains(Integer.valueOf(i));
    }

    public static final boolean j(@Nullable Throwable th, int i) {
        for (int i2 = 0; th != null && i2 < i; i2++) {
            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static /* synthetic */ boolean k(Throwable th, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        return j(th, i);
    }

    public static final boolean l(@NotNull String ownerName) {
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        List listD = sc8.d(qg0.e().D(qg0.NEW_ARCHIVES_OWNS), String.class);
        if (listD == null) {
            listD = new ArrayList();
        }
        boolean zRemove = true ^ listD.isEmpty() ? listD.remove(ownerName.length() == 0 ? qtf.l(R$string.health_archives_no_name) : ownerName) : false;
        if (zRemove) {
            StringBuilder sb = new StringBuilder();
            sb.append("removeNewUploadOwner: ");
            sb.append(ownerName);
            qg0.e().U(qg0.NEW_ARCHIVES_OWNS, sc8.g(listD));
        }
        return zRemove;
    }

    public static final void m(@NotNull Continuation<? super Boolean> continuation, boolean z) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        try {
            continuation.resumeWith(Result.m5287constructorimpl(Boolean.valueOf(z)));
        } catch (Exception e2) {
            a7b.b("ArchiveUploadHelper", "resumeCatchException: " + e2.getMessage());
        }
    }

    public static final void n(@NotNull List<String> owners) {
        boolean z;
        Intrinsics.checkNotNullParameter(owners, "owners");
        String strD = qg0.e().D("archives_belonged");
        if (strD == null || strD.length() == 0) {
            List listD = sc8.d(qg0.e().D(qg0.ARCHIVES_OWNERS_TO_CONFIRM), String.class);
            if (listD == null) {
                listD = new ArrayList();
            }
            for (String str : owners) {
                if (!(str.length() == 0)) {
                    List list = listD;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.areEqual((String) it.next(), str)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        z = false;
                        break;
                    }
                    if (!z) {
                        listD.add(str);
                    }
                }
            }
            qg0.e().U(qg0.ARCHIVES_OWNERS_TO_CONFIRM, sc8.g(listD));
        }
    }

    public static final void o() {
        List listD;
        String syncTimeListStr = qg0.e().D(qg0.AUTO_SYNC_EXECUTE_TIME_LIST);
        Intrinsics.checkNotNullExpressionValue(syncTimeListStr, "syncTimeListStr");
        if ((syncTimeListStr.length() == 0) || (listD = sc8.d(syncTimeListStr, String.class)) == null) {
            listD = new ArrayList();
        }
        listD.add(String.valueOf(System.currentTimeMillis()));
        qg0.e().U(qg0.AUTO_SYNC_EXECUTE_TIME_LIST, sc8.g(CollectionsKt___CollectionsKt.takeLast(listD, 10)));
    }

    public static final void p(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Context contextA = b78.a();
        PendingIntent activity = PendingIntent.getActivity(contextA, 100, new Intent(contextA, (Class<?>) HealthArchivesActivity.class), Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456);
        NotificationConfig notificationConfig = NotificationConfig.INSTANCE;
        NotificationChannel notificationChannel = new NotificationChannel(notificationConfig.c().getChannelId(), notificationConfig.c().getChannelName(), 3);
        notificationChannel.enableLights(false);
        notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
        notificationChannel.setShowBadge(true);
        notificationChannel.setSound(null, null);
        notificationChannel.enableVibration(false);
        notificationChannel.setLockscreenVisibility(1);
        NotificationManager notificationManager = (NotificationManager) contextA.getSystemService(NotificationManager.class);
        notificationManager.createNotificationChannel(notificationChannel);
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(contextA, notificationConfig.c().getChannelId()).setSmallIcon(R$mipmap.lib_base_ic_launcher).setOngoing(false).setContentIntent(activity).setContentTitle(content).setPriority(0).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "Builder(context, Notific…     .setAutoCancel(true)");
        notificationManager.notify(R$id.health_archives_notify_id_foreground, autoCancel.build());
    }

    public static final void q() {
        Map mapMapOf = (Map) sc8.b(qg0.b(), new TypeToken<Map<String, ? extends Integer>>() { // from class: com.heytap.health.health_archives.autosync.ArchiveUploadHelper$setAutoSyncSwitchToCloud$savedMap$1
        }.getType());
        if (mapMapOf == null || mapMapOf.isEmpty()) {
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to(qg0.AUTO_SYNC_ALBUM_SWITCH, Integer.valueOf(qg0.c() == 1 ? 1 : 0));
            pairArr[1] = TuplesKt.to(qg0.AUTO_SYNC_PDF_SWITCH, Integer.valueOf(qg0.d() == 1 ? 1 : 0));
            mapMapOf = MapsKt__MapsKt.mapOf(pairArr);
        } else {
            mapMapOf.put(qg0.AUTO_SYNC_ALBUM_SWITCH, Integer.valueOf(qg0.c() == 1 ? 1 : 0));
            mapMapOf.put(qg0.AUTO_SYNC_PDF_SWITCH, Integer.valueOf(qg0.d() == 1 ? 1 : 0));
        }
        km8 km8Var = (km8) ArchivesRetrofitHelper.b(km8.class);
        String packageName = b78.a().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getAppContext().packageName");
        String strG = sc8.g(mapMapOf);
        Intrinsics.checkNotNullExpressionValue(strG, "toJson(switchMap)");
        km8Var.n(new ArchiveSettingBean(packageName, qg0.HEALTH_DOC_SETTING_KEY, strG)).L0(hfg.d()).n0(f30.c()).subscribe(new a(mapMapOf));
    }

    public static final void r(@NotNull List<String> oldOwners, @NotNull List<String> newEditOwners) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldOwners, "oldOwners");
        Intrinsics.checkNotNullParameter(newEditOwners, "newEditOwners");
        List listD = sc8.d(qg0.e().D(qg0.NEW_ARCHIVES_OWNS), String.class);
        if (listD == null) {
            listD = new ArrayList();
        }
        List<String> list = oldOwners;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String strL = (String) it.next();
            if (strL.length() == 0) {
                strL = qtf.l(R$string.health_archives_no_name);
            }
            arrayList.add(strL);
        }
        listD.removeAll(arrayList);
        for (String strL2 : newEditOwners) {
            if (strL2.length() == 0) {
                strL2 = qtf.l(R$string.health_archives_no_name);
            }
            List list2 = listD;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.areEqual((String) it2.next(), strL2)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                listD.add(strL2);
            }
        }
        qg0.e().U(qg0.NEW_ARCHIVES_OWNS, sc8.g(listD));
    }

    public static final void s(@NotNull List<String> owners, boolean z) {
        Intrinsics.checkNotNullParameter(owners, "owners");
        List listD = sc8.d(qg0.e().D(qg0.NEW_ARCHIVES_OWNS), String.class);
        if (listD == null) {
            listD = new ArrayList();
        }
        for (String strL : owners) {
            boolean z2 = true;
            if (strL.length() == 0) {
                strL = qtf.l(R$string.health_archives_no_name);
            }
            List list = listD;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                } while (!Intrinsics.areEqual((String) it.next(), strL));
            } else {
                z2 = false;
                break;
            }
            if (!z2) {
                listD.add(strL);
            }
        }
        qg0.e().U(qg0.NEW_ARCHIVES_OWNS, sc8.g(listD));
        if (z) {
            n(owners);
        }
    }

    public static /* synthetic */ void t(List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        s(list, z);
    }
}
