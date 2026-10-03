package com.oplus.seedling.sdk.seedling;

import android.graphics.Bitmap;
import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import com.squareup.moshi.Json;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bq\b\u0087\b\u0018\u0000 \u0099\u00012\u00020\u0001:\u0002\u0099\u0001B=\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fB\u0097\u0003\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012\u0012\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0014\u0012\u0016\b\u0003\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0017\u001a\u00020\b\u0012\u0016\b\u0003\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\u001c\u001a\u00020\n\u0012\b\b\u0003\u0010\u001d\u001a\u00020\b\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0016\b\u0003\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'0\u000f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010*J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010y\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0003J\u0011\u0010z\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0014HÆ\u0003J\u0017\u0010{\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010}\u001a\u00020\bHÆ\u0003J\u0017\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fHÆ\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010.J\u0018\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010.J\n\u0010\u0082\u0001\u001a\u00020\nHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010HJ\u0018\u0010\u0086\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\u0018\u0010\u008a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'0\u000fHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010TJ\u0018\u0010\u0091\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¢\u0003\u0010\u0093\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00142\u0016\b\u0003\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0017\u001a\u00020\b2\u0016\b\u0003\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0016\b\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u001c\u001a\u00020\n2\b\b\u0003\u0010\u001d\u001a\u00020\b2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0016\b\u0003\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'0\u000f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0003\u0010\u0094\u0001J\u0015\u0010\u0095\u0001\u001a\u00020\b2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u0097\u0001\u001a\u00020\nH\u0016J\t\u0010\u0098\u0001\u001a\u00020\u0005H\u0016R(\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u00101\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010#\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b6\u0010.\"\u0004\b7\u00100R \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00103\"\u0004\b=\u00105R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R,\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010,\u001a\u0004\bO\u0010PR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010@\"\u0004\bR\u0010BR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010SR\u001e\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\b\r\u0010T\"\u0004\bU\u0010VR(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010@\"\u0004\bY\u0010BR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010@\"\u0004\b_\u0010BR,\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'0\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010@\"\u0004\ba\u0010BR\u001e\u0010\u001c\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010P\"\u0004\bc\u0010dR\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010\u0017\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010S\"\u0004\bj\u0010kR \u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001e\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010S\"\u0004\bq\u0010kR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\br\u0010SR(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010@\"\u0004\bt\u0010BR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bu\u00103R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u00103\"\u0004\bw\u00105¨\u0006\u009a\u0001"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "", "icon", "Landroid/graphics/Bitmap;", "title", "", "des", JsonToSeedlingCardOptionsConvertor.KEY_IS_MILESTONE, "", JsonToSeedlingCardOptionsConvertor.KEY_GRADE, "", "shouldShow", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZIZ)V", "isRequestShowPanel", "interactionData", "", "voiceContent", "extraData", "Landroid/util/ArrayMap;", JsonToSeedlingCardOptionsConvertor.KEY_NOTIFICATION_ID_LIST, "", JsonToSeedlingCardOptionsConvertor.KEY_SHOW_HOST_MAP, JsonToSeedlingCardOptionsConvertor.KEY_DATA_SOURCE_PKG_NAME, JsonToSeedlingCardOptionsConvertor.KEY_REQUEST_HIDE_STATUS_BAR, JsonToSeedlingCardOptionsConvertor.KEY_LOCK_SCREEN_SHOW_HOST_MAP, JsonToSeedlingCardOptionsConvertor.KEY_CANCEL_PANEL_ACTION_CONFIG, JsonToSeedlingCardOptionsConvertor.KEY_PANEL_ACTION_CONFIG_MAP, JsonToSeedlingCardOptionsConvertor.KEY_CONTROL_ACTION, "remindLevel", JsonToSeedlingCardOptionsConvertor.KEY_SHOULD_FOCUS_IN_UPK, JsonToSeedlingCardOptionsConvertor.KEY_FOCUS_TIMESTAMP_IN_UPK, "", JsonToSeedlingCardOptionsConvertor.KEY_EXTENSIBLE_ACTION_IN_UPK, "data", "", "category", "rootNode", "Lcom/oplus/seedling/sdk/seedling/EngineTreeNodeData;", "rawDataMap", "Lcom/oplus/seedling/sdk/seedling/EngineRawData;", "remoteViewUIData", "Lcom/oplus/seedling/sdk/seedling/RemoteViewUIData;", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZIZLjava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Landroid/util/ArrayMap;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;IZLjava/lang/Long;Ljava/util/Map;[BLjava/lang/String;Lcom/oplus/seedling/sdk/seedling/EngineTreeNodeData;Ljava/util/Map;Lcom/oplus/seedling/sdk/seedling/RemoteViewUIData;)V", "getCancelPanelActionConfig$annotations", "()V", "getCancelPanelActionConfig", "()Ljava/lang/Integer;", "setCancelPanelActionConfig", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getControlAction", "setControlAction", "getData", "()[B", "setData", "([B)V", "getDataSourcePkgName", "setDataSourcePkgName", "getDes", "getExtensibleActionMap", "()Ljava/util/Map;", "setExtensibleActionMap", "(Ljava/util/Map;)V", "getExtraData", "()Landroid/util/ArrayMap;", "setExtraData", "(Landroid/util/ArrayMap;)V", "getFocusTimestamp", "()Ljava/lang/Long;", "setFocusTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getIcon", "()Landroid/graphics/Bitmap;", "getImportance$annotations", "getImportance", "()I", "getInteractionData", "setInteractionData", "()Z", "()Ljava/lang/Boolean;", "setRequestShowPanel", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLockScreenShowHostMap", "setLockScreenShowHostMap", "getNotificationIdList", "()Ljava/util/List;", "setNotificationIdList", "(Ljava/util/List;)V", "getPanelActionConfigMap", "setPanelActionConfigMap", "getRawDataMap", "setRawDataMap", "getRemindLevel", "setRemindLevel", "(I)V", "getRemoteViewUIData", "()Lcom/oplus/seedling/sdk/seedling/RemoteViewUIData;", "setRemoteViewUIData", "(Lcom/oplus/seedling/sdk/seedling/RemoteViewUIData;)V", "getRequestHideStatusBar", "setRequestHideStatusBar", "(Z)V", "getRootNode", "()Lcom/oplus/seedling/sdk/seedling/EngineTreeNodeData;", "setRootNode", "(Lcom/oplus/seedling/sdk/seedling/EngineTreeNodeData;)V", "getShouldFocus", "setShouldFocus", "getShouldShow", "getShowHostMap", "setShowHostMap", "getTitle", "getVoiceContent", "setVoiceContent", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZIZLjava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Landroid/util/ArrayMap;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;IZLjava/lang/Long;Ljava/util/Map;[BLjava/lang/String;Lcom/oplus/seedling/sdk/seedling/EngineTreeNodeData;Ljava/util/Map;Lcom/oplus/seedling/sdk/seedling/RemoteViewUIData;)Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "equals", "other", "hashCode", "toString", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeedlingUIData {
    public static final int REMIND_LEVEL_NORMAL = 0;
    public static final int REMIND_LEVEL_STRONG_ALWAYS = 13;
    public static final int REMIND_LEVEL_STRONG_LONG = 12;
    public static final int REMIND_LEVEL_STRONG_SHORT = 11;
    public static final int TYPE_REMOVE = 1;

    @Nullable
    private Integer cancelPanelActionConfig;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_42)
    @Nullable
    private String category;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private Integer controlAction;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_30)
    @Nullable
    private byte[] data;

    @Nullable
    private String dataSourcePkgName;

    @Nullable
    private final String des;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    @Nullable
    private Map<String, ? extends Object> extensibleActionMap;

    @Nullable
    private ArrayMap<String, Object> extraData;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private Long focusTimestamp;

    @Nullable
    private final Bitmap icon;
    private final int importance;

    @Nullable
    private Map<String, ? extends Object> interactionData;
    private final boolean isMilestone;

    @Nullable
    private Boolean isRequestShowPanel;

    @Nullable
    private Map<Integer, Boolean> lockScreenShowHostMap;

    @Nullable
    private List<Integer> notificationIdList;

    @Nullable
    private Map<Integer, Integer> panelActionConfigMap;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_42)
    @NotNull
    private Map<String, EngineRawData> rawDataMap;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    private int remindLevel;

    @Nullable
    private RemoteViewUIData remoteViewUIData;
    private boolean requestHideStatusBar;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_42)
    @Nullable
    private EngineTreeNodeData rootNode;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    private boolean shouldFocus;
    private final boolean shouldShow;

    @Nullable
    private Map<Integer, Boolean> showHostMap;

    @Nullable
    private final String title;

    @Nullable
    private String voiceContent;

    public SeedlingUIData(@Json(name = "icon") @Nullable Bitmap bitmap, @Json(name = "title") @Nullable String str, @Json(name = "des") @Nullable String str2, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_IS_MILESTONE) boolean z, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_GRADE) int i, @Json(name = "shouldShow") boolean z2, @Json(name = "isRequestShowPanel") @Nullable Boolean bool, @Json(name = "interactionData") @Nullable Map<String, ? extends Object> map, @Json(name = "voiceContent") @Nullable String str3, @Json(name = "extraData") @Nullable ArrayMap<String, Object> arrayMap, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_NOTIFICATION_ID_LIST) @Nullable List<Integer> list, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_SHOW_HOST_MAP) @Nullable Map<Integer, Boolean> map2, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_DATA_SOURCE_PKG_NAME) @Nullable String str4, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_REQUEST_HIDE_STATUS_BAR) boolean z3, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_LOCK_SCREEN_SHOW_HOST_MAP) @Nullable Map<Integer, Boolean> map3, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_CANCEL_PANEL_ACTION_CONFIG) @Nullable Integer num, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_PANEL_ACTION_CONFIG_MAP) @Nullable Map<Integer, Integer> map4, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_CONTROL_ACTION) @Nullable Integer num2, @Json(name = "remindLevel") int i2, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_SHOULD_FOCUS_IN_UPK) boolean z4, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_FOCUS_TIMESTAMP_IN_UPK) @Nullable Long l2, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_EXTENSIBLE_ACTION_IN_UPK) @Nullable Map<String, ? extends Object> map5, @Json(name = "data") @Nullable byte[] bArr, @Nullable String str5, @Nullable EngineTreeNodeData engineTreeNodeData, @NotNull Map<String, EngineRawData> rawDataMap, @Nullable RemoteViewUIData remoteViewUIData) {
        Intrinsics.checkNotNullParameter(rawDataMap, "rawDataMap");
        this.icon = bitmap;
        this.title = str;
        this.des = str2;
        this.isMilestone = z;
        this.importance = i;
        this.shouldShow = z2;
        this.isRequestShowPanel = bool;
        this.interactionData = map;
        this.voiceContent = str3;
        this.extraData = arrayMap;
        this.notificationIdList = list;
        this.showHostMap = map2;
        this.dataSourcePkgName = str4;
        this.requestHideStatusBar = z3;
        this.lockScreenShowHostMap = map3;
        this.cancelPanelActionConfig = num;
        this.panelActionConfigMap = map4;
        this.controlAction = num2;
        this.remindLevel = i2;
        this.shouldFocus = z4;
        this.focusTimestamp = l2;
        this.extensibleActionMap = map5;
        this.data = bArr;
        this.category = str5;
        this.rootNode = engineTreeNodeData;
        this.rawDataMap = rawDataMap;
        this.remoteViewUIData = remoteViewUIData;
    }

    @Deprecated(message = "please use panelActionConfigMap instead of this attribute,which is supported in sdk version 1.1.21")
    public static /* synthetic */ void getCancelPanelActionConfig$annotations() {
    }

    @Deprecated(message = "please use param shouldShow, which is decided by SeedlingSdk.")
    public static /* synthetic */ void getImportance$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getIcon() {
        return this.icon;
    }

    @Nullable
    public final ArrayMap<String, Object> component10() {
        return this.extraData;
    }

    @Nullable
    public final List<Integer> component11() {
        return this.notificationIdList;
    }

    @Nullable
    public final Map<Integer, Boolean> component12() {
        return this.showHostMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDataSourcePkgName() {
        return this.dataSourcePkgName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getRequestHideStatusBar() {
        return this.requestHideStatusBar;
    }

    @Nullable
    public final Map<Integer, Boolean> component15() {
        return this.lockScreenShowHostMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getCancelPanelActionConfig() {
        return this.cancelPanelActionConfig;
    }

    @Nullable
    public final Map<Integer, Integer> component17() {
        return this.panelActionConfigMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getControlAction() {
        return this.controlAction;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getRemindLevel() {
        return this.remindLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Long getFocusTimestamp() {
        return this.focusTimestamp;
    }

    @Nullable
    public final Map<String, Object> component22() {
        return this.extensibleActionMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final EngineTreeNodeData getRootNode() {
        return this.rootNode;
    }

    @NotNull
    public final Map<String, EngineRawData> component26() {
        return this.rawDataMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final RemoteViewUIData getRemoteViewUIData() {
        return this.remoteViewUIData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDes() {
        return this.des;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMilestone() {
        return this.isMilestone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsRequestShowPanel() {
        return this.isRequestShowPanel;
    }

    @Nullable
    public final Map<String, Object> component8() {
        return this.interactionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVoiceContent() {
        return this.voiceContent;
    }

    @NotNull
    public final SeedlingUIData copy(@Json(name = "icon") @Nullable Bitmap icon, @Json(name = "title") @Nullable String title, @Json(name = "des") @Nullable String des, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_IS_MILESTONE) boolean isMilestone, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_GRADE) int importance, @Json(name = "shouldShow") boolean shouldShow, @Json(name = "isRequestShowPanel") @Nullable Boolean isRequestShowPanel, @Json(name = "interactionData") @Nullable Map<String, ? extends Object> interactionData, @Json(name = "voiceContent") @Nullable String voiceContent, @Json(name = "extraData") @Nullable ArrayMap<String, Object> extraData, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_NOTIFICATION_ID_LIST) @Nullable List<Integer> notificationIdList, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_SHOW_HOST_MAP) @Nullable Map<Integer, Boolean> showHostMap, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_DATA_SOURCE_PKG_NAME) @Nullable String dataSourcePkgName, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_REQUEST_HIDE_STATUS_BAR) boolean requestHideStatusBar, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_LOCK_SCREEN_SHOW_HOST_MAP) @Nullable Map<Integer, Boolean> lockScreenShowHostMap, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_CANCEL_PANEL_ACTION_CONFIG) @Nullable Integer cancelPanelActionConfig, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_PANEL_ACTION_CONFIG_MAP) @Nullable Map<Integer, Integer> panelActionConfigMap, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_CONTROL_ACTION) @Nullable Integer controlAction, @Json(name = "remindLevel") int remindLevel, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_SHOULD_FOCUS_IN_UPK) boolean shouldFocus, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_FOCUS_TIMESTAMP_IN_UPK) @Nullable Long focusTimestamp, @Json(name = JsonToSeedlingCardOptionsConvertor.KEY_EXTENSIBLE_ACTION_IN_UPK) @Nullable Map<String, ? extends Object> extensibleActionMap, @Json(name = "data") @Nullable byte[] data, @Nullable String category, @Nullable EngineTreeNodeData rootNode, @NotNull Map<String, EngineRawData> rawDataMap, @Nullable RemoteViewUIData remoteViewUIData) {
        Intrinsics.checkNotNullParameter(rawDataMap, "rawDataMap");
        return new SeedlingUIData(icon, title, des, isMilestone, importance, shouldShow, isRequestShowPanel, interactionData, voiceContent, extraData, notificationIdList, showHostMap, dataSourcePkgName, requestHideStatusBar, lockScreenShowHostMap, cancelPanelActionConfig, panelActionConfigMap, controlAction, remindLevel, shouldFocus, focusTimestamp, extensibleActionMap, data, category, rootNode, rawDataMap, remoteViewUIData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SeedlingUIData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.seedling.sdk.seedling.SeedlingUIData");
        SeedlingUIData seedlingUIData = (SeedlingUIData) other;
        if (!Intrinsics.areEqual(this.icon, seedlingUIData.icon) || !Intrinsics.areEqual(this.title, seedlingUIData.title) || !Intrinsics.areEqual(this.des, seedlingUIData.des) || this.isMilestone != seedlingUIData.isMilestone || this.importance != seedlingUIData.importance || this.shouldShow != seedlingUIData.shouldShow || !Intrinsics.areEqual(this.isRequestShowPanel, seedlingUIData.isRequestShowPanel) || !Intrinsics.areEqual(this.interactionData, seedlingUIData.interactionData) || !Intrinsics.areEqual(this.voiceContent, seedlingUIData.voiceContent) || !Intrinsics.areEqual(this.extraData, seedlingUIData.extraData) || !Intrinsics.areEqual(this.notificationIdList, seedlingUIData.notificationIdList) || !Intrinsics.areEqual(this.showHostMap, seedlingUIData.showHostMap) || !Intrinsics.areEqual(this.dataSourcePkgName, seedlingUIData.dataSourcePkgName) || this.requestHideStatusBar != seedlingUIData.requestHideStatusBar || !Intrinsics.areEqual(this.lockScreenShowHostMap, seedlingUIData.lockScreenShowHostMap) || !Intrinsics.areEqual(this.cancelPanelActionConfig, seedlingUIData.cancelPanelActionConfig) || !Intrinsics.areEqual(this.panelActionConfigMap, seedlingUIData.panelActionConfigMap) || !Intrinsics.areEqual(this.controlAction, seedlingUIData.controlAction) || this.remindLevel != seedlingUIData.remindLevel || this.shouldFocus != seedlingUIData.shouldFocus || !Intrinsics.areEqual(this.focusTimestamp, seedlingUIData.focusTimestamp) || !Intrinsics.areEqual(this.extensibleActionMap, seedlingUIData.extensibleActionMap)) {
            return false;
        }
        byte[] bArr = this.data;
        if (bArr != null) {
            byte[] bArr2 = seedlingUIData.data;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (seedlingUIData.data != null) {
            return false;
        }
        return Intrinsics.areEqual(this.category, seedlingUIData.category) && Intrinsics.areEqual(this.rootNode, seedlingUIData.rootNode) && Intrinsics.areEqual(this.rawDataMap, seedlingUIData.rawDataMap) && Intrinsics.areEqual(this.remoteViewUIData, seedlingUIData.remoteViewUIData);
    }

    @Nullable
    public final Integer getCancelPanelActionConfig() {
        return this.cancelPanelActionConfig;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Integer getControlAction() {
        return this.controlAction;
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    @Nullable
    public final String getDataSourcePkgName() {
        return this.dataSourcePkgName;
    }

    @Nullable
    public final String getDes() {
        return this.des;
    }

    @Nullable
    public final Map<String, Object> getExtensibleActionMap() {
        return this.extensibleActionMap;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtraData() {
        return this.extraData;
    }

    @Nullable
    public final Long getFocusTimestamp() {
        return this.focusTimestamp;
    }

    @Nullable
    public final Bitmap getIcon() {
        return this.icon;
    }

    public final int getImportance() {
        return this.importance;
    }

    @Nullable
    public final Map<String, Object> getInteractionData() {
        return this.interactionData;
    }

    @Nullable
    public final Map<Integer, Boolean> getLockScreenShowHostMap() {
        return this.lockScreenShowHostMap;
    }

    @Nullable
    public final List<Integer> getNotificationIdList() {
        return this.notificationIdList;
    }

    @Nullable
    public final Map<Integer, Integer> getPanelActionConfigMap() {
        return this.panelActionConfigMap;
    }

    @NotNull
    public final Map<String, EngineRawData> getRawDataMap() {
        return this.rawDataMap;
    }

    public final int getRemindLevel() {
        return this.remindLevel;
    }

    @Nullable
    public final RemoteViewUIData getRemoteViewUIData() {
        return this.remoteViewUIData;
    }

    public final boolean getRequestHideStatusBar() {
        return this.requestHideStatusBar;
    }

    @Nullable
    public final EngineTreeNodeData getRootNode() {
        return this.rootNode;
    }

    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    @Nullable
    public final Map<Integer, Boolean> getShowHostMap() {
        return this.showHostMap;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getVoiceContent() {
        return this.voiceContent;
    }

    public int hashCode() {
        Bitmap bitmap = this.icon;
        int iHashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.des;
        int iHashCode3 = (((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMilestone)) * 31) + this.importance) * 31) + Boolean.hashCode(this.shouldShow)) * 31;
        Boolean bool = this.isRequestShowPanel;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map = this.interactionData;
        int iHashCode5 = (iHashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str3 = this.voiceContent;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ArrayMap<String, Object> arrayMap = this.extraData;
        int iHashCode7 = (iHashCode6 + (arrayMap != null ? arrayMap.hashCode() : 0)) * 31;
        List<Integer> list = this.notificationIdList;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        Map<Integer, Boolean> map2 = this.showHostMap;
        int iHashCode9 = (iHashCode8 + (map2 != null ? map2.hashCode() : 0)) * 31;
        String str4 = this.dataSourcePkgName;
        int iHashCode10 = (((iHashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.requestHideStatusBar)) * 31;
        Map<Integer, Boolean> map3 = this.lockScreenShowHostMap;
        int iHashCode11 = (iHashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Integer num = this.cancelPanelActionConfig;
        int iIntValue = (iHashCode11 + (num != null ? num.intValue() : 0)) * 31;
        Map<Integer, Integer> map4 = this.panelActionConfigMap;
        int iHashCode12 = (iIntValue + (map4 != null ? map4.hashCode() : 0)) * 31;
        Integer num2 = this.controlAction;
        int iIntValue2 = (((((iHashCode12 + (num2 != null ? num2.intValue() : 0)) * 31) + this.remindLevel) * 31) + Boolean.hashCode(this.shouldFocus)) * 31;
        Long l2 = this.focusTimestamp;
        int iHashCode13 = (iIntValue2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map5 = this.extensibleActionMap;
        int iHashCode14 = (iHashCode13 + (map5 != null ? map5.hashCode() : 0)) * 31;
        byte[] bArr = this.data;
        int iHashCode15 = (iHashCode14 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        String str5 = this.category;
        int iHashCode16 = (iHashCode15 + (str5 != null ? str5.hashCode() : 0)) * 31;
        EngineTreeNodeData engineTreeNodeData = this.rootNode;
        int iHashCode17 = (((iHashCode16 + (engineTreeNodeData != null ? engineTreeNodeData.hashCode() : 0)) * 31) + this.rawDataMap.hashCode()) * 31;
        RemoteViewUIData remoteViewUIData = this.remoteViewUIData;
        return iHashCode17 + (remoteViewUIData != null ? remoteViewUIData.hashCode() : 0);
    }

    public final boolean isMilestone() {
        return this.isMilestone;
    }

    @Nullable
    public final Boolean isRequestShowPanel() {
        return this.isRequestShowPanel;
    }

    public final void setCancelPanelActionConfig(@Nullable Integer num) {
        this.cancelPanelActionConfig = num;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setControlAction(@Nullable Integer num) {
        this.controlAction = num;
    }

    public final void setData(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public final void setDataSourcePkgName(@Nullable String str) {
        this.dataSourcePkgName = str;
    }

    public final void setExtensibleActionMap(@Nullable Map<String, ? extends Object> map) {
        this.extensibleActionMap = map;
    }

    public final void setExtraData(@Nullable ArrayMap<String, Object> arrayMap) {
        this.extraData = arrayMap;
    }

    public final void setFocusTimestamp(@Nullable Long l2) {
        this.focusTimestamp = l2;
    }

    public final void setInteractionData(@Nullable Map<String, ? extends Object> map) {
        this.interactionData = map;
    }

    public final void setLockScreenShowHostMap(@Nullable Map<Integer, Boolean> map) {
        this.lockScreenShowHostMap = map;
    }

    public final void setNotificationIdList(@Nullable List<Integer> list) {
        this.notificationIdList = list;
    }

    public final void setPanelActionConfigMap(@Nullable Map<Integer, Integer> map) {
        this.panelActionConfigMap = map;
    }

    public final void setRawDataMap(@NotNull Map<String, EngineRawData> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.rawDataMap = map;
    }

    public final void setRemindLevel(int i) {
        this.remindLevel = i;
    }

    public final void setRemoteViewUIData(@Nullable RemoteViewUIData remoteViewUIData) {
        this.remoteViewUIData = remoteViewUIData;
    }

    public final void setRequestHideStatusBar(boolean z) {
        this.requestHideStatusBar = z;
    }

    public final void setRequestShowPanel(@Nullable Boolean bool) {
        this.isRequestShowPanel = bool;
    }

    public final void setRootNode(@Nullable EngineTreeNodeData engineTreeNodeData) {
        this.rootNode = engineTreeNodeData;
    }

    public final void setShouldFocus(boolean z) {
        this.shouldFocus = z;
    }

    public final void setShowHostMap(@Nullable Map<Integer, Boolean> map) {
        this.showHostMap = map;
    }

    public final void setVoiceContent(@Nullable String str) {
        this.voiceContent = str;
    }

    @NotNull
    public String toString() {
        String version;
        Bitmap bitmap = this.icon;
        String str = this.title;
        String str2 = this.des;
        boolean z = this.isMilestone;
        int i = this.importance;
        boolean z2 = this.shouldShow;
        Boolean bool = this.isRequestShowPanel;
        Map<String, ? extends Object> map = this.interactionData;
        String str3 = this.voiceContent;
        ArrayMap<String, Object> arrayMap = this.extraData;
        List<Integer> list = this.notificationIdList;
        Map<Integer, Boolean> map2 = this.showHostMap;
        String str4 = this.dataSourcePkgName;
        boolean z3 = this.requestHideStatusBar;
        Map<Integer, Boolean> map3 = this.lockScreenShowHostMap;
        Integer num = this.cancelPanelActionConfig;
        Map<Integer, Integer> map4 = this.panelActionConfigMap;
        Integer num2 = this.controlAction;
        int i2 = this.remindLevel;
        boolean z4 = this.shouldFocus;
        Long l2 = this.focusTimestamp;
        Map<String, ? extends Object> map5 = this.extensibleActionMap;
        byte[] bArr = this.data;
        Integer numValueOf = bArr != null ? Integer.valueOf(bArr.length) : null;
        String str5 = this.category;
        EngineTreeNodeData engineTreeNodeData = this.rootNode;
        String str6 = "null";
        Object objValueOf = engineTreeNodeData != null ? Integer.valueOf(engineTreeNodeData.hashCode()) : "null";
        int size = this.rawDataMap.size();
        RemoteViewUIData remoteViewUIData = this.remoteViewUIData;
        if (remoteViewUIData != null && (version = remoteViewUIData.getVersion()) != null) {
            str6 = version;
        }
        return "SeedlingUIData(icon=" + bitmap + ", title=" + str + ", des=" + str2 + ", isMilestone=" + z + ", importance=" + i + ", shouldShow=" + z2 + ", isRequestShowPanel=" + bool + ", interactionData=" + map + ", voiceContent=" + str3 + ", extraData=" + arrayMap + ", notificationIdList=" + list + ", showHostMap=" + map2 + ", dataSourcePkgName=" + str4 + ", requestHideStatusBar=" + z3 + ", lockScreenShowHostMap=" + map3 + ", cancelPanelActionConfig=" + num + ", panelActionConfigMap=" + map4 + ", controlAction=" + num2 + ", remindLevel=" + i2 + ", shouldFocus=" + z4 + ", focusTimestamp=" + l2 + ", extensibleActionMap=" + map5 + ", dataSize=" + numValueOf + ", category=" + str5 + ", rootNode=" + objValueOf + ",rawDataMapSize=" + size + ",RemoteViewUIData=" + str6 + ")";
    }

    public /* synthetic */ SeedlingUIData(Bitmap bitmap, String str, String str2, boolean z, int i, boolean z2, Boolean bool, Map map, String str3, ArrayMap arrayMap, List list, Map map2, String str4, boolean z3, Map map3, Integer num, Map map4, Integer num2, int i2, boolean z4, Long l2, Map map5, byte[] bArr, String str5, EngineTreeNodeData engineTreeNodeData, Map map6, RemoteViewUIData remoteViewUIData, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, str, str2, z, i, z2, (i3 & 64) != 0 ? null : bool, (i3 & 128) != 0 ? null : map, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : arrayMap, (i3 & 1024) != 0 ? null : list, (i3 & 2048) != 0 ? null : map2, (i3 & 4096) != 0 ? null : str4, (i3 & 8192) != 0 ? false : z3, (i3 & 16384) != 0 ? null : map3, (32768 & i3) != 0 ? null : num, (65536 & i3) != 0 ? null : map4, (131072 & i3) != 0 ? null : num2, (262144 & i3) != 0 ? 0 : i2, (524288 & i3) != 0 ? false : z4, (1048576 & i3) != 0 ? null : l2, (2097152 & i3) != 0 ? null : map5, (4194304 & i3) != 0 ? null : bArr, (8388608 & i3) != 0 ? null : str5, (16777216 & i3) != 0 ? null : engineTreeNodeData, (33554432 & i3) != 0 ? new LinkedHashMap() : map6, (i3 & 67108864) != 0 ? null : remoteViewUIData);
    }

    public SeedlingUIData(@Nullable Bitmap bitmap, @Nullable String str, @Nullable String str2, boolean z, int i, boolean z2) {
        this(bitmap, str, str2, z, i, z2, null, null, null, null, null, null, null, false, null, null, null, null, 0, false, null, null, null, null, null, null, null, 134216704, null);
    }
}
