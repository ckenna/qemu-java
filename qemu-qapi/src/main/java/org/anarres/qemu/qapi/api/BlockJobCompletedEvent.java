package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=BLOCK_JOB_COMPLETED, data={type=BlockJobType, device=str, len=int, offset=int, speed=int, *error=str}}</pre>
 */
// QApiEventDescriptor{name=BLOCK_JOB_COMPLETED, data={type=BlockJobType, device=str, len=int, offset=int, speed=int, *error=str}}
public class BlockJobCompletedEvent extends QApiEvent {

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("type")
		@Nonnull
		public BlockJobType type;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("len")
		@Nonnull
		public long len;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("offset")
		@Nonnull
		public long offset;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("speed")
		@Nonnull
		public long speed;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("error")
		@CheckForNull
		public java.lang.String error;
	}

	@JsonProperty("data")
	public Data data;
}
