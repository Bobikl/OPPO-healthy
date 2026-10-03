package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0004\u001a\u00020\u0003H&J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/bsb;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "key", "", "b", "", ParserTag.TAG_GET, "data", "", "a", EventType.STATE_PACKAGE_CHANGED_REMOVE, "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public interface bsb<T> {
    void a(@NotNull String key, @NotNull List<? extends T> data);

    boolean b(@NotNull String key);

    @NotNull
    List<T> get(@NotNull String key);

    void remove(@NotNull String key);
}
