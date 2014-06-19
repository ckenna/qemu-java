package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=KeyValue, data={number=int, qcode=QKeyCode}, innerTypes=null, fields=null}
public class KeyValue extends QApiUnion {
	@SerializedName("number")
	@Nonnull public Long number;
	@SerializedName("qcode")
	@Nonnull public QKeyCode qcode;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (number != null)
			count++;
		if (qcode != null)
			count++;
		return (count == 1);
	}
}
