package com.heytap.health.sport;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&Je\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH&J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH&JI\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/heytap/health/sport/ISportRecordQueryService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroid/content/Context;", "context", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "record", "Lkotlin/Pair;", "", "", "p1", "data", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "valueStr", "", "value", "formatString", "", "callback", "e3", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "r8", "trainType", "", "startTime", "endTime", "sortOrder", "anchor", "count", "", "a0", "(IJJIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sport_release"}, k = 1, mv = {1, 8, 0})
public interface ISportRecordQueryService extends IProvider {
    @Nullable
    Object a0(int i, long j2, long j3, int i2, int i3, int i4, @NotNull Continuation<? super List<? extends TrackMetadataStat>> continuation);

    void e3(@NotNull Context context, @NotNull TrackMetadataStat data, @NotNull Function3<? super String, ? super Double, ? super String, Unit> callback);

    @NotNull
    Pair<String, Integer> p1(@NotNull Context context, @NotNull TrackMetadataStat record);

    int r8(int sportMode);
}
