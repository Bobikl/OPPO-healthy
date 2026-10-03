package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.t9m;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H&J3\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n0\u0006H&J9\u0010\u0015\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H&J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/xmm;", "Lcom/oplus/aiunit/vision/t9m;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/vmm;", "", "reqData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "event", "", "call", "d", "", "widgetCode", "observeData", "callback", "b", "", "observeIds", "Lcom/oplus/aiunit/vision/ejm;", "c", "unObserve", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public interface xmm<T extends t9m> extends vmm {
    void b(@NotNull String widgetCode, @NotNull Function1<? super byte[], Unit> callback);

    void c(@NotNull List<String> observeIds, @NotNull Function1<? super CardStateEvent, Unit> call);

    void d(@NotNull byte[] reqData, @NotNull Function1<? super T, Unit> call);

    void unObserve(@NotNull String widgetCode);
}
