package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=UnixSocketAddress, data={path=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=UnixSocketAddress, data={path=str}, innerTypes=null}
public class UnixSocketAddress extends QApiType {

	@SerializedName("path")
	@Nonnull
	public java.lang.String path;

	public UnixSocketAddress() {
	}

	public UnixSocketAddress(java.lang.String path) {
		this.path = path;
	}
}