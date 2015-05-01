package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=migrate_set_downtime, returns=null, data={value=number}}</pre>
 */
// QApiCommandDescriptor{name=migrate_set_downtime, returns=null, data={value=number}}
public class MigrateSetDowntimeCommand extends QApiCommand<MigrateSetDowntimeCommand.Arguments, MigrateSetDowntimeCommand.Response> {
	/** Compound arguments to a MigrateSetDowntimeCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("value")
		@Nonnull
		public double value;

		public Arguments() {
		}

		public Arguments(double value) {
			this.value = value;
		}
	}

	/** Response to a MigrateSetDowntimeCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new MigrateSetDowntimeCommand. */
	public MigrateSetDowntimeCommand(@Nonnull MigrateSetDowntimeCommand.Arguments argument) {
		super("migrate_set_downtime", Response.class, argument);
	}

	/** Constructs a new MigrateSetDowntimeCommand. */
	public MigrateSetDowntimeCommand(double value) {
		this(new Arguments(value));
	}
}
