package com.heytap.nearx.taphttp.statitics;

import android.content.SharedPreferences;
import com.heytap.nearx.taphttp.core.HeyCenter;
import com.oplus.aiunit.vision.HttpStatConfig;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.j35;
import com.oplus.aiunit.vision.r7b;
import io.protostuff.MapSchema;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ,2\u00020\u0001:\u0001\u0007B!\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020\"\u0012\b\u0010)\u001a\u0004\u0018\u00010%¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\u0011R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0019\u0010)\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0013\u0010(¨\u0006-"}, d2 = {"Lcom/heytap/nearx/taphttp/statitics/StatRateHelper;", "", "", "b", "", b2n.f, "Ljava/util/Random;", "a", "Lkotlin/Lazy;", "c", "()Ljava/util/Random;", "sampleRandom", "Lcom/oplus/aiunit/vision/r7b;", "Lcom/oplus/aiunit/vision/r7b;", "logger", "", "f", "()Ljava/lang/String;", "yesterdayKey", "d", MapSchema.FIELD_NAME_ENTRY, "todayKey", "", "I", "getTodayRecords", "()I", "setTodayRecords", "(I)V", "todayRecords", "Lcom/heytap/nearx/taphttp/core/HeyCenter;", "Lcom/heytap/nearx/taphttp/core/HeyCenter;", "getHeyCenter", "()Lcom/heytap/nearx/taphttp/core/HeyCenter;", "heyCenter", "Lcom/oplus/aiunit/vision/lk9;", "Lcom/oplus/aiunit/vision/lk9;", "heyConfig", "Landroid/content/SharedPreferences;", b2n.g, "Landroid/content/SharedPreferences;", "()Landroid/content/SharedPreferences;", "spConfig", "<init>", "(Lcom/heytap/nearx/taphttp/core/HeyCenter;Lcom/oplus/aiunit/vision/lk9;Landroid/content/SharedPreferences;)V", "Companion", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class StatRateHelper {
    public static final int MAX_RECORDS_NUM = 200000;

    @NotNull
    public static final String RECORD_NUM = "records_nums";

    @NotNull
    public static final String TAG = "StatRateHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Lazy sampleRandom;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final r7b logger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Lazy yesterdayKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Lazy todayKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int todayRecords;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final HeyCenter heyCenter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final HttpStatConfig heyConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final SharedPreferences spConfig;

    public StatRateHelper(@NotNull HeyCenter heyCenter, @NotNull HttpStatConfig heyConfig, @Nullable SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(heyCenter, "heyCenter");
        Intrinsics.checkNotNullParameter(heyConfig, "heyConfig");
        this.heyCenter = heyCenter;
        this.heyConfig = heyConfig;
        this.spConfig = sharedPreferences;
        this.sampleRandom = LazyKt__LazyJVMKt.lazy(new Function0<Random>() { // from class: com.heytap.nearx.taphttp.statitics.StatRateHelper$sampleRandom$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Random invoke() {
                return new Random();
            }
        });
        this.logger = heyCenter.getLogger();
        this.yesterdayKey = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.nearx.taphttp.statitics.StatRateHelper$yesterdayKey$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "records_nums_" + new SimpleDateFormat("yyyyMMdd").format(new Date(new Date().getTime() - ((long) 86400000))).toString();
            }
        });
        this.todayKey = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.nearx.taphttp.statitics.StatRateHelper$todayKey$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                SharedPreferences.Editor editorEdit;
                SharedPreferences.Editor editorRemove;
                SharedPreferences spConfig = this.this$0.getSpConfig();
                if (spConfig != null && (editorEdit = spConfig.edit()) != null && (editorRemove = editorEdit.remove(this.this$0.f())) != null) {
                    editorRemove.apply();
                }
                return "records_nums_" + new SimpleDateFormat("yyyyMMdd").format(new Date()).toString();
            }
        });
        this.todayRecords = j35.a(sharedPreferences != null ? Integer.valueOf(sharedPreferences.getInt(e(), 0)) : null);
    }

    public final boolean b() {
        if (!this.heyConfig.getEnable()) {
            return false;
        }
        if (c().nextInt(100) + 1 > (this.heyConfig.getSampleRatio() > 100 ? 100 : this.heyConfig.getSampleRatio())) {
            r7b.l(this.logger, TAG, "ignore record by sample ratio is " + this.heyConfig.getSampleRatio(), null, null, 12, null);
            return false;
        }
        int i = this.todayRecords;
        if (i >= 200000) {
            r7b.l(this.logger, TAG, "ignore record by today record", null, null, 12, null);
            return false;
        }
        this.todayRecords = i + 1;
        return true;
    }

    public final Random c() {
        return (Random) this.sampleRandom.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SharedPreferences getSpConfig() {
        return this.spConfig;
    }

    public final String e() {
        return (String) this.todayKey.getValue();
    }

    public final String f() {
        return (String) this.yesterdayKey.getValue();
    }

    public final void g() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences sharedPreferences = this.spConfig;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutInt = editorEdit.putInt(e(), this.todayRecords)) == null) {
            return;
        }
        editorPutInt.apply();
    }
}
