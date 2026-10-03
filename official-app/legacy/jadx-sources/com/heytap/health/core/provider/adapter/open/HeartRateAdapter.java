package com.heytap.health.core.provider.adapter.open;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.health.core.provider.model.HeartRateModel;
import com.heytap.health.device_data_sync.data_sync.IDataSyncService;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.aj4;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0011\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*JG\u0010\t\u001a\u00020\b2\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J5\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006."}, d2 = {"Lcom/heytap/health/core/provider/adapter/open/HeartRateAdapter;", "Lcom/oplus/aiunit/vision/aj4;", "", "", "projection", "selection", "selectionArgs", "sortOrde", "Landroid/database/Cursor;", "f", "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/content/ContentValues;", "values", "", MapSchema.FIELD_NAME_ENTRY, "", b2n.g, "(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "b", "(Ljava/lang/String;[Ljava/lang/String;)I", b2n.f, "Landroid/database/MatrixCursor;", "matrixCursor", LogFieldKey.LEVEL_KEY, "", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/core/provider/model/HeartRateModel;", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_KEY, "()Lcom/heytap/health/core/provider/model/HeartRateModel;", "heartRateModel", "Lcom/heytap/health/device_data_sync/data_sync/IDataSyncService;", "c", "Lcom/heytap/health/device_data_sync/data_sync/IDataSyncService;", "mDataSyncService", "", "d", "J", "lastWatchDataUpdateTime", "Landroid/content/ContentProvider;", "contentProvider", "<init>", "(Landroid/content/ContentProvider;)V", "Companion", "a", "HeartRateData", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class HeartRateAdapter extends aj4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "HeartRateAdapter";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy heartRateModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IDataSyncService mDataSyncService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long lastWatchDataUpdateTime;

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/core/provider/adapter/open/HeartRateAdapter$HeartRateData;", "", "value", "", SpeechConstant.KEY_TTS_TIMESTAMP, "", "(IJ)V", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "getValue", "()I", "setValue", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HeartRateData {
        private long timeStamp;
        private int value;

        public HeartRateData(int i, long j2) {
            this.value = i;
            this.timeStamp = j2;
        }

        public static /* synthetic */ HeartRateData copy$default(HeartRateData heartRateData, int i, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = heartRateData.value;
            }
            if ((i2 & 2) != 0) {
                j2 = heartRateData.timeStamp;
            }
            return heartRateData.copy(i, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimeStamp() {
            return this.timeStamp;
        }

        @NotNull
        public final HeartRateData copy(int value, long timeStamp) {
            return new HeartRateData(value, timeStamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeartRateData)) {
                return false;
            }
            HeartRateData heartRateData = (HeartRateData) other;
            return this.value == heartRateData.value && this.timeStamp == heartRateData.timeStamp;
        }

        public final long getTimeStamp() {
            return this.timeStamp;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (Integer.hashCode(this.value) * 31) + Long.hashCode(this.timeStamp);
        }

        public final void setTimeStamp(long j2) {
            this.timeStamp = j2;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        @NotNull
        public String toString() {
            return "HeartRateData(value=" + this.value + ", timeStamp=" + this.timeStamp + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.core.provider.adapter.open.HeartRateAdapter$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/core/provider/adapter/open/HeartRateAdapter$a;", "", "Landroid/content/Context;", "context", "", "a", "", "COLUMN_ITEM", "Ljava/lang/String;", "READ_SCOPE", "", "SYNC_INTERVAL", "I", "TAG", "URL", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@Nullable Context context) {
            if (context != null) {
                a7b.f(HeartRateAdapter.TAG, "updateSportData");
                try {
                    context.getApplicationContext().getContentResolver().update(Uri.parse("content://com.heytap.health.sporthealthprovider/open/heartRate"), null, null, null);
                } catch (Exception e2) {
                    a7b.b(HeartRateAdapter.TAG, "updateSportData e = :" + e2.getMessage());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public HeartRateAdapter(@Nullable ContentProvider contentProvider) {
        super(contentProvider);
        this.heartRateModel = LazyKt__LazyJVMKt.lazy(new Function0<HeartRateModel>() { // from class: com.heytap.health.core.provider.adapter.open.HeartRateAdapter$heartRateModel$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final HeartRateModel invoke() {
                return new HeartRateModel();
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

    @Override // com.oplus.aiunit.vision.f74
    @NotNull
    public Cursor f(@Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrde) {
        a7b.f(TAG, SearchIntents.EXTRA_QUERY);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"lastHeartRate"}, 1);
        if (projection != null) {
            if (!(projection.length == 0)) {
                String str = projection[0];
                a7b.f(TAG, "query firstItem:" + str);
                if (TextUtils.equals(str, "lastHeartRate")) {
                    m();
                    return l(matrixCursor);
                }
            }
        }
        return matrixCursor;
    }

    @Override // com.oplus.aiunit.vision.f74
    @NotNull
    public String g() {
        return "READ_HEART_RATE";
    }

    @Override // com.oplus.aiunit.vision.f74
    public int h(@Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 1;
    }

    public final HeartRateModel k() {
        return (HeartRateModel) this.heartRateModel.getValue();
    }

    public final Cursor l(MatrixCursor matrixCursor) {
        return (Cursor) BuildersKt__BuildersKt.runBlocking$default(null, new HeartRateAdapter$queryLastData$1(matrixCursor, this, null), 1, null);
    }

    public final void m() {
        if (System.currentTimeMillis() - this.lastWatchDataUpdateTime >= 300000) {
            if (this.mDataSyncService == null) {
                this.mDataSyncService = (IDataSyncService) x0.d().h(IDataSyncService.class);
            }
            this.lastWatchDataUpdateTime = System.currentTimeMillis();
            IDataSyncService iDataSyncService = this.mDataSyncService;
            if (iDataSyncService != null) {
                iDataSyncService.C1(9, 2);
            }
        }
    }
}
