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
 * <pre>QApiStructDescriptor{name=BlockdevOptionsNVMe, data={device=str, namespace=int}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockdevOptionsNVMe, data={device=str, namespace=int}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsNVMe extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("device")
	@Nonnull
	public java.lang.String device;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("namespace")
	@Nonnull
	public long namespace;

	@Nonnull
	public BlockdevOptionsNVMe withDevice(java.lang.String value) {
		this.device = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsNVMe withNamespace(long value) {
		this.namespace = value;
		return this;
	}

	public BlockdevOptionsNVMe() {
	}

	public BlockdevOptionsNVMe(java.lang.String device, long namespace) {
		this.device = device;
		this.namespace = namespace;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("device");
		names.add("namespace");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("device".equals(name))
			return device;
		if ("namespace".equals(name))
			return namespace;
		return super.getFieldByName(name);
	}
}