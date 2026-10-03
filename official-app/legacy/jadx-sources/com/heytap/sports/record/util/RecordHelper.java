package com.heytap.sports.record.util;

import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.RunExtra;
import com.heytap.databaseengine.model.SportMetaData;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$plurals;
import com.heytap.sports.R$string;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpStatus;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.drs.core.net.entity.UploadStateAware;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\r\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0012J$\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tJ&\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0012J=\u0010#\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u00042!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00040\u001fH\u0002R\u0014\u0010$\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010%R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0'8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/heytap/sports/record/util/RecordHelper;", "", "", "metaData", "", MapSchema.FIELD_NAME_KEY, "runExtra", LogFieldKey.LEVEL_KEY, "n", "", b2n.f, "t", "a", "s", "o", LogFieldKey.PROCESS_NAME_KEY, "j", "runExtraStr", "Lcom/heytap/databaseengine/model/RunExtra;", "q", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "sportSource", "c", "i", b2n.g, "swimType", "f", "isSwim", "d", "str", "isMetaData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "hasDetail", LogFieldKey.MESSAGE_KEY, "PACE_BY_LAP", "I", "PACE_BY_KM", "", "Ljava/util/List;", "b", "()Ljava/util/List;", "DISTANCE_BY_TRACK_NUM", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RecordHelper {
    public static final int PACE_BY_KM = 2;
    public static final int PACE_BY_LAP = 1;

    @NotNull
    public static final RecordHelper INSTANCE = new RecordHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<Integer> DISTANCE_BY_TRACK_NUM = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{400, 407, Integer.valueOf(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE), 422, Integer.valueOf(UploadStateAware.HTTP_NOT_ENOUGH_URL_PARAMS), 438, 445, Integer.valueOf(UploadStateAware.HTTP_BODY_INVALID), 461});
    public static final int $stable = 8;

    public static /* synthetic */ String e(RecordHelper recordHelper, boolean z, String str, RunExtra runExtra, int i, Object obj) {
        if ((i & 4) != 0) {
            runExtra = (RunExtra) GsonUtil.a(str, RunExtra.class);
        }
        return recordHelper.d(z, str, runExtra);
    }

    public static /* synthetic */ boolean r(RecordHelper recordHelper, String str, RunExtra runExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            runExtra = (RunExtra) GsonUtil.a(str, RunExtra.class);
        }
        return recordHelper.q(str, runExtra);
    }

    public final int a(@Nullable String runExtra) {
        RunExtra runExtra2 = (RunExtra) GsonUtil.a(runExtra, RunExtra.class);
        if (runExtra2 != null) {
            return runExtra2.getEllipticalTotalNum();
        }
        return 0;
    }

    @NotNull
    public final List<Integer> b() {
        return DISTANCE_BY_TRACK_NUM;
    }

    @Nullable
    public final String c(int sportMode, int sportSource, @Nullable String runExtra) {
        String string;
        RunExtra runExtra2;
        if (runExtra != null && (runExtra2 = (RunExtra) GsonUtil.a(runExtra, RunExtra.class)) != null) {
            Intrinsics.checkNotNullExpressionValue(runExtra2, "fromJson(it, RunExtra::class.java)");
            Integer numIsThirdpartySports = runExtra2.isThirdpartySports();
            if (numIsThirdpartySports != null && numIsThirdpartySports.intValue() == 1 && runExtra2.getThirdAppName() != null) {
                a7b.f("RecordHelper", "fromThirdParty(" + runExtra2.isThirdpartySports() + ")：" + runExtra2.getThirdAppName());
                return b78.a().getString(R$string.sports_record_source, runExtra2.getThirdAppName());
            }
        }
        if ((sportMode == 290 && sportSource <= 1) || sportSource == 1) {
            string = b78.b().getString(R$string.sports_record_source1);
        } else if (sportSource != 2) {
            string = sportSource != 3 ? null : b78.b().getString(R$string.sports_record_source3);
        } else {
            string = b78.b().getString(R$string.sports_record_source2);
        }
        if (string == null) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = b78.a().getString(R$string.sports_record_source);
        Intrinsics.checkNotNullExpressionValue(string2, "getAppContext().getStrin…ing.sports_record_source)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{string}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Nullable
    public final String d(boolean isSwim, @Nullable String runExtraStr, @Nullable RunExtra runExtra) {
        if (runExtra == null) {
            return null;
        }
        Resources resources = b78.a().getResources();
        if ((runExtra.getSportsMode() & 1) <= 0) {
            if ((runExtra.getSportsMode() & 4) <= 0) {
                if ((runExtra.getSportsMode() & 8) > 0) {
                    return resources.getString(R$string.sports_submode_interval_training);
                }
                return null;
            }
            double pacerDistance = ((double) runExtra.getPacerDistance()) / 1000.0d;
            int i = R$plurals.sports_submode_lead_runner_s;
            int i2 = (int) pacerDistance;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(pacerDistance)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return resources.getQuantityString(i, i2, str, Integer.valueOf(runExtra.getPacerPace() / 60), Integer.valueOf(runExtra.getPacerPace() % 60));
        }
        switch (runExtra.getTargetMode()) {
            case 1:
                if (isSwim) {
                    return resources.getQuantityString(R$plurals.sports_submode_swim_distance_target_unit_format, runExtra.getTargetValue(), Integer.valueOf(runExtra.getTargetValue()));
                }
                if (runExtra.getTargetValue() == 21097) {
                    return resources.getString(R$string.sports_submode_distance_target_half_marathon);
                }
                if (runExtra.getTargetValue() == 42195) {
                    return resources.getString(R$string.sports_submode_distance_target_marathon);
                }
                double targetValue = ((double) runExtra.getTargetValue()) / 1000.0d;
                int i3 = R$plurals.sports_submode_distance_target_unit_format_s;
                int i4 = (int) targetValue;
                String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(targetValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return resources.getQuantityString(i3, i4, str2);
            case 2:
                return runExtra.getTargetValue() >= 3600 ? resources.getString(R$string.sports_submode_duration_hours_target_unit_format, Integer.valueOf(runExtra.getTargetValue() / 3600), Integer.valueOf((runExtra.getTargetValue() % 3600) / 60), Integer.valueOf((runExtra.getTargetValue() % 60) % 60)) : resources.getString(R$string.sports_submode_duration_target_unit_format, Integer.valueOf(runExtra.getTargetValue() / 60), Integer.valueOf(runExtra.getTargetValue() % 60));
            case 3:
                int targetValue2 = runExtra.getTargetValue();
                return resources.getQuantityString(R$plurals.sports_submode_calories_target_unit_format, targetValue2, Integer.valueOf(targetValue2));
            case 4:
                int targetValue3 = runExtra.getTargetValue();
                return resources.getQuantityString(R$plurals.sports_submode_ropeskipping_target_count_unit_format, targetValue3, Integer.valueOf(targetValue3));
            case 5:
                int targetValue4 = runExtra.getTargetValue();
                return resources.getQuantityString(R$plurals.sports_submode_trips_target_count_unit_format, targetValue4, Integer.valueOf(targetValue4));
            case 6:
                int targetValue5 = runExtra.getTargetValue();
                return resources.getQuantityString(R$plurals.sports_submode_laps_target_count_unit_format, targetValue5, Integer.valueOf(targetValue5));
            default:
                return null;
        }
    }

    public final int f(int swimType) {
        switch (swimType) {
            case 1:
                return R$string.sports_record_swim_stroke_freestyle;
            case 2:
                return R$string.sports_record_swim_stroke_breaststroke;
            case 3:
                return R$string.sports_record_swim_stroke_butterfly;
            case 4:
                return R$string.sports_record_swim_stroke_backstroke;
            case 5:
                return R$string.sports_record_swim_stroke_medley_stroke;
            case 6:
                return R$string.sports_record_swim_stroke_others;
            default:
                return R$string.sports_record_swim_stroke_others;
        }
    }

    public final int g(@Nullable String runExtra) {
        try {
            return ((RunExtra) GsonUtil.a(runExtra, RunExtra.class)).getTotalBatting();
        } catch (Exception e2) {
            a7b.c("RecordHelper", e2.getMessage(), e2);
            return 0;
        }
    }

    public final boolean h(@Nullable RunExtra runExtra) {
        return (runExtra != null ? runExtra.getMainSwimType() : 0) > 0;
    }

    public final boolean i(@Nullable String runExtra) {
        return h((RunExtra) GsonUtil.a(runExtra, RunExtra.class));
    }

    public final boolean j(@Nullable String runExtra) {
        try {
            RunExtra runExtra2 = (RunExtra) GsonUtil.a(runExtra, RunExtra.class);
            return (runExtra2 != null ? runExtra2.getAvgSpeed() : 0) > 0;
        } catch (Exception unused) {
            a7b.f("RecordHelper", "rope count parse exception");
            return false;
        }
    }

    public final boolean k(@Nullable String metaData) {
        return m(metaData, true, new Function1<RunExtra, Boolean>() { // from class: com.heytap.sports.record.util.RecordHelper$hasSkiDetailByMetadata$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull RunExtra it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String skiDetail = it.getSkiDetail();
                boolean z = true;
                if (!(skiDetail != null && skiDetail.length() > 0) && it.getSkiDuration() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final boolean l(@Nullable String runExtra) {
        return m(runExtra, false, new Function1<RunExtra, Boolean>() { // from class: com.heytap.sports.record.util.RecordHelper$hasSkiDetailByRunExtra$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull RunExtra it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String skiDetail = it.getSkiDetail();
                boolean z = true;
                if (!(skiDetail != null && skiDetail.length() > 0) && it.getSkiDuration() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final boolean m(String str, boolean isMetaData, Function1<? super RunExtra, Boolean> hasDetail) {
        RunExtra runExtra = null;
        try {
            if (isMetaData) {
                SportMetaData sportMetaData = (SportMetaData) GsonUtil.a(str, SportMetaData.class);
                if (sportMetaData != null) {
                    runExtra = (RunExtra) GsonUtil.a(sportMetaData.getRunExtra(), RunExtra.class);
                }
            } else if (str != null) {
                runExtra = (RunExtra) GsonUtil.a(str, RunExtra.class);
            }
            if (runExtra == null) {
                return false;
            }
            return hasDetail.invoke(runExtra).booleanValue();
        } catch (Exception e2) {
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("hasSportDetail(),ex:");
            sb.append(message);
            return false;
        }
    }

    public final boolean n(@Nullable String metaData) {
        return m(metaData, true, new Function1<RunExtra, Boolean>() { // from class: com.heytap.sports.record.util.RecordHelper$hasTennisDetailByMetadata$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull RunExtra it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getTotalBatting() > 0);
            }
        });
    }

    public final boolean o(@Nullable String runExtra) {
        return m(runExtra, false, new Function1<RunExtra, Boolean>() { // from class: com.heytap.sports.record.util.RecordHelper$isNewEllipticalMachine$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull RunExtra it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getAvgEllipticalFreq() > 0);
            }
        });
    }

    public final boolean p(@Nullable String runExtra) {
        return m(runExtra, false, new Function1<RunExtra, Boolean>() { // from class: com.heytap.sports.record.util.RecordHelper$isNewRowingMachine$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull RunExtra it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getAvgRowingFreq() > 0);
            }
        });
    }

    public final boolean q(@Nullable String runExtraStr, @Nullable RunExtra runExtra) {
        return runExtra != null && runExtra.getSegmentation() == 1;
    }

    public final int s(@Nullable String runExtra) {
        RunExtra runExtra2 = (RunExtra) GsonUtil.a(runExtra, RunExtra.class);
        if (runExtra2 != null) {
            return runExtra2.getRowingTotalNum();
        }
        return 0;
    }

    public final int t(@Nullable String runExtra) {
        RunExtra runExtra2 = (RunExtra) GsonUtil.a(runExtra, RunExtra.class);
        if (runExtra2 != null) {
            return runExtra2.getForeHandNum() + runExtra2.getBackHandNum();
        }
        return 0;
    }
}
