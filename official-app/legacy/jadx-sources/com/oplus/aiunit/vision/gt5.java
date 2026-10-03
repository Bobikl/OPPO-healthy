package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.Metadata;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001\nJ\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000f\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/gt5;", "", "", "tag", "", MapSchema.FIELD_NAME_KEY, "", "i", LogFieldKey.MESSAGE_KEY, "()I", "a", "Ljava/lang/String;", "configDirName", "b", "conditionDirName", "c", "sharePreferenceKey", "d", "I", "networkChangeState", "Landroid/content/SharedPreferences;", MapSchema.FIELD_NAME_ENTRY, "Lkotlin/Lazy;", "j", "()Landroid/content/SharedPreferences;", "spConfig", "Ljava/io/File;", "f", b2n.g, "()Ljava/io/File;", "configDir", b2n.f, "conditionDir", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Companion", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class gt5 {
    public static final Regex i = new Regex("^Nearx_[A-Za-z0-9_-]+@\\d+$");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String configDirName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String conditionDirName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String sharePreferenceKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int networkChangeState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Lazy spConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Lazy configDir;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Lazy conditionDir;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final Context context;

    public static /* synthetic */ void l(gt5 gt5Var, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "DirData";
        }
        gt5Var.k(str, str2);
    }

    public final File g() {
        return (File) this.conditionDir.getValue();
    }

    public final File h() {
        return (File) this.configDir.getValue();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getNetworkChangeState() {
        return this.networkChangeState;
    }

    public final SharedPreferences j() {
        return (SharedPreferences) this.spConfig.getValue();
    }

    public final void k(@NotNull String str, String str2) {
    }

    public final int m() {
        return j().getInt("ProductVersion", 0);
    }
}
