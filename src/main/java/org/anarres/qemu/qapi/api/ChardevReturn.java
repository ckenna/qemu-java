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
 * <p><pre>QApiTypeDescriptor{name=ChardevReturn, data={*pty=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=ChardevReturn, data={*pty=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevReturn extends QApiType {

	@JsonProperty("pty")
	@CheckForNull
	public java.lang.String pty;

	@Nonnull
	public ChardevReturn withPty(java.lang.String value) {
		this.pty = value;
		return this;
	}

	public ChardevReturn() {
	}

	public ChardevReturn(java.lang.String pty) {
		this.pty = pty;
	}
}