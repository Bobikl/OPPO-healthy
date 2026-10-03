package com.heytap.weather.service;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/heytap/weather/service/TempUnitBean;", "", "", "serverUnit", "Ljava/lang/String;", "getServerUnit", "()Ljava/lang/String;", "setServerUnit", "(Ljava/lang/String;)V", "bandUnit", "getBandUnit", "setBandUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TempUnitBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int TEMP_UNIT_CELSIUS = 0;
    public static final int TEMP_UNIT_FAHRENHEIT = 1;

    @NotNull
    private static final String UNIT_BAND_C = "℃";

    @NotNull
    private static final String UNIT_BAND_F = "℉";

    @NotNull
    private static final String UNIT_SERVER_C = "c";

    @NotNull
    private static final String UNIT_SERVER_F = "f";

    @NotNull
    private String bandUnit;

    @NotNull
    private String serverUnit;

    /* JADX INFO: renamed from: com.heytap.weather.service.TempUnitBean$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/weather/service/TempUnitBean$a;", "", "", "tempUnit", "Lcom/heytap/weather/service/TempUnitBean;", "a", "TEMP_UNIT_CELSIUS", "I", "TEMP_UNIT_FAHRENHEIT", "", "UNIT_BAND_C", "Ljava/lang/String;", "UNIT_BAND_F", "UNIT_SERVER_C", "UNIT_SERVER_F", "<init>", "()V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TempUnitBean a(int tempUnit) {
            return tempUnit == 0 ? new TempUnitBean(TempUnitBean.UNIT_SERVER_C, TempUnitBean.UNIT_BAND_C) : new TempUnitBean(TempUnitBean.UNIT_SERVER_F, TempUnitBean.UNIT_BAND_F);
        }
    }

    public TempUnitBean(@NotNull String serverUnit, @NotNull String bandUnit) {
        Intrinsics.checkNotNullParameter(serverUnit, "serverUnit");
        Intrinsics.checkNotNullParameter(bandUnit, "bandUnit");
        this.serverUnit = serverUnit;
        this.bandUnit = bandUnit;
    }

    @NotNull
    public final String getBandUnit() {
        return this.bandUnit;
    }

    @NotNull
    public final String getServerUnit() {
        return this.serverUnit;
    }

    public final void setBandUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bandUnit = str;
    }

    public final void setServerUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serverUnit = str;
    }
}
