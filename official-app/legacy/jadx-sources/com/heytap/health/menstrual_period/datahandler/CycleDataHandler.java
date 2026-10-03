package com.heytap.health.menstrual_period.datahandler;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.menstrualcycle.Ovulation;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.menstrual.data.DateType;
import com.heytap.health.menstrual.data.MenstrualCyclePredictiveBean;
import com.heytap.health.menstrual.data.MenstrualCyclePredictiveItemBean;
import com.heytap.health.menstrual.data.PeriodCloseStatus;
import com.heytap.health.menstrual_period.viewhelper.CycleSettingHelper;
import com.heytap.health.menstrual_period.viewmodel.CycleRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.Cycle;
import com.oplus.aiunit.vision.Period;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.cyd;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.gub;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.ui4;
import com.oplus.aiunit.vision.v05;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.IntIterator;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.TypeIntrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\b\\\u0010]J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J6\u0010\u000f\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0003J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J<\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00122\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002H\u0002J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002J(\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J<\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\t2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002H\u0002J>\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\t2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002H\u0002J&\u0010!\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002H\u0002J\u0016\u0010\"\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0002J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0002J\u0018\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0018\u0010)\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0018\u0010*\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0018\u0010+\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\tH\u0002JP\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002J.\u0010-\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u000e\u001a\u00020\u00052\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002J\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJZ\u00105\u001a\u00020\t2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u00104\u001a\u00020\u00122\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002J8\u00108\u001a\u00020\t2\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002J&\u00109\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0006\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020#J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020#J \u0010<\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0006\u0010$\u001a\u00020#J\u001a\u0010=\u001a\u0004\u0018\u00010\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020#J\u0016\u0010?\u001a\u00020\u00052\u0006\u00101\u001a\u00020#2\u0006\u0010>\u001a\u00020#J\u0016\u0010B\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020#J\u001e\u0010C\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u001e\u0010D\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0006\u0010$\u001a\u00020#J$\u0010E\u001a\b\u0012\u0004\u0012\u00020:0\u000b2\u0006\u0010$\u001a\u00020#2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u001e\u0010G\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0006\u0010F\u001a\u00020#J\u0016\u0010H\u001a\u00020\u00122\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u000e\u0010K\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\tJ\u000e\u0010L\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\tJ\u000e\u0010M\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\tJ\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u000bR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\bY\u0010Z¨\u0006_"}, d2 = {"Lcom/heytap/health/menstrual_period/datahandler/CycleDataHandler;", "", "", "Lcom/oplus/aiunit/vision/fee;", "allPeriodData", "", "defaultPeriodDays", "", SecureGcmConstants.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/ii4;", "cycleList", "", "Lcom/oplus/aiunit/vision/cyd;", "ovulationListData", "defaultCycleDays", "d", "firstCycle", "secondCycle", "", "O", "toMergeCycle", "beMergedCycle", "isLastCycle", "pendingOvulationDeletions", "L", "N", "i", "cycle", "allOvulationData", "isSkipCheckOvulation", "j", "K", "deleteList", b2n.g, LogFieldKey.MESSAGE_KEY, "Ljava/time/LocalDate;", "date", "J", c8l.KEY_B, UserInfo.SEX_FEMALE, "G", "H", "D", ExifInterface.LONGITUDE_EAST, "Q", "M", "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "periodList", "isPredict", MapSchema.FIELD_NAME_ENTRY, "firstPeriod", "anotherCyclePeriod", "f", "w", "Lcom/heytap/health/menstrual/data/DateType;", "s", "r", "o", "predictEndDate", "y", CityBean.POS, "fakeEndDate", "n", "u", "v", LogFieldKey.PROCESS_NAME_KEY, "curDate", "t", "C", ExifInterface.GPS_DIRECTION_TRUE, "z", "I", "A", LogFieldKey.LEVEL_KEY, "Lcom/heytap/databaseengine/model/menstrualcycle/Ovulation;", "ovulationDbList", "S", "Lcom/heytap/health/menstrual_period/datahandler/PeriodDataHandler;", "a", "Lkotlin/Lazy;", "x", "()Lcom/heytap/health/menstrual_period/datahandler/PeriodDataHandler;", "periodDataHandler", "Lcom/heytap/health/menstrual_period/viewmodel/CycleRepository;", "b", "q", "()Lcom/heytap/health/menstrual_period/viewmodel/CycleRepository;", "cycleRepository", "<init>", "()V", "Companion", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCycleDataHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CycleDataHandler.kt\ncom/heytap/health/menstrual_period/datahandler/CycleDataHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,911:1\n1002#2,2:912\n766#2:914\n857#2,2:915\n766#2:918\n857#2,2:919\n1002#2,2:921\n1855#2:923\n1747#2,3:924\n1856#2:927\n1855#2,2:928\n1002#2,2:930\n1855#2,2:932\n1002#2,2:934\n766#2:936\n857#2,2:937\n1045#2:939\n1855#2,2:940\n766#2:942\n857#2,2:943\n1963#2,14:945\n1549#2:959\n1620#2,3:960\n766#2:963\n857#2,2:964\n288#2,2:966\n288#2,2:968\n288#2,2:970\n288#2,2:972\n766#2:974\n857#2,2:975\n766#2:977\n857#2,2:978\n1855#2,2:980\n766#2:982\n857#2,2:983\n1855#2,2:985\n766#2:987\n857#2,2:988\n766#2:990\n857#2,2:991\n766#2:993\n857#2:994\n766#2:995\n857#2,2:996\n858#2:998\n766#2:999\n857#2,2:1000\n1549#2:1002\n1620#2,3:1003\n2624#2,3:1006\n1549#2:1009\n1620#2,3:1010\n766#2:1013\n857#2,2:1014\n1549#2:1016\n1620#2,3:1017\n766#2:1020\n857#2,2:1021\n766#2:1023\n857#2,2:1024\n1747#2,3:1026\n1747#2,3:1029\n1855#2,2:1032\n1#3:917\n*S KotlinDebug\n*F\n+ 1 CycleDataHandler.kt\ncom/heytap/health/menstrual_period/datahandler/CycleDataHandler\n*L\n103#1:912,2\n161#1:914\n161#1:915,2\n170#1:918\n170#1:919,2\n196#1:921,2\n208#1:923\n242#1:924,3\n208#1:927\n260#1:928,2\n284#1:930,2\n290#1:932,2\n349#1:934,2\n462#1:936\n462#1:937,2\n472#1:939\n475#1:940,2\n481#1:942\n481#1:943,2\n504#1:945,14\n540#1:959\n540#1:960,3\n540#1:963\n540#1:964,2\n543#1:966,2\n566#1:968,2\n570#1:970,2\n629#1:972,2\n637#1:974\n637#1:975,2\n651#1:977\n651#1:978,2\n651#1:980,2\n660#1:982\n660#1:983,2\n660#1:985,2\n770#1:987\n770#1:988,2\n782#1:990\n782#1:991,2\n804#1:993\n804#1:994\n805#1:995\n805#1:996,2\n804#1:998\n823#1:999\n823#1:1000,2\n840#1:1002\n840#1:1003,3\n841#1:1006,3\n853#1:1009\n853#1:1010,3\n855#1:1013\n855#1:1014,2\n864#1:1016\n864#1:1017,3\n866#1:1020\n866#1:1021,2\n876#1:1023\n876#1:1024,2\n880#1:1026,3\n887#1:1029,3\n896#1:1032,2\n*E\n"})
public final class CycleDataHandler {
    public static final int CALENDAR_METHOD = 1;
    public static final int CYCLE_MAX_DAYS = 90;
    public static final int CYCLE_MERGE_MIN_DAYS = 10;
    public static final int CYCLE_MIN_DAYS = 15;
    public static final int DEFAULT_AUTO_END_DAYS = 12;
    public static final int DEFAULT_CYCLE_DAYS = 28;
    public static final int DEFAULT_PERIOD_DAYS = 5;
    public static final int END_MAX_DAYS = 90;
    public static final int END_MIN_DAYS = 2;
    public static final int MIN_STAT_CYCLE_SIZE = 3;
    public static final int OVULATION_AFTER = 1;
    public static final int OVULATION_BEFORE = 5;
    public static final int OVULATION_COUNT = 14;
    public static final int PERIOD_AUTO_END = 12;
    public static final int PERIOD_MAX_DAYS = 15;
    public static final int PERIOD_MIN_DAYS = 2;
    public static final int PREDICTED_DATA_INTERVAL = 15;
    public static final int PREDICT_CYCLES = 3;
    public static final int UNPERIOD_MIN_DAYS = 2;

    @NotNull
    public static final LocalDate d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy periodDataHandler = LazyKt__LazyJVMKt.lazy(new Function0<PeriodDataHandler>() { // from class: com.heytap.health.menstrual_period.datahandler.CycleDataHandler$periodDataHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final PeriodDataHandler invoke() {
            return new PeriodDataHandler();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy cycleRepository = LazyKt__LazyJVMKt.lazy(new Function0<CycleRepository>() { // from class: com.heytap.health.menstrual_period.datahandler.CycleDataHandler$cycleRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CycleRepository invoke() {
            return new CycleRepository();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDate f4971c = LocalDate.of(2019, 1, 1);

    /* JADX INFO: renamed from: com.heytap.health.menstrual_period.datahandler.CycleDataHandler$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\f¨\u0006$"}, d2 = {"Lcom/heytap/health/menstrual_period/datahandler/CycleDataHandler$a;", "", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "EARLIEST_DAY", "Ljava/time/LocalDate;", "a", "()Ljava/time/LocalDate;", "MAX_DAY", "b", "", "CALENDAR_METHOD", "I", "CYCLE_MAX_DAYS", "CYCLE_MERGE_MIN_DAYS", "CYCLE_MIN_DAYS", "DEFAULT_AUTO_END_DAYS", "DEFAULT_CYCLE_DAYS", "DEFAULT_PERIOD_DAYS", "END_MAX_DAYS", "END_MIN_DAYS", "MIN_STAT_CYCLE_SIZE", "OVULATION_AFTER", "OVULATION_BEFORE", "OVULATION_COUNT", "PERIOD_AUTO_END", "PERIOD_MAX_DAYS", "PERIOD_MIN_DAYS", "PREDICTED_DATA_INTERVAL", "PREDICT_CYCLES", "", "TAG", "Ljava/lang/String;", "UNPERIOD_MIN_DAYS", "<init>", "()V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocalDate a() {
            return CycleDataHandler.f4971c;
        }

        @NotNull
        public final LocalDate b() {
            return CycleDataHandler.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CycleDataHandler.kt\ncom/heytap/health/menstrual_period/datahandler/CycleDataHandler\n*L\n1#1,328:1\n196#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstrualCyclePredictiveItemBean) t).getCycleStartDate()), Long.valueOf(((MenstrualCyclePredictiveItemBean) t2).getCycleStartDate()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CycleDataHandler.kt\ncom/heytap/health/menstrual_period/datahandler/CycleDataHandler\n*L\n1#1,328:1\n284#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Cycle) t).getStartDate()), Long.valueOf(((Cycle) t2).getStartDate()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CycleDataHandler.kt\ncom/heytap/health/menstrual_period/datahandler/CycleDataHandler\n*L\n1#1,328:1\n349#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        public final /* synthetic */ long i;

        public d(long j2) {
            this.i = j2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(this.i), Long.valueOf(this.i));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CycleDataHandler.kt\ncom/heytap/health/menstrual_period/datahandler/CycleDataHandler\n*L\n1#1,328:1\n472#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((cyd) t).getCom.oplus.aiunit.vision.f04.JSON_KEY_DIGITAL_KEY_START_TIME java.lang.String()), Long.valueOf(((cyd) t2).getCom.oplus.aiunit.vision.f04.JSON_KEY_DIGITAL_KEY_START_TIME java.lang.String()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CycleDataHandler.kt\ncom/heytap/health/menstrual_period/datahandler/CycleDataHandler\n*L\n1#1,328:1\n103#2:329\n*E\n"})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstrualCyclePredictiveItemBean) t).getCycleStartDate()), Long.valueOf(((MenstrualCyclePredictiveItemBean) t2).getCycleStartDate()));
        }
    }

    static {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        LocalDate localDatePlusMonths = o05.y(localDateNow).plusMonths(6L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "now().startOfMonth().plusMonths(6)");
        d = o05.h(localDatePlusMonths);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List R(CycleDataHandler cycleDataHandler, List list, List list2, int i, int i2, List list3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list4 = list2;
        if ((i3 & 4) != 0) {
            i = 28;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 5;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            list3 = null;
        }
        return cycleDataHandler.Q(list, list4, i4, i5, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cycle g(CycleDataHandler cycleDataHandler, long j2, long j3, List list, boolean z, List list2, boolean z2, List list3, int i, Object obj) {
        return cycleDataHandler.e(j2, j3, list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(CycleDataHandler cycleDataHandler, Cycle cycle, List list, boolean z, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        cycleDataHandler.j(cycle, list, z, list2);
    }

    public final boolean A(@NotNull Cycle cycle) {
        boolean z;
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        if (!o05.m(localDateNow, o05.D(cycle.getStartDate()), o05.D(cycle.getEndDate()))) {
            return false;
        }
        List<Period> listE = cycle.e();
        if ((listE instanceof Collection) && listE.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                if (((Period) it.next()).getCloseStatus() != PeriodCloseStatus.PREDICT) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public final boolean B(LocalDate date) {
        return date.isAfter(LocalDate.now());
    }

    public final boolean C(@Nullable List<Cycle> cycleList) {
        List<Cycle> list = cycleList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<Cycle> list2 = cycleList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Cycle) it.next()).e());
        }
        List listFlatten = CollectionsKt__IterablesKt.flatten(arrayList);
        if (!(listFlatten instanceof Collection) || !listFlatten.isEmpty()) {
            Iterator it2 = listFlatten.iterator();
            while (it2.hasNext()) {
                if (((Period) it2.next()).getCloseStatus() != PeriodCloseStatus.PREDICT) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean D(LocalDate date, Cycle cycle) {
        cyd ovulation = cycle.getOvulation();
        if (ovulation != null) {
            return o05.l(o05.H(date), ovulation.getCom.oplus.aiunit.vision.f04.JSON_KEY_DIGITAL_KEY_START_TIME java.lang.String(), ovulation.getEndDate());
        }
        return false;
    }

    public final boolean E(LocalDate date, Cycle cycle) {
        Long ovulationDay;
        cyd ovulation = cycle.getOvulation();
        if (ovulation == null || (ovulationDay = ovulation.getOvulationDay()) == null) {
            return false;
        }
        return Intrinsics.areEqual(date, o05.D(ovulationDay.longValue()));
    }

    public final boolean F(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }

    public final boolean G(LocalDate date, Cycle cycle) {
        List<Period> listE = cycle.e();
        ArrayList<Period> arrayList = new ArrayList();
        Iterator<T> it = listE.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Period) next).getCloseStatus() != PeriodCloseStatus.PREDICT) {
                arrayList.add(next);
            }
        }
        for (Period period : arrayList) {
            if (o05.l(o05.H(date), period.getStartDate(), period.getEndDate())) {
                return true;
            }
        }
        return false;
    }

    public final boolean H(LocalDate date, Cycle cycle) {
        List<Period> listE = cycle.e();
        ArrayList<Period> arrayList = new ArrayList();
        Iterator<T> it = listE.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Period) next).getCloseStatus() == PeriodCloseStatus.PREDICT) {
                arrayList.add(next);
            }
        }
        for (Period period : arrayList) {
            if (o05.l(o05.H(date), period.getStartDate(), period.getEndDate())) {
                return true;
            }
        }
        return false;
    }

    public final boolean I(@NotNull Cycle cycle) {
        boolean z;
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        if (!cycle.e().isEmpty()) {
            List<Period> listE = cycle.e();
            if (!(listE instanceof Collection) || !listE.isEmpty()) {
                Iterator<T> it = listE.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((Period) it.next()).getCloseStatus() != PeriodCloseStatus.PREDICT) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean J(LocalDate date) {
        return Intrinsics.areEqual(date, LocalDate.now());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    public final cyd K(Cycle cycle, List<cyd> allOvulationData, boolean isSkipCheckOvulation, List<cyd> pendingOvulationDeletions) {
        boolean z;
        int iE;
        Object next = null;
        if (allOvulationData.isEmpty()) {
            return null;
        }
        LocalDate localDateD = o05.D(cycle.getEndDate());
        ArrayList<cyd> arrayList = new ArrayList();
        Iterator<T> it = allOvulationData.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            cyd cydVar = (cyd) next2;
            if (cydVar.getCom.oplus.aiunit.vision.f04.JSON_KEY_DIGITAL_KEY_START_TIME java.lang.String() >= cycle.getStartDate() && cydVar.getEndDate() <= cycle.getEndDate()) {
                z2 = true;
            }
            if (z2) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new e());
        ArrayList arrayList2 = new ArrayList();
        for (cyd cydVar2 : arrayList) {
            if (cydVar2.getIsDbDate()) {
                arrayList2.add(cydVar2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listSortedWith) {
            Long ovulationDay = ((cyd) obj).getOvulationDay();
            if (ovulationDay != null) {
                LocalDate localDateD2 = o05.D(ovulationDay.longValue());
                if (isSkipCheckOvulation || (8 <= (iE = o05.e(localDateD2, localDateD)) && iE < 17)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                arrayList3.add(obj);
            }
        }
        if (arrayList3.isEmpty()) {
            if (!arrayList2.isEmpty()) {
                h(arrayList2, pendingOvulationDeletions);
            }
            return null;
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                Long predictedTime = ((cyd) next).getPredictedTime();
                long jLongValue = predictedTime != null ? predictedTime.longValue() : Long.MIN_VALUE;
                do {
                    Object next3 = it2.next();
                    Long predictedTime2 = ((cyd) next3).getPredictedTime();
                    long jLongValue2 = predictedTime2 != null ? predictedTime2.longValue() : Long.MIN_VALUE;
                    if (jLongValue < jLongValue2) {
                        next = next3;
                        jLongValue = jLongValue2;
                    }
                } while (it2.hasNext());
            }
        }
        cyd cydVar3 = (cyd) next;
        TypeIntrinsics.asMutableCollection(arrayList2).remove(cydVar3);
        if (!arrayList2.isEmpty()) {
            h(arrayList2, pendingOvulationDeletions);
        }
        return cydVar3;
    }

    public final void L(Cycle toMergeCycle, Cycle beMergedCycle, int defaultCycleDays, boolean isLastCycle, List<cyd> pendingOvulationDeletions) {
        ArrayList arrayList = new ArrayList();
        if (toMergeCycle.getOvulation() != null) {
            cyd ovulation = toMergeCycle.getOvulation();
            Intrinsics.checkNotNull(ovulation);
            arrayList.add(ovulation);
        }
        if (beMergedCycle.getOvulation() != null) {
            cyd ovulation2 = beMergedCycle.getOvulation();
            Intrinsics.checkNotNull(ovulation2);
            arrayList.add(ovulation2);
        }
        i(toMergeCycle, beMergedCycle, defaultCycleDays, isLastCycle);
        N(toMergeCycle, beMergedCycle);
        k(this, toMergeCycle, arrayList, false, pendingOvulationDeletions, 4, null);
    }

    public final void M(@NotNull List<Cycle> cycleList, int defaultCycleDays, @Nullable List<cyd> pendingOvulationDeletions) {
        Intrinsics.checkNotNullParameter(cycleList, "cycleList");
        ListIterator<Cycle> listIterator = cycleList.listIterator();
        while (listIterator.hasNext()) {
            Cycle next = listIterator.next();
            while (listIterator.hasNext()) {
                Cycle next2 = listIterator.next();
                if (!O(next, next2)) {
                    listIterator.previous();
                    break;
                } else {
                    L(next, next2, defaultCycleDays, Intrinsics.areEqual(next2, CollectionsKt___CollectionsKt.last((List) cycleList)), pendingOvulationDeletions);
                    listIterator.remove();
                }
            }
        }
    }

    public final void N(Cycle toMergeCycle, Cycle beMergedCycle) {
        toMergeCycle.e().addAll(toMergeCycle.getStartDate() > beMergedCycle.getStartDate() ? 0 : toMergeCycle.e().size(), beMergedCycle.e());
    }

    public final boolean O(Cycle firstCycle, Cycle secondCycle) {
        if (firstCycle.e().size() >= 3) {
            return false;
        }
        return o05.d(firstCycle.getStartDate(), firstCycle.getEndDate()) < 10 || o05.d(((Period) CollectionsKt___CollectionsKt.last((List) firstCycle.e())).getEndDate(), secondCycle.getStartDate()) - 1 <= 2;
    }

    public final void P(List<Period> allPeriodData, int defaultPeriodDays) {
        x().i(allPeriodData, defaultPeriodDays);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007c A[Catch: Exception -> 0x01c3, TRY_LEAVE, TryCatch #6 {Exception -> 0x01c3, blocks: (B:7:0x002f, B:9:0x0035, B:17:0x0051, B:19:0x0071, B:20:0x007c), top: B:90:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x012d  */
    @NotNull
    public final List<Cycle> Q(@NotNull List<Period> allPeriodData, @NotNull List<cyd> allOvulationData, int defaultCycleDays, int defaultPeriodDays, @Nullable List<cyd> pendingOvulationDeletions) {
        ArrayList arrayList;
        List<cyd> list;
        ArrayList arrayList2;
        long startDate;
        ArrayList arrayList3;
        Cycle cycleG;
        int i;
        List<cyd> list2 = pendingOvulationDeletions;
        String str = "CycleDataHandler";
        Intrinsics.checkNotNullParameter(allPeriodData, "allPeriodData");
        Intrinsics.checkNotNullParameter(allOvulationData, "allOvulationData");
        P(allPeriodData, defaultPeriodDays);
        if (allPeriodData.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList4 = new ArrayList();
        int i2 = 0;
        while (i2 < allPeriodData.size()) {
            try {
                if (i2 == allPeriodData.size() - 1) {
                    try {
                        Period period = allPeriodData.get(i2);
                        if (period.getCloseStatus() != PeriodCloseStatus.PREDICT || i2 <= 0) {
                            startDate = allPeriodData.get(i2).getStartDate();
                        } else {
                            int i3 = i2 - 1;
                            if (Intrinsics.areEqual(o05.D(allPeriodData.get(i3).getEndDate()).plusDays(1L), o05.D(period.getStartDate()))) {
                                startDate = allPeriodData.get(i3).getStartDate();
                            } else {
                                startDate = allPeriodData.get(i2).getStartDate();
                            }
                        }
                        long jB = o05.b(startDate, defaultCycleDays);
                        String strT = gub.t();
                        if (TextUtils.isEmpty(strT)) {
                            arrayList3 = arrayList4;
                        } else {
                            try {
                                MenstrualCyclePredictiveBean menstrualCyclePredictiveBean = (MenstrualCyclePredictiveBean) sc8.a(strT, MenstrualCyclePredictiveBean.class);
                                if (!menstrualCyclePredictiveBean.getCycleList().isEmpty()) {
                                    List<MenstrualCyclePredictiveItemBean> cycleList = menstrualCyclePredictiveBean.getCycleList();
                                    arrayList3 = arrayList4;
                                    if (cycleList.size() > 1) {
                                        try {
                                            CollectionsKt__MutableCollectionsJVMKt.sortWith(cycleList, new f());
                                        } catch (Exception e2) {
                                            e = e2;
                                            list = list2;
                                            arrayList = arrayList3;
                                        }
                                    }
                                    try {
                                        LocalDate predictiveDataStartDate = o05.D(((MenstrualCyclePredictiveItemBean) CollectionsKt___CollectionsKt.first((List) menstrualCyclePredictiveBean.getCycleList())).getCycleStartDate()).minusDays(1L);
                                        Intrinsics.checkNotNullExpressionValue(predictiveDataStartDate, "predictiveDataStartDate");
                                        int iD = o05.d(jB, o05.H(predictiveDataStartDate));
                                        if (!o05.D(jB).isAfter(predictiveDataStartDate) && iD < 15) {
                                            jB = o05.H(predictiveDataStartDate);
                                        }
                                        if (o05.D(startDate).isBefore(predictiveDataStartDate) && o05.D(jB).isAfter(predictiveDataStartDate)) {
                                            jB = o05.H(predictiveDataStartDate);
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        list = pendingOvulationDeletions;
                                        arrayList = arrayList3;
                                    }
                                } else {
                                    arrayList3 = arrayList4;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                arrayList3 = arrayList4;
                            }
                        }
                        try {
                            a7b.f(str, "lastPeriodStartDate =" + startDate + "; lastPeriodEndDate = " + jB);
                            int i4 = i2;
                            arrayList2 = arrayList3;
                            str = str;
                            try {
                                list = pendingOvulationDeletions;
                                cycleG = g(this, startDate, jB, CollectionsKt__CollectionsKt.mutableListOf(allPeriodData.get(i2)), false, allOvulationData, true, pendingOvulationDeletions, 8, null);
                                arrayList = arrayList2;
                                i = i4;
                                try {
                                    arrayList.add(cycleG);
                                    i2 = i + 1;
                                    arrayList4 = arrayList;
                                    list2 = list;
                                    str = str;
                                } catch (Exception e5) {
                                    e = e5;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                list = pendingOvulationDeletions;
                                arrayList = arrayList2;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            str = str;
                            arrayList2 = arrayList3;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        arrayList2 = arrayList4;
                        str = str;
                    }
                } else {
                    i = i2;
                    arrayList2 = arrayList4;
                    str = str;
                    list = pendingOvulationDeletions;
                    try {
                        cycleG = f(allPeriodData.get(i), allPeriodData.get(i + 1), allOvulationData, list);
                        arrayList = arrayList2;
                        arrayList.add(cycleG);
                        i2 = i + 1;
                        arrayList4 = arrayList;
                        list2 = list;
                        str = str;
                    } catch (Exception e9) {
                        e = e9;
                        arrayList = arrayList2;
                    }
                }
            } catch (Exception e10) {
                e = e10;
                arrayList = arrayList4;
                str = str;
                list = list2;
            }
            a7b.f(str, "Exception =  " + e.getMessage());
            M(arrayList, defaultCycleDays, list);
            d(arrayList, allOvulationData, defaultCycleDays, defaultPeriodDays);
            return arrayList;
        }
        arrayList = arrayList4;
        list = list2;
        M(arrayList, defaultCycleDays, list);
        d(arrayList, allOvulationData, defaultCycleDays, defaultPeriodDays);
        return arrayList;
    }

    @NotNull
    public final List<cyd> S(@NotNull List<Ovulation> ovulationDbList) {
        Intrinsics.checkNotNullParameter(ovulationDbList, "ovulationDbList");
        ArrayList arrayList = new ArrayList();
        for (Ovulation ovulation : ovulationDbList) {
            arrayList.add(new cyd(v05.a(ovulation.getOvulaBeginDate()), v05.a(ovulation.getOvulaEndDate()), Long.valueOf(v05.a(ovulation.getOvulaDate())), Long.valueOf(ovulation.getOvulaDateAlgorTime()), ovulation.getOvulationPreType(), true, ovulation.getDataClient()));
        }
        return arrayList;
    }

    @NotNull
    public final List<Cycle> T(@Nullable List<Cycle> cycleList) {
        List<Cycle> list = cycleList;
        if (list == null || list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Cycle> list2 = cycleList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Cycle cycle : list2) {
            arrayList.add(cycle.a((31 & 1) != 0 ? cycle.startDate : 0L, (31 & 2) != 0 ? cycle.endDate : 0L, (31 & 4) != 0 ? cycle.period : null, (31 & 8) != 0 ? cycle.ovulation : null, (31 & 16) != 0 ? cycle.isPredict : false));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            Cycle cycle2 = (Cycle) obj;
            if (I(cycle2) && (l(cycle2) || A(cycle2))) {
                arrayList3.add(obj);
            }
        }
        arrayList2.addAll(arrayList3);
        if (arrayList2.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Period> listE = ((Cycle) CollectionsKt___CollectionsKt.last((List) arrayList2)).e();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listE, 10));
        for (Period period : listE) {
            arrayList4.add(period.a((31 & 1) != 0 ? period.startDate : 0L, (31 & 2) != 0 ? period.endDate : 0L, (31 & 4) != 0 ? period.modifiedTime : 0L, (31 & 8) != 0 ? period.closeStatus : null, (31 & 16) != 0 ? period.dataClient : null));
        }
        Cycle cycle3 = (Cycle) CollectionsKt___CollectionsKt.last((List) arrayList2);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (((Period) obj2).getCloseStatus() != PeriodCloseStatus.PREDICT) {
                arrayList5.add(obj2);
            }
        }
        cycle3.j(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList5));
        Cycle cycle4 = (Cycle) CollectionsKt___CollectionsKt.last((List) arrayList2);
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        cycle4.h(o05.H(localDateNow));
        return arrayList2;
    }

    @NotNull
    public final List<Cycle> U(@NotNull List<Cycle> cycleList) {
        Intrinsics.checkNotNullParameter(cycleList, "cycleList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : cycleList) {
            if (!((Cycle) obj).getIsPredict()) {
                arrayList.add(obj);
            }
        }
        Cycle cycle = (Cycle) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList);
        if (cycle != null) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
            cycle.h(o05.H(localDateNow));
        }
        return arrayList;
    }

    @NotNull
    public final List<Cycle> V(@NotNull List<Cycle> cycleList) {
        Intrinsics.checkNotNullParameter(cycleList, "cycleList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : cycleList) {
            if (!((Cycle) obj).getIsPredict()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0362  */
    @SuppressLint({"SuspiciousIndentation"})
    public final void d(List<Cycle> cycleList, List<cyd> ovulationListData, int defaultCycleDays, int defaultPeriodDays) {
        String str;
        String str2;
        String str3;
        long j2;
        LocalDate localDate;
        String str4;
        String str5;
        LocalDate localDate2;
        LocalDate localDate3;
        LocalDate localDate4;
        Cycle cycleG;
        long j3;
        boolean z;
        long endDate = ((Cycle) CollectionsKt___CollectionsKt.last((List) cycleList)).getEndDate();
        long endDate2 = ((Period) CollectionsKt___CollectionsKt.last((List) ((Cycle) CollectionsKt___CollectionsKt.last((List) cycleList)).e())).getEndDate();
        long j4 = 1;
        LocalDate firstPredictCycleStartDate = o05.D(endDate).plusDays(1L);
        o05.D(endDate).plusDays(1L);
        String strT = gub.t();
        new ArrayList().addAll(ovulationListData);
        String str6 = "CycleDataHandler";
        a7b.f("CycleDataHandler", "predictiveDataStr = " + strT);
        String str7 = "cycleStartDate.countEndDays(defaultPeriodDays)";
        String str8 = "cycleStartDate.countEndDays(defaultCycleDays)";
        String str9 = "cycleStartDate";
        int i = 1;
        if (TextUtils.isEmpty(strT)) {
            str = "cycleStartDate";
            str2 = "cycleStartDate.countEndDays(defaultCycleDays)";
            str3 = "cycleStartDate.countEndDays(defaultPeriodDays)";
            j2 = 1;
        } else {
            MenstrualCyclePredictiveBean menstrualCyclePredictiveBean = (MenstrualCyclePredictiveBean) sc8.a(strT, MenstrualCyclePredictiveBean.class);
            if (!menstrualCyclePredictiveBean.getCycleList().isEmpty()) {
                List<MenstrualCyclePredictiveItemBean> cycleList2 = menstrualCyclePredictiveBean.getCycleList();
                if (cycleList2.size() > 1) {
                    CollectionsKt__MutableCollectionsJVMKt.sortWith(cycleList2, new b());
                }
                LocalDate predictiveDataStartDate = o05.D(((MenstrualCyclePredictiveItemBean) CollectionsKt___CollectionsKt.first((List) menstrualCyclePredictiveBean.getCycleList())).getCycleStartDate()).minusDays(1L);
                a7b.f("CycleDataHandler", " predictiveDataStartDate = " + predictiveDataStartDate);
                long endDate3 = ((Cycle) CollectionsKt___CollectionsKt.last((List) cycleList)).getEndDate();
                String str10 = "predictive data is isBefore lastCycleEndDate";
                if (predictiveDataStartDate.isAfter(o05.D(endDate3))) {
                    Intrinsics.checkNotNullExpressionValue(firstPredictCycleStartDate, "firstPredictCycleStartDate");
                    Intrinsics.checkNotNullExpressionValue(predictiveDataStartDate, "cycleStartDate");
                    o05.e(firstPredictCycleStartDate, predictiveDataStartDate);
                    LocalDate localDateD = o05.D(endDate3);
                    Intrinsics.checkNotNullExpressionValue(predictiveDataStartDate, "predictiveDataStartDate");
                    Iterator<Integer> it = RangesKt___RangesKt.until(0, y(localDateD, predictiveDataStartDate)).iterator();
                    LocalDate localDate5 = predictiveDataStartDate;
                    LocalDate cycleEndDate = localDate5;
                    while (it.hasNext()) {
                        ((IntIterator) it).nextInt();
                        Intrinsics.checkNotNullExpressionValue(cycleEndDate, "cycleEndDate");
                        int iE = o05.e(firstPredictCycleStartDate, cycleEndDate);
                        a7b.f(str6, " predictionCycleStartDateToAlgor = " + iE + " ; CycleDays = " + defaultCycleDays);
                        if (iE >= defaultCycleDays + 15) {
                            Intrinsics.checkNotNullExpressionValue(localDate5, str9);
                            long jH = o05.H(localDate5);
                            StringBuilder sb = new StringBuilder();
                            LocalDate localDate6 = predictiveDataStartDate;
                            sb.append(" cycleStartDate.toTime() = ");
                            sb.append(jH);
                            a7b.f(str6, sb.toString());
                            long jH2 = o05.H(localDate5);
                            LocalDate localDateC = o05.c(localDate5, defaultCycleDays);
                            Intrinsics.checkNotNullExpressionValue(localDateC, str8);
                            long jH3 = o05.H(localDateC);
                            long jH4 = o05.H(localDate5);
                            LocalDate localDateC2 = o05.c(localDate5, defaultPeriodDays);
                            Intrinsics.checkNotNullExpressionValue(localDateC2, str7);
                            localDate3 = cycleEndDate;
                            localDate2 = localDate6;
                            cycleG = g(this, jH2, jH3, CollectionsKt__CollectionsKt.mutableListOf(new Period(jH4, o05.H(localDateC2), System.currentTimeMillis(), PeriodCloseStatus.PREDICT, null, 16, null)), true, null, false, null, 112, null);
                            localDate4 = firstPredictCycleStartDate;
                        } else {
                            localDate2 = predictiveDataStartDate;
                            localDate3 = cycleEndDate;
                            LocalDate localDate7 = firstPredictCycleStartDate;
                            long jH5 = o05.H(localDate7);
                            long jH6 = o05.H(localDate3);
                            long jH7 = o05.H(localDate7);
                            LocalDate localDateC3 = o05.c(localDate7, defaultPeriodDays);
                            Intrinsics.checkNotNullExpressionValue(localDateC3, "firstPredictCycleStartDa…ndDays(defaultPeriodDays)");
                            List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new Period(jH7, o05.H(localDateC3), System.currentTimeMillis(), PeriodCloseStatus.PREDICT, null, 16, null));
                            localDate4 = localDate7;
                            cycleG = g(this, jH5, jH6, listMutableListOf, true, null, false, null, 112, null);
                        }
                        if (o05.D(cycleG.getStartDate()).isAfter(o05.D(endDate3))) {
                            List<Cycle> list = cycleList;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    Cycle cycle = (Cycle) it2.next();
                                    if (cycle.getStartDate() <= cycleG.getStartDate() && cycle.getEndDate() >= cycleG.getEndDate()) {
                                        z = true;
                                        break;
                                    }
                                }
                            } else {
                                z = false;
                                break;
                            }
                            if (!z) {
                                cycleList.add(cycleG);
                            }
                            LocalDate localDateMinusDays = o05.D(cycleG.getStartDate()).minusDays(defaultCycleDays);
                            if (localDateMinusDays.isBefore(o05.D(endDate3))) {
                                localDateMinusDays = localDate4;
                            }
                            j3 = 1;
                            cycleEndDate = o05.D(cycleG.getStartDate()).minusDays(1L);
                            localDate5 = localDateMinusDays;
                        } else {
                            j3 = 1;
                            cycleEndDate = localDate3;
                            localDate5 = localDate5;
                        }
                        j4 = j3;
                        firstPredictCycleStartDate = localDate4;
                        str10 = str10;
                        str9 = str9;
                        str8 = str8;
                        str7 = str7;
                        str6 = str6;
                        predictiveDataStartDate = localDate2;
                    }
                    localDate = predictiveDataStartDate;
                    str = str9;
                    str2 = str8;
                    str3 = str7;
                    j2 = j4;
                    str5 = str6;
                    str4 = str10;
                } else {
                    localDate = predictiveDataStartDate;
                    str4 = "predictive data is isBefore lastCycleEndDate";
                    str = "cycleStartDate";
                    str2 = "cycleStartDate.countEndDays(defaultCycleDays)";
                    str3 = "cycleStartDate.countEndDays(defaultPeriodDays)";
                    str5 = "CycleDataHandler";
                    j2 = 1;
                    a7b.f(str5, str4);
                }
                if (o05.D(endDate2).isBefore(localDate)) {
                    i = 1;
                    if (!menstrualCyclePredictiveBean.getCycleList().isEmpty()) {
                        for (MenstrualCyclePredictiveItemBean menstrualCyclePredictiveItemBean : menstrualCyclePredictiveBean.getCycleList()) {
                            cycleList.add(new Cycle(menstrualCyclePredictiveItemBean.getCycleStartDate(), menstrualCyclePredictiveItemBean.getCycleEndDate(), CollectionsKt__CollectionsKt.mutableListOf(new Period(menstrualCyclePredictiveItemBean.getPeriodStartDate(), menstrualCyclePredictiveItemBean.getPeriodEndDate(), System.currentTimeMillis(), PeriodCloseStatus.PREDICT, null, 16, null)), new cyd(menstrualCyclePredictiveItemBean.getOvulationStartDate(), menstrualCyclePredictiveItemBean.getOvulationEndDate(), Long.valueOf(menstrualCyclePredictiveItemBean.getOvulationDay()), Long.valueOf(menstrualCyclePredictiveBean.getModifiedTime()), 1, false, null, 96, null), true));
                        }
                    }
                } else {
                    i = 1;
                    a7b.f(str5, str4);
                }
            } else {
                str = "cycleStartDate";
                str2 = "cycleStartDate.countEndDays(defaultCycleDays)";
                str3 = "cycleStartDate.countEndDays(defaultPeriodDays)";
                j2 = 1;
            }
        }
        if (cycleList.size() > i) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(cycleList, new c());
        }
        long endDate4 = ((Cycle) CollectionsKt___CollectionsKt.last((List) cycleList)).getEndDate();
        LocalDate localDatePlusDays = o05.D(endDate4).plusDays(j2);
        Iterator<Integer> it3 = RangesKt___RangesKt.until(0, y(o05.D(endDate4), d)).iterator();
        LocalDate localDatePlusDays2 = localDatePlusDays;
        while (it3.hasNext()) {
            ((IntIterator) it3).nextInt();
            String str11 = str;
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, str11);
            long jH8 = o05.H(localDatePlusDays2);
            LocalDate localDateC4 = o05.c(localDatePlusDays2, defaultCycleDays);
            String str12 = str2;
            Intrinsics.checkNotNullExpressionValue(localDateC4, str12);
            long jH9 = o05.H(localDateC4);
            long jH10 = o05.H(localDatePlusDays2);
            LocalDate localDateC5 = o05.c(localDatePlusDays2, defaultPeriodDays);
            String str13 = str3;
            Intrinsics.checkNotNullExpressionValue(localDateC5, str13);
            cycleList.add(g(this, jH8, jH9, CollectionsKt__CollectionsKt.mutableListOf(new Period(jH10, o05.H(localDateC5), System.currentTimeMillis(), PeriodCloseStatus.PREDICT, null, 16, null)), true, null, false, null, 112, null));
            localDatePlusDays2 = localDatePlusDays2.plusDays(defaultCycleDays);
            str2 = str12;
            str = str11;
            str3 = str13;
        }
    }

    @NotNull
    public final Cycle e(long startDate, long endDate, @NotNull List<Period> periodList, boolean isPredict, @NotNull List<cyd> allOvulationData, boolean isSkipCheckOvulation, @Nullable List<cyd> pendingOvulationDeletions) {
        Intrinsics.checkNotNullParameter(periodList, "periodList");
        Intrinsics.checkNotNullParameter(allOvulationData, "allOvulationData");
        if (periodList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(periodList, new d(startDate));
        }
        LocalDate localDateD = o05.D(((Period) CollectionsKt___CollectionsKt.last((List) periodList)).getEndDate());
        int iD = o05.d(startDate, endDate);
        double dCeil = Math.ceil(o05.e(o05.D(startDate), localDateD) / iD) * ((double) iD);
        if (dCeil > 90.0d) {
            dCeil = 90.0d;
        }
        LocalDate localDateC = o05.c(o05.D(startDate), (int) dCeil);
        Intrinsics.checkNotNullExpressionValue(localDateC, "startDate.toLocalDate().…ndDays(cycleDate.toInt())");
        Cycle cycle = new Cycle(startDate, o05.H(localDateC), periodList, null, isPredict);
        j(cycle, allOvulationData, isSkipCheckOvulation, pendingOvulationDeletions);
        return cycle;
    }

    @NotNull
    public final Cycle f(@NotNull Period firstPeriod, @NotNull Period anotherCyclePeriod, @NotNull List<cyd> allOvulationData, @Nullable List<cyd> pendingOvulationDeletions) {
        Intrinsics.checkNotNullParameter(firstPeriod, "firstPeriod");
        Intrinsics.checkNotNullParameter(anotherCyclePeriod, "anotherCyclePeriod");
        Intrinsics.checkNotNullParameter(allOvulationData, "allOvulationData");
        long startDate = firstPeriod.getStartDate();
        LocalDate localDateMinusDays = o05.D(anotherCyclePeriod.getStartDate()).minusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "anotherCyclePeriod.start…oLocalDate().minusDays(1)");
        return g(this, startDate, o05.H(localDateMinusDays), CollectionsKt__CollectionsKt.mutableListOf(firstPeriod), false, allOvulationData, false, pendingOvulationDeletions, 40, null);
    }

    public final void h(List<cyd> deleteList, List<cyd> pendingOvulationDeletions) {
        if (pendingOvulationDeletions != null) {
            pendingOvulationDeletions.addAll(deleteList);
        } else {
            m(deleteList);
        }
    }

    public final void i(Cycle toMergeCycle, Cycle beMergedCycle, int defaultCycleDays, boolean isLastCycle) {
        LocalDate localDateD = o05.D(toMergeCycle.getStartDate());
        LocalDate localDateD2 = o05.D(toMergeCycle.getEndDate());
        LocalDate localDateD3 = o05.D(beMergedCycle.getStartDate());
        LocalDate localDateD4 = o05.D(beMergedCycle.getEndDate());
        toMergeCycle.k(o05.H(o05.q(localDateD, localDateD3)));
        toMergeCycle.h(o05.H(o05.p(localDateD2, localDateD4)));
        if (isLastCycle) {
            LocalDate localDatePlusDays = localDateD.plusDays(((long) defaultCycleDays) - 1);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "toMergeStartDate.plusDay…ltCycleDays.toLong() - 1)");
            toMergeCycle.h(o05.H(localDatePlusDays));
        }
    }

    public final void j(Cycle cycle, List<cyd> allOvulationData, boolean isSkipCheckOvulation, List<cyd> pendingOvulationDeletions) {
        if (o05.d(cycle.getStartDate(), cycle.getEndDate()) < 14) {
            return;
        }
        LocalDate localDateD = o05.D(((Period) CollectionsKt___CollectionsKt.last((List) cycle.e())).getEndDate());
        cyd cydVarK = K(cycle, allOvulationData, isSkipCheckOvulation, pendingOvulationDeletions);
        if (cydVarK == null) {
            LocalDate ovulationDay = o05.D(cycle.getEndDate()).minusDays(13L);
            LocalDate ovulationStartDate = ovulationDay.minusDays(5L);
            if (!ovulationDay.isAfter(localDateD)) {
                cycle.i(null);
                return;
            }
            if (!ovulationStartDate.isAfter(localDateD)) {
                ovulationStartDate = localDateD.plusDays(1L);
            }
            Intrinsics.checkNotNullExpressionValue(ovulationStartDate, "ovulationStartDate");
            long jH = o05.H(ovulationStartDate);
            Intrinsics.checkNotNullExpressionValue(ovulationDay, "ovulationEndDate");
            long jH2 = o05.H(ovulationDay);
            Intrinsics.checkNotNullExpressionValue(ovulationDay, "ovulationDay");
            cycle.i(new cyd(jH, jH2, Long.valueOf(o05.H(ovulationDay)), 0L, 1, false, null, 96, null));
            return;
        }
        if (o05.D(cydVarK.getCom.oplus.aiunit.vision.f04.JSON_KEY_DIGITAL_KEY_START_TIME java.lang.String()).isAfter(localDateD)) {
            cycle.i(cydVarK);
            return;
        }
        if (!o05.D(cydVarK.getEndDate()).isAfter(localDateD) && cydVarK.getIsDbDate()) {
            h(CollectionsKt__CollectionsJVMKt.listOf(cydVarK), pendingOvulationDeletions);
        }
        LocalDate ovulationDay2 = o05.D(cycle.getEndDate()).minusDays(13L);
        LocalDate ovulationStartDate2 = ovulationDay2.minusDays(5L);
        if (!ovulationDay2.isAfter(localDateD)) {
            cycle.i(null);
            return;
        }
        if (ovulationStartDate2.isBefore(localDateD)) {
            ovulationStartDate2 = localDateD.plusDays(1L);
        }
        Intrinsics.checkNotNullExpressionValue(ovulationStartDate2, "ovulationStartDate");
        long jH3 = o05.H(ovulationStartDate2);
        Intrinsics.checkNotNullExpressionValue(ovulationDay2, "ovulationEndDate");
        long jH4 = o05.H(ovulationDay2);
        Intrinsics.checkNotNullExpressionValue(ovulationDay2, "ovulationDay");
        cycle.i(new cyd(jH3, jH4, Long.valueOf(o05.H(ovulationDay2)), 0L, 1, false, null, 96, null));
    }

    public final boolean l(@NotNull Cycle cycle) {
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        return o05.D(cycle.getEndDate()).isBefore(LocalDate.now()) && I(cycle);
    }

    public final void m(List<cyd> deleteList) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.b("CycleData")), null, null, new CycleDataHandler$executeDeleteOvulations$1(deleteList, this, null), 3, null);
    }

    @NotNull
    public final Cycle n(int pos, @NotNull LocalDate fakeEndDate) {
        Intrinsics.checkNotNullParameter(fakeEndDate, "fakeEndDate");
        LocalDate EARLIEST_DAY = f4971c;
        Intrinsics.checkNotNullExpressionValue(EARLIEST_DAY, "EARLIEST_DAY");
        LocalDate localDateMinusDays = fakeEndDate.minusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "fakeEndDate.minusDays(1L)");
        int iE = o05.e(EARLIEST_DAY, localDateMinusDays) % 30;
        if (pos == 0) {
            Intrinsics.checkNotNullExpressionValue(EARLIEST_DAY, "EARLIEST_DAY");
            long jH = o05.H(EARLIEST_DAY);
            Intrinsics.checkNotNullExpressionValue(EARLIEST_DAY, "EARLIEST_DAY");
            LocalDate localDateC = o05.c(EARLIEST_DAY, iE);
            Intrinsics.checkNotNullExpressionValue(localDateC, "EARLIEST_DAY.countEndDays(firstCycleDays)");
            return new Cycle(jH, o05.H(localDateC), new ArrayList(), null, false, 24, null);
        }
        LocalDate fakeCycleStartDate = EARLIEST_DAY.plusDays(iE + ((pos - 1) * 30));
        Intrinsics.checkNotNullExpressionValue(fakeCycleStartDate, "fakeCycleStartDate");
        long jH2 = o05.H(fakeCycleStartDate);
        LocalDate localDateC2 = o05.c(fakeCycleStartDate, 30);
        Intrinsics.checkNotNullExpressionValue(localDateC2, "fakeCycleStartDate.countEndDays(cycleDefaultDays)");
        return new Cycle(jH2, o05.H(localDateC2), new ArrayList(), null, false, 24, null);
    }

    @Nullable
    public final Period o(@Nullable Cycle cycle, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        if (cycle == null) {
            return null;
        }
        List<Period> listE = cycle.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            Period period = (Period) obj;
            if (o05.m(date, o05.D(period.getStartDate()), o05.D(period.getEndDate()))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Period) CollectionsKt___CollectionsKt.first((List) arrayList);
    }

    @NotNull
    public final List<DateType> p(@NotNull LocalDate date, @Nullable List<Cycle> cycleList) {
        Intrinsics.checkNotNullParameter(date, "date");
        return s(r(cycleList, date), date);
    }

    public final CycleRepository q() {
        return (CycleRepository) this.cycleRepository.getValue();
    }

    @Nullable
    public final Cycle r(@Nullable List<Cycle> cycleList, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        List<Cycle> list = cycleList;
        Object obj = null;
        if ((list == null || list.isEmpty()) || !o05.l(o05.H(date), ((Cycle) CollectionsKt___CollectionsKt.first((List) cycleList)).getStartDate(), ((Cycle) CollectionsKt___CollectionsKt.last((List) cycleList)).getEndDate())) {
            return null;
        }
        for (Object obj2 : cycleList) {
            Cycle cycle = (Cycle) obj2;
            if (o05.l(o05.H(date), cycle.getStartDate(), cycle.getEndDate())) {
                obj = obj2;
                break;
            }
        }
        return (Cycle) obj;
    }

    @NotNull
    public final List<DateType> s(@Nullable Cycle cycle, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        ArrayList arrayList = new ArrayList();
        if (J(date)) {
            arrayList.add(DateType.TODAY);
        }
        if (B(date)) {
            arrayList.add(DateType.FUTURE);
        }
        if (F(date)) {
            arrayList.add(DateType.PAST);
        }
        if (cycle == null) {
            return arrayList;
        }
        if (G(date, cycle)) {
            arrayList.add(DateType.PERIOD);
        }
        if (H(date, cycle)) {
            arrayList.add(DateType.PREDICT_PERIOD);
        }
        if (D(date, cycle)) {
            arrayList.add(DateType.OVULATION);
        }
        if (E(date, cycle)) {
            arrayList.add(DateType.OVULATION_DAY);
        }
        return arrayList;
    }

    public final int t(@Nullable List<Cycle> cycleList, @NotNull LocalDate curDate) {
        Intrinsics.checkNotNullParameter(curDate, "curDate");
        List<Cycle> list = cycleList;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : cycleList) {
            List<Period> listE = ((Cycle) obj).e();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listE) {
                if (((Period) obj2).getCloseStatus() == PeriodCloseStatus.PREDICT) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        LocalDate startDelayDay = o05.D(((Cycle) CollectionsKt___CollectionsKt.last((List) arrayList)).getEndDate()).plusDays(1L);
        if (!curDate.isAfter(startDelayDay)) {
            return 0;
        }
        Intrinsics.checkNotNullExpressionValue(startDelayDay, "startDelayDay");
        return o05.e(startDelayDay, curDate);
    }

    public final int u(@NotNull LocalDate date, @Nullable List<Cycle> cycleList) {
        Intrinsics.checkNotNullParameter(date, "date");
        List<Cycle> list = cycleList;
        if (!(list == null || list.isEmpty()) && !date.isBefore(o05.D(((Cycle) CollectionsKt___CollectionsKt.first((List) cycleList)).getStartDate()))) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : cycleList) {
                Cycle cycle = (Cycle) obj;
                if (o05.m(date, o05.D(cycle.getStartDate()), o05.D(cycle.getEndDate()))) {
                    arrayList.add(obj);
                }
            }
            LocalDate EARLIEST_DAY = f4971c;
            Intrinsics.checkNotNullExpressionValue(EARLIEST_DAY, "EARLIEST_DAY");
            return y(EARLIEST_DAY, o05.D(((Cycle) CollectionsKt___CollectionsKt.first((List) cycleList)).getStartDate())) + (arrayList.isEmpty() ? 0 : cycleList.indexOf(CollectionsKt___CollectionsKt.first((List) arrayList)));
        }
        int iN = CycleSettingHelper.INSTANCE.n();
        LocalDate firstDate = list == null || list.isEmpty() ? LocalDate.now() : o05.D(((Cycle) CollectionsKt___CollectionsKt.first((List) cycleList)).getStartDate());
        LocalDate EARLIEST_DAY2 = f4971c;
        Intrinsics.checkNotNullExpressionValue(EARLIEST_DAY2, "EARLIEST_DAY");
        Intrinsics.checkNotNullExpressionValue(firstDate, "firstDate");
        int iE = o05.e(EARLIEST_DAY2, firstDate) % iN;
        if (iE == 0) {
            iE = iN;
        }
        Intrinsics.checkNotNullExpressionValue(EARLIEST_DAY2, "EARLIEST_DAY");
        if (o05.e(EARLIEST_DAY2, date) < iE) {
            return 0;
        }
        Intrinsics.checkNotNullExpressionValue(EARLIEST_DAY2, "EARLIEST_DAY");
        return ((o05.e(EARLIEST_DAY2, date) - iE) / iN) + 1;
    }

    @NotNull
    public final Cycle v(@Nullable List<Cycle> cycleList, @NotNull LocalDate date) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(date, "date");
        if (cycleList != null) {
            arrayList = new ArrayList();
            for (Object obj : cycleList) {
                Cycle cycle = (Cycle) obj;
                if (o05.m(date, o05.D(cycle.getStartDate()), o05.D(cycle.getEndDate()))) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        if (!(arrayList2 == null || arrayList2.isEmpty())) {
            return (Cycle) CollectionsKt___CollectionsKt.first((List) arrayList);
        }
        int iU = u(date, cycleList);
        List<Cycle> list = cycleList;
        LocalDate date2 = list == null || list.isEmpty() ? LocalDate.now() : o05.D(((Cycle) CollectionsKt___CollectionsKt.first((List) cycleList)).getStartDate());
        Intrinsics.checkNotNullExpressionValue(date2, "date");
        return n(iU, date2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    @NotNull
    public final Period w(@Nullable List<Cycle> cycleList, @NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        ArrayList arrayList;
        Period period;
        Object next;
        Object next2;
        Period period2;
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Object obj = null;
        if (cycleList != null) {
            List<Cycle> list = cycleList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Cycle) it.next()).e());
            }
            List listFlatten = CollectionsKt__IterablesKt.flatten(arrayList2);
            if (listFlatten != null) {
                arrayList = new ArrayList();
                for (Object obj2 : listFlatten) {
                    if (((Period) obj2).getCloseStatus() != PeriodCloseStatus.PREDICT) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                period2 = (Period) next2;
            } while (!o05.m(endDate, o05.D(period2.getStartDate()), o05.D(period2.getEndDate())));
            period = (Period) next2;
        } else {
            period = null;
        }
        ui4.Companion aVar = ui4.INSTANCE;
        aVar.b("CycleDataHandler", "getMergePeriod " + period + ", " + startDate + "-" + endDate);
        if (period != null && Intrinsics.areEqual(o05.D(period.getStartDate()), startDate) && Intrinsics.areEqual(o05.D(period.getEndDate()), endDate) && period.getCloseStatus() == PeriodCloseStatus.OPENING) {
            period.k(PeriodCloseStatus.MANUAL_CLOSE);
            period.j(System.currentTimeMillis());
            return period;
        }
        PeriodCloseStatus closeStatus = Intrinsics.areEqual(endDate, LocalDate.now()) ? PeriodCloseStatus.OPENING : PeriodCloseStatus.MANUAL_CLOSE;
        long jH = o05.H(startDate);
        long jH2 = o05.H(endDate);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strG = ilj.g();
        Intrinsics.checkNotNullExpressionValue(strG, "getDataClient()");
        Period period3 = new Period(jH, jH2, jCurrentTimeMillis, closeStatus, strG);
        if (arrayList == null || arrayList.isEmpty()) {
            aVar.b("CycleDataHandler", "getMergePeriod return " + period3);
            return period3;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!Intrinsics.areEqual(startDate.minusDays(1L), o05.D(((Period) next).getEndDate())));
        Period period4 = (Period) next;
        ui4.INSTANCE.b("CycleDataHandler", "getMergePeriod beforePeriod:" + period4);
        for (Object obj3 : arrayList) {
            if (Intrinsics.areEqual(endDate.plusDays(1L), o05.D(((Period) obj3).getStartDate()))) {
                obj = obj3;
                break;
            }
        }
        Period period5 = (Period) obj;
        if (period4 != null && period5 == null) {
            long startDate2 = period4.getStartDate();
            long jH3 = o05.H(endDate);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (!Intrinsics.areEqual(endDate, LocalDate.now())) {
                closeStatus = period4.getCloseStatus();
            }
            String strG2 = ilj.g();
            Intrinsics.checkNotNullExpressionValue(strG2, "getDataClient()");
            Period period6 = new Period(startDate2, jH3, jCurrentTimeMillis2, closeStatus, strG2);
            ui4.INSTANCE.b("CycleDataHandler", "getMergePeriod return " + period6);
            return period6;
        }
        if (period4 != null && period5 != null) {
            long startDate3 = period4.getStartDate();
            long endDate2 = period5.getEndDate();
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            PeriodCloseStatus closeStatus2 = period5.getCloseStatus();
            String strG3 = ilj.g();
            Intrinsics.checkNotNullExpressionValue(strG3, "getDataClient()");
            return new Period(startDate3, endDate2, jCurrentTimeMillis3, closeStatus2, strG3);
        }
        ui4.Companion aVar2 = ui4.INSTANCE;
        aVar2.b("CycleDataHandler", "getMergePeriod afterPeriod:" + period5);
        if (period5 != null) {
            period5.l(o05.H(startDate));
            period5.j(System.currentTimeMillis());
            String strG4 = ilj.g();
            Intrinsics.checkNotNullExpressionValue(strG4, "getDataClient()");
            period5.h(strG4);
        }
        if (period5 != null) {
            period3 = period5;
        }
        aVar2.b("CycleDataHandler", "getMergePeriod return:" + period3);
        return period3;
    }

    public final PeriodDataHandler x() {
        return (PeriodDataHandler) this.periodDataHandler.getValue();
    }

    public final int y(@NotNull LocalDate startDate, @NotNull LocalDate predictEndDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(predictEndDate, "predictEndDate");
        LocalDate localDateMinusDays = predictEndDate.minusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "predictEndDate.minusDays(1L)");
        return (o05.e(startDate, localDateMinusDays) / RangesKt___RangesKt.coerceAtLeast(CycleSettingHelper.INSTANCE.n(), 1)) + 1;
    }

    @NotNull
    public final List<Cycle> z(@Nullable List<Cycle> cycleList) {
        List<Cycle> listT = T(cycleList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listT) {
            if (l((Cycle) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
