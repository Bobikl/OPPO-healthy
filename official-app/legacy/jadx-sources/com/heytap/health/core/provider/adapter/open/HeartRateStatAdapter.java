package com.heytap.health.core.provider.adapter.open;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.core.provider.auth.AuthorityScopeType;
import com.heytap.health.core.provider.model.HeartRateStatModel;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.aj4;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.sc8;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010\t\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J7\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/heytap/health/core/provider/adapter/open/HeartRateStatAdapter;", "Lcom/oplus/aiunit/vision/aj4;", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "f", "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/content/ContentValues;", "values", "", MapSchema.FIELD_NAME_ENTRY, "", b2n.g, "(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "b", "(Ljava/lang/String;[Ljava/lang/String;)I", b2n.f, "Lcom/heytap/health/core/provider/model/HeartRateStatModel;", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_KEY, "()Lcom/heytap/health/core/provider/model/HeartRateStatModel;", "heartRateStatModel", "Landroid/content/ContentProvider;", "contentProvider", "<init>", "(Landroid/content/ContentProvider;)V", "Companion", "a", "HeartRateStatData", "operations_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeartRateStatAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateStatAdapter.kt\ncom/heytap/health/core/provider/adapter/open/HeartRateStatAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n1549#2:225\n1620#2,3:226\n*S KotlinDebug\n*F\n+ 1 HeartRateStatAdapter.kt\ncom/heytap/health/core/provider/adapter/open/HeartRateStatAdapter\n*L\n174#1:225\n174#1:226,3\n*E\n"})
public final class HeartRateStatAdapter extends aj4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy heartRateStatModel;

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, d2 = {"Lcom/heytap/health/core/provider/adapter/open/HeartRateStatAdapter$HeartRateStatData;", "", "date", "", "avg", "max", "min", "walk", "rest", "sleepBase", "(IIIIIII)V", "getAvg", "()I", "setAvg", "(I)V", "getDate", "setDate", "getMax", "setMax", "getMin", "setMin", "getRest", "setRest", "getSleepBase", "setSleepBase", "getWalk", "setWalk", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HeartRateStatData {
        private int avg;
        private int date;
        private int max;
        private int min;
        private int rest;
        private int sleepBase;
        private int walk;

        public HeartRateStatData(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.date = i;
            this.avg = i2;
            this.max = i3;
            this.min = i4;
            this.walk = i5;
            this.rest = i6;
            this.sleepBase = i7;
        }

        public static /* synthetic */ HeartRateStatData copy$default(HeartRateStatData heartRateStatData, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i = heartRateStatData.date;
            }
            if ((i8 & 2) != 0) {
                i2 = heartRateStatData.avg;
            }
            int i9 = i2;
            if ((i8 & 4) != 0) {
                i3 = heartRateStatData.max;
            }
            int i10 = i3;
            if ((i8 & 8) != 0) {
                i4 = heartRateStatData.min;
            }
            int i11 = i4;
            if ((i8 & 16) != 0) {
                i5 = heartRateStatData.walk;
            }
            int i12 = i5;
            if ((i8 & 32) != 0) {
                i6 = heartRateStatData.rest;
            }
            int i13 = i6;
            if ((i8 & 64) != 0) {
                i7 = heartRateStatData.sleepBase;
            }
            return heartRateStatData.copy(i, i9, i10, i11, i12, i13, i7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getAvg() {
            return this.avg;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getWalk() {
            return this.walk;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getRest() {
            return this.rest;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getSleepBase() {
            return this.sleepBase;
        }

        @NotNull
        public final HeartRateStatData copy(int date, int avg, int max, int min, int walk, int rest, int sleepBase) {
            return new HeartRateStatData(date, avg, max, min, walk, rest, sleepBase);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeartRateStatData)) {
                return false;
            }
            HeartRateStatData heartRateStatData = (HeartRateStatData) other;
            return this.date == heartRateStatData.date && this.avg == heartRateStatData.avg && this.max == heartRateStatData.max && this.min == heartRateStatData.min && this.walk == heartRateStatData.walk && this.rest == heartRateStatData.rest && this.sleepBase == heartRateStatData.sleepBase;
        }

        public final int getAvg() {
            return this.avg;
        }

        public final int getDate() {
            return this.date;
        }

        public final int getMax() {
            return this.max;
        }

        public final int getMin() {
            return this.min;
        }

        public final int getRest() {
            return this.rest;
        }

        public final int getSleepBase() {
            return this.sleepBase;
        }

        public final int getWalk() {
            return this.walk;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.date) * 31) + Integer.hashCode(this.avg)) * 31) + Integer.hashCode(this.max)) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.walk)) * 31) + Integer.hashCode(this.rest)) * 31) + Integer.hashCode(this.sleepBase);
        }

        public final void setAvg(int i) {
            this.avg = i;
        }

        public final void setDate(int i) {
            this.date = i;
        }

        public final void setMax(int i) {
            this.max = i;
        }

        public final void setMin(int i) {
            this.min = i;
        }

        public final void setRest(int i) {
            this.rest = i;
        }

        public final void setSleepBase(int i) {
            this.sleepBase = i;
        }

        public final void setWalk(int i) {
            this.walk = i;
        }

        @NotNull
        public String toString() {
            return "HeartRateStatData(date=" + this.date + ", avg=" + this.avg + ", max=" + this.max + ", min=" + this.min + ", walk=" + this.walk + ", rest=" + this.rest + ", sleepBase=" + this.sleepBase + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.core.provider.adapter.open.HeartRateStatAdapter$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/heytap/health/core/provider/adapter/open/HeartRateStatAdapter$a;", "", "Landroid/content/Context;", "context", "", "a", "", "COLUMN_ITEM", "Ljava/lang/String;", "TAG", "URL", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHeartRateStatAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateStatAdapter.kt\ncom/heytap/health/core/provider/adapter/open/HeartRateStatAdapter$Companion\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,224:1\n29#2:225\n*S KotlinDebug\n*F\n+ 1 HeartRateStatAdapter.kt\ncom/heytap/health/core/provider/adapter/open/HeartRateStatAdapter$Companion\n*L\n55#1:225\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@Nullable Context context) {
            if (context != null) {
                a7b.f("HeartRateStatAdapter", "update HeartRateStatData provider");
                try {
                    context.getApplicationContext().getContentResolver().update(Uri.parse("content://com.heytap.health.sporthealthprovider/open/heartRateStat"), null, null, null);
                } catch (Exception e2) {
                    a7b.b("HeartRateStatAdapter", "update HeartRateStatData provider e = :" + e2.getMessage());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public HeartRateStatAdapter(@Nullable ContentProvider contentProvider) {
        super(contentProvider);
        this.heartRateStatModel = LazyKt__LazyJVMKt.lazy(new Function0<HeartRateStatModel>() { // from class: com.heytap.health.core.provider.adapter.open.HeartRateStatAdapter$heartRateStatModel$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final HeartRateStatModel invoke() {
                return new HeartRateStatModel();
            }
        });
    }

    @Override // com.oplus.aiunit.vision.f74
    public int b(@Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.f74
    public boolean e(@Nullable ContentValues values) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.oplus.aiunit.vision.f74
    @NotNull
    public Cursor f(@Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        int i = "endTime";
        a7b.f("HeartRateStatAdapter", "query heartRateStat, selection: " + selection);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"heartRateStatData"}, 1);
        Bundle bundle = new Bundle();
        try {
            if (TextUtils.isEmpty(selection)) {
                HeartRateStatData heartRateStatData = (HeartRateStatData) BuildersKt__BuildersKt.runBlocking$default(null, new HeartRateStatAdapter$query$todayData$1(this, null), 1, null);
                if (heartRateStatData != null) {
                    String json = sc8.g(heartRateStatData);
                    bundle.putInt("code", 1);
                    bundle.putString(DBHealthReviewPlan.DESC, "query today heartRateStat success");
                    bundle.putString("heartRateStatData", json);
                    Intrinsics.checkNotNullExpressionValue(json, "json");
                    matrixCursor.addRow(new Object[]{json});
                } else {
                    String json2 = sc8.g(new HeartRateStatData(Integer.parseInt(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"))), 0, 0, 0, 0, 0, 0));
                    bundle.putInt("code", 1);
                    bundle.putString(DBHealthReviewPlan.DESC, "query today heartRateStat success, but no data");
                    bundle.putString("heartRateStatData", json2);
                    Intrinsics.checkNotNullExpressionValue(json2, "json");
                    matrixCursor.addRow(new Object[]{json2});
                }
            } else {
                try {
                    try {
                        JsonObject asJsonObject = new JsonParser().parse(selection).getAsJsonObject();
                        Intrinsics.checkNotNullExpressionValue(asJsonObject, "{\n                    Js…nObject\n                }");
                        if (!asJsonObject.has("startTime")) {
                            a7b.b("HeartRateStatAdapter", "startTime is missing");
                            bundle.putInt("code", 0);
                            bundle.putInt("subCode", 1003);
                            bundle.putString(DBHealthReviewPlan.DESC, "param is illegal, startTime is required");
                            matrixCursor.setExtras(bundle);
                            return matrixCursor;
                        }
                        long asLong = asJsonObject.get("startTime").getAsLong();
                        try {
                            if (!asJsonObject.has("endTime")) {
                                a7b.b("HeartRateStatAdapter", "endTime is missing");
                                bundle.putInt("code", 0);
                                bundle.putInt("subCode", 1003);
                                bundle.putString(DBHealthReviewPlan.DESC, "param is illegal, endTime is required");
                                matrixCursor.setExtras(bundle);
                                return matrixCursor;
                            }
                            long asLong2 = asJsonObject.get("endTime").getAsLong();
                            StringBuilder sb = new StringBuilder();
                            sb.append("query heartRateStat data, startTime: ");
                            sb.append(asLong);
                            sb.append(", endTime: ");
                            sb.append(asLong2);
                            if (asLong2 < asLong) {
                                bundle.putInt("code", 0);
                                bundle.putInt("subCode", 1003);
                                bundle.putString(DBHealthReviewPlan.DESC, "param is illegal, endTime should not be less than startTime");
                                matrixCursor.setExtras(bundle);
                                return matrixCursor;
                            }
                            List list = (List) BuildersKt__BuildersKt.runBlocking$default(null, new HeartRateStatAdapter$query$dataList$1(bundle, this, asLong, asLong2, null), 1, null);
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(sc8.g((HeartRateStatData) it.next()));
                            }
                            bundle.putInt("code", 1);
                            bundle.putString(DBHealthReviewPlan.DESC, "query heartRateStat list success, size: " + list.size());
                            matrixCursor.addRow(new Object[]{arrayList});
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            a7b.b("HeartRateStatAdapter", "query Exception: " + e.getMessage());
                            bundle.putInt("code", i);
                            bundle.putInt("subCode", 1002);
                            bundle.putString(DBHealthReviewPlan.DESC, "Exception: " + e.getMessage());
                        }
                    } catch (Exception e3) {
                        a7b.b("HeartRateStatAdapter", "parse selection error: " + e3.getMessage());
                        bundle.putInt("code", 0);
                        bundle.putInt("subCode", 1003);
                        bundle.putString(DBHealthReviewPlan.DESC, "param is illegal, selection should be a valid JSON with startTime and endTime");
                        matrixCursor.setExtras(bundle);
                        return matrixCursor;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            }
        } catch (Exception e5) {
            e = e5;
            i = 0;
        }
        matrixCursor.setExtras(bundle);
        return matrixCursor;
    }

    @Override // com.oplus.aiunit.vision.f74
    @NotNull
    public String g() {
        String readHeartRate = AuthorityScopeType.getReadHeartRate();
        Intrinsics.checkNotNullExpressionValue(readHeartRate, "getReadHeartRate()");
        return readHeartRate;
    }

    @Override // com.oplus.aiunit.vision.f74
    public int h(@Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 1;
    }

    public final HeartRateStatModel k() {
        return (HeartRateStatModel) this.heartRateStatModel.getValue();
    }
}
