package com.heytap.health.sunshine.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.heytap.health.health.storemodel.viewmodel.LastTimeViewModel;
import com.heytap.health.sunshine.model.SunshineRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.zr8;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/sunshine/viewmodel/SunshineCardViewModel;", "Lcom/heytap/health/health/storemodel/viewmodel/LastTimeViewModel;", "", acl.KEY_B, "Lcom/heytap/health/sunshine/model/SunshineRepository;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/sunshine/model/SunshineRepository;", "mRepository", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/health/sunshine/viewmodel/SunshineCardViewModel$a;", "n", "Landroidx/lifecycle/MutableLiveData;", "_cardData", "Landroidx/lifecycle/LiveData;", "C", "()Landroidx/lifecycle/LiveData;", "cardData", "<init>", "()V", "a", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final class SunshineCardViewModel extends LastTimeViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final SunshineRepository mRepository;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<SunshineCardData> _cardData;

    /* JADX INFO: renamed from: com.heytap.health.sunshine.viewmodel.SunshineCardViewModel$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/sunshine/viewmodel/SunshineCardViewModel$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "c", "()J", SpeechConstant.KEY_TTS_TIMESTAMP, "b", "I", "()I", "duration", "target", "<init>", "(JII)V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SunshineCardData {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final long timeStamp;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int duration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int target;

        public SunshineCardData() {
            this(0L, 0, 0, 7, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getTimeStamp() {
            return this.timeStamp;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SunshineCardData)) {
                return false;
            }
            SunshineCardData sunshineCardData = (SunshineCardData) other;
            return this.timeStamp == sunshineCardData.timeStamp && this.duration == sunshineCardData.duration && this.target == sunshineCardData.target;
        }

        public int hashCode() {
            return (((Long.hashCode(this.timeStamp) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.target);
        }

        @NotNull
        public String toString() {
            return "SunshineCardData(timeStamp=" + this.timeStamp + ", duration=" + this.duration + ", target=" + this.target + ")";
        }

        public SunshineCardData(long j2, int i, int i2) {
            this.timeStamp = j2;
            this.duration = i;
            this.target = i2;
        }

        public /* synthetic */ SunshineCardData(long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0L : j2, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 20 : i2);
        }
    }

    public SunshineCardViewModel() {
        SunshineRepository sunshineRepository = new SunshineRepository();
        this.mRepository = sunshineRepository;
        y(sunshineRepository);
        this._cardData = new MutableLiveData<>();
    }

    public final void B() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), zr8.INSTANCE.b("sunCardVM"), null, new SunshineCardViewModel$fetchCardMainData$1(this, null), 2, null);
    }

    @NotNull
    public final LiveData<SunshineCardData> C() {
        return this._cardData;
    }
}