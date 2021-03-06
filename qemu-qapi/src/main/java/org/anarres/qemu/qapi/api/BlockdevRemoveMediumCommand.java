package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=blockdev-remove-medium, returns=null, data={id=str}}</pre>
 */
// QApiCommandDescriptor{name=blockdev-remove-medium, returns=null, data={id=str}}
public class BlockdevRemoveMediumCommand extends QApiCommand<BlockdevRemoveMediumCommand.Arguments, BlockdevRemoveMediumCommand.Response> {
	/** Compound arguments to a BlockdevRemoveMediumCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("id")
		@Nonnull
		public java.lang.String id;

		public Arguments() {
		}

		public Arguments(java.lang.String id) {
			this.id = id;
		}
	}

	/** Response to a BlockdevRemoveMediumCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockdevRemoveMediumCommand. */
	public BlockdevRemoveMediumCommand(@Nonnull BlockdevRemoveMediumCommand.Arguments argument) {
		super("blockdev-remove-medium", Response.class, argument);
	}

	/** Constructs a new BlockdevRemoveMediumCommand. */
	public BlockdevRemoveMediumCommand(java.lang.String id) {
		this(new Arguments(id));
	}
}
