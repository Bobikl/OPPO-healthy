package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/CervicalSpineHistoryRsp;", "", "()V", "dataList", "", "Lcom/heytap/health/cervical_vertebra/bean/CervicalSpineHistoryRsp$CervicalSpineDetail;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "resultCode", "", "getResultCode", "()I", "setResultCode", "(I)V", "toString", "", "CervicalSpineDetail", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CervicalSpineHistoryRsp {

    /* JADX INFO: renamed from: dataList, reason: from kotlin metadata and from toString */
    @Nullable
    private List<CervicalSpineDetail> data;
    private boolean hasMore;
    private int resultCode;

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/CervicalSpineHistoryRsp$CervicalSpineDetail;", "", "()V", "badDuration", "", "getBadDuration", "()I", "setBadDuration", "(I)V", "endTime", "getEndTime", "setEndTime", "goodDuration", "getGoodDuration", "setGoodDuration", "mildDuration", "getMildDuration", "setMildDuration", "model", "", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "startTime", "getStartTime", "setStartTime", TriggerEvent.EXTRA_UID, "getUid", "setUid", "toString", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CervicalSpineDetail {
        private int badDuration;
        private int endTime;
        private int goodDuration;
        private int mildDuration;

        @Nullable
        private String model;
        private int startTime;

        @Nullable
        private String uid;

        public final int getBadDuration() {
            return this.badDuration;
        }

        public final int getEndTime() {
            return this.endTime;
        }

        public final int getGoodDuration() {
            return this.goodDuration;
        }

        public final int getMildDuration() {
            return this.mildDuration;
        }

        @Nullable
        public final String getModel() {
            return this.model;
        }

        public final int getStartTime() {
            return this.startTime;
        }

        @Nullable
        public final String getUid() {
            return this.uid;
        }

        public final void setBadDuration(int i) {
            this.badDuration = i;
        }

        public final void setEndTime(int i) {
            this.endTime = i;
        }

        public final void setGoodDuration(int i) {
            this.goodDuration = i;
        }

        public final void setMildDuration(int i) {
            this.mildDuration = i;
        }

        public final void setModel(@Nullable String str) {
            this.model = str;
        }

        public final void setStartTime(int i) {
            this.startTime = i;
        }

        public final void setUid(@Nullable String str) {
            this.uid = str;
        }

        @NotNull
        public String toString() {
            return "CervicalSpineDetail(model=" + this.model + ", uid=" + this.uid + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", goodDuration=" + this.goodDuration + ", mildDuration=" + this.mildDuration + ", badDuration=" + this.badDuration + ")";
        }
    }

    @Nullable
    public final List<CervicalSpineDetail> getDataList() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final void setDataList(@Nullable List<CervicalSpineDetail> list) {
        this.data = list;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "CervicalSpineHistoryRsp(resultCode=" + this.resultCode + ", hasMore=" + this.hasMore + ", data=" + this.data + ")";
    }
}
