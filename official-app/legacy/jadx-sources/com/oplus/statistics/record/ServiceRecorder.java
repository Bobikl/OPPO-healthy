package com.oplus.statistics.record;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.oplus.statistics.data.TrackEvent;
import com.oplus.statistics.record.ServiceRecorder;
import com.oplus.statistics.util.Constant;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ServiceRecorder implements IRecorder {
    public static final String a = new String(Base64.decode(Constant.DCS_PKG, 0), StandardCharsets.UTF_8);
    public static final String b = new String(Base64.decode(Constant.DCS_SERVICE, 0), StandardCharsets.UTF_8);

    public static /* synthetic */ String d(Context context) {
        return "add Task failed: bean or context is null. context=" + context;
    }

    public static /* synthetic */ String e(Exception exc) {
        return "startService exception=" + exc;
    }

    @Override // com.oplus.statistics.record.IRecorder
    public void addTrackEvent(@NonNull final Context context, @NonNull TrackEvent trackEvent) {
        if (trackEvent == null || context == null) {
            LogUtil.d("ServiceRecorder", new Supplier() { // from class: com.oplus.aiunit.vision.ovg
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return ServiceRecorder.d(context);
                }
            });
            return;
        }
        try {
            context.startService(c(trackEvent));
        } catch (Exception e2) {
            LogUtil.w("ServiceRecorder", new Supplier() { // from class: com.oplus.aiunit.vision.pvg
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return ServiceRecorder.e(e2);
                }
            });
        }
    }

    public final Intent c(TrackEvent trackEvent) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(a, b));
        for (Map.Entry<String, Object> entry : trackEvent.getTrackInfo().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                intent.putExtra(key, (String) value);
            } else if (value instanceof Integer) {
                intent.putExtra(key, (Integer) value);
            } else if (value instanceof Long) {
                intent.putExtra(key, (Long) value);
            } else if (value instanceof Boolean) {
                intent.putExtra(key, (Boolean) value);
            }
        }
        return intent;
    }
}
