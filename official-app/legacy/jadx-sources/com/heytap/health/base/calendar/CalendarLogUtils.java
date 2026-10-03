package com.heytap.health.base.calendar;

import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.annotation.Keep;
import com.heytap.health.hrv.hrv.HrvHistoryActivity;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0002\t\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/heytap/health/base/calendar/CalendarLogUtils;", "", "Landroid/database/Cursor;", "cursor", "", "a", "<init>", "()V", "Companion", "CalendarLog", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class CalendarLogUtils {

    @NotNull
    public static final String TAG = "CalendarLogUtils";

    @Keep
    @Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b¡\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00108J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0005\u0010£\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0016\u0010¤\u0001\u001a\u00030¥\u00012\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010§\u0001\u001a\u00030¨\u0001HÖ\u0001J\n\u0010©\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010:R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010:R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010:R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010:R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010:R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010:R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010:R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010:R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010:R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010:R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010:R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010:R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010:R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010:R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010:R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010:R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010:R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010:R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010:R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010:R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010:R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010:R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010:R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010:R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010:R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010:R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010:R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010:R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010:R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010:R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010:R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010:R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010:R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010:R\u0013\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010:R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010:R\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010:R\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010:R\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010:R\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010:R\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010:R\u0013\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010:R\u0013\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010:R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010:R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010:R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010:¨\u0006ª\u0001"}, d2 = {"Lcom/heytap/health/base/calendar/CalendarLogUtils$CalendarLog;", "", "calendarId", "", "accountType", AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "calendarDisplayName", "syncId", "dirty", "mutators", "lastSynced", "title", "eventLocation", iim.a.f, "eventColor", "eventStatus", "selfAttendStatus", "dtStart", "dtEnd", "eventTimeZone", "duration", HrvHistoryActivity.ALL_DAY, "accessLevel", "availability", "hasAlarm", "hasExtendedProperties", "rrule", "rDate", "exRule", "exDate", "originalId", "originalSyncId", "originalInstanceTime", "originalAllDay", "lastDate", "hasAttendedData", "guestsCanModify", "guestsCanInvitedOthers", "guestsCanSeeGuests", "organizer", "isOrganizer", "deleted", "eventEndTimeZone", "customAppPackage", "customAppUri", "uid2445", "syncData1", "syncData2", "syncData3", "syncData4", "syncData5", "syncData6", "syncData7", "syncData8", "syncData9", "syncData10", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessLevel", "()Ljava/lang/String;", "getAccountName", "getAccountType", "getAllDay", "getAvailability", "getCalendarDisplayName", "getCalendarId", "getCustomAppPackage", "getCustomAppUri", "getDeleted", "getDescription", "getDirty", "getDtEnd", "getDtStart", "getDuration", "getEventColor", "getEventEndTimeZone", "getEventLocation", "getEventStatus", "getEventTimeZone", "getExDate", "getExRule", "getGuestsCanInvitedOthers", "getGuestsCanModify", "getGuestsCanSeeGuests", "getHasAlarm", "getHasAttendedData", "getHasExtendedProperties", "getLastDate", "getLastSynced", "getMutators", "getOrganizer", "getOriginalAllDay", "getOriginalId", "getOriginalInstanceTime", "getOriginalSyncId", "getRDate", "getRrule", "getSelfAttendStatus", "getSyncData1", "getSyncData10", "getSyncData2", "getSyncData3", "getSyncData4", "getSyncData5", "getSyncData6", "getSyncData7", "getSyncData8", "getSyncData9", "getSyncId", "getTitle", "getUid2445", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CalendarLog {

        @Nullable
        private final String accessLevel;

        @Nullable
        private final String accountName;

        @Nullable
        private final String accountType;

        @Nullable
        private final String allDay;

        @Nullable
        private final String availability;

        @Nullable
        private final String calendarDisplayName;

        @Nullable
        private final String calendarId;

        @Nullable
        private final String customAppPackage;

        @Nullable
        private final String customAppUri;

        @Nullable
        private final String deleted;

        @Nullable
        private final String description;

        @Nullable
        private final String dirty;

        @Nullable
        private final String dtEnd;

        @Nullable
        private final String dtStart;

        @Nullable
        private final String duration;

        @Nullable
        private final String eventColor;

        @Nullable
        private final String eventEndTimeZone;

        @Nullable
        private final String eventLocation;

        @Nullable
        private final String eventStatus;

        @Nullable
        private final String eventTimeZone;

        @Nullable
        private final String exDate;

        @Nullable
        private final String exRule;

        @Nullable
        private final String guestsCanInvitedOthers;

        @Nullable
        private final String guestsCanModify;

        @Nullable
        private final String guestsCanSeeGuests;

        @Nullable
        private final String hasAlarm;

        @Nullable
        private final String hasAttendedData;

        @Nullable
        private final String hasExtendedProperties;

        @Nullable
        private final String isOrganizer;

        @Nullable
        private final String lastDate;

        @Nullable
        private final String lastSynced;

        @Nullable
        private final String mutators;

        @Nullable
        private final String organizer;

        @Nullable
        private final String originalAllDay;

        @Nullable
        private final String originalId;

        @Nullable
        private final String originalInstanceTime;

        @Nullable
        private final String originalSyncId;

        @Nullable
        private final String rDate;

        @Nullable
        private final String rrule;

        @Nullable
        private final String selfAttendStatus;

        @Nullable
        private final String syncData1;

        @Nullable
        private final String syncData10;

        @Nullable
        private final String syncData2;

        @Nullable
        private final String syncData3;

        @Nullable
        private final String syncData4;

        @Nullable
        private final String syncData5;

        @Nullable
        private final String syncData6;

        @Nullable
        private final String syncData7;

        @Nullable
        private final String syncData8;

        @Nullable
        private final String syncData9;

        @Nullable
        private final String syncId;

        @Nullable
        private final String title;

        @Nullable
        private final String uid2445;

        public CalendarLog(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48, @Nullable String str49, @Nullable String str50, @Nullable String str51, @Nullable String str52, @Nullable String str53) {
            this.calendarId = str;
            this.accountType = str2;
            this.accountName = str3;
            this.calendarDisplayName = str4;
            this.syncId = str5;
            this.dirty = str6;
            this.mutators = str7;
            this.lastSynced = str8;
            this.title = str9;
            this.eventLocation = str10;
            this.description = str11;
            this.eventColor = str12;
            this.eventStatus = str13;
            this.selfAttendStatus = str14;
            this.dtStart = str15;
            this.dtEnd = str16;
            this.eventTimeZone = str17;
            this.duration = str18;
            this.allDay = str19;
            this.accessLevel = str20;
            this.availability = str21;
            this.hasAlarm = str22;
            this.hasExtendedProperties = str23;
            this.rrule = str24;
            this.rDate = str25;
            this.exRule = str26;
            this.exDate = str27;
            this.originalId = str28;
            this.originalSyncId = str29;
            this.originalInstanceTime = str30;
            this.originalAllDay = str31;
            this.lastDate = str32;
            this.hasAttendedData = str33;
            this.guestsCanModify = str34;
            this.guestsCanInvitedOthers = str35;
            this.guestsCanSeeGuests = str36;
            this.organizer = str37;
            this.isOrganizer = str38;
            this.deleted = str39;
            this.eventEndTimeZone = str40;
            this.customAppPackage = str41;
            this.customAppUri = str42;
            this.uid2445 = str43;
            this.syncData1 = str44;
            this.syncData2 = str45;
            this.syncData3 = str46;
            this.syncData4 = str47;
            this.syncData5 = str48;
            this.syncData6 = str49;
            this.syncData7 = str50;
            this.syncData8 = str51;
            this.syncData9 = str52;
            this.syncData10 = str53;
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCalendarId() {
            return this.calendarId;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getEventLocation() {
            return this.eventLocation;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getEventColor() {
            return this.eventColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getEventStatus() {
            return this.eventStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getSelfAttendStatus() {
            return this.selfAttendStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getDtStart() {
            return this.dtStart;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getDtEnd() {
            return this.dtEnd;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getEventTimeZone() {
            return this.eventTimeZone;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getDuration() {
            return this.duration;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getAllDay() {
            return this.allDay;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getAccessLevel() {
            return this.accessLevel;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getAvailability() {
            return this.availability;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final String getHasAlarm() {
            return this.hasAlarm;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getHasExtendedProperties() {
            return this.hasExtendedProperties;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final String getRrule() {
            return this.rrule;
        }

        @Nullable
        /* JADX INFO: renamed from: component25, reason: from getter */
        public final String getRDate() {
            return this.rDate;
        }

        @Nullable
        /* JADX INFO: renamed from: component26, reason: from getter */
        public final String getExRule() {
            return this.exRule;
        }

        @Nullable
        /* JADX INFO: renamed from: component27, reason: from getter */
        public final String getExDate() {
            return this.exDate;
        }

        @Nullable
        /* JADX INFO: renamed from: component28, reason: from getter */
        public final String getOriginalId() {
            return this.originalId;
        }

        @Nullable
        /* JADX INFO: renamed from: component29, reason: from getter */
        public final String getOriginalSyncId() {
            return this.originalSyncId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        /* JADX INFO: renamed from: component30, reason: from getter */
        public final String getOriginalInstanceTime() {
            return this.originalInstanceTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component31, reason: from getter */
        public final String getOriginalAllDay() {
            return this.originalAllDay;
        }

        @Nullable
        /* JADX INFO: renamed from: component32, reason: from getter */
        public final String getLastDate() {
            return this.lastDate;
        }

        @Nullable
        /* JADX INFO: renamed from: component33, reason: from getter */
        public final String getHasAttendedData() {
            return this.hasAttendedData;
        }

        @Nullable
        /* JADX INFO: renamed from: component34, reason: from getter */
        public final String getGuestsCanModify() {
            return this.guestsCanModify;
        }

        @Nullable
        /* JADX INFO: renamed from: component35, reason: from getter */
        public final String getGuestsCanInvitedOthers() {
            return this.guestsCanInvitedOthers;
        }

        @Nullable
        /* JADX INFO: renamed from: component36, reason: from getter */
        public final String getGuestsCanSeeGuests() {
            return this.guestsCanSeeGuests;
        }

        @Nullable
        /* JADX INFO: renamed from: component37, reason: from getter */
        public final String getOrganizer() {
            return this.organizer;
        }

        @Nullable
        /* JADX INFO: renamed from: component38, reason: from getter */
        public final String getIsOrganizer() {
            return this.isOrganizer;
        }

        @Nullable
        /* JADX INFO: renamed from: component39, reason: from getter */
        public final String getDeleted() {
            return this.deleted;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCalendarDisplayName() {
            return this.calendarDisplayName;
        }

        @Nullable
        /* JADX INFO: renamed from: component40, reason: from getter */
        public final String getEventEndTimeZone() {
            return this.eventEndTimeZone;
        }

        @Nullable
        /* JADX INFO: renamed from: component41, reason: from getter */
        public final String getCustomAppPackage() {
            return this.customAppPackage;
        }

        @Nullable
        /* JADX INFO: renamed from: component42, reason: from getter */
        public final String getCustomAppUri() {
            return this.customAppUri;
        }

        @Nullable
        /* JADX INFO: renamed from: component43, reason: from getter */
        public final String getUid2445() {
            return this.uid2445;
        }

        @Nullable
        /* JADX INFO: renamed from: component44, reason: from getter */
        public final String getSyncData1() {
            return this.syncData1;
        }

        @Nullable
        /* JADX INFO: renamed from: component45, reason: from getter */
        public final String getSyncData2() {
            return this.syncData2;
        }

        @Nullable
        /* JADX INFO: renamed from: component46, reason: from getter */
        public final String getSyncData3() {
            return this.syncData3;
        }

        @Nullable
        /* JADX INFO: renamed from: component47, reason: from getter */
        public final String getSyncData4() {
            return this.syncData4;
        }

        @Nullable
        /* JADX INFO: renamed from: component48, reason: from getter */
        public final String getSyncData5() {
            return this.syncData5;
        }

        @Nullable
        /* JADX INFO: renamed from: component49, reason: from getter */
        public final String getSyncData6() {
            return this.syncData6;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSyncId() {
            return this.syncId;
        }

        @Nullable
        /* JADX INFO: renamed from: component50, reason: from getter */
        public final String getSyncData7() {
            return this.syncData7;
        }

        @Nullable
        /* JADX INFO: renamed from: component51, reason: from getter */
        public final String getSyncData8() {
            return this.syncData8;
        }

        @Nullable
        /* JADX INFO: renamed from: component52, reason: from getter */
        public final String getSyncData9() {
            return this.syncData9;
        }

        @Nullable
        /* JADX INFO: renamed from: component53, reason: from getter */
        public final String getSyncData10() {
            return this.syncData10;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDirty() {
            return this.dirty;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getMutators() {
            return this.mutators;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getLastSynced() {
            return this.lastSynced;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final CalendarLog copy(@Nullable String calendarId, @Nullable String accountType, @Nullable String accountName, @Nullable String calendarDisplayName, @Nullable String syncId, @Nullable String dirty, @Nullable String mutators, @Nullable String lastSynced, @Nullable String title, @Nullable String eventLocation, @Nullable String description, @Nullable String eventColor, @Nullable String eventStatus, @Nullable String selfAttendStatus, @Nullable String dtStart, @Nullable String dtEnd, @Nullable String eventTimeZone, @Nullable String duration, @Nullable String allDay, @Nullable String accessLevel, @Nullable String availability, @Nullable String hasAlarm, @Nullable String hasExtendedProperties, @Nullable String rrule, @Nullable String rDate, @Nullable String exRule, @Nullable String exDate, @Nullable String originalId, @Nullable String originalSyncId, @Nullable String originalInstanceTime, @Nullable String originalAllDay, @Nullable String lastDate, @Nullable String hasAttendedData, @Nullable String guestsCanModify, @Nullable String guestsCanInvitedOthers, @Nullable String guestsCanSeeGuests, @Nullable String organizer, @Nullable String isOrganizer, @Nullable String deleted, @Nullable String eventEndTimeZone, @Nullable String customAppPackage, @Nullable String customAppUri, @Nullable String uid2445, @Nullable String syncData1, @Nullable String syncData2, @Nullable String syncData3, @Nullable String syncData4, @Nullable String syncData5, @Nullable String syncData6, @Nullable String syncData7, @Nullable String syncData8, @Nullable String syncData9, @Nullable String syncData10) {
            return new CalendarLog(calendarId, accountType, accountName, calendarDisplayName, syncId, dirty, mutators, lastSynced, title, eventLocation, description, eventColor, eventStatus, selfAttendStatus, dtStart, dtEnd, eventTimeZone, duration, allDay, accessLevel, availability, hasAlarm, hasExtendedProperties, rrule, rDate, exRule, exDate, originalId, originalSyncId, originalInstanceTime, originalAllDay, lastDate, hasAttendedData, guestsCanModify, guestsCanInvitedOthers, guestsCanSeeGuests, organizer, isOrganizer, deleted, eventEndTimeZone, customAppPackage, customAppUri, uid2445, syncData1, syncData2, syncData3, syncData4, syncData5, syncData6, syncData7, syncData8, syncData9, syncData10);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CalendarLog)) {
                return false;
            }
            CalendarLog calendarLog = (CalendarLog) other;
            return Intrinsics.areEqual(this.calendarId, calendarLog.calendarId) && Intrinsics.areEqual(this.accountType, calendarLog.accountType) && Intrinsics.areEqual(this.accountName, calendarLog.accountName) && Intrinsics.areEqual(this.calendarDisplayName, calendarLog.calendarDisplayName) && Intrinsics.areEqual(this.syncId, calendarLog.syncId) && Intrinsics.areEqual(this.dirty, calendarLog.dirty) && Intrinsics.areEqual(this.mutators, calendarLog.mutators) && Intrinsics.areEqual(this.lastSynced, calendarLog.lastSynced) && Intrinsics.areEqual(this.title, calendarLog.title) && Intrinsics.areEqual(this.eventLocation, calendarLog.eventLocation) && Intrinsics.areEqual(this.description, calendarLog.description) && Intrinsics.areEqual(this.eventColor, calendarLog.eventColor) && Intrinsics.areEqual(this.eventStatus, calendarLog.eventStatus) && Intrinsics.areEqual(this.selfAttendStatus, calendarLog.selfAttendStatus) && Intrinsics.areEqual(this.dtStart, calendarLog.dtStart) && Intrinsics.areEqual(this.dtEnd, calendarLog.dtEnd) && Intrinsics.areEqual(this.eventTimeZone, calendarLog.eventTimeZone) && Intrinsics.areEqual(this.duration, calendarLog.duration) && Intrinsics.areEqual(this.allDay, calendarLog.allDay) && Intrinsics.areEqual(this.accessLevel, calendarLog.accessLevel) && Intrinsics.areEqual(this.availability, calendarLog.availability) && Intrinsics.areEqual(this.hasAlarm, calendarLog.hasAlarm) && Intrinsics.areEqual(this.hasExtendedProperties, calendarLog.hasExtendedProperties) && Intrinsics.areEqual(this.rrule, calendarLog.rrule) && Intrinsics.areEqual(this.rDate, calendarLog.rDate) && Intrinsics.areEqual(this.exRule, calendarLog.exRule) && Intrinsics.areEqual(this.exDate, calendarLog.exDate) && Intrinsics.areEqual(this.originalId, calendarLog.originalId) && Intrinsics.areEqual(this.originalSyncId, calendarLog.originalSyncId) && Intrinsics.areEqual(this.originalInstanceTime, calendarLog.originalInstanceTime) && Intrinsics.areEqual(this.originalAllDay, calendarLog.originalAllDay) && Intrinsics.areEqual(this.lastDate, calendarLog.lastDate) && Intrinsics.areEqual(this.hasAttendedData, calendarLog.hasAttendedData) && Intrinsics.areEqual(this.guestsCanModify, calendarLog.guestsCanModify) && Intrinsics.areEqual(this.guestsCanInvitedOthers, calendarLog.guestsCanInvitedOthers) && Intrinsics.areEqual(this.guestsCanSeeGuests, calendarLog.guestsCanSeeGuests) && Intrinsics.areEqual(this.organizer, calendarLog.organizer) && Intrinsics.areEqual(this.isOrganizer, calendarLog.isOrganizer) && Intrinsics.areEqual(this.deleted, calendarLog.deleted) && Intrinsics.areEqual(this.eventEndTimeZone, calendarLog.eventEndTimeZone) && Intrinsics.areEqual(this.customAppPackage, calendarLog.customAppPackage) && Intrinsics.areEqual(this.customAppUri, calendarLog.customAppUri) && Intrinsics.areEqual(this.uid2445, calendarLog.uid2445) && Intrinsics.areEqual(this.syncData1, calendarLog.syncData1) && Intrinsics.areEqual(this.syncData2, calendarLog.syncData2) && Intrinsics.areEqual(this.syncData3, calendarLog.syncData3) && Intrinsics.areEqual(this.syncData4, calendarLog.syncData4) && Intrinsics.areEqual(this.syncData5, calendarLog.syncData5) && Intrinsics.areEqual(this.syncData6, calendarLog.syncData6) && Intrinsics.areEqual(this.syncData7, calendarLog.syncData7) && Intrinsics.areEqual(this.syncData8, calendarLog.syncData8) && Intrinsics.areEqual(this.syncData9, calendarLog.syncData9) && Intrinsics.areEqual(this.syncData10, calendarLog.syncData10);
        }

        @Nullable
        public final String getAccessLevel() {
            return this.accessLevel;
        }

        @Nullable
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        public final String getAccountType() {
            return this.accountType;
        }

        @Nullable
        public final String getAllDay() {
            return this.allDay;
        }

        @Nullable
        public final String getAvailability() {
            return this.availability;
        }

        @Nullable
        public final String getCalendarDisplayName() {
            return this.calendarDisplayName;
        }

        @Nullable
        public final String getCalendarId() {
            return this.calendarId;
        }

        @Nullable
        public final String getCustomAppPackage() {
            return this.customAppPackage;
        }

        @Nullable
        public final String getCustomAppUri() {
            return this.customAppUri;
        }

        @Nullable
        public final String getDeleted() {
            return this.deleted;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getDirty() {
            return this.dirty;
        }

        @Nullable
        public final String getDtEnd() {
            return this.dtEnd;
        }

        @Nullable
        public final String getDtStart() {
            return this.dtStart;
        }

        @Nullable
        public final String getDuration() {
            return this.duration;
        }

        @Nullable
        public final String getEventColor() {
            return this.eventColor;
        }

        @Nullable
        public final String getEventEndTimeZone() {
            return this.eventEndTimeZone;
        }

        @Nullable
        public final String getEventLocation() {
            return this.eventLocation;
        }

        @Nullable
        public final String getEventStatus() {
            return this.eventStatus;
        }

        @Nullable
        public final String getEventTimeZone() {
            return this.eventTimeZone;
        }

        @Nullable
        public final String getExDate() {
            return this.exDate;
        }

        @Nullable
        public final String getExRule() {
            return this.exRule;
        }

        @Nullable
        public final String getGuestsCanInvitedOthers() {
            return this.guestsCanInvitedOthers;
        }

        @Nullable
        public final String getGuestsCanModify() {
            return this.guestsCanModify;
        }

        @Nullable
        public final String getGuestsCanSeeGuests() {
            return this.guestsCanSeeGuests;
        }

        @Nullable
        public final String getHasAlarm() {
            return this.hasAlarm;
        }

        @Nullable
        public final String getHasAttendedData() {
            return this.hasAttendedData;
        }

        @Nullable
        public final String getHasExtendedProperties() {
            return this.hasExtendedProperties;
        }

        @Nullable
        public final String getLastDate() {
            return this.lastDate;
        }

        @Nullable
        public final String getLastSynced() {
            return this.lastSynced;
        }

        @Nullable
        public final String getMutators() {
            return this.mutators;
        }

        @Nullable
        public final String getOrganizer() {
            return this.organizer;
        }

        @Nullable
        public final String getOriginalAllDay() {
            return this.originalAllDay;
        }

        @Nullable
        public final String getOriginalId() {
            return this.originalId;
        }

        @Nullable
        public final String getOriginalInstanceTime() {
            return this.originalInstanceTime;
        }

        @Nullable
        public final String getOriginalSyncId() {
            return this.originalSyncId;
        }

        @Nullable
        public final String getRDate() {
            return this.rDate;
        }

        @Nullable
        public final String getRrule() {
            return this.rrule;
        }

        @Nullable
        public final String getSelfAttendStatus() {
            return this.selfAttendStatus;
        }

        @Nullable
        public final String getSyncData1() {
            return this.syncData1;
        }

        @Nullable
        public final String getSyncData10() {
            return this.syncData10;
        }

        @Nullable
        public final String getSyncData2() {
            return this.syncData2;
        }

        @Nullable
        public final String getSyncData3() {
            return this.syncData3;
        }

        @Nullable
        public final String getSyncData4() {
            return this.syncData4;
        }

        @Nullable
        public final String getSyncData5() {
            return this.syncData5;
        }

        @Nullable
        public final String getSyncData6() {
            return this.syncData6;
        }

        @Nullable
        public final String getSyncData7() {
            return this.syncData7;
        }

        @Nullable
        public final String getSyncData8() {
            return this.syncData8;
        }

        @Nullable
        public final String getSyncData9() {
            return this.syncData9;
        }

        @Nullable
        public final String getSyncId() {
            return this.syncId;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUid2445() {
            return this.uid2445;
        }

        public int hashCode() {
            String str = this.calendarId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.calendarDisplayName;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.syncId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.dirty;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.mutators;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.lastSynced;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.title;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.eventLocation;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.description;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.eventColor;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.eventStatus;
            int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.selfAttendStatus;
            int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.dtStart;
            int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.dtEnd;
            int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.eventTimeZone;
            int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.duration;
            int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.allDay;
            int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.accessLevel;
            int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.availability;
            int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.hasAlarm;
            int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.hasExtendedProperties;
            int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
            String str24 = this.rrule;
            int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
            String str25 = this.rDate;
            int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
            String str26 = this.exRule;
            int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
            String str27 = this.exDate;
            int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
            String str28 = this.originalId;
            int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
            String str29 = this.originalSyncId;
            int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
            String str30 = this.originalInstanceTime;
            int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
            String str31 = this.originalAllDay;
            int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
            String str32 = this.lastDate;
            int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
            String str33 = this.hasAttendedData;
            int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
            String str34 = this.guestsCanModify;
            int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
            String str35 = this.guestsCanInvitedOthers;
            int iHashCode35 = (iHashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
            String str36 = this.guestsCanSeeGuests;
            int iHashCode36 = (iHashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
            String str37 = this.organizer;
            int iHashCode37 = (iHashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
            String str38 = this.isOrganizer;
            int iHashCode38 = (iHashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
            String str39 = this.deleted;
            int iHashCode39 = (iHashCode38 + (str39 == null ? 0 : str39.hashCode())) * 31;
            String str40 = this.eventEndTimeZone;
            int iHashCode40 = (iHashCode39 + (str40 == null ? 0 : str40.hashCode())) * 31;
            String str41 = this.customAppPackage;
            int iHashCode41 = (iHashCode40 + (str41 == null ? 0 : str41.hashCode())) * 31;
            String str42 = this.customAppUri;
            int iHashCode42 = (iHashCode41 + (str42 == null ? 0 : str42.hashCode())) * 31;
            String str43 = this.uid2445;
            int iHashCode43 = (iHashCode42 + (str43 == null ? 0 : str43.hashCode())) * 31;
            String str44 = this.syncData1;
            int iHashCode44 = (iHashCode43 + (str44 == null ? 0 : str44.hashCode())) * 31;
            String str45 = this.syncData2;
            int iHashCode45 = (iHashCode44 + (str45 == null ? 0 : str45.hashCode())) * 31;
            String str46 = this.syncData3;
            int iHashCode46 = (iHashCode45 + (str46 == null ? 0 : str46.hashCode())) * 31;
            String str47 = this.syncData4;
            int iHashCode47 = (iHashCode46 + (str47 == null ? 0 : str47.hashCode())) * 31;
            String str48 = this.syncData5;
            int iHashCode48 = (iHashCode47 + (str48 == null ? 0 : str48.hashCode())) * 31;
            String str49 = this.syncData6;
            int iHashCode49 = (iHashCode48 + (str49 == null ? 0 : str49.hashCode())) * 31;
            String str50 = this.syncData7;
            int iHashCode50 = (iHashCode49 + (str50 == null ? 0 : str50.hashCode())) * 31;
            String str51 = this.syncData8;
            int iHashCode51 = (iHashCode50 + (str51 == null ? 0 : str51.hashCode())) * 31;
            String str52 = this.syncData9;
            int iHashCode52 = (iHashCode51 + (str52 == null ? 0 : str52.hashCode())) * 31;
            String str53 = this.syncData10;
            return iHashCode52 + (str53 != null ? str53.hashCode() : 0);
        }

        @Nullable
        public final String isOrganizer() {
            return this.isOrganizer;
        }

        @NotNull
        public String toString() {
            return "CalendarLog(calendarId=" + this.calendarId + ", accountType=" + this.accountType + ", accountName=" + this.accountName + ", calendarDisplayName=" + this.calendarDisplayName + ", syncId=" + this.syncId + ", dirty=" + this.dirty + ", mutators=" + this.mutators + ", lastSynced=" + this.lastSynced + ", title=" + this.title + ", eventLocation=" + this.eventLocation + ", description=" + this.description + ", eventColor=" + this.eventColor + ", eventStatus=" + this.eventStatus + ", selfAttendStatus=" + this.selfAttendStatus + ", dtStart=" + this.dtStart + ", dtEnd=" + this.dtEnd + ", eventTimeZone=" + this.eventTimeZone + ", duration=" + this.duration + ", allDay=" + this.allDay + ", accessLevel=" + this.accessLevel + ", availability=" + this.availability + ", hasAlarm=" + this.hasAlarm + ", hasExtendedProperties=" + this.hasExtendedProperties + ", rrule=" + this.rrule + ", rDate=" + this.rDate + ", exRule=" + this.exRule + ", exDate=" + this.exDate + ", originalId=" + this.originalId + ", originalSyncId=" + this.originalSyncId + ", originalInstanceTime=" + this.originalInstanceTime + ", originalAllDay=" + this.originalAllDay + ", lastDate=" + this.lastDate + ", hasAttendedData=" + this.hasAttendedData + ", guestsCanModify=" + this.guestsCanModify + ", guestsCanInvitedOthers=" + this.guestsCanInvitedOthers + ", guestsCanSeeGuests=" + this.guestsCanSeeGuests + ", organizer=" + this.organizer + ", isOrganizer=" + this.isOrganizer + ", deleted=" + this.deleted + ", eventEndTimeZone=" + this.eventEndTimeZone + ", customAppPackage=" + this.customAppPackage + ", customAppUri=" + this.customAppUri + ", uid2445=" + this.uid2445 + ", syncData1=" + this.syncData1 + ", syncData2=" + this.syncData2 + ", syncData3=" + this.syncData3 + ", syncData4=" + this.syncData4 + ", syncData5=" + this.syncData5 + ", syncData6=" + this.syncData6 + ", syncData7=" + this.syncData7 + ", syncData8=" + this.syncData8 + ", syncData9=" + this.syncData9 + ", syncData10=" + this.syncData10 + ")";
        }
    }

    @SuppressLint({"Range"})
    public final void a(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        CalendarLog calendarLog = new CalendarLog(cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("_sync_id")), cursor.getString(cursor.getColumnIndex("account_type")), cursor.getString(cursor.getColumnIndex("account_name")), cursor.getString(cursor.getColumnIndex("calendar_displayName")), cursor.getString(cursor.getColumnIndex("dirty")), cursor.getString(cursor.getColumnIndex("mutators")), cursor.getString(cursor.getColumnIndex("lastSynced")), cursor.getString(cursor.getColumnIndex("title")), cursor.getString(cursor.getColumnIndex("eventLocation")), cursor.getString(cursor.getColumnIndex(iim.a.f)), cursor.getString(cursor.getColumnIndex("eventColor")), cursor.getString(cursor.getColumnIndex("eventStatus")), cursor.getString(cursor.getColumnIndex("selfAttendeeStatus")), cursor.getString(cursor.getColumnIndex("dtstart")), cursor.getString(cursor.getColumnIndex("dtend")), cursor.getString(cursor.getColumnIndex("eventTimezone")), cursor.getString(cursor.getColumnIndex("duration")), cursor.getString(cursor.getColumnIndex(HrvHistoryActivity.ALL_DAY)), cursor.getString(cursor.getColumnIndex("accessLevel")), cursor.getString(cursor.getColumnIndex("availability")), cursor.getString(cursor.getColumnIndex("hasAlarm")), cursor.getString(cursor.getColumnIndex("hasExtendedProperties")), cursor.getString(cursor.getColumnIndex("rrule")), cursor.getString(cursor.getColumnIndex("rdate")), cursor.getString(cursor.getColumnIndex("exrule")), cursor.getString(cursor.getColumnIndex("exdate")), cursor.getString(cursor.getColumnIndex("original_id")), cursor.getString(cursor.getColumnIndex("original_sync_id")), cursor.getString(cursor.getColumnIndex("originalInstanceTime")), cursor.getString(cursor.getColumnIndex("originalAllDay")), cursor.getString(cursor.getColumnIndex("lastDate")), cursor.getString(cursor.getColumnIndex("hasAttendeeData")), cursor.getString(cursor.getColumnIndex("guestsCanModify")), cursor.getString(cursor.getColumnIndex("guestsCanInviteOthers")), cursor.getString(cursor.getColumnIndex("guestsCanSeeGuests")), cursor.getString(cursor.getColumnIndex("organizer")), cursor.getString(cursor.getColumnIndex("isOrganizer")), cursor.getString(cursor.getColumnIndex("deleted")), cursor.getString(cursor.getColumnIndex("eventEndTimezone")), cursor.getString(cursor.getColumnIndex("customAppPackage")), cursor.getString(cursor.getColumnIndex("customAppUri")), cursor.getString(cursor.getColumnIndex("uid2445")), cursor.getString(cursor.getColumnIndex("sync_data1")), cursor.getString(cursor.getColumnIndex("sync_data2")), cursor.getString(cursor.getColumnIndex("sync_data3")), cursor.getString(cursor.getColumnIndex("sync_data4")), cursor.getString(cursor.getColumnIndex("sync_data5")), cursor.getString(cursor.getColumnIndex("sync_data6")), cursor.getString(cursor.getColumnIndex("sync_data7")), cursor.getString(cursor.getColumnIndex("sync_data8")), cursor.getString(cursor.getColumnIndex("sync_data9")), cursor.getString(cursor.getColumnIndex("sync_data10")));
        StringBuilder sb = new StringBuilder();
        sb.append("calendar all msg:");
        sb.append(calendarLog);
    }
}
