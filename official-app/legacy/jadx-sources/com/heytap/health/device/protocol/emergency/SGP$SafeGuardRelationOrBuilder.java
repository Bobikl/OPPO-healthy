package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface SGP$SafeGuardRelationOrBuilder extends MessageLiteOrBuilder {
    SGP$Relation getRelations(int i);

    int getRelationsCount();

    List<SGP$Relation> getRelationsList();

    int getResult();
}
