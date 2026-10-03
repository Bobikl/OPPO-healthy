package com.oplus.smartenginehelper.dsl;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.jla;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.AnimEntity;
import com.oplus.smartenginehelper.entity.AnimListenerEntity;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ClickEntity;
import com.oplus.smartenginehelper.entity.ContentProviderClickEntity;
import com.oplus.smartenginehelper.entity.ContentProviderListenerEntity;
import com.oplus.smartenginehelper.entity.DrawableEntity;
import com.oplus.smartenginehelper.entity.ListDataEntity;
import com.oplus.smartenginehelper.entity.ListLayoutEntity;
import com.oplus.smartenginehelper.entity.StartActivityClickEntity;
import com.oplus.smartenginehelper.entity.StartActivityListenerEntity;
import com.oplus.smartenginehelper.entity.StartAnimClickEntity;
import com.oplus.smartenginehelper.entity.StartServiceClickEntity;
import com.oplus.smartenginehelper.entity.StartServiceListenerEntity;
import com.oplus.smartenginehelper.entity.TextEntity;
import com.oplus.smartenginehelper.entity.VideoEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import com.oplus.smartenginehelper.entity.appusage.DrawInfo;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\t\n\u0002\bG\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003J\u0018\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eJ\u001e\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0001J\u0016\u0010'\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0012J\u0016\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\"J\u0016\u0010+\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\"J\u0016\u0010-\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u001fJ\u0016\u0010/\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eJ\u0016\u00101\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000eJ\u0016\u00103\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\"J\u0016\u00105\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u001fJ\u0016\u00107\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u001fJ\u0016\u00109\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001fJ\u0016\u00109\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0016\u0010:\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\"J\u0016\u0010<\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u000eJ\u0016\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000eJ\u0016\u0010@\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eJ\u0016\u0010B\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0016\u0010D\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0016\u0010E\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\"J\u0016\u0010G\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020IJ\u0016\u0010J\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\"J\u0016\u0010L\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020NJ\u0016\u0010O\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000eJ\u0016\u0010P\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\u000eJ\u0016\u0010R\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020TJ\u0016\u0010U\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\"J\u0016\u0010W\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u001fJ\u0016\u0010Y\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\"J\u0016\u0010[\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020\"J\u0016\u0010]\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010^\u001a\u00020\"J'\u0010_\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00020b0a\"\u00020b¢\u0006\u0002\u0010cJ\u0016\u0010d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020fJ\u0016\u0010g\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010h\u001a\u00020iJ\u0016\u0010j\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020lJ'\u0010m\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00020b0a\"\u00020b¢\u0006\u0002\u0010cJ\u0016\u0010n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020fJ\u0016\u0010o\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010h\u001a\u00020iJ\u0016\u0010p\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020lJ'\u0010q\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00020b0a\"\u00020b¢\u0006\u0002\u0010cJ\u0016\u0010r\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020fJ\u0016\u0010s\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010h\u001a\u00020iJ\u0016\u0010t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020lJ'\u0010u\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00020b0a\"\u00020b¢\u0006\u0002\u0010cJ\u0016\u0010v\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020fJ\u0016\u0010w\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010h\u001a\u00020iJ\u0016\u0010x\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020lJ\u0016\u0010y\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010z\u001a\u00020\u0012J\u0016\u0010{\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u001fJ\u0016\u0010{\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0016\u0010}\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0016\u0010~\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0016\u0010\u007f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0017\u0010\u0080\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0018\u0010\u0081\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0082\u0001\u001a\u00020\u001fJ\u0018\u0010\u0083\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0084\u0001\u001a\u00020\u001fJ,\u0010\u0085\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0015\u0010\u0086\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0087\u00010a\"\u00030\u0087\u0001¢\u0006\u0003\u0010\u0088\u0001J\u0019\u0010\u0089\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001J\u0019\u0010\u008c\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001J\u0019\u0010\u008f\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001J\u0018\u0010\u0092\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0093\u0001\u001a\u00020TJ\u0019\u0010\u0094\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001J\u0017\u0010\u0097\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0017\u0010\u0098\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0017\u0010\u0099\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0017\u0010\u009a\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u001fJ\u0018\u0010\u009b\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u009c\u0001\u001a\u00020\u0012J\u0018\u0010\u009d\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u009e\u0001\u001a\u00020\u0012J\u0017\u0010\u009f\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010z\u001a\u00020\u001fJ\u0018\u0010 \u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010¡\u0001\u001a\u00020\u000eJ\u0018\u0010¢\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010£\u0001\u001a\u00020\u000eJ\u0018\u0010¤\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010¥\u0001\u001a\u00020\u000eJ\u0018\u0010¦\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010§\u0001\u001a\u00020\u001fJ\u0017\u0010¨\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u001fJ\u0017\u0010©\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u001fJ\u0018\u0010ª\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010«\u0001\u001a\u00020\u001fJ\u0018\u0010¬\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u00ad\u0001\u001a\u00020\u000eJ\u0018\u0010®\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010¯\u0001\u001a\u00020\u000eJ\u0018\u0010°\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010±\u0001\u001a\u00020\u000eJ\u0018\u0010²\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010³\u0001\u001a\u00020\u0012J\u0018\u0010´\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010µ\u0001\u001a\u00020\u0012J\u0018\u0010¶\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010·\u0001\u001a\u00020\u0012J\u0018\u0010¸\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010¹\u0001\u001a\u00020\u001fJ\u0018\u0010º\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010»\u0001\u001a\u00020\"J\u0018\u0010¼\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010½\u0001\u001a\u00020\u001fJ\u0017\u0010¾\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u001fJ\u0018\u0010¿\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010À\u0001\u001a\u00020\u0012J\u0018\u0010Á\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Â\u0001\u001a\u00020\u0012J\u0018\u0010Ã\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ä\u0001\u001a\u00020\u001fJ\u0018\u0010Å\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Æ\u0001\u001a\u00020\u000eJ\u0018\u0010Ç\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010È\u0001\u001a\u00020\u000eJ\u0018\u0010É\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ê\u0001\u001a\u00020\u0015J\u0018\u0010Ë\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ì\u0001\u001a\u00020\u000eJ\u0017\u0010Í\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0019\u0010Î\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010Ï\u0001\u001a\u00030Ð\u0001J\u0018\u0010Ñ\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ò\u0001\u001a\u00020\u001fJ\u0018\u0010Ó\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ô\u0001\u001a\u00020\u001fJ\u0018\u0010Õ\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ö\u0001\u001a\u00020\u0012J\u0018\u0010×\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ø\u0001\u001a\u00020\u000eJ\u0018\u0010Ù\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ú\u0001\u001a\u00020\u001fJ\u0018\u0010Ù\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ú\u0001\u001a\u00020\u000eJ\u0018\u0010Û\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Ü\u0001\u001a\u00020\u001fJ\u0018\u0010Ý\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010Þ\u0001\u001a\u00020\u000eJ\u0018\u0010ß\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010à\u0001\u001a\u00020\u000eJ\u0018\u0010á\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010â\u0001\u001a\u00020\u000eJ\u0018\u0010ã\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010ä\u0001\u001a\u00020\u000eJ\u0018\u0010å\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010æ\u0001\u001a\u00020\u000eJ3\u0010ç\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010è\u0001\u001a\u00020\u001f2\u0007\u0010é\u0001\u001a\u00020\u001f2\u0007\u0010ê\u0001\u001a\u00020\u001f2\u0007\u0010ë\u0001\u001a\u00020\u001fJ3\u0010ç\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010è\u0001\u001a\u00020\u000e2\u0007\u0010é\u0001\u001a\u00020\u000e2\u0007\u0010ê\u0001\u001a\u00020\u000e2\u0007\u0010ë\u0001\u001a\u00020\u000eJ\u0018\u0010ì\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010í\u0001\u001a\u00020\u000eJ\u0018\u0010î\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010ï\u0001\u001a\u00020\u000eJ\u0018\u0010ð\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010ñ\u0001\u001a\u00020\"J\u0018\u0010ò\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010ó\u0001\u001a\u00020\"J\u0018\u0010ô\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010õ\u0001\u001a\u00020\u0012J\u0018\u0010ö\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010÷\u0001\u001a\u00020\u0012J\u0018\u0010ø\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010ù\u0001\u001a\u00020\u001fJ\u0018\u0010ú\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010û\u0001\u001a\u00020\"J\u0017\u0010ü\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eJ\u0018\u0010ý\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010þ\u0001\u001a\u00020\u000eJ\u0017\u0010ÿ\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u001fJ\u0017\u0010ÿ\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eJ\u0018\u0010\u0080\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0081\u0002\u001a\u00020\u000eJ\u0018\u0010\u0082\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0083\u0002\u001a\u00020\u000eJ\u0018\u0010\u0084\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0085\u0002\u001a\u00020\u0012J\u0018\u0010\u0086\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0087\u0002\u001a\u00020\u0012J\u0018\u0010\u0088\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0089\u0002\u001a\u00020\u0012J\u0017\u0010\u008a\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\"J\u0018\u0010\u008b\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u008c\u0002\u001a\u00020\u001fJ\u0018\u0010\u008d\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u008e\u0002\u001a\u00020\u001fJ\u0017\u0010\u008f\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001fJ\u0017\u0010\u008f\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0018\u0010\u0090\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0091\u0002\u001a\u00020\u0012J\u0017\u0010\u0092\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\"J\u0018\u0010\u0093\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0094\u0002\u001a\u00020\u0012J\u0018\u0010\u0095\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u0096\u0002\u001a\u00020\u001fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0097\u0002"}, d2 = {"Lcom/oplus/smartenginehelper/dsl/DSLCoder;", "", "byteArray", "", "([B)V", "jsonObject", "Lorg/json/JSONObject;", jla.DEFAULT_BUILD_METHOD, "createPatch", "oldByteArray", "newByteArray", "removeData", "", "id", "", "tag", ClickApiEntity.SET_ALPHA, "alpha", "", "setAnim", "animEntity", "Lcom/oplus/smartenginehelper/entity/AnimEntity;", "setAppUsageDrawInfo", "drawInfo", "Lcom/oplus/smartenginehelper/entity/appusage/DrawInfo;", ClickApiEntity.SET_BACKGROUND, "drawableEntity", "Lcom/oplus/smartenginehelper/entity/DrawableEntity;", "src", "setBackgroundResource", "resId", "", "setClickable", ViewEntity.CLICKABLE, "", "setContentDescription", ViewEntity.CONTENT_DESCRIPTION, "setCustomData", "value", "setElevation", "elevation", ClickApiEntity.SET_ENABLED, ViewEntity.ENABLED, "setForceDarkAllowed", ViewEntity.FORCE_DARK_ALLOWED, "setImageDrawableAlpha", ParserTag.TAG_DRAWABLE_ALPHA, "setImageScaleType", ParserTag.TAG_SCALE_TYPE, "setImageType", "type", "setImageViewAdjustViewBounds", ParserTag.TAG_ADJUST_VIEW_BOUNDS, "setImageViewMaxHeight", ParserTag.TAG_MAX_HEIGHT, "setImageViewMaxWidth", ParserTag.TAG_MAX_WIDTH, "setImageViewResource", "setIndeterminate", ParserTag.TAG_INDETERMINATE, ClickApiEntity.SET_INDETERMINATE_DRAWABLE, ParserTag.TAG_INDETERMINATE_DRAWABLE, ClickApiEntity.SET_INDETERMINATE_TINT, ParserTag.TAG_INDETERMINATE_TINT, "setIndeterminateTintMode", ParserTag.TAG_INDETERMINATE_TINT_MODE, "setLayoutHeight", "size", "setLayoutWidth", "setListClipToPadding", ParserTag.CLIP_TO_PADDING, "setListData", "listData", "Lcom/oplus/smartenginehelper/entity/ListDataEntity;", "setListHasFixedSize", ParserTag.HAS_FIXED_SIZE, "setListLayout", ParserTag.CHILD_LAYOUT, "Lcom/oplus/smartenginehelper/entity/ListLayoutEntity;", "setListLayoutManager", "setListOrientation", "orientation", "setListPaginationOnScrollListener", "listener", "Lcom/oplus/smartenginehelper/entity/ContentProviderClickEntity;", "setListReverseLayout", "isReverse", "setListSpanCount", "count", "setListSupportPageLoad", "isSupport", "setLottieAutoPlay", ParserTag.AUTO_PLAY, "setLottieLoop", ParserTag.LOOP, "setLottieOnAnimationCancel", "animListenerEntities", "", "Lcom/oplus/smartenginehelper/entity/AnimListenerEntity;", "(Ljava/lang/String;[Lcom/oplus/smartenginehelper/entity/AnimListenerEntity;)V", "setLottieOnAnimationCancelToCallContentProvider", "contentProviderListenerEntity", "Lcom/oplus/smartenginehelper/entity/ContentProviderListenerEntity;", "setLottieOnAnimationCancelToStartActivity", "startActivityListenerEntity", "Lcom/oplus/smartenginehelper/entity/StartActivityListenerEntity;", "setLottieOnAnimationCancelToStartService", "startServiceListenerEntity", "Lcom/oplus/smartenginehelper/entity/StartServiceListenerEntity;", "setLottieOnAnimationEnd", "setLottieOnAnimationEndToCallContentProvider", "setLottieOnAnimationEndToStartActivity", "setLottieOnAnimationEndToStartService", "setLottieOnAnimationRepeat", "setLottieOnAnimationRepeatToCallContentProvider", "setLottieOnAnimationRepeatToStartActivity", "setLottieOnAnimationRepeatToStartService", "setLottieOnAnimationStart", "setLottieOnAnimationStartToCallContentProvider", "setLottieOnAnimationStartToStartActivity", "setLottieOnAnimationStartToStartService", "setLottieProgress", "progress", "setLottieResource", "rawId", "setMarginBottom", "setMarginEnd", "setMarginStart", "setMarginTop", "setMinHeight", ViewEntity.MIN_HEIGHT, "setMinWidth", ViewEntity.MIN_WIDTH, "setOnClick", "clickEntities", "Lcom/oplus/smartenginehelper/entity/ClickEntity;", "(Ljava/lang/String;[Lcom/oplus/smartenginehelper/entity/ClickEntity;)V", "setOnClickApi", "clickApiEntity", "Lcom/oplus/smartenginehelper/entity/ClickApiEntity;", "setOnClickStartActivity", "startActivityClickEntity", "Lcom/oplus/smartenginehelper/entity/StartActivityClickEntity;", "setOnClickStartAnim", "startAnimClickEntity", "Lcom/oplus/smartenginehelper/entity/StartAnimClickEntity;", "setOnClickStartContentProvider", "contentProviderClickEntity", "setOnClickStartService", "startServiceClickEntity", "Lcom/oplus/smartenginehelper/entity/StartServiceClickEntity;", "setPaddingBottom", "setPaddingEnd", "setPaddingStart", "setPaddingTop", "setPivotX", "pivotX", "setPivotY", "pivotY", ClickApiEntity.SET_PROGRESS, ClickApiEntity.SET_PROGRESS_BACKGROUND_TINT, ParserTag.TAG_PROGRESS_BACKGROUND_TINT, "setProgressBackgroundTintMode", ParserTag.TAG_PROGRESS_BACKGROUND_TINT_MODE, ClickApiEntity.SET_PROGRESS_DRAWABLE, ParserTag.TAG_PROGRESS_DRAWABLE, "setProgressMax", "max", "setProgressMaxHeight", "setProgressMaxWidth", "setProgressMin", "min", ClickApiEntity.SET_PROGRESS_TINT, ParserTag.TAG_PROGRESS_TINT, "setProgressTintMode", ParserTag.TAG_PROGRESS_TINT_MODE, "setProgressType", ParserTag.TAG_PROGRESS_TYPE, "setRotation", "rotation", "setRotationX", "rotationX", "setRotationY", "rotationY", "setRoundImageBorderColor", "borderColor", "setRoundImageHasBorder", "hasBorder", "setRoundImageRadius", "radius", "setRoundImageType", "setScaleX", "scaleX", "setScaleY", "scaleY", ClickApiEntity.SET_SECONDARY_PROGRESS, ParserTag.TAG_SECONDARY_PROGRESS, ClickApiEntity.SET_SECONDARY_PROGRESS_TINT, ParserTag.TAG_SECONDARY_PROGRESS_TINT, "setSecondaryProgressTintMode", ParserTag.TAG_SECONDARY_PROGRESS_TINT_MODE, "setSliverAnim", "sliverAnimEntity", "setStateListAnimator", "stateListAnimator", "setStateListAnimatorResource", "setStepDuration", "duration", "", "setStepFromNumber", ParserTag.TAG_FROM_NUMBER, "setStepNumber", "number", "setStepPercent", ParserTag.TAG_PERCENT, "setStepStepInfo", ParserTag.TAG_STEP_INFO, ClickApiEntity.SET_TEXT_COLOR, "color", "setTextViewAlignment", "align", "setTextViewAutoLink", ParserTag.TAG_TEXT_AUTO_LINK, "setTextViewAutoSizeMaxTextSize", "autoSizeMaxTextSize", "setTextViewAutoSizeMinTextSize", "autoSizeMinTextSize", "setTextViewAutoSizeStepGranularity", "autoSizeStepGranularity", "setTextViewAutoSizeTextType", "autoSizeTextType", "setTextViewCompoundDrawables", "start", "top", TextEntity.ELLIPSIZE_END, "bottom", "setTextViewEllipsize", ParserTag.TAG_ELLIPSIZE, "setTextViewGravity", "gravity", "setTextViewIncludeFontPadding", ParserTag.INCLUDE_FONT_PADDING, "setTextViewIsAllCaps", "isAllCap", "setTextViewLineSpacingExtra", ParserTag.TAG_LINE_SPACING_EXTRA, "setTextViewLineSpacingMultiplier", ParserTag.TAG_LINE_SPACING_MULTIPLIER, "setTextViewMaxLength", ParserTag.TAG_MAX_LENGTH, "setTextViewSingleLine", ParserTag.TAG_SINGLE_LINE, "setTextViewText", "setTextViewTextFontWeight", "textFontWeight", "setTextViewTextSize", "setTextViewTypeFace", "typeFace", "setTextViewTypeFaceStyle", ParserTag.TAG_TEXT_STYLE, "setTranslationX", "translationX", "setTranslationY", "translationY", "setTranslationZ", "translationZ", "setVideoViewInVisibleAutoPause", "setVideoViewRepeatMode", "repeatMode", "setVideoViewResizeMode", VideoEntity.RESIZE_MODE, "setVideoViewResource", "setVideoViewSpeed", "speed", "setVideoViewVisibleAutoPlay", "setVideoViewVolume", SpeechConstant.KEY_VOLUME, ClickApiEntity.SET_VISIBILITY, "visibility", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class DSLCoder {
    private final JSONObject jsonObject;

    public DSLCoder(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        this.jsonObject = new JSONObject(new String(byteArray, Charsets.UTF_8));
    }

    @NotNull
    public final byte[] build() {
        String string = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        Charset charset = Charsets.UTF_8;
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @NotNull
    public final byte[] createPatch(@Nullable byte[] oldByteArray, @NotNull byte[] newByteArray) throws JSONException {
        Intrinsics.checkNotNullParameter(newByteArray, "newByteArray");
        if (oldByteArray == null) {
            return newByteArray;
        }
        JSONArray jSONArray = new JSONArray();
        DSLUtils dSLUtils = DSLUtils.INSTANCE;
        Charset charset = Charsets.UTF_8;
        dSLUtils.parsePatch(new JSONObject(new String(oldByteArray, charset)), new JSONObject(new String(newByteArray, charset)), jSONArray);
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "patchArray.toString()");
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public final void removeData(@NotNull String id, @NotNull String tag) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, tag, null);
    }

    public final void setAlpha(@NotNull String id, float alpha) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "alpha", Float.valueOf(alpha));
    }

    public final void setAnim(@NotNull String id, @NotNull AnimEntity animEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(animEntity, "animEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ANIM, animEntity.getMJSONObject());
    }

    public final void setAppUsageDrawInfo(@NotNull String id, @NotNull DrawInfo drawInfo) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(drawInfo, "drawInfo");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAW, drawInfo.getJsonObject());
    }

    public final void setBackground(@NotNull String id, @NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(src, "src");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "background", src);
    }

    public final void setBackgroundResource(@NotNull String id, int resId) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "background", Integer.valueOf(resId));
    }

    public final void setClickable(@NotNull String id, boolean clickable) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ViewEntity.CLICKABLE, Boolean.valueOf(clickable));
    }

    public final void setContentDescription(@NotNull String id, @NotNull String contentDescription) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ViewEntity.CONTENT_DESCRIPTION, contentDescription);
    }

    public final void setCustomData(@NotNull String id, @NotNull String tag, @NotNull Object value) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, tag, value);
    }

    public final void setElevation(@NotNull String id, float elevation) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "elevation", Float.valueOf(elevation));
    }

    public final void setEnabled(@NotNull String id, boolean enabled) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ViewEntity.ENABLED, Boolean.valueOf(enabled));
    }

    public final void setForceDarkAllowed(@NotNull String id, boolean forceDarkAllowed) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ViewEntity.FORCE_DARK_ALLOWED, Boolean.valueOf(forceDarkAllowed));
    }

    public final void setImageDrawableAlpha(@NotNull String id, int drawableAlpha) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAWABLE_ALPHA, Integer.valueOf(drawableAlpha));
    }

    public final void setImageScaleType(@NotNull String id, @NotNull String scaleType) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_SCALE_TYPE, scaleType);
    }

    public final void setImageType(@NotNull String id, @NotNull String type) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "imageType", type);
    }

    public final void setImageViewAdjustViewBounds(@NotNull String id, boolean adjustViewBounds) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ADJUST_VIEW_BOUNDS, Boolean.valueOf(adjustViewBounds));
    }

    public final void setImageViewMaxHeight(@NotNull String id, int maxHeight) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_MAX_HEIGHT, Integer.valueOf(maxHeight));
    }

    public final void setImageViewMaxWidth(@NotNull String id, int maxWidth) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_MAX_WIDTH, Integer.valueOf(maxWidth));
    }

    public final void setImageViewResource(@NotNull String id, @NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(src, "src");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "src", src);
    }

    public final void setIndeterminate(@NotNull String id, boolean indeterminate) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_INDETERMINATE, Boolean.valueOf(indeterminate));
    }

    public final void setIndeterminateDrawable(@NotNull String id, @NotNull String indeterminateDrawable) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(indeterminateDrawable, "indeterminateDrawable");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_INDETERMINATE_DRAWABLE, indeterminateDrawable);
    }

    public final void setIndeterminateTint(@NotNull String id, @NotNull String indeterminateTint) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(indeterminateTint, "indeterminateTint");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_INDETERMINATE_TINT, indeterminateTint);
    }

    public final void setIndeterminateTintMode(@NotNull String id, @NotNull String indeterminateTintMode) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(indeterminateTintMode, "indeterminateTintMode");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_INDETERMINATE_TINT_MODE, indeterminateTintMode);
    }

    public final void setLayoutHeight(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "layout_height", Integer.valueOf(size));
    }

    public final void setLayoutWidth(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "layout_width", Integer.valueOf(size));
    }

    public final void setListClipToPadding(@NotNull String id, boolean clipToPadding) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.CLIP_TO_PADDING, Boolean.valueOf(clipToPadding));
    }

    public final void setListData(@NotNull String id, @NotNull ListDataEntity listData) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(listData, "listData");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "data", listData.getMJSONArray());
    }

    public final void setListHasFixedSize(@NotNull String id, boolean hasFixedSize) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.HAS_FIXED_SIZE, Boolean.valueOf(hasFixedSize));
    }

    public final void setListLayout(@NotNull String id, @NotNull ListLayoutEntity layout) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layout, "layout");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.CHILD, layout.getMJSONArray());
    }

    public final void setListLayoutManager(@NotNull String id, @NotNull String layout) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layout, "layout");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.LAYOUT_MANAGER, layout);
    }

    public final void setListOrientation(@NotNull String id, @NotNull String orientation) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "orientation", orientation);
    }

    public final void setListPaginationOnScrollListener(@NotNull String id, @NotNull ContentProviderClickEntity listener) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(listener, "listener");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.PAGINATION_SCROLL_LISTENER, listener.getMJSONObject());
    }

    public final void setListReverseLayout(@NotNull String id, boolean isReverse) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.REVERSE_LAYOUT, Boolean.valueOf(isReverse));
    }

    public final void setListSpanCount(@NotNull String id, int count) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.SPAN_COUNT, Integer.valueOf(count));
    }

    public final void setListSupportPageLoad(@NotNull String id, boolean isSupport) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.SUPPORT_PAGINATION_LOAD, Boolean.valueOf(isSupport));
    }

    public final void setLottieAutoPlay(@NotNull String id, boolean autoPlay) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.AUTO_PLAY, Boolean.valueOf(autoPlay));
    }

    public final void setLottieLoop(@NotNull String id, boolean loop) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.LOOP, Boolean.valueOf(loop));
    }

    public final void setLottieOnAnimationCancel(@NotNull String id, @NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_CANCEL, jSONArray);
    }

    public final void setLottieOnAnimationCancelToCallContentProvider(@NotNull String id, @NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_CANCEL, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationCancelToStartActivity(@NotNull String id, @NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_CANCEL, startActivityListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationCancelToStartService(@NotNull String id, @NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_CANCEL, startServiceListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationEnd(@NotNull String id, @NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_END, jSONArray);
    }

    public final void setLottieOnAnimationEndToCallContentProvider(@NotNull String id, @NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_END, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationEndToStartActivity(@NotNull String id, @NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_END, startActivityListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationEndToStartService(@NotNull String id, @NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_END, startServiceListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationRepeat(@NotNull String id, @NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_REPEAT, jSONArray);
    }

    public final void setLottieOnAnimationRepeatToCallContentProvider(@NotNull String id, @NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_REPEAT, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationRepeatToStartActivity(@NotNull String id, @NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_REPEAT, startActivityListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationRepeatToStartService(@NotNull String id, @NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_REPEAT, startServiceListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationStart(@NotNull String id, @NotNull AnimListenerEntity... animListenerEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(animListenerEntities, "animListenerEntities");
        JSONArray jSONArray = new JSONArray();
        for (AnimListenerEntity animListenerEntity : animListenerEntities) {
            jSONArray.put(animListenerEntity.getMJSONObject());
        }
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_START, jSONArray);
    }

    public final void setLottieOnAnimationStartToCallContentProvider(@NotNull String id, @NotNull ContentProviderListenerEntity contentProviderListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contentProviderListenerEntity, "contentProviderListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_START, contentProviderListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationStartToStartActivity(@NotNull String id, @NotNull StartActivityListenerEntity startActivityListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startActivityListenerEntity, "startActivityListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_START, startActivityListenerEntity.getMJSONObject());
    }

    public final void setLottieOnAnimationStartToStartService(@NotNull String id, @NotNull StartServiceListenerEntity startServiceListenerEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startServiceListenerEntity, "startServiceListenerEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ON_ANIMATION_START, startServiceListenerEntity.getMJSONObject());
    }

    public final void setLottieProgress(@NotNull String id, float progress) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "progress", Float.valueOf(progress));
    }

    public final void setLottieResource(@NotNull String id, @NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(src, "src");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.ASSET_NAME, src);
    }

    public final void setMarginBottom(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "layout_marginBottom", Integer.valueOf(size));
    }

    public final void setMarginEnd(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "layout_marginEnd", Integer.valueOf(size));
    }

    public final void setMarginStart(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "layout_marginStart", Integer.valueOf(size));
    }

    public final void setMarginTop(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "layout_marginTop", Integer.valueOf(size));
    }

    public final void setMinHeight(@NotNull String id, int minHeight) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ViewEntity.MIN_HEIGHT, Integer.valueOf(minHeight));
    }

    public final void setMinWidth(@NotNull String id, int minWidth) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ViewEntity.MIN_WIDTH, Integer.valueOf(minWidth));
    }

    public final void setOnClick(@NotNull String id, @NotNull ClickEntity... clickEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(clickEntities, "clickEntities");
        JSONArray jSONArray = new JSONArray();
        for (ClickEntity clickEntity : clickEntities) {
            jSONArray.put(clickEntity.getMJSONObject());
        }
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ONCLICK, jSONArray);
    }

    public final void setOnClickApi(@NotNull String id, @NotNull ClickApiEntity clickApiEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(clickApiEntity, "clickApiEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ONCLICK, clickApiEntity.getMJSONObject());
    }

    public final void setOnClickStartActivity(@NotNull String id, @NotNull StartActivityClickEntity startActivityClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startActivityClickEntity, "startActivityClickEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ONCLICK, startActivityClickEntity.getMJSONObject());
    }

    public final void setOnClickStartAnim(@NotNull String id, @NotNull StartAnimClickEntity startAnimClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startAnimClickEntity, "startAnimClickEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ONCLICK, startAnimClickEntity.getMJSONObject());
    }

    public final void setOnClickStartContentProvider(@NotNull String id, @NotNull ContentProviderClickEntity contentProviderClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contentProviderClickEntity, "contentProviderClickEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ONCLICK, contentProviderClickEntity.getMJSONObject());
    }

    public final void setOnClickStartService(@NotNull String id, @NotNull StartServiceClickEntity startServiceClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startServiceClickEntity, "startServiceClickEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ONCLICK, startServiceClickEntity.getMJSONObject());
    }

    public final void setPaddingBottom(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "paddingBottom", Integer.valueOf(size));
    }

    public final void setPaddingEnd(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "paddingEnd", Integer.valueOf(size));
    }

    public final void setPaddingStart(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "paddingStart", Integer.valueOf(size));
    }

    public final void setPaddingTop(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "paddingTop", Integer.valueOf(size));
    }

    public final void setPivotX(@NotNull String id, float pivotX) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "transformPivotX", Float.valueOf(pivotX));
    }

    public final void setPivotY(@NotNull String id, float pivotY) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "transformPivotY", Float.valueOf(pivotY));
    }

    public final void setProgress(@NotNull String id, int progress) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "progress", Integer.valueOf(progress));
    }

    public final void setProgressBackgroundTint(@NotNull String id, @NotNull String progressBackgroundTint) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(progressBackgroundTint, "progressBackgroundTint");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_PROGRESS_BACKGROUND_TINT, progressBackgroundTint);
    }

    public final void setProgressBackgroundTintMode(@NotNull String id, @NotNull String progressBackgroundTintMode) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(progressBackgroundTintMode, "progressBackgroundTintMode");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_PROGRESS_BACKGROUND_TINT_MODE, progressBackgroundTintMode);
    }

    public final void setProgressDrawable(@NotNull String id, @NotNull String progressDrawable) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(progressDrawable, "progressDrawable");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_PROGRESS_DRAWABLE, progressDrawable);
    }

    public final void setProgressMax(@NotNull String id, int max) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "max", Integer.valueOf(max));
    }

    public final void setProgressMaxHeight(@NotNull String id, int maxHeight) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_MAX_HEIGHT, Integer.valueOf(maxHeight));
    }

    public final void setProgressMaxWidth(@NotNull String id, int maxWidth) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_MAX_WIDTH, Integer.valueOf(maxWidth));
    }

    public final void setProgressMin(@NotNull String id, int min) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "min", Integer.valueOf(min));
    }

    public final void setProgressTint(@NotNull String id, @NotNull String progressTint) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(progressTint, "progressTint");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_PROGRESS_TINT, progressTint);
    }

    public final void setProgressTintMode(@NotNull String id, @NotNull String progressTintMode) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(progressTintMode, "progressTintMode");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_PROGRESS_TINT_MODE, progressTintMode);
    }

    public final void setProgressType(@NotNull String id, @NotNull String progressType) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(progressType, "progressType");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_PROGRESS_TYPE, progressType);
    }

    public final void setRotation(@NotNull String id, float rotation) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "rotation", Float.valueOf(rotation));
    }

    public final void setRotationX(@NotNull String id, float rotationX) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "rotationX", Float.valueOf(rotationX));
    }

    public final void setRotationY(@NotNull String id, float rotationY) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "rotationY", Float.valueOf(rotationY));
    }

    public final void setRoundImageBorderColor(@NotNull String id, int borderColor) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "borderColor", Integer.valueOf(borderColor));
    }

    public final void setRoundImageHasBorder(@NotNull String id, boolean hasBorder) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "hasBorder", Boolean.valueOf(hasBorder));
    }

    public final void setRoundImageRadius(@NotNull String id, int radius) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "borderRadius", Integer.valueOf(radius));
    }

    public final void setRoundImageType(@NotNull String id, int type) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "imageType", Integer.valueOf(type));
    }

    public final void setScaleX(@NotNull String id, float scaleX) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "scaleX", Float.valueOf(scaleX));
    }

    public final void setScaleY(@NotNull String id, float scaleY) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "scaleY", Float.valueOf(scaleY));
    }

    public final void setSecondaryProgress(@NotNull String id, int secondaryProgress) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_SECONDARY_PROGRESS, Integer.valueOf(secondaryProgress));
    }

    public final void setSecondaryProgressTint(@NotNull String id, @NotNull String secondaryProgressTint) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(secondaryProgressTint, "secondaryProgressTint");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_SECONDARY_PROGRESS_TINT, secondaryProgressTint);
    }

    public final void setSecondaryProgressTintMode(@NotNull String id, @NotNull String secondaryProgressTintMode) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(secondaryProgressTintMode, "secondaryProgressTintMode");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_SECONDARY_PROGRESS_TINT_MODE, secondaryProgressTintMode);
    }

    public final void setSliverAnim(@NotNull String id, @NotNull AnimEntity sliverAnimEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sliverAnimEntity, "sliverAnimEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_SLIVER_ANIM, sliverAnimEntity.getMJSONObject());
    }

    public final void setStateListAnimator(@NotNull String id, @NotNull String stateListAnimator) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(stateListAnimator, "stateListAnimator");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "stateListAnimator", stateListAnimator);
    }

    public final void setStateListAnimatorResource(@NotNull String id, int resId) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "stateListAnimator", Integer.valueOf(resId));
    }

    public final void setStepDuration(@NotNull String id, long duration) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "duration", Long.valueOf(duration));
    }

    public final void setStepFromNumber(@NotNull String id, int fromNumber) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_FROM_NUMBER, Integer.valueOf(fromNumber));
    }

    public final void setStepNumber(@NotNull String id, int number) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "number", Integer.valueOf(number));
    }

    public final void setStepPercent(@NotNull String id, float percent) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_PERCENT, Float.valueOf(percent));
    }

    public final void setStepStepInfo(@NotNull String id, @NotNull String stepInfo) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(stepInfo, "stepInfo");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_STEP_INFO, stepInfo);
    }

    public final void setTextColor(@NotNull String id, int color) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_TEXT_COLOR, Integer.valueOf(color));
    }

    public final void setTextViewAlignment(@NotNull String id, int align) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_TEXT_ALIGN, Integer.valueOf(align));
    }

    public final void setTextViewAutoLink(@NotNull String id, @NotNull String autoLink) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(autoLink, "autoLink");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_TEXT_AUTO_LINK, autoLink);
    }

    public final void setTextViewAutoSizeMaxTextSize(@NotNull String id, @NotNull String autoSizeMaxTextSize) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(autoSizeMaxTextSize, "autoSizeMaxTextSize");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "autoSizeMaxTextSize", autoSizeMaxTextSize);
    }

    public final void setTextViewAutoSizeMinTextSize(@NotNull String id, @NotNull String autoSizeMinTextSize) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(autoSizeMinTextSize, "autoSizeMinTextSize");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "autoSizeMinTextSize", autoSizeMinTextSize);
    }

    public final void setTextViewAutoSizeStepGranularity(@NotNull String id, @NotNull String autoSizeStepGranularity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(autoSizeStepGranularity, "autoSizeStepGranularity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "autoSizeStepGranularity", autoSizeStepGranularity);
    }

    public final void setTextViewAutoSizeTextType(@NotNull String id, @NotNull String autoSizeTextType) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(autoSizeTextType, "autoSizeTextType");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "autoSizeTextType", autoSizeTextType);
    }

    public final void setTextViewCompoundDrawables(@NotNull String id, @NotNull String start, @NotNull String top, @NotNull String end, @NotNull String bottom) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        DSLUtils dSLUtils = DSLUtils.INSTANCE;
        dSLUtils.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAWABLE_START, start);
        dSLUtils.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAWABLE_TOP, top);
        dSLUtils.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAWABLE_END, end);
        dSLUtils.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAWABLE_BOTTOM, bottom);
    }

    public final void setTextViewEllipsize(@NotNull String id, @NotNull String ellipsize) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_ELLIPSIZE, ellipsize);
    }

    public final void setTextViewGravity(@NotNull String id, @NotNull String gravity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "gravity", gravity);
    }

    public final void setTextViewIncludeFontPadding(@NotNull String id, boolean includeFontPadding) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.INCLUDE_FONT_PADDING, Boolean.valueOf(includeFontPadding));
    }

    public final void setTextViewIsAllCaps(@NotNull String id, boolean isAllCap) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_TEXT_ALL_CAPS, Boolean.valueOf(isAllCap));
    }

    public final void setTextViewLineSpacingExtra(@NotNull String id, float lineSpacingExtra) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_LINE_SPACING_EXTRA, Float.valueOf(lineSpacingExtra));
    }

    public final void setTextViewLineSpacingMultiplier(@NotNull String id, float lineSpacingMultiplier) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_LINE_SPACING_MULTIPLIER, Float.valueOf(lineSpacingMultiplier));
    }

    public final void setTextViewMaxLength(@NotNull String id, int maxLength) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_MAX_LENGTH, Integer.valueOf(maxLength));
    }

    public final void setTextViewSingleLine(@NotNull String id, boolean singleLine) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_SINGLE_LINE, Boolean.valueOf(singleLine));
    }

    public final void setTextViewText(@NotNull String id, @NotNull String value) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "text", value);
    }

    public final void setTextViewTextFontWeight(@NotNull String id, @NotNull String textFontWeight) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(textFontWeight, "textFontWeight");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "textFontWeight", textFontWeight);
    }

    public final void setTextViewTextSize(@NotNull String id, @NotNull String value) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_TEXT_SIZE, value);
    }

    public final void setTextViewTypeFace(@NotNull String id, @NotNull String typeFace) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(typeFace, "typeFace");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_TEXT_TYPEFACE, typeFace);
    }

    public final void setTextViewTypeFaceStyle(@NotNull String id, @NotNull String textStyle) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_TEXT_STYLE, textStyle);
    }

    public final void setTranslationX(@NotNull String id, float translationX) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "translationX", Float.valueOf(translationX));
    }

    public final void setTranslationY(@NotNull String id, float translationY) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "translationY", Float.valueOf(translationY));
    }

    public final void setTranslationZ(@NotNull String id, float translationZ) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "translationZ", Float.valueOf(translationZ));
    }

    public final void setVideoViewInVisibleAutoPause(@NotNull String id, boolean value) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, VideoEntity.INVISIBLE_AUTO_PAUSE, Boolean.valueOf(value));
    }

    public final void setVideoViewRepeatMode(@NotNull String id, int repeatMode) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "repeatMode", Integer.valueOf(repeatMode));
    }

    public final void setVideoViewResizeMode(@NotNull String id, int resizeMode) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, VideoEntity.RESIZE_MODE, Integer.valueOf(resizeMode));
    }

    public final void setVideoViewResource(@NotNull String id, int src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "src", Integer.valueOf(src));
    }

    public final void setVideoViewSpeed(@NotNull String id, float speed) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, VideoEntity.PLAY_SPEED, Float.valueOf(speed));
    }

    public final void setVideoViewVisibleAutoPlay(@NotNull String id, boolean value) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, VideoEntity.VISIBLE_AUTO_PLAY, Boolean.valueOf(value));
    }

    public final void setVideoViewVolume(@NotNull String id, float volume) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, VideoEntity.VOLUME_VALUE, Float.valueOf(volume));
    }

    public final void setVisibility(@NotNull String id, int visibility) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "visibility", Integer.valueOf(visibility));
    }

    public final void setBackground(@NotNull String id, @NotNull DrawableEntity drawableEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(drawableEntity, "drawableEntity");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "background", drawableEntity.getMJSONObject());
    }

    public final void setImageViewResource(@NotNull String id, int src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "src", Integer.valueOf(src));
    }

    public final void setLottieResource(@NotNull String id, int rawId) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.ASSET_NAME, Integer.valueOf(rawId));
    }

    public final void setTextColor(@NotNull String id, @NotNull String color) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(color, "color");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_TEXT_COLOR, color);
    }

    public final void setTextViewTextSize(@NotNull String id, int value) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_TEXT_SIZE, Integer.valueOf(value));
    }

    public final void setVideoViewResource(@NotNull String id, @NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(src, "src");
        DSLUtils.INSTANCE.tryReplaceOrAdd(this.jsonObject, id, "src", src);
    }

    public final void setTextViewCompoundDrawables(@NotNull String id, int start, int top, int end, int bottom) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        DSLUtils dSLUtils = DSLUtils.INSTANCE;
        dSLUtils.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAWABLE_START, Integer.valueOf(start));
        dSLUtils.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAWABLE_TOP, Integer.valueOf(top));
        dSLUtils.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAWABLE_END, Integer.valueOf(end));
        dSLUtils.tryReplaceOrAdd(this.jsonObject, id, ParserTag.TAG_DRAWABLE_BOTTOM, Integer.valueOf(bottom));
    }
}
