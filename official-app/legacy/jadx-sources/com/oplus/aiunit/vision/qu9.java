package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.impl.R$drawable;
import com.heytap.health.device_settings.impl.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/qu9;", "", "", "Lcom/oplus/aiunit/vision/k43;", "a", "Ljava/util/List;", "()Ljava/util/List;", "carouselImages", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class qu9 {

    @NotNull
    public static final qu9 INSTANCE = new qu9();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<k43> carouselImages = CollectionsKt__CollectionsKt.listOf((Object[]) new k43[]{new k43(R$drawable.device_settings_ip_sunyingsha_call_background, R$string.device_settings_shasha_ip_voice_theme_call_background), new k43(R$drawable.device_settings_ip_sunyingsha_outgoing_background, R$string.device_settings_shasha_ip_voice_theme_outgoing_background), new k43(R$drawable.device_settings_ip_sunyingsha_sleep_remind, R$string.device_settings_shasha_ip_voice_theme_sleep_remind), new k43(R$drawable.device_settings_ip_sunyingsha_sedentary_remind, R$string.device_settings_shasha_ip_voice_theme_sedentary_remind), new k43(R$drawable.device_settings_ip_sunyingsha_alarm_clock, R$string.device_settings_shasha_ip_voice_theme_alarm_clock)});
    public static final int $stable = 8;

    @NotNull
    public final List<k43> a() {
        return carouselImages;
    }
}
