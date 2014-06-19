package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=SocketAddress, data={inet=InetSocketAddress, unix=UnixSocketAddress, fd=String}, innerTypes=null, fields=null}
public class SocketAddress extends QApiUnion {
	@SerializedName("inet")
	@Nonnull public InetSocketAddress inet;
	@SerializedName("unix")
	@Nonnull public UnixSocketAddress unix;
	@SerializedName("fd")
	@Nonnull public String fd;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (inet != null)
			count++;
		if (unix != null)
			count++;
		if (fd != null)
			count++;
		return (count == 1);
	}
}
