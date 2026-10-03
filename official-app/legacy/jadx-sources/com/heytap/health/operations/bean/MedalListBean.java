package com.heytap.health.operations.bean;

import androidx.annotation.Keep;
import com.heytap.health.operations.router.providers.IFitService;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.krb;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.ld7;
import com.oplus.aiunit.vision.x0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class MedalListBean implements Serializable {
    public static final int ACKSTATUS_ACK = 1;
    public static final int ACKSTATUS_NONE = 0;
    public static final int DISPLAY = 1;
    public static final int EFFECTIVE_POP_DISABLE = 0;
    public static final int EFFECTIVE_POP_ENABLE = 1;
    public static final int FLAGAPP = 0;
    public static final int FLAGCLOUD = 1;
    public static final int GETMEDAL = 1;
    public static final int LOGIC_OFFLINE = 1;
    public static final int LOGIC_ONLINE = 0;
    public static final int NOGETMEDAL = 0;
    public static final int ONLINE = 1;
    public static final int REMOVED = 2;
    private int ackStatus;
    private String breakRecordContent;
    private int breakRecordTimes;
    private String clientId;
    private String code;
    private int colorType;
    private String content;
    private int display;
    private int effectivePop = 1;
    private int flag;
    private String grayImageUrl;
    private String imageUrl;
    private int logicStatus;
    private String name;
    private int obtainStatus;
    private long obtainTime;
    private String phoneTdResource;
    private String progress;
    private long recordDuration;
    private String remark;
    private int sort;
    private long startTime;
    private int status;
    private String subtitle;
    private String target;
    private String typeCode;
    private String unattainedContent;
    private String videoLoaclUri;
    private String videoUrl;
    private String watchGrayImageUrl;
    private String watchImageUrl;
    private String watchTdResource;

    public class a implements d08<Float, String> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(Float f) throws Exception {
            return ld7.l(MedalListBean.this.phoneTdResource);
        }
    }

    public int getAckStatus() {
        return this.ackStatus;
    }

    public long getAcquisitionDate() {
        return this.obtainTime;
    }

    public String getBreakRecordContent() {
        return this.breakRecordContent;
    }

    public int getBreakRecordTimes() {
        return this.breakRecordTimes;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getCode() {
        return this.code;
    }

    public int getColorType() {
        return this.colorType;
    }

    public String getContent() {
        return this.content;
    }

    public int getDisplay() {
        return this.display;
    }

    public int getEffectivePop() {
        return this.effectivePop;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getGetResult() {
        return this.obtainStatus;
    }

    public String getGrayImageUrl() {
        return this.grayImageUrl;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getLogicStatus() {
        return this.logicStatus;
    }

    public lbd<String> getMedalResPath() {
        return ((IFitService) x0.d().h(IFitService.class)).F7(this.phoneTdResource).P0(1).j0(new a());
    }

    public String getName() {
        return this.name;
    }

    public int getObtainStatus() {
        return this.obtainStatus;
    }

    public long getObtainTime() {
        return this.obtainTime;
    }

    public String getPhoneTdResource() {
        return this.phoneTdResource;
    }

    public String getProgress() {
        return this.progress;
    }

    public long getRecordDuration() {
        return this.recordDuration;
    }

    public String getRemark() {
        return this.remark;
    }

    public int getSort() {
        return this.sort;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getStatus() {
        return this.status;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTarget() {
        return this.target;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public String getUnattainedContent() {
        return this.unattainedContent;
    }

    public String getVideoLoaclUri() {
        return this.videoLoaclUri;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public String getWatchGrayImageUrl() {
        return this.watchGrayImageUrl;
    }

    public String getWatchImageUrl() {
        return this.watchImageUrl;
    }

    public String getWatchTdResource() {
        return this.watchTdResource;
    }

    public boolean homeNeedRedDot() {
        return getAckStatus() == 0 && getGetResult() == 1;
    }

    public boolean isGet() {
        return this.obtainStatus == 1 && isObtainTimeCorret();
    }

    public boolean isGetRow() {
        return this.obtainStatus == 1;
    }

    public boolean isObtainTimeCorret() {
        return this.obtainTime > krb.MEDAL_GET_MIN_TIME;
    }

    public boolean isOnline() {
        return this.status == 1 && this.logicStatus == 0;
    }

    public void setAckStatus(int i) {
        this.ackStatus = i;
    }

    public void setAcquisitionDate(long j2) {
        this.obtainTime = j2;
    }

    public void setBreakRecordContent(String str) {
        this.breakRecordContent = str;
    }

    public void setBreakRecordTimes(int i) {
        this.breakRecordTimes = i;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setColorType(int i) {
        this.colorType = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEffectivePop(int i) {
        this.effectivePop = i;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setGetResult(int i) {
        this.obtainStatus = i;
        if (i != 1 || this.display == 1) {
            return;
        }
        this.display = 1;
    }

    public void setGrayImageUrl(String str) {
        this.grayImageUrl = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setLogicStatus(int i) {
        this.logicStatus = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setObtainStatus(int i) {
        this.obtainStatus = i;
    }

    public void setObtainTime(long j2) {
        this.obtainTime = j2;
    }

    public void setPhoneTdResource(String str) {
        this.phoneTdResource = str;
    }

    public void setProgress(String str) {
        this.progress = str;
    }

    @Deprecated
    public void setRecordDuration(long j2) {
        this.recordDuration = j2;
    }

    public void setRecordDuration2(int i) {
        this.recordDuration = i;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setSort(int i) {
        this.sort = i;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setTarget(String str) {
        this.target = str;
    }

    public void setTypeCode(String str) {
        this.typeCode = str;
    }

    public void setUnattainedContent(String str) {
        this.unattainedContent = str;
    }

    public void setVideoLoaclUri(String str) {
        this.videoLoaclUri = str;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public void setWatchGrayImageUrl(String str) {
        this.watchGrayImageUrl = str;
    }

    public void setWatchImageUrl(String str) {
        this.watchImageUrl = str;
    }

    public void setWatchTdResource(String str) {
        this.watchTdResource = str;
    }

    public boolean shouldPopAfterObtain() {
        return this.obtainTime > this.startTime || this.effectivePop != 0;
    }

    public String toString() {
        return "MedalListBean{name='" + this.name + "', code='" + this.code + "', progress='" + this.progress + ", typeCode='" + this.typeCode + "', target='" + this.target + "', logicStatus=" + this.logicStatus + ", obtainStatus=" + this.obtainStatus + ", obtainTime=" + this.obtainTime + ", unattainedContent='" + this.unattainedContent + "', content='" + this.content + "', remark='" + this.remark + "', flag=" + this.flag + ", status=" + this.status + ", display=" + this.display + ", ackStatus=" + this.ackStatus + ", breakRecordTimes=" + this.breakRecordTimes + ", recordDuration=" + this.recordDuration + ", watchImageUrl=" + this.watchImageUrl + ", watchGrayImageUrl=" + this.watchGrayImageUrl + ", colorType=" + this.colorType + ", effectivePop=" + this.effectivePop + ", startTime=" + this.startTime + '}';
    }
}
