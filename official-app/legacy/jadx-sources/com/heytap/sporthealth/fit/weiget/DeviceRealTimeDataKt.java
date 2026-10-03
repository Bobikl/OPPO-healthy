package com.heytap.sporthealth.fit.weiget;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.Observer;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.protocol.workout.WorkoutProto$FitnessData;
import com.heytap.sporthealth.fit.R$string;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.rg7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0000\"\u0014\u0010\b\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/heytap/health/protocol/workout/WorkoutProto$FitnessData;", "", "a", "", "b", "(Lcom/heytap/health/protocol/workout/WorkoutProto$FitnessData;)Ljava/lang/Integer;", "", "c", "FIT_REALTIME_UI_SCALE", UserInfo.SEX_FEMALE, "fitness_impl_release"}, k = 2, mv = {1, 8, 0})
public final class DeviceRealTimeDataKt {
    public static final float FIT_REALTIME_UI_SCALE = 0.8f;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    public static final float a(@NotNull WorkoutProto$FitnessData workoutProto$FitnessData) {
        Intrinsics.checkNotNullParameter(workoutProto$FitnessData, "<this>");
        int fitnessNotifyMaxHeartRate = workoutProto$FitnessData.getFitnessNotifyMaxHeartRate() - workoutProto$FitnessData.getFitnessNotifyRestHeartRate();
        if (fitnessNotifyMaxHeartRate < 1) {
            return 0.0f;
        }
        return (workoutProto$FitnessData.getFitnessNotifyHeartRate() - workoutProto$FitnessData.getFitnessNotifyRestHeartRate()) / (fitnessNotifyMaxHeartRate * 1.0f);
    }

