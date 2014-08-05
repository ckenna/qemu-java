package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-named-block-nodes, returns=[BlockDeviceInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-named-block-nodes, returns=[BlockDeviceInfo], data=null}
public class QueryNamedBlockNodesCommand extends QApiCommand<java.lang.Void, QueryNamedBlockNodesCommand.Response> {

	/** Response to a QueryNamedBlockNodesCommand. */
	public static class Response extends QApiResponse<java.util.List<BlockDeviceInfo>> {
	}

	/** Constructs a new QueryNamedBlockNodesCommand. */
	public QueryNamedBlockNodesCommand() {
		super("query-named-block-nodes", Response.class, null);
	}

}
