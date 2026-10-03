package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.snh, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b,\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001e\u0010\nR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b$\u0010\nR\"\u0010(\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016\"\u0004\b'\u0010\u0018R\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\"\u00101\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b&\u0010\b\"\u0004\b0\u0010\nR\"\u00104\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0014\u001a\u0004\b)\u0010\u0016\"\u0004\b3\u0010\u0018R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0006\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\nR\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0006\u001a\u0004\b \u0010\b\"\u0004\b8\u0010\nR\"\u0010;\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0006\u001a\u0004\b2\u0010\b\"\u0004\b:\u0010\n¨\u0006>"}, d2 = {"Lcom/oplus/aiunit/vision/snh;", "", "", "toString", "", "a", "Z", MapSchema.FIELD_NAME_KEY, "()Z", "setShowAutoRecognize", "(Z)V", "isShowAutoRecognize", "b", "setAutoRecognizeEnable", "autoRecognizeEnable", "c", "q", "accordRestEnable", "", "d", "I", "f", "()I", "u", "(I)V", "restCount", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.LEVEL_KEY, "v", "isShowLinkagePhoneZenMode", "t", "linkagePhoneZenMode", b2n.f, b2n.g, c8l.KEY_B, "sleepGoal", "r", "bedRemindEnable", "i", "s", "bedRemindTime", "j", "o", "y", "isShowStayUp", LogFieldKey.PROCESS_NAME_KEY, "z", "isShowStayUpRemindTime", "C", "stayUpRemindEnable", LogFieldKey.MESSAGE_KEY, "D", "stayUpRemindTime", "n", "x", "isShowSleepCloseMusic", "A", "sleepCloseMusicEnable", "w", "isShowSilenceNotification", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SleepSettingDataForUI {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public boolean isSupportAutoRecognize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public boolean autoRecognizeEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int restCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public boolean linkagePhoneZenMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public int sleepRemindTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isShowStayUp;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isShowStayUpRemindTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean stayUpRemindEnable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    public boolean sleepCloseMusicEnable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean accRestEnable = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isShowLinkagePhoneZenMode = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public int sleepGoal = 8;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public boolean sleepRemindEnable = true;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int stayUpRemindTime = 30;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isShowSleepCloseMusic = true;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isShowSilenceNotification = true;

    public final void A(boolean z) {
        this.sleepCloseMusicEnable = z;
    }

    public final void B(int i) {
        this.sleepGoal = i;
    }

    public final void C(boolean z) {
        this.stayUpRemindEnable = z;
    }

    public final void D(int i) {
        this.stayUpRemindTime = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAccRestEnable() {
        return this.accRestEnable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAutoRecognizeEnable() {
        return this.autoRecognizeEnable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSleepRemindEnable() {
        return this.sleepRemindEnable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSleepRemindTime() {
        return this.sleepRemindTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getLinkagePhoneZenMode() {
        return this.linkagePhoneZenMode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRestCount() {
        return this.restCount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getSleepCloseMusicEnable() {
        return this.sleepCloseMusicEnable;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSleepGoal() {
        return this.sleepGoal;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getStayUpRemindEnable() {
        return this.stayUpRemindEnable;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getStayUpRemindTime() {
        return this.stayUpRemindTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsSupportAutoRecognize() {
        return this.isSupportAutoRecognize;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsShowLinkagePhoneZenMode() {
        return this.isShowLinkagePhoneZenMode;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsShowSilenceNotification() {
        return this.isShowSilenceNotification;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsShowSleepCloseMusic() {
        return this.isShowSleepCloseMusic;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsShowStayUp() {
        return this.isShowStayUp;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsShowStayUpRemindTime() {
        return this.isShowStayUpRemindTime;
    }

    public final void q(boolean z) {
        this.accRestEnable = z;
    }

    public final void r(boolean z) {
        this.sleepRemindEnable = z;
    }

    public final void s(int i) {
        this.sleepRemindTime = i;
    }

    public final void t(boolean z) {
        this.linkagePhoneZenMode = z;
    }

    @NotNull
    public String toString() {
        return "SleepSettingDataForUI(isSupportAutoRecognize=" + this.isSupportAutoRecognize + ", autoRecognizeEnable=" + this.autoRecognizeEnable + ", accRestEnable=" + this.accRestEnable + ", restCount='" + this.restCount + "', linkagePhoneZenMode=" + this.linkagePhoneZenMode + ", sleepGoal=" + this.sleepGoal + ", sleepRemindEnable=" + this.sleepRemindEnable + ", sleepRemindTime=" + this.sleepRemindTime + ", sleepCloseMusicEnable=" + this.sleepCloseMusicEnable + ")";
    }

    public final void u(int i) {
        this.restCount = i;
    }

    public final void v(boolean z) {
        this.isShowLinkagePhoneZenMode = z;
    }

    public final void w(boolean z) {
        this.isShowSilenceNotification = z;
    }

    public final void x(boolean z) {
        this.isShowSleepCloseMusic = z;
    }

    public final void y(boolean z) {
        this.isShowStayUp = z;
    }

    public final void z(boolean z) {
        this.isShowStayUpRemindTime = z;
    }
}
