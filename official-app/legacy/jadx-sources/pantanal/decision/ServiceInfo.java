package pantanal.decision;

import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.lma;
import com.oplus.aiunit.vision.t6e;
import com.oplus.aiunit.vision.y6e;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.seedling.sdk.seedling.NewSeedlingCardOptions;
import com.oplus.utrace.sdk.UTraceCompat;
import com.oplus.utrace.sdk.UTraceContext;
import com.opos.process.bridge.base.BridgeConstant;
import com.pantanal.fundation.internal.json.JsonUtils;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;
import com.squareup.moshi.ToJson;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import pantanal.annotaions.SizeKt;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u0087\u0001\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ¿\u00012\u00020\u0001:\u0002¿\u0001Bk\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012BÍ\u0003\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0003\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$\u0012\b\b\u0003\u0010%\u001a\u00020\u0005\u0012\u0014\b\u0003\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030$\u0012\u0016\b\u0003\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010(0$\u0012\b\b\u0003\u0010)\u001a\u00020\u0005\u0012\b\b\u0003\u0010*\u001a\u00020\u0015\u0012\b\b\u0003\u0010+\u001a\u00020\u0003\u0012\b\b\u0003\u0010,\u001a\u00020\u0015\u0012\b\b\u0003\u0010-\u001a\u00020\r\u0012\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010/\u001a\u00020\u0015\u0012\b\b\u0003\u00100\u001a\u00020\u0005\u0012\b\b\u0003\u00101\u001a\u00020\r\u0012\b\b\u0003\u00102\u001a\u00020\u0005\u0012\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00104J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0018\u0010\u008d\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010MJ\n\u0010\u008f\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010MJ\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0016\u0010\u0094\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0005HÆ\u0003J\u0016\u0010\u0096\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030$HÆ\u0003J\u0018\u0010\u0097\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010(0$HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0015HÆ\u0003J\u0010\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\rHÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\rHÆ\u0003J\n\u0010¨\u0001\u001a\u00020\rHÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0005HÆ\u0003JØ\u0003\u0010ª\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0013\u001a\u00020\u00052\b\b\u0003\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u0016\u001a\u00020\u00152\b\b\u0003\u0010\u0017\u001a\u00020\u00052\b\b\u0003\u0010\u0018\u001a\u00020\u00052\b\b\u0003\u0010\u0019\u001a\u00020\u00052\b\b\u0003\u0010\u001a\u001a\u00020\u00152\b\b\u0003\u0010\u001b\u001a\u00020\u00052\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00032\u0014\b\u0003\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$2\b\b\u0003\u0010%\u001a\u00020\u00052\u0014\b\u0003\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030$2\u0016\b\u0003\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010(0$2\b\b\u0003\u0010)\u001a\u00020\u00052\b\b\u0003\u0010*\u001a\u00020\u00152\b\b\u0003\u0010+\u001a\u00020\u00032\b\b\u0003\u0010,\u001a\u00020\u00152\b\b\u0003\u0010-\u001a\u00020\r2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010/\u001a\u00020\u00152\b\b\u0003\u00100\u001a\u00020\u00052\b\b\u0003\u00101\u001a\u00020\r2\b\b\u0003\u00102\u001a\u00020\u00052\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010«\u0001J\u0015\u0010¬\u0001\u001a\u00020\u00152\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\u0007\u0010®\u0001\u001a\u00020\u0003J\n\u0010¯\u0001\u001a\u0005\u0018\u00010°\u0001J\n\u0010±\u0001\u001a\u00020\u0005HÖ\u0001J\u0007\u0010²\u0001\u001a\u00020\u0015J\u0007\u0010³\u0001\u001a\u00020\u0015J\u0007\u0010´\u0001\u001a\u00020\u0015J\u0010\u0010µ\u0001\u001a\u00020\u00152\u0007\u0010¶\u0001\u001a\u00020\u0005J\u0010\u0010·\u0001\u001a\u00020\u00152\u0007\u0010¸\u0001\u001a\u00020\u0005J\u0007\u0010¹\u0001\u001a\u00020\u0015J\u0014\u0010º\u0001\u001a\u00030»\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010°\u0001J\t\u0010½\u0001\u001a\u00020\u0003H\u0007J\t\u0010¾\u0001\u001a\u00020\u0003H\u0016R \u00103\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010%\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u001a\u0010\u0016\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010:\"\u0004\bF\u0010<R\u001e\u0010)\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R \u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\"\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010P\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010@R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010P\u001a\u0004\bS\u0010M\"\u0004\bT\u0010OR\u001e\u00100\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010>\"\u0004\bV\u0010@R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010:\"\u0004\bW\u0010<R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010>\"\u0004\bX\u0010@R\u001e\u0010/\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010:\"\u0004\bY\u0010<R\u0016\u0010*\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010:R\u001e\u0010,\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010:\"\u0004\b[\u0010<R \u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u00106\"\u0004\ba\u00108R\u001e\u0010-\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010>\"\u0004\bi\u0010@R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010>\"\u0004\bk\u0010@R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u00106R\u0016\u0010+\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u00106R \u0010.\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u00106\"\u0004\bo\u00108R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bp\u0010>R*\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030$8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR*\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010r\"\u0004\bv\u0010tR(\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010(0$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010r\"\u0004\bx\u0010tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u00106\"\u0004\bz\u00108R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b}\u0010>R\u001e\u00102\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010>\"\u0004\b\u007f\u0010@R\u0012\u0010\f\u001a\u00020\r¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010cR \u00101\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010c\"\u0005\b\u0082\u0001\u0010eR\u0012\u0010\u000e\u001a\u00020\r¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010c¨\u0006À\u0001"}, d2 = {"Lpantanal/decision/ServiceInfo;", "Ljava/io/Serializable;", "serviceId", "", "serviceType", "", "supportCardSizes", "", "score", "", "supportEntrance", "initData", SpeechConstant.KEY_TTS_TIMESTAMP, "", "versionCode", BridgeConstant.KEY_EXTRAS, "Landroid/util/ArrayMap;", "", "(Ljava/lang/String;ILjava/util/List;FILjava/lang/String;JJLandroid/util/ArrayMap;)V", "isParamsSendToSeedling", "cannotReduceRecommend", "", "forceRebuild", "serviceCategory", "channelType", "intentCategory", "isGuaranteedCard", "seedlingType", "subdomain", "intentId", "policy", "instanceId", "newSeedlingCardOptions", "Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;", "hostPackage", "sizeToCardType", "", "cloudRemindSwitch", "sizeToCardConfig", "sizeToDecisionCardConfig", "Lpantanal/decision/DecisionCardConfig;", "groupPriority", Constants.IS_SUPPORT_MULTI_INSTANCE, "serviceInstanceId", "needToWaitCardData", "sceneId", "serviceLevel", "isSceneFocus", "intentPosition", "updateTime", "switchType", "brandCode", "(Ljava/lang/String;ILjava/util/List;FILjava/lang/String;JJIZZIIIZILjava/lang/String;Landroid/util/ArrayMap;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;Ljava/lang/String;Ljava/util/Map;ILjava/util/Map;Ljava/util/Map;IZLjava/lang/String;ZJLjava/lang/String;ZIJILjava/lang/String;)V", "getBrandCode", "()Ljava/lang/String;", "setBrandCode", "(Ljava/lang/String;)V", "getCannotReduceRecommend", "()Z", "setCannotReduceRecommend", "(Z)V", "getChannelType", "()I", "setChannelType", "(I)V", "getCloudRemindSwitch", "setCloudRemindSwitch", "getExtras", "()Landroid/util/ArrayMap;", "getForceRebuild", "setForceRebuild", "getGroupPriority", "setGroupPriority", "getHostPackage", "setHostPackage", "getInitData", "getInstanceId", "()Ljava/lang/Long;", "setInstanceId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getIntentCategory", "setIntentCategory", "getIntentId", "setIntentId", "getIntentPosition", "setIntentPosition", "setGuaranteedCard", "setParamsSendToSeedling", "setSceneFocus", "getNeedToWaitCardData", "setNeedToWaitCardData", "getNewSeedlingCardOptions", "()Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;", "setNewSeedlingCardOptions", "(Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;)V", "getPolicy", "setPolicy", "getSceneId", "()J", "setSceneId", "(J)V", "getScore", "()F", "getSeedlingType", "setSeedlingType", "getServiceCategory", "setServiceCategory", "getServiceId", "getServiceInstanceId", "getServiceLevel", "setServiceLevel", "getServiceType", "getSizeToCardConfig", "()Ljava/util/Map;", "setSizeToCardConfig", "(Ljava/util/Map;)V", "getSizeToCardType", "setSizeToCardType", "getSizeToDecisionCardConfig", "setSizeToDecisionCardConfig", "getSubdomain", "setSubdomain", "getSupportCardSizes", "()Ljava/util/List;", "getSupportEntrance", "getSwitchType", "setSwitchType", "getTimeStamp", "getUpdateTime", "setUpdateTime", "getVersionCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/util/List;FILjava/lang/String;JJIZZIIIZILjava/lang/String;Landroid/util/ArrayMap;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;Ljava/lang/String;Ljava/util/Map;ILjava/util/Map;Ljava/util/Map;IZLjava/lang/String;ZJLjava/lang/String;ZIJILjava/lang/String;)Lpantanal/decision/ServiceInfo;", "equals", "other", "getCardSizeListDesc", "getUTraceIntentContext", "Lcom/oplus/utrace/sdk/UTraceContext;", "hashCode", "isDefaultType", "isMasterType", "isSalveType", "isSupportEntrance", "entranceType", "isSupportSize", "size", "isSupportStrongRemind", "setUTraceIntentContext", "", "uTraceIntentContext", "toJsonString", "toString", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nServiceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceInfo.kt\npantanal/decision/ServiceInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,529:1\n1855#2,2:530\n*S KotlinDebug\n*F\n+ 1 ServiceInfo.kt\npantanal/decision/ServiceInfo\n*L\n479#1:530,2\n*E\n"})
public final /* data */ class ServiceInfo implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "ServiceInfo";
    private static final long serialVersionUID = 1;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_28)
    @Nullable
    private String brandCode;
    private boolean cannotReduceRecommend;
    private int channelType;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    private int cloudRemindSwitch;

    @Nullable
    private final ArrayMap<String, Object> extras;
    private boolean forceRebuild;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_6)
    private int groupPriority;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private String hostPackage;

    @Nullable
    private final String initData;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private Long instanceId;
    private int intentCategory;

    @Nullable
    private Long intentId;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_20)
    private int intentPosition;
    private boolean isGuaranteedCard;
    private int isParamsSendToSeedling;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_14)
    private boolean isSceneFocus;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_6)
    private final boolean isSupportMultiInstance;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    private boolean needToWaitCardData;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private NewSeedlingCardOptions newSeedlingCardOptions;

    @Nullable
    private String policy;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    private long sceneId;
    private final float score;
    private int seedlingType;
    private int serviceCategory;

    @NotNull
    private final String serviceId;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_6)
    @NotNull
    private final String serviceInstanceId;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    @Nullable
    private String serviceLevel;
    private final int serviceType;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_11)
    @NotNull
    private Map<Integer, String> sizeToCardConfig;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @NotNull
    private Map<Integer, Integer> sizeToCardType;

    @NotNull
    private Map<Integer, DecisionCardConfig> sizeToDecisionCardConfig;

    @Nullable
    private String subdomain;

    @NotNull
    private final List<Integer> supportCardSizes;
    private final int supportEntrance;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_28)
    private int switchType;
    private final long timeStamp;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_26)
    private long updateTime;
    private final long versionCode;

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lpantanal/decision/ServiceInfo$Companion;", "", "()V", "TAG", "", "serialVersionUID", "", "fromJsonString", "Lpantanal/decision/ServiceInfo;", "json", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @FromJson
        @Nullable
        public final ServiceInfo fromJsonString(@NotNull String json) {
            ArrayMap<String, Object> extras;
            ArrayMap<String, Object> extras2;
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                Result.Companion companion = Result.INSTANCE;
                ServiceInfo serviceInfo = (ServiceInfo) JsonUtils.b(json, ServiceInfo.class);
                Object obj = (serviceInfo == null || (extras2 = serviceInfo.getExtras()) == null) ? null : extras2.get("uTraceIntentContext");
                Object obj2 = (serviceInfo == null || (extras = serviceInfo.getExtras()) == null) ? null : extras.get("SecondTermTraceContext");
                if (obj instanceof String) {
                    serviceInfo.getExtras().remove("uTraceIntentContext");
                    serviceInfo.getExtras().put("uTraceIntentContext", UTraceCompat.INSTANCE.readFromJsonString((String) obj));
                }
                if (obj2 instanceof String) {
                    serviceInfo.getExtras().remove("SecondTermTraceContext");
                    serviceInfo.getExtras().put("SecondTermTraceContext", UTraceCompat.INSTANCE.readFromJsonString((String) obj2));
                }
                return serviceInfo;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Object objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                if (thM5290exceptionOrNullimpl != null) {
                    bs9.a.c(t6e.INSTANCE, ServiceInfo.TAG, "fromJsonString failed,msg = " + thM5290exceptionOrNullimpl.getMessage(), false, null, false, 0, false, null, 252, null);
                }
                return (ServiceInfo) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
            }
        }
    }

    public ServiceInfo(@Json(name = "serviceId") @NotNull String serviceId, @Json(name = "serviceType") int i, @Json(name = "supportCardSizes") @NotNull List<Integer> supportCardSizes, @Json(name = "score") float f, @Json(name = "supportEntrance") int i2, @Json(name = "initData") @Nullable String str, @Json(name = SpeechConstant.KEY_TTS_TIMESTAMP) long j2, @Json(name = "versionCode") long j3, @Json(name = "isParamsSendToSeedling") int i3, @Json(name = "cannotReduceRecommend") boolean z, @Json(name = "forceRebuild") boolean z2, @Json(name = "serviceCategory") int i4, @Json(name = "channelType") int i5, @Json(name = "intentCategory") int i6, @Json(name = "isGuaranteedCard") boolean z3, @Json(name = "seedlingType") int i7, @Json(name = "subdomain") @Nullable String str2, @Json(name = BridgeConstant.KEY_EXTRAS) @Nullable ArrayMap<String, Object> arrayMap, @Json(name = "intentId") @Nullable Long l2, @Json(name = "policy") @Nullable String str3, @Json(name = "instanceId") @Nullable Long l3, @Json(name = "newSeedlingCardOptions") @Nullable NewSeedlingCardOptions newSeedlingCardOptions, @Json(name = "hostPackage") @Nullable String str4, @Json(name = "sizeToCardType") @NotNull Map<Integer, Integer> sizeToCardType, @Json(name = "cloudRemindSwitch") int i8, @Json(name = "sizeToCardConfig") @NotNull Map<Integer, String> sizeToCardConfig, @Json(name = "sizeToDecisionCardConfig") @NotNull Map<Integer, DecisionCardConfig> sizeToDecisionCardConfig, @Json(name = "groupPriority") int i9, @Json(name = Constants.IS_SUPPORT_MULTI_INSTANCE) boolean z4, @Json(name = "serviceInstanceId") @NotNull String serviceInstanceId, @Json(name = "needToWaitCardData") boolean z5, @Json(name = "sceneId") long j4, @Json(name = "serviceLevel") @Nullable String str5, @Json(name = "isSceneFocus") boolean z6, @Json(name = "intentPosition") int i10, @Json(name = "updateTime") long j5, @Json(name = "switchType") int i11, @Json(name = "brandCode") @Nullable String str6) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(supportCardSizes, "supportCardSizes");
        Intrinsics.checkNotNullParameter(sizeToCardType, "sizeToCardType");
        Intrinsics.checkNotNullParameter(sizeToCardConfig, "sizeToCardConfig");
        Intrinsics.checkNotNullParameter(sizeToDecisionCardConfig, "sizeToDecisionCardConfig");
        Intrinsics.checkNotNullParameter(serviceInstanceId, "serviceInstanceId");
        this.serviceId = serviceId;
        this.serviceType = i;
        this.supportCardSizes = supportCardSizes;
        this.score = f;
        this.supportEntrance = i2;
        this.initData = str;
        this.timeStamp = j2;
        this.versionCode = j3;
        this.isParamsSendToSeedling = i3;
        this.cannotReduceRecommend = z;
        this.forceRebuild = z2;
        this.serviceCategory = i4;
        this.channelType = i5;
        this.intentCategory = i6;
        this.isGuaranteedCard = z3;
        this.seedlingType = i7;
        this.subdomain = str2;
        this.extras = arrayMap;
        this.intentId = l2;
        this.policy = str3;
        this.instanceId = l3;
        this.newSeedlingCardOptions = newSeedlingCardOptions;
        this.hostPackage = str4;
        this.sizeToCardType = sizeToCardType;
        this.cloudRemindSwitch = i8;
        this.sizeToCardConfig = sizeToCardConfig;
        this.sizeToDecisionCardConfig = sizeToDecisionCardConfig;
        this.groupPriority = i9;
        this.isSupportMultiInstance = z4;
        this.serviceInstanceId = serviceInstanceId;
        this.needToWaitCardData = z5;
        this.sceneId = j4;
        this.serviceLevel = str5;
        this.isSceneFocus = z6;
        this.intentPosition = i10;
        this.updateTime = j5;
        this.switchType = i11;
        this.brandCode = str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceInfo copy$default(ServiceInfo serviceInfo, String str, int i, List list, float f, int i2, String str2, long j2, long j3, int i3, boolean z, boolean z2, int i4, int i5, int i6, boolean z3, int i7, String str3, ArrayMap arrayMap, Long l2, String str4, Long l3, NewSeedlingCardOptions newSeedlingCardOptions, String str5, Map map, int i8, Map map2, Map map3, int i9, boolean z4, String str6, boolean z5, long j4, String str7, boolean z6, int i10, long j5, int i11, String str8, int i12, int i13, Object obj) {
        String str9 = (i12 & 1) != 0 ? serviceInfo.serviceId : str;
        int i14 = (i12 & 2) != 0 ? serviceInfo.serviceType : i;
        List list2 = (i12 & 4) != 0 ? serviceInfo.supportCardSizes : list;
        float f2 = (i12 & 8) != 0 ? serviceInfo.score : f;
        int i15 = (i12 & 16) != 0 ? serviceInfo.supportEntrance : i2;
        String str10 = (i12 & 32) != 0 ? serviceInfo.initData : str2;
        long j6 = (i12 & 64) != 0 ? serviceInfo.timeStamp : j2;
        long j7 = (i12 & 128) != 0 ? serviceInfo.versionCode : j3;
        int i16 = (i12 & 256) != 0 ? serviceInfo.isParamsSendToSeedling : i3;
        boolean z7 = (i12 & 512) != 0 ? serviceInfo.cannotReduceRecommend : z;
        boolean z8 = (i12 & 1024) != 0 ? serviceInfo.forceRebuild : z2;
        return serviceInfo.copy(str9, i14, list2, f2, i15, str10, j6, j7, i16, z7, z8, (i12 & 2048) != 0 ? serviceInfo.serviceCategory : i4, (i12 & 4096) != 0 ? serviceInfo.channelType : i5, (i12 & 8192) != 0 ? serviceInfo.intentCategory : i6, (i12 & 16384) != 0 ? serviceInfo.isGuaranteedCard : z3, (i12 & 32768) != 0 ? serviceInfo.seedlingType : i7, (i12 & 65536) != 0 ? serviceInfo.subdomain : str3, (i12 & 131072) != 0 ? serviceInfo.extras : arrayMap, (i12 & 262144) != 0 ? serviceInfo.intentId : l2, (i12 & 524288) != 0 ? serviceInfo.policy : str4, (i12 & 1048576) != 0 ? serviceInfo.instanceId : l3, (i12 & 2097152) != 0 ? serviceInfo.newSeedlingCardOptions : newSeedlingCardOptions, (i12 & 4194304) != 0 ? serviceInfo.hostPackage : str5, (i12 & 8388608) != 0 ? serviceInfo.sizeToCardType : map, (i12 & 16777216) != 0 ? serviceInfo.cloudRemindSwitch : i8, (i12 & 33554432) != 0 ? serviceInfo.sizeToCardConfig : map2, (i12 & 67108864) != 0 ? serviceInfo.sizeToDecisionCardConfig : map3, (i12 & 134217728) != 0 ? serviceInfo.groupPriority : i9, (i12 & 268435456) != 0 ? serviceInfo.isSupportMultiInstance : z4, (i12 & 536870912) != 0 ? serviceInfo.serviceInstanceId : str6, (i12 & 1073741824) != 0 ? serviceInfo.needToWaitCardData : z5, (i12 & Integer.MIN_VALUE) != 0 ? serviceInfo.sceneId : j4, (i13 & 1) != 0 ? serviceInfo.serviceLevel : str7, (i13 & 2) != 0 ? serviceInfo.isSceneFocus : z6, (i13 & 4) != 0 ? serviceInfo.intentPosition : i10, (i13 & 8) != 0 ? serviceInfo.updateTime : j5, (i13 & 16) != 0 ? serviceInfo.switchType : i11, (i13 & 32) != 0 ? serviceInfo.brandCode : str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getCannotReduceRecommend() {
        return this.cannotReduceRecommend;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getForceRebuild() {
        return this.forceRebuild;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getServiceCategory() {
        return this.serviceCategory;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getIntentCategory() {
        return this.intentCategory;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsGuaranteedCard() {
        return this.isGuaranteedCard;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getSeedlingType() {
        return this.seedlingType;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSubdomain() {
        return this.subdomain;
    }

    @Nullable
    public final ArrayMap<String, Object> component18() {
        return this.extras;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getIntentId() {
        return this.intentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getServiceType() {
        return this.serviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPolicy() {
        return this.policy;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Long getInstanceId() {
        return this.instanceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final NewSeedlingCardOptions getNewSeedlingCardOptions() {
        return this.newSeedlingCardOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getHostPackage() {
        return this.hostPackage;
    }

    @NotNull
    public final Map<Integer, Integer> component24() {
        return this.sizeToCardType;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getCloudRemindSwitch() {
        return this.cloudRemindSwitch;
    }

    @NotNull
    public final Map<Integer, String> component26() {
        return this.sizeToCardConfig;
    }

    @NotNull
    public final Map<Integer, DecisionCardConfig> component27() {
        return this.sizeToDecisionCardConfig;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getGroupPriority() {
        return this.groupPriority;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getIsSupportMultiInstance() {
        return this.isSupportMultiInstance;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.supportCardSizes;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final boolean getNeedToWaitCardData() {
        return this.needToWaitCardData;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final long getSceneId() {
        return this.sceneId;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getServiceLevel() {
        return this.serviceLevel;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getIsSceneFocus() {
        return this.isSceneFocus;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final int getIntentPosition() {
        return this.intentPosition;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final int getSwitchType() {
        return this.switchType;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getBrandCode() {
        return this.brandCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSupportEntrance() {
        return this.supportEntrance;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInitData() {
        return this.initData;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getIsParamsSendToSeedling() {
        return this.isParamsSendToSeedling;
    }

    @NotNull
    public final ServiceInfo copy(@Json(name = "serviceId") @NotNull String serviceId, @Json(name = "serviceType") int serviceType, @Json(name = "supportCardSizes") @NotNull List<Integer> supportCardSizes, @Json(name = "score") float score, @Json(name = "supportEntrance") int supportEntrance, @Json(name = "initData") @Nullable String initData, @Json(name = SpeechConstant.KEY_TTS_TIMESTAMP) long timeStamp, @Json(name = "versionCode") long versionCode, @Json(name = "isParamsSendToSeedling") int isParamsSendToSeedling, @Json(name = "cannotReduceRecommend") boolean cannotReduceRecommend, @Json(name = "forceRebuild") boolean forceRebuild, @Json(name = "serviceCategory") int serviceCategory, @Json(name = "channelType") int channelType, @Json(name = "intentCategory") int intentCategory, @Json(name = "isGuaranteedCard") boolean isGuaranteedCard, @Json(name = "seedlingType") int seedlingType, @Json(name = "subdomain") @Nullable String subdomain, @Json(name = BridgeConstant.KEY_EXTRAS) @Nullable ArrayMap<String, Object> extras, @Json(name = "intentId") @Nullable Long intentId, @Json(name = "policy") @Nullable String policy, @Json(name = "instanceId") @Nullable Long instanceId, @Json(name = "newSeedlingCardOptions") @Nullable NewSeedlingCardOptions newSeedlingCardOptions, @Json(name = "hostPackage") @Nullable String hostPackage, @Json(name = "sizeToCardType") @NotNull Map<Integer, Integer> sizeToCardType, @Json(name = "cloudRemindSwitch") int cloudRemindSwitch, @Json(name = "sizeToCardConfig") @NotNull Map<Integer, String> sizeToCardConfig, @Json(name = "sizeToDecisionCardConfig") @NotNull Map<Integer, DecisionCardConfig> sizeToDecisionCardConfig, @Json(name = "groupPriority") int groupPriority, @Json(name = Constants.IS_SUPPORT_MULTI_INSTANCE) boolean isSupportMultiInstance, @Json(name = "serviceInstanceId") @NotNull String serviceInstanceId, @Json(name = "needToWaitCardData") boolean needToWaitCardData, @Json(name = "sceneId") long sceneId, @Json(name = "serviceLevel") @Nullable String serviceLevel, @Json(name = "isSceneFocus") boolean isSceneFocus, @Json(name = "intentPosition") int intentPosition, @Json(name = "updateTime") long updateTime, @Json(name = "switchType") int switchType, @Json(name = "brandCode") @Nullable String brandCode) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(supportCardSizes, "supportCardSizes");
        Intrinsics.checkNotNullParameter(sizeToCardType, "sizeToCardType");
        Intrinsics.checkNotNullParameter(sizeToCardConfig, "sizeToCardConfig");
        Intrinsics.checkNotNullParameter(sizeToDecisionCardConfig, "sizeToDecisionCardConfig");
        Intrinsics.checkNotNullParameter(serviceInstanceId, "serviceInstanceId");
        return new ServiceInfo(serviceId, serviceType, supportCardSizes, score, supportEntrance, initData, timeStamp, versionCode, isParamsSendToSeedling, cannotReduceRecommend, forceRebuild, serviceCategory, channelType, intentCategory, isGuaranteedCard, seedlingType, subdomain, extras, intentId, policy, instanceId, newSeedlingCardOptions, hostPackage, sizeToCardType, cloudRemindSwitch, sizeToCardConfig, sizeToDecisionCardConfig, groupPriority, isSupportMultiInstance, serviceInstanceId, needToWaitCardData, sceneId, serviceLevel, isSceneFocus, intentPosition, updateTime, switchType, brandCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceInfo)) {
            return false;
        }
        ServiceInfo serviceInfo = (ServiceInfo) other;
        return Intrinsics.areEqual(this.serviceId, serviceInfo.serviceId) && this.serviceType == serviceInfo.serviceType && Intrinsics.areEqual(this.supportCardSizes, serviceInfo.supportCardSizes) && Float.compare(this.score, serviceInfo.score) == 0 && this.supportEntrance == serviceInfo.supportEntrance && Intrinsics.areEqual(this.initData, serviceInfo.initData) && this.timeStamp == serviceInfo.timeStamp && this.versionCode == serviceInfo.versionCode && this.isParamsSendToSeedling == serviceInfo.isParamsSendToSeedling && this.cannotReduceRecommend == serviceInfo.cannotReduceRecommend && this.forceRebuild == serviceInfo.forceRebuild && this.serviceCategory == serviceInfo.serviceCategory && this.channelType == serviceInfo.channelType && this.intentCategory == serviceInfo.intentCategory && this.isGuaranteedCard == serviceInfo.isGuaranteedCard && this.seedlingType == serviceInfo.seedlingType && Intrinsics.areEqual(this.subdomain, serviceInfo.subdomain) && Intrinsics.areEqual(this.extras, serviceInfo.extras) && Intrinsics.areEqual(this.intentId, serviceInfo.intentId) && Intrinsics.areEqual(this.policy, serviceInfo.policy) && Intrinsics.areEqual(this.instanceId, serviceInfo.instanceId) && Intrinsics.areEqual(this.newSeedlingCardOptions, serviceInfo.newSeedlingCardOptions) && Intrinsics.areEqual(this.hostPackage, serviceInfo.hostPackage) && Intrinsics.areEqual(this.sizeToCardType, serviceInfo.sizeToCardType) && this.cloudRemindSwitch == serviceInfo.cloudRemindSwitch && Intrinsics.areEqual(this.sizeToCardConfig, serviceInfo.sizeToCardConfig) && Intrinsics.areEqual(this.sizeToDecisionCardConfig, serviceInfo.sizeToDecisionCardConfig) && this.groupPriority == serviceInfo.groupPriority && this.isSupportMultiInstance == serviceInfo.isSupportMultiInstance && Intrinsics.areEqual(this.serviceInstanceId, serviceInfo.serviceInstanceId) && this.needToWaitCardData == serviceInfo.needToWaitCardData && this.sceneId == serviceInfo.sceneId && Intrinsics.areEqual(this.serviceLevel, serviceInfo.serviceLevel) && this.isSceneFocus == serviceInfo.isSceneFocus && this.intentPosition == serviceInfo.intentPosition && this.updateTime == serviceInfo.updateTime && this.switchType == serviceInfo.switchType && Intrinsics.areEqual(this.brandCode, serviceInfo.brandCode);
    }

    @Nullable
    public final String getBrandCode() {
        return this.brandCode;
    }

    public final boolean getCannotReduceRecommend() {
        return this.cannotReduceRecommend;
    }

    @NotNull
    public final String getCardSizeListDesc() {
        StringBuilder sb = new StringBuilder(this.serviceId);
        sb.append('[');
        Iterator<T> it = this.supportCardSizes.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            sb.append(iIntValue + "-" + SizeKt.toSizeString(iIntValue) + ",");
        }
        sb.append(']');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return y6e.h(string);
    }

    public final int getChannelType() {
        return this.channelType;
    }

    public final int getCloudRemindSwitch() {
        return this.cloudRemindSwitch;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtras() {
        return this.extras;
    }

    public final boolean getForceRebuild() {
        return this.forceRebuild;
    }

    public final int getGroupPriority() {
        return this.groupPriority;
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

    public final int getIntentPosition() {
        return this.intentPosition;
    }

    public final boolean getNeedToWaitCardData() {
        return this.needToWaitCardData;
    }

    @Nullable
    public final NewSeedlingCardOptions getNewSeedlingCardOptions() {
        return this.newSeedlingCardOptions;
    }

    @Nullable
    public final String getPolicy() {
        return this.policy;
    }

    public final long getSceneId() {
        return this.sceneId;
    }

    public final float getScore() {
        return this.score;
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

    public final int getServiceType() {
        return this.serviceType;
    }

    @NotNull
    public final Map<Integer, String> getSizeToCardConfig() {
        return this.sizeToCardConfig;
    }

    @NotNull
    public final Map<Integer, Integer> getSizeToCardType() {
        return this.sizeToCardType;
    }

    @NotNull
    public final Map<Integer, DecisionCardConfig> getSizeToDecisionCardConfig() {
        return this.sizeToDecisionCardConfig;
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

    @Nullable
    public final UTraceContext getUTraceIntentContext() {
        String str = "getUTraceIntentContext,serviceId:" + this.serviceId + ",serviceInfo:" + hashCode();
        ArrayMap<String, Object> arrayMap = this.extras;
        if (arrayMap == null) {
            bs9.a.c(t6e.INSTANCE, TAG, str + ",extras == null", false, null, false, 0, false, null, 252, null);
            return null;
        }
        Object obj = arrayMap.get("uTraceIntentContext");
        if (obj instanceof UTraceContext) {
            return (UTraceContext) obj;
        }
        if (obj instanceof String) {
            return UTraceCompat.INSTANCE.readFromJsonString((String) obj);
        }
        bs9.a.d(t6e.INSTANCE, TAG, str + ",else,uTraceContext type:" + (obj != null ? obj.getClass().getCanonicalName() : null) + ",classLoader:" + (obj != null ? obj.getClass().getClassLoader() : null), false, null, false, 0, false, null, 252, null);
        return null;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v61, types: [int] */
    /* JADX WARN: Type inference failed for: r1v65, types: [int] */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public int hashCode() {
        int iHashCode = ((((((((this.serviceId.hashCode() * 31) + Integer.hashCode(this.serviceType)) * 31) + this.supportCardSizes.hashCode()) * 31) + Float.hashCode(this.score)) * 31) + Integer.hashCode(this.supportEntrance)) * 31;
        String str = this.initData;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timeStamp)) * 31) + Long.hashCode(this.versionCode)) * 31) + Integer.hashCode(this.isParamsSendToSeedling)) * 31;
        boolean z = this.cannotReduceRecommend;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        boolean z2 = this.forceRebuild;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode3 = (((((((i + r2) * 31) + Integer.hashCode(this.serviceCategory)) * 31) + Integer.hashCode(this.channelType)) * 31) + Integer.hashCode(this.intentCategory)) * 31;
        boolean z3 = this.isGuaranteedCard;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int iHashCode4 = (((iHashCode3 + r3) * 31) + Integer.hashCode(this.seedlingType)) * 31;
        String str2 = this.subdomain;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayMap<String, Object> arrayMap = this.extras;
        int iHashCode6 = (iHashCode5 + (arrayMap == null ? 0 : arrayMap.hashCode())) * 31;
        Long l2 = this.intentId;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.policy;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.instanceId;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        NewSeedlingCardOptions newSeedlingCardOptions = this.newSeedlingCardOptions;
        int iHashCode10 = (iHashCode9 + (newSeedlingCardOptions == null ? 0 : newSeedlingCardOptions.hashCode())) * 31;
        String str4 = this.hostPackage;
        int iHashCode11 = (((((((((((iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.sizeToCardType.hashCode()) * 31) + Integer.hashCode(this.cloudRemindSwitch)) * 31) + this.sizeToCardConfig.hashCode()) * 31) + this.sizeToDecisionCardConfig.hashCode()) * 31) + Integer.hashCode(this.groupPriority)) * 31;
        boolean z4 = this.isSupportMultiInstance;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int iHashCode12 = (((iHashCode11 + r4) * 31) + this.serviceInstanceId.hashCode()) * 31;
        boolean z5 = this.needToWaitCardData;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int iHashCode13 = (((iHashCode12 + r5) * 31) + Long.hashCode(this.sceneId)) * 31;
        String str5 = this.serviceLevel;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z6 = this.isSceneFocus;
        int iHashCode15 = (((((((iHashCode14 + (z6 ? 1 : z6)) * 31) + Integer.hashCode(this.intentPosition)) * 31) + Long.hashCode(this.updateTime)) * 31) + Integer.hashCode(this.switchType)) * 31;
        String str6 = this.brandCode;
        return iHashCode15 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isDefaultType() {
        return StringsKt__StringsJVMKt.equals("default", this.serviceLevel, true);
    }

    public final boolean isGuaranteedCard() {
        return this.isGuaranteedCard;
    }

    public final boolean isMasterType() {
        return StringsKt__StringsJVMKt.equals("master", this.serviceLevel, true);
    }

    public final int isParamsSendToSeedling() {
        return this.isParamsSendToSeedling;
    }

    public final boolean isSalveType() {
        return StringsKt__StringsJVMKt.equals("slave", this.serviceLevel, true);
    }

    public final boolean isSceneFocus() {
        return this.isSceneFocus;
    }

    public final boolean isSupportEntrance(int entranceType) {
        int i = this.supportEntrance;
        return (i & entranceType) == entranceType || i == 0;
    }

    public final boolean isSupportMultiInstance() {
        return this.isSupportMultiInstance;
    }

    public final boolean isSupportSize(int size) {
        return this.supportCardSizes.contains(Integer.valueOf(size));
    }

    public final boolean isSupportStrongRemind() {
        return this.cloudRemindSwitch == 2;
    }

    public final void setBrandCode(@Nullable String str) {
        this.brandCode = str;
    }

    public final void setCannotReduceRecommend(boolean z) {
        this.cannotReduceRecommend = z;
    }

    public final void setChannelType(int i) {
        this.channelType = i;
    }

    public final void setCloudRemindSwitch(int i) {
        this.cloudRemindSwitch = i;
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

    public final void setIntentPosition(int i) {
        this.intentPosition = i;
    }

    public final void setNeedToWaitCardData(boolean z) {
        this.needToWaitCardData = z;
    }

    public final void setNewSeedlingCardOptions(@Nullable NewSeedlingCardOptions newSeedlingCardOptions) {
        this.newSeedlingCardOptions = newSeedlingCardOptions;
    }

    public final void setParamsSendToSeedling(int i) {
        this.isParamsSendToSeedling = i;
    }

    public final void setPolicy(@Nullable String str) {
        this.policy = str;
    }

    public final void setSceneFocus(boolean z) {
        this.isSceneFocus = z;
    }

    public final void setSceneId(long j2) {
        this.sceneId = j2;
    }

    public final void setSeedlingType(int i) {
        this.seedlingType = i;
    }

    public final void setServiceCategory(int i) {
        this.serviceCategory = i;
    }

    public final void setServiceLevel(@Nullable String str) {
        this.serviceLevel = str;
    }

    public final void setSizeToCardConfig(@NotNull Map<Integer, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sizeToCardConfig = map;
    }

    public final void setSizeToCardType(@NotNull Map<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sizeToCardType = map;
    }

    public final void setSizeToDecisionCardConfig(@NotNull Map<Integer, DecisionCardConfig> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sizeToDecisionCardConfig = map;
    }

    public final void setSubdomain(@Nullable String str) {
        this.subdomain = str;
    }

    public final void setSwitchType(int i) {
        this.switchType = i;
    }

    public final void setUTraceIntentContext(@Nullable UTraceContext uTraceIntentContext) {
        ArrayMap<String, Object> arrayMap = this.extras;
        if (arrayMap != null) {
            arrayMap.put("uTraceIntentContext", uTraceIntentContext);
        }
    }

    public final void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    @ToJson
    @NotNull
    public final String toJsonString() {
        ServiceInfo serviceInfoCopy$default = copy$default(this, null, 0, null, 0.0f, 0, null, 0L, 0L, 0, false, false, 0, 0, 0, false, 0, null, null, null, null, null, null, null, null, 0, null, null, 0, false, null, false, 0L, null, false, 0, 0L, 0, null, -1, 63, null);
        ArrayMap<String, Object> arrayMap = serviceInfoCopy$default.extras;
        Object obj = arrayMap != null ? arrayMap.get("uTraceIntentContext") : null;
        ArrayMap<String, Object> arrayMap2 = serviceInfoCopy$default.extras;
        Object obj2 = arrayMap2 != null ? arrayMap2.get("SecondTermTraceContext") : null;
        if (obj instanceof UTraceContext) {
            serviceInfoCopy$default.extras.remove("uTraceIntentContext");
            serviceInfoCopy$default.extras.put("uTraceIntentContext", UTraceCompat.INSTANCE.writeToJsonString((UTraceContext) obj));
        }
        if (obj2 instanceof UTraceContext) {
            serviceInfoCopy$default.extras.remove("SecondTermTraceContext");
            serviceInfoCopy$default.extras.put("SecondTermTraceContext", UTraceCompat.INSTANCE.writeToJsonString((UTraceContext) obj2));
        }
        return JsonUtils.d(serviceInfoCopy$default, ServiceInfo.class);
    }

    @NotNull
    public String toString() {
        String str = this.serviceId;
        int i = this.serviceType;
        List<Integer> list = this.supportCardSizes;
        long j2 = this.sceneId;
        String str2 = this.serviceLevel;
        boolean z = this.isSceneFocus;
        float f = this.score;
        int i2 = this.intentPosition;
        int i3 = this.supportEntrance;
        long j3 = this.timeStamp;
        long j4 = this.versionCode;
        boolean z2 = this.forceRebuild;
        int i4 = this.serviceCategory;
        int i5 = this.channelType;
        int i6 = this.intentCategory;
        boolean z3 = this.isGuaranteedCard;
        int i7 = this.seedlingType;
        String str3 = this.subdomain;
        Long l2 = this.intentId;
        String str4 = this.initData;
        Integer numValueOf = str4 != null ? Integer.valueOf(str4.length()) : null;
        String str5 = this.policy;
        String str6 = this.initData;
        if (str6 == null) {
            str6 = "";
        }
        return "ServiceInfo(serviceId:" + str + ", serviceType:" + i + ", supportCardSizes:" + list + ", sceneId:" + j2 + ", serviceLevel:" + str2 + ", isSceneFocus:" + z + ", score:" + f + ", intentPosition:" + i2 + ", supportEntrance:" + i3 + ", timeStamp:" + j3 + ", versionCode:" + j4 + ", forceRebuild:" + z2 + ", serviceCategory:" + i4 + ", channelType:" + i5 + ", intentCategory:" + i6 + ", isGuaranteedCard:" + z3 + ", seedlingType:" + i7 + ", subdomain:" + str3 + ", intentId:" + l2 + ", initData.length:" + numValueOf + ", policy:" + str5 + ", policyName:" + lma.b(str6, null, 2, null) + ", cloudRemindSwitch:" + this.cloudRemindSwitch + ", groupPriority:" + this.groupPriority + ", needToWaitCardData:" + this.needToWaitCardData + ", isSupportMultiInstance:" + this.isSupportMultiInstance + ", serviceInstanceId:" + this.serviceInstanceId + ", updateTime:" + this.updateTime + ", switchType:" + this.switchType + ", brandCode:" + this.brandCode + ", newSeedlingCardOptions:" + this.newSeedlingCardOptions + ", sizeToCardType:" + this.sizeToCardType + ", sizeToCardConfig:" + this.sizeToCardConfig.size() + ", sizeToDecisionCardConfig:" + this.sizeToDecisionCardConfig.size() + ")";
    }

    public /* synthetic */ ServiceInfo(String str, int i, List list, float f, int i2, String str2, long j2, long j3, int i3, boolean z, boolean z2, int i4, int i5, int i6, boolean z3, int i7, String str3, ArrayMap arrayMap, Long l2, String str4, Long l3, NewSeedlingCardOptions newSeedlingCardOptions, String str5, Map map, int i8, Map map2, Map map3, int i9, boolean z4, String str6, boolean z5, long j4, String str7, boolean z6, int i10, long j5, int i11, String str8, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, f, i2, (i12 & 32) != 0 ? null : str2, j2, (i12 & 128) != 0 ? 0L : j3, (i12 & 256) != 0 ? 0 : i3, (i12 & 512) != 0 ? false : z, (i12 & 1024) != 0 ? false : z2, (i12 & 2048) != 0 ? 1 : i4, (i12 & 4096) != 0 ? 1 : i5, (i12 & 8192) != 0 ? 0 : i6, (i12 & 16384) != 0 ? false : z3, (32768 & i12) != 0 ? 1 : i7, (65536 & i12) != 0 ? null : str3, (131072 & i12) != 0 ? null : arrayMap, (262144 & i12) != 0 ? null : l2, (524288 & i12) != 0 ? null : str4, (1048576 & i12) != 0 ? null : l3, (2097152 & i12) != 0 ? null : newSeedlingCardOptions, str5, (8388608 & i12) != 0 ? new LinkedHashMap() : map, (16777216 & i12) != 0 ? 1 : i8, (33554432 & i12) != 0 ? new LinkedHashMap() : map2, (67108864 & i12) != 0 ? new LinkedHashMap() : map3, (134217728 & i12) != 0 ? 4 : i9, (268435456 & i12) != 0 ? false : z4, (536870912 & i12) != 0 ? "" : str6, (1073741824 & i12) != 0 ? false : z5, (i12 & Integer.MIN_VALUE) != 0 ? 0L : j4, (i13 & 1) != 0 ? null : str7, (i13 & 2) != 0 ? false : z6, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0L : j5, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? null : str8);
    }

    public /* synthetic */ ServiceInfo(String str, int i, List list, float f, int i2, String str2, long j2, long j3, ArrayMap arrayMap, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, f, i2, (i3 & 32) != 0 ? null : str2, j2, (i3 & 128) != 0 ? 0L : j3, (i3 & 256) != 0 ? null : arrayMap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServiceInfo(@NotNull String serviceId, int i, @NotNull List<Integer> supportCardSizes, float f, int i2, @Nullable String str, long j2, long j3, @Nullable ArrayMap<String, Object> arrayMap) {
        this(serviceId, i, supportCardSizes, f, i2, str, j2, j3, 0, false, false, 1, 1, 0, false, 1, null, arrayMap, null, null, null, null, "", null, 1, null, null, 4, false, null, false, 0L, null, false, 0, 0L, 0, null, 914358272, 0, null);
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(supportCardSizes, "supportCardSizes");
    }
}
