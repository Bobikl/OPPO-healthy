package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengineservice.db.table.DBSleepIndex;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u001dJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H&J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H&J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H&J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H&J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\u0013H&J\u0016\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0004H&¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/yn9;", "", "Landroid/content/Context;", "b", "", MapSchema.FIELD_NAME_ENTRY, "", "s", "isDebug", "j", "tag", "Ljava/util/concurrent/ExecutorService;", "c", "u", "", "threadCounts", "Ljava/util/concurrent/Executor;", LogFieldKey.PROCESS_NAME_KEY, "message", "", b2n.g, MapSchema.FIELD_NAME_KEY, "t", b2n.f, "v", "", "Lcom/heytap/databaseengineservice/db/table/DBSleepIndex;", "dbSleepIndexList", "Lcom/heytap/databaseengine/model/SleepIndex;", "a", EngineConstant.REASON, LogFieldKey.LEVEL_KEY, "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface yn9 {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H&J(\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H&JH\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH&J \u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H&J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H&¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/yn9$a;", "", "pageId", "moduleId", vik.TAG_POSTION1, "", "f", "", oea.FEATURE_API_REQUEST, "", TriggerEvent.EXTRA_UID, "statusCode", Fields.SDK_VERSION, "q", "d", "msg", "i", "n", "clientDataId", t04.DEVICE_UNIQUE_ID, "deviceType", "startTimestamp", "endTimestamp", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "version", "source", "o", "dataUid", "dataClient", "dbUid", "r", LogFieldKey.MESSAGE_KEY, "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void d();

        void f(@NotNull Object pageId, @NotNull Object moduleId, @NotNull Object position1);

        void i(@NotNull String msg);

        void m(@NotNull String msg);

        void n(@NotNull String msg);

        void o(@NotNull String clientDataId, @NotNull String deviceUniqueId, @NotNull String deviceType, int startTimestamp, int endTimestamp, int sportMode, int version, int source);

        void q(@NotNull String api, int uid, @NotNull String statusCode, @NotNull String sdkVersion);

        void r(@NotNull String dataUid, @NotNull String dataClient, @NotNull String dbUid);
    }

    @NotNull
    SleepIndex a(@NotNull List<? extends DBSleepIndex> dbSleepIndexList);

    @NotNull
    Context b();

    @NotNull
    ExecutorService c(@NotNull String tag);

    @NotNull
    String e();

    void g(@NotNull String tag, @NotNull String message);

    void h(@NotNull String tag, @NotNull String message);

    boolean isDebug();

    @Nullable
    String j();

    void k(@NotNull String tag, @NotNull String message);

    void l(@NotNull String reason);

    @NotNull
    Executor p(@NotNull String tag, int threadCounts);

    boolean s();

    void t(@NotNull String tag, @NotNull String message);

    @NotNull
    ExecutorService u(@NotNull String tag);

    void v();
}
