package com.health.health_seedlingcard.utlis;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.gson.reflect.TypeToken;
import com.health.health_seedlingcard.R$plurals;
import com.health.health_seedlingcard.R$string;
import com.health.health_seedlingcard.bean.AverageLineLabel;
import com.health.health_seedlingcard.bean.AverageLineStyle;
import com.health.health_seedlingcard.bean.AxisData;
import com.health.health_seedlingcard.bean.AxisDataLabel;
import com.health.health_seedlingcard.bean.AxisLine;
import com.health.health_seedlingcard.bean.AxisTick;
import com.health.health_seedlingcard.bean.CommonStyle;
import com.health.health_seedlingcard.bean.CommonStyleSeriesLabel;
import com.health.health_seedlingcard.bean.LabelData;
import com.health.health_seedlingcard.bean.LineStyle;
import com.health.health_seedlingcard.bean.Pieces;
import com.health.health_seedlingcard.bean.PiecesLabel;
import com.health.health_seedlingcard.bean.Series;
import com.health.health_seedlingcard.bean.SeriesAverageLine;
import com.health.health_seedlingcard.bean.SeriesBarStyle;
import com.health.health_seedlingcard.bean.SeriesData;
import com.health.health_seedlingcard.bean.SeriesSleepItemData;
import com.health.health_seedlingcard.bean.SeriesStepData;
import com.health.health_seedlingcard.bean.SeriesStepItemData;
import com.health.health_seedlingcard.bean.SleepCardBean;
import com.health.health_seedlingcard.bean.SleepItemDataValue;
import com.health.health_seedlingcard.bean.SleepReminderCardBean;
import com.health.health_seedlingcard.bean.SleepReminderUiData;
import com.health.health_seedlingcard.bean.SleepReminderWaveInfo;
import com.health.health_seedlingcard.bean.SleepWaveInfo;
import com.health.health_seedlingcard.bean.SplitLine;
import com.health.health_seedlingcard.bean.SplitLineStyle;
import com.health.health_seedlingcard.bean.StepBarOpt;
import com.health.health_seedlingcard.bean.StepBarOptSeriesStyle;
import com.health.health_seedlingcard.bean.StepsBean;
import com.health.health_seedlingcard.bean.TodayStepCheckin;
import com.health.health_seedlingcard.bean.TodayStepCheckinBean;
import com.health.health_seedlingcard.bean.TodayStepCheckinItem;
import com.health.health_seedlingcard.bean.TodayStepsBean;
import com.health.health_seedlingcard.bean.Todaysteps;
import com.health.health_seedlingcard.bean.WaveStyle;
import com.health.health_seedlingcard.bean.WeekStepsYAxis;
import com.health.health_seedlingcard.bean.WeeklyStepAxisLine;
import com.health.health_seedlingcard.bean.WeeklyStepAxisTick;
import com.health.health_seedlingcard.bean.WeeklyStepBarInfo;
import com.health.health_seedlingcard.bean.WeeklyStepBean;
import com.health.health_seedlingcard.bean.WeeklyStepLineStyle;
import com.health.health_seedlingcard.bean.WeeklyStepSeriesCommonStyle;
import com.health.health_seedlingcard.bean.WeeklyStepxAxis;
import com.health.health_seedlingcard.bean.WeeklyStepyAxis;
import com.health.health_seedlingcard.bean.XAxis;
import com.health.health_seedlingcard.bean.YAxis;
import com.health.health_seedlingcard.bean.xAxisDataItem;
import com.health.health_seedlingcard.bean.yAxisDataItem;
import com.health.health_seedlingcard.bean.yAxisLabelData;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.base.utils.AsyncResultCoroutine;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sport.model.DayStepData;
import com.heytap.health.sport.seedling.SeedlingStepService;
import com.oplus.aiunit.vision.aqk;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.cs8;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.gyk;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.kdb;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ne7;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.t15;
import com.oplus.aiunit.vision.vd8;
import com.oplus.aiunit.vision.wtf;
import com.oplus.aiunit.vision.wv8;
import com.oplus.aiunit.vision.zrj;
import com.oplus.pantanal.seedling.bean.SeedlingCardSizeEnum;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105J \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0016H\u0007J*\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u001e\u0010\"\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0018H\u0002J+\u0010%\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0010\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0002R\u0014\u0010-\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/health/health_seedlingcard/utlis/SeelingCardConvertDataHelper;", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCardSizeEnum;", "cardEnum", "", "upkVersionCode", "Lcom/heytap/health/base/utils/AsyncResult;", "Lcom/health/health_seedlingcard/bean/SleepCardBean;", "i", "Lcom/health/health_seedlingcard/bean/SleepReminderCardBean;", "j", "Lcom/health/health_seedlingcard/bean/TodayStepsBean;", "p", "o", "Lcom/health/health_seedlingcard/bean/TodayStepCheckinBean;", "n", "Lcom/health/health_seedlingcard/bean/WeeklyStepBean;", "q", "", "imageUrl", "Lcom/oplus/aiunit/vision/gyk;", "l", "Landroid/os/Bundle;", "s", "", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "sleepDataList", "f", "", "steps", "Lcom/health/health_seedlingcard/bean/WeekStepsYAxis;", "k", "Lcom/heytap/health/sport/model/DayStepData;", "list", "g", "filePath", "fileName", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "", "r", "a", "Ljava/lang/String;", "TAG", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlin/Lazy;", "h", "()Lkotlinx/coroutines/CoroutineScope;", "singScope", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSeelingCardConvertDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeelingCardConvertDataHelper.kt\ncom/health/health_seedlingcard/utlis/SeelingCardConvertDataHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1287:1\n1864#2,3:1288\n1#3:1291\n314#4,11:1292\n*S KotlinDebug\n*F\n+ 1 SeelingCardConvertDataHelper.kt\ncom/health/health_seedlingcard/utlis/SeelingCardConvertDataHelper\n*L\n282#1:1288,3\n1157#1:1292,11\n*E\n"})
public final class SeelingCardConvertDataHelper {

    @NotNull
    public static final SeelingCardConvertDataHelper INSTANCE = new SeelingCardConvertDataHelper();

    @NotNull
    public static final String a = "SeelingCardConvertData";

