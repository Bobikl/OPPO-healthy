package com.heytap.health.sleep.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.Sleep;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.newsleep.SleepAdvice;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.oplus.aiunit.vision.SleepMainBean;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.g14;
import com.oplus.aiunit.vision.gmk;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.rfh;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.w0b;
import com.oplus.aiunit.vision.zkh;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u0000 Ê\u00012\u00020\u0001:\u0002Ë\u0001B\t¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002J\u001e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0016J\u0014\u0010\u001a\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J\u0006\u0010\u001c\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0016J\u0006\u0010\u001f\u001a\u00020\u0016J\b\u0010!\u001a\u00020 H\u0016R\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R$\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%R$\u00104\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%R\"\u00106\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R$\u0010>\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u00109R$\u0010@\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u00109R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00188\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010GR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020D0\u00188\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010GR(\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010C\u001a\u0004\bL\u0010G\"\u0004\bM\u0010NR(\u0010O\u001a\b\u0012\u0004\u0012\u00020J0\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010C\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010NR(\u0010S\u001a\u0004\u0018\u00010R2\b\u00101\u001a\u0004\u0018\u00010R8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR$\u0010X\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010^\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R(\u0010a\u001a\b\u0012\u0004\u0012\u00020W0\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010C\u001a\u0004\bb\u0010G\"\u0004\bc\u0010NR$\u0010e\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010k\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010f\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR$\u0010o\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010u\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010#\u001a\u0004\bv\u0010%\"\u0004\bw\u0010'R\"\u0010x\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010#\u001a\u0004\by\u0010%\"\u0004\bz\u0010'R$\u0010{\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b{\u00107\u001a\u0004\b|\u00109R\"\u0010}\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010#\u001a\u0004\b~\u0010%\"\u0004\b\u007f\u0010'R'\u0010\u0080\u0001\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010#\u001a\u0005\b\u0081\u0001\u0010%R&\u0010\u0082\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010#\u001a\u0005\b\u0083\u0001\u0010%\"\u0005\b\u0084\u0001\u0010'R&\u0010\u0085\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010#\u001a\u0005\b\u0086\u0001\u0010%\"\u0005\b\u0087\u0001\u0010'R'\u0010\u0088\u0001\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0088\u0001\u00107\u001a\u0005\b\u0089\u0001\u00109R,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R&\u0010\u0091\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u00107\u001a\u0005\b\u0092\u0001\u00109\"\u0005\b\u0093\u0001\u0010;R,\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R%\u0010\u000f\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b\u000f\u0010#\u001a\u0005\b\u009b\u0001\u0010%R%\u0010\u0010\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b\u0010\u0010#\u001a\u0005\b\u009c\u0001\u0010%R)\u0010\u009d\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009d\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R,\u0010£\u0001\u001a\u0005\u0018\u00010¢\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R,\u0010©\u0001\u001a\u0005\u0018\u00010¢\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010¤\u0001\u001a\u0006\bª\u0001\u0010¦\u0001\"\u0006\b«\u0001\u0010¨\u0001R&\u0010¬\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u00107\u001a\u0005\b\u00ad\u0001\u00109\"\u0005\b®\u0001\u0010;R&\u0010¯\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u00107\u001a\u0005\b°\u0001\u00109\"\u0005\b±\u0001\u0010;R'\u0010²\u0001\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b²\u0001\u00107\u001a\u0005\b³\u0001\u00109R)\u0010´\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010\u009e\u0001\u001a\u0006\b´\u0001\u0010\u009f\u0001\"\u0006\bµ\u0001\u0010¡\u0001R\u0013\u0010·\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010%R\u0013\u0010¹\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010%R\u0013\u0010»\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010%R\u0013\u0010½\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010%R\u0014\u0010¾\u0001\u001a\u00020\u00168F¢\u0006\b\u001a\u0006\b¾\u0001\u0010\u009f\u0001R\u0013\u0010À\u0001\u001a\u00020\u00138F¢\u0006\u0007\u001a\u0005\b¿\u0001\u00109R\u0013\u0010Â\u0001\u001a\u00020\u00138F¢\u0006\u0007\u001a\u0005\bÁ\u0001\u00109R\u0013\u0010Ä\u0001\u001a\u00020\u00138F¢\u0006\u0007\u001a\u0005\bÃ\u0001\u00109R\u0014\u0010Ç\u0001\u001a\u00020 8F¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006Ì\u0001"}, d2 = {"Lcom/heytap/health/sleep/bean/SleepDayBean;", "", "", "curDataTime", "", "initTimeParameter", "time", "processSpecialSleep", "Lcom/heytap/health/core/widget/charts/data/SleepUnitData;", "item", "processSleepWakeData", "initSectionSleepList", "calculateMergeSleepFrg", "setSleepDataSource", "calculateScale", SnoreHistoryActivity.CUR_DAY_START_TIME, SnoreHistoryActivity.CUR_DAY_END_TIME, "init", "time1", "", "type", "addData", "", "sleepDataIsUnreal", "", "dataList", "setSleepUnitDataList", "getSleepUnitDataList", "hasRealSleepData", "hasBloodOxData", "isApnea", "isIWatch", "", "toString", "timestamp", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "totalSleepTime", "getTotalSleepTime", "setTotalSleepTime", "totalDeepSleepTime", "getTotalDeepSleepTime", "setTotalDeepSleepTime", "totalLightlySleepTime", "getTotalLightlySleepTime", "setTotalLightlySleepTime", "<set-?>", "totalREMSleepTime", "getTotalREMSleepTime", "totalWakeTime", "getTotalWakeTime", "wakeCount", "I", "getWakeCount", "()I", "setWakeCount", "(I)V", "deepSleepScale", "getDeepSleepScale", "lightlySleepScale", "getLightlySleepScale", "remSleepScale", "getRemSleepScale", "sleepUnitDataList", "Ljava/util/List;", "Lcom/oplus/aiunit/vision/zkh;", "sleepFrgBeanList", "getSleepFrgBeanList", "()Ljava/util/List;", "sleepFrgBeanList2", "getSleepFrgBeanList2", "Lcom/heytap/databaseengine/model/Sleep;", "sleepList", "getSleepList", "setSleepList", "(Ljava/util/List;)V", "phoneSleepList", "getPhoneSleepList", "setPhoneSleepList", "Lcom/oplus/aiunit/vision/aoh;", "mainSleep", "Lcom/oplus/aiunit/vision/aoh;", "getMainSleep", "()Lcom/oplus/aiunit/vision/aoh;", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndex", "Lcom/heytap/databaseengine/model/SleepIndex;", "getSleepIndex", "()Lcom/heytap/databaseengine/model/SleepIndex;", "setSleepIndex", "(Lcom/heytap/databaseengine/model/SleepIndex;)V", "beforeSleepIndex", "getBeforeSleepIndex", "setBeforeSleepIndex", "sleepIndexList", "getSleepIndexList", "setSleepIndexList", "Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", "sleepAdvice", "Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", "getSleepAdvice", "()Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", "setSleepAdvice", "(Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;)V", "beforeSleepAdvice", "getBeforeSleepAdvice", "setBeforeSleepAdvice", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "hrvStat", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "getHrvStat", "()Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "setHrvStat", "(Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;)V", "nightSleepTime", "getNightSleepTime", "setNightSleepTime", "noonSleepTime", "getNoonSleepTime", "setNoonSleepTime", "sleepType", "getSleepType", "nightToNoonTime", "getNightToNoonTime", "setNightToNoonTime", "noonNapTime", "getNoonNapTime", "noonNapStartTime", "getNoonNapStartTime", "setNoonNapStartTime", "noonNapEndTime", "getNoonNapEndTime", "setNoonNapEndTime", "noonLethargyTime", "getNoonLethargyTime", "Lcom/heytap/health/sleep/bean/SleepBloodDayBean;", "sleepBloodDayBean", "Lcom/heytap/health/sleep/bean/SleepBloodDayBean;", "getSleepBloodDayBean", "()Lcom/heytap/health/sleep/bean/SleepBloodDayBean;", "setSleepBloodDayBean", "(Lcom/heytap/health/sleep/bean/SleepBloodDayBean;)V", DBHealthArchiveRecord.AGE, "getAge", "setAge", "Lcom/heytap/databaseengine/model/UserInfo;", dde.KEY_USER_INFO, "Lcom/heytap/databaseengine/model/UserInfo;", "getUserInfo", "()Lcom/heytap/databaseengine/model/UserInfo;", "setUserInfo", "(Lcom/heytap/databaseengine/model/UserInfo;)V", "getCurDayStartTime", "getCurDayEndTime", "isCalibration", "Z", "()Z", "setCalibration", "(Z)V", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "osaResultBean", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "getOsaResultBean", "()Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "setOsaResultBean", "(Lcom/heytap/databaseengine/model/snore/OsaResultBean;)V", "beforeOsaResultBean", "getBeforeOsaResultBean", "setBeforeOsaResultBean", "score", "getScore", "setScore", "dataVersion", "getDataVersion", "setDataVersion", "dataSource", "getDataSource", "isHasPhoneSleepData", "setHasPhoneSleepData", "getStartSleepTime", "startSleepTime", "getStartSleepChartTime", "startSleepChartTime", "getEndSleepTime", "endSleepTime", "getEndSleepChartTime", "endSleepChartTime", "isSupportCalculate", "getNightSleepTimeFromTimeToFallAsleep", "nightSleepTimeFromTimeToFallAsleep", "getNightWakeTimeFromTimeToFallAsleep", "nightWakeTimeFromTimeToFallAsleep", "getShowAverageBlood", "showAverageBlood", "getDeviceUniqueId", "()Ljava/lang/String;", g14.DEVICE_UNIQUE_ID, "<init>", "()V", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepDayBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDayBean.kt\ncom/heytap/health/sleep/bean/SleepDayBean\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,570:1\n1002#2,2:571\n*S KotlinDebug\n*F\n+ 1 SleepDayBean.kt\ncom/heytap/health/sleep/bean/SleepDayBean\n*L\n403#1:571,2\n*E\n"})
public final class SleepDayBean {
    private static final int SCORE_SHOW_TIME = 120;

