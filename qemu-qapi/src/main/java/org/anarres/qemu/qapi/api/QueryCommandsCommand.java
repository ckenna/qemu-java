package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=query-commands, returns=[CommandInfo], data=null}</pre>
 */
// QApiCommandDescriptor{name=query-commands, returns=[CommandInfo], data=null}
public class QueryCommandsCommand extends QApiCommand<java.lang.Void, QueryCommandsCommand.Response> {

	/** Response to a QueryCommandsCommand. */
	public static class Response extends QApiResponse<java.util.List<CommandInfo>> {
	}

	/** Constructs a new QueryCommandsCommand. */
	public QueryCommandsCommand() {
		super("query-commands", Response.class, null);
	}

}
