package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/rme;", "", "", "status", "newVersion", "oldVersion", "", "downloadSize", "", "onPluginCheckUpdateResult", "pluginType", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
public interface rme {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull rme rmeVar, int i, int i2) {
        }

        public static void b(@NotNull rme rmeVar, int i, int i2, int i3, long j2) {
        }

        public static void c(@NotNull rme rmeVar) {
        }
    }

    void onPluginCheckUpdateResult(int status, int pluginType);

    void onPluginCheckUpdateResult(int status, int newVersion, int oldVersion, long downloadSize);
}
