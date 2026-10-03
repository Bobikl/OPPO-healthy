package com.heytap.health.settings.watch.sporthealthsettings.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.oplus.aiunit.vision.ct1;
import com.oplus.aiunit.vision.f4m;
import com.oplus.aiunit.vision.gqc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bj\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0002\u0012\b\b\u0002\u0010F\u001a\u00020\u0002\u0012\b\b\u0002\u0010G\u001a\u00020\u0004\u0012\b\b\u0002\u0010H\u001a\u00020\u0006\u0012\b\b\u0002\u0010I\u001a\u00020\b\u0012\b\b\u0002\u0010J\u001a\u00020\n\u0012\b\b\u0002\u0010K\u001a\u00020\f\u0012\b\b\u0002\u0010L\u001a\u00020\u000e\u0012\b\b\u0002\u0010M\u001a\u00020\u0010\u0012\b\b\u0002\u0010N\u001a\u00020\u0012\u0012\b\b\u0002\u0010O\u001a\u00020\u0014\u0012\b\b\u0002\u0010P\u001a\u00020\u0016\u0012\b\b\u0002\u0010Q\u001a\u00020\u0018\u0012\b\b\u0002\u0010R\u001a\u00020\u001a\u0012\b\b\u0002\u0010S\u001a\u00020\u001c\u0012\b\b\u0002\u0010T\u001a\u00020\u001e\u0012\b\b\u0002\u0010U\u001a\u00020 \u0012\b\b\u0002\u0010V\u001a\u00020\"\u0012\b\b\u0002\u0010W\u001a\u00020$\u0012\b\b\u0002\u0010X\u001a\u00020&\u0012\b\b\u0002\u0010Y\u001a\u00020(\u0012\b\b\u0002\u0010Z\u001a\u00020*\u0012\b\b\u0002\u0010[\u001a\u00020,\u0012\b\b\u0002\u0010\\\u001a\u00020.\u0012\b\b\u0002\u0010]\u001a\u000200\u0012\b\b\u0002\u0010^\u001a\u000202\u0012\b\b\u0002\u0010_\u001a\u000204\u0012\b\b\u0002\u0010`\u001a\u000206\u0012\b\b\u0002\u0010a\u001a\u000208\u0012\b\b\u0002\u0010b\u001a\u00020:\u0012\b\b\u0002\u0010c\u001a\u00020<\u0012\b\b\u0002\u0010d\u001a\u00020>\u0012\b\b\u0002\u0010e\u001a\u00020@\u0012\b\b\u0002\u0010f\u001a\u00020B\u0012\b\b\u0002\u0010g\u001a\u00020D¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\t\u0010\u001d\u001a\u00020\u001cHÆ\u0003J\t\u0010\u001f\u001a\u00020\u001eHÆ\u0003J\t\u0010!\u001a\u00020 HÆ\u0003J\t\u0010#\u001a\u00020\"HÆ\u0003J\t\u0010%\u001a\u00020$HÆ\u0003J\t\u0010'\u001a\u00020&HÆ\u0003J\t\u0010)\u001a\u00020(HÆ\u0003J\t\u0010+\u001a\u00020*HÆ\u0003J\t\u0010-\u001a\u00020,HÆ\u0003J\t\u0010/\u001a\u00020.HÆ\u0003J\t\u00101\u001a\u000200HÆ\u0003J\t\u00103\u001a\u000202HÆ\u0003J\t\u00105\u001a\u000204HÆ\u0003J\t\u00107\u001a\u000206HÆ\u0003J\t\u00109\u001a\u000208HÆ\u0003J\t\u0010;\u001a\u00020:HÆ\u0003J\t\u0010=\u001a\u00020<HÆ\u0003J\t\u0010?\u001a\u00020>HÆ\u0003J\t\u0010A\u001a\u00020@HÆ\u0003J\t\u0010C\u001a\u00020BHÆ\u0003J\t\u0010E\u001a\u00020DHÆ\u0003JÝ\u0002\u0010h\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020\u00022\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00062\b\b\u0002\u0010I\u001a\u00020\b2\b\b\u0002\u0010J\u001a\u00020\n2\b\b\u0002\u0010K\u001a\u00020\f2\b\b\u0002\u0010L\u001a\u00020\u000e2\b\b\u0002\u0010M\u001a\u00020\u00102\b\b\u0002\u0010N\u001a\u00020\u00122\b\b\u0002\u0010O\u001a\u00020\u00142\b\b\u0002\u0010P\u001a\u00020\u00162\b\b\u0002\u0010Q\u001a\u00020\u00182\b\b\u0002\u0010R\u001a\u00020\u001a2\b\b\u0002\u0010S\u001a\u00020\u001c2\b\b\u0002\u0010T\u001a\u00020\u001e2\b\b\u0002\u0010U\u001a\u00020 2\b\b\u0002\u0010V\u001a\u00020\"2\b\b\u0002\u0010W\u001a\u00020$2\b\b\u0002\u0010X\u001a\u00020&2\b\b\u0002\u0010Y\u001a\u00020(2\b\b\u0002\u0010Z\u001a\u00020*2\b\b\u0002\u0010[\u001a\u00020,2\b\b\u0002\u0010\\\u001a\u00020.2\b\b\u0002\u0010]\u001a\u0002002\b\b\u0002\u0010^\u001a\u0002022\b\b\u0002\u0010_\u001a\u0002042\b\b\u0002\u0010`\u001a\u0002062\b\b\u0002\u0010a\u001a\u0002082\b\b\u0002\u0010b\u001a\u00020:2\b\b\u0002\u0010c\u001a\u00020<2\b\b\u0002\u0010d\u001a\u00020>2\b\b\u0002\u0010e\u001a\u00020@2\b\b\u0002\u0010f\u001a\u00020B2\b\b\u0002\u0010g\u001a\u00020DHÆ\u0001J\t\u0010j\u001a\u00020iHÖ\u0001J\t\u0010l\u001a\u00020kHÖ\u0001J\u0013\u0010o\u001a\u00020n2\b\u0010m\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010s\u001a\u0004\bt\u0010uR\u0017\u0010H\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bH\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010I\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bI\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010J\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bJ\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010K\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0004\bK\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010L\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0005\bL\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010M\u001a\u00020\u00108\u0006¢\u0006\u000f\n\u0005\bM\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010N\u001a\u00020\u00128\u0006¢\u0006\u000f\n\u0005\bN\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010O\u001a\u00020\u00148\u0006¢\u0006\u000f\n\u0005\bO\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010P\u001a\u00020\u00168\u0006¢\u0006\u000f\n\u0005\bP\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010Q\u001a\u00020\u00188\u0006¢\u0006\u000f\n\u0005\bQ\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010R\u001a\u00020\u001a8\u0006¢\u0006\u000f\n\u0005\bR\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010S\u001a\u00020\u001c8\u0006¢\u0006\u000f\n\u0005\bS\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010T\u001a\u00020\u001e8\u0006¢\u0006\u000f\n\u0005\bT\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010U\u001a\u00020 8\u0006¢\u0006\u000f\n\u0005\bU\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001a\u0010V\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0005\bV\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010W\u001a\u00020$8\u0006¢\u0006\u000f\n\u0005\bW\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010X\u001a\u00020&8\u0006¢\u0006\u000f\n\u0005\bX\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010Y\u001a\u00020(8\u0006¢\u0006\u000f\n\u0005\bY\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u001a\u0010Z\u001a\u00020*8\u0006¢\u0006\u000f\n\u0005\bZ\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u001a\u0010[\u001a\u00020,8\u0006¢\u0006\u000f\n\u0005\b[\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001a\u0010\\\u001a\u00020.8\u0006¢\u0006\u000f\n\u0005\b\\\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u001a\u0010]\u001a\u0002008\u0006¢\u0006\u000f\n\u0005\b]\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u001a\u0010^\u001a\u0002028\u0006¢\u0006\u000f\n\u0005\b^\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R\u001a\u0010_\u001a\u0002048\u0006¢\u0006\u000f\n\u0005\b_\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u001a\u0010`\u001a\u0002068\u0006¢\u0006\u000f\n\u0005\b`\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R\u001a\u0010a\u001a\u0002088\u0006¢\u0006\u000f\n\u0005\ba\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001a\u0010b\u001a\u00020:8\u0006¢\u0006\u000f\n\u0005\bb\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u001a\u0010c\u001a\u00020<8\u0006¢\u0006\u000f\n\u0005\bc\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R\u001a\u0010d\u001a\u00020>8\u0006¢\u0006\u000f\n\u0005\bd\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R\u001a\u0010e\u001a\u00020@8\u0006¢\u0006\u000f\n\u0005\be\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001a\u0010f\u001a\u00020B8\u0006¢\u0006\u000f\n\u0005\bf\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u001a\u0010g\u001a\u00020D8\u0006¢\u0006\u000f\n\u0005\bg\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001¨\u0006Ø\u0001"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g0;", "component1", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/k;", "component2", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/p;", "component3", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/e;", "component4", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/x;", "component5", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/f;", "component6", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/q;", "component7", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g;", "component8", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/u;", "component9", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/e0;", "component10", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a;", "component11", "Lcom/oplus/aiunit/vision/ct1;", "component12", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/h0;", "component13", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/i;", "component14", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;", "component15", "Lcom/oplus/aiunit/vision/f4m;", "component16", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/t;", "component17", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a0;", "component18", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/h;", "component19", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/y;", "component20", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SportsAutoPauseSettings;", "component21", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/c0;", "component22", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/f0;", "component23", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/n;", "component24", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/j;", "component25", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/d0;", "component26", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/r;", "component27", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/s;", "component28", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/d;", "component29", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/l;", "component30", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/o;", "component31", "Lcom/oplus/aiunit/vision/gqc;", "component32", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/j0;", "component33", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/v;", "component34", "stepGoal", "calorieGoal", "exerciseTimeGoal", "activityGoal", "sedentary", "activityNotification", "fallDown", "autoMeasureHeartRate", "quietHeartRate", "sportsHeartRate", "afib", "bloodSugar", "stressAutoMeasure", "breatheRelax", "spo2AllDayMonitor", "wristTemperature", "osa", DBAssessmentRecord.SPO2, "breatheRate", "sleepRem", "sportsAutoPause", "sportsAutoRecognize", "sportsVoiceBroadcast", "doubleClickVoiceBroadcast", "buttonToPauseOrResume", "sportsGoalSettings", "meditationBreathSettings", "menstrualCycleSettings", "achievementReminderSettings", "continueSportRemindSettings", "endSportRemindSettings", "newGoalSettingSelected", "sunshineDurationSettings", "regularEarlyBedtimeSettings", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g0;", "getStepGoal", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g0;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/k;", "getCalorieGoal", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/k;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/p;", "getExerciseTimeGoal", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/p;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/e;", "getActivityGoal", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/e;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/x;", "getSedentary", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/x;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/f;", "getActivityNotification", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/f;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/q;", "getFallDown", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/q;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g;", "getAutoMeasureHeartRate", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/u;", "getQuietHeartRate", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/u;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/e0;", "getSportsHeartRate", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/e0;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a;", "getAfib", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a;", "Lcom/oplus/aiunit/vision/ct1;", "getBloodSugar", "()Lcom/oplus/aiunit/vision/ct1;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/h0;", "getStressAutoMeasure", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/h0;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/i;", "getBreatheRelax", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/i;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;", "getSpo2AllDayMonitor", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;", "Lcom/oplus/aiunit/vision/f4m;", "getWristTemperature", "()Lcom/oplus/aiunit/vision/f4m;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/t;", "getOsa", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/t;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a0;", "getSpo2", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a0;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/h;", "getBreatheRate", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/h;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/y;", "getSleepRem", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/y;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SportsAutoPauseSettings;", "getSportsAutoPause", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SportsAutoPauseSettings;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/c0;", "getSportsAutoRecognize", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/c0;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/f0;", "getSportsVoiceBroadcast", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/f0;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/n;", "getDoubleClickVoiceBroadcast", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/n;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/j;", "getButtonToPauseOrResume", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/j;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/d0;", "getSportsGoalSettings", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/d0;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/r;", "getMeditationBreathSettings", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/r;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/s;", "getMenstrualCycleSettings", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/s;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/d;", "getAchievementReminderSettings", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/d;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/l;", "getContinueSportRemindSettings", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/l;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/o;", "getEndSportRemindSettings", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/o;", "Lcom/oplus/aiunit/vision/gqc;", "getNewGoalSettingSelected", "()Lcom/oplus/aiunit/vision/gqc;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/j0;", "getSunshineDurationSettings", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/j0;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/v;", "getRegularEarlyBedtimeSettings", "()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/v;", "<init>", "(Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g0;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/k;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/p;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/e;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/x;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/f;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/q;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/u;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/e0;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a;Lcom/oplus/aiunit/vision/ct1;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/h0;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/i;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;Lcom/oplus/aiunit/vision/f4m;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/t;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a0;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/h;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/y;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SportsAutoPauseSettings;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/c0;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/f0;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/n;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/j;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/d0;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/r;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/s;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/d;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/l;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/o;Lcom/oplus/aiunit/vision/gqc;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/j0;Lcom/heytap/health/settings/watch/sporthealthsettings/bean/v;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DeviceSettings {
    public static final int $stable = 8;

    @NotNull
    private final d achievementReminderSettings;

    @NotNull
    private final e activityGoal;

    @NotNull
    private final f activityNotification;

    @NotNull
    private final a afib;

    @NotNull
    private final g autoMeasureHeartRate;

    @NotNull
    private final ct1 bloodSugar;

    @NotNull
    private final h breatheRate;

    @NotNull
    private final i breatheRelax;

    @NotNull
    private final j buttonToPauseOrResume;

    @NotNull
    private final k calorieGoal;

    @NotNull
    private final l continueSportRemindSettings;

    @NotNull
    private final n doubleClickVoiceBroadcast;

    @NotNull
    private final o endSportRemindSettings;

    @NotNull
    private final p exerciseTimeGoal;

    @NotNull
    private final q fallDown;

    @NotNull
    private final r meditationBreathSettings;

    @NotNull
    private final s menstrualCycleSettings;

    @NotNull
    private final gqc newGoalSettingSelected;

    @NotNull
    private final t osa;

    @NotNull
    private final u quietHeartRate;

    @NotNull
    private final v regularEarlyBedtimeSettings;

    @NotNull
    private final x sedentary;

    @NotNull
    private final y sleepRem;

    @NotNull
    private final a0 spo2;

    @NotNull
    private final z spo2AllDayMonitor;

    @NotNull
    private final SportsAutoPauseSettings sportsAutoPause;

    @NotNull
    private final c0 sportsAutoRecognize;

    @NotNull
    private final d0 sportsGoalSettings;

    @NotNull
    private final e0 sportsHeartRate;

    @NotNull
    private final f0 sportsVoiceBroadcast;

    @NotNull
    private final g0 stepGoal;

    @NotNull
    private final h0 stressAutoMeasure;

    @NotNull
    private final j0 sunshineDurationSettings;

    @NotNull
    private final f4m wristTemperature;

    public DeviceSettings() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final g0 getStepGoal() {
        return this.stepGoal;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final e0 getSportsHeartRate() {
        return this.sportsHeartRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final a getAfib() {
        return this.afib;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ct1 getBloodSugar() {
        return this.bloodSugar;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final h0 getStressAutoMeasure() {
        return this.stressAutoMeasure;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final i getBreatheRelax() {
        return this.breatheRelax;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final z getSpo2AllDayMonitor() {
        return this.spo2AllDayMonitor;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final f4m getWristTemperature() {
        return this.wristTemperature;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final t getOsa() {
        return this.osa;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final a0 getSpo2() {
        return this.spo2;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final h getBreatheRate() {
        return this.breatheRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final k getCalorieGoal() {
        return this.calorieGoal;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final y getSleepRem() {
        return this.sleepRem;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final SportsAutoPauseSettings getSportsAutoPause() {
        return this.sportsAutoPause;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final c0 getSportsAutoRecognize() {
        return this.sportsAutoRecognize;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final f0 getSportsVoiceBroadcast() {
        return this.sportsVoiceBroadcast;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final n getDoubleClickVoiceBroadcast() {
        return this.doubleClickVoiceBroadcast;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final j getButtonToPauseOrResume() {
        return this.buttonToPauseOrResume;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final d0 getSportsGoalSettings() {
        return this.sportsGoalSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final r getMeditationBreathSettings() {
        return this.meditationBreathSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final s getMenstrualCycleSettings() {
        return this.menstrualCycleSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final d getAchievementReminderSettings() {
        return this.achievementReminderSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final p getExerciseTimeGoal() {
        return this.exerciseTimeGoal;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final l getContinueSportRemindSettings() {
        return this.continueSportRemindSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final o getEndSportRemindSettings() {
        return this.endSportRemindSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final gqc getNewGoalSettingSelected() {
        return this.newGoalSettingSelected;
    }

    @NotNull
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final j0 getSunshineDurationSettings() {
        return this.sunshineDurationSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final v getRegularEarlyBedtimeSettings() {
        return this.regularEarlyBedtimeSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final e getActivityGoal() {
        return this.activityGoal;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final x getSedentary() {
        return this.sedentary;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final f getActivityNotification() {
        return this.activityNotification;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final q getFallDown() {
        return this.fallDown;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final g getAutoMeasureHeartRate() {
        return this.autoMeasureHeartRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final u getQuietHeartRate() {
        return this.quietHeartRate;
    }

    @NotNull
    public final DeviceSettings copy(@NotNull g0 stepGoal, @NotNull k calorieGoal, @NotNull p exerciseTimeGoal, @NotNull e activityGoal, @NotNull x sedentary, @NotNull f activityNotification, @NotNull q fallDown, @NotNull g autoMeasureHeartRate, @NotNull u quietHeartRate, @NotNull e0 sportsHeartRate, @NotNull a afib, @NotNull ct1 bloodSugar, @NotNull h0 stressAutoMeasure, @NotNull i breatheRelax, @NotNull z spo2AllDayMonitor, @NotNull f4m wristTemperature, @NotNull t osa, @NotNull a0 spo2, @NotNull h breatheRate, @NotNull y sleepRem, @NotNull SportsAutoPauseSettings sportsAutoPause, @NotNull c0 sportsAutoRecognize, @NotNull f0 sportsVoiceBroadcast, @NotNull n doubleClickVoiceBroadcast, @NotNull j buttonToPauseOrResume, @NotNull d0 sportsGoalSettings, @NotNull r meditationBreathSettings, @NotNull s menstrualCycleSettings, @NotNull d achievementReminderSettings, @NotNull l continueSportRemindSettings, @NotNull o endSportRemindSettings, @NotNull gqc newGoalSettingSelected, @NotNull j0 sunshineDurationSettings, @NotNull v regularEarlyBedtimeSettings) {
        Intrinsics.checkNotNullParameter(stepGoal, "stepGoal");
        Intrinsics.checkNotNullParameter(calorieGoal, "calorieGoal");
        Intrinsics.checkNotNullParameter(exerciseTimeGoal, "exerciseTimeGoal");
        Intrinsics.checkNotNullParameter(activityGoal, "activityGoal");
        Intrinsics.checkNotNullParameter(sedentary, "sedentary");
        Intrinsics.checkNotNullParameter(activityNotification, "activityNotification");
        Intrinsics.checkNotNullParameter(fallDown, "fallDown");
        Intrinsics.checkNotNullParameter(autoMeasureHeartRate, "autoMeasureHeartRate");
        Intrinsics.checkNotNullParameter(quietHeartRate, "quietHeartRate");
        Intrinsics.checkNotNullParameter(sportsHeartRate, "sportsHeartRate");
        Intrinsics.checkNotNullParameter(afib, "afib");
        Intrinsics.checkNotNullParameter(bloodSugar, "bloodSugar");
        Intrinsics.checkNotNullParameter(stressAutoMeasure, "stressAutoMeasure");
        Intrinsics.checkNotNullParameter(breatheRelax, "breatheRelax");
        Intrinsics.checkNotNullParameter(spo2AllDayMonitor, "spo2AllDayMonitor");
        Intrinsics.checkNotNullParameter(wristTemperature, "wristTemperature");
        Intrinsics.checkNotNullParameter(osa, "osa");
        Intrinsics.checkNotNullParameter(spo2, "spo2");
        Intrinsics.checkNotNullParameter(breatheRate, "breatheRate");
        Intrinsics.checkNotNullParameter(sleepRem, "sleepRem");
        Intrinsics.checkNotNullParameter(sportsAutoPause, "sportsAutoPause");
        Intrinsics.checkNotNullParameter(sportsAutoRecognize, "sportsAutoRecognize");
        Intrinsics.checkNotNullParameter(sportsVoiceBroadcast, "sportsVoiceBroadcast");
        Intrinsics.checkNotNullParameter(doubleClickVoiceBroadcast, "doubleClickVoiceBroadcast");
        Intrinsics.checkNotNullParameter(buttonToPauseOrResume, "buttonToPauseOrResume");
        Intrinsics.checkNotNullParameter(sportsGoalSettings, "sportsGoalSettings");
        Intrinsics.checkNotNullParameter(meditationBreathSettings, "meditationBreathSettings");
        Intrinsics.checkNotNullParameter(menstrualCycleSettings, "menstrualCycleSettings");
        Intrinsics.checkNotNullParameter(achievementReminderSettings, "achievementReminderSettings");
        Intrinsics.checkNotNullParameter(continueSportRemindSettings, "continueSportRemindSettings");
        Intrinsics.checkNotNullParameter(endSportRemindSettings, "endSportRemindSettings");
        Intrinsics.checkNotNullParameter(newGoalSettingSelected, "newGoalSettingSelected");
        Intrinsics.checkNotNullParameter(sunshineDurationSettings, "sunshineDurationSettings");
        Intrinsics.checkNotNullParameter(regularEarlyBedtimeSettings, "regularEarlyBedtimeSettings");
        return new DeviceSettings(stepGoal, calorieGoal, exerciseTimeGoal, activityGoal, sedentary, activityNotification, fallDown, autoMeasureHeartRate, quietHeartRate, sportsHeartRate, afib, bloodSugar, stressAutoMeasure, breatheRelax, spo2AllDayMonitor, wristTemperature, osa, spo2, breatheRate, sleepRem, sportsAutoPause, sportsAutoRecognize, sportsVoiceBroadcast, doubleClickVoiceBroadcast, buttonToPauseOrResume, sportsGoalSettings, meditationBreathSettings, menstrualCycleSettings, achievementReminderSettings, continueSportRemindSettings, endSportRemindSettings, newGoalSettingSelected, sunshineDurationSettings, regularEarlyBedtimeSettings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceSettings)) {
            return false;
        }
        DeviceSettings deviceSettings = (DeviceSettings) other;
        return Intrinsics.areEqual(this.stepGoal, deviceSettings.stepGoal) && Intrinsics.areEqual(this.calorieGoal, deviceSettings.calorieGoal) && Intrinsics.areEqual(this.exerciseTimeGoal, deviceSettings.exerciseTimeGoal) && Intrinsics.areEqual(this.activityGoal, deviceSettings.activityGoal) && Intrinsics.areEqual(this.sedentary, deviceSettings.sedentary) && Intrinsics.areEqual(this.activityNotification, deviceSettings.activityNotification) && Intrinsics.areEqual(this.fallDown, deviceSettings.fallDown) && Intrinsics.areEqual(this.autoMeasureHeartRate, deviceSettings.autoMeasureHeartRate) && Intrinsics.areEqual(this.quietHeartRate, deviceSettings.quietHeartRate) && Intrinsics.areEqual(this.sportsHeartRate, deviceSettings.sportsHeartRate) && Intrinsics.areEqual(this.afib, deviceSettings.afib) && Intrinsics.areEqual(this.bloodSugar, deviceSettings.bloodSugar) && Intrinsics.areEqual(this.stressAutoMeasure, deviceSettings.stressAutoMeasure) && Intrinsics.areEqual(this.breatheRelax, deviceSettings.breatheRelax) && Intrinsics.areEqual(this.spo2AllDayMonitor, deviceSettings.spo2AllDayMonitor) && Intrinsics.areEqual(this.wristTemperature, deviceSettings.wristTemperature) && Intrinsics.areEqual(this.osa, deviceSettings.osa) && Intrinsics.areEqual(this.spo2, deviceSettings.spo2) && Intrinsics.areEqual(this.breatheRate, deviceSettings.breatheRate) && Intrinsics.areEqual(this.sleepRem, deviceSettings.sleepRem) && Intrinsics.areEqual(this.sportsAutoPause, deviceSettings.sportsAutoPause) && Intrinsics.areEqual(this.sportsAutoRecognize, deviceSettings.sportsAutoRecognize) && Intrinsics.areEqual(this.sportsVoiceBroadcast, deviceSettings.sportsVoiceBroadcast) && Intrinsics.areEqual(this.doubleClickVoiceBroadcast, deviceSettings.doubleClickVoiceBroadcast) && Intrinsics.areEqual(this.buttonToPauseOrResume, deviceSettings.buttonToPauseOrResume) && Intrinsics.areEqual(this.sportsGoalSettings, deviceSettings.sportsGoalSettings) && Intrinsics.areEqual(this.meditationBreathSettings, deviceSettings.meditationBreathSettings) && Intrinsics.areEqual(this.menstrualCycleSettings, deviceSettings.menstrualCycleSettings) && Intrinsics.areEqual(this.achievementReminderSettings, deviceSettings.achievementReminderSettings) && Intrinsics.areEqual(this.continueSportRemindSettings, deviceSettings.continueSportRemindSettings) && Intrinsics.areEqual(this.endSportRemindSettings, deviceSettings.endSportRemindSettings) && Intrinsics.areEqual(this.newGoalSettingSelected, deviceSettings.newGoalSettingSelected) && Intrinsics.areEqual(this.sunshineDurationSettings, deviceSettings.sunshineDurationSettings) && Intrinsics.areEqual(this.regularEarlyBedtimeSettings, deviceSettings.regularEarlyBedtimeSettings);
    }

    @NotNull
    public final d getAchievementReminderSettings() {
        return this.achievementReminderSettings;
    }

    @NotNull
    public final e getActivityGoal() {
        return this.activityGoal;
    }

    @NotNull
    public final f getActivityNotification() {
        return this.activityNotification;
    }

    @NotNull
    public final a getAfib() {
        return this.afib;
    }

    @NotNull
    public final g getAutoMeasureHeartRate() {
        return this.autoMeasureHeartRate;
    }

    @NotNull
    public final ct1 getBloodSugar() {
        return this.bloodSugar;
    }

    @NotNull
    public final h getBreatheRate() {
        return this.breatheRate;
    }

    @NotNull
    public final i getBreatheRelax() {
        return this.breatheRelax;
    }

    @NotNull
    public final j getButtonToPauseOrResume() {
        return this.buttonToPauseOrResume;
    }

    @NotNull
    public final k getCalorieGoal() {
        return this.calorieGoal;
    }

    @NotNull
    public final l getContinueSportRemindSettings() {
        return this.continueSportRemindSettings;
    }

    @NotNull
    public final n getDoubleClickVoiceBroadcast() {
        return this.doubleClickVoiceBroadcast;
    }

    @NotNull
    public final o getEndSportRemindSettings() {
        return this.endSportRemindSettings;
    }

    @NotNull
    public final p getExerciseTimeGoal() {
        return this.exerciseTimeGoal;
    }

    @NotNull
    public final q getFallDown() {
        return this.fallDown;
    }

    @NotNull
    public final r getMeditationBreathSettings() {
        return this.meditationBreathSettings;
    }

    @NotNull
    public final s getMenstrualCycleSettings() {
        return this.menstrualCycleSettings;
    }

    @NotNull
    public final gqc getNewGoalSettingSelected() {
        return this.newGoalSettingSelected;
    }

    @NotNull
    public final t getOsa() {
        return this.osa;
    }

    @NotNull
    public final u getQuietHeartRate() {
        return this.quietHeartRate;
    }

    @NotNull
    public final v getRegularEarlyBedtimeSettings() {
        return this.regularEarlyBedtimeSettings;
    }

    @NotNull
    public final x getSedentary() {
        return this.sedentary;
    }

    @NotNull
    public final y getSleepRem() {
        return this.sleepRem;
    }

    @NotNull
    public final a0 getSpo2() {
        return this.spo2;
    }

    @NotNull
    public final z getSpo2AllDayMonitor() {
        return this.spo2AllDayMonitor;
    }

    @NotNull
    public final SportsAutoPauseSettings getSportsAutoPause() {
        return this.sportsAutoPause;
    }

    @NotNull
    public final c0 getSportsAutoRecognize() {
        return this.sportsAutoRecognize;
    }

    @NotNull
    public final d0 getSportsGoalSettings() {
        return this.sportsGoalSettings;
    }

    @NotNull
    public final e0 getSportsHeartRate() {
        return this.sportsHeartRate;
    }

    @NotNull
    public final f0 getSportsVoiceBroadcast() {
        return this.sportsVoiceBroadcast;
    }

    @NotNull
    public final g0 getStepGoal() {
        return this.stepGoal;
    }

    @NotNull
    public final h0 getStressAutoMeasure() {
        return this.stressAutoMeasure;
    }

    @NotNull
    public final j0 getSunshineDurationSettings() {
        return this.sunshineDurationSettings;
    }

    @NotNull
    public final f4m getWristTemperature() {
        return this.wristTemperature;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.stepGoal.hashCode() * 31) + this.calorieGoal.hashCode()) * 31) + this.exerciseTimeGoal.hashCode()) * 31) + this.activityGoal.hashCode()) * 31) + this.sedentary.hashCode()) * 31) + this.activityNotification.hashCode()) * 31) + this.fallDown.hashCode()) * 31) + this.autoMeasureHeartRate.hashCode()) * 31) + this.quietHeartRate.hashCode()) * 31) + this.sportsHeartRate.hashCode()) * 31) + this.afib.hashCode()) * 31) + this.bloodSugar.hashCode()) * 31) + this.stressAutoMeasure.hashCode()) * 31) + this.breatheRelax.hashCode()) * 31) + this.spo2AllDayMonitor.hashCode()) * 31) + this.wristTemperature.hashCode()) * 31) + this.osa.hashCode()) * 31) + this.spo2.hashCode()) * 31) + this.breatheRate.hashCode()) * 31) + this.sleepRem.hashCode()) * 31) + this.sportsAutoPause.hashCode()) * 31) + this.sportsAutoRecognize.hashCode()) * 31) + this.sportsVoiceBroadcast.hashCode()) * 31) + this.doubleClickVoiceBroadcast.hashCode()) * 31) + this.buttonToPauseOrResume.hashCode()) * 31) + this.sportsGoalSettings.hashCode()) * 31) + this.meditationBreathSettings.hashCode()) * 31) + this.menstrualCycleSettings.hashCode()) * 31) + this.achievementReminderSettings.hashCode()) * 31) + this.continueSportRemindSettings.hashCode()) * 31) + this.endSportRemindSettings.hashCode()) * 31) + this.newGoalSettingSelected.hashCode()) * 31) + this.sunshineDurationSettings.hashCode()) * 31) + this.regularEarlyBedtimeSettings.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceSettings(stepGoal=" + this.stepGoal + ", calorieGoal=" + this.calorieGoal + ", exerciseTimeGoal=" + this.exerciseTimeGoal + ", activityGoal=" + this.activityGoal + ", sedentary=" + this.sedentary + ", activityNotification=" + this.activityNotification + ", fallDown=" + this.fallDown + ", autoMeasureHeartRate=" + this.autoMeasureHeartRate + ", quietHeartRate=" + this.quietHeartRate + ", sportsHeartRate=" + this.sportsHeartRate + ", afib=" + this.afib + ", bloodSugar=" + this.bloodSugar + ", stressAutoMeasure=" + this.stressAutoMeasure + ", breatheRelax=" + this.breatheRelax + ", spo2AllDayMonitor=" + this.spo2AllDayMonitor + ", wristTemperature=" + this.wristTemperature + ", osa=" + this.osa + ", spo2=" + this.spo2 + ", breatheRate=" + this.breatheRate + ", sleepRem=" + this.sleepRem + ", sportsAutoPause=" + this.sportsAutoPause + ", sportsAutoRecognize=" + this.sportsAutoRecognize + ", sportsVoiceBroadcast=" + this.sportsVoiceBroadcast + ", doubleClickVoiceBroadcast=" + this.doubleClickVoiceBroadcast + ", buttonToPauseOrResume=" + this.buttonToPauseOrResume + ", sportsGoalSettings=" + this.sportsGoalSettings + ", meditationBreathSettings=" + this.meditationBreathSettings + ", menstrualCycleSettings=" + this.menstrualCycleSettings + ", achievementReminderSettings=" + this.achievementReminderSettings + ", continueSportRemindSettings=" + this.continueSportRemindSettings + ", endSportRemindSettings=" + this.endSportRemindSettings + ", newGoalSettingSelected=" + this.newGoalSettingSelected + ", sunshineDurationSettings=" + this.sunshineDurationSettings + ", regularEarlyBedtimeSettings=" + this.regularEarlyBedtimeSettings + ")";
    }

    public DeviceSettings(@NotNull g0 stepGoal, @NotNull k calorieGoal, @NotNull p exerciseTimeGoal, @NotNull e activityGoal, @NotNull x sedentary, @NotNull f activityNotification, @NotNull q fallDown, @NotNull g autoMeasureHeartRate, @NotNull u quietHeartRate, @NotNull e0 sportsHeartRate, @NotNull a afib, @NotNull ct1 bloodSugar, @NotNull h0 stressAutoMeasure, @NotNull i breatheRelax, @NotNull z spo2AllDayMonitor, @NotNull f4m wristTemperature, @NotNull t osa, @NotNull a0 spo2, @NotNull h breatheRate, @NotNull y sleepRem, @NotNull SportsAutoPauseSettings sportsAutoPause, @NotNull c0 sportsAutoRecognize, @NotNull f0 sportsVoiceBroadcast, @NotNull n doubleClickVoiceBroadcast, @NotNull j buttonToPauseOrResume, @NotNull d0 sportsGoalSettings, @NotNull r meditationBreathSettings, @NotNull s menstrualCycleSettings, @NotNull d achievementReminderSettings, @NotNull l continueSportRemindSettings, @NotNull o endSportRemindSettings, @NotNull gqc newGoalSettingSelected, @NotNull j0 sunshineDurationSettings, @NotNull v regularEarlyBedtimeSettings) {
        Intrinsics.checkNotNullParameter(stepGoal, "stepGoal");
        Intrinsics.checkNotNullParameter(calorieGoal, "calorieGoal");
        Intrinsics.checkNotNullParameter(exerciseTimeGoal, "exerciseTimeGoal");
        Intrinsics.checkNotNullParameter(activityGoal, "activityGoal");
        Intrinsics.checkNotNullParameter(sedentary, "sedentary");
        Intrinsics.checkNotNullParameter(activityNotification, "activityNotification");
        Intrinsics.checkNotNullParameter(fallDown, "fallDown");
        Intrinsics.checkNotNullParameter(autoMeasureHeartRate, "autoMeasureHeartRate");
        Intrinsics.checkNotNullParameter(quietHeartRate, "quietHeartRate");
        Intrinsics.checkNotNullParameter(sportsHeartRate, "sportsHeartRate");
        Intrinsics.checkNotNullParameter(afib, "afib");
        Intrinsics.checkNotNullParameter(bloodSugar, "bloodSugar");
        Intrinsics.checkNotNullParameter(stressAutoMeasure, "stressAutoMeasure");
        Intrinsics.checkNotNullParameter(breatheRelax, "breatheRelax");
        Intrinsics.checkNotNullParameter(spo2AllDayMonitor, "spo2AllDayMonitor");
        Intrinsics.checkNotNullParameter(wristTemperature, "wristTemperature");
        Intrinsics.checkNotNullParameter(osa, "osa");
        Intrinsics.checkNotNullParameter(spo2, "spo2");
        Intrinsics.checkNotNullParameter(breatheRate, "breatheRate");
        Intrinsics.checkNotNullParameter(sleepRem, "sleepRem");
        Intrinsics.checkNotNullParameter(sportsAutoPause, "sportsAutoPause");
        Intrinsics.checkNotNullParameter(sportsAutoRecognize, "sportsAutoRecognize");
        Intrinsics.checkNotNullParameter(sportsVoiceBroadcast, "sportsVoiceBroadcast");
        Intrinsics.checkNotNullParameter(doubleClickVoiceBroadcast, "doubleClickVoiceBroadcast");
        Intrinsics.checkNotNullParameter(buttonToPauseOrResume, "buttonToPauseOrResume");
        Intrinsics.checkNotNullParameter(sportsGoalSettings, "sportsGoalSettings");
        Intrinsics.checkNotNullParameter(meditationBreathSettings, "meditationBreathSettings");
        Intrinsics.checkNotNullParameter(menstrualCycleSettings, "menstrualCycleSettings");
        Intrinsics.checkNotNullParameter(achievementReminderSettings, "achievementReminderSettings");
        Intrinsics.checkNotNullParameter(continueSportRemindSettings, "continueSportRemindSettings");
        Intrinsics.checkNotNullParameter(endSportRemindSettings, "endSportRemindSettings");
        Intrinsics.checkNotNullParameter(newGoalSettingSelected, "newGoalSettingSelected");
        Intrinsics.checkNotNullParameter(sunshineDurationSettings, "sunshineDurationSettings");
        Intrinsics.checkNotNullParameter(regularEarlyBedtimeSettings, "regularEarlyBedtimeSettings");
        this.stepGoal = stepGoal;
        this.calorieGoal = calorieGoal;
        this.exerciseTimeGoal = exerciseTimeGoal;
        this.activityGoal = activityGoal;
        this.sedentary = sedentary;
        this.activityNotification = activityNotification;
        this.fallDown = fallDown;
        this.autoMeasureHeartRate = autoMeasureHeartRate;
        this.quietHeartRate = quietHeartRate;
        this.sportsHeartRate = sportsHeartRate;
        this.afib = afib;
        this.bloodSugar = bloodSugar;
        this.stressAutoMeasure = stressAutoMeasure;
        this.breatheRelax = breatheRelax;
        this.spo2AllDayMonitor = spo2AllDayMonitor;
        this.wristTemperature = wristTemperature;
        this.osa = osa;
        this.spo2 = spo2;
        this.breatheRate = breatheRate;
        this.sleepRem = sleepRem;
        this.sportsAutoPause = sportsAutoPause;
        this.sportsAutoRecognize = sportsAutoRecognize;
        this.sportsVoiceBroadcast = sportsVoiceBroadcast;
        this.doubleClickVoiceBroadcast = doubleClickVoiceBroadcast;
        this.buttonToPauseOrResume = buttonToPauseOrResume;
        this.sportsGoalSettings = sportsGoalSettings;
        this.meditationBreathSettings = meditationBreathSettings;
        this.menstrualCycleSettings = menstrualCycleSettings;
        this.achievementReminderSettings = achievementReminderSettings;
        this.continueSportRemindSettings = continueSportRemindSettings;
        this.endSportRemindSettings = endSportRemindSettings;
        this.newGoalSettingSelected = newGoalSettingSelected;
        this.sunshineDurationSettings = sunshineDurationSettings;
        this.regularEarlyBedtimeSettings = regularEarlyBedtimeSettings;
    }

    public /* synthetic */ DeviceSettings(g0 g0Var, k kVar, p pVar, e eVar, x xVar, f fVar, q qVar, g gVar, u uVar, e0 e0Var, a aVar, ct1 ct1Var, h0 h0Var, i iVar, z zVar, f4m f4mVar, t tVar, a0 a0Var, h hVar, y yVar, SportsAutoPauseSettings sportsAutoPauseSettings, c0 c0Var, f0 f0Var, n nVar, j jVar, d0 d0Var, r rVar, s sVar, d dVar, l lVar, o oVar, gqc gqcVar, j0 j0Var, v vVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new g0() : g0Var, (i & 2) != 0 ? new k() : kVar, (i & 4) != 0 ? new p() : pVar, (i & 8) != 0 ? new e() : eVar, (i & 16) != 0 ? new x() : xVar, (i & 32) != 0 ? new f() : fVar, (i & 64) != 0 ? new q() : qVar, (i & 128) != 0 ? new g() : gVar, (i & 256) != 0 ? new u() : uVar, (i & 512) != 0 ? new e0() : e0Var, (i & 1024) != 0 ? new a() : aVar, (i & 2048) != 0 ? new ct1() : ct1Var, (i & 4096) != 0 ? new h0() : h0Var, (i & 8192) != 0 ? new i() : iVar, (i & 16384) != 0 ? new z() : zVar, (i & 32768) != 0 ? new f4m() : f4mVar, (i & 65536) != 0 ? new t() : tVar, (i & 131072) != 0 ? new a0() : a0Var, (i & 262144) != 0 ? new h() : hVar, (i & 524288) != 0 ? new y() : yVar, (i & 1048576) != 0 ? new SportsAutoPauseSettings() : sportsAutoPauseSettings, (i & 2097152) != 0 ? new c0() : c0Var, (i & 4194304) != 0 ? new f0() : f0Var, (i & 8388608) != 0 ? new n() : nVar, (i & 16777216) != 0 ? new j() : jVar, (i & 33554432) != 0 ? new d0() : d0Var, (i & 67108864) != 0 ? new r() : rVar, (i & 134217728) != 0 ? new s() : sVar, (i & 268435456) != 0 ? new d() : dVar, (i & 536870912) != 0 ? new l() : lVar, (i & 1073741824) != 0 ? new o() : oVar, (i & Integer.MIN_VALUE) != 0 ? new gqc() : gqcVar, (i2 & 1) != 0 ? new j0() : j0Var, (i2 & 2) != 0 ? new v() : vVar);
    }
}
