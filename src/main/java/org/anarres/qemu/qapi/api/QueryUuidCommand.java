package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-uuid, returns=UuidInfo, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-uuid, returns=UuidInfo, data=null}
public class QueryUuidCommand extends QApiCommand<java.lang.Void, QueryUuidCommand.Response> {

	/** Response to a QueryUuidCommand. */
	public static class Response extends QApiResponse<UuidInfo> {
	}

	/** Constructs a new QueryUuidCommand. */
	public QueryUuidCommand() {
		super("query-uuid", Response.class, null);
	}

}
