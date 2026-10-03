package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\bH&¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/zr9;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "getMacAddress", "", "b", "data", "", "a", "", "syncTime", "c", "clear", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public interface zr9<T> {
    void a(@NotNull List<? extends T> data);

    @NotNull
    List<T> b();

    void c(long syncTime);

    void clear();

    @NotNull
    String getMacAddress();
}
