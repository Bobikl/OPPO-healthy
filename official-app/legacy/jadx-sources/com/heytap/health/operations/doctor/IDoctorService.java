package com.heytap.health.operations.doctor;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.health.bloodpressure.util.ResearchAppHelper;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.cardwidget.domain.pack.BaseDataPack;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0006,-./01J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH&J\u001c\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H&JL\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0018H&J(\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u001fH&JL\u0010)\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020(H&J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H&¨\u00062"}, d2 = {"Lcom/heytap/health/operations/doctor/IDoctorService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "params", "", "J3", "source", "f1", "Lcom/heytap/health/operations/doctor/IDoctorService$a;", "callback", "Y5", "Lcom/heytap/health/operations/doctor/IDoctorService$g;", "e8", "Lcom/heytap/health/operations/doctor/IDoctorService$d;", "code", "d6", LogSenderConst.SUBTYPE, ResearchAppHelper.SURVEY_BLOOD_PRESSURE, "", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "bloodOxygenSaturation", "Lcom/heytap/databaseengine/model/HeartRate;", RecordCombinedLineChart.KEY_HEART_RATE, "cardiogram", "Lcom/heytap/health/operations/doctor/IDoctorService$e;", "S7", "", "count", "sourceType", "", "useFrontCamera", "Lcom/heytap/health/operations/doctor/IDoctorService$b;", "L1", "url", "filePath", Fields.FILE_TYPE, "", "headers", BaseDataPack.KEY_DATA_COMPRESS, "limit", "Lcom/heytap/health/operations/doctor/IDoctorService$f;", "w1", "userId", "W3", "a", "b", "d", MapSchema.FIELD_NAME_ENTRY, "f", b2n.f, "operations_release"}, k = 1, mv = {1, 8, 0})
public interface IDoctorService extends IProvider {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, d2 = {"Lcom/heytap/health/operations/doctor/IDoctorService$a;", "", "", "errorCode", "", "errorMessage", "Lcom/heytap/health/operations/doctor/AlipayUserBean;", "alipayUserBean", "", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(int errorCode, @NotNull String errorMessage, @Nullable AlipayUserBean alipayUserBean);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&¨\u0006\n"}, d2 = {"Lcom/heytap/health/operations/doctor/IDoctorService$b;", "", "", "errorCode", "", "errorMessage", "", "apiFilePaths", "", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(int errorCode, @NotNull String errorMessage, @NotNull List<String> apiFilePaths);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public static /* synthetic */ void a(IDoctorService iDoctorService, d dVar, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDoctorServiceInfo");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            iDoctorService.d6(dVar, str);
        }

        public static /* synthetic */ void b(IDoctorService iDoctorService, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoDoctorMainIntroPage");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            iDoctorService.J3(str);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/operations/doctor/IDoctorService$d;", "", "Lcom/heytap/health/operations/doctor/DoctorServiceBean;", "doctorServiceBean", "", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
    public interface d {
        void a(@Nullable DoctorServiceBean doctorServiceBean);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/operations/doctor/IDoctorService$e;", "", "", "errorCode", "", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
    public interface e {
        void a(int errorCode);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¨\u0006\t"}, d2 = {"Lcom/heytap/health/operations/doctor/IDoctorService$f;", "", "", "errorCode", "", "errorMessage", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
    public interface f {
        void a(int errorCode, @NotNull String errorMessage, @Nullable Object response);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/heytap/health/operations/doctor/IDoctorService$g;", "", "", "errorCode", "", "errorMessage", "accessToken", TriggerEvent.EXTRA_UID, "", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
    public interface g {
        void a(int errorCode, @NotNull String errorMessage, @NotNull String accessToken, @NotNull String uid);
    }

    void J3(@NotNull String params);

    void L1(int count, @NotNull String sourceType, boolean useFrontCamera, @NotNull b callback);

    void S7(@NotNull String subType, @Nullable String bloodPressure, @Nullable List<? extends BloodOxygenSaturation> bloodOxygenSaturation, @Nullable List<? extends HeartRate> heartRate, @Nullable String cardiogram, @NotNull e callback);

    void W3(@NotNull String source, @NotNull String userId);

    void Y5(@NotNull a callback);

    void d6(@NotNull d callback, @Nullable String code);

    void e8(@NotNull g callback);

    void f1(@NotNull String source);

    void w1(@NotNull String url, @NotNull String filePath, @NotNull String fileType, @NotNull Map<String, String> headers, int compress, int limit, @NotNull f callback);
}
