package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.codec.language.bm.Languages;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class tla {
    public final ObjectNode a;

    @JsonCreator
    public tla(ObjectNode objectNode) {
        this.a = objectNode;
    }

    public static ela a() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", Languages.ANY);
        return objectNode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof tla)) {
            return false;
        }
        tla tlaVar = (tla) obj;
        ObjectNode objectNode = this.a;
        if (objectNode == null) {
            return tlaVar.a == null;
        }
        return objectNode.equals(tlaVar.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