    @NotNull
    private static final String TAG = "SleepDayBean";
    private int age;

    @Nullable
    private OsaResultBean beforeOsaResultBean;

    @Nullable
    private SleepAdvice beforeSleepAdvice;

    @Nullable
    private SleepIndex beforeSleepIndex;
    private long curDayEndTime;
    private long curDayStartTime;
    private int dataSource;
    private int dataVersion;
    private int deepSleepScale;

    @Nullable
    private PhysicalMentalStat hrvStat;
    private boolean isCalibration;
    private boolean isHasPhoneSleepData;
    private int lightlySleepScale;

    @Nullable
    private SleepMainBean mainSleep;
    private long nightSleepTime;
    private long nightToNoonTime;
    private int noonLethargyTime;
    private long noonNapEndTime;
    private long noonNapStartTime;
    private long noonNapTime;
    private long noonSleepTime;

    @Nullable
    private OsaResultBean osaResultBean;
    private int remSleepScale;
    private int score;

    @Nullable
    private SleepAdvice sleepAdvice;

    @Nullable
    private SleepBloodDayBean sleepBloodDayBean;

    @Nullable
    private SleepIndex sleepIndex;
    private int sleepType;
    private long timestamp;
    private long totalDeepSleepTime;
    private long totalLightlySleepTime;
    private long totalREMSleepTime;
    private long totalSleepTime;
    private long totalWakeTime;

