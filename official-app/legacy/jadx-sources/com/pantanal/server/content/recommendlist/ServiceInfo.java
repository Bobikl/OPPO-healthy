package com.pantanal.server.content.recommendlist;

import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import com.oplus.utrace.sdk.UTraceContext;
import com.opos.process.bridge.base.BridgeConstant;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0003\bÜ\u0001\b\u0087\b\u0018\u0000 \u0083\u00022\u00020\u0001:\u0002\u0083\u0002Bk\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012Bí\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050(\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030(\u0012\b\b\u0002\u0010*\u001a\u00020\u0005\u0012\b\b\u0002\u0010+\u001a\u00020\u0017\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010-\u001a\u00020\u0005\u0012\b\b\u0002\u0010.\u001a\u00020\u0017\u0012\b\b\u0002\u0010/\u001a\u00020\u0017\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00101\u001a\u00020\r\u0012\b\b\u0002\u00102\u001a\u00020\u0005\u0012\b\b\u0002\u00103\u001a\u00020\r\u0012\b\b\u0002\u00104\u001a\u00020\r\u0012\b\b\u0002\u00105\u001a\u00020\u0005\u0012\b\b\u0002\u00106\u001a\u00020\u0005\u0012\b\b\u0002\u00107\u001a\u00020\t\u0012\b\b\u0002\u00108\u001a\u00020\u0017\u0012\b\b\u0002\u00109\u001a\u00020\u0005\u0012\b\b\u0002\u0010:\u001a\u00020\u0017\u0012\b\b\u0002\u0010;\u001a\u00020\r\u0012\b\b\u0002\u0010<\u001a\u00020\u0005\u0012\b\b\u0002\u0010=\u001a\u00020\u0005\u0012\b\b\u0002\u0010>\u001a\u00020\u0017\u0012\b\b\u0002\u0010?\u001a\u00020\u0005\u0012\b\b\u0002\u0010@\u001a\u00020\u0005\u0012\b\b\u0002\u0010A\u001a\u00020\u0017\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010C\u001a\u00020\u0005\u0012\b\b\u0002\u0010D\u001a\u00020\r¢\u0006\u0002\u0010EJ\n\u0010Á\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0003HÆ\u0003J\u0018\u0010Í\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ñ\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010Ò\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010cJ\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\u0016\u0010Õ\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050(HÆ\u0003J\u0016\u0010Ö\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030(HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0017HÆ\u0003J\u0011\u0010Ú\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010cJ\n\u0010Û\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0017HÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\rHÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010á\u0001\u001a\u00020\rHÆ\u0003J\u0010\u0010â\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\rHÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010å\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\tHÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010è\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010ê\u0001\u001a\u00020\rHÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010í\u0001\u001a\u00020\tHÆ\u0003J\n\u0010î\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0017HÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\rHÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\rHÆ\u0003J\n\u0010ø\u0001\u001a\u00020\rHÆ\u0003J\u0084\u0005\u0010ù\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050(2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030(2\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00172\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020\u00172\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00101\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u00020\r2\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\u00172\b\b\u0002\u00109\u001a\u00020\u00052\b\b\u0002\u0010:\u001a\u00020\u00172\b\b\u0002\u0010;\u001a\u00020\r2\b\b\u0002\u0010<\u001a\u00020\u00052\b\b\u0002\u0010=\u001a\u00020\u00052\b\b\u0002\u0010>\u001a\u00020\u00172\b\b\u0002\u0010?\u001a\u00020\u00052\b\b\u0002\u0010@\u001a\u00020\u00052\b\b\u0002\u0010A\u001a\u00020\u00172\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010C\u001a\u00020\u00052\b\b\u0002\u0010D\u001a\u00020\rHÆ\u0001¢\u0006\u0003\u0010ú\u0001J\u0015\u0010û\u0001\u001a\u00020\u00172\t\u0010ü\u0001\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\n\u0010ý\u0001\u001a\u00020\u0005HÖ\u0001J\u0010\u0010þ\u0001\u001a\u00020\u00172\u0007\u0010ÿ\u0001\u001a\u00020\u0005J\u0010\u0010\u0080\u0002\u001a\u00020\u00172\u0007\u0010\u0081\u0002\u001a\u00020\u0005J\t\u0010\u0082\u0002\u001a\u00020\u0003H\u0016R\u001c\u0010B\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u00102\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010O\"\u0004\bS\u0010QR\u001a\u0010*\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\u001a\u0010=\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010O\"\u0004\bW\u0010QR\u001a\u0010<\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010O\"\u0004\bY\u0010QR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010;\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001e\u0010,\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010A\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010K\"\u0004\bh\u0010MR\u001a\u0010\u0018\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010K\"\u0004\bj\u0010MR\u001a\u0010-\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010O\"\u0004\bl\u0010QR\u001a\u0010>\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010K\"\u0004\bn\u0010MR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010G\"\u0004\bp\u0010IR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010GR\u001e\u0010\"\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\br\u0010c\"\u0004\bs\u0010eR\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010O\"\u0004\bu\u0010QR\u001e\u0010#\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\bv\u0010c\"\u0004\bw\u0010eR\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010G\"\u0004\by\u0010IR\u001a\u0010@\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010O\"\u0004\b{\u0010QR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010K\"\u0004\b|\u0010MR\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010O\"\u0004\b}\u0010QR\u001a\u0010:\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010K\"\u0004\b~\u0010MR\u001a\u0010/\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010K\"\u0004\b\u007f\u0010MR\u001c\u0010.\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010K\"\u0005\b\u0081\u0001\u0010MR\u001e\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010G\"\u0005\b\u0083\u0001\u0010IR\u001c\u00103\u001a\u00020\rX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010_\"\u0005\b\u0085\u0001\u0010aR\u001c\u00101\u001a\u00020\rX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010_\"\u0005\b\u0087\u0001\u0010aR\u001c\u0010?\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010O\"\u0005\b\u0089\u0001\u0010QR\u001e\u00107\u001a\u00020\tX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u00108\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010K\"\u0005\b\u008f\u0001\u0010MR\u001c\u00106\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010O\"\u0005\b\u0091\u0001\u0010QR\u001c\u00104\u001a\u00020\rX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010_\"\u0005\b\u0093\u0001\u0010aR\u001c\u00105\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010O\"\u0005\b\u0095\u0001\u0010QR\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u008b\u0001R\u001e\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010G\"\u0005\b\u0098\u0001\u0010IR\u001c\u0010\u001d\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010O\"\u0005\b\u009a\u0001\u0010QR\u001c\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010O\"\u0005\b\u009c\u0001\u0010QR\u0012\u0010\u0002\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010GR\u001c\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010G\"\u0005\b\u009f\u0001\u0010IR\u001e\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010G\"\u0005\b¡\u0001\u0010IR\u001c\u00109\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010O\"\u0005\b£\u0001\u0010QR\u0012\u0010\u0004\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010OR\u001c\u0010+\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010K\"\u0005\b¦\u0001\u0010MR*\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030(X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050(X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b«\u0001\u0010¨\u0001\"\u0006\b¬\u0001\u0010ª\u0001R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010G\"\u0005\b®\u0001\u0010IR$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R\u0012\u0010\n\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010OR\u001c\u0010C\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010O\"\u0005\bµ\u0001\u0010QR\u001c\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010_\"\u0005\b·\u0001\u0010aR\u001c\u0010D\u001a\u00020\rX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010_\"\u0005\b¹\u0001\u0010aR\u001c\u0010\u001e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010O\"\u0005\b»\u0001\u0010QR \u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R\u0012\u0010\u000e\u001a\u00020\r¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010_¨\u0006\u0084\u0002"}, d2 = {"Lcom/pantanal/server/content/recommendlist/ServiceInfo;", "Ljava/io/Serializable;", "serviceId", "", "serviceType", "", "supportCardSizes", "", "score", "", "supportEntrance", "initData", SpeechConstant.KEY_TTS_TIMESTAMP, "", "versionCode", BridgeConstant.KEY_EXTRAS, "Landroid/util/ArrayMap;", "", "(Ljava/lang/String;ILjava/util/List;FILjava/lang/String;JJLandroid/util/ArrayMap;)V", "serviceInstanceId", "subdomain", "isParamsSendToSeedling", "cannotReduceRecommend", "", "forceRebuild", "serviceCategory", "channelType", "intentCategory", "isGuaranteedCard", "seedlingType", "useTemplate", "hostPackage", "seedlingCardOptions", "intentParams", "instanceId", "intentId", "policy", "utraceContext", "Lcom/oplus/utrace/sdk/UTraceContext;", "sizeToCardType", "", "sizeToCardConfig", "cloudRemindSwitch", JsonToSeedlingCardOptionsConvertor.KEY_SHOULD_FOCUS_IN_UPK, JsonToSeedlingCardOptionsConvertor.KEY_FOCUS_TIMESTAMP_IN_UPK, "groupPriority", "needToWaitCardData", Constants.IS_SUPPORT_MULTI_INSTANCE, "serviceLevel", "sceneId", "cardSleeveType", "sceneCreateTime", "sceneUpdateTime", "sceneWeight", "sceneStatus", "sceneScore", "sceneShouldFocus", "serviceStatus", "isSceneFocus", "focusTime", "expectSceneCnt", "combinationStrategy", "homeFlag", "sceneLevel", "intentPosition", "forceGuaranteed", "brandCode", "switchType", "updateTime", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;FILjava/lang/String;JJLjava/lang/String;IZZIIIZIILandroid/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/oplus/utrace/sdk/UTraceContext;Ljava/util/Map;Ljava/util/Map;IZLjava/lang/Long;IZZLjava/lang/String;JIJJIIFZIZJIIZIIZLjava/lang/String;IJ)V", "getBrandCode", "()Ljava/lang/String;", "setBrandCode", "(Ljava/lang/String;)V", "getCannotReduceRecommend", "()Z", "setCannotReduceRecommend", "(Z)V", "getCardSleeveType", "()I", "setCardSleeveType", "(I)V", "getChannelType", "setChannelType", "getCloudRemindSwitch", "setCloudRemindSwitch", "getCombinationStrategy", "setCombinationStrategy", "getExpectSceneCnt", "setExpectSceneCnt", "getExtras", "()Landroid/util/ArrayMap;", "setExtras", "(Landroid/util/ArrayMap;)V", "getFocusTime", "()J", "setFocusTime", "(J)V", "getFocusTimestamp", "()Ljava/lang/Long;", "setFocusTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getForceGuaranteed", "setForceGuaranteed", "getForceRebuild", "setForceRebuild", "getGroupPriority", "setGroupPriority", "getHomeFlag", "setHomeFlag", "getHostPackage", "setHostPackage", "getInitData", "getInstanceId", "setInstanceId", "getIntentCategory", "setIntentCategory", "getIntentId", "setIntentId", "getIntentParams", "setIntentParams", "getIntentPosition", "setIntentPosition", "setGuaranteedCard", "setParamsSendToSeedling", "setSceneFocus", "setSupportMultiInstance", "getNeedToWaitCardData", "setNeedToWaitCardData", "getPolicy", "setPolicy", "getSceneCreateTime", "setSceneCreateTime", "getSceneId", "setSceneId", "getSceneLevel", "setSceneLevel", "getSceneScore", "()F", "setSceneScore", "(F)V", "getSceneShouldFocus", "setSceneShouldFocus", "getSceneStatus", "setSceneStatus", "getSceneUpdateTime", "setSceneUpdateTime", "getSceneWeight", "setSceneWeight", "getScore", "getSeedlingCardOptions", "setSeedlingCardOptions", "getSeedlingType", "setSeedlingType", "getServiceCategory", "setServiceCategory", "getServiceId", "getServiceInstanceId", "setServiceInstanceId", "getServiceLevel", "setServiceLevel", "getServiceStatus", "setServiceStatus", "getServiceType", "getShouldFocus", "setShouldFocus", "getSizeToCardConfig", "()Ljava/util/Map;", "setSizeToCardConfig", "(Ljava/util/Map;)V", "getSizeToCardType", "setSizeToCardType", "getSubdomain", "setSubdomain", "getSupportCardSizes", "()Ljava/util/List;", "setSupportCardSizes", "(Ljava/util/List;)V", "getSupportEntrance", "getSwitchType", "setSwitchType", "getTimeStamp", "setTimeStamp", "getUpdateTime", "setUpdateTime", "getUseTemplate", "setUseTemplate", "getUtraceContext", "()Lcom/oplus/utrace/sdk/UTraceContext;", "setUtraceContext", "(Lcom/oplus/utrace/sdk/UTraceContext;)V", "getVersionCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;FILjava/lang/String;JJLjava/lang/String;IZZIIIZIILandroid/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/oplus/utrace/sdk/UTraceContext;Ljava/util/Map;Ljava/util/Map;IZLjava/lang/Long;IZZLjava/lang/String;JIJJIIFZIZJIIZIIZLjava/lang/String;IJ)Lcom/pantanal/server/content/recommendlist/ServiceInfo;", "equals", "other", "hashCode", "isSupportEntrance", "entranceType", "isSupportSize", "size", "toString", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ServiceInfo implements Serializable {

    @NotNull
    private static final String KEY_FEEDBACK_CONFIG = "feedback_config";

    @NotNull
    private static final String KEY_INTENT_FEEDBACK_TYPE = "intent_feedback_type";

    @NotNull
    private static final String KEY_TRACE_ID = "trace_id";
    private static final long serialVersionUID = 1;

    @Nullable
    private String brandCode;
    private boolean cannotReduceRecommend;
    private int cardSleeveType;
    private int channelType;
    private int cloudRemindSwitch;
    private int combinationStrategy;
    private int expectSceneCnt;

    @Nullable
    private ArrayMap<String, Object> extras;
    private long focusTime;

    @Nullable
    private Long focusTimestamp;
    private boolean forceGuaranteed;
    private boolean forceRebuild;
    private int groupPriority;
    private boolean homeFlag;

    @Nullable
    private String hostPackage;

    @Nullable
    private final String initData;

    @Nullable
    private Long instanceId;
    private int intentCategory;

    @Nullable
    private Long intentId;

    @Nullable
    private String intentParams;
    private int intentPosition;
    private boolean isGuaranteedCard;
    private int isParamsSendToSeedling;
    private boolean isSceneFocus;
    private boolean isSupportMultiInstance;
    private boolean needToWaitCardData;

    @Nullable
    private String policy;
    private long sceneCreateTime;
    private long sceneId;
    private int sceneLevel;
    private float sceneScore;
    private boolean sceneShouldFocus;
    private int sceneStatus;
    private long sceneUpdateTime;
    private int sceneWeight;
    private final float score;

    @Nullable
    private String seedlingCardOptions;
    private int seedlingType;
    private int serviceCategory;

    @NotNull
    private final String serviceId;

    @NotNull
    private String serviceInstanceId;

    @Nullable
    private String serviceLevel;
    private int serviceStatus;
    private final int serviceType;
    private boolean shouldFocus;

    @NotNull
    private Map<Integer, String> sizeToCardConfig;

    @NotNull
    private Map<Integer, Integer> sizeToCardType;

    @Nullable
    private String subdomain;

    @NotNull
    private List<Integer> supportCardSizes;
    private final int supportEntrance;
    private int switchType;
    private long timeStamp;
    private long updateTime;
    private int useTemplate;

    @Nullable
    private UTraceContext utraceContext;
    private final long versionCode;

    public ServiceInfo(@NotNull String serviceId, @NotNull String serviceInstanceId, int i, @NotNull List<Integer> supportCardSizes, float f, int i2, @Nullable String str, long j2, long j3, @Nullable String str2, int i3, boolean z, boolean z2, int i4, int i5, int i6, boolean z3, int i7, int i8, @Nullable ArrayMap<String, Object> arrayMap, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l2, @Nullable Long l3, @Nullable String str6, @Nullable UTraceContext uTraceContext, @NotNull Map<Integer, Integer> sizeToCardType, @NotNull Map<Integer, String> sizeToCardConfig, int i9, boolean z4, @Nullable Long l4, int i10, boolean z5, boolean z6, @Nullable String str7, long j4, int i11, long j5, long j6, int i12, int i13, float f2, boolean z7, int i14, boolean z8, long j7, int i15, int i16, boolean z9, int i17, int i18, boolean z10, @Nullable String str8, int i19, long j8) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(serviceInstanceId, "serviceInstanceId");
        Intrinsics.checkNotNullParameter(supportCardSizes, "supportCardSizes");
        Intrinsics.checkNotNullParameter(sizeToCardType, "sizeToCardType");
        Intrinsics.checkNotNullParameter(sizeToCardConfig, "sizeToCardConfig");
        this.serviceId = serviceId;
        this.serviceInstanceId = serviceInstanceId;
        this.serviceType = i;
        this.supportCardSizes = supportCardSizes;
        this.score = f;
        this.supportEntrance = i2;
        this.initData = str;
        this.timeStamp = j2;
        this.versionCode = j3;
        this.subdomain = str2;
        this.isParamsSendToSeedling = i3;
        this.cannotReduceRecommend = z;
        this.forceRebuild = z2;
        this.serviceCategory = i4;
        this.channelType = i5;
        this.intentCategory = i6;
        this.isGuaranteedCard = z3;
        this.seedlingType = i7;
        this.useTemplate = i8;
        this.extras = arrayMap;
        this.hostPackage = str3;
        this.seedlingCardOptions = str4;
        this.intentParams = str5;
        this.instanceId = l2;
        this.intentId = l3;
        this.policy = str6;
        this.utraceContext = uTraceContext;
        this.sizeToCardType = sizeToCardType;
        this.sizeToCardConfig = sizeToCardConfig;
        this.cloudRemindSwitch = i9;
        this.shouldFocus = z4;
        this.focusTimestamp = l4;
        this.groupPriority = i10;
        this.needToWaitCardData = z5;
        this.isSupportMultiInstance = z6;
        this.serviceLevel = str7;
        this.sceneId = j4;
        this.cardSleeveType = i11;
        this.sceneCreateTime = j5;
        this.sceneUpdateTime = j6;
        this.sceneWeight = i12;
        this.sceneStatus = i13;
        this.sceneScore = f2;
        this.sceneShouldFocus = z7;
        this.serviceStatus = i14;
        this.isSceneFocus = z8;
        this.focusTime = j7;
        this.expectSceneCnt = i15;
        this.combinationStrategy = i16;
        this.homeFlag = z9;
        this.sceneLevel = i17;
        this.intentPosition = i18;
        this.forceGuaranteed = z10;
        this.brandCode = str8;
        this.switchType = i19;
        this.updateTime = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceInfo copy$default(ServiceInfo serviceInfo, String str, String str2, int i, List list, float f, int i2, String str3, long j2, long j3, String str4, int i3, boolean z, boolean z2, int i4, int i5, int i6, boolean z3, int i7, int i8, ArrayMap arrayMap, String str5, String str6, String str7, Long l2, Long l3, String str8, UTraceContext uTraceContext, Map map, Map map2, int i9, boolean z4, Long l4, int i10, boolean z5, boolean z6, String str9, long j4, int i11, long j5, long j6, int i12, int i13, float f2, boolean z7, int i14, boolean z8, long j7, int i15, int i16, boolean z9, int i17, int i18, boolean z10, String str10, int i19, long j8, int i20, int i21, Object obj) {
        String str11 = (i20 & 1) != 0 ? serviceInfo.serviceId : str;
        String str12 = (i20 & 2) != 0 ? serviceInfo.serviceInstanceId : str2;
        int i22 = (i20 & 4) != 0 ? serviceInfo.serviceType : i;
        List list2 = (i20 & 8) != 0 ? serviceInfo.supportCardSizes : list;
        float f3 = (i20 & 16) != 0 ? serviceInfo.score : f;
        int i23 = (i20 & 32) != 0 ? serviceInfo.supportEntrance : i2;
        String str13 = (i20 & 64) != 0 ? serviceInfo.initData : str3;
        long j9 = (i20 & 128) != 0 ? serviceInfo.timeStamp : j2;
        long j10 = (i20 & 256) != 0 ? serviceInfo.versionCode : j3;
        String str14 = (i20 & 512) != 0 ? serviceInfo.subdomain : str4;
        int i24 = (i20 & 1024) != 0 ? serviceInfo.isParamsSendToSeedling : i3;
        boolean z11 = (i20 & 2048) != 0 ? serviceInfo.cannotReduceRecommend : z;
        boolean z12 = (i20 & 4096) != 0 ? serviceInfo.forceRebuild : z2;
        int i25 = (i20 & 8192) != 0 ? serviceInfo.serviceCategory : i4;
        int i26 = (i20 & 16384) != 0 ? serviceInfo.channelType : i5;
        int i27 = (i20 & 32768) != 0 ? serviceInfo.intentCategory : i6;
        boolean z13 = (i20 & 65536) != 0 ? serviceInfo.isGuaranteedCard : z3;
        int i28 = (i20 & 131072) != 0 ? serviceInfo.seedlingType : i7;
        int i29 = (i20 & 262144) != 0 ? serviceInfo.useTemplate : i8;
        ArrayMap arrayMap2 = (i20 & 524288) != 0 ? serviceInfo.extras : arrayMap;
        String str15 = (i20 & 1048576) != 0 ? serviceInfo.hostPackage : str5;
        String str16 = (i20 & 2097152) != 0 ? serviceInfo.seedlingCardOptions : str6;
        String str17 = (i20 & 4194304) != 0 ? serviceInfo.intentParams : str7;
        Long l5 = (i20 & 8388608) != 0 ? serviceInfo.instanceId : l2;
        Long l6 = (i20 & 16777216) != 0 ? serviceInfo.intentId : l3;
        String str18 = (i20 & 33554432) != 0 ? serviceInfo.policy : str8;
        UTraceContext uTraceContext2 = (i20 & 67108864) != 0 ? serviceInfo.utraceContext : uTraceContext;
        Map map3 = (i20 & 134217728) != 0 ? serviceInfo.sizeToCardType : map;
        Map map4 = (i20 & 268435456) != 0 ? serviceInfo.sizeToCardConfig : map2;
        int i30 = (i20 & 536870912) != 0 ? serviceInfo.cloudRemindSwitch : i9;
        boolean z14 = (i20 & 1073741824) != 0 ? serviceInfo.shouldFocus : z4;
        Long l7 = (i20 & Integer.MIN_VALUE) != 0 ? serviceInfo.focusTimestamp : l4;
        int i31 = (i21 & 1) != 0 ? serviceInfo.groupPriority : i10;
        boolean z15 = (i21 & 2) != 0 ? serviceInfo.needToWaitCardData : z5;
        boolean z16 = (i21 & 4) != 0 ? serviceInfo.isSupportMultiInstance : z6;
        String str19 = (i21 & 8) != 0 ? serviceInfo.serviceLevel : str9;
        String str20 = str14;
        boolean z17 = z14;
        long j11 = (i21 & 16) != 0 ? serviceInfo.sceneId : j4;
        int i32 = (i21 & 32) != 0 ? serviceInfo.cardSleeveType : i11;
        long j12 = (i21 & 64) != 0 ? serviceInfo.sceneCreateTime : j5;
        long j13 = (i21 & 128) != 0 ? serviceInfo.sceneUpdateTime : j6;
        int i33 = (i21 & 256) != 0 ? serviceInfo.sceneWeight : i12;
        return serviceInfo.copy(str11, str12, i22, list2, f3, i23, str13, j9, j10, str20, i24, z11, z12, i25, i26, i27, z13, i28, i29, arrayMap2, str15, str16, str17, l5, l6, str18, uTraceContext2, map3, map4, i30, z17, l7, i31, z15, z16, str19, j11, i32, j12, j13, i33, (i21 & 512) != 0 ? serviceInfo.sceneStatus : i13, (i21 & 1024) != 0 ? serviceInfo.sceneScore : f2, (i21 & 2048) != 0 ? serviceInfo.sceneShouldFocus : z7, (i21 & 4096) != 0 ? serviceInfo.serviceStatus : i14, (i21 & 8192) != 0 ? serviceInfo.isSceneFocus : z8, (i21 & 16384) != 0 ? serviceInfo.focusTime : j7, (i21 & 32768) != 0 ? serviceInfo.expectSceneCnt : i15, (i21 & 65536) != 0 ? serviceInfo.combinationStrategy : i16, (i21 & 131072) != 0 ? serviceInfo.homeFlag : z9, (i21 & 262144) != 0 ? serviceInfo.sceneLevel : i17, (i21 & 524288) != 0 ? serviceInfo.intentPosition : i18, (i21 & 1048576) != 0 ? serviceInfo.forceGuaranteed : z10, (i21 & 2097152) != 0 ? serviceInfo.brandCode : str10, (i21 & 4194304) != 0 ? serviceInfo.switchType : i19, (i21 & 8388608) != 0 ? serviceInfo.updateTime : j8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubdomain() {
        return this.subdomain;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getIsParamsSendToSeedling() {
        return this.isParamsSendToSeedling;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getCannotReduceRecommend() {
        return this.cannotReduceRecommend;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getForceRebuild() {
        return this.forceRebuild;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getServiceCategory() {
        return this.serviceCategory;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getIntentCategory() {
        return this.intentCategory;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsGuaranteedCard() {
        return this.isGuaranteedCard;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getSeedlingType() {
        return this.seedlingType;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getUseTemplate() {
        return this.useTemplate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    @Nullable
    public final ArrayMap<String, Object> component20() {
        return this.extras;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getHostPackage() {
        return this.hostPackage;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSeedlingCardOptions() {
        return this.seedlingCardOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getIntentParams() {
        return this.intentParams;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Long getInstanceId() {
        return this.instanceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Long getIntentId() {
        return this.intentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPolicy() {
        return this.policy;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final UTraceContext getUtraceContext() {
        return this.utraceContext;
    }

    @NotNull
    public final Map<Integer, Integer> component28() {
        return this.sizeToCardType;
    }

    @NotNull
    public final Map<Integer, String> component29() {
        return this.sizeToCardConfig;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getServiceType() {
        return this.serviceType;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getCloudRemindSwitch() {
        return this.cloudRemindSwitch;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Long getFocusTimestamp() {
        return this.focusTimestamp;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final int getGroupPriority() {
        return this.groupPriority;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getNeedToWaitCardData() {
        return this.needToWaitCardData;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final boolean getIsSupportMultiInstance() {
        return this.isSupportMultiInstance;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getServiceLevel() {
        return this.serviceLevel;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final long getSceneId() {
        return this.sceneId;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final int getCardSleeveType() {
        return this.cardSleeveType;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final long getSceneCreateTime() {
        return this.sceneCreateTime;
    }

    @NotNull
    public final List<Integer> component4() {
        return this.supportCardSizes;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final long getSceneUpdateTime() {
        return this.sceneUpdateTime;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final int getSceneWeight() {
        return this.sceneWeight;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final int getSceneStatus() {
        return this.sceneStatus;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final float getSceneScore() {
        return this.sceneScore;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final boolean getSceneShouldFocus() {
        return this.sceneShouldFocus;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final int getServiceStatus() {
        return this.serviceStatus;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final boolean getIsSceneFocus() {
        return this.isSceneFocus;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final long getFocusTime() {
        return this.focusTime;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final int getExpectSceneCnt() {
        return this.expectSceneCnt;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final int getCombinationStrategy() {
        return this.combinationStrategy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final boolean getHomeFlag() {
        return this.homeFlag;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final int getSceneLevel() {
        return this.sceneLevel;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final int getIntentPosition() {
        return this.intentPosition;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final boolean getForceGuaranteed() {
        return this.forceGuaranteed;
    }

    @Nullable
    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getBrandCode() {
        return this.brandCode;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final int getSwitchType() {
        return this.switchType;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSupportEntrance() {
        return this.supportEntrance;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInitData() {
        return this.initData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final ServiceInfo copy(@NotNull String serviceId, @NotNull String serviceInstanceId, int serviceType, @NotNull List<Integer> supportCardSizes, float score, int supportEntrance, @Nullable String initData, long timeStamp, long versionCode, @Nullable String subdomain, int isParamsSendToSeedling, boolean cannotReduceRecommend, boolean forceRebuild, int serviceCategory, int channelType, int intentCategory, boolean isGuaranteedCard, int seedlingType, int useTemplate, @Nullable ArrayMap<String, Object> extras, @Nullable String hostPackage, @Nullable String seedlingCardOptions, @Nullable String intentParams, @Nullable Long instanceId, @Nullable Long intentId, @Nullable String policy, @Nullable UTraceContext utraceContext, @NotNull Map<Integer, Integer> sizeToCardType, @NotNull Map<Integer, String> sizeToCardConfig, int cloudRemindSwitch, boolean shouldFocus, @Nullable Long focusTimestamp, int groupPriority, boolean needToWaitCardData, boolean isSupportMultiInstance, @Nullable String serviceLevel, long sceneId, int cardSleeveType, long sceneCreateTime, long sceneUpdateTime, int sceneWeight, int sceneStatus, float sceneScore, boolean sceneShouldFocus, int serviceStatus, boolean isSceneFocus, long focusTime, int expectSceneCnt, int combinationStrategy, boolean homeFlag, int sceneLevel, int intentPosition, boolean forceGuaranteed, @Nullable String brandCode, int switchType, long updateTime) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(serviceInstanceId, "serviceInstanceId");
        Intrinsics.checkNotNullParameter(supportCardSizes, "supportCardSizes");
        Intrinsics.checkNotNullParameter(sizeToCardType, "sizeToCardType");
        Intrinsics.checkNotNullParameter(sizeToCardConfig, "sizeToCardConfig");
        return new ServiceInfo(serviceId, serviceInstanceId, serviceType, supportCardSizes, score, supportEntrance, initData, timeStamp, versionCode, subdomain, isParamsSendToSeedling, cannotReduceRecommend, forceRebuild, serviceCategory, channelType, intentCategory, isGuaranteedCard, seedlingType, useTemplate, extras, hostPackage, seedlingCardOptions, intentParams, instanceId, intentId, policy, utraceContext, sizeToCardType, sizeToCardConfig, cloudRemindSwitch, shouldFocus, focusTimestamp, groupPriority, needToWaitCardData, isSupportMultiInstance, serviceLevel, sceneId, cardSleeveType, sceneCreateTime, sceneUpdateTime, sceneWeight, sceneStatus, sceneScore, sceneShouldFocus, serviceStatus, isSceneFocus, focusTime, expectSceneCnt, combinationStrategy, homeFlag, sceneLevel, intentPosition, forceGuaranteed, brandCode, switchType, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceInfo)) {
            return false;
        }
        ServiceInfo serviceInfo = (ServiceInfo) other;
        return Intrinsics.areEqual(this.serviceId, serviceInfo.serviceId) && Intrinsics.areEqual(this.serviceInstanceId, serviceInfo.serviceInstanceId) && this.serviceType == serviceInfo.serviceType && Intrinsics.areEqual(this.supportCardSizes, serviceInfo.supportCardSizes) && Intrinsics.areEqual((Object) Float.valueOf(this.score), (Object) Float.valueOf(serviceInfo.score)) && this.supportEntrance == serviceInfo.supportEntrance && Intrinsics.areEqual(this.initData, serviceInfo.initData) && this.timeStamp == serviceInfo.timeStamp && this.versionCode == serviceInfo.versionCode && Intrinsics.areEqual(this.subdomain, serviceInfo.subdomain) && this.isParamsSendToSeedling == serviceInfo.isParamsSendToSeedling && this.cannotReduceRecommend == serviceInfo.cannotReduceRecommend && this.forceRebuild == serviceInfo.forceRebuild && this.serviceCategory == serviceInfo.serviceCategory && this.channelType == serviceInfo.channelType && this.intentCategory == serviceInfo.intentCategory && this.isGuaranteedCard == serviceInfo.isGuaranteedCard && this.seedlingType == serviceInfo.seedlingType && this.useTemplate == serviceInfo.useTemplate && Intrinsics.areEqual(this.extras, serviceInfo.extras) && Intrinsics.areEqual(this.hostPackage, serviceInfo.hostPackage) && Intrinsics.areEqual(this.seedlingCardOptions, serviceInfo.seedlingCardOptions) && Intrinsics.areEqual(this.intentParams, serviceInfo.intentParams) && Intrinsics.areEqual(this.instanceId, serviceInfo.instanceId) && Intrinsics.areEqual(this.intentId, serviceInfo.intentId) && Intrinsics.areEqual(this.policy, serviceInfo.policy) && Intrinsics.areEqual(this.utraceContext, serviceInfo.utraceContext) && Intrinsics.areEqual(this.sizeToCardType, serviceInfo.sizeToCardType) && Intrinsics.areEqual(this.sizeToCardConfig, serviceInfo.sizeToCardConfig) && this.cloudRemindSwitch == serviceInfo.cloudRemindSwitch && this.shouldFocus == serviceInfo.shouldFocus && Intrinsics.areEqual(this.focusTimestamp, serviceInfo.focusTimestamp) && this.groupPriority == serviceInfo.groupPriority && this.needToWaitCardData == serviceInfo.needToWaitCardData && this.isSupportMultiInstance == serviceInfo.isSupportMultiInstance && Intrinsics.areEqual(this.serviceLevel, serviceInfo.serviceLevel) && this.sceneId == serviceInfo.sceneId && this.cardSleeveType == serviceInfo.cardSleeveType && this.sceneCreateTime == serviceInfo.sceneCreateTime && this.sceneUpdateTime == serviceInfo.sceneUpdateTime && this.sceneWeight == serviceInfo.sceneWeight && this.sceneStatus == serviceInfo.sceneStatus && Intrinsics.areEqual((Object) Float.valueOf(this.sceneScore), (Object) Float.valueOf(serviceInfo.sceneScore)) && this.sceneShouldFocus == serviceInfo.sceneShouldFocus && this.serviceStatus == serviceInfo.serviceStatus && this.isSceneFocus == serviceInfo.isSceneFocus && this.focusTime == serviceInfo.focusTime && this.expectSceneCnt == serviceInfo.expectSceneCnt && this.combinationStrategy == serviceInfo.combinationStrategy && this.homeFlag == serviceInfo.homeFlag && this.sceneLevel == serviceInfo.sceneLevel && this.intentPosition == serviceInfo.intentPosition && this.forceGuaranteed == serviceInfo.forceGuaranteed && Intrinsics.areEqual(this.brandCode, serviceInfo.brandCode) && this.switchType == serviceInfo.switchType && this.updateTime == serviceInfo.updateTime;
    }

    @Nullable
    public final String getBrandCode() {
        return this.brandCode;
    }

    public final boolean getCannotReduceRecommend() {
        return this.cannotReduceRecommend;
    }

    public final int getCardSleeveType() {
        return this.cardSleeveType;
    }

    public final int getChannelType() {
        return this.channelType;
    }

    public final int getCloudRemindSwitch() {
        return this.cloudRemindSwitch;
    }

    public final int getCombinationStrategy() {
        return this.combinationStrategy;
    }

    public final int getExpectSceneCnt() {
        return this.expectSceneCnt;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtras() {
        return this.extras;
    }

    public final long getFocusTime() {
        return this.focusTime;
    }

    @Nullable
    public final Long getFocusTimestamp() {
        return this.focusTimestamp;
    }

    public final boolean getForceGuaranteed() {
        return this.forceGuaranteed;
    }

    public final boolean getForceRebuild() {
        return this.forceRebuild;
    }

    public final int getGroupPriority() {
        return this.groupPriority;
    }

    public final boolean getHomeFlag() {
        return this.homeFlag;
    }

    @Nullable
    public final String getHostPackage() {
        return this.hostPackage;
    }

    @Nullable
    public final String getInitData() {
        return this.initData;
    }

    @Nullable
    public final Long getInstanceId() {
        return this.instanceId;
    }

    public final int getIntentCategory() {
        return this.intentCategory;
    }

    @Nullable
    public final Long getIntentId() {
        return this.intentId;
    }

    @Nullable
    public final String getIntentParams() {
        return this.intentParams;
    }

    public final int getIntentPosition() {
        return this.intentPosition;
    }

    public final boolean getNeedToWaitCardData() {
        return this.needToWaitCardData;
    }

    @Nullable
    public final String getPolicy() {
        return this.policy;
    }

    public final long getSceneCreateTime() {
        return this.sceneCreateTime;
    }

    public final long getSceneId() {
        return this.sceneId;
    }

    public final int getSceneLevel() {
        return this.sceneLevel;
    }

    public final float getSceneScore() {
        return this.sceneScore;
    }

    public final boolean getSceneShouldFocus() {
        return this.sceneShouldFocus;
    }

    public final int getSceneStatus() {
        return this.sceneStatus;
    }

    public final long getSceneUpdateTime() {
        return this.sceneUpdateTime;
    }

    public final int getSceneWeight() {
        return this.sceneWeight;
    }

    public final float getScore() {
        return this.score;
    }

    @Nullable
    public final String getSeedlingCardOptions() {
        return this.seedlingCardOptions;
    }

    public final int getSeedlingType() {
        return this.seedlingType;
    }

    public final int getServiceCategory() {
        return this.serviceCategory;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    public final String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    @Nullable
    public final String getServiceLevel() {
        return this.serviceLevel;
    }

    public final int getServiceStatus() {
        return this.serviceStatus;
    }

    public final int getServiceType() {
        return this.serviceType;
    }

    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    @NotNull
    public final Map<Integer, String> getSizeToCardConfig() {
        return this.sizeToCardConfig;
    }

    @NotNull
    public final Map<Integer, Integer> getSizeToCardType() {
        return this.sizeToCardType;
    }

    @Nullable
    public final String getSubdomain() {
        return this.subdomain;
    }

    @NotNull
    public final List<Integer> getSupportCardSizes() {
        return this.supportCardSizes;
    }

    public final int getSupportEntrance() {
        return this.supportEntrance;
    }

    public final int getSwitchType() {
        return this.switchType;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getUseTemplate() {
        return this.useTemplate;
    }

    @Nullable
    public final UTraceContext getUtraceContext() {
        return this.utraceContext;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v103, types: [int] */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v129 */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r1v135 */
    /* JADX WARN: Type inference failed for: r1v136 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r1v140 */
    /* JADX WARN: Type inference failed for: r1v141 */
    /* JADX WARN: Type inference failed for: r1v142 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v67, types: [int] */
    /* JADX WARN: Type inference failed for: r1v74, types: [int] */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v92, types: [int] */
    /* JADX WARN: Type inference failed for: r1v96, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((((((((this.serviceId.hashCode() * 31) + this.serviceInstanceId.hashCode()) * 31) + Integer.hashCode(this.serviceType)) * 31) + this.supportCardSizes.hashCode()) * 31) + Float.hashCode(this.score)) * 31) + Integer.hashCode(this.supportEntrance)) * 31;
        String str = this.initData;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timeStamp)) * 31) + Long.hashCode(this.versionCode)) * 31;
        String str2 = this.subdomain;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.isParamsSendToSeedling)) * 31;
        boolean z = this.cannotReduceRecommend;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode3 + r1) * 31;
        boolean z2 = this.forceRebuild;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode4 = (((((((i + r2) * 31) + Integer.hashCode(this.serviceCategory)) * 31) + Integer.hashCode(this.channelType)) * 31) + Integer.hashCode(this.intentCategory)) * 31;
        boolean z3 = this.isGuaranteedCard;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int iHashCode5 = (((((iHashCode4 + r3) * 31) + Integer.hashCode(this.seedlingType)) * 31) + Integer.hashCode(this.useTemplate)) * 31;
        ArrayMap<String, Object> arrayMap = this.extras;
        int iHashCode6 = (iHashCode5 + (arrayMap == null ? 0 : arrayMap.hashCode())) * 31;
        String str3 = this.hostPackage;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.seedlingCardOptions;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.intentParams;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.instanceId;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.intentId;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str6 = this.policy;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        UTraceContext uTraceContext = this.utraceContext;
        int iHashCode13 = (((((((iHashCode12 + (uTraceContext == null ? 0 : uTraceContext.hashCode())) * 31) + this.sizeToCardType.hashCode()) * 31) + this.sizeToCardConfig.hashCode()) * 31) + Integer.hashCode(this.cloudRemindSwitch)) * 31;
        boolean z4 = this.shouldFocus;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i2 = (iHashCode13 + r4) * 31;
        Long l4 = this.focusTimestamp;
        int iHashCode14 = (((i2 + (l4 == null ? 0 : l4.hashCode())) * 31) + Integer.hashCode(this.groupPriority)) * 31;
        boolean z5 = this.needToWaitCardData;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i3 = (iHashCode14 + r5) * 31;
        boolean z6 = this.isSupportMultiInstance;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i4 = (i3 + r6) * 31;
        String str7 = this.serviceLevel;
        int iHashCode15 = (((((((((((((((i4 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.sceneId)) * 31) + Integer.hashCode(this.cardSleeveType)) * 31) + Long.hashCode(this.sceneCreateTime)) * 31) + Long.hashCode(this.sceneUpdateTime)) * 31) + Integer.hashCode(this.sceneWeight)) * 31) + Integer.hashCode(this.sceneStatus)) * 31) + Float.hashCode(this.sceneScore)) * 31;
        boolean z7 = this.sceneShouldFocus;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int iHashCode16 = (((iHashCode15 + r7) * 31) + Integer.hashCode(this.serviceStatus)) * 31;
        boolean z8 = this.isSceneFocus;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        int iHashCode17 = (((((((iHashCode16 + r8) * 31) + Long.hashCode(this.focusTime)) * 31) + Integer.hashCode(this.expectSceneCnt)) * 31) + Integer.hashCode(this.combinationStrategy)) * 31;
        boolean z9 = this.homeFlag;
        ?? r9 = z9;
        if (z9) {
            r9 = 1;
        }
        int iHashCode18 = (((((iHashCode17 + r9) * 31) + Integer.hashCode(this.sceneLevel)) * 31) + Integer.hashCode(this.intentPosition)) * 31;
        boolean z10 = this.forceGuaranteed;
        int i5 = (iHashCode18 + (z10 ? 1 : z10)) * 31;
        String str8 = this.brandCode;
        return ((((i5 + (str8 != null ? str8.hashCode() : 0)) * 31) + Integer.hashCode(this.switchType)) * 31) + Long.hashCode(this.updateTime);
    }

    public final boolean isGuaranteedCard() {
        return this.isGuaranteedCard;
    }

    public final int isParamsSendToSeedling() {
        return this.isParamsSendToSeedling;
    }

    public final boolean isSceneFocus() {
        return this.isSceneFocus;
    }

    public final boolean isSupportEntrance(int entranceType) {
        int i = this.supportEntrance;
        if (i < 0) {
            return false;
        }
        return (i & entranceType) == entranceType || i == 0;
    }

    public final boolean isSupportMultiInstance() {
        return this.isSupportMultiInstance;
    }

    public final boolean isSupportSize(int size) {
        return this.supportCardSizes.contains(Integer.valueOf(size));
    }

    public final void setBrandCode(@Nullable String str) {
        this.brandCode = str;
    }

    public final void setCannotReduceRecommend(boolean z) {
        this.cannotReduceRecommend = z;
    }

    public final void setCardSleeveType(int i) {
        this.cardSleeveType = i;
    }

    public final void setChannelType(int i) {
        this.channelType = i;
    }

    public final void setCloudRemindSwitch(int i) {
        this.cloudRemindSwitch = i;
    }

    public final void setCombinationStrategy(int i) {
        this.combinationStrategy = i;
    }

    public final void setExpectSceneCnt(int i) {
        this.expectSceneCnt = i;
    }

    public final void setExtras(@Nullable ArrayMap<String, Object> arrayMap) {
        this.extras = arrayMap;
    }

    public final void setFocusTime(long j2) {
        this.focusTime = j2;
    }

    public final void setFocusTimestamp(@Nullable Long l2) {
        this.focusTimestamp = l2;
    }

    public final void setForceGuaranteed(boolean z) {
        this.forceGuaranteed = z;
    }

    public final void setForceRebuild(boolean z) {
        this.forceRebuild = z;
    }

    public final void setGroupPriority(int i) {
        this.groupPriority = i;
    }

    public final void setGuaranteedCard(boolean z) {
        this.isGuaranteedCard = z;
    }

    public final void setHomeFlag(boolean z) {
        this.homeFlag = z;
    }

    public final void setHostPackage(@Nullable String str) {
        this.hostPackage = str;
    }

    public final void setInstanceId(@Nullable Long l2) {
        this.instanceId = l2;
    }

    public final void setIntentCategory(int i) {
        this.intentCategory = i;
    }

    public final void setIntentId(@Nullable Long l2) {
        this.intentId = l2;
    }

    public final void setIntentParams(@Nullable String str) {
        this.intentParams = str;
    }

    public final void setIntentPosition(int i) {
        this.intentPosition = i;
    }

    public final void setNeedToWaitCardData(boolean z) {
        this.needToWaitCardData = z;
    }

    public final void setParamsSendToSeedling(int i) {
        this.isParamsSendToSeedling = i;
    }

    public final void setPolicy(@Nullable String str) {
        this.policy = str;
    }

    public final void setSceneCreateTime(long j2) {
        this.sceneCreateTime = j2;
    }

    public final void setSceneFocus(boolean z) {
        this.isSceneFocus = z;
    }

    public final void setSceneId(long j2) {
        this.sceneId = j2;
    }

    public final void setSceneLevel(int i) {
        this.sceneLevel = i;
    }

    public final void setSceneScore(float f) {
        this.sceneScore = f;
    }

    public final void setSceneShouldFocus(boolean z) {
        this.sceneShouldFocus = z;
    }

    public final void setSceneStatus(int i) {
        this.sceneStatus = i;
    }

    public final void setSceneUpdateTime(long j2) {
        this.sceneUpdateTime = j2;
    }

    public final void setSceneWeight(int i) {
        this.sceneWeight = i;
    }

    public final void setSeedlingCardOptions(@Nullable String str) {
        this.seedlingCardOptions = str;
    }

    public final void setSeedlingType(int i) {
        this.seedlingType = i;
    }

    public final void setServiceCategory(int i) {
        this.serviceCategory = i;
    }

    public final void setServiceInstanceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serviceInstanceId = str;
    }

    public final void setServiceLevel(@Nullable String str) {
        this.serviceLevel = str;
    }

    public final void setServiceStatus(int i) {
        this.serviceStatus = i;
    }

    public final void setShouldFocus(boolean z) {
        this.shouldFocus = z;
    }

    public final void setSizeToCardConfig(@NotNull Map<Integer, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sizeToCardConfig = map;
    }

    public final void setSizeToCardType(@NotNull Map<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sizeToCardType = map;
    }

    public final void setSubdomain(@Nullable String str) {
        this.subdomain = str;
    }

    public final void setSupportCardSizes(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.supportCardSizes = list;
    }

    public final void setSupportMultiInstance(boolean z) {
        this.isSupportMultiInstance = z;
    }

    public final void setSwitchType(int i) {
        this.switchType = i;
    }

    public final void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }

    public final void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public final void setUseTemplate(int i) {
        this.useTemplate = i;
    }

    public final void setUtraceContext(@Nullable UTraceContext uTraceContext) {
        this.utraceContext = uTraceContext;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("serviceId:");
        sb.append(this.serviceId);
        sb.append(",serviceInstanceId:");
        sb.append(this.serviceInstanceId);
        sb.append(",serviceType:");
        sb.append(this.serviceType);
        sb.append(",supportCardSizes:");
        sb.append(this.supportCardSizes);
        sb.append(",score:");
        sb.append(this.score);
        sb.append(",supportEntrance:");
        sb.append(this.supportEntrance);
        sb.append(",initData:");
        String str = this.initData;
        sb.append(str == null ? null : Integer.valueOf(str.length()));
        sb.append(",timeStamp:");
        sb.append(this.timeStamp);
        sb.append(",versionCode:");
        sb.append(this.versionCode);
        sb.append(",subdomain:");
        sb.append((Object) this.subdomain);
        sb.append(",isParamsSendToSeedling:");
        sb.append(this.isParamsSendToSeedling);
        sb.append(",cannotReduceRecommend:");
        sb.append(this.cannotReduceRecommend);
        sb.append(",forceRebuild:");
        sb.append(this.forceRebuild);
        sb.append(",serviceCategory:");
        sb.append(this.serviceCategory);
        sb.append(",channelType:");
        sb.append(this.channelType);
        sb.append(",intentCategory:");
        sb.append(this.intentCategory);
        sb.append(",isGuaranteedCard:");
        sb.append(this.isGuaranteedCard);
        sb.append(",seedlingType:");
        sb.append(this.seedlingType);
        sb.append(",useTemplate:");
        sb.append(this.useTemplate);
        sb.append(",hostPackage:");
        sb.append((Object) this.hostPackage);
        sb.append(",seedlingCardOptions:");
        sb.append((Object) this.seedlingCardOptions);
        sb.append(",intentParams:");
        sb.append((Object) this.intentParams);
        sb.append("，instanceId:");
        sb.append(this.instanceId);
        sb.append(",intentId:");
        sb.append(this.intentId);
        sb.append(",policy:");
        sb.append((Object) this.policy);
        sb.append(",utraceContext:");
        sb.append(this.utraceContext);
        sb.append("sizeToCardType:");
        sb.append(this.sizeToCardType);
        sb.append(",sizeToCardConfig:");
        sb.append(this.sizeToCardConfig);
        sb.append(",cloudRemindSwitch:");
        sb.append(this.cloudRemindSwitch);
        sb.append(",shouldFocus:");
        sb.append(this.shouldFocus);
        sb.append(",focusTimestamp:");
        sb.append(this.focusTimestamp);
        sb.append("groupPriority:");
        sb.append(this.groupPriority);
        sb.append(",needToWaitCardData:");
        sb.append(this.needToWaitCardData);
        sb.append(",isSupportMultiInstance:");
        sb.append(this.isSupportMultiInstance);
        sb.append(",serviceLevel:");
        sb.append((Object) this.serviceLevel);
        sb.append(",sceneId:");
        sb.append(this.sceneId);
        sb.append(",cardSleeveType:");
        sb.append(this.cardSleeveType);
        sb.append(",sceneCreateTime:");
        sb.append(this.sceneCreateTime);
        sb.append(",sceneUpdateTime:");
        sb.append(this.sceneUpdateTime);
        sb.append(",sceneWeight:");
        sb.append(this.sceneWeight);
        sb.append(",sceneStatus:");
        sb.append(this.sceneStatus);
        sb.append(",sceneScore:");
        sb.append(this.sceneScore);
        sb.append("，sceneShouldFocus:");
        sb.append(this.sceneShouldFocus);
        sb.append(",serviceStatus:");
        sb.append(this.serviceStatus);
        sb.append(",isSceneFocus:");
        sb.append(this.isSceneFocus);
        sb.append(",focusTime:");
        sb.append(this.focusTime);
        sb.append(",expectSceneCnt:");
        sb.append(this.expectSceneCnt);
        sb.append(",combinationStrategy:");
        sb.append(this.combinationStrategy);
        sb.append(",homeFlag:");
        sb.append(this.homeFlag);
        sb.append(",sceneLevel:");
        sb.append(this.sceneLevel);
        sb.append("intentPosition:");
        sb.append(this.intentPosition);
        sb.append(",forceGuaranteed:");
        sb.append(this.forceGuaranteed);
        sb.append(",brandCode:");
        sb.append((Object) this.brandCode);
        sb.append(",switchType:");
        sb.append(this.switchType);
        sb.append(",updateTime:");
        sb.append(this.updateTime);
        return sb.toString();
    }

    public /* synthetic */ ServiceInfo(String str, String str2, int i, List list, float f, int i2, String str3, long j2, long j3, String str4, int i3, boolean z, boolean z2, int i4, int i5, int i6, boolean z3, int i7, int i8, ArrayMap arrayMap, String str5, String str6, String str7, Long l2, Long l3, String str8, UTraceContext uTraceContext, Map map, Map map2, int i9, boolean z4, Long l4, int i10, boolean z5, boolean z6, String str9, long j4, int i11, long j5, long j6, int i12, int i13, float f2, boolean z7, int i14, boolean z8, long j7, int i15, int i16, boolean z9, int i17, int i18, boolean z10, String str10, int i19, long j8, int i20, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i20 & 2) != 0 ? "" : str2, i, list, f, i2, (i20 & 64) != 0 ? null : str3, j2, (i20 & 256) != 0 ? 0L : j3, (i20 & 512) != 0 ? null : str4, (i20 & 1024) != 0 ? 0 : i3, (i20 & 2048) != 0 ? false : z, (i20 & 4096) != 0 ? false : z2, (i20 & 8192) != 0 ? 1 : i4, (i20 & 16384) != 0 ? 1 : i5, (i20 & 32768) != 0 ? 0 : i6, (i20 & 65536) != 0 ? false : z3, (i20 & 131072) != 0 ? 1 : i7, (i20 & 262144) != 0 ? 0 : i8, (i20 & 524288) != 0 ? null : arrayMap, (i20 & 1048576) != 0 ? null : str5, (i20 & 2097152) != 0 ? null : str6, (i20 & 4194304) != 0 ? null : str7, (i20 & 8388608) != 0 ? null : l2, (i20 & 16777216) != 0 ? null : l3, (i20 & 33554432) != 0 ? null : str8, (i20 & 67108864) != 0 ? null : uTraceContext, (i20 & 134217728) != 0 ? new LinkedHashMap() : map, (i20 & 268435456) != 0 ? new LinkedHashMap() : map2, (i20 & 536870912) != 0 ? 1 : i9, (i20 & 1073741824) != 0 ? false : z4, (i20 & Integer.MIN_VALUE) != 0 ? null : l4, (i21 & 1) != 0 ? 4 : i10, (i21 & 2) != 0 ? false : z5, (i21 & 4) != 0 ? false : z6, (i21 & 8) != 0 ? null : str9, (i21 & 16) != 0 ? 0L : j4, (i21 & 32) != 0 ? 0 : i11, (i21 & 64) != 0 ? 0L : j5, (i21 & 128) != 0 ? 0L : j6, (i21 & 256) != 0 ? 0 : i12, (i21 & 512) != 0 ? 0 : i13, (i21 & 1024) != 0 ? -1.0f : f2, (i21 & 2048) != 0 ? false : z7, (i21 & 4096) != 0 ? -1 : i14, (i21 & 8192) != 0 ? false : z8, (i21 & 16384) != 0 ? 300000L : j7, (32768 & i21) != 0 ? 1 : i15, (i21 & 65536) != 0 ? 0 : i16, (i21 & 131072) != 0 ? false : z9, (i21 & 262144) != 0 ? 0 : i17, (i21 & 524288) != 0 ? 0 : i18, (i21 & 1048576) != 0 ? false : z10, (i21 & 2097152) != 0 ? null : str10, (i21 & 4194304) != 0 ? 0 : i19, (i21 & 8388608) != 0 ? 0L : j8);
    }

    public /* synthetic */ ServiceInfo(String str, int i, List list, float f, int i2, String str2, long j2, long j3, ArrayMap arrayMap, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, f, i2, (i3 & 32) != 0 ? null : str2, j2, (i3 & 128) != 0 ? 0L : j3, (i3 & 256) != 0 ? null : arrayMap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServiceInfo(@NotNull String serviceId, int i, @NotNull List<Integer> supportCardSizes, float f, int i2, @Nullable String str, long j2, long j3, @Nullable ArrayMap<String, Object> arrayMap) {
        this(serviceId, "", i, supportCardSizes, f, i2, str, j2, j3, null, 0, false, false, 1, 1, 0, false, 1, 0, arrayMap, null, null, null, null, null, null, null, null, null, 0, false, null, 0, false, false, null, 0L, 0, 0L, 0L, 0, 0, 0.0f, false, 0, false, 0L, 0, 0, false, 0, 0, false, null, 0, 0L, -1048576, 16777211, null);
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(supportCardSizes, "supportCardSizes");
    }
}
