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
 * <pre>QApiTypeDescriptor{name=ChardevMux, data={chardev=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=ChardevMux, data={chardev=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevMux extends QApiType {

	@JsonProperty("chardev")
	@Nonnull
	public java.lang.String chardev;

	@Nonnull
	public ChardevMux withChardev(java.lang.String value) {
		this.chardev = value;
		return this;
	}

	public ChardevMux() {
	}

	public ChardevMux(java.lang.String chardev) {
		this.chardev = chardev;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("chardev");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("chardev".equals(name))
			return chardev;
		return super.getFieldByName(name);
	}
}
