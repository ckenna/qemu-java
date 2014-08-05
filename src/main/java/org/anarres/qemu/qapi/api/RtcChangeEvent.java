package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEventDescriptor{name=RTC_CHANGE, data={offset=int}}</pre></p>
 */
// QApiEventDescriptor{name=RTC_CHANGE, data={offset=int}}
public class RtcChangeEvent extends QApiEvent {
	@JsonProperty("offset")
	@Nonnull
	public long offset;
}
