package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=NetdevBridgeOptions, data={*br=str, *helper=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=NetdevBridgeOptions, data={*br=str, *helper=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetdevBridgeOptions extends QApiType {

	@JsonProperty("br")
	@CheckForNull
	public java.lang.String br;
	@JsonProperty("helper")
	@CheckForNull
	public java.lang.String helper;

	@Nonnull
	public NetdevBridgeOptions withBr(java.lang.String value) {
		this.br = value;
		return this;
	}

	@Nonnull
	public NetdevBridgeOptions withHelper(java.lang.String value) {
		this.helper = value;
		return this;
	}

	public NetdevBridgeOptions() {
	}

	public NetdevBridgeOptions(java.lang.String br, java.lang.String helper) {
		this.br = br;
		this.helper = helper;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("br");
		names.add("helper");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("br".equals(name))
			return br;
		if ("helper".equals(name))
			return helper;
		return super.getFieldByName(name);
	}
}
