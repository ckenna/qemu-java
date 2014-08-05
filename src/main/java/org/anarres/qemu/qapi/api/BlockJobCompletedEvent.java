package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEventDescriptor{name=BLOCK_JOB_COMPLETED, data={type=BlockJobType, device=str, len=int, offset=int, speed=int, *error=str}}</pre></p>
 */
// QApiEventDescriptor{name=BLOCK_JOB_COMPLETED, data={type=BlockJobType, device=str, len=int, offset=int, speed=int, *error=str}}
public class BlockJobCompletedEvent extends QApiEvent {
	@JsonProperty("type")
	@Nonnull
	public BlockJobType type;
	@JsonProperty("device")
	@Nonnull
	public java.lang.String device;
	@JsonProperty("len")
	@Nonnull
	public long len;
	@JsonProperty("offset")
	@Nonnull
	public long offset;
	@JsonProperty("speed")
	@Nonnull
	public long speed;
	@JsonProperty("error")
	@CheckForNull
	public java.lang.String error;
}
