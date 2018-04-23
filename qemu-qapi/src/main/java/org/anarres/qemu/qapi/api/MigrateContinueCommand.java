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
 * <pre>QApiCommandDescriptor{name=migrate-continue, returns=null, data={state=MigrationStatus}}</pre>
 */
// QApiCommandDescriptor{name=migrate-continue, returns=null, data={state=MigrationStatus}}
public class MigrateContinueCommand extends QApiCommand<MigrateContinueCommand.Arguments, MigrateContinueCommand.Response> {
	/** Compound arguments to a MigrateContinueCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("state")
		@Nonnull
		public MigrationStatus state;

		public Arguments() {
		}

		public Arguments(MigrationStatus state) {
			this.state = state;
		}
	}

	/** Response to a MigrateContinueCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new MigrateContinueCommand. */
	public MigrateContinueCommand(@Nonnull MigrateContinueCommand.Arguments argument) {
		super("migrate-continue", Response.class, argument);
	}

	/** Constructs a new MigrateContinueCommand. */
	public MigrateContinueCommand(MigrationStatus state) {
		this(new Arguments(state));
	}
}