    @Nullable
    public static final Integer b(@NotNull WorkoutProto$FitnessData workoutProto$FitnessData) {
        Intrinsics.checkNotNullParameter(workoutProto$FitnessData, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("data: ");
        sb.append(workoutProto$FitnessData);
        int fitnessNotifyBestFatHeartRateMax = workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMax();
        int fitnessNotifyBestFatHeartRateMin = workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMin();
        boolean z = false;
        if (!(1 <= fitnessNotifyBestFatHeartRateMin && fitnessNotifyBestFatHeartRateMin < fitnessNotifyBestFatHeartRateMax)) {
            return null;
        }
        int fitnessNotifyHeartRate = workoutProto$FitnessData.getFitnessNotifyHeartRate();
        if (fitnessNotifyHeartRate >= 0 && fitnessNotifyHeartRate < workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMin()) {
            float fitnessNotifyBestFatHeartRateMin2 = (workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMin() - 0) / 10.0f;
            if (fitnessNotifyBestFatHeartRateMin2 > 0.0f) {
                return Integer.valueOf((int) Math.ceil((workoutProto$FitnessData.getFitnessNotifyHeartRate() - 0) / fitnessNotifyBestFatHeartRateMin2));
            }
            a7b.b("DeviceRealTimeData", "exerciseIntensityV2(<bestMin)data exception:" + fitnessNotifyBestFatHeartRateMin2);
            return null;
        }
        if (fitnessNotifyHeartRate == workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMin()) {
            return 11;
        }
        int fitnessNotifyBestFatHeartRateMin3 = workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMin();
        if (fitnessNotifyHeartRate <= workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMax() && fitnessNotifyBestFatHeartRateMin3 <= fitnessNotifyHeartRate) {
            z = true;
        }
        if (z) {
            float fitnessNotifyBestFatHeartRateMax2 = (workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMax() - workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMin()) / 10.0f;
            if (fitnessNotifyBestFatHeartRateMax2 > 0.0f) {
                return Integer.valueOf(((int) Math.ceil((workoutProto$FitnessData.getFitnessNotifyHeartRate() - workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMin()) / fitnessNotifyBestFatHeartRateMax2)) + 10);
            }
            a7b.b("DeviceRealTimeData", "exerciseIntensityV2(bestMin..bestMax)data exception:" + fitnessNotifyBestFatHeartRateMax2);
            return null;
        }
        float fitnessNotifyMaxHeartRate = (workoutProto$FitnessData.getFitnessNotifyMaxHeartRate() - workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMax()) / 10.0f;
        if (fitnessNotifyMaxHeartRate > 0.0f) {
            return Integer.valueOf(((int) Math.ceil((workoutProto$FitnessData.getFitnessNotifyHeartRate() - workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMax()) / fitnessNotifyMaxHeartRate)) + 20);
        }
        a7b.b("DeviceRealTimeData", "exerciseIntensityV2(>bestMax)data exception:" + fitnessNotifyMaxHeartRate);
        return null;
    }

    @NotNull
    public static final CharSequence c(@NotNull WorkoutProto$FitnessData workoutProto$FitnessData) {
        CharSequence charSequenceInvoke;
        Intrinsics.checkNotNullParameter(workoutProto$FitnessData, "<this>");
        DeviceRealTimeDataKt$showExerciseIntensity$buildStr$1 deviceRealTimeDataKt$showExerciseIntensity$buildStr$1 = new Function2<String, Integer, CharSequence>() { // from class: com.heytap.sporthealth.fit.weiget.DeviceRealTimeDataKt$showExerciseIntensity$buildStr$1
            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ CharSequence invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final CharSequence invoke(@Nullable String str, int i) {
                if (str == null) {
                    return rg7.e(i);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor(str));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) rg7.e(i));
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                return new SpannedString(spannableStringBuilder);
            }
        };
        int fitnessNotifyBestFatHeartRateMax = workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMax();
        int fitnessNotifyBestFatHeartRateMin = workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMin();
        boolean z = false;
        if (1 <= fitnessNotifyBestFatHeartRateMin && fitnessNotifyBestFatHeartRateMin < fitnessNotifyBestFatHeartRateMax) {
            z = true;
        }
        if (z) {
            if (workoutProto$FitnessData.getFitnessNotifyHeartRate() < workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMin()) {
                charSequenceInvoke = deviceRealTimeDataKt$showExerciseIntensity$buildStr$1.invoke("#1F8AFD", Integer.valueOf(R$string.fit_video_realtime_increase));
            } else {
                charSequenceInvoke = workoutProto$FitnessData.getFitnessNotifyHeartRate() > workoutProto$FitnessData.getFitnessNotifyBestFatHeartRateMax() ? deviceRealTimeDataKt$showExerciseIntensity$buildStr$1.invoke("#FAC637", Integer.valueOf(R$string.fit_video_realtime_slowdown)) : deviceRealTimeDataKt$showExerciseIntensity$buildStr$1.invoke("#27E568", Integer.valueOf(R$string.fit_video_realtime_verygood_v2));
            }
            Intrinsics.checkNotNullExpressionValue(charSequenceInvoke, "{\n        // 手表上报了燃脂区间值则…ygood_v2)\n        }\n    }");
        } else {
            float fA = a(workoutProto$FitnessData) * 100;
            if (fA <= 0.0f) {
                charSequenceInvoke = deviceRealTimeDataKt$showExerciseIntensity$buildStr$1.invoke((Object) null, Integer.valueOf(R$string.fit_video_fat_burning_nodata));
            } else if (fA < 50.0f) {
                charSequenceInvoke = deviceRealTimeDataKt$showExerciseIntensity$buildStr$1.invoke("#1F8AFD", Integer.valueOf(R$string.fit_video_realtime_increase));
            } else {
                charSequenceInvoke = fA > 65.0f ? deviceRealTimeDataKt$showExerciseIntensity$buildStr$1.invoke("#FAC637", Integer.valueOf(R$string.fit_video_realtime_slowdown)) : deviceRealTimeDataKt$showExerciseIntensity$buildStr$1.invoke("#27E568", Integer.valueOf(R$string.fit_video_realtime_verygood_v2));
            }
            Intrinsics.checkNotNullExpressionValue(charSequenceInvoke, "{\n        val intensity …ygood_v2)\n        }\n    }");
        }
        return charSequenceInvoke;
    }
}
