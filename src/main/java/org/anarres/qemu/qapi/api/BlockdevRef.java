package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=BlockdevRef, data={definition=BlockdevOptions, reference=str}, innerTypes=null, fields=null}
public class BlockdevRef extends QApiUnion {
	@SerializedName("definition")
	@Nonnull public BlockdevOptions definition;
	@SerializedName("reference")
	@Nonnull public String reference;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (definition != null)
			count++;
		if (reference != null)
			count++;
		return (count == 1);
	}
}
