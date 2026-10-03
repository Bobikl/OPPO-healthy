package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/oplus/smartenginehelper/entity/TryStartActivityClickEntity;", "Lcom/oplus/smartenginehelper/entity/ClickEntity;", "()V", "value", "Lcom/oplus/smartenginehelper/entity/ContentProviderClickEntity;", "contentProviderClickEntity", "getContentProviderClickEntity", "()Lcom/oplus/smartenginehelper/entity/ContentProviderClickEntity;", "setContentProviderClickEntity", "(Lcom/oplus/smartenginehelper/entity/ContentProviderClickEntity;)V", "Lcom/oplus/smartenginehelper/entity/StartActivityClickEntity;", "startActivityClickEntity", "getStartActivityClickEntity", "()Lcom/oplus/smartenginehelper/entity/StartActivityClickEntity;", "setStartActivityClickEntity", "(Lcom/oplus/smartenginehelper/entity/StartActivityClickEntity;)V", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class TryStartActivityClickEntity extends ClickEntity {

    @Nullable
    private ContentProviderClickEntity contentProviderClickEntity;

    @Nullable
    private StartActivityClickEntity startActivityClickEntity;

    public TryStartActivityClickEntity() throws JSONException {
        getMJSONObject().put("type", ParserTag.TAG_TRY_ACTIVITY);
    }

    @Nullable
    public final ContentProviderClickEntity getContentProviderClickEntity() {
        return this.contentProviderClickEntity;
    }

    @Nullable
    public final StartActivityClickEntity getStartActivityClickEntity() {
        return this.startActivityClickEntity;
    }

    public final void setContentProviderClickEntity(@Nullable ContentProviderClickEntity contentProviderClickEntity) throws JSONException {
        if (contentProviderClickEntity != null) {
            getMJSONObject().put("cp", contentProviderClickEntity.getMJSONObject());
        }
        this.contentProviderClickEntity = contentProviderClickEntity;
    }

    public final void setStartActivityClickEntity(@Nullable StartActivityClickEntity startActivityClickEntity) throws JSONException {
        if (startActivityClickEntity != null) {
            getMJSONObject().put("activity", startActivityClickEntity.getMJSONObject());
        }
        this.startActivityClickEntity = startActivityClickEntity;
    }
}
