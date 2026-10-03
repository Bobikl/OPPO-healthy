package com.heytap.health.operations.timeline;

import androidx.exifinterface.media.ExifInterface;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.TimelineCardItem;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/operations/timeline/ITimelineCardService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "dayTimestamp", "", "Lcom/oplus/aiunit/vision/d0k;", "Y", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ExifInterface.LONGITUDE_WEST, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTime", "endTime", "", "Wa", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface ITimelineCardService extends IProvider {
    @Nullable
    Object W(@NotNull Continuation<? super Boolean> continuation);

    @NotNull
    String Wa(long startTime, long endTime);

    @Nullable
    Object Y(long j2, @NotNull Continuation<? super List<TimelineCardItem>> continuation);
}
