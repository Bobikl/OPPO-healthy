package com.heytap.health.menstrual_period.sp;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.menstrual_period.net.CycleNetRepository;
import com.heytap.health.menstrual_period.viewmodel.CycleSettingViewModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b2\b\u0007\u0018\u0000 _2\u00020\u0001:\u0001`B\u0007¢\u0006\u0004\b]\u0010^R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\"\u0010&\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\"\u0010,\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\"\u00109\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\"\u0010<\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00101\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\"\u0010?\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u000e\u001a\u0004\b@\u0010\u0010\"\u0004\bA\u0010\u0012R\"\u0010B\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u00101\u001a\u0004\bC\u00103\"\u0004\bD\u00105R\"\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\"\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0004\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\"\u0010K\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0004\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\"\u0010N\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\"\u0010Q\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\"\u0010T\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u00101\u001a\u0004\bU\u00103\"\u0004\bV\u00105R\"\u0010W\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u00101\u001a\u0004\bX\u00103\"\u0004\bY\u00105R\"\u0010Z\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u00101\u001a\u0004\b[\u00103\"\u0004\b\\\u00105¨\u0006a"}, d2 = {"Lcom/heytap/health/menstrual_period/sp/MenstrualSpConfig;", "", "", "cycle_setting_days", "I", "getCycle_setting_days", "()I", "setCycle_setting_days", "(I)V", "period_setting_days", "getPeriod_setting_days", "setPeriod_setting_days", "", "last_period_days", "J", "getLast_period_days", "()J", "setLast_period_days", "(J)V", "setting_create_time", "getSetting_create_time", "setSetting_create_time", "setting_modify_time", "getSetting_modify_time", "setSetting_modify_time", "latest_device_sync_time", "getLatest_device_sync_time", "setLatest_device_sync_time", "", "switch_auto_end", "Z", "getSwitch_auto_end", "()Z", "setSwitch_auto_end", "(Z)V", "switch_auto_end_days", "getSwitch_auto_end_days", "setSwitch_auto_end_days", "switch_remind", "getSwitch_remind", "setSwitch_remind", "last_frag_index", "getLast_frag_index", "setLast_frag_index", "switch_quick_start_closed", "getSwitch_quick_start_closed", "setSwitch_quick_start_closed", "", "auto_end_card_closed", "Ljava/lang/String;", "getAuto_end_card_closed", "()Ljava/lang/String;", "setAuto_end_card_closed", "(Ljava/lang/String;)V", "cycle_correction_closed", "getCycle_correction_closed", "setCycle_correction_closed", "questionnaire_selected_value", "getQuestionnaire_selected_value", "setQuestionnaire_selected_value", CycleNetRepository.MARKED_SYMPTOMS_KEY, "getMarked_symptom", "setMarked_symptom", "symptomLastSyncTime", "getSymptomLastSyncTime", "setSymptomLastSyncTime", "menstrual_cycle_predictive_data", "getMenstrual_cycle_predictive_data", "setMenstrual_cycle_predictive_data", "wrist_temperature_tip_show_count", "getWrist_temperature_tip_show_count", "setWrist_temperature_tip_show_count", "wrist_temperature_tip_last_show_time", "getWrist_temperature_tip_last_show_time", "setWrist_temperature_tip_last_show_time", "wrist_temperature_tip_last_show_date", "getWrist_temperature_tip_last_show_date", "setWrist_temperature_tip_last_show_date", "algo_cycle__days", "getAlgo_cycle__days", "setAlgo_cycle__days", "algo_period_days", "getAlgo_period_days", "setAlgo_period_days", "last_sent_device_cycle_data", "getLast_sent_device_cycle_data", "setLast_sent_device_cycle_data", "last_sent_device_cycle_data_v1", "getLast_sent_device_cycle_data_v1", "setLast_sent_device_cycle_data_v1", "last_sent_device_symptom_data", "getLast_sent_device_symptom_data", "setLast_sent_device_symptom_data", "<init>", "()V", "Companion", "a", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class MenstrualSpConfig {
    public static final int CLOSE_VALUE = -1;

    @NotNull
    public static final String MENSTRUAL_CYCLE_PREDICTIVE_DATA_KEY = "MENSTRUAL_CYCLE_PREDICTIVE_DATA";
    public static final int QUESTION_DEFAULT = 0;
    public static final int QUESTION_IRREGULAR = 2;
    public static final int QUESTION_REGULAR = 1;
    public static final int UNSET_VALUE = -2;
    private int algo_cycle__days;
    private int algo_period_days;

    @NotNull
    private String auto_end_card_closed;

    @NotNull
    private String cycle_correction_closed;
    private int cycle_setting_days;
    private int last_frag_index;
    private long last_period_days;

    @NotNull
    private String last_sent_device_cycle_data;

    @NotNull
    private String last_sent_device_cycle_data_v1;

    @NotNull
    private String last_sent_device_symptom_data;
    private long latest_device_sync_time;

    @NotNull
    private String marked_symptom;

    @NotNull
    private String menstrual_cycle_predictive_data;
    private int period_setting_days;
    private int questionnaire_selected_value;
    private long setting_create_time;
    private long setting_modify_time;
    private boolean switch_auto_end;
    private int switch_auto_end_days;
    private boolean switch_quick_start_closed;
    private boolean switch_remind;
    private long symptomLastSyncTime;
    private int wrist_temperature_tip_last_show_date;
    private int wrist_temperature_tip_last_show_time;
    private int wrist_temperature_tip_show_count;
    public static final int $stable = 8;

    public MenstrualSpConfig() {
        CycleSettingViewModel.ValueType valueType = CycleSettingViewModel.ValueType.UNSET;
        this.cycle_setting_days = valueType.getValue();
        this.period_setting_days = valueType.getValue();
        this.last_period_days = valueType.getValue();
        this.setting_create_time = valueType.getValue();
        this.setting_modify_time = valueType.getValue();
        this.latest_device_sync_time = valueType.getValue();
        this.switch_remind = true;
        this.last_frag_index = 1;
        this.auto_end_card_closed = "";
        this.cycle_correction_closed = "";
        this.marked_symptom = "";
        this.menstrual_cycle_predictive_data = "";
        this.last_sent_device_cycle_data = "";
        this.last_sent_device_cycle_data_v1 = "";
        this.last_sent_device_symptom_data = "";
    }

    public final int getAlgo_cycle__days() {
        return this.algo_cycle__days;
    }

    public final int getAlgo_period_days() {
        return this.algo_period_days;
    }

    @NotNull
    public final String getAuto_end_card_closed() {
        return this.auto_end_card_closed;
    }

    @NotNull
    public final String getCycle_correction_closed() {
        return this.cycle_correction_closed;
    }

    public final int getCycle_setting_days() {
        return this.cycle_setting_days;
    }

    public final int getLast_frag_index() {
        return this.last_frag_index;
    }

    public final long getLast_period_days() {
        return this.last_period_days;
    }

    @NotNull
    public final String getLast_sent_device_cycle_data() {
        return this.last_sent_device_cycle_data;
    }

    @NotNull
    public final String getLast_sent_device_cycle_data_v1() {
        return this.last_sent_device_cycle_data_v1;
    }

    @NotNull
    public final String getLast_sent_device_symptom_data() {
        return this.last_sent_device_symptom_data;
    }

    public final long getLatest_device_sync_time() {
        return this.latest_device_sync_time;
    }

    @NotNull
    public final String getMarked_symptom() {
        return this.marked_symptom;
    }

    @NotNull
    public final String getMenstrual_cycle_predictive_data() {
        return this.menstrual_cycle_predictive_data;
    }

    public final int getPeriod_setting_days() {
        return this.period_setting_days;
    }

    public final int getQuestionnaire_selected_value() {
        return this.questionnaire_selected_value;
    }

    public final long getSetting_create_time() {
        return this.setting_create_time;
    }

    public final long getSetting_modify_time() {
        return this.setting_modify_time;
    }

    public final boolean getSwitch_auto_end() {
        return this.switch_auto_end;
    }

    public final int getSwitch_auto_end_days() {
        return this.switch_auto_end_days;
    }

    public final boolean getSwitch_quick_start_closed() {
        return this.switch_quick_start_closed;
    }

    public final boolean getSwitch_remind() {
        return this.switch_remind;
    }

    public final long getSymptomLastSyncTime() {
        return this.symptomLastSyncTime;
    }

    public final int getWrist_temperature_tip_last_show_date() {
        return this.wrist_temperature_tip_last_show_date;
    }

    public final int getWrist_temperature_tip_last_show_time() {
        return this.wrist_temperature_tip_last_show_time;
    }

    public final int getWrist_temperature_tip_show_count() {
        return this.wrist_temperature_tip_show_count;
    }

    public final void setAlgo_cycle__days(int i) {
        this.algo_cycle__days = i;
    }

    public final void setAlgo_period_days(int i) {
        this.algo_period_days = i;
    }

    public final void setAuto_end_card_closed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.auto_end_card_closed = str;
    }

    public final void setCycle_correction_closed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cycle_correction_closed = str;
    }

    public final void setCycle_setting_days(int i) {
        this.cycle_setting_days = i;
    }

    public final void setLast_frag_index(int i) {
        this.last_frag_index = i;
    }

    public final void setLast_period_days(long j2) {
        this.last_period_days = j2;
    }

    public final void setLast_sent_device_cycle_data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.last_sent_device_cycle_data = str;
    }

    public final void setLast_sent_device_cycle_data_v1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.last_sent_device_cycle_data_v1 = str;
    }

    public final void setLast_sent_device_symptom_data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.last_sent_device_symptom_data = str;
    }

    public final void setLatest_device_sync_time(long j2) {
        this.latest_device_sync_time = j2;
    }

    public final void setMarked_symptom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.marked_symptom = str;
    }

    public final void setMenstrual_cycle_predictive_data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.menstrual_cycle_predictive_data = str;
    }

    public final void setPeriod_setting_days(int i) {
        this.period_setting_days = i;
    }

    public final void setQuestionnaire_selected_value(int i) {
        this.questionnaire_selected_value = i;
    }

    public final void setSetting_create_time(long j2) {
        this.setting_create_time = j2;
    }

    public final void setSetting_modify_time(long j2) {
        this.setting_modify_time = j2;
    }

    public final void setSwitch_auto_end(boolean z) {
        this.switch_auto_end = z;
    }

    public final void setSwitch_auto_end_days(int i) {
        this.switch_auto_end_days = i;
    }

    public final void setSwitch_quick_start_closed(boolean z) {
        this.switch_quick_start_closed = z;
    }

    public final void setSwitch_remind(boolean z) {
        this.switch_remind = z;
    }

    public final void setSymptomLastSyncTime(long j2) {
        this.symptomLastSyncTime = j2;
    }

    public final void setWrist_temperature_tip_last_show_date(int i) {
        this.wrist_temperature_tip_last_show_date = i;
    }

    public final void setWrist_temperature_tip_last_show_time(int i) {
        this.wrist_temperature_tip_last_show_time = i;
    }

    public final void setWrist_temperature_tip_show_count(int i) {
        this.wrist_temperature_tip_show_count = i;
    }
}
