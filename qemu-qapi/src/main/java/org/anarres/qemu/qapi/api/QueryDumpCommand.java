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
 * <pre>QApiCommandDescriptor{name=query-dump, returns=DumpQueryResult, data=null}</pre>
 */
// QApiCommandDescriptor{name=query-dump, returns=DumpQueryResult, data=null}
public class QueryDumpCommand extends QApiCommand<java.lang.Void, QueryDumpCommand.Response> {

	/** Response to a QueryDumpCommand. */
	public static class Response extends QApiResponse<DumpQueryResult> {
	}

	/** Constructs a new QueryDumpCommand. */
	public QueryDumpCommand() {
		super("query-dump", Response.class, null);
	}

}
