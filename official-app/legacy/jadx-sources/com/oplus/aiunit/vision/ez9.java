package com.oplus.aiunit.vision;

import com.heytap.health.operation.medal.runninghall.RunningHallMedalListAct;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\bf\u0018\u0000  2\u00020\u0001:\u0001!R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/ez9;", "", "", "get_id", "()J", "set_id", "(J)V", "_id", "", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "data", "getEventTime", "setEventTime", sbe.PAY_SDK_EVENT_TIME, "", "getNetType", "()I", "netType", "", "isRealTime", "()Z", "getUploadType", "uploadType", "getEncryptType", "encryptType", "getDataType", y15.PARAMS_DATA_TYPE, "getEventCacheStatus", "eventCacheStatus", "Companion", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public interface ez9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String DATA = "data";

    @NotNull
    public static final String DB_COL_NAME_DATA_TYPE = "data_type";

    @NotNull
    public static final String DB_COL_NAME_EVENT_CACHE_STATUS = "event_cache_status";

    @NotNull
    public static final String DB_COL_NAME_EVENT_TIME = "event_time";

    @NotNull
    public static final String ID = "_id";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ez9$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/ez9$a;", "", "", alf.ID, "Ljava/lang/String;", RunningHallMedalListAct.b.SHARE_DATA, "DB_COL_NAME_EVENT_TIME", "DB_COL_NAME_DATA_TYPE", "DB_COL_NAME_EVENT_CACHE_STATUS", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        @NotNull
        public static final String DATA = "data";

        @NotNull
        public static final String DB_COL_NAME_DATA_TYPE = "data_type";

        @NotNull
        public static final String DB_COL_NAME_EVENT_CACHE_STATUS = "event_cache_status";

        @NotNull
        public static final String DB_COL_NAME_EVENT_TIME = "event_time";

        @NotNull
        public static final String ID = "_id";
        public static final /* synthetic */ Companion a = new Companion();
    }

    @NotNull
    String getData();

    int getDataType();

    int getEncryptType();

    int getEventCacheStatus();

    long getEventTime();

    int getNetType();

    int getUploadType();

    long get_id();

    boolean isRealTime();
}
