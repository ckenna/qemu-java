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
 * <pre>QApiStructDescriptor{name=TPMEmulatorOptions, data={chardev=str}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=TPMEmulatorOptions, data={chardev=str}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TPMEmulatorOptions extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("chardev")
	@Nonnull
	public java.lang.String chardev;

	@Nonnull
	public TPMEmulatorOptions withChardev(java.lang.String value) {
		this.chardev = value;
		return this;
	}

	public TPMEmulatorOptions() {
	}

	public TPMEmulatorOptions(java.lang.String chardev) {
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
