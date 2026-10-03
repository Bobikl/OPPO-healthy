package com.oplus.nearx.track.internal.storage.db.common.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.t15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@s15(tableName = "app_ids")
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0014\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppIds;", "", "", "_id", "J", "get_id", "()J", "set_id", "(J)V", "appId", "getAppId", "setAppId", "createTime", "getCreateTime", "setCreateTime", "updateTime", "getUpdateTime", "setUpdateTime", "<init>", "(JJJJ)V", "Companion", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class AppIds {

    @NotNull
    public static final String APP_ID = "app_id";

    @NotNull
    public static final String CREATE_TIME = "create_time";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "_id";

    @NotNull
    public static final String UPDATE_TIME = "update_time";
    private long _id;

    @t15
    private long appId;

    @t15
    private long createTime;

    @t15
    private long updateTime;

    /* JADX INFO: renamed from: com.oplus.nearx.track.internal.storage.db.common.entity.AppIds$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppIds$a;", "", "Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppIds;", "appIds", "Lorg/json/JSONObject;", "b", "", "jsonString", "a", "APP_ID", "Ljava/lang/String;", "CREATE_TIME", alf.ID, "UPDATE_TIME", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AppIds a(@NotNull String jsonString) {
            Object objM5287constructorimpl;
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            try {
                Result.Companion companion = Result.INSTANCE;
                JSONObject jSONObject = new JSONObject(jsonString);
                objM5287constructorimpl = Result.m5287constructorimpl(new AppIds(jSONObject.optLong("_id"), jSONObject.optLong("appId"), jSONObject.optLong("createTime"), jSONObject.optLong("updateTime")));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
                objM5287constructorimpl = null;
            }
            return (AppIds) objM5287constructorimpl;
        }

        @NotNull
        public final JSONObject b(@NotNull AppIds appIds) throws JSONException {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_id", appIds.get_id());
            jSONObject.put("appId", appIds.getAppId());
            jSONObject.put("createTime", appIds.getCreateTime());
            jSONObject.put("updateTime", appIds.getUpdateTime());
            return jSONObject;
        }
    }

    public AppIds() {
        this(0L, 0L, 0L, 0L, 15, null);
    }

    public final long getAppId() {
        return this.appId;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long get_id() {
        return this._id;
    }

    public final void setAppId(long j2) {
        this.appId = j2;
    }

    public final void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public final void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public final void set_id(long j2) {
        this._id = j2;
    }

    public AppIds(long j2, long j3, long j4, long j5) {
        this._id = j2;
        this.appId = j3;
        this.createTime = j4;
        this.updateTime = j5;
    }

    public /* synthetic */ AppIds(long j2, long j3, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? 0L : j4, (i & 8) != 0 ? 0L : j5);
    }
}