    @Nullable
    private UserInfo userInfo;
    private int wakeCount;
    public static final int $stable = 8;

    @NotNull
    private List<SleepUnitData> sleepUnitDataList = new ArrayList();

    @NotNull
    private final List<zkh> sleepFrgBeanList = new ArrayList();

    @NotNull
    private final List<zkh> sleepFrgBeanList2 = new ArrayList();

    @NotNull
    private List<Sleep> sleepList = new ArrayList();

    @NotNull
    private List<Sleep> phoneSleepList = new ArrayList();

    @NotNull
    private List<SleepIndex> sleepIndexList = new ArrayList();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SleepDayBean.kt\ncom/heytap/health/sleep/bean/SleepDayBean\n*L\n1#1,328:1\n403#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((zkh) t).j()), Long.valueOf(((zkh) t2).j()));
        }
    }

    private final void calculateMergeSleepFrg() {
        ArrayList arrayList = new ArrayList();
        for (zkh zkhVar : this.sleepFrgBeanList) {
            if (zkhVar.n() >= 120) {
                arrayList.add(zkhVar);
            }
        }
        if (arrayList.size() >= 2) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<SleepUnitData> listI = ((zkh) it.next()).i();
                Intrinsics.checkNotNullExpressionValue(listI, "item.sleepUnitDataList");
                arrayList2.addAll(listI);
            }
            this.sleepFrgBeanList2.add(new zkh(this.curDayStartTime, this.curDayEndTime, arrayList2));
        }
    }

    private final void calculateScale() {
        long j2 = this.totalSleepTime;
        if (j2 > 0) {
            long j3 = this.totalDeepSleepTime;
            if (j3 > 0) {
                this.deepSleepScale = (int) Math.ceil((j3 * 100.0f) / j2);
            }
            long j4 = this.totalREMSleepTime;
            if (j4 > 0) {
                this.remSleepScale = (int) Math.ceil((j4 * 100.0f) / this.totalSleepTime);
            }
        }
        this.lightlySleepScale = (100 - this.deepSleepScale) - this.remSleepScale;
    }

    private final void initSectionSleepList() {
        this.sleepFrgBeanList.clear();
        if (!sleepDataIsUnreal()) {
            ArrayList arrayList = new ArrayList();
            int size = this.sleepUnitDataList.size();
            for (int i = 0; i < size; i++) {
                SleepUnitData sleepUnitData = this.sleepUnitDataList.get(i);
                arrayList.add(sleepUnitData);
                if (sleepUnitData.isStageSleepEnd()) {
                    this.sleepFrgBeanList.add(new zkh(this.curDayStartTime, this.curDayEndTime, arrayList));
                    arrayList.clear();
                }
                processSleepWakeData(sleepUnitData);
            }
        }
        if (!w0b.a(this.sleepFrgBeanList)) {
            List<zkh> list = this.sleepFrgBeanList;
            if (list.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new b());
            }
        }
        calculateMergeSleepFrg();
        this.mainSleep = new rfh().a(this.curDayStartTime, this.curDayEndTime, this.sleepFrgBeanList);
        calculateScale();
        setSleepDataSource();
    }

    private final void initTimeParameter(long curDataTime) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(curDataTime), ZoneId.systemDefault());
        if (localDateTimeOfInstant.getHour() >= 20) {
            localDateTimeOfInstant = LocalDateTime.of(localDateTimeOfInstant.toLocalDate().plusDays(1L), LocalTime.MIN);
        }
        if (this.nightToNoonTime <= 0) {
            this.nightToNoonTime = localDateTimeOfInstant.withHour(10).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }
        if (this.noonNapStartTime <= 0) {
            this.noonNapStartTime = localDateTimeOfInstant.withHour(11).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }
        if (this.noonNapEndTime <= 0) {
            this.noonNapEndTime = localDateTimeOfInstant.withHour(18).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }
    }

    private final void processSleepWakeData(SleepUnitData item) {
        if (item.getType() == 4) {
            this.totalWakeTime += item.getDuration() / ((long) 60000);
            this.wakeCount++;
        }
    }

    private final void processSpecialSleep(long curDataTime, long time) {
        if (curDataTime >= this.noonNapStartTime) {
            if (curDataTime <= this.noonNapEndTime) {
                this.noonNapTime += time;
            }
            this.noonLethargyTime += (int) time;
        }
        if (curDataTime < this.curDayStartTime || curDataTime > this.nightToNoonTime) {
            return;
        }
        this.nightSleepTime += time;
    }

    private final void setSleepDataSource() {
        Integer numC;
        boolean z = false;
        boolean z2 = false;
        for (zkh zkhVar : this.sleepFrgBeanList) {
            if (zkhVar.c() == null || (numC = zkhVar.c()) == null || numC.intValue() != 0) {
                z = true;
            } else {
                z2 = true;
            }
        }
        if (z && z2) {
            this.dataSource = 2;
        } else if (z2) {
            this.dataSource = 1;
        } else if (z) {
            this.dataSource = 0;
        }
    }

    public final void addData(long time1, int type, long curDataTime) {
        if (this.curDayStartTime <= 0) {
            m8b.b(TAG, "Not initialized!");
        }
        if (time1 < 60000) {
            m8b.b(TAG, "Sleep time is less than 1 minute");
            return;
        }
        long j2 = time1 / ((long) 60000);
        if (type == 1) {
            this.totalSleepTime += j2;
            this.totalDeepSleepTime += j2;
            processSpecialSleep(curDataTime, j2);
        } else if (type == 2) {
            this.totalSleepTime += j2;
            this.totalLightlySleepTime += j2;
            processSpecialSleep(curDataTime, j2);
        } else if (type == 3) {
            this.totalREMSleepTime += j2;
            this.totalSleepTime += j2;
            processSpecialSleep(curDataTime, j2);
        }
        long j3 = this.totalSleepTime;
        long j4 = this.nightSleepTime;
        long j5 = j3 - j4;
        this.noonSleepTime = j5;
        this.sleepType = (j5 <= j4 || j3 < 240) ? 0 : 1;
    }

    public final int getAge() {
        return this.age;
    }

    @Nullable
    public final OsaResultBean getBeforeOsaResultBean() {
        return this.beforeOsaResultBean;
    }

    @Nullable
    public final SleepAdvice getBeforeSleepAdvice() {
        return this.beforeSleepAdvice;
    }

    @Nullable
    public final SleepIndex getBeforeSleepIndex() {
        return this.beforeSleepIndex;
    }

    public final long getCurDayEndTime() {
        return this.curDayEndTime;
    }

    public final long getCurDayStartTime() {
        return this.curDayStartTime;
    }

    public final int getDataSource() {
        return this.dataSource;
    }

    public final int getDataVersion() {
        return this.dataVersion;
    }

    public final int getDeepSleepScale() {
        return this.deepSleepScale;
    }

    @NotNull
    public final String getDeviceUniqueId() {
        if (!w0b.b(this.sleepList, 1)) {
            return "";
        }
        String deviceUniqueId = this.sleepList.get(0).getDeviceUniqueId();
        Intrinsics.checkNotNullExpressionValue(deviceUniqueId, "firstItem.deviceUniqueId");
        return deviceUniqueId;
    }

    public final long getEndSleepChartTime() {
        if (this.sleepUnitDataList.isEmpty()) {
            return 0L;
        }
        List<SleepUnitData> list = this.sleepUnitDataList;
        long timestamp = list.get(list.size() - 1).getTimestamp();
        List<SleepUnitData> list2 = this.sleepUnitDataList;
        return timestamp + list2.get(list2.size() - 1).getDuration();
    }

    public final long getEndSleepTime() {
        if (!this.sleepUnitDataList.isEmpty()) {
            Iterator<SleepUnitData> it = this.sleepUnitDataList.iterator();
            while (it.hasNext()) {
                if (it.next().getDuration() > 1) {
                    List<SleepUnitData> list = this.sleepUnitDataList;
                    long timestamp = list.get(list.size() - 1).getTimestamp();
                    List<SleepUnitData> list2 = this.sleepUnitDataList;
                    return timestamp + list2.get(list2.size() - 1).getDuration();
                }
            }
        }
        return 0L;
    }

    @Nullable
    public final PhysicalMentalStat getHrvStat() {
        return this.hrvStat;
    }

    public final int getLightlySleepScale() {
        return this.lightlySleepScale;
    }

    @Nullable
    public final SleepMainBean getMainSleep() {
        return this.mainSleep;
    }

    public final long getNightSleepTime() {
        return this.nightSleepTime;
    }

    public final int getNightSleepTimeFromTimeToFallAsleep() {
        int iN = 0;
        for (zkh zkhVar : this.sleepFrgBeanList) {
            long j2 = zkhVar.j();
            if (j2 <= 0 || j2 > this.nightToNoonTime) {
                break;
            }
            iN += zkhVar.n();
        }
        return iN;
    }

    public final long getNightToNoonTime() {
        return this.nightToNoonTime;
    }

    public final int getNightWakeTimeFromTimeToFallAsleep() {
        int iO = 0;
        for (zkh zkhVar : this.sleepFrgBeanList) {
            long j2 = zkhVar.j();
            if (j2 <= 0 || j2 > this.nightToNoonTime) {
                break;
            }
            iO += zkhVar.o();
        }
        return iO;
    }

    public final int getNoonLethargyTime() {
        return this.noonLethargyTime;
    }

    public final long getNoonNapEndTime() {
        return this.noonNapEndTime;
    }

    public final long getNoonNapStartTime() {
        return this.noonNapStartTime;
    }

    public final long getNoonNapTime() {
        return this.noonNapTime;
    }

    public final long getNoonSleepTime() {
        return this.noonSleepTime;
    }

    @Nullable
    public final OsaResultBean getOsaResultBean() {
        return this.osaResultBean;
    }

    @NotNull
    public final List<Sleep> getPhoneSleepList() {
        return this.phoneSleepList;
    }

    public final int getRemSleepScale() {
        return this.remSleepScale;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getShowAverageBlood() {
        SleepIndex sleepIndex = this.sleepIndex;
        if (sleepIndex != null) {
            Intrinsics.checkNotNull(sleepIndex);
            if (gmk.b(sleepIndex.getAvgSleepSpo2()) > 0) {
                SleepIndex sleepIndex2 = this.sleepIndex;
                Intrinsics.checkNotNull(sleepIndex2);
                return gmk.b(sleepIndex2.getAvgSleepSpo2());
            }
        }
        SleepBloodDayBean sleepBloodDayBean = this.sleepBloodDayBean;
        if (sleepBloodDayBean == null) {
            return -1;
        }
        Intrinsics.checkNotNull(sleepBloodDayBean);
        return sleepBloodDayBean.getAverageBlood();
    }

    @Nullable
    public final SleepAdvice getSleepAdvice() {
        return this.sleepAdvice;
    }

    @Nullable
    public final SleepBloodDayBean getSleepBloodDayBean() {
        return this.sleepBloodDayBean;
    }

    @NotNull
    public final List<zkh> getSleepFrgBeanList() {
        return this.sleepFrgBeanList;
    }

    @NotNull
    public final List<zkh> getSleepFrgBeanList2() {
        return this.sleepFrgBeanList2;
    }

    @Nullable
    public final SleepIndex getSleepIndex() {
        return this.sleepIndex;
    }

    @NotNull
    public final List<SleepIndex> getSleepIndexList() {
        return this.sleepIndexList;
    }

    @NotNull
    public final List<Sleep> getSleepList() {
        return this.sleepList;
    }

    public final int getSleepType() {
        return this.sleepType;
    }

    @NotNull
    public final List<SleepUnitData> getSleepUnitDataList() {
        return this.sleepUnitDataList;
    }

    public final long getStartSleepChartTime() {
        if (this.sleepUnitDataList.isEmpty()) {
            return 0L;
        }
        return this.sleepUnitDataList.get(0).getTimestamp();
    }

    public final long getStartSleepTime() {
        if (!this.sleepUnitDataList.isEmpty()) {
            Iterator<SleepUnitData> it = this.sleepUnitDataList.iterator();
            while (it.hasNext()) {
                if (it.next().getDuration() > 1) {
                    return this.sleepUnitDataList.get(0).getTimestamp();
                }
            }
        }
        return 0L;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getTotalDeepSleepTime() {
        return this.totalDeepSleepTime;
    }

    public final long getTotalLightlySleepTime() {
        return this.totalLightlySleepTime;
    }

    public final long getTotalREMSleepTime() {
        return this.totalREMSleepTime;
    }

    public final long getTotalSleepTime() {
        return this.totalSleepTime;
    }

    public final long getTotalWakeTime() {
        return this.totalWakeTime;
    }

    @Nullable
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final int getWakeCount() {
        return this.wakeCount;
    }

    public final boolean hasBloodOxData() {
        SleepBloodDayBean sleepBloodDayBean = this.sleepBloodDayBean;
        if (sleepBloodDayBean != null) {
            Intrinsics.checkNotNull(sleepBloodDayBean);
            if (!sleepBloodDayBean.getBloodOxDataList().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasRealSleepData() {
        return !sleepDataIsUnreal();
    }

    public final void init(long curDayStartTime, long curDayEndTime) {
        this.curDayStartTime = curDayStartTime;
        this.curDayEndTime = curDayEndTime;
        this.timestamp = pr8.INSTANCE.c(curDayEndTime);
        initTimeParameter(this.curDayStartTime);
    }

    public final boolean isApnea() {
        OsaResultBean osaResultBean = this.osaResultBean;
        return osaResultBean != null && osaResultBean.getVersion() == 1;
    }

    /* JADX INFO: renamed from: isCalibration, reason: from getter */
    public final boolean getIsCalibration() {
        return this.isCalibration;
    }

    /* JADX INFO: renamed from: isHasPhoneSleepData, reason: from getter */
    public final boolean getIsHasPhoneSleepData() {
        return this.isHasPhoneSleepData;
    }

    public final boolean isIWatch() {
        return this.dataVersion == 12;
    }

    public final boolean isSupportCalculate() {
        return hasRealSleepData() && this.totalSleepTime >= 120;
    }

    public final void setAge(int i) {
        this.age = i;
    }

    public final void setBeforeOsaResultBean(@Nullable OsaResultBean osaResultBean) {
        this.beforeOsaResultBean = osaResultBean;
    }

    public final void setBeforeSleepAdvice(@Nullable SleepAdvice sleepAdvice) {
        this.beforeSleepAdvice = sleepAdvice;
    }

    public final void setBeforeSleepIndex(@Nullable SleepIndex sleepIndex) {
        this.beforeSleepIndex = sleepIndex;
    }

    public final void setCalibration(boolean z) {
        this.isCalibration = z;
    }

    public final void setDataVersion(int i) {
        this.dataVersion = i;
    }

    public final void setHasPhoneSleepData(boolean z) {
        this.isHasPhoneSleepData = z;
    }

    public final void setHrvStat(@Nullable PhysicalMentalStat physicalMentalStat) {
        this.hrvStat = physicalMentalStat;
    }

    public final void setNightSleepTime(long j2) {
        this.nightSleepTime = j2;
    }

    public final void setNightToNoonTime(long j2) {
        this.nightToNoonTime = j2;
    }

    public final void setNoonNapEndTime(long j2) {
        this.noonNapEndTime = j2;
    }

    public final void setNoonNapStartTime(long j2) {
        this.noonNapStartTime = j2;
    }

    public final void setNoonSleepTime(long j2) {
        this.noonSleepTime = j2;
    }

    public final void setOsaResultBean(@Nullable OsaResultBean osaResultBean) {
        this.osaResultBean = osaResultBean;
    }

    public final void setPhoneSleepList(@NotNull List<Sleep> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.phoneSleepList = list;
    }

    public final void setScore(int i) {
        this.score = i;
    }

    public final void setSleepAdvice(@Nullable SleepAdvice sleepAdvice) {
        this.sleepAdvice = sleepAdvice;
    }

    public final void setSleepBloodDayBean(@Nullable SleepBloodDayBean sleepBloodDayBean) {
        this.sleepBloodDayBean = sleepBloodDayBean;
    }

    public final void setSleepIndex(@Nullable SleepIndex sleepIndex) {
        this.sleepIndex = sleepIndex;
    }

    public final void setSleepIndexList(@NotNull List<SleepIndex> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sleepIndexList = list;
    }

    public final void setSleepList(@NotNull List<Sleep> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sleepList = list;
    }

    public final void setSleepUnitDataList(@NotNull List<SleepUnitData> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.sleepUnitDataList = dataList;
        if (!sleepDataIsUnreal()) {
            if (this.sleepUnitDataList.size() == 1) {
                this.sleepUnitDataList.get(0).setStageSleepEnd(true);
                this.sleepUnitDataList.get(0).setIWatch(true);
            } else {
                SleepUnitData sleepUnitData = this.sleepUnitDataList.get(0);
                sleepUnitData.setIWatch(isIWatch());
                int size = this.sleepUnitDataList.size();
                int i = 1;
                while (i < size) {
                    SleepUnitData sleepUnitData2 = this.sleepUnitDataList.get(i);
                    if (sleepUnitData2.getTimestamp() != sleepUnitData.getTimestamp() + sleepUnitData.getDuration()) {
                        this.sleepUnitDataList.get(i - 1).setStageSleepEnd(true);
                    }
                    sleepUnitData2.setIWatch(isIWatch());
                    i++;
                    sleepUnitData = sleepUnitData2;
                }
                List<SleepUnitData> list = this.sleepUnitDataList;
                list.get(list.size() - 1).setStageSleepEnd(true);
            }
        }
        initSectionSleepList();
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public final void setTotalDeepSleepTime(long j2) {
        this.totalDeepSleepTime = j2;
    }

    public final void setTotalLightlySleepTime(long j2) {
        this.totalLightlySleepTime = j2;
    }

    public final void setTotalSleepTime(long j2) {
        this.totalSleepTime = j2;
    }

    public final void setUserInfo(@Nullable UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public final void setWakeCount(int i) {
        this.wakeCount = i;
    }

    public final boolean sleepDataIsUnreal() {
        if (w0b.a(this.sleepUnitDataList)) {
            return true;
        }
        if (this.sleepUnitDataList.size() == 2) {
            return this.sleepUnitDataList.get(0).getDuration() <= 0 && this.sleepUnitDataList.get(1).getDuration() <= 0;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "SleepDayBean{totalSleepTime=" + s15.b(this.totalSleepTime) + ", totalDeepSleepTime=" + s15.b(this.totalDeepSleepTime) + ", totalLightlySleepTime=" + s15.b(this.totalLightlySleepTime) + ", totalWakeTime=" + s15.b(this.totalWakeTime) + ", wakeCount=" + this.wakeCount + ", nightSleepTime=" + s15.b(this.nightSleepTime) + ", noonSleepTime=" + s15.b(this.noonSleepTime) + ", noonNapTime=" + s15.b(this.noonNapTime) + ", sleepUnitDataList size=" + this.sleepUnitDataList.size() + ", hasRealSleepData =" + hasRealSleepData() + "}";
    }
}