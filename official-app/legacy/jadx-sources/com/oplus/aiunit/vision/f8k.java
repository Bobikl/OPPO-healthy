package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J6\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0007J6\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0007J(\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ@\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0002J@\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0002J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/f8k;", "", "Landroid/content/Context;", "context", "", "logTag", "eventId", "", "data", "", "f", "d", "packageName", "key", "", "defaultValue", "a", "uriString", "c", MapSchema.FIELD_NAME_ENTRY, "b", "(Landroid/content/Context;)Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isSupportBatchSubmit", "", "Landroid/content/ContentValues;", "Ljava/util/List;", "trackList", "", "J", "lastUploadTime", "lastGetMataTime", "<init>", "()V", "track_release"}, k = 1, mv = {1, 6, 0})
public final class f8k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static volatile Boolean isSupportBatchSubmit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static long lastUploadTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static long lastGetMataTime;

    @NotNull
    public static final f8k INSTANCE = new f8k();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<ContentValues> trackList = new ArrayList();

    @JvmStatic
    public static final void d(@NotNull Context context, @NotNull String logTag, @NotNull String eventId, @Nullable Map<String, String> data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        INSTANCE.c("content://com.oplus.pantanal.ums.track/business", context, logTag, eventId, data);
    }

    @JvmStatic
    public static final void f(@NotNull Context context, @NotNull String logTag, @NotNull String eventId, @Nullable Map<String, String> data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        INSTANCE.c("content://com.oplus.pantanal.ums.track/technology", context, logTag, eventId, data);
    }

    public final boolean a(@NotNull Context context, @NotNull String packageName, @NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(key, "key");
        Log.i("TrackUtil", Intrinsics.stringPlus("get MetaValue key: ", key));
        try {
            return context.getPackageManager().getApplicationInfo(packageName, 128).metaData.getBoolean(key);
        } catch (Exception e2) {
            Log.i("TrackUtil", "getBooleanMetaValue:" + key + ", error: " + ((Object) e2.getMessage()));
            return defaultValue;
        }
    }

    public final Boolean b(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis() - lastGetMataTime;
        if (isSupportBatchSubmit == null || jCurrentTimeMillis > 300000) {
            isSupportBatchSubmit = Boolean.valueOf(a(context, "com.oplus.pantanal.ums", "isSupportTrackBatchSubmit", false));
            lastGetMataTime = System.currentTimeMillis();
            Log.i("TrackUtil", Intrinsics.stringPlus("isSupportBatchSubmit: ", isSupportBatchSubmit));
        }
        return isSupportBatchSubmit;
    }

    public final void c(String uriString, Context context, String logTag, String eventId, Map<String, String> data) {
        if (Intrinsics.areEqual(b(context), Boolean.TRUE)) {
            e(uriString, context, logTag, eventId, data);
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (logTag != null) {
                contentValues.put("logTag", logTag);
            }
            contentValues.put("eventId", eventId);
            contentValues.put("data", String.valueOf(data));
            Uri uri = Uri.parse(uriString);
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    return;
                }
                try {
                    contentProviderClientAcquireUnstableContentProviderClient.insert(uri, contentValues);
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                } catch (RemoteException e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
                throw th;
            }
        } catch (Exception e3) {
            Log.e("TrackUtil", Intrinsics.stringPlus("insert error: ", e3.getMessage()));
        }
    }

    public final void e(String uriString, Context context, String logTag, String eventId, Map<String, String> data) {
        synchronized (this) {
            List<ContentValues> list = trackList;
            ContentValues contentValues = new ContentValues();
            if (logTag != null) {
                contentValues.put("logTag", logTag);
            }
            contentValues.put("eventId", eventId);
            contentValues.put("data", String.valueOf(data));
            contentValues.put(ParserTag.TAG_URI, uriString);
            list.add(contentValues);
            long jCurrentTimeMillis = System.currentTimeMillis() - lastUploadTime;
            if (list.size() >= 30 || jCurrentTimeMillis >= 60000) {
                Log.i("TrackUtil", Intrinsics.stringPlus("submit track cache, size: ", Integer.valueOf(list.size())));
                try {
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(Uri.parse("content://com.oplus.pantanal.ums.track"));
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            try {
                                Uri uri = Uri.parse(uriString);
                                Object[] array = list.toArray(new ContentValues[0]);
                                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                contentProviderClientAcquireUnstableContentProviderClient.bulkInsert(uri, (ContentValues[]) array);
                                contentProviderClientAcquireUnstableContentProviderClient.close();
                            } catch (RemoteException e2) {
                                throw e2;
                            }
                        } catch (Throwable th) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    Log.e("TrackUtil", Intrinsics.stringPlus("insert error: ", e3.getMessage()));
                }
                trackList.clear();
                lastUploadTime = System.currentTimeMillis();
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
