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
 * <p><pre>QApiTypeDescriptor{name=BalloonInfo, data={actual=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BalloonInfo, data={actual=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BalloonInfo extends QApiType {

	@JsonProperty("actual")
	@Nonnull
	public long actual;

	@Nonnull
	public BalloonInfo withActual(long value) {
		this.actual = value;
		return this;
	}

	public BalloonInfo() {
	}

	public BalloonInfo(long actual) {
		this.actual = actual;
	}
}
