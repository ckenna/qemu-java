package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=NameInfo, data={*name=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=NameInfo, data={*name=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NameInfo extends QApiType {

	@JsonProperty("name")
	@CheckForNull
	public java.lang.String name;

	@Nonnull
	public NameInfo withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	public NameInfo() {
	}

	public NameInfo(java.lang.String name) {
		this.name = name;
	}
}