    @NotNull
    public static final Lazy b = LazyKt.lazy(new Function0<CoroutineScope>() { // from class: com.health.health_seedlingcard.utlis.SeelingCardConvertDataHelper$singScope$2
        @NotNull
        public final CoroutineScope invoke() {
            ExecutorService executorServiceE = cs8.e("SeelingCard");
            Intrinsics.checkNotNullExpressionValue(executorServiceE, "newSingleThreadExecutor(\"SeelingCard\")");
            return CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executorServiceE));
        }
    });

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J2\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J8\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"com/health/health_seedlingcard/utlis/SeelingCardConvertDataHelper$a", "Lcom/oplus/aiunit/vision/wtf;", "Ljava/io/File;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "Lcom/oplus/aiunit/vision/zrj;", "target", "", "isFirstResource", "onLoadFailed", "resource", "Lcom/bumptech/glide/load/DataSource;", "dataSource", "a", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements wtf<File> {
        public final /* synthetic */ CancellableContinuation<String> i;
        public final /* synthetic */ String j;
        public final /* synthetic */ String k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super String> cancellableContinuation, String str, String str2) {
            this.i = cancellableContinuation;
            this.j = str;
            this.k = str2;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(@NotNull File resource, @NotNull Object model, @Nullable zrj<File> target, @NotNull DataSource dataSource, boolean isFirstResource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            File file = new File(this.j);
            if (file.exists()) {
                m8b.f(SeelingCardConvertDataHelper.a, "medal pic is already exist ");
            } else {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(resource.getPath());
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeFile, "decodeFile(resource.path)");
                file = ne7.t(bitmapDecodeFile, Bitmap.CompressFormat.PNG, ne7.SEEDLING_CARDP_ROVIDER, this.k, 100);
                if (file == null) {
                    CancellableContinuation<String> cancellableContinuation = this.i;
                    m8b.f(SeelingCardConvertDataHelper.a, "medal pic save fail SD card not available");
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(new IllegalArgumentException(""))));
                    return false;
                }
                m8b.f(SeelingCardConvertDataHelper.a, "download medal pic success ");
            }
            Uri uriForFile = FileProvider.getUriForFile(e88.a(), jug.SEEDLING_CARD_PROVIDER, file);
            SeelingCardConvertDataHelper seelingCardConvertDataHelper = SeelingCardConvertDataHelper.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(uriForFile, "uri");
            seelingCardConvertDataHelper.r(uriForFile);
            m8b.f(SeelingCardConvertDataHelper.a, "medal pic uri = " + uriForFile + " ");
            CancellableContinuation<String> cancellableContinuation2 = this.i;
            Result.Companion companion2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.constructor-impl(uriForFile.toString()));
            return false;
        }

        public boolean onLoadFailed(@Nullable GlideException e, @Nullable Object model, @NotNull zrj<File> target, boolean isFirstResource) {
            Intrinsics.checkNotNullParameter(target, "target");
            m8b.f(SeelingCardConvertDataHelper.a, "download medal pic fail");
            CancellableContinuation<String> cancellableContinuation = this.i;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(new IllegalArgumentException(""))));
            return false;
        }
    }

    @JvmStatic
    @NotNull
    public static final AsyncResult<SleepCardBean> i(@NotNull SeedlingCardSizeEnum cardEnum, long upkVersionCode) {
        Intrinsics.checkNotNullParameter(cardEnum, "cardEnum");
        return new AsyncResult<>(new SeelingCardConvertDataHelper$getSleepData$1(cardEnum, upkVersionCode));
    }

    @JvmStatic
    @NotNull
    public static final SleepReminderCardBean j() {
        ArrayList arrayList = new ArrayList();
        String strE = fdg.x(jug.SP_KEY_SLEEP_REMINDER_LIST).E(jug.SP_KEY_SLEEP_REMINDER_LIST1X2, "");
        if (!TextUtils.isEmpty(strE)) {
            Object objB = vd8.b(strE, new TypeToken<List<? extends Integer>>() { // from class: com.health.health_seedlingcard.utlis.SeelingCardConvertDataHelper$getSleepReminderData$data1x2List$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objB, "fromJson(reminder1X2, ob…ken<List<Int>>() {}.type)");
            arrayList.addAll((List) objB);
        }
        if (arrayList.size() < 1) {
            arrayList.addAll(CollectionsKt.shuffled(jug.INSTANCE.a().keySet()));
        }
        int iIntValue = ((Number) arrayList.get(0)).intValue();
        jug jugVar = jug.INSTANCE;
        Integer num = jugVar.a().get(Integer.valueOf(iIntValue));
        String string = e88.a().getString(num != null ? num.intValue() : R$string.seedling_card_sleep_reminder_1x2tips1);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getString(stringID1x2)");
        StringBuilder sb = new StringBuilder();
        sb.append("stringID = ");
        sb.append(string);
        arrayList.remove(0);
        fdg.x(jug.SP_KEY_SLEEP_REMINDER_LIST).U(jug.SP_KEY_SLEEP_REMINDER_LIST1X2, vd8.g(arrayList));
        ArrayList arrayList2 = new ArrayList();
        String strE2 = fdg.x(jug.SP_KEY_SLEEP_REMINDER_LIST).E(jug.SP_KEY_SLEEP_REMINDER_LIST2X2, "");
        if (!TextUtils.isEmpty(strE2)) {
            Object objB2 = vd8.b(strE2, new TypeToken<List<? extends Integer>>() { // from class: com.health.health_seedlingcard.utlis.SeelingCardConvertDataHelper$getSleepReminderData$data2x2List$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objB2, "fromJson(reminder2X2, ob…ken<List<Int>>() {}.type)");
            arrayList2.addAll((List) objB2);
        }
        if (arrayList2.size() < 1) {
            arrayList2.addAll(CollectionsKt.shuffled(jugVar.b().keySet()));
        }
        Integer num2 = jugVar.b().get(Integer.valueOf(((Number) arrayList2.get(0)).intValue()));
        String string2 = e88.a().getString(num2 != null ? num2.intValue() : R$string.seedling_card_sleep_reminder_2x2tips1);
        Intrinsics.checkNotNullExpressionValue(string2, "getAppContext().getString(stringID2x2)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("stringID = ");
        sb2.append(string2);
        arrayList2.remove(0);
        fdg.x(jug.SP_KEY_SLEEP_REMINDER_LIST).U(jug.SP_KEY_SLEEP_REMINDER_LIST2X2, vd8.g(arrayList2));
        String string3 = e88.a().getString(R$string.seedling_card_sleep_reminder_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        …ard_sleep_reminder_title)");
        return new SleepReminderCardBean(new SleepReminderUiData(new SleepReminderWaveInfo(null, null, string3, string2, string, string, 3, null), null, 2, null));
    }

    @JvmStatic
    @NotNull
    public static final TodayStepCheckinBean n() {
        Bundle bundleS = INSTANCE.s();
        Long lValueOf = bundleS != null ? Long.valueOf(bundleS.getLong("step")) : null;
        Long lValueOf2 = bundleS != null ? Long.valueOf(bundleS.getLong("stepGoal")) : null;
        String string = e88.a().getString(R$string.seedling_card_to_punch);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getStrin…g.seedling_card_to_punch)");
        String string2 = e88.a().getString(R$string.seedling_card_today_step);
        Intrinsics.checkNotNullExpressionValue(string2, "getAppContext().getStrin…seedling_card_today_step)");
        String string3 = e88.a().getString(R$string.seedling_card_step_goal_achieved_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        …step_goal_achieved_title)");
        String string4 = e88.a().getString(R$string.seedling_card_step_goal_achieved_tip);
        Intrinsics.checkNotNullExpressionValue(string4, "getAppContext()\n        …d_step_goal_achieved_tip)");
        return new TodayStepCheckinBean(new TodayStepCheckin(new TodayStepCheckinItem(string, string3, string2, String.valueOf(lValueOf), string4, "/" + lValueOf2 + " " + e88.a().getString(R$string.seedling_card_step))));
    }

    @JvmStatic
    @NotNull
    public static final TodayStepsBean o() {
        String str;
        String string = e88.a().getString(R$string.seedling_card_step_distance_unit);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …_card_step_distance_unit)");
        String string2 = e88.a().getString(R$string.seedling_card_calorie);
        Intrinsics.checkNotNullExpressionValue(string2, "getAppContext().getStrin…ng.seedling_card_calorie)");
        Bundle bundleS = INSTANCE.s();
        Double dValueOf = bundleS != null ? Double.valueOf(bundleS.getDouble("calorie")) : null;
        Long lValueOf = bundleS != null ? Long.valueOf(bundleS.getLong("step")) : null;
        Long lValueOf2 = bundleS != null ? Long.valueOf(bundleS.getLong("stepGoal")) : null;
        if (bundleS != null) {
            bundleS.getLong("calGoal");
        }
        Double dValueOf2 = bundleS != null ? Double.valueOf(bundleS.getDouble("distance")) : null;
        Intrinsics.checkNotNull(lValueOf);
        BigDecimal bigDecimal = new BigDecimal(lValueOf.longValue());
        Intrinsics.checkNotNull(lValueOf2);
        double dDoubleValue = new BigDecimal(bigDecimal.divide(new BigDecimal(lValueOf2.longValue()), 4, 1).doubleValue()).multiply(new BigDecimal(100)).doubleValue();
        String quantityString = e88.a().getResources().getQuantityString(R$plurals.seedling_card_today_steps, (int) lValueOf.longValue(), Integer.valueOf((int) lValueOf.longValue()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getAppContext().resource…tep.toInt()\n            )");
        Intrinsics.checkNotNull(dValueOf2);
        if (dValueOf2.doubleValue() > 0.0d) {
            str = dValueOf2 + string;
        } else {
            str = "0" + string;
        }
        String str2 = (dValueOf != null ? Integer.valueOf((int) dValueOf.doubleValue()) : null) + string2;
        return new TodayStepsBean(new StepsBean(new Todaysteps(string, (float) dDoubleValue, str2 + " " + str, quantityString, str2, str, lValueOf.toString())));
    }

    @JvmStatic
    @NotNull
    public static final TodayStepsBean p() {
        String string = e88.a().getString(R$string.seedling_card_step_distance_unit);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …_card_step_distance_unit)");
        String string2 = e88.a().getString(R$string.seedling_card_steps_sync_to_wechat);
        Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        …ard_steps_sync_to_wechat)");
        String string3 = e88.a().getString(R$string.seedling_card_calorie);
        Intrinsics.checkNotNullExpressionValue(string3, "getAppContext().getStrin…ng.seedling_card_calorie)");
        Bundle bundleS = INSTANCE.s();
        Double dValueOf = bundleS != null ? Double.valueOf(bundleS.getDouble("calorie")) : null;
        Long lValueOf = bundleS != null ? Long.valueOf(bundleS.getLong("step")) : null;
        Long lValueOf2 = bundleS != null ? Long.valueOf(bundleS.getLong("stepGoal")) : null;
        if (bundleS != null) {
            bundleS.getLong("calGoal");
        }
        Double dValueOf2 = bundleS != null ? Double.valueOf(bundleS.getDouble("distance")) : null;
        Intrinsics.checkNotNull(lValueOf);
        BigDecimal bigDecimal = new BigDecimal(lValueOf.longValue());
        Intrinsics.checkNotNull(lValueOf2);
        double dDoubleValue = new BigDecimal(bigDecimal.divide(new BigDecimal(lValueOf2.longValue()), 2, 1).doubleValue()).multiply(new BigDecimal(100)).doubleValue();
        String quantityString = e88.a().getResources().getQuantityString(R$plurals.seedling_card_today_steps, (int) lValueOf.longValue(), Integer.valueOf((int) lValueOf.longValue()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getAppContext().resource…tep.toInt()\n            )");
        return new TodayStepsBean(new StepsBean(new Todaysteps(string, (float) dDoubleValue, string2, quantityString, (dValueOf != null ? Integer.valueOf((int) dValueOf.doubleValue()) : null) + string3, dValueOf2 + string, lValueOf.toString())));
    }

    public final SleepCardBean f(List<SleepDayBean> sleepDataList, SeedlingCardSizeEnum cardEnum, long upkVersionCode) {
        WaveStyle waveStyle;
        WaveStyle waveStyle2;
        Unit unit;
        int i;
        String strD;
        String strD2;
        SleepItemDataValue sleepItemDataValue;
        List<SleepDayBean> list = sleepDataList;
        if ((list == null || list.isEmpty()) || sleepDataList.get(0).sleepDataIsUnreal()) {
            m8b.f(a, "sleep data is null");
            return null;
        }
        boolean z = cardEnum == SeedlingCardSizeEnum.TwoXTwo;
        boolean z2 = upkVersionCode >= 1027;
        String strA = com.health.health_seedlingcard.utlis.a.INSTANCE.a(e88.a(), "sleepdata.json");
        SleepCardBean sleepCardBean = strA != null ? (SleepCardBean) vd8.b(strA, new TypeToken<SleepCardBean>() { // from class: com.health.health_seedlingcard.utlis.SeelingCardConvertDataHelper$convertSleepData$1
        }.getType()) : null;
        SleepDayBean sleepDayBean = sleepDataList.get(0);
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append(" sleepData = ");
        sb.append(sleepDayBean);
        List sleepUnitDataList = sleepDayBean.getSleepUnitDataList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SplitLine splitLine = new SplitLine(false, new SplitLineStyle("rgba(0, 0, 0, 0.1)", null, null, null, 14, null), 1, null);
        SplitLine splitLine2 = new SplitLine(false, new SplitLineStyle("rgba(255, 255, 255, 0.1)", null, null, null, 14, null), 1, null);
        ArrayList arrayList3 = new ArrayList();
        String string = e88.a().getString(R$string.seedling_card_pieces_label_wake);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …g_card_pieces_label_wake)");
        arrayList3.add(new Pieces(new PiecesLabel(string, null, "rgba(0, 0, 0, 0.3)", 2, null), 75, 100, "#FFC30E"));
        ArrayList arrayList4 = new ArrayList();
        boolean z3 = z2;
        arrayList4.add(new Pieces(new PiecesLabel(string, null, "rgba(255, 255, 255, 0.3)", 2, null), 75, 100, "#FFC30E"));
        String string2 = e88.a().getString(R$string.seedling_card_pieces_label_rem);
        Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        …ng_card_pieces_label_rem)");
        arrayList3.add(new Pieces(new PiecesLabel(string2, null, "rgba(0, 0, 0, 0.3)", 2, null), 50, 75, "#72C6FB"));
        arrayList4.add(new Pieces(new PiecesLabel(string2, null, "rgba(255, 255, 255, 0.3)", 2, null), 50, 75, "#72C6FB"));
        String string3 = e88.a().getString(R$string.seedling_card_pieces_label_sleep_lightly);
        Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        …eces_label_sleep_lightly)");
        arrayList3.add(new Pieces(new PiecesLabel(string3, null, "rgba(0, 0, 0, 0.3)", 2, null), 25, 50, "#5D64E9"));
        arrayList4.add(new Pieces(new PiecesLabel(string3, null, "rgba(255, 255, 255, 0.3)", 2, null), 25, 50, "#5D64E9"));
        String string4 = e88.a().getString(R$string.seedling_card_pieces_label_sleep_deep);
        Intrinsics.checkNotNullExpressionValue(string4, "getAppContext()\n        …_pieces_label_sleep_deep)");
        arrayList3.add(new Pieces(new PiecesLabel(string4, null, "rgba(0, 0, 0, 0.3)", 2, null), 0, 25, "#3C41B0"));
        arrayList4.add(new Pieces(new PiecesLabel(string4, null, "rgba(255, 255, 255, 0.3)", 2, null), 0, 25, "#3C41B0"));
        m8b.f(str, " isSupportNewAnimations " + z3);
        if (z) {
            waveStyle = z3 ? new WaveStyle("lineV2", "2px", null, null, null, "0", false, splitLine, arrayList3, 92, null) : new WaveStyle(null, null, null, null, null, "0", false, splitLine, arrayList3, 95, null);
        } else {
            waveStyle = z3 ? new WaveStyle("lineV2", "2px", null, null, null, "0", false, splitLine, arrayList3, 92, null) : new WaveStyle(null, null, null, null, null, null, false, splitLine, arrayList3, 127, null);
        }
        if (z) {
            waveStyle2 = z3 ? new WaveStyle("lineV2", "2px", null, null, null, "0", false, splitLine2, arrayList4, 92, null) : new WaveStyle(null, null, null, null, null, "0", false, splitLine2, arrayList4, 95, null);
        } else {
            waveStyle2 = z3 ? new WaveStyle("lineV2", "2px", null, null, null, null, false, splitLine2, arrayList4, 124, null) : new WaveStyle(null, null, null, null, null, null, false, splitLine2, arrayList4, 127, null);
        }
        ArrayList arrayList5 = new ArrayList();
        Integer numValueOf = sleepUnitDataList != null ? Integer.valueOf(sleepUnitDataList.size()) : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("listSleepDayData size = ");
        sb2.append(numValueOf);
        int i2 = 60000;
        if (sleepUnitDataList != null) {
            Iterator it = sleepUnitDataList.iterator();
            long j = 0;
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SleepUnitData sleepUnitData = (SleepUnitData) next;
                long timestamp = sleepUnitData.getTimestamp();
                long duration = timestamp + sleepUnitData.getDuration();
                if (i3 != 0 && timestamp != j) {
                    i4 += (int) ((timestamp - j) / ((long) i2));
                }
                Iterator it2 = it;
                long duration2 = sleepUnitData.getDuration() / ((long) i2);
                m8b.f(a, "segmentedSleepIndex == " + i3 + ", Type = " + sleepUnitData.getType());
                if (0 <= duration2) {
                    long j2 = 0;
                    while (true) {
                        i4++;
                        int type = sleepUnitData.getType();
                        if (type == 1) {
                            sleepItemDataValue = new SleepItemDataValue(15, i4);
                            Unit unit2 = Unit.INSTANCE;
                        } else if (type == 2) {
                            sleepItemDataValue = new SleepItemDataValue(35, i4);
                            Unit unit3 = Unit.INSTANCE;
                        } else if (type == 3) {
                            sleepItemDataValue = new SleepItemDataValue(65, i4);
                            Unit unit4 = Unit.INSTANCE;
                        } else if (type != 4) {
                            sleepItemDataValue = new SleepItemDataValue(85, i4);
                            Unit unit5 = Unit.INSTANCE;
                        } else {
                            sleepItemDataValue = new SleepItemDataValue(85, i4);
                            Unit unit6 = Unit.INSTANCE;
                        }
                        arrayList5.add(new SeriesSleepItemData(sleepItemDataValue));
                        if (j2 != duration2) {
                            j2++;
                        }
                    }
                }
                it = it2;
                i3 = i5;
                j = duration;
                i2 = 60000;
            }
            unit = Unit.INSTANCE;
            i = i4;
        } else {
            unit = null;
            i = 0;
        }
        if (unit == null) {
            Unit unit7 = Unit.INSTANCE;
        }
        arrayList.add(new Series(new CommonStyle(null, 1, null), waveStyle, arrayList5));
        arrayList2.add(new Series(new CommonStyle(null, 1, null), waveStyle2, arrayList5));
        AxisLine axisLine = new AxisLine(false, new LineStyle(null, null, 3, null), new AxisTick(false, null, 3, null), 1, null);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        if (z) {
            strD = o15.d(new Date(sleepDayBean.getStartSleepChartTime()), "HH:mm");
        } else {
            strD = e88.a().getString(R$string.seedling_card_fall_asleep) + " " + o15.d(new Date(sleepDayBean.getStartSleepChartTime()), "HH:mm");
        }
        String str2 = strD;
        Intrinsics.checkNotNullExpressionValue(str2, "fallAsleep");
        AxisData axisData = new AxisData(0, new AxisDataLabel(null, "rgba(0, 0, 0, 0.3)", str2, 1, null));
        AxisData axisData2 = new AxisData(0, new AxisDataLabel(null, "rgba(255, 255, 255, 0.3)", str2, 1, null));
        long endSleepChartTime = sleepDayBean.isIWatch() ? sleepDayBean.getEndSleepChartTime() : sleepDayBean.getEndSleepChartTime() - ((long) 60000);
        if (z) {
            strD2 = o15.d(new Date(endSleepChartTime), "HH:mm");
        } else {
            strD2 = e88.a().getString(R$string.seedling_card_out_of_sleep) + " " + o15.d(new Date(endSleepChartTime), "HH:mm");
        }
        String str3 = strD2;
        Intrinsics.checkNotNullExpressionValue(str3, "outOfSleep");
        int i6 = i - 3;
        AxisData axisData3 = new AxisData(i6, new AxisDataLabel(null, "rgba(0, 0, 0, 0.3)", str3, 1, null));
        AxisData axisData4 = new AxisData(i6, new AxisDataLabel(null, "rgba(255, 255, 255, 0.3)", str3, 1, null));
        arrayList6.add(axisData);
        arrayList6.add(axisData3);
        arrayList7.add(axisData2);
        arrayList7.add(axisData4);
        String str4 = z ? "3px" : "5px";
        int i7 = i + 1;
        int i8 = i;
        String str5 = z ? "22%" : "25%";
        String str6 = str4;
        XAxis xAxis = new XAxis(false, 0, i8, i7, str5, str6, axisLine, arrayList6, 3, null);
        XAxis xAxis2 = new XAxis(false, 0, i8, i7, str5, str6, axisLine, arrayList7, 3, null);
        String string5 = e88.a().getString(R$string.seedling_card_subtitle);
        Intrinsics.checkNotNullExpressionValue(string5, "getAppContext().getStrin…g.seedling_card_subtitle)");
        String strC = t15.c((int) sleepDayBean.getTotalSleepTime(), false, 2, null);
        String strA2 = t15.a((int) sleepDayBean.getTotalSleepTime());
        String strD3 = t15.d((int) sleepDayBean.getTotalSleepTime());
        if (!(strA2.length() > 0)) {
            strD3 = "";
            strA2 = strD3;
        }
        SleepWaveInfo sleepWaveInfo = new SleepWaveInfo(strC, string5);
        if (sleepCardBean != null) {
            String str7 = z ? "0" : "18%";
            ArrayList arrayList8 = new ArrayList();
            AxisLine axisLine2 = new AxisLine(false, new LineStyle(null, null, 3, null), new AxisTick(false, null, 3, null), 1, null);
            String str8 = str7;
            YAxis yAxis = new YAxis(false, 0, 0, str8, 0, null, axisLine2, arrayList8, 55, null);
            YAxis yAxis2 = new YAxis(false, 0, 0, str8, 0, null, axisLine2, arrayList8, 55, null);
            sleepCardBean.getUiData().getSleepWaveOpt().setYAxis(yAxis);
            sleepCardBean.getUiData().getSleepWaveDarkOpt().setYAxis(yAxis2);
            sleepCardBean.getUiData().setSleepWaveInfotitle(strC);
            sleepCardBean.getUiData().setSleepWaveInfotips(string5);
            sleepCardBean.getUiData().getSleepWaveOpt().setXAxis(xAxis);
            sleepCardBean.getUiData().setSleepWaveInfo(sleepWaveInfo);
            sleepCardBean.getUiData().getSleepWaveOpt().setSeries(arrayList);
            sleepCardBean.getUiData().getSleepWaveDarkOpt().setXAxis(xAxis2);
            sleepCardBean.getUiData().getSleepWaveDarkOpt().setSeries(arrayList2);
            sleepCardBean.getUiData().setSleepWaveInfotitleMain(strA2);
            sleepCardBean.getUiData().setSleepWaveInfotitleSub(strD3);
        }
        return sleepCardBean;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x05ea  */
    public final WeeklyStepBean g(SeedlingCardSizeEnum cardEnum, List<? extends DayStepData> list) {
        String str;
        String quantityString;
        String str2;
        String str3;
        String str4;
        int i;
        ArrayList arrayList;
        int i2;
        String strA = com.health.health_seedlingcard.utlis.a.INSTANCE.a(e88.a(), "stepweeklydata.json");
        String str5 = "rgba(0, 0, 0, 0.3)";
        WeeklyStepBean weeklyStepBean = strA != null ? (WeeklyStepBean) vd8.b(strA, new TypeToken<WeeklyStepBean>() { // from class: com.health.health_seedlingcard.utlis.SeelingCardConvertDataHelper$convertStepWeekData$1
        }.getType()) : null;
        boolean z = cardEnum.getSizeCode() == SeedlingCardSizeEnum.TwoXFour.getSizeCode();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = list.size();
        WeeklyStepBean weeklyStepBean2 = weeklyStepBean;
        int i3 = 0;
        int i4 = 0;
        int step = 0;
        int step2 = 0;
        int step3 = 0;
        int i5 = 0;
        int step4 = 0;
        while (i3 < size) {
            int step5 = list.get(i3).getStep();
            int i6 = size;
            LocalDate date = list.get(i3).getDate();
            StringBuilder sb = new StringBuilder();
            boolean z2 = z;
            sb.append("index = ");
            sb.append(i3);
            sb.append("  step = ");
            sb.append(step5);
            sb.append(" time = ");
            sb.append(date);
            if (step2 < list.get(i3).getStep()) {
                step2 = list.get(i3).getStep();
            }
            if (i3 < 7) {
                step3 += list.get(i3).getStep();
                if (list.get(i3).getStep() > 0) {
                    i5++;
                }
                arrayList3.add(new SeriesStepData(new SeriesStepItemData(i3 + 1, list.get(i3).getStep())));
            } else {
                if (step4 < list.get(i3).getStep()) {
                    step4 = list.get(i3).getStep();
                }
                step += list.get(i3).getStep();
                if (list.get(i3).getStep() > 0) {
                    i4++;
                }
                arrayList2.add(new SeriesStepData(new SeriesStepItemData(i3 - 6, list.get(i3).getStep())));
            }
            i3++;
            z = z2;
            size = i6;
        }
        boolean z3 = z;
        int i7 = i4 > 0 ? step / i4 : 0;
        int i8 = i5 > 0 ? step3 / i5 : 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("totalStepsThisWeek = ");
        sb2.append(step);
        sb2.append("  efficientDayThisWeek = ");
        sb2.append(i4);
        sb2.append("  averageStepsThisWeek = ");
        sb2.append(i7);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("totalStepsLastWeek = ");
        sb3.append(step3);
        sb3.append("  efficientDayLastWeek = ");
        sb3.append(i5);
        sb3.append("  averageStepsLastWeek = ");
        sb3.append(i8);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String str6 = t15.f() + "-" + t15.g();
        int i9 = step2;
        int i10 = step4;
        CommonStyleSeriesLabel commonStyleSeriesLabel = new CommonStyleSeriesLabel(str6, "rgba(0, 0, 0, 0.3)", null, 4, null);
        CommonStyleSeriesLabel commonStyleSeriesLabel2 = new CommonStyleSeriesLabel(str6, "rgba(255, 255, 255, 0.3)", null, 4, null);
        WeeklyStepSeriesCommonStyle weeklyStepSeriesCommonStyle = new WeeklyStepSeriesCommonStyle("rgba(0, 0, 0, 0.15)", null, commonStyleSeriesLabel, 2, null);
        WeeklyStepSeriesCommonStyle weeklyStepSeriesCommonStyle2 = new WeeklyStepSeriesCommonStyle("rgba(255, 255, 255, 0.15)", null, commonStyleSeriesLabel2, 2, null);
        SeriesBarStyle seriesBarStyle = new SeriesBarStyle(null, null, false, "rgba(0, 0, 0, 0.06)", 7, null);
        SeriesBarStyle seriesBarStyle2 = new SeriesBarStyle(null, null, false, "rgba(255, 255, 255, 0.06)", 7, null);
        SeriesAverageLine seriesAverageLine = new SeriesAverageLine(false, new AverageLineStyle(null, null, null, 7, null), new AverageLineLabel(String.valueOf(i7), null, null, 6, null), 1, null);
        SeriesData seriesData = new SeriesData(weeklyStepSeriesCommonStyle, seriesBarStyle, seriesAverageLine, arrayList3);
        SeriesData seriesData2 = new SeriesData(weeklyStepSeriesCommonStyle2, seriesBarStyle2, seriesAverageLine, arrayList3);
        String str7 = t15.e() + "-" + t15.i();
        if (z3) {
            arrayList4.add(seriesData);
            arrayList5.add(seriesData2);
            str = str7;
        } else {
            str = "";
        }
        String str8 = str;
        CommonStyleSeriesLabel commonStyleSeriesLabel3 = new CommonStyleSeriesLabel(str8, "rgba(0, 0, 0, 0.3)", null, 4, null);
        CommonStyleSeriesLabel commonStyleSeriesLabel4 = new CommonStyleSeriesLabel(str8, "rgba(255, 255, 255, 0.3)", null, 4, null);
        WeeklyStepSeriesCommonStyle weeklyStepSeriesCommonStyle3 = new WeeklyStepSeriesCommonStyle("#2EA849", null, commonStyleSeriesLabel3, 2, null);
        WeeklyStepSeriesCommonStyle weeklyStepSeriesCommonStyle4 = new WeeklyStepSeriesCommonStyle("#2EA849", null, commonStyleSeriesLabel4, 2, null);
        SeriesBarStyle seriesBarStyle3 = new SeriesBarStyle(null, null, false, "rgba(0, 0, 0, 0.06)", 7, null);
        SeriesBarStyle seriesBarStyle4 = new SeriesBarStyle(null, null, false, "rgba(255, 255, 255, 0.06)", 7, null);
        SeriesAverageLine seriesAverageLine2 = new SeriesAverageLine(z3, new AverageLineStyle(null, "#2EA849", "1px", 1, null), new AverageLineLabel(String.valueOf(i7), null, "#2EA849", 2, null));
        SeriesData seriesData3 = new SeriesData(weeklyStepSeriesCommonStyle3, seriesBarStyle3, seriesAverageLine2, arrayList2);
        SeriesData seriesData4 = new SeriesData(weeklyStepSeriesCommonStyle4, seriesBarStyle4, seriesAverageLine2, arrayList2);
        arrayList4.add(seriesData3);
        arrayList5.add(seriesData4);
        String quantityString2 = e88.a().getResources().getQuantityString(R$plurals.seedling_card_step_daily_average, i7, Integer.valueOf(i7));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getAppContext().resource…geStepsThisWeek\n        )");
        int i11 = i7 - i8;
        int iAbs = Math.abs(i11);
        if (i11 > 0) {
            quantityString = e88.a().getResources().getQuantityString(R$plurals.seedling_card_step_compared_increase, iAbs, Integer.valueOf(iAbs));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getAppContext().resource… status\n                )");
        } else {
            quantityString = e88.a().getResources().getQuantityString(R$plurals.seedling_card_step_compared_reduce, iAbs, Integer.valueOf(iAbs));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getAppContext()\n        … status\n                )");
        }
        if (i11 == 0) {
            quantityString = e88.a().getString(R$string.seedling_card_step_flat);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getAppContext()\n        ….seedling_card_step_flat)");
        }
        WeeklyStepBarInfo weeklyStepBarInfo = new WeeklyStepBarInfo(quantityString2, quantityString);
        WeeklyStepAxisLine weeklyStepAxisLine = new WeeklyStepAxisLine(false, new WeeklyStepLineStyle(null, null, null, 7, null), new WeeklyStepAxisTick(false, null, 3, null), 1, null);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        int i12 = 1;
        while (i12 < 8) {
            if (z3) {
                quantityString = quantityString;
                arrayList = arrayList7;
                quantityString2 = quantityString2;
                i2 = i12;
                arrayList6.add(new xAxisDataItem(i2, new LabelData(null, null, null, 7, null)));
                arrayList.add(new xAxisDataItem(i2, new LabelData(null, null, null, 7, null)));
            } else if (i12 == 1) {
                quantityString = quantityString;
                arrayList = arrayList7;
                quantityString2 = quantityString2;
                i2 = i12;
                String string = e88.a().getString(R$string.seedling_card_monday);
                Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …ing.seedling_card_monday)");
                arrayList6.add(new xAxisDataItem(i2, new LabelData(string, "rgba(0, 0, 0, 0.3)", null, 4, null)));
                arrayList.add(new xAxisDataItem(i2, new LabelData(string, "rgba(255, 255, 255, 0.3)", null, 4, null)));
            } else if (i12 != 7) {
                arrayList = arrayList7;
                i2 = i12;
            } else {
                String string2 = e88.a().getString(R$string.seedling_card_sunday);
                Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        …ing.seedling_card_sunday)");
                int i13 = i12;
                arrayList = arrayList7;
                arrayList6.add(new xAxisDataItem(i13, new LabelData(string2, "rgba(0, 0, 0, 0.3)", null, 4, null)));
                i2 = i13;
                arrayList.add(new xAxisDataItem(i2, new LabelData(string2, "rgba(255, 255, 255, 0.3)", null, 4, null)));
            }
            i12 = i2 + 1;
            quantityString2 = quantityString2;
            arrayList7 = arrayList;
            quantityString = quantityString;
            weeklyStepBarInfo = weeklyStepBarInfo;
        }
        WeeklyStepBarInfo weeklyStepBarInfo2 = weeklyStepBarInfo;
        String str9 = quantityString;
        ArrayList arrayList8 = arrayList7;
        String str10 = quantityString2;
        String str11 = z3 ? "0px" : "5px";
        WeeklyStepxAxis weeklyStepxAxis = new WeeklyStepxAxis(false, null, 0, 0, null, 0, weeklyStepAxisLine, str11, false, arrayList6, 319, null);
        WeeklyStepxAxis weeklyStepxAxis2 = new WeeklyStepxAxis(false, null, 0, 0, null, 0, weeklyStepAxisLine, str11, false, arrayList8, 319, null);
        WeeklyStepAxisLine weeklyStepAxisLine2 = new WeeklyStepAxisLine(false, new WeeklyStepLineStyle(null, null, null, 7, null), new WeeklyStepAxisTick(false, null, 3, null), 1, null);
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        int i14 = 3;
        int i15 = 0;
        while (i15 < i14) {
            if (i15 == 0) {
                i14 = i14;
                i15 = i15;
                arrayList5 = arrayList5;
                i = i9;
                str5 = str5;
                arrayList9.add(new yAxisDataItem(0, new yAxisLabelData("0", str5, null, 4, null)));
                arrayList10.add(new yAxisDataItem(0, new yAxisLabelData("0", "rgba(255, 255, 255, 0.3)", null, 4, null)));
                Unit unit = Unit.INSTANCE;
            } else if (i15 != 2) {
                Unit unit2 = Unit.INSTANCE;
                i = i9;
            } else {
                int i16 = i9;
                String strValueOf = String.valueOf(k(i16).getMax());
                i = i16;
                arrayList9.add(new yAxisDataItem(10, new yAxisLabelData(strValueOf, str5, null, 4, null)));
                arrayList10.add(new yAxisDataItem(10, new yAxisLabelData(strValueOf, "rgba(255, 255, 255, 0.3)", null, 4, null)));
                Unit unit3 = Unit.INSTANCE;
            }
            i15++;
            arrayList5 = arrayList5;
            i14 = i14;
            str5 = str5;
            i9 = i;
        }
        ArrayList arrayList11 = arrayList5;
        boolean z4 = false;
        int i17 = z3 ? i9 : i10;
        int max = k(i17).getMax();
        if (z3) {
            if (max < 1000) {
                str2 = "12%";
            } else {
                if (1000 <= max && max < 10000) {
                    str2 = "14.08%";
                } else {
                    if (10000 <= max && max < 100000) {
                        z4 = true;
                    }
                    if (z4) {
                        str2 = "16.08%";
                    } else if (max > 99999) {
                        str2 = "18%";
                    } else {
                        str2 = "10%";
                    }
                }
            }
        } else if (max < 1000) {
            str2 = "23%";
        } else {
            if (1000 <= max && max < 10000) {
                str2 = "28%";
            } else {
                if (10000 <= max && max < 100000) {
                    str2 = "33%";
                } else {
                    if (100000 <= max && max < 1000000) {
                        z4 = true;
                    }
                    if (z4) {
                        str2 = "37%";
                    } else {
                        str2 = "10%";
                    }
                }
            }
        }
        String str12 = str2;
        WeeklyStepyAxis weeklyStepyAxis = new WeeklyStepyAxis(false, null, 0, max, str12, null, 0, weeklyStepAxisLine2, null, false, arrayList9, 871, null);
        WeeklyStepyAxis weeklyStepyAxis2 = new WeeklyStepyAxis(false, null, 0, k(i17).getMax(), str12, null, 0, weeklyStepAxisLine2, null, false, arrayList10, 871, null);
        if (z3) {
            str3 = "distributed";
            str4 = "6%";
        } else {
            str3 = "normal";
            str4 = "0%";
        }
        StepBarOptSeriesStyle stepBarOptSeriesStyle = new StepBarOptSeriesStyle(str3, str4, null, 4, null);
        StepBarOpt stepBarOpt = new StepBarOpt(null, stepBarOptSeriesStyle, weeklyStepxAxis, weeklyStepyAxis, arrayList4, 1, null);
        StepBarOpt stepBarOpt2 = new StepBarOpt(null, stepBarOptSeriesStyle, weeklyStepxAxis2, weeklyStepyAxis2, arrayList11, 1, null);
        if (weeklyStepBean2 != null) {
            weeklyStepBean2.getUiData().getStepBarOpt().setSeries(arrayList4);
            weeklyStepBean2.getUiData().getStepBarOpt().setYAxis(weeklyStepyAxis);
            weeklyStepBean2.getUiData().getStepBarOpt().setXAxis(weeklyStepxAxis);
            weeklyStepBean2.getUiData().setStepBarInfo(weeklyStepBarInfo2);
            weeklyStepBean2.getUiData().setStepBarInfotitle(str10);
            weeklyStepBean2.getUiData().setStepBarInfotips(str9);
            weeklyStepBean2.getUiData().setStepBarOpt(stepBarOpt);
            weeklyStepBean2.getUiData().setStepBarDarkOpt(stepBarOpt2);
        }
        Intrinsics.checkNotNull(weeklyStepBean2);
        return weeklyStepBean2;
    }

    public final CoroutineScope h() {
        return (CoroutineScope) b.getValue();
    }

    public final WeekStepsYAxis k(int steps) {
        StringBuilder sb = new StringBuilder();
        sb.append("step == ");
        sb.append(steps);
        int iCeil = (int) (Math.ceil(((double) steps) / 1000.0d) * ((double) 1000));
        return new WeekStepsYAxis(iCeil / 2, iCeil);
    }

    @NotNull
    public final gyk<String> l(@NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        String strSubstring = imageUrl.substring(StringsKt.lastIndexOf$default(imageUrl, ".", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String str = kdb.d(imageUrl) + strSubstring;
        return new AsyncResultCoroutine(h(), new SeelingCardConvertDataHelper$getStepMedalBean$1(new Ref.ObjectRef(), ne7.SEEDLING_CARDP_ROVIDER + "/" + str, imageUrl, str, null));
    }

    public final Object m(String str, String str2, String str3, Continuation<? super String> continuation) throws ExecutionException, InterruptedException {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        com.bumptech.glide.a.v(e88.a()).h().Y0(str).C0(new a(cancellableContinuationImpl, str2, str3)).e1().get();
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @NotNull
    public final AsyncResult<WeeklyStepBean> q(@NotNull final SeedlingCardSizeEnum cardEnum) {
        Intrinsics.checkNotNullParameter(cardEnum, "cardEnum");
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends WeeklyStepBean>, ? extends Unit>, Unit>() { // from class: com.health.health_seedlingcard.utlis.SeelingCardConvertDataHelper$getWeeklyStepBean$1

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/health/sport/model/DayStepData;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements b24 {
                public final /* synthetic */ Function1<Result<WeeklyStepBean>, Unit> i;
                public final /* synthetic */ SeedlingCardSizeEnum j;

                public a(Function1<? super Result<WeeklyStepBean>, Unit> function1, SeedlingCardSizeEnum seedlingCardSizeEnum) {
                    this.i = function1;
                    this.j = seedlingCardSizeEnum;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull List<? extends DayStepData> list) {
                    Intrinsics.checkNotNullParameter(list, "it");
                    String unused = SeelingCardConvertDataHelper.a;
                    int size = list.size();
                    StringBuilder sb = new StringBuilder();
                    sb.append(" weekly step size = ");
                    sb.append(size);
                    if (!list.isEmpty()) {
                        Function1<Result<WeeklyStepBean>, Unit> function1 = this.i;
                        Result.Companion companion = Result.Companion;
                        function1.invoke(Result.box-impl(Result.constructor-impl(SeelingCardConvertDataHelper.INSTANCE.g(this.j, list))));
                    } else {
                        Function1<Result<WeeklyStepBean>, Unit> function2 = this.i;
                        Result.Companion companion2 = Result.Companion;
                        function2.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalArgumentException("")))));
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
            public static final class b<T> implements b24 {
                public final /* synthetic */ Function1<Result<WeeklyStepBean>, Unit> i;

                public b(Function1<? super Result<WeeklyStepBean>, Unit> function1) {
                    this.i = function1;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "it");
                    Function1<Result<WeeklyStepBean>, Unit> function1 = this.i;
                    Result.Companion companion = Result.Companion;
                    function1.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalArgumentException("")))));
                    m8b.b(SeelingCardConvertDataHelper.a, String.valueOf(th.getMessage()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function1<? super Result<WeeklyStepBean>, Unit>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Function1<? super Result<WeeklyStepBean>, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "block");
                Object objNavigation = e1.d().b("/step/SeedlingStepService").navigation();
                Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.sport.seedling.SeedlingStepService");
                ddd dddVarB4 = ((SeedlingStepService) objNavigation).b4(t15.h());
                if (dddVarB4 != null) {
                    dddVarB4.K0(wv8.c()).b(new a(function1, cardEnum), new b(function1));
                } else {
                    Result.Companion companion = Result.Companion;
                    function1.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalArgumentException("")))));
                }
            }
        });
    }

    public final void r(Uri uri) {
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        aqk.a(contextA, uri, aqk.PACKAGE_ASSISTANTSCREEN);
        Context contextA2 = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA2, "getAppContext()");
        aqk.a(contextA2, uri, aqk.PACKAGE_SYSTEMUI);
        Context contextA3 = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA3, "getAppContext()");
        aqk.a(contextA3, uri, aqk.PACKAGE_LAUNCHER);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [double] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2, types: [double] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.BaseBundle, android.os.Bundle] */
    @SuppressLint({"Range"})
    @NotNull
    public final Bundle s() {
        long j;
        long j2;
        String str;
        String str2;
        String str3;
        ?? r6;
        Throwable th;
        ?? r7;
        Throwable th2;
        ContentResolver contentResolver = e88.a().getApplicationContext().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getAppContext().applicationContext.contentResolver");
        ?? bundle = new Bundle();
        SportDataAdapter.G(e88.a());
        Bundle bundleG = SportDataAdapter.G(e88.a());
        Intrinsics.checkNotNullExpressionValue(bundleG, "querySportData(GlobalApp…onHolder.getAppContext())");
        double dCoerceAtLeast = bundleG.getDouble("calorie");
        long j3 = bundleG.getLong("step");
        long j4 = bundleG.getLong("stepGoal");
        long j5 = bundleG.getLong("calGoal");
        ?? r8 = bundleG.getDouble("distance");
        try {
            j = j5;
            str = null;
            j2 = j4;
            str2 = "stepGoal";
            str3 = "calGoal";
            r8 = 0;
            try {
                try {
                    Cursor cursorQuery = contentResolver.query(Uri.parse("content://com.heytap.health.sporthealthprovider/self/sport"), null, null, null, null);
                    try {
                        Cursor cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.moveToFirst();
                            long jCoerceAtLeast = RangesKt.coerceAtLeast(cursor.getLong(cursor.getColumnIndex("step")), j3);
                            str = "distance";
                            try {
                                double dCoerceAtLeast2 = RangesKt.coerceAtLeast(cursor.getDouble(cursor.getColumnIndex(str)), (double) r8);
                                try {
                                    dCoerceAtLeast = RangesKt.coerceAtLeast(cursor.getDouble(cursor.getColumnIndex("calorie")), dCoerceAtLeast);
                                    j3 = jCoerceAtLeast;
                                    r7 = dCoerceAtLeast2;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    j3 = jCoerceAtLeast;
                                    r7 = dCoerceAtLeast2;
                                    th = th2;
                                    r8 = r7;
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        CloseableKt.closeFinally(cursorQuery, th);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                j3 = jCoerceAtLeast;
                                r7 = r8;
                            }
                        } else {
                            str = "distance";
                            r7 = r8;
                        }
                        try {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(cursorQuery, (Throwable) null);
                            r6 = r7;
                            m8b.f(a, "c =" + dCoerceAtLeast + " , s = " + j3 + " , d = " + r6);
                            bundle.putLong("step", j3);
                            bundle.putDouble(str, r6);
                            bundle.putDouble("calorie", dCoerceAtLeast);
                            bundle.putLong(str2, j2);
                            bundle.putLong(str3, j);
                            return bundle;
                        } catch (Throwable th6) {
                            th2 = th6;
                            th = th2;
                            r8 = r7;
                            throw th;
                        }
                    } catch (Throwable th7) {
                        str = "distance";
                        th = th7;
                        r8 = r8;
                    }
                } catch (Exception e) {
                    e = e;
                    str = "distance";
                    r8 = r8;
                    m8b.c(a, "querySportData exception: ", e);
                    r6 = r8;
                }
            } catch (Exception e2) {
                e = e2;
                m8b.c(a, "querySportData exception: ", e);
                r6 = r8;
                m8b.f(a, "c =" + dCoerceAtLeast + " , s = " + j3 + " , d = " + r6);
                bundle.putLong("step", j3);
                bundle.putDouble(str, r6);
                bundle.putDouble("calorie", dCoerceAtLeast);
                bundle.putLong(str2, j2);
                bundle.putLong(str3, j);
                return bundle;
            }
        } catch (Exception e3) {
            e = e3;
            j = j5;
            j2 = j4;
            str = "distance";
            str2 = "stepGoal";
            str3 = "calGoal";
        }
    }
}
