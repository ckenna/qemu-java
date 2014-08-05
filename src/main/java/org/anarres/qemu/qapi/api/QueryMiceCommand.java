package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-mice, returns=[MouseInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-mice, returns=[MouseInfo], data=null}
public class QueryMiceCommand extends QApiCommand<java.lang.Void, QueryMiceCommand.Response> {

	/** Response to a QueryMiceCommand. */
	public static class Response extends QApiResponse<java.util.List<MouseInfo>> {
	}

	/** Constructs a new QueryMiceCommand. */
	public QueryMiceCommand() {
		super("query-mice", Response.class, null);
	}

}
