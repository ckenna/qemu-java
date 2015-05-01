package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=block-job-pause, returns=null, data={device=str}}</pre>
 */
// QApiCommandDescriptor{name=block-job-pause, returns=null, data={device=str}}
public class BlockJobPauseCommand extends QApiCommand<BlockJobPauseCommand.Arguments, BlockJobPauseCommand.Response> {
	/** Compound arguments to a BlockJobPauseCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;

		public Arguments() {
		}

		public Arguments(java.lang.String device) {
			this.device = device;
		}
	}

	/** Response to a BlockJobPauseCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockJobPauseCommand. */
	public BlockJobPauseCommand(@Nonnull BlockJobPauseCommand.Arguments argument) {
		super("block-job-pause", Response.class, argument);
	}

	/** Constructs a new BlockJobPauseCommand. */
	public BlockJobPauseCommand(java.lang.String device) {
		this(new Arguments(device));
	}
}
