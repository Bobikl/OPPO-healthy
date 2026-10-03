package com.heytap.speech.engine;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J]\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006<"}, d2 = {"Lcom/heytap/speech/engine/GlobalConfig;", "", "asr", "Lcom/heytap/speech/engine/Asr;", "dm", "Lcom/heytap/speech/engine/Dm;", "module", "Lcom/heytap/speech/engine/Module;", "pickup", "Lcom/heytap/speech/engine/Pickup;", "tts", "Lcom/heytap/speech/engine/Tts;", "vad", "Lcom/heytap/speech/engine/Vad;", "wakeup", "Lcom/heytap/speech/engine/Wakeup;", "(Lcom/heytap/speech/engine/Asr;Lcom/heytap/speech/engine/Dm;Lcom/heytap/speech/engine/Module;Lcom/heytap/speech/engine/Pickup;Lcom/heytap/speech/engine/Tts;Lcom/heytap/speech/engine/Vad;Lcom/heytap/speech/engine/Wakeup;)V", "getAsr", "()Lcom/heytap/speech/engine/Asr;", "setAsr", "(Lcom/heytap/speech/engine/Asr;)V", "getDm", "()Lcom/heytap/speech/engine/Dm;", "setDm", "(Lcom/heytap/speech/engine/Dm;)V", "getModule", "()Lcom/heytap/speech/engine/Module;", "setModule", "(Lcom/heytap/speech/engine/Module;)V", "getPickup", "()Lcom/heytap/speech/engine/Pickup;", "setPickup", "(Lcom/heytap/speech/engine/Pickup;)V", "getTts", "()Lcom/heytap/speech/engine/Tts;", "setTts", "(Lcom/heytap/speech/engine/Tts;)V", "getVad", "()Lcom/heytap/speech/engine/Vad;", "setVad", "(Lcom/heytap/speech/engine/Vad;)V", "getWakeup", "()Lcom/heytap/speech/engine/Wakeup;", "setWakeup", "(Lcom/heytap/speech/engine/Wakeup;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GlobalConfig {

    @Nullable
    private Asr asr;

    @Nullable
    private Dm dm;

    @Nullable
    private Module module;

    @Nullable
    private Pickup pickup;

    @Nullable
    private Tts tts;

    @Nullable
    private Vad vad;

    @Nullable
    private Wakeup wakeup;

    public GlobalConfig() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ GlobalConfig copy$default(GlobalConfig globalConfig, Asr asr, Dm dm, Module module, Pickup pickup, Tts tts, Vad vad, Wakeup wakeup, int i, Object obj) {
        if ((i & 1) != 0) {
            asr = globalConfig.asr;
        }
        if ((i & 2) != 0) {
            dm = globalConfig.dm;
        }
        Dm dm2 = dm;
        if ((i & 4) != 0) {
            module = globalConfig.module;
        }
        Module module2 = module;
        if ((i & 8) != 0) {
            pickup = globalConfig.pickup;
        }
        Pickup pickup2 = pickup;
        if ((i & 16) != 0) {
            tts = globalConfig.tts;
        }
        Tts tts2 = tts;
        if ((i & 32) != 0) {
            vad = globalConfig.vad;
        }
        Vad vad2 = vad;
        if ((i & 64) != 0) {
            wakeup = globalConfig.wakeup;
        }
        return globalConfig.copy(asr, dm2, module2, pickup2, tts2, vad2, wakeup);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Asr getAsr() {
        return this.asr;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Dm getDm() {
        return this.dm;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Module getModule() {
        return this.module;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Pickup getPickup() {
        return this.pickup;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Tts getTts() {
        return this.tts;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Vad getVad() {
        return this.vad;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    @NotNull
    public final GlobalConfig copy(@Nullable Asr asr, @Nullable Dm dm, @Nullable Module module, @Nullable Pickup pickup, @Nullable Tts tts, @Nullable Vad vad, @Nullable Wakeup wakeup) {
        return new GlobalConfig(asr, dm, module, pickup, tts, vad, wakeup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalConfig)) {
            return false;
        }
        GlobalConfig globalConfig = (GlobalConfig) other;
        return Intrinsics.areEqual(this.asr, globalConfig.asr) && Intrinsics.areEqual(this.dm, globalConfig.dm) && Intrinsics.areEqual(this.module, globalConfig.module) && Intrinsics.areEqual(this.pickup, globalConfig.pickup) && Intrinsics.areEqual(this.tts, globalConfig.tts) && Intrinsics.areEqual(this.vad, globalConfig.vad) && Intrinsics.areEqual(this.wakeup, globalConfig.wakeup);
    }

    @Nullable
    public final Asr getAsr() {
        return this.asr;
    }

    @Nullable
    public final Dm getDm() {
        return this.dm;
    }

    @Nullable
    public final Module getModule() {
        return this.module;
    }

    @Nullable
    public final Pickup getPickup() {
        return this.pickup;
    }

    @Nullable
    public final Tts getTts() {
        return this.tts;
    }

    @Nullable
    public final Vad getVad() {
        return this.vad;
    }

    @Nullable
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    public int hashCode() {
        Asr asr = this.asr;
        int iHashCode = (asr == null ? 0 : asr.hashCode()) * 31;
        Dm dm = this.dm;
        int iHashCode2 = (iHashCode + (dm == null ? 0 : dm.hashCode())) * 31;
        Module module = this.module;
        int iHashCode3 = (iHashCode2 + (module == null ? 0 : module.hashCode())) * 31;
        Pickup pickup = this.pickup;
        int iHashCode4 = (iHashCode3 + (pickup == null ? 0 : pickup.hashCode())) * 31;
        Tts tts = this.tts;
        int iHashCode5 = (iHashCode4 + (tts == null ? 0 : tts.hashCode())) * 31;
        Vad vad = this.vad;
        int iHashCode6 = (iHashCode5 + (vad == null ? 0 : vad.hashCode())) * 31;
        Wakeup wakeup = this.wakeup;
        return iHashCode6 + (wakeup != null ? wakeup.hashCode() : 0);
    }

    public final void setAsr(@Nullable Asr asr) {
        this.asr = asr;
    }

    public final void setDm(@Nullable Dm dm) {
        this.dm = dm;
    }

    public final void setModule(@Nullable Module module) {
        this.module = module;
    }

    public final void setPickup(@Nullable Pickup pickup) {
        this.pickup = pickup;
    }

    public final void setTts(@Nullable Tts tts) {
        this.tts = tts;
    }

    public final void setVad(@Nullable Vad vad) {
        this.vad = vad;
    }

    public final void setWakeup(@Nullable Wakeup wakeup) {
        this.wakeup = wakeup;
    }

    @NotNull
    public String toString() {
        return "GlobalConfig(asr=" + this.asr + ", dm=" + this.dm + ", module=" + this.module + ", pickup=" + this.pickup + ", tts=" + this.tts + ", vad=" + this.vad + ", wakeup=" + this.wakeup + ')';
    }

    public GlobalConfig(@Nullable Asr asr, @Nullable Dm dm, @Nullable Module module, @Nullable Pickup pickup, @Nullable Tts tts, @Nullable Vad vad, @Nullable Wakeup wakeup) {
        this.asr = asr;
        this.dm = dm;
        this.module = module;
        this.pickup = pickup;
        this.tts = tts;
        this.vad = vad;
        this.wakeup = wakeup;
    }

    public /* synthetic */ GlobalConfig(Asr asr, Dm dm, Module module, Pickup pickup, Tts tts, Vad vad, Wakeup wakeup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : asr, (i & 2) != 0 ? null : dm, (i & 4) != 0 ? null : module, (i & 8) != 0 ? null : pickup, (i & 16) != 0 ? null : tts, (i & 32) != 0 ? null : vad, (i & 64) != 0 ? null : wakeup);
    }
}
