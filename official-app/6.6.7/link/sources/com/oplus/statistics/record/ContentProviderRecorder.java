package com.oplus.statistics.record;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.oplus.statistics.data.TrackEvent;
import com.oplus.statistics.record.ContentProviderRecorder;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ContentProviderRecorder implements IRecorder {
    public static boolean f(Context context, String str, ContentValues contentValues) {
        Uri uri = Uri.parse(str);
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            LogUtil.d("ContentProviderRecorder", new Supplier() { // from class: com.oplus.aiunit.vision.d94
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return ContentProviderRecorder.g();
                }
            });
            return false;
        }
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                LogUtil.d("ContentProviderRecorder", new Supplier() { // from class: com.oplus.aiunit.vision.e94
                    @Override // com.oplus.statistics.util.Supplier
                    public final Object get() {
                        return ContentProviderRecorder.h();
                    }
                });
                return false;
            }
            contentProviderClientAcquireUnstableContentProviderClient.insert(uri, contentValues);
            return true;
        } catch (RemoteException | IllegalArgumentException | IllegalStateException e) {
            LogUtil.e("ContentProviderRecorder", new Supplier() { // from class: com.oplus.aiunit.vision.f94
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return ContentProviderRecorder.i(e);
                }
            });
            return false;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.close();
        }
    }

    public static /* synthetic */ String g() {
        return "get resolver failed.";
    }

    public static /* synthetic */ String h() {
        return "get provider client failed.";
    }

    public static /* synthetic */ String i(Exception exc) {
        return "insert exception:" + exc;
    }

    public static boolean isSupport(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("", "");
        boolean zF = f(context, "content://com.oplus.statistics.provider/support", contentValues);
        if (!zF) {
            LogUtil.w("ContentProviderRecorder", new Supplier() { // from class: com.oplus.aiunit.vision.c94
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return ContentProviderRecorder.j();
                }
            });
        }
        return zF;
    }

    public static /* synthetic */ String j() {
        return "not support content provider";
    }

    @Override // com.oplus.statistics.record.IRecorder
    public void addTrackEvent(@NonNull Context context, @NonNull TrackEvent trackEvent) {
        f(context, "content://com.oplus.statistics.provider/track_event", e(trackEvent));
    }

    public final ContentValues e(TrackEvent trackEvent) {
        ContentValues contentValues = new ContentValues();
        for (Map.Entry<String, Object> entry : trackEvent.getTrackInfo().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                contentValues.put(key, (String) value);
            } else if (value instanceof Integer) {
                contentValues.put(key, (Integer) value);
            } else if (value instanceof Long) {
                contentValues.put(key, (Long) value);
            } else if (value instanceof Boolean) {
                contentValues.put(key, (Boolean) value);
            }
        }
        return contentValues;
    }
}
