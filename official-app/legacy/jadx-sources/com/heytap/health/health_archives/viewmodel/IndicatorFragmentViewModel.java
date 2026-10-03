package com.heytap.health.health_archives.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.healtharchive.IndicatorStat;
import com.heytap.databaseengine.model.healtharchive.IndicatorTrend;
import com.heytap.databaseengine.model.healtharchive.IndicatorTrendTag;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.bean.HealthIndicatorTagType;
import com.heytap.health.health_archives.bean.IndicatorCategoryBean;
import com.heytap.health.health_archives.model.HealthArchivesRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.hz;
import com.oplus.aiunit.vision.qg0;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.sc8;
import io.protostuff.MapSchema;
import io.reactivex.rxjava3.disposables.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.IndexedValue;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 J2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bH\u0010IJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004J\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004J\u001d\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u0018\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004J\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0002J\u001e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0002J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00132\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R/\u00101\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\u0004\u0012\u00020\t0,0+8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040+8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100R%\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040+8\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R%\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040+8\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u00100R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010#R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010G\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/IndicatorFragmentViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "w", "", "", "tagFilterTypeList", "M", "I", "", "isOwnerChanged", "A", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/health/health_archives/bean/IndicatorCategoryBean;", "y", "category", "N", "tagList", "Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorStat;", "H", "categoryName", "z", "list", "O", "indicatorStat", "", "tagSet", "x", "v", "stat", "K", "categoryList", "J", "j", "Ljava/util/List;", "mAllIndicatorStatList", "", MapSchema.FIELD_NAME_KEY, "Ljava/util/Map;", "mIndicatorCategoryMap", LogFieldKey.LEVEL_KEY, "mTagOfCategoryMap", "Lcom/heytap/health/base/livedata/OLiveData;", "Lkotlin/Pair;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", UserInfo.SEX_FEMALE, "()Lcom/heytap/health/base/livedata/OLiveData;", "mObserveDataList", "n", "D", "mFilterStatObserveDataList", "o", ExifInterface.LONGITUDE_EAST, "mFilterTagObserveList", LogFieldKey.PROCESS_NAME_KEY, "G", "mTagTypeList", "q", "mTagFilterTypeList", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "r", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "mRepository", "s", "Ljava/lang/String;", "C", "()Ljava/lang/String;", "L", "(Ljava/lang/String;)V", "mFilterCategory", "<init>", "()V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIndicatorFragmentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndicatorFragmentViewModel.kt\ncom/heytap/health/health_archives/viewmodel/IndicatorFragmentViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1477#2:307\n1502#2,3:308\n1505#2,3:318\n1238#2,4:323\n1855#2,2:327\n1855#2,2:330\n1855#2:333\n1856#2:335\n1549#2:336\n1620#2,3:337\n1179#2,2:340\n1253#2,4:342\n766#2:346\n857#2,2:347\n1549#2:349\n1620#2,3:350\n1045#2:353\n766#2:354\n857#2,2:355\n1747#2,3:357\n1045#2:360\n1855#2,2:361\n372#3,7:311\n453#3:321\n403#3:322\n215#4:329\n216#4:332\n1#5:334\n*S KotlinDebug\n*F\n+ 1 IndicatorFragmentViewModel.kt\ncom/heytap/health/health_archives/viewmodel/IndicatorFragmentViewModel\n*L\n89#1:307\n89#1:308,3\n89#1:318,3\n95#1:323,4\n99#1:327,2\n112#1:330,2\n130#1:333\n130#1:335\n156#1:336\n156#1:337,3\n192#1:340,2\n192#1:342,4\n194#1:346\n194#1:347,2\n195#1:349\n195#1:350,3\n199#1:353\n223#1:354\n223#1:355,2\n248#1:357,3\n276#1:360\n295#1:361,2\n89#1:311,7\n95#1:321\n95#1:322\n110#1:329\n110#1:332\n*E\n"})
public final class IndicatorFragmentViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "HealthArchivesViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<IndicatorStat> mAllIndicatorStatList = new ArrayList();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Map<String, List<IndicatorStat>> mIndicatorCategoryMap = new LinkedHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, List<String>> mTagOfCategoryMap = new LinkedHashMap();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<Pair<List<IndicatorStat>, Boolean>> mObserveDataList = new OLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<List<IndicatorStat>> mFilterStatObserveDataList = new OLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<List<String>> mFilterTagObserveList = new OLiveData<>();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<List<String>> mTagTypeList = new OLiveData<>();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final List<String> mTagFilterTypeList = new ArrayList();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final HealthArchivesRepository mRepository = new HealthArchivesRepository();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public String mFilterCategory;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 IndicatorFragmentViewModel.kt\ncom/heytap/health/health_archives/viewmodel/IndicatorFragmentViewModel\n*L\n1#1,328:1\n80#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((IndicatorStat) t2).getTag()), Integer.valueOf(((IndicatorStat) t).getTag()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 IndicatorFragmentViewModel.kt\ncom/heytap/health/health_archives/viewmodel/IndicatorFragmentViewModel\n*L\n1#1,328:1\n81#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        public final /* synthetic */ Comparator i;

        public c(Comparator comparator) {
            this.i = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.i.compare(t, t2);
            return iCompare != 0 ? iCompare : ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((IndicatorStat) t2).getState()), Integer.valueOf(((IndicatorStat) t).getState()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 IndicatorFragmentViewModel.kt\ncom/heytap/health/health_archives/viewmodel/IndicatorFragmentViewModel\n*L\n1#1,328:1\n82#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        public final /* synthetic */ Comparator i;

        public d(Comparator comparator) {
            this.i = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.i.compare(t, t2);
            return iCompare != 0 ? iCompare : ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((IndicatorStat) t2).getUpdateTime()), Long.valueOf(((IndicatorStat) t).getUpdateTime()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 IndicatorFragmentViewModel.kt\ncom/heytap/health/health_archives/viewmodel/IndicatorFragmentViewModel\n*L\n1#1,328:1\n83#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        public final /* synthetic */ Comparator i;

        public e(Comparator comparator) {
            this.i = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.i.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            IndicatorTrend indicatorTrend = (IndicatorTrend) CollectionsKt___CollectionsKt.lastOrNull((List) ((IndicatorStat) t2).getTrendList());
            Comparable comparableValueOf = indicatorTrend != null ? Long.valueOf(indicatorTrend.getTime()) : 0;
            IndicatorTrend indicatorTrend2 = (IndicatorTrend) CollectionsKt___CollectionsKt.lastOrNull((List) ((IndicatorStat) t).getTrendList());
            return ComparisonsKt__ComparisonsKt.compareValues(comparableValueOf, indicatorTrend2 != null ? Long.valueOf(indicatorTrend2.getTime()) : 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 IndicatorFragmentViewModel.kt\ncom/heytap/health/health_archives/viewmodel/IndicatorFragmentViewModel\n*L\n1#1,328:1\n276#2:329\n*E\n"})
    public static final class f<T> implements Comparator {
        public final /* synthetic */ Map i;

        public f(Map map) {
            this.i = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Integer num = (Integer) this.i.get(StringsKt__StringsJVMKt.replace$default(((IndicatorCategoryBean) t).getName(), " ", "", false, 4, (Object) null));
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            Integer num2 = (Integer) this.i.get(StringsKt__StringsJVMKt.replace$default(((IndicatorCategoryBean) t2).getName(), " ", "", false, 4, (Object) null));
            return ComparisonsKt__ComparisonsKt.compareValues(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 IndicatorFragmentViewModel.kt\ncom/heytap/health/health_archives/viewmodel/IndicatorFragmentViewModel\n*L\n1#1,328:1\n199#2:329\n*E\n"})
    public static final class g<T> implements Comparator {
        public final /* synthetic */ Map i;

        public g(Map map) {
            this.i = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Integer num = (Integer) this.i.get((String) t);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            Integer num2 = (Integer) this.i.get((String) t2);
            return ComparisonsKt__ComparisonsKt.compareValues(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
        }
    }

    public static /* synthetic */ Object B(IndicatorFragmentViewModel indicatorFragmentViewModel, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return indicatorFragmentViewModel.A(z, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object A(boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        IndicatorFragmentViewModel$getIndicatorStat$1 indicatorFragmentViewModel$getIndicatorStat$1;
        String category;
        if (continuation instanceof IndicatorFragmentViewModel$getIndicatorStat$1) {
            indicatorFragmentViewModel$getIndicatorStat$1 = (IndicatorFragmentViewModel$getIndicatorStat$1) continuation;
            int i = indicatorFragmentViewModel$getIndicatorStat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                indicatorFragmentViewModel$getIndicatorStat$1.label = i - Integer.MIN_VALUE;
            } else {
                indicatorFragmentViewModel$getIndicatorStat$1 = new IndicatorFragmentViewModel$getIndicatorStat$1(this, continuation);
            }
        } else {
            indicatorFragmentViewModel$getIndicatorStat$1 = new IndicatorFragmentViewModel$getIndicatorStat$1(this, continuation);
        }
        IndicatorFragmentViewModel$getIndicatorStat$1 indicatorFragmentViewModel$getIndicatorStat$2 = indicatorFragmentViewModel$getIndicatorStat$1;
        Object objQ = indicatorFragmentViewModel$getIndicatorStat$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = indicatorFragmentViewModel$getIndicatorStat$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQ);
            String strE = qg0.i().E(qg0.HEALTH_ARCHIVES_SELECT_OWNER, "");
            String str = Intrinsics.areEqual(strE, qtf.l(R$string.health_archives_no_name)) ? "" : strE;
            HealthArchivesRepository healthArchivesRepository = this.mRepository;
            indicatorFragmentViewModel$getIndicatorStat$2.L$0 = this;
            indicatorFragmentViewModel$getIndicatorStat$2.Z$0 = z;
            indicatorFragmentViewModel$getIndicatorStat$2.label = 1;
            objQ = healthArchivesRepository.q((14 & 1) != 0 ? null : null, (14 & 2) != 0 ? null : str, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, indicatorFragmentViewModel$getIndicatorStat$2);
            if (objQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = indicatorFragmentViewModel$getIndicatorStat$2.Z$0;
            this = (IndicatorFragmentViewModel) indicatorFragmentViewModel$getIndicatorStat$2.L$0;
            ResultKt.throwOnFailure(objQ);
        }
        this.mAllIndicatorStatList = CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.sortedWith((List) objQ, new e(new d(new c(new b())))));
        String string = qtf.d().getString(R$string.health_archives_other_category);
        Intrinsics.checkNotNullExpressionValue(string, "getContext().getString(R…_archives_other_category)");
        List<IndicatorStat> list = this.mAllIndicatorStatList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            IndicatorStat indicatorStat = (IndicatorStat) obj;
            String category2 = indicatorStat.getCategory();
            if ((category2 == null || category2.length() == 0) || Intrinsics.areEqual(indicatorStat.getCategory(), qtf.d().getString(R$string.health_archives_other))) {
                category = string;
            } else {
                category = indicatorStat.getCategory();
                Intrinsics.checkNotNull(category);
            }
            Object arrayList = linkedHashMap.get(category);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(category, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), CollectionsKt___CollectionsKt.toMutableList((Collection) entry.getValue()));
        }
        this.mIndicatorCategoryMap = MapsKt__MapsKt.toMutableMap(linkedHashMap2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (IndicatorStat indicatorStat2 : this.mAllIndicatorStatList) {
            this.v(indicatorStat2, linkedHashSet);
            this.x(indicatorStat2, linkedHashSet);
        }
        this.mTagOfCategoryMap.clear();
        String string2 = qtf.d().getString(R$string.health_archives_all_abnormal_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getContext().getString(R…hives_all_abnormal_title)");
        this.mTagOfCategoryMap.put(string2, CollectionsKt___CollectionsKt.toMutableList((Collection) linkedHashSet));
        for (Map.Entry<String, List<IndicatorStat>> entry2 : this.mIndicatorCategoryMap.entrySet()) {
            String key = entry2.getKey();
            List<IndicatorStat> value = entry2.getValue();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (IndicatorStat indicatorStat3 : value) {
                this.v(indicatorStat3, linkedHashSet2);
                this.x(indicatorStat3, linkedHashSet2);
            }
            this.mTagOfCategoryMap.put(key, CollectionsKt___CollectionsKt.toMutableList((Collection) linkedHashSet2));
        }
        String str2 = this.mFilterCategory;
        if (str2 == null) {
            str2 = string2;
        }
        this.N(str2);
        String str3 = this.mFilterCategory;
        if (str3 != null) {
            string2 = str3;
        }
        this.H(string2, this.mTagFilterTypeList);
        this.mObserveDataList.postValue(new Pair<>(this.mAllIndicatorStatList, Boxing.boxBoolean(z)));
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getMFilterCategory() {
        return this.mFilterCategory;
    }

    @NotNull
    public final OLiveData<List<IndicatorStat>> D() {
        return this.mFilterStatObserveDataList;
    }

    @NotNull
    public final OLiveData<List<String>> E() {
        return this.mFilterTagObserveList;
    }

    @NotNull
    public final OLiveData<Pair<List<IndicatorStat>, Boolean>> F() {
        return this.mObserveDataList;
    }

    @NotNull
    public final OLiveData<List<String>> G() {
        return this.mTagTypeList;
    }

    @NotNull
    public final List<IndicatorStat> H(@NotNull String category, @NotNull List<String> tagList) {
        List<IndicatorStat> list;
        List<IndicatorStat> list2;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(tagList, "tagList");
        String strG = sc8.g(tagList);
        StringBuilder sb = new StringBuilder();
        sb.append("getStatByCategoryTagList category: ");
        sb.append(category);
        sb.append(", tagList: ");
        sb.append(strG);
        if (Intrinsics.areEqual(category, qtf.d().getString(R$string.health_archives_all_abnormal_title))) {
            list = this.mAllIndicatorStatList;
        } else {
            list = this.mIndicatorCategoryMap.get(category);
            if (list == null) {
                this.mFilterStatObserveDataList.postValue(CollectionsKt__CollectionsKt.emptyList());
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
        if (tagList.isEmpty()) {
            list2 = CollectionsKt___CollectionsKt.toList(list);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (K((IndicatorStat) obj, tagList)) {
                    arrayList.add(obj);
                }
            }
            list2 = arrayList;
        }
        this.mFilterStatObserveDataList.postValue(list2);
        return list2;
    }

    @NotNull
    public final List<String> I() {
        String strG = sc8.g(this.mTagFilterTypeList);
        StringBuilder sb = new StringBuilder();
        sb.append("getTagFilterList tagFilterTypeList: ");
        sb.append(strG);
        return CollectionsKt___CollectionsKt.toList(this.mTagFilterTypeList);
    }

    public final List<IndicatorCategoryBean> J(List<IndicatorCategoryBean> categoryList) {
        return CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.sortedWith(categoryList, new f(MapsKt__MapsKt.mapOf(TuplesKt.to(qtf.d().getString(R$string.health_archives_all_abnormal_title), 1), TuplesKt.to(qtf.d().getString(R$string.health_archives_blood_routine), 2), TuplesKt.to(qtf.d().getString(R$string.health_archives_urine_routine), 3), TuplesKt.to(qtf.d().getString(R$string.health_archives_stool_routine), 4), TuplesKt.to(qtf.d().getString(R$string.health_archives_leucorrhea_routine), 5), TuplesKt.to(qtf.d().getString(R$string.health_archives_liver_function), 6), TuplesKt.to(qtf.d().getString(R$string.health_archives_kidney_function), 7), TuplesKt.to(qtf.d().getString(R$string.health_archives_blood_fat), 8), TuplesKt.to(qtf.d().getString(R$string.health_archives_thyroid_function), 9), TuplesKt.to(qtf.d().getString(R$string.health_archives_tumor_markers), 10), TuplesKt.to(qtf.d().getString(R$string.health_archives_other_category), 11)))));
    }

    public final boolean K(IndicatorStat stat, List<String> tagList) {
        boolean zContains;
        IndicatorTrend indicatorTrend = (IndicatorTrend) CollectionsKt___CollectionsKt.lastOrNull((List) stat.getTrendList());
        if (indicatorTrend != null && tagList.contains(qtf.l(R$string.health_archives_indicator_focus_tag)) && indicatorTrend.getRiskRank() == 2) {
            return true;
        }
        if (stat.getTrendTag().isEmpty() && tagList.contains(qtf.l(HealthIndicatorTagType.INDICATOR_OTHER_TREND.getValue()))) {
            return true;
        }
        List<IndicatorTrendTag> trendTag = stat.getTrendTag();
        if (!(trendTag instanceof Collection) || !trendTag.isEmpty()) {
            Iterator<T> it = trendTag.iterator();
            while (it.hasNext()) {
                String tagCode = ((IndicatorTrendTag) it.next()).getTagCode();
                if (tagCode == null || tagCode.length() == 0) {
                    zContains = false;
                } else {
                    Integer numB = HealthIndicatorTagType.INSTANCE.b(tagCode);
                    zContains = tagList.contains(numB != null ? qtf.l(numB.intValue()) : null);
                }
                if (zContains) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void L(@Nullable String str) {
        this.mFilterCategory = str;
    }

    public final void M(@NotNull List<String> tagFilterTypeList) {
        Intrinsics.checkNotNullParameter(tagFilterTypeList, "tagFilterTypeList");
        this.mTagFilterTypeList.clear();
        this.mTagFilterTypeList.addAll(tagFilterTypeList);
        this.mFilterTagObserveList.postValue(this.mTagFilterTypeList);
        String strG = sc8.g(this.mTagFilterTypeList);
        StringBuilder sb = new StringBuilder();
        sb.append("setTagFilterList tagFilterTypeList: ");
        sb.append(strG);
    }

    public final void N(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        StringBuilder sb = new StringBuilder();
        sb.append("sortTagType typeList category: ");
        sb.append(category);
        if (Intrinsics.areEqual(this.mFilterCategory, category)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sortTagType typeList mFilterCategory is same as category: ");
            sb2.append(category);
            return;
        }
        this.mFilterCategory = category;
        this.mTagFilterTypeList.clear();
        this.mFilterTagObserveList.postValue(CollectionsKt___CollectionsKt.toList(this.mTagFilterTypeList));
        List<String> listEmptyList = this.mTagOfCategoryMap.get(category);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{qtf.l(HealthIndicatorTagType.INDICATOR_REGULAR_REVIEW.getValue()), qtf.l(HealthIndicatorTagType.INDICATOR_ATTENTION_REQUIRED.getValue()), qtf.l(HealthIndicatorTagType.INDICATOR_APPROACH_ABNORMAL.getValue()), qtf.l(HealthIndicatorTagType.INDICATOR_UPWARD_TREND.getValue()), qtf.l(HealthIndicatorTagType.INDICATOR_DOWNWARD_TREND.getValue()), qtf.l(HealthIndicatorTagType.INDICATOR_NORMAL_TREND.getValue()), qtf.l(HealthIndicatorTagType.INDICATOR_STABLE.getValue()), qtf.l(HealthIndicatorTagType.INDICATOR_IMAGE.getValue()), qtf.l(HealthIndicatorTagType.INDICATOR_OTHER_TREND.getValue())}));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            Pair pair = TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEmptyList) {
            if (!hz.a((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer numB = HealthIndicatorTagType.INSTANCE.b((String) it.next());
            arrayList2.add(qtf.l(numB != null ? numB.intValue() : HealthIndicatorTagType.INDICATOR_OTHER_TREND.getValue()));
        }
        List<String> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new g(linkedHashMap));
        String strG = sc8.g(listSortedWith);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("sortType sortList: ");
        sb3.append(strG);
        this.mTagTypeList.postValue(listSortedWith);
    }

    public final void O(@NotNull List<IndicatorStat> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((IndicatorStat) it.next()).setNeedBroadcast(false);
        }
        a aVarC = this.mRepository.L(list).c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "mRepository.updateIndica…tatList(list).subscribe()");
        u(aVarC);
    }

    public final void v(IndicatorStat indicatorStat, Set<String> tagSet) {
        IndicatorTrend indicatorTrend = (IndicatorTrend) CollectionsKt___CollectionsKt.lastOrNull((List) indicatorStat.getTrendList());
        if (indicatorTrend == null || tagSet.contains(qtf.l(R$string.health_archives_indicator_focus_tag)) || indicatorTrend.getRiskRank() != 2) {
            return;
        }
        tagSet.add(HealthIndicatorTagType.INDICATOR_REGULAR_REVIEW.getCode());
    }

    public final void w() {
        this.mObserveDataList.postValue(new Pair<>(CollectionsKt__CollectionsKt.emptyList(), Boolean.FALSE));
        this.mFilterStatObserveDataList.postValue(CollectionsKt__CollectionsKt.emptyList());
        this.mTagFilterTypeList.clear();
        this.mFilterTagObserveList.postValue(this.mTagFilterTypeList);
        this.mTagTypeList.postValue(CollectionsKt__CollectionsKt.emptyList());
        this.mAllIndicatorStatList.clear();
        this.mIndicatorCategoryMap.clear();
        this.mTagOfCategoryMap.clear();
        this.mFilterCategory = null;
    }

    public final void x(IndicatorStat indicatorStat, Set<String> tagSet) {
        if (!(!indicatorStat.getTrendTag().isEmpty())) {
            tagSet.add(HealthIndicatorTagType.INDICATOR_OTHER_TREND.getCode());
            return;
        }
        Iterator<T> it = indicatorStat.getTrendTag().iterator();
        while (it.hasNext()) {
            String tagCode = ((IndicatorTrendTag) it.next()).getTagCode();
            if (tagCode != null) {
                tagSet.add(tagCode);
            }
        }
    }

    @NotNull
    public final List<IndicatorCategoryBean> y() {
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.mIndicatorCategoryMap.keySet());
        String string = qtf.d().getString(R$string.health_archives_all_abnormal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getContext().getString(R…hives_all_abnormal_title)");
        mutableList.add(0, string);
        List list = mutableList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new IndicatorCategoryBean(null, (String) it.next(), 0, false, 9, null));
        }
        List<IndicatorCategoryBean> mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        IndicatorCategoryBean indicatorCategoryBean = (IndicatorCategoryBean) CollectionsKt___CollectionsKt.firstOrNull((List) mutableList2);
        if (indicatorCategoryBean != null) {
            indicatorCategoryBean.setCode("all");
            indicatorCategoryBean.setSelected(true);
        }
        return J(mutableList2);
    }

    @NotNull
    public final List<IndicatorStat> z(@Nullable String categoryName) {
        if (categoryName == null || categoryName.length() == 0) {
            return this.mAllIndicatorStatList;
        }
        List<IndicatorStat> list = this.mIndicatorCategoryMap.get(categoryName);
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }
}
