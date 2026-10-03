package com.heytap.health.menstrual.inter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.menstrual.data.CycleSetting;
import com.heytap.health.menstrual.data.MenstrualCyclePredictiveBean;
import com.heytap.health.menstrual.data.MenstrualSystemCardData;
import com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomData;
import com.oplus.aiunit.vision.Cycle;
import com.oplus.aiunit.vision.PhaseDaysResult;
import java.time.LocalDate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\b\u0010\t\u001a\u00020\u0004H&J\u0013\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\b\u0010\u0012\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0010H&J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00020\u0014H&J\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010\u001b\u001a\u00020\nH&J#\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH¦@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0010H&J\b\u0010#\u001a\u00020\u0010H&J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H&J\u0013\u0010)\u001a\u00020(H¦@ø\u0001\u0000¢\u0006\u0004\b)\u0010\u0006J\u0013\u0010*\u001a\u00020\u001cH¦@ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0006J\b\u0010+\u001a\u00020\u0010H&J#\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH¦@ø\u0001\u0000¢\u0006\u0004\b-\u0010!J\b\u0010/\u001a\u00020.H&J\u0010\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020.H&J\u0010\u00104\u001a\u00020\u00102\u0006\u00103\u001a\u000202H&J\u0010\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0004H&J\b\u00107\u001a\u00020\nH&J\u0012\u0010:\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u000108H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/heytap/health/menstrual/inter/MenstrualService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lkotlin/Pair;", "Lcom/oplus/aiunit/vision/ii4;", "", "z7", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "v1", "k1", "", "Z3", "Landroid/content/Context;", "context", "Landroid/content/BroadcastReceiver;", "l8", "", "e4", "g6", "E8", "Landroidx/lifecycle/MutableLiveData;", "Ya", "Ljava/time/LocalDate;", "date", "cycleList", "", "D8", "F0", "", "startTime", "endTime", "Lcom/heytap/health/protocol/menstrualcycle/MenstrualCycle$SymptomData;", "Ca", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r2", "k4", "q2", "type", "value", "n9", "Lcom/heytap/health/menstrual/data/MenstrualSystemCardData;", "y6", "W4", "v", "Lcom/oplus/aiunit/vision/ohe;", "P2", "Lcom/heytap/health/menstrual/data/CycleSetting;", "i6", "cycleSetting", "o7", "Lcom/heytap/health/menstrual/data/MenstrualCyclePredictiveBean;", "listData", "s4", "predictDays", "Q7", "s", "Landroid/os/Bundle;", "bundle", "j0", "menstrual_release"}, k = 1, mv = {1, 8, 0})
public interface MenstrualService extends IProvider {
    @Nullable
    Object Ca(long j2, long j3, @NotNull Continuation<? super MenstrualCycle$SymptomData> continuation);

    @NotNull
    String D8(@NotNull LocalDate date, @NotNull List<Cycle> cycleList);

    void E8();

    boolean F0();

    @Nullable
    Object P2(long j2, long j3, @NotNull Continuation<? super PhaseDaysResult> continuation);

    void Q7(int predictDays);

    @Nullable
    Object W4(@NotNull Continuation<? super Long> continuation);

    @NotNull
    MutableLiveData<Pair<Integer, Integer>> Ya();

    @Nullable
    Object Z3(@NotNull Continuation<? super Boolean> continuation);

    void e4(@Nullable Context context);

    void g6();

    @NotNull
    CycleSetting i6();

    void j0(@Nullable Bundle bundle);

    int k1();

    void k4();

    @Nullable
    BroadcastReceiver l8(@Nullable Context context);

    void n9(int type, int value);

    void o7(@NotNull CycleSetting cycleSetting);

    void q2(@NotNull LocalDate date);

    void r2();

    boolean s();

    void s4(@NotNull MenstrualCyclePredictiveBean listData);

    void v();

    @Nullable
    Object v1(@NotNull Continuation<? super List<Cycle>> continuation);

    @Nullable
    Object y6(@NotNull Continuation<? super MenstrualSystemCardData> continuation);

    @Nullable
    Object z7(@NotNull Continuation<? super Pair<Cycle, Integer>> continuation);
}
