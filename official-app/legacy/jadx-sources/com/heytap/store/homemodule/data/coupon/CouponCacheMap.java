package com.heytap.store.homemodule.data.coupon;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.smartenginehelper.ParserTag;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nJ#\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/homemodule/data/coupon/CouponCacheMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "dataMap", "", "", "getDataMap", "()Ljava/util/Map;", "timeStampMap", "", "getTimeStampMap", ParserTag.TAG_GET, "key", "(Ljava/lang/String;)Ljava/lang/Object;", "getUnExpiredDataOrNull", SpeechConstant.KEY_TTS_TIMESTAMP, "(Ljava/lang/String;J)Ljava/lang/Object;", "hasUnExpiredData", "", "put", "", "data", "(Ljava/lang/String;JLjava/lang/Object;)V", EventType.STATE_PACKAGE_CHANGED_REMOVE, "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CouponCacheMap<T> {

    @NotNull
    private final Map<String, T> dataMap = new LinkedHashMap();

    @NotNull
    private final Map<String, Long> timeStampMap = new LinkedHashMap();

    @Nullable
    public final T get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.dataMap.get(key);
    }

    @NotNull
    public final Map<String, T> getDataMap() {
        return this.dataMap;
    }

    @NotNull
    public final Map<String, Long> getTimeStampMap() {
        return this.timeStampMap;
    }

    @Nullable
    public final T getUnExpiredDataOrNull(@NotNull String key, long timeStamp) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (hasUnExpiredData(key, timeStamp)) {
            return get(key);
        }
        return null;
    }

    public final boolean hasUnExpiredData(@NotNull String key, long timeStamp) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long l2 = this.timeStampMap.get(key);
        return l2 != null && l2.longValue() >= timeStamp;
    }

    public final void put(@NotNull String key, long timeStamp, T data) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.dataMap.put(key, data);
        this.timeStampMap.put(key, Long.valueOf(timeStamp));
    }

    public final void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.dataMap.remove(key);
        this.timeStampMap.remove(key);
    }
}
