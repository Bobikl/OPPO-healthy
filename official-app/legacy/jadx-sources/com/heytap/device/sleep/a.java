package com.heytap.device.sleep;

import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u0002H\u0002R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u000e\u0010%R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b#\u0010%R\"\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00103\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010/\u001a\u0004\b\u0014\u00100\"\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(¨\u00067"}, d2 = {"Lcom/heytap/device/sleep/a;", "", "", b2n.f, "", "forceLoadFromCloud", "r", "o", MapSchema.FIELD_NAME_KEY, "i", "q", LogFieldKey.MESSAGE_KEY, "f", "", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/heytap/databaseengine/model/SleepModelSettings;", "b", "Lcom/heytap/databaseengine/model/SleepModelSettings;", "c", "()Lcom/heytap/databaseengine/model/SleepModelSettings;", "setSleepModeSetting", "(Lcom/heytap/databaseengine/model/SleepModelSettings;)V", "sleepModeSetting", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRestSetting;", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRestSetting;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/wsport/data/SleepSettingBean$SleepRestSetting;", "setUserRestSetting", "(Lcom/heytap/wsport/data/SleepSettingBean$SleepRestSetting;)V", "userRestSetting", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRemind;", "d", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRemind;", "()Lcom/heytap/wsport/data/SleepSettingBean$SleepRemind;", "bedTimeRemind", "stayUpRemind", "Z", b2n.g, "()Z", "setCloseMusic", "(Z)V", "isCloseMusic", "", "I", "()I", "setSleepGoal", "(I)V", "sleepGoal", "needInitFromDB", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepSettingWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepSettingWrapper.kt\ncom/heytap/device/sleep/SleepSettingWrapper\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,83:1\n17#2,6:84\n*S KotlinDebug\n*F\n+ 1 SleepSettingWrapper.kt\ncom/heytap/device/sleep/SleepSettingWrapper\n*L\n43#1:84,6\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "SleepModeSetting";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public SleepModelSettings sleepModeSetting = new SleepModelSettings();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SleepSettingBean.SleepRestSetting userRestSetting;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final SleepSettingBean.SleepRemind bedTimeRemind;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SleepSettingBean.SleepRemind stayUpRemind;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isCloseMusic;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int sleepGoal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public volatile boolean needInitFromDB;

    public a() {
        SleepSettingBean.SleepRemind sleepRemind = new SleepSettingBean.SleepRemind();
        this.bedTimeRemind = sleepRemind;
        SleepSettingBean.SleepRemind sleepRemind2 = new SleepSettingBean.SleepRemind();
        this.stayUpRemind = sleepRemind2;
        this.needInitFromDB = true;
        sleepRemind.setRemindSwitch(-1);
        sleepRemind.setRemindTime(-1);
        sleepRemind2.setRemindSwitch(-1);
        sleepRemind2.setRemindTime(-1);
    }

    public static /* synthetic */ void j(a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        aVar.i(z);
    }

    public static /* synthetic */ void l(a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        aVar.k(z);
    }

    public static /* synthetic */ void n(a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        aVar.m(z);
    }

    public static /* synthetic */ void p(a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        aVar.o(z);
    }

    public static /* synthetic */ void s(a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        aVar.r(z);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SleepSettingBean.SleepRemind getBedTimeRemind() {
        return this.bedTimeRemind;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSleepGoal() {
        return this.sleepGoal;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final SleepModelSettings getSleepModeSetting() {
        return this.sleepModeSetting;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SleepSettingBean.SleepRemind getStayUpRemind() {
        return this.stayUpRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final SleepSettingBean.SleepRestSetting getUserRestSetting() {
        return this.userRestSetting;
    }

    public final void f() {
        a7b.f(this.TAG, "Start init all sleep setting");
        long jCurrentTimeMillis = System.currentTimeMillis();
        o(true);
        r(true);
        i(true);
        q(true);
        k(true);
        m(true);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        a7b.f(this.TAG, "Init all sleep setting cost=" + jCurrentTimeMillis2);
    }

    public final void g() {
        if (this.needInitFromDB) {
            this.needInitFromDB = false;
            f();
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsCloseMusic() {
        return this.isCloseMusic;
    }

    public final void i(boolean forceLoadFromCloud) {
        SleepSettingBean.SleepRemind sleepRemind = this.bedTimeRemind;
        SleepModeRepository.Companion companion = SleepModeRepository.INSTANCE;
        sleepRemind.setRemindTime(companion.c(forceLoadFromCloud));
        this.bedTimeRemind.setRemindSwitch(companion.b(forceLoadFromCloud));
    }

    public final void k(boolean forceLoadFromCloud) {
        this.isCloseMusic = SleepModeRepository.INSTANCE.d(forceLoadFromCloud);
    }

    public final void m(boolean forceLoadFromCloud) {
        this.sleepGoal = SleepModeRepository.INSTANCE.g(forceLoadFromCloud);
    }

    public final void o(boolean forceLoadFromCloud) {
        a7b.f(this.TAG, "Load sleep mode from db");
        this.sleepModeSetting = SleepModeRepository.INSTANCE.h(forceLoadFromCloud);
    }

    public final void q(boolean forceLoadFromCloud) {
        SleepSettingBean.SleepRemind sleepRemind = this.stayUpRemind;
        SleepModeRepository.Companion companion = SleepModeRepository.INSTANCE;
        sleepRemind.setRemindTime(companion.k(forceLoadFromCloud));
        this.stayUpRemind.setRemindSwitch(companion.j(forceLoadFromCloud));
    }

    public final void r(boolean forceLoadFromCloud) {
        a7b.f(this.TAG, "Load user rest from db");
        this.userRestSetting = SleepModeRepository.INSTANCE.l(forceLoadFromCloud);
    }
}
