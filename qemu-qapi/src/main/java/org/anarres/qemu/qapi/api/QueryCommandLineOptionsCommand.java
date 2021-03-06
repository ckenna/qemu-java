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
 * <pre>QApiCommandDescriptor{name=query-command-line-options, returns=[CommandLineOptionInfo], data={*option=str}}</pre>
 */
// QApiCommandDescriptor{name=query-command-line-options, returns=[CommandLineOptionInfo], data={*option=str}}
public class QueryCommandLineOptionsCommand extends QApiCommand<QueryCommandLineOptionsCommand.Arguments, QueryCommandLineOptionsCommand.Response> {
	/** Compound arguments to a QueryCommandLineOptionsCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("option")
		@CheckForNull
		public java.lang.String option;

		public Arguments() {
		}

		public Arguments(java.lang.String option) {
			this.option = option;
		}
	}

	/** Response to a QueryCommandLineOptionsCommand. */
	public static class Response extends QApiResponse<java.util.List<CommandLineOptionInfo>> {
	}

	/** Constructs a new QueryCommandLineOptionsCommand. */
	public QueryCommandLineOptionsCommand(@Nonnull QueryCommandLineOptionsCommand.Arguments argument) {
		super("query-command-line-options", Response.class, argument);
	}

	/** Constructs a new QueryCommandLineOptionsCommand. */
	public QueryCommandLineOptionsCommand(java.lang.String option) {
		this(new Arguments(option));
	}
}
