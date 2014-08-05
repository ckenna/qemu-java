package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-migrate-cache-size, returns=int, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-migrate-cache-size, returns=int, data=null}
public class QueryMigrateCacheSizeCommand extends QApiCommand<java.lang.Void, QueryMigrateCacheSizeCommand.Response> {

	/** Response to a QueryMigrateCacheSizeCommand. */
	public static class Response extends QApiResponse<java.lang.Long> {
	}

	/** Constructs a new QueryMigrateCacheSizeCommand. */
	public QueryMigrateCacheSizeCommand() {
		super("query-migrate-cache-size", Response.class, null);
	}

}
