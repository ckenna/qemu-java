package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiStructDescriptor{name=ChardevUdp, data={remote=SocketAddressLegacy, *local=SocketAddressLegacy}, innerTypes=null, fields=null, base=ChardevCommon}</pre>
 */
// QApiStructDescriptor{name=ChardevUdp, data={remote=SocketAddressLegacy, *local=SocketAddressLegacy}, innerTypes=null, fields=null, base=ChardevCommon}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevUdp extends ChardevCommon {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("remote")
	@Nonnull
	public SocketAddressLegacy remote;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("local")
	@CheckForNull
	public SocketAddressLegacy local;

	@Nonnull
	public ChardevUdp withRemote(SocketAddressLegacy value) {
		this.remote = value;
		return this;
	}

	@Nonnull
	public ChardevUdp withLocal(SocketAddressLegacy value) {
		this.local = value;
		return this;
	}

	public ChardevUdp() {
	}

	public ChardevUdp(SocketAddressLegacy remote, SocketAddressLegacy local) {
		this.remote = remote;
		this.local = local;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("remote");
		names.add("local");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("remote".equals(name))
			return remote;
		if ("local".equals(name))
			return local;
		return super.getFieldByName(name);
	}
}
