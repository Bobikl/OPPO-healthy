package com.heytap.health.healthbase.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/healthbase/bean/SupportedPhoneBean;", "", "()V", "phoneMeasureHeartRate", "", "Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureHeartRate;", "getPhoneMeasureHeartRate", "()Ljava/util/List;", "setPhoneMeasureHeartRate", "(Ljava/util/List;)V", "phoneMeasureSleep", "Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureSleep;", "getPhoneMeasureSleep", "setPhoneMeasureSleep", "phoneMeasureSnore", "Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureSnore;", "getPhoneMeasureSnore", "setPhoneMeasureSnore", "PhoneMeasureHeartRate", "PhoneMeasureSleep", "PhoneMeasureSnore", "health_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SupportedPhoneBean {
    public static final int $stable = 8;

    @NotNull
    private List<PhoneMeasureSleep> phoneMeasureSleep = new ArrayList();

    @NotNull
    private List<PhoneMeasureSnore> phoneMeasureSnore = new ArrayList();

    @NotNull
    private List<PhoneMeasureHeartRate> phoneMeasureHeartRate = new ArrayList();

    @StabilityInferred(parameters = 0)
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureHeartRate;", "", "()V", "model", "", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "health_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PhoneMeasureHeartRate {
        public static final int $stable = 8;

        @NotNull
        private String model = "";

        @NotNull
        public final String getModel() {
            return this.model;
        }

        public final void setModel(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.model = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureSleep;", "", "()V", "model", "", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "health_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PhoneMeasureSleep {
        public static final int $stable = 8;

        @NotNull
        private String model = "";

        @NotNull
        public final String getModel() {
            return this.model;
        }

        public final void setModel(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.model = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureSnore;", "", "()V", "model", "", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "health_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PhoneMeasureSnore {
        public static final int $stable = 8;

        @NotNull
        private String model = "";

        @NotNull
        public final String getModel() {
            return this.model;
        }

        public final void setModel(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.model = str;
        }
    }

    @NotNull
    public final List<PhoneMeasureHeartRate> getPhoneMeasureHeartRate() {
        return this.phoneMeasureHeartRate;
    }

    @NotNull
    public final List<PhoneMeasureSleep> getPhoneMeasureSleep() {
        return this.phoneMeasureSleep;
    }

    @NotNull
    public final List<PhoneMeasureSnore> getPhoneMeasureSnore() {
        return this.phoneMeasureSnore;
    }

    public final void setPhoneMeasureHeartRate(@NotNull List<PhoneMeasureHeartRate> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.phoneMeasureHeartRate = list;
    }

    public final void setPhoneMeasureSleep(@NotNull List<PhoneMeasureSleep> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.phoneMeasureSleep = list;
    }

    public final void setPhoneMeasureSnore(@NotNull List<PhoneMeasureSnore> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.phoneMeasureSnore = list;
    }
}
