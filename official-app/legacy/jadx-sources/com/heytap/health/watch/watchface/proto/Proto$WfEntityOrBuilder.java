package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$WfEntityOrBuilder extends MessageLiteOrBuilder {
    int getBackgroundIndex();

    boolean getCanEdit();

    boolean getIsCurrent();

    boolean getIsHidden();

    int getPositionIndex();

    String getPreviewResNames(int i);

    ByteString getPreviewResNamesBytes(int i);

    int getPreviewResNamesCount();

    List<String> getPreviewResNamesList();

    int getStyleIndex();

    String getStyleUnique();

    ByteString getStyleUniqueBytes();

    String getWfAuthor();

    ByteString getWfAuthorBytes();

    String getWfDescription();

    ByteString getWfDescriptionBytes();

    String getWfDescriptionEn();

    ByteString getWfDescriptionEnBytes();

    String getWfDesigner();

    ByteString getWfDesignerBytes();

    String getWfName();

    ByteString getWfNameBytes();

    String getWfNameEn();

    ByteString getWfNameEnBytes();

    String getWfPkgName();

    ByteString getWfPkgNameBytes();

    String getWfUnique();

    ByteString getWfUniqueBytes();

    String getWfVersion();

    ByteString getWfVersionBytes();
}
