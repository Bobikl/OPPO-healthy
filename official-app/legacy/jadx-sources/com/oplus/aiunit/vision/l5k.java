package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import com.oplus.nearx.track.internal.utils.Logger;
import com.oplus.nearx.track.internal.utils.TrackAreaCode;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\t"}, d2 = {"", "region", "Lcom/oplus/nearx/track/internal/utils/TrackAreaCode;", MapSchema.FIELD_NAME_ENTRY, "areaCode", "", "isTest", "a", "c", "core-statistics_release"}, k = 2, mv = {1, 7, 1})
public final class l5k {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackAreaCode.values().length];
            iArr[TrackAreaCode.CN.ordinal()] = 1;
            iArr[TrackAreaCode.EU.ordinal()] = 2;
            iArr[TrackAreaCode.SA.ordinal()] = 3;
            iArr[TrackAreaCode.RU.ordinal()] = 4;
            iArr[TrackAreaCode.US.ordinal()] = 5;
            iArr[TrackAreaCode.SEA.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String a(@NotNull TrackAreaCode areaCode, boolean z) {
        Intrinsics.checkNotNullParameter(areaCode, "areaCode");
        String str = "";
        switch (a.$EnumSwitchMapping$0[areaCode.ordinal()]) {
            case 1:
                if (!z) {
                    str = "`||x{2''gj}{%kf&lk&`mq|ixegja&kge";
                }
                break;
            case 2:
                if (!z) {
                    str = "`||x{2''gj}{%lk%m}&`mq|ixegjadm&kge";
                }
                break;
            case 3:
                if (!z) {
                    str = "`||x{2''gj}{%af&lk&`mq|ixegjadm&kge";
                }
                break;
            case 4:
                if (!z) {
                    str = "`||x{2''gj}{%z}lk%{o&`mq|ixegjadm&kge";
                }
                break;
            case 5:
                break;
            case 6:
                if (!z) {
                    str = "`||x{2''gj}{%{o&lk&`mq|ixegjadm&kge";
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Logger.b(k6k.e(), "TrackUpload", "getRegionUpload(" + areaCode + ", " + z + ") = " + str, null, null, 12, null);
        return u0j.j(str);
    }

    public static /* synthetic */ String b(TrackAreaCode trackAreaCode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            trackAreaCode = f(null, 1, null);
        }
        return a(trackAreaCode, z);
    }

    @NotNull
    public static final String c(@NotNull TrackAreaCode areaCode, boolean z) {
        Intrinsics.checkNotNullParameter(areaCode, "areaCode");
        String str = "";
        switch (a.$EnumSwitchMapping$0[areaCode.ordinal()]) {
            case 1:
                if (!z) {
                    str = "`||x{2''gj}{%lk|mk`%kf&`mq|ixegja&kge";
                }
                break;
            case 2:
                if (!z) {
                    str = "`||x{2''gj}{%lk|mk`%m}&`mq|ixegjadm&kge";
                }
                break;
            case 3:
                if (!z) {
                    str = "`||x{2''gj}{%lk|mk`%af&`mq|ixegjadm&kge";
                }
                break;
            case 4:
            case 5:
                break;
            case 6:
                if (!z) {
                    str = "`||x{2''gj}{%lk|mk`%{o&`mq|ixegjadm&kge";
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Logger.b(k6k.e(), "TrackUpload", "getRegionUploadTech(" + areaCode + ", " + z + ") = " + str, null, null, 12, null);
        return u0j.j(str);
    }

    public static /* synthetic */ String d(TrackAreaCode trackAreaCode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            trackAreaCode = f(null, 1, null);
        }
        return c(trackAreaCode, z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x017d  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b0  */
    @NotNull
    public static final TrackAreaCode e(@NotNull String region) {
        TrackAreaCode trackAreaCode;
        Intrinsics.checkNotNullParameter(region, "region");
        switch (region) {
            case "AT":
            case "BA":
            case "BE":
            case "BG":
            case "CH":
                trackAreaCode = TrackAreaCode.EU;
                break;
            case "CN":
                trackAreaCode = TrackAreaCode.CN;
                break;
            case "CY":
            case "CZ":
            case "DE":
            case "DK":
            case "EE":
            case "ES":
            case "FI":
            case "FR":
            case "GB":
            case "GR":
            case "HR":
            case "HU":
            case "IE":
                trackAreaCode = TrackAreaCode.EU;
                break;
            case "IN":
                trackAreaCode = TrackAreaCode.SA;
                break;
            case "IS":
            case "IT":
            case "LI":
            case "LT":
            case "LU":
            case "LV":
            case "MT":
            case "NL":
            case "NO":
                trackAreaCode = TrackAreaCode.EU;
                break;
            case "OC":
                trackAreaCode = TrackAreaCode.CN;
                break;
            case "PL":
            case "PT":
            case "RO":
            case "RS":
                trackAreaCode = TrackAreaCode.EU;
                break;
            case "RU":
                trackAreaCode = TrackAreaCode.RU;
                break;
            case "SE":
            case "SI":
            case "SK":
            case "TR":
                trackAreaCode = TrackAreaCode.EU;
                break;
            case "US":
                trackAreaCode = TrackAreaCode.US;
                break;
            case "EUEX":
                trackAreaCode = TrackAreaCode.EU;
                break;
            default:
                trackAreaCode = TrackAreaCode.SEA;
                break;
        }
        Logger.l(k6k.e(), "Region", "track area code=[" + trackAreaCode.getValue() + ']', null, null, 12, null);
        return trackAreaCode;
    }

    public static /* synthetic */ TrackAreaCode f(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = GlobalConfigHelper.INSTANCE.i();
        }
        return e(str);
    }
}
