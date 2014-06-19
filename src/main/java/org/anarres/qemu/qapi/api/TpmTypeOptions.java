package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=TpmTypeOptions, data={passthrough=TPMPassthroughOptions}, innerTypes=null, fields=null}
public class TpmTypeOptions extends QApiUnion {
	@SerializedName("passthrough")
	@Nonnull public TPMPassthroughOptions passthrough;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (passthrough != null)
			count++;
		return (count == 1);
	}
}
