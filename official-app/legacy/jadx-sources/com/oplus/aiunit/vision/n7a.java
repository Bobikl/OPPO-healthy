package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.databaseengineservice.db.table.datacollection.DataCollection;
import io.protostuff.MapSchema;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/n7a;", "", "Companion", "a", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class n7a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.n7a$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007J\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/n7a$a;", "", "", DataCollection.FIELD, "business", "", "content", "", "startTimestamp", "endTimestamp", "ssoid", "", "c", "latitude", "longitude", MapSchema.FIELD_NAME_ENTRY, "startIndex", "endIndex", "f", "len", b2n.f, "TAG", "Ljava/lang/String;", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.n7a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/n7a$a$a", "Lcom/oplus/aiunit/vision/ao0;", "Lcom/heytap/databaseengine/model/CommonBackBean;", "result", "", "c", "lib_base_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0902a extends ao0<CommonBackBean> {
            @Override // com.oplus.aiunit.vision.ao0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void b(@NotNull CommonBackBean result) {
                Intrinsics.checkNotNullParameter(result, "result");
                a7b.f("InformationStatistics", "insertDataCollection: errorCode = " + result.getErrorCode());
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void d(Companion companion, int i, int i2, String str, long j2, long j3, String str2, int i3, Object obj) {
            String str3;
            long jCurrentTimeMillis = (i3 & 8) != 0 ? System.currentTimeMillis() : j2;
            long jQ = (i3 & 16) != 0 ? v05.q(System.currentTimeMillis()) : j3;
            if ((i3 & 32) != 0) {
                String strD = v9g.w().D("user_ssoid");
                Intrinsics.checkNotNullExpressionValue(strD, "getInstance().getString(…stant.Default.USER_SSOID)");
                str3 = strD;
            } else {
                str3 = str2;
            }
            companion.c(i, i2, str, jCurrentTimeMillis, jQ, str3);
        }

        @JvmStatic
        @JvmOverloads
        public final void a(int i, int i2, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            d(this, i, i2, content, 0L, 0L, null, 56, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void b(int i, int i2, @NotNull String content, long j2, long j3) {
            Intrinsics.checkNotNullParameter(content, "content");
            d(this, i, i2, content, j2, j3, null, 32, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void c(int field, int business, @NotNull String content, long startTimestamp, long endTimestamp, @NotNull String ssoid) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(ssoid, "ssoid");
            String strG = ilj.g();
            Intrinsics.checkNotNullExpressionValue(strG, "getDataClient()");
            com.heytap.databaseengine.model.datacollection.DataCollection dataCollection = new com.heytap.databaseengine.model.datacollection.DataCollection(ssoid, strG, v05.i(endTimestamp), field, business, startTimestamp, RangesKt___RangesKt.coerceAtLeast(endTimestamp, startTimestamp), 1, content);
            ArrayList arrayList = new ArrayList();
            arrayList.add(dataCollection);
            DataInsertOption dataInsertOption = new DataInsertOption();
            dataInsertOption.setDataTable(1068);
            dataInsertOption.setDatas(arrayList);
            SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).subscribe(new C0902a());
        }

        @NotNull
        public final String e(@NotNull String latitude, @NotNull String longitude) {
            Intrinsics.checkNotNullParameter(latitude, "latitude");
            Intrinsics.checkNotNullParameter(longitude, "longitude");
            DecimalFormat decimalFormat = new DecimalFormat("0.000", x05.TIME_FORMAT_LOCALE_CN_SYMBOL);
            return decimalFormat.format(Float.valueOf(Float.parseFloat(longitude))) + "***, " + decimalFormat.format(Float.valueOf(Float.parseFloat(latitude))) + "***";
        }

        @NotNull
        public final String f(@NotNull String content, int startIndex, int endIndex) {
            Intrinsics.checkNotNullParameter(content, "content");
            return (TextUtils.isEmpty(content) || content.length() < endIndex || startIndex >= endIndex) ? content : StringsKt__StringsKt.replaceRange((CharSequence) content, startIndex, endIndex, (CharSequence) g(endIndex - startIndex)).toString();
        }

        public final String g(int len) {
            String str = "";
            for (int i = 0; i < len; i++) {
                str = str + "*";
            }
            return str;
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void a(int i, int i2, @NotNull String str) {
        INSTANCE.a(i, i2, str);
    }

    @JvmStatic
    @JvmOverloads
    public static final void b(int i, int i2, @NotNull String str, long j2, long j3) {
        INSTANCE.b(i, i2, str, j2, j3);
    }
}
